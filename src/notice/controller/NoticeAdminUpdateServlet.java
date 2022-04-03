package notice.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

import notice.model.service.NoticeService;
import notice.model.vo.Notice;

/**
 * Servlet implementation class NoticeAdminUpdateServlet
 */
@WebServlet("/nupdate.ad2")
public class NoticeAdminUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NoticeAdminUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  //관리자 수정페이지 처리용 컨트로러
	      //1.multipart 방식으로 인코딩 되어서 전송왔는지 확인
	         RequestDispatcher view = null;
	         if(!ServletFileUpload.isMultipartContent(request)) { //자바 ee에서 제공하는 메소드. 리퀘스트 안에 담긴 정보를 확인하게 해준다 
	            view = request.getRequestDispatcher("views/common/error.jsp");
	            request.setAttribute("message", "form 의 entype/form-data 속성 누락");
	            view.forward(request, response);
	         }
	         //2. 한 번에 업로드될 파일 용량 10Mbyte로  제한하기. 왜냐하면 서버의 사이즈가 엄청 크지 않기 때문에 
	         int maxSize = 1024 * 1024 * 10;
	         
	         //3. 업로드되는 파일의 저장폴더 지정하기. getServletContext() : 리케스트가 저장된 기록을 가져오기
	         //getRealPath("/resources/nupfiles") : 이폴더에 가져온것 넣기
	         String savePath = request.getSession()
	                        .getServletContext().getRealPath("/resources/noticefiles");
	         
	         //4. 리퀘스트가 그냥 리퀘스트로 온게 아니라ㅏ 멀티파드로 인코딩 되어서 온것이다
	         //그래서 request 를 multipartRequest 형식으로 변환해야 한다.
	         //cos.jar 가 제공하는 클래스를 사용(lib 에 자르파일 라이브러리를 미리 넣어놓기!)
	         //request, savePath, maxSize : 리케스트와 미리 만든 변수들을 차례로 쓰기
	         //"UTF-8" 한그롤 인코딩
	         //new DefaultFileRenamePolicy() : 같은 이름으로 종복일 때 덮어쓰기 하지 않도록 하는 기능
	         //그렇게 되면 이 모든 기능을 가지고 있는 mrequest 가 탄생하고 지정폴더에 저장된다.
	         MultipartRequest mrequest = new MultipartRequest(
	               
	               request, savePath, maxSize, "UTF-8", new DefaultFileRenamePolicy());
	         //5. 데이터베이스에 기록할 값 꺼내기
	         //mrequest 로 추출해야 한다
	         Notice notice = new Notice();
	         
	         notice.setNoticeNo(Integer.parseInt(mrequest.getParameter("no")));
	         notice.setNoticeTitle(mrequest.getParameter("title"));
	         notice.setNoticeWriter(mrequest.getParameter("writer"));
	         notice.setNoticeContent(mrequest.getParameter("content"));
	         
	         
	         
	         //첨부파일 삭제여부 추출--------------------------------------------------------
	         String deleteFlag = mrequest.getParameter("deleteFlag");
	         
	         
	         String originalFileName = mrequest.getParameter("ofile");
	         String renameFileName = mrequest.getParameter("rfile");
	      /*
	       * if(deleteFlag != null && deleteFlag.equals("yes")) { //첨부파일이 있을 때 첨부파일에서 삭제
	       * 체크 전송옴 //체크가 되면 value 가 전송온다 }
	       */
	         
	   
	         //서버에 새로 업로드된 파일명 추출하기
	         String newOriginalFileName = mrequest.getFilesystemName("upfile");
	         notice.setOriginalFile(newOriginalFileName);
	         
	         
	         //원래 파일과 새로 업로드 된 파일의 이름이 같고
	         //파일 용량도 동일하면 원래 이름 그대로 객체에 기록함
	         //첨부 파일이 없었는데 추가된 경우와
	         //첨부 파일이 있었는데 변경된 경우 둘 다 파일명 바꾸기함
	         
	      
	      
	         //6. 첨부된 파일 이름 바꾸기(추가 작업)
	         //저장 폴더에 같은 이름의 파일이 있을 경우를 대비하기 위함
	         //"년월일시분초.확장자" 형식으로 변경
	         String newRenameFileName = null;
	         if(newOriginalFileName != null) {
	            //첨부파일이 있을 때만 이름 바꾸기 실행
	            
	            //바꿀 파일명에 대한 포맷 문자열 만들기 :년월일시분초 형식
	            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
	            //바꿀 파일 명
	            newRenameFileName = sdf.format(new java.sql.Date(System.currentTimeMillis()));
	            //업로드된 파일의 확장자를 추출해서 새 파일명에 붙여줌. originalFileName.lastIndexOf(".")+1) : . 뒤부터 추출(확장자)
	            newRenameFileName += "."+ newOriginalFileName.substring(newOriginalFileName.lastIndexOf(".")+1);
	            
	            //원본 파일명 rename 처리를 위해서 파일 객체 만들기
	            
	            //우선 원본파일명 객체
	            File originFile = new File(savePath + "\\" + newOriginalFileName);
	            //그다음 리네임 객체
	            File renameFile = new File(savePath + "\\" + newRenameFileName);
	            
	            //이제 이름바꾸기 실행(실행되면 트루를 실패하면 펄스를 리턴한다. 고로 if 문을 써야하는 것)
	            if(!originFile.renameTo(renameFile)) { //실패하면 내가 손수 직접 바꿔야 한다.
	               //직접 바꾸는 방법은 
	               //원본파일 내용 읽어서 복사본에 기록하고 
	               //완료되면, 원본 파일 삭제...그럼 결국 rename 파일만 남는다
	               //파일 입출력 스트림으로 한다
	               
	               FileInputStream fin = new FileInputStream(originFile);
	               FileOutputStream fout = new FileOutputStream(renameFile);
	               
	               int data = -1;
	               byte[] buffer = new byte[1024];
	               
	               //시작부터 끝까지 파일 안의 내용을 바이트로(버퍼) 읽겠다고 해서 buffer, 0, buffer.length 를 쓴다.
	               //바이트로 읽는 이유는 파일이 사진일 수도 글일 수도 있고 어떻게 될지 모르기 때문에 그냥 바이트로 한다.
	               while((data = fin.read(buffer, 0, buffer.length)) != -1) {
	                  fout.write(buffer, 0, buffer.length);
	               }
	               fin.close();
	               fout.close();
	               originFile.delete();
	               
	            }
	            //노티스에 넣어서 디에이오에 넣고 디비에 들어가게하기 위함
	            notice.setRenameFile(newRenameFileName);
	            
	            //업로드 된 새 파일이 있다면 기존에 있던 것은 사라져야함
	            if(originalFileName != null) { //원래 첨부파일이 있었다면, 원래 첨부파일을 폴더에서 삭제한다
	               new File(savePath + "\\" + renameFileName).delete();
	            }
	         
	         }else if(originalFileName != null && originalFileName.equals(newOriginalFileName)&&
	               //원래 첨부파일이 있었고, 변경되지 않았을때
	               new File(savePath + "\\" + renameFileName).length() == 
	               new File(savePath + "\\" + newRenameFileName).length()) {
	            
	               notice.setOriginalFile(originalFileName);
	               notice.setRenameFile(renameFileName);
	            
	         }else if(originalFileName != null && deleteFlag != null && deleteFlag.equals("yes")) {
	            //원래 첨부파일이 있었고, 파일삭제가 선택된 경우
	            notice.setOriginalFile(null);
	            notice.setRenameFile(null);
	            //폴더에 저장된 파일 삭제
	            new File(savePath + "\\" + renameFileName).delete(); 
	            
	               
	         }
	         
	         
	         
	         
	         //7.서비스 객체 생성하고 메소드로 notice객체 전달하고 처리된 결과 받기
	         int result = new NoticeService().updateNotice(notice);
	         
	         //8. 받은 결과로 성공/실패 페이지 내보내기
	         if(result > 0) { //성공하면 목록으로 갈것다
	            //서블릿이 서블릿 호출할때 문법
	            response.sendRedirect("nlist");
	            
	         }else {
	            view = request.getRequestDispatcher("views/common/error.jsp");
	            request.setAttribute("message", notice.getNoticeNo() + "qjs 공지사항 등록 실패");
	            view.forward(request, response);
	         }
	         
	      }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
