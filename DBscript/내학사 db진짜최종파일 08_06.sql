DROP TABLE notice CASCADE CONSTRAINTS;
DROP TABLE attendance CASCADE CONSTRAINTS;
DROP TABLE lroom CASCADE CONSTRAINTS;
DROP TABLE lecture CASCADE CONSTRAINTS;
DROP TABLE scholarship CASCADE CONSTRAINTS;
DROP TABLE category CASCADE CONSTRAINTS;
DROP TABLE major CASCADE CONSTRAINTS;
DROP TABLE lapplication CASCADE CONSTRAINTS;
DROP TABLE reception CASCADE CONSTRAINTS;
DROP TABLE student CASCADE CONSTRAINTS;
DROP TABLE administrator CASCADE CONSTRAINTS;
DROP TABLE ssbenefitst CASCADE CONSTRAINTS;
DROP TABLE absence CASCADE CONSTRAINTS;
DROP TABLE lplan CASCADE CONSTRAINTS;
DROP TABLE lecturescore CASCADE CONSTRAINTS;
DROP TABLE professor CASCADE CONSTRAINTS;
DROP TABLE schedule CASCADE CONSTRAINTS;
DROP TABLE termscore CASCADE CONSTRAINTS;
DROP TABLE absenceinfor CASCADE CONSTRAINTS;

------------------------------------------------------------------------------------------------------------------
create table absenceinfor (
   information varchar2(200) primary key
);
COMMENT ON COLUMN absenceinfor.information IS '안내사항';

CREATE TABLE absence (
   requestid   VARCHAR2(30) NOT NULL,
   id   VARCHAR2(10) NOT NULL,
   requestdate DATE   DEFAULT SYSDATE   NOT NULL,
   limitcanceldate DATE DEFAULT SYSDATE+1 NOT NULL,
   approval char(1) default 'N', 
   constraints chk_per check (approval in ('Y','N'))
);

COMMENT ON COLUMN absence.requestid IS '신청코드';

COMMENT ON COLUMN absence.id IS '학번';

COMMENT ON COLUMN absence.requestdate IS '신청일';

COMMENT ON COLUMN absence.limitcanceldate IS '취소제한날짜';

comment on COLUMN absence.approval is '승인';




CREATE TABLE lplan (
	lcode	VARCHAR2(10)		NOT NULL,
	room	VARCHAR2(20)		NOT NULL,
	id	VARCHAR2(10)		NOT NULL,
	content	VARCHAR2(500)		NULL
);

COMMENT ON COLUMN lplan.lcode IS '강의코드';

COMMENT ON COLUMN lplan.room IS '강의실명';

COMMENT ON COLUMN lplan.id IS '교수번호';

COMMENT ON COLUMN lplan.content IS '수업내용';


CREATE TABLE termscore (
    semester    VARCHAR2(10)    NOT NULL,
    id   VARCHAR2(10)    NOT NULL,
    termaplpoint    NUMBER      NULL,
    termgetpoint    NUMBER      NULL,
    grdpoint    NUMBER  DEFAULT 130 NULL,
    tgpa    NUMBER      NULL
);
COMMENT ON COLUMN termscore.semester IS '년도학기';
COMMENT ON COLUMN termscore.id IS '학번';
COMMENT ON COLUMN termscore.termaplpoint IS '총신청학점';
COMMENT ON COLUMN termscore.termgetpoint IS '총취득학점';
COMMENT ON COLUMN termscore.grdpoint IS '졸업이수학점';
COMMENT ON COLUMN termscore.tgpa IS '총평균평점';


CREATE TABLE notice (
	noticeno	NUMBER		NOT NULL,
	adno	VARCHAR2(10)		NOT NULL,
	noticetitle	VARCHAR2(100)		NOT NULL,
	noticewriter	VARCHAR2(40)		NOT NULL,
    noticedate	DATE	DEFAULT SYSDATE	NULL,
    noticecontent	VARCHAR2(1500)		NULL,
	originalfile	VARCHAR2(1000)		NULL,
	renamefile	VARCHAR2(1000)		NULL,
	noticereadcount	NUMBER	DEFAULT 0	NULL
);

COMMENT ON COLUMN notice.noticeno IS '글번호';

COMMENT ON COLUMN notice.adno IS '관리자번호';

COMMENT ON COLUMN notice.noticetitle IS '제목';

COMMENT ON COLUMN notice.noticewriter IS '작성자';

COMMENT ON COLUMN notice.noticedate IS '작성날짜';

COMMENT ON COLUMN notice.originalfile IS '원본파일';

COMMENT ON COLUMN notice.renamefile IS '수정파일';

COMMENT ON COLUMN notice.noticecontent IS '글내용';

COMMENT ON COLUMN notice.noticereadcount IS '조회수';


CREATE TABLE attendance (
	lcode	VARCHAR2(10)		NOT NULL,
	id	VARCHAR2(10)		NOT NULL,
	thisweek	VARCHAR2(10)		NULL,
	absent3	CHAR(1)	DEFAULT 'N'	NULL,
week1	CHAR(1)		NULL,
week2	CHAR(1)		NULL,
week3	CHAR(1)		NULL,
week4	CHAR(1)		NULL,
week5	CHAR(1)		NULL,
week6	CHAR(1)		NULL,
week7	CHAR(1)		NULL,
week8	CHAR(1)		NULL,
week9	CHAR(1)		NULL,
week10	CHAR(1)		NULL,
week11	CHAR(1)		NULL,
week12	CHAR(1)		NULL,
week13	CHAR(1)		NULL,
week14	CHAR(1)		NULL,
week15	CHAR(1)		NULL,
week16	CHAR(1)		NULL
);

COMMENT ON COLUMN attendance.lcode IS '강의코드';

COMMENT ON COLUMN attendance.id IS '학번';

COMMENT ON COLUMN attendance.thisweek IS '현재출석주차';

COMMENT ON COLUMN attendance.absent3 IS '결석3번';
COMMENT ON COLUMN attendance.week1 IS '1주차출결';
COMMENT ON COLUMN attendance.week2 IS '2주차출결';
COMMENT ON COLUMN attendance.week3 IS '3주차출결';
COMMENT ON COLUMN attendance.week4 IS '4주차출결';
COMMENT ON COLUMN attendance.week5 IS '5주차출결';
COMMENT ON COLUMN attendance.week6 IS '6주차출결';
COMMENT ON COLUMN attendance.week7 IS '7주차출결';
COMMENT ON COLUMN attendance.week8 IS '8주차출결';
COMMENT ON COLUMN attendance.week9 IS '9주차출결';
COMMENT ON COLUMN attendance.week10 IS '10주차출결';
COMMENT ON COLUMN attendance.week11 IS '11주차출결';
COMMENT ON COLUMN attendance.week12 IS '12주차출결';
COMMENT ON COLUMN attendance.week13 IS '13주차출결';
COMMENT ON COLUMN attendance.week14 IS '14주차출결';
COMMENT ON COLUMN attendance.week15 IS '15주차출결';
COMMENT ON COLUMN attendance.week16 IS '16주차출결';




CREATE TABLE schedule (
   scheduleid   varchar2(10)      NOT NULL,
   adno   varchar2(10)      NOT NULL,
   schname   varchar2(1000)      NULL,
   schstartyear   number      NOT NULL,
   schstartmonth   number      NOT NULL,
   schstartdate   number      NOT NULL,
   schendyear   number      NULL,
   schendmonth   number      NULL,
   schenddate   number      NULL

);

COMMENT ON COLUMN schedule.scheduleid IS '학사일정코드';

COMMENT ON COLUMN schedule.adno IS '관리자번호';

COMMENT ON COLUMN schedule.schname IS '일정명';

COMMENT ON COLUMN schedule.schstartyear IS '시작년도';

COMMENT ON COLUMN schedule.schstartmonth IS '시작월';

COMMENT ON COLUMN schedule.schstartdate IS '시작일';

COMMENT ON COLUMN schedule.schendyear IS '끝년도';

COMMENT ON COLUMN schedule.schendmonth IS '끝월';

COMMENT ON COLUMN schedule.schenddate IS '끝일';




CREATE TABLE lroom (
	room	VARCHAR2(20)		NOT NULL,
	building	VARCHAR2(20)		NULL,
	roommax	NUMBER	DEFAULT 30	NULL
);

COMMENT ON COLUMN lroom.room IS '강의실명';

COMMENT ON COLUMN lroom.building IS '건물명';

COMMENT ON COLUMN lroom.roommax IS '수용인원';


CREATE TABLE lecture (
	lcode	VARCHAR2(10)		NOT NULL,
	id	VARCHAR2(10)		NOT NULL,
	lname	VARCHAR2(100)		NULL,
	category	VARCHAR2(30)		NULL,
	lpoint NUMBER 	NULL, 
	capacity	NUMBER		NULL,
	ltime	VARCHAR2(100)		NULL,
	room	VARCHAR2(20)		NOT NULL
);

COMMENT ON COLUMN lecture.lcode IS '강의코드';

COMMENT ON COLUMN lecture.id IS '교수번호';

COMMENT ON COLUMN lecture.lname IS '강의명';

COMMENT ON COLUMN lecture.category IS '이수구분';

COMMENT ON COLUMN lecture.lpoint IS '강의학점';

COMMENT ON COLUMN lecture.capacity IS '수강인원';

COMMENT ON COLUMN lecture.ltime IS '강의시간';

COMMENT ON COLUMN lecture.room IS '강의실명';


CREATE TABLE scholarship (
	ssname VARCHAR2(30) NOT NULL,
	benefitcon VARCHAR2(100)	NOT NULL,
	value NUMBER NOT NULL
);

COMMENT ON COLUMN scholarship.ssname IS '장학금명';

COMMENT ON COLUMN scholarship.benefitcon IS '수혜조건';

COMMENT ON COLUMN scholarship.value IS '장학금액';



CREATE TABLE category (
	categoryname VARCHAR2(30) NOT NULL
);

COMMENT ON COLUMN category.categoryname IS '구분명';



CREATE TABLE major (
	majorno	VARCHAR2(10) NOT NULL,
	majorname VARCHAR2(30) NOT NULL,
	capacity	NUMBER NOT NULL,
	tuition NUMBER(9) NOT NULL,
	categoryname VARCHAR2(30) NOT NULL
);

COMMENT ON COLUMN major.majorno IS '학과코드';

COMMENT ON COLUMN major.majorname IS '학과명';

COMMENT ON COLUMN major.capacity IS '정원';

COMMENT ON COLUMN major.tuition IS '등록금';

COMMENT ON COLUMN major.categoryname IS '구분명';



CREATE TABLE lapplication (
	receptionno	VARCHAR2(10)		NOT NULL,
	lcode	VARCHAR2(10)		NOT NULL,
	id	VARCHAR2(10)		NOT NULL,
	semester	VARCHAR2(10)		NOT NULL,
	lpersonnel	VARCHAR2(20)		NOT NULL,
	room	VARCHAR2(10)		NOT NULL,
	retake	CHAR(1)		DEFAULT 'N'	NULL
);

COMMENT ON COLUMN lapplication.receptionno IS '강의신청코드';

COMMENT ON COLUMN lapplication.lcode IS '강의코드';

COMMENT ON COLUMN lapplication.id IS '학생번호';

COMMENT ON COLUMN lapplication.semester IS '년도학기';

COMMENT ON COLUMN lapplication.lpersonnel IS '강의정원';

COMMENT ON COLUMN lapplication.room IS '강의실';

COMMENT ON COLUMN lapplication.retake IS '재수강여부';

CREATE TABLE reception (
	receptionno	VARCHAR2(10)		NOT NULL,
	id	VARCHAR2(10)		NOT NULL,
	reason	VARCHAR2(500)		NOT NULL,
	way	VARCHAR2(20)		NOT NULL,
	dayoff	DATE	DEFAULT SYSDATE	NOT NULL,
	rday	DATE	DEFAULT SYSDATE	NOT NULL,
	rtime	VARCHAR2(10)		NOT NULL,
	lcode	VARCHAR2(10)		NOT NULL,
	room	VARCHAR2(20)		NOT NULL,
	subid	VARCHAR2(10)		NULL
);

COMMENT ON COLUMN reception.receptionno IS '접수번호';

COMMENT ON COLUMN reception.id IS '신청교수번호';

COMMENT ON COLUMN reception.reason IS '사유';

COMMENT ON COLUMN reception.way IS '수업방식';

COMMENT ON COLUMN reception.dayoff IS '휴강일자';

COMMENT ON COLUMN reception.rday IS '보강일자';

COMMENT ON COLUMN reception.rtime IS '보강시간';

COMMENT ON COLUMN reception.lcode IS '강의코드';

COMMENT ON COLUMN reception.room IS '강의실명';

COMMENT ON COLUMN reception.subid IS '대리교수번호';


CREATE TABLE lecturescore (
	receptionno VARCHAR2(10)	NOT NULL,
	lcode	VARCHAR2(10)		NOT NULL,
	id	VARCHAR2(10)		NOT NULL,
	atndnscore	NUMBER		NULL,
	midscore		NUMBER		NULL,
	finalscore		NUMBER		NULL,
	totalscore	NUMBER		NULL,
	grade	CHAR(2)		NULL,
	atndnbelow CHAR(1) 	NULL
);

COMMENT ON COLUMN lecturescore.receptionno IS '강의신청코드';

COMMENT ON COLUMN lecturescore.lcode IS '강의코드';

COMMENT ON COLUMN lecturescore.id IS '학번';

COMMENT ON COLUMN lecturescore.atndscore IS '출결점수';

COMMENT ON COLUMN lecturescore.midscore IS '중간점수';

COMMENT ON COLUMN lecturescore.finalscore IS '기말점수';

COMMENT ON COLUMN lecturescore.totalscore IS '과목총점수';

COMMENT ON COLUMN lecturescore.grade IS '과목등급';

COMMENT ON COLUMN lecturescore.atndnbelow IS '출석미달';



CREATE TABLE student (
	id	VARCHAR2(10)		NOT NULL,
	name	VARCHAR2(20)		NOT NULL,
	ssn	VARCHAR2(14)		NOT NULL,
	address	VARCHAR2(500)	NOT NULL,
	phone	VARCHAR2(20)	NULL,
	gender	VARCHAR2(1)	DEFAULT 'M'	NOT NULL,
	email	VARCHAR2(500)	NOT NULL,
	treasure	VARCHAR2(200)	NOT NULL,
	categoryname	VARCHAR2(30)		NOT NULL,
	majorno	VARCHAR2(20)		NOT NULL,
	entrancedate	DATE	DEFAULT SYSDATE	NULL,
	absencewhether	VARCHAR2(1)	DEFAULT 'N'	NULL,
	absencecount	NUMBER	DEFAULT 0	NULL,
	ssname	VARCHAR2(30)	NULL
	
	
);



COMMENT ON COLUMN student.id IS '학생번호';

COMMENT ON COLUMN student.name IS '학생명';

COMMENT ON COLUMN student.ssn IS '주민등록번호';

COMMENT ON COLUMN student.categoryname IS '구분명';

COMMENT ON COLUMN student.majorno IS '학과코드';

COMMENT ON COLUMN student.address IS '주소';

COMMENT ON COLUMN student.phone IS '전화번호';

COMMENT ON COLUMN student.gender IS '성별';

COMMENT ON COLUMN student.email IS '이메일';

COMMENT ON COLUMN student.treasure IS '나의보물1호';

COMMENT ON COLUMN student.entrancedate IS '입학년월';

COMMENT ON COLUMN student.absencewhether IS '휴학여부';

COMMENT ON COLUMN student.absencecount IS '휴학카운트';

COMMENT ON COLUMN student.ssname IS '장학금명';



CREATE TABLE professor (
	id	VARCHAR2(10)		NOT NULL,
	name	VARCHAR2(10)		NOT NULL,
	ssn	VARCHAR2(20)		NULL,
	address	VARCHAR2(500)	NOT NULL,
	phone	VARCHAR2(20)	NULL,
	gender	VARCHAR2(1)	DEFAULT 'M'	NOT NULL,
	email	VARCHAR2(500)	NOT NULL,
	treasure	VARCHAR2(200)	NOT NULL,
	categoryname	VARCHAR2(30)		NOT NULL,
	majorno	VARCHAR2(20)		NOT NULL
);

COMMENT ON COLUMN professor.id IS '교수번호';

COMMENT ON COLUMN professor.name IS '교수명';

COMMENT ON COLUMN professor.ssn IS '주민등록번호';

COMMENT ON COLUMN professor.categoryname IS '구분명';

COMMENT ON COLUMN professor.majorno IS '학과코드';

COMMENT ON COLUMN professor.address IS '주소';

COMMENT ON COLUMN professor.phone IS '전화번호';

COMMENT ON COLUMN professor.gender IS '성별';

COMMENT ON COLUMN professor.email IS '이메일';

COMMENT ON COLUMN professor.treasure IS '나의보물1호';


CREATE TABLE administrator (
	id	VARCHAR2(10)	NOT NULL,
	name	VARCHAR2(10)	NOT NULL,
	ssn	VARCHAR2(20)	NOT NULL,
	address	VARCHAR2(500)	NOT NULL,
	phone	VARCHAR2(20)	NULL,
	gender	VARCHAR2(1)	DEFAULT 'M'	NOT NULL,
	email	VARCHAR2(500)	NOT NULL,
	treasure	VARCHAR2(200)	NOT NULL,
	adminhiredate	DATE		NULL
);


COMMENT ON COLUMN administrator.ssn IS '관리자번호';

COMMENT ON COLUMN administrator.name IS '관리자명';

COMMENT ON COLUMN administrator.adminssn IS '주민등록번호';

COMMENT ON COLUMN administrator.address IS '주소';

COMMENT ON COLUMN administrator.phone IS '전화번호';

COMMENT ON COLUMN administrator.gender IS '성별';

COMMENT ON COLUMN administrator.email IS '이메일';

COMMENT ON COLUMN administrator.treasure IS '나의보물1호';

COMMENT ON COLUMN administrator.adminhiredate IS '입사일';





CREATE TABLE ssbenefitst (
	benefitterm NUMBER NOT NULL,
	id	VARCHAR2(10) NOT NULL,
	ssname	VARCHAR2(40) NOT NULL
);

COMMENT ON COLUMN ssbenefitst.benefitterm IS '장학금수혜학기';

COMMENT ON COLUMN ssbenefitst.id IS '학번';

COMMENT ON COLUMN ssbenefitst.ssname IS '장학금명';





ALTER TABLE termscore ADD CONSTRAINT PK_TOTALSCORE PRIMARY KEY (
	semester,
	id
	
);

ALTER TABLE notice ADD CONSTRAINT PK_NOTICE PRIMARY KEY (
	noticeno
);

ALTER TABLE attendance ADD CONSTRAINT PK_ATTENDANCE PRIMARY KEY (
	lcode,
	id
);

ALTER TABLE schedule ADD CONSTRAINT PK_SCHEDULE PRIMARY KEY (
	scheduleid
);

ALTER TABLE lroom ADD CONSTRAINT PK_LROOM PRIMARY KEY (
	room
);

ALTER TABLE lecture ADD CONSTRAINT PK_LECTURE PRIMARY KEY (
	lcode
);

ALTER TABLE scholarship ADD CONSTRAINT PK_SCHOLARSHIP PRIMARY KEY (
	ssname
);

ALTER TABLE category ADD CONSTRAINT PK_CATEGORY PRIMARY KEY (
	categoryname
);

ALTER TABLE major ADD CONSTRAINT PK_MAJOR PRIMARY KEY (
	majorno
);

ALTER TABLE lapplication ADD CONSTRAINT PK_LAPPLICATION PRIMARY KEY (
	receptionno
);

ALTER TABLE reception ADD CONSTRAINT PK_RECEPTION PRIMARY KEY (
	receptionno
);

ALTER TABLE lecturescore ADD CONSTRAINT PK_LECTURESCORE PRIMARY KEY (
	receptionno
);

ALTER TABLE student ADD CONSTRAINT PK_STUDENT PRIMARY KEY (
	id
);

ALTER TABLE professor ADD CONSTRAINT PK_PROFESSOR PRIMARY KEY (
	id
);

ALTER TABLE administrator ADD CONSTRAINT PK_ADMIN PRIMARY KEY (
	ssn
);

ALTER TABLE ssbenefitst ADD CONSTRAINT PK_SSBENEFITST PRIMARY KEY (
	benefitterm,
	id
);

ALTER TABLE absence ADD CONSTRAINT PK_ABSENCE PRIMARY KEY (
	requestid
);

ALTER TABLE lplan ADD CONSTRAINT PK_LPLAN PRIMARY KEY (
	lcode
);



ALTER TABLE termscore ADD CONSTRAINT FK_student_TO_totalscore_1 FOREIGN KEY (
	id
)
REFERENCES student (
	id
);

ALTER TABLE lecturescore ADD CONSTRAINT FK_lecture_TO_totalscore_1 FOREIGN KEY (
	receptionno
)
REFERENCES lapplication (
	receptionno
);


ALTER TABLE notice ADD CONSTRAINT FK_admin_TO_notice_1 FOREIGN KEY (
	adno
)
REFERENCES administrator (
	ssn
);

ALTER TABLE attendance ADD CONSTRAINT FK_lecture_TO_attendance_1 FOREIGN KEY (
	lcode
)
REFERENCES lecture (
	lcode
);

ALTER TABLE attendance ADD CONSTRAINT FK_student_TO_attendance_1 FOREIGN KEY (
	id
)
REFERENCES student (
	id
);

ALTER TABLE schedule ADD CONSTRAINT FK_admin_TO_schedule_1 FOREIGN KEY (
	adno
)
REFERENCES administrator (
	ssn
);


ALTER TABLE lecture ADD CONSTRAINT FK_professor_TO_lecture_1 FOREIGN KEY (
	id
)
REFERENCES professor (
	id
);

alter table lecture disable constraint FK_professor_TO_lecture_1;

ALTER TABLE lecture ADD CONSTRAINT FK_lroom_TO_lecture_1 FOREIGN KEY (
	room
)
REFERENCES lroom (
	room
);

ALTER TABLE major ADD CONSTRAINT FK_category_TO_major_1 FOREIGN KEY (categoryname)
REFERENCES category (categoryname) on delete cascade;

ALTER TABLE lapplication ADD CONSTRAINT FK_lecture_TO_lapplication_1 FOREIGN KEY (
	lcode
)
REFERENCES lecture (
	lcode
);

ALTER TABLE lapplication ADD CONSTRAINT FK_student_TO_lapplication_1 FOREIGN KEY (
	id
)
REFERENCES student (
	id
);


ALTER TABLE lapplication ADD CONSTRAINT FK_lroom_TO_lapplication_1 FOREIGN KEY (
	room
)
REFERENCES lroom (
	room
);


ALTER TABLE reception ADD CONSTRAINT FK_professor_TO_reception_1 FOREIGN KEY (
	id
)
REFERENCES professor (
	id
);

ALTER TABLE reception ADD CONSTRAINT FK_professor_TO_reception_2 FOREIGN KEY (
	subid
)
REFERENCES professor (
	id
);

ALTER TABLE reception ADD CONSTRAINT FK_lecture_TO_reception_1 FOREIGN KEY (
	lcode
)
REFERENCES lecture (
	lcode
);

ALTER TABLE reception ADD CONSTRAINT FK_lroom_TO_reception_1 FOREIGN KEY (
	room
)
REFERENCES lroom (
	room
);

ALTER TABLE lecturescore ADD CONSTRAINT FK_lecture_TO_lecturescore_1 FOREIGN KEY (
	lcode
)
REFERENCES lecture (
	lcode
);

ALTER TABLE lecturescore ADD CONSTRAINT FK_student_TO_lecturescore_1 FOREIGN KEY (
	id
)
REFERENCES student (
	id
);

ALTER TABLE student ADD CONSTRAINT FK_category_TO_student_1 FOREIGN KEY (
	categoryname
)
REFERENCES category (
	categoryname
);

ALTER TABLE student ADD CONSTRAINT FK_major_TO_student_1 FOREIGN KEY (
	majorno
)
REFERENCES major (
	majorno
);

ALTER TABLE student ADD CONSTRAINT FK_scholarship_TO_student_1 FOREIGN KEY (
	ssname
)
REFERENCES scholarship (
	ssname
);

ALTER TABLE professor ADD CONSTRAINT FK_category_TO_professor_1 FOREIGN KEY (
	categoryname
)
REFERENCES category (
	categoryname
);

ALTER TABLE professor ADD CONSTRAINT FK_major_TO_professor_1 FOREIGN KEY (
	majorno
)
REFERENCES major (
	majorno
);


ALTER TABLE ssbenefitst ADD CONSTRAINT FK_student_TO_ssbenefitst_1 FOREIGN KEY (id)
REFERENCES student (id) on delete cascade;

ALTER TABLE ssbenefitst ADD CONSTRAINT FK_scholarship_TO_ssbenefitst FOREIGN KEY (ssname)
REFERENCES scholarship (ssname) on delete cascade;

ALTER TABLE absence ADD CONSTRAINT FK_student_TO_absence_1 FOREIGN KEY (id)
REFERENCES student (id) on delete cascade;


ALTER TABLE lplan ADD CONSTRAINT FK_lecture_TO_lplan_1 FOREIGN KEY (
	lcode
)
REFERENCES lecture (
	lcode
);

ALTER TABLE lplan ADD CONSTRAINT FK_lroom_TO_lplan_1 FOREIGN KEY (
	room
)
REFERENCES lroom (
	room
);

ALTER TABLE lplan ADD CONSTRAINT FK_professor_TO_lplan_1 FOREIGN KEY (
	id
)
REFERENCES professor (
	id
);

--비밀번호 컬럼추가
ALTER TABLE STUDENT ADD (password varchar2(200));
ALTER TABLE PROFESSOR ADD (password varchar2(200));
ALTER TABLE ADMINISTRATOR ADD (password varchar2(200));

--구분
INSERT INTO category VALUES ('인문계열');
INSERT INTO category VALUES ('사회계열');
INSERT INTO category VALUES ('예술계열');
INSERT INTO category VALUES ('공학계열');

--학과
INSERT INTO major VALUES ('1','국문학과','30','3600000','인문계열');
INSERT INTO major VALUES ('2','영문학과','30','3400000','인문계열');
INSERT INTO major VALUES ('3','화학공학과','30','4100000','공학계열');
INSERT INTO major VALUES ('4','경영학과','30','3300000','사회계열');
INSERT INTO major VALUES ('5','음악학과','30','4900000','예술계열');


--학생
INSERT INTO student VALUES ('201701341','이세라','950130-2115471','울산시 남구 삼산동 1461-1 우성APT 103/1302  ','01035273275','F','ogilder5n@state.gov','건곤일척','인문계열','1','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201701456','백준용','930601-1107352','서울시영등포구여의도동한양아파트B동304','01062537346','M','mstratton3p@latimes.com','갈팡질팡','인문계열','1','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201701457','강재이','931207-1114453','전주시 완산구 효자동 성원맨숀 나/1501','01013152778','M','ashepton6@wikia.com','갑오징어','인문계열','1','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201701541','이준형','940809-1137226','서울종로구연지동136-56전국기독교연합회관','01021626123','M','abrahams63@wordpress.com','거울속나','인문계열','1','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201701621','한승완','951102-1136484','인천시연수구연수동579대우1차아파트102동201호','01096673685','M','vmuffitt87@geocities.com','검은기사','인문계열','1','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201702117','김현욱','940908-1134172','경기과천부림동41주공@318-901','01084837364','M','lrysom2e@stanford.edu','꼬마공주','인문계열','2','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201702359','손유현','930702-1126831','전북김제시금구면금구리431-4송원아파트306','01064174724','M','jhusselbee3z@cbc.ca','깐따삐아','인문계열','2','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201702632','최유종','950216-1162478','전북군산시경장동 488-4','01017114295','M','sclive7q@cnn.com','꼬마신사','인문계열','2','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201702813','한승엽','930130-1160985','고양시 일산구 백석동 1316번지 현대밀라트1차 B동515호','01086559591','M','dalbiston86@whitehouse.gov','김치라면','인문계열','2','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201702857','김명철','940326-1148449','부산광역시 북구 만덕3동 909-8 19/2번지 102호','01013822185','M','dpeagrimy@4shared.com','꼬깃꼬깃','인문계열','2','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201703153','이무공','941101-1125046','경기도 화성시 향남면 평리 76번지','01074963878','M','bkinton5d@gmpg.org','다이어리','공학계열','3','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201703341','김명훈','930816-1135754','경기도 성남시 분당구 서현동 87 삼성아파트 110-802호','01039426219','M','fdragonette10@newsvine.com','눈의여왕','공학계열','3','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201703446','최유진','940630-1111569','전주시 덕진구 인후3동 아중현대ⓐ 109/505','01043746466','M','mbirch7r@e-recht24.de','뉴발란스','공학계열','3','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201703739','장재황','930324-1114439','경기남양주시별내면청학리409청학주공아파트310-804','01016888661','M','mbordessa6j@weebly.com','노트필기','공학계열','3','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201703915','권병국','950720-1147333','경기도 용인시 양지면 주북리 50-1호','01085214935','M','tbowlesworthm@fastcompany.com','달바라기','공학계열','3','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201704261','이자영','940708-2118563','대전유성구전민동426-4나래아파트101-401','01018844677','F','jcolquitt5z@meetup.com','도깨비불','사회계열','4','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201704412','박미경','941112-2102847','경기도 성남시 분당구 궁내동 중앙하이츠 208-401','01036865657','F','jvonhindenburg2y@msu.edu','도라에몽','사회계열','4','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201704854','이성현','950918-1108935','광주시 서구 화정동 859-1 현대APT103/311','01035142891','M','rellul5k@bravesites.com','동그라미','사회계열','4','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201704913','정장윤','930405-1142623','울산동구서부동257-4현대패밀리서부아파트121-1407','01037691192','M','mbright6v@ftc.gov','던킨도넛','사회계열','4','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201704962','김현구','930930-1112281','전북 완주군 이서면 갈산리 526','01045117365','M','kspeedy2b@oracle.com','데스노트','사회계열','4','2017/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201705171','김정우','930420-1129344','광주광역시 동구 지산 2 동 704-59','01013872959','M','vreadie1x@1und1.de','러브러브','예술계열','5','2017/03/01','Y','0','','MTIzNA==');
INSERT INTO student VALUES ('201705523','윤재홍','931014-2139250','서울시 강남구 도곡2동 개포럭키ⓐ 1/606','01035741559','F','ktrevon55@sbwire.com','러브비트','예술계열','5','2017/03/01','Y','0','','MTIzNA==');
INSERT INTO student VALUES ('201705645','정성원','950113-1176680','충북청주시상당구영운동125-5청주한국병원','01082261276','M','vhansemann6s@51.la','레드카드','예술계열','5','2017/03/01','Y','0','','MTIzNA==');
INSERT INTO student VALUES ('201705756','김미경','951011-2111402','경기도 성남시 분당구 구미동75 우방빌라 105-301','01029617368','F','mwardrope13@wsj.com','레스토랑','예술계열','5','2017/03/01','Y','0','','MTIzNA==');
INSERT INTO student VALUES ('201705853','김명희','940720-2107577','경기도 파주시 교하면 와동리 375-3','01093835297','F','rpaute12@hc360.com','러브홀릭','예술계열','5','2017/03/01','Y','0','','MTIzNA==');
INSERT INTO student VALUES ('201801284','김준호','940930-1143843','경기도안양시동안구호계1차현대홈타운105/402','01016719515','M','ameese20@unblog.fr','경상북도','인문계열','1','2018/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201801345','우정근','950611-1121269','경기도고양시일산구백석동삼부@101-1504','01025977344','M','trameaux4s@whitehouse.gov','고기고기','인문계열','1','2018/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201801719','신상민','960321-1119985','전북 부안읍 연곡리 398-4 부안남초등학교','01079182933','M','flamers46@macromedia.com','고등학생','인문계열','1','2018/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201801738','이형선','940417-1131191','전남광양중동1665성호@203-1806','01018426189','M','lhubbart6c@google.de','경상남도','인문계열','1','2018/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201801748','김유신','930110-2102682','전주시 완산구 효자동1가 260 상산고등학교','01097313471','F','grosenfelt1o@webmd.com','가면놀이','인문계열','1','2018/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201801759','김보람','960820-2132992','부천시 원미구 역곡 2동 산 51- 18번지 현대 아파트 A나동 505호','01033295818','F','vnutbean15@buzzfeed.com','고슴도치','인문계열','1','2018/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201801917','고성준','950205-1161101','대구시북구칠성동1가56-1','01064873633','M','kbredeed@51.la','계란말이','인문계열','1','2018/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201801967','권준호','950921-1116260','서울시양천구목동신시가지@716동103호','01046828396','M','sstallybrassp@cbslocal.com','고등학교','인문계열','1','2018/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201901122','조의조','950101-2150027','인천시부평구산곡동경남@102-1507','01082233421','F','pmelmar77@linkedin.com','곤지곤지','인문계열','1','2019/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201901131','심진아','960115-2121026','서울 노원구 하계동 270 현대아파트 105-1204','01074658649','F','lgent4b@tinyurl.com','기말고사','인문계열','1','2019/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201901211','최효정','970715-2119633','경기도 안산시 상록구 사동 푸르지오6차 610-104','01095515917','F','bluparto7y@tamu.edu','귀염둥이','인문계열','1','2019/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201901231','홍경희','960329-2107647','경기도 광주시 퇴촌면 광동리 206 금성리버빌 101-202호','01091911576','F','rpippard8d@answers.com','국가대표','인문계열','1','2019/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201901272','김혜영','960930-2143357','충남 천안시 신부동 509-9번지','01059892369','F','ffarnhill2l@google.com.hk','국민연금','인문계열','1','2019/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201901273','오재진','971115-1109926','경기도분당구야탑동장미마을현대@805-304','01073616369','M','hpottiphar4n@scientificamerican.com','귀차니즘','인문계열','1','2019/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201901534','박재석','950502-1111724','전북정읍시수성동1027부영아파트206-1502','01036689947','M','cmounch3f@goodreads.com','곰돌이푸','인문계열','1','2019/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201901585','강승주','970124-1148068','서울양천구신정동신정현대아파트107-1405','01022942193','M','fcordell4@addthis.com','국어사전','인문계열','1','2019/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201901592','안희준','961001-1124494','여수시 문수동 797번지 주공 아파트 103동 1509호','01055736743','M','cwoollin4h@skype.com','기억상실','인문계열','1','2019/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201901594','장성진','940517-1176799','서울시 강동구 명일동 48-14원일학원','01044838282','M','bmarushak6i@smh.com.au','금상첨화','인문계열','1','2019/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201901649','김윤정','951129-2118794','전북전주시완산구효자동1가622-6','01048949182','F','ccanadas1q@blogtalkradio.com','공부의신','인문계열','1','2019/03/01','N','0','','MTIzNA==');
INSERT INTO student VALUES ('201901848','권지완','950807-1114158','전북 전주시 완산구 평화동2가 현대아파트 101-705','01094816474','M','aspilemanq@mtv.com','곰실곰실','인문계열','1','2019/03/01','N','0','','MTIzNA==');


--교수
INSERT INTO professor VALUES ('P505','박태환','710704-1138184','경기 안양시 만안구 석수1동373-3백조(A)202동506','01092162982','M','acowlishaw4@domainmarket.com','울룩불룩','사회계열','4','MTIzNA==');
INSERT INTO professor VALUES ('P511','한상욱','670326-1173189','경남 김해시 부원동 111-5 강남빌라 A-502','01043741625','M','dmcconaghyc@hubpages.com','원자폭탄','사회계열','4','MTIzNA==');
INSERT INTO professor VALUES ('P517','박은미','770127-2107141','경기도 구리시 인창동 아름마을 원일A 102-905','01065147546','F','dbonnesenk@sina.com.cn','위풍당당','사회계열','4','MTIzNA==');
INSERT INTO professor VALUES ('P101','김영주','830910-2160684','경기도 용인시 구성면 언남리 341-7 상록빌라 2-1','01079864126','F','nackland0@seesaa.net','윈드러너','인문계열','1','MTIzNA==');
INSERT INTO professor VALUES ('P107','서준원','661010-1167110','강원도 원주시 단구동 황수A 3-407','01098293269','M','blemery8@wix.com','유라시아','인문계열','1','MTIzNA==');
INSERT INTO professor VALUES ('P113','이지현','690130-1117554','경기도 고양시 일산구 주엽동 강선마을 동신아파트 406-704호','01096588678','M','wguiderag@e-recht24.de','유리구슬','인문계열','1','MTIzNA==');
INSERT INTO professor VALUES ('P202','이주진','670810-1100589','경기도 평택시 서정동592-17    7/1','01075443752','M','hleleu1@google.com.br','유리그릇','인문계열','2','MTIzNA==');
INSERT INTO professor VALUES ('P208','홍재준','790828-1175232','경기 동두천시 상패동 무궁화빌라 10-402','01029675389','M','csimper9@lycos.com','유리상자','인문계열','2','MTIzNA==');
INSERT INTO professor VALUES ('P214','박철우','730405-1146127','전북 전주시 완산구 서신동 쌍용A 602-806','01092358653','M','goswalh@cargocollective.com','유성타임','인문계열','2','MTIzNA==');
INSERT INTO professor VALUES ('P606','이협수','741224-1158811','서울 동작구 흑석1동238-89  동림빌라301호','01075184953','M','sharrington6@mozilla.org','유아독존','예술계열','5','MTIzNA==');
INSERT INTO professor VALUES ('P612','이선영','840924-2147346','전북 군산시 경암동 685-9','01079291279','F','lheininge@parallels.com','이런저런','예술계열','5','MTIzNA==');
INSERT INTO professor VALUES ('P618','김유림','630202-1118697','경북 포항시 북구 흥해읍 초복동 146-1','01027718995','M','mterrettm@twitpic.com','이렁저렁','예술계열','5','MTIzNA==');
INSERT INTO professor VALUES ('P404','변현주','600117-2105253','서울 금천구 시흥본동880-40','01058553332','F','pkollas3@cnn.com','이만저만','공학계열','3','MTIzNA==');
INSERT INTO professor VALUES ('P410','김소영','650801-1162117','인천광역시 남동구 논현동 논현주공A 210동502호','01035841116','M','pibotsonb@cyberchimps.com','이솝우화','공학계열','3','MTIzNA==');
INSERT INTO professor VALUES ('P416','김희민','641009-1164667','서울시 강동구 천호3동 565 현대타워A 708','01035212311','M','mstoltingj@moonfruit.com','이심전심','공학계열','3','MTIzNA==');
--관리자

INSERT INTO administrator VALUES ('A001','이미경','891016-2103506','경기남양주 와부읍 도곡리 쌍용A 102-301','01059359285','F','mmackimmieq@reddit.com','알콩달콩','1997/03/01','MTIzNA==');
INSERT INTO administrator VALUES ('A002','김기수','930613-2107771','경북 경산시 진량읍 신상리 868 우방힐타운 101-1805','01091571426','F','mbabbt@thetimes.co.uk','애니타임','1997/07/01','MTIzNA==');
INSERT INTO administrator VALUES ('A003','김현경','840105-2152957','서울 서대문구 홍은1동440-1   나동101호','01041281595','F','ndecarolir@yahoo.com','어벤져스','1999/08/01','MTIzNA==');
INSERT INTO administrator VALUES ('A004','임진숙','790125-1143548','경기도 성남시 수정구 수진2동 삼부아파트103-1505','01037417473','M','areedmano@example.com','어쿠스틱','2000/07/01','MTIzNA==');
INSERT INTO administrator VALUES ('A005','최귀화','850619-1127701','서울 중랑구 망우1동163-62 그린빌라 가동103호','01046164752','M','lantuks@cornell.edu','엄지공주','2001/03/01','MTIzNA==');


--장학금
INSERT INTO scholarship VALUES ('성적우수장학금1','과별로 한학기의 성적이 1등인 학생','3000000');
INSERT INTO scholarship VALUES ('성적우수장학금2','과별로 한학기의 성적이 2등, 3등인 학생','1500000');

--강의실
INSERT INTO lroom VALUES ('101','본관','15');
INSERT INTO lroom VALUES ('102','본관','15');
INSERT INTO lroom VALUES ('103','본관','15');
INSERT INTO lroom VALUES ('201','본관','15');
INSERT INTO lroom VALUES ('202','본관','15');
INSERT INTO lroom VALUES ('203','본관','15');

--강의 
INSERT INTO lecture VALUES ('l001','P101','문학개론','전공','3','22','월','101');
INSERT INTO lecture VALUES ('l002','P404','화학공학입문','교양','2','30','화','102');
INSERT INTO lecture VALUES ('l003','P410','화공열역학1','전공','3','21','수','103');
INSERT INTO lecture VALUES ('l004','P416','프로젝트종합설계  ','전공','2','24','목','201');
INSERT INTO lecture VALUES ('l005','P107','C프로그래밍','전공','3','26','금','202');
INSERT INTO lecture VALUES ('l006','P107','객체지향프로그래밍','전공','2','29','월','203');
INSERT INTO lecture VALUES ('l007','P113','반도체소자','전공','3','25','화','101');
INSERT INTO lecture VALUES ('l008','P606','대중음악의 이해','교양','2','22','수','102');
INSERT INTO lecture VALUES ('l009','P612','비전공자를위한피아노','교양','3','21','목','103');
INSERT INTO lecture VALUES ('l010','P618','건반화성1','전공','2','29','금','201');
INSERT INTO lecture VALUES ('l011','P202','영어동화읽기','교양','3','21','월','202');
INSERT INTO lecture VALUES ('l012','P208','영어작문','전공','2','18','화','203');
INSERT INTO lecture VALUES ('l013','P214','드라마입문','교양','3','18','수','101');
INSERT INTO lecture VALUES ('l014','P101','국문학개론','전공','2','25','목','102');
INSERT INTO lecture VALUES ('l015','P101','현대시론','교양','3','28','금','103');
INSERT INTO lecture VALUES ('l016','P101','고전명시감상','교양','2','19','월','201');
INSERT INTO lecture VALUES ('l017','P101','국어음운론','전공','3','24','화','202');
INSERT INTO lecture VALUES ('l018','P107','현대비평론','교양','2','21','수','203');
INSERT INTO lecture VALUES ('l019','P107','국어문법','교양','3','28','목','101');
INSERT INTO lecture VALUES ('l020','P113','국어사','전공','2','30','금','102');
INSERT INTO lecture VALUES ('l021','P113','일상속문학','교양','3','29','월','103');
INSERT INTO lecture VALUES ('l022','P505','경영정보시스템','교양','2','18','화','201');
INSERT INTO lecture VALUES ('l023','P511','조직행동론','교양','3','27','수','202');
INSERT INTO lecture VALUES ('l024','P517','현대사회의대인관계','교양','2','26','목','203');

--강의신청
INSERT INTO lapplication VALUES ('r1901001','l001','201901211','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901002','l001','201901231','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901003','l001','201901272','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901004','l001','201901273','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901005','l001','201901534','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901006','l001','201901585','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901007','l001','201801345','201901','15','101','Y');
INSERT INTO lapplication VALUES ('r1901008','l001','201901592','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901009','l001','201901594','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901010','l001','201901649','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901011','l001','201901848','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901012','l001','201702117','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901013','l001','201702359','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901014','l001','201702632','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901015','l001','201702813','201901','15','101','Y');
INSERT INTO lapplication VALUES ('r1901016','l001','201702857','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901017','l002','201703153','201901','15','102','N');
INSERT INTO lapplication VALUES ('r1901018','l002','201703341','201901','15','102','N');
INSERT INTO lapplication VALUES ('r1901019','l002','201703446','201901','15','102','N');
INSERT INTO lapplication VALUES ('r1901020','l002','201703739','201901','15','102','N');
INSERT INTO lapplication VALUES ('r1901021','l002','201703915','201901','15','102','N');
INSERT INTO lapplication VALUES ('r1901022','l002','201704261','201901','15','102','N');
INSERT INTO lapplication VALUES ('r1901023','l003','201704412','201901','15','103','N');
INSERT INTO lapplication VALUES ('r1901024','l003','201704854','201901','15','103','N');
INSERT INTO lapplication VALUES ('r1901025','l004','201704913','201901','15','201','N');
INSERT INTO lapplication VALUES ('r1901026','l004','201704962','201901','15','201','N');
INSERT INTO lapplication VALUES ('r1901027','l005','201705171','201901','15','202','N');
INSERT INTO lapplication VALUES ('r1901028','l005','201701341','201901','15','202','N');
INSERT INTO lapplication VALUES ('r1901029','l005','201701456','201901','15','202','N');
INSERT INTO lapplication VALUES ('r1901030','l005','201701457','201901','15','202','N');
INSERT INTO lapplication VALUES ('r1901031','l006','201705523','201901','15','203','N');
INSERT INTO lapplication VALUES ('r1901032','l006','201701341','201901','15','203','N');
INSERT INTO lapplication VALUES ('r1901033','l006','201701456','201901','15','203','N');
INSERT INTO lapplication VALUES ('r1901034','l006','201701457','201901','15','203','N');
INSERT INTO lapplication VALUES ('r1901035','l007','201705645','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901036','l007','201701341','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901037','l007','201701456','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901038','l007','201701457','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901039','l008','201705756','201901','15','102','N');
INSERT INTO lapplication VALUES ('r1901040','l009','201705853','201901','15','103','N');
INSERT INTO lapplication VALUES ('r1901041','l010','201701341','201901','15','201','N');
INSERT INTO lapplication VALUES ('r1901042','l011','201701456','201901','15','202','N');
INSERT INTO lapplication VALUES ('r1901043','l012','201701457','201901','15','203','N');
INSERT INTO lapplication VALUES ('r1901044','l013','201701541','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901045','l014','201701621','201901','15','102','Y');
INSERT INTO lapplication VALUES ('r1901046','l015','201801284','201901','15','103','N');
INSERT INTO lapplication VALUES ('r1901047','l016','201801345','201901','15','201','N');
INSERT INTO lapplication VALUES ('r1901048','l017','201704854','201901','15','202','Y');
INSERT INTO lapplication VALUES ('r1901049','l017','201801719','201901','15','202','N');
INSERT INTO lapplication VALUES ('r1901050','l018','201801738','201901','15','203','N');
INSERT INTO lapplication VALUES ('r1901051','l019','201801748','201901','15','101','N');
INSERT INTO lapplication VALUES ('r1901052','l020','201801759','201901','15','102','N');
INSERT INTO lapplication VALUES ('r1901053','l021','201801917','201901','15','103','N');
INSERT INTO lapplication VALUES ('r1901054','l022','201801967','201901','15','201','N');
INSERT INTO lapplication VALUES ('r1901055','l023','201901122','201901','15','202','N');
INSERT INTO lapplication VALUES ('r1901056','l024','201901131','201901','15','203','N');



INSERT INTO lapplication VALUES ('r1902001','l001','201703153','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902002','l001','201703341','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902003','l001','201703446','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902004','l001','201703739','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902005','l001','201703915','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902006','l001','201704261','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902007','l001','201704412','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902008','l001','201704854','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902009','l001','201704913','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902010','l001','201704962','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902011','l001','201705171','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902012','l001','201705523','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902013','l001','201705645','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902014','l001','201705756','201902','15','101','Y');
INSERT INTO lapplication VALUES ('r1902015','l001','201705853','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902016','l002','201701541','201902','15','102','N');
INSERT INTO lapplication VALUES ('r1902017','l002','201701621','201902','15','102','N');
INSERT INTO lapplication VALUES ('r1902018','l002','201801284','201902','15','102','N');
INSERT INTO lapplication VALUES ('r1902019','l002','201801345','201902','15','102','N');
INSERT INTO lapplication VALUES ('r1902020','l002','201801719','201902','15','102','N');
INSERT INTO lapplication VALUES ('r1902021','l002','201801738','201902','15','102','N');
INSERT INTO lapplication VALUES ('r1902022','l003','201801748','201902','15','103','N');
INSERT INTO lapplication VALUES ('r1902023','l003','201801759','201902','15','103','N');
INSERT INTO lapplication VALUES ('r1902024','l004','201801917','201902','15','201','N');
INSERT INTO lapplication VALUES ('r1902025','l004','201801967','201902','15','201','N');
INSERT INTO lapplication VALUES ('r1902026','l005','201901122','201902','15','202','N');
INSERT INTO lapplication VALUES ('r1902027','l006','201901131','201902','15','203','N');
INSERT INTO lapplication VALUES ('r1902028','l007','201702632','201902','15','101','Y');
INSERT INTO lapplication VALUES ('r1902029','l007','201901211','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902030','l008','201901231','201902','15','102','N');
INSERT INTO lapplication VALUES ('r1902031','l009','201901272','201902','15','103','N');
INSERT INTO lapplication VALUES ('r1902032','l010','201901273','201902','15','201','N');
INSERT INTO lapplication VALUES ('r1902033','l011','201901534','201902','15','202','N');
INSERT INTO lapplication VALUES ('r1902034','l012','201901585','201902','15','203','N');
INSERT INTO lapplication VALUES ('r1902035','l013','201901592','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902036','l014','201901594','201902','15','102','N');
INSERT INTO lapplication VALUES ('r1902037','l015','201901649','201902','15','103','N');
INSERT INTO lapplication VALUES ('r1902038','l016','201901848','201902','15','201','N');
INSERT INTO lapplication VALUES ('r1902039','l017','201702117','201902','15','202','N');
INSERT INTO lapplication VALUES ('r1902040','l018','201702359','201902','15','203','N');
INSERT INTO lapplication VALUES ('r1902041','l019','201701341','201902','15','101','N');
INSERT INTO lapplication VALUES ('r1902042','l020','201701456','201902','15','102','N');
INSERT INTO lapplication VALUES ('r1902043','l021','201701457','201902','15','103','N');
INSERT INTO lapplication VALUES ('r1902044','l022','201702632','201902','15','201','N');
INSERT INTO lapplication VALUES ('r1902045','l022','201701341','201902','15','201','N');
INSERT INTO lapplication VALUES ('r1902046','l022','201701456','201902','15','201','N');
INSERT INTO lapplication VALUES ('r1902047','l022','201701457','201902','15','201','N');
INSERT INTO lapplication VALUES ('r1902048','l023','201702813','201902','15','202','N');
INSERT INTO lapplication VALUES ('r1902049','l023','201701341','201902','15','202','N');
INSERT INTO lapplication VALUES ('r1902050','l023','201701456','201902','15','202','N');
INSERT INTO lapplication VALUES ('r1902051','l023','201701457','201902','15','202','N');
INSERT INTO lapplication VALUES ('r1902052','l024','201702857','201902','15','203','N');
INSERT INTO lapplication VALUES ('r1902053','l024','201701341','201902','15','203','N');
INSERT INTO lapplication VALUES ('r1902054','l024','201701456','201902','15','203','N');
INSERT INTO lapplication VALUES ('r1902055','l024','201701457','201902','15','203','N');



INSERT INTO lapplication VALUES ('r2001001','l001','201701341','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001002','l001','201701456','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001003','l001','201701457','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001004','l001','201701541','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001005','l001','201701621','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001006','l001','201801284','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001007','l001','201801345','202001','15','101','Y');
INSERT INTO lapplication VALUES ('r2001008','l001','201801719','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001009','l001','201801738','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001010','l001','201801748','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001011','l001','201801759','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001012','l001','201801917','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001013','l001','201801967','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001014','l001','201901122','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001015','l001','201901131','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001016','l002','201701341','202001','15','102','N');
INSERT INTO lapplication VALUES ('r2001017','l002','201701456','202001','15','102','N');
INSERT INTO lapplication VALUES ('r2001018','l002','201701457','202001','15','102','N');
INSERT INTO lapplication VALUES ('r2001019','l002','201901211','202001','15','102','N');
INSERT INTO lapplication VALUES ('r2001020','l002','201901231','202001','15','102','N');
INSERT INTO lapplication VALUES ('r2001021','l002','201901272','202001','15','102','N');
INSERT INTO lapplication VALUES ('r2001022','l002','201901273','202001','15','102','N');
INSERT INTO lapplication VALUES ('r2001023','l002','201901534','202001','15','102','N');
INSERT INTO lapplication VALUES ('r2001024','l002','201901585','202001','15','102','N');
INSERT INTO lapplication VALUES ('r2001025','l003','201701341','202001','15','103','N');
INSERT INTO lapplication VALUES ('r2001026','l003','201701456','202001','15','103','N');
INSERT INTO lapplication VALUES ('r2001027','l003','201701457','202001','15','103','N');
INSERT INTO lapplication VALUES ('r2001028','l003','201901592','202001','15','103','N');
INSERT INTO lapplication VALUES ('r2001029','l003','201901594','202001','15','103','N');
INSERT INTO lapplication VALUES ('r2001030','l004','201701341','202001','15','201','N');
INSERT INTO lapplication VALUES ('r2001031','l004','201701456','202001','15','201','N');
INSERT INTO lapplication VALUES ('r2001032','l004','201701457','202001','15','201','N');
INSERT INTO lapplication VALUES ('r2001033','l004','201901649','202001','15','201','N');
INSERT INTO lapplication VALUES ('r2001034','l004','201901848','202001','15','201','N');
INSERT INTO lapplication VALUES ('r2001035','l005','201702117','202001','15','202','N');
INSERT INTO lapplication VALUES ('r2001036','l006','201702359','202001','15','203','N');
INSERT INTO lapplication VALUES ('r2001037','l007','201702632','202001','15','101','Y');
INSERT INTO lapplication VALUES ('r2001038','l008','201702813','202001','15','102','N');
INSERT INTO lapplication VALUES ('r2001039','l009','201702857','202001','15','103','N');
INSERT INTO lapplication VALUES ('r2001040','l010','201703153','202001','15','201','N');
INSERT INTO lapplication VALUES ('r2001041','l011','201703341','202001','15','202','N');
INSERT INTO lapplication VALUES ('r2001042','l012','201703446','202001','15','203','N');
INSERT INTO lapplication VALUES ('r2001043','l013','201703739','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001044','l014','201703915','202001','15','102','N');
INSERT INTO lapplication VALUES ('r2001045','l015','201704261','202001','15','103','N');
INSERT INTO lapplication VALUES ('r2001046','l016','201704412','202001','15','201','N');
INSERT INTO lapplication VALUES ('r2001047','l017','201704854','202001','15','202','Y');
INSERT INTO lapplication VALUES ('r2001048','l018','201704913','202001','15','203','N');
INSERT INTO lapplication VALUES ('r2001049','l019','201704962','202001','15','101','N');
INSERT INTO lapplication VALUES ('r2001050','l020','201705171','202001','15','102','N');
INSERT INTO lapplication VALUES ('r2001051','l021','201705523','202001','15','103','N');
INSERT INTO lapplication VALUES ('r2001052','l022','201705645','202001','15','201','N');
INSERT INTO lapplication VALUES ('r2001053','l023','201705756','202001','15','202','N');
INSERT INTO lapplication VALUES ('r2001054','l024','201705853','202001','15','203','N');


-- 강의계획서
INSERT INTO lplan VALUES ('l001','101','P101','문학이란 무엇인지 토론한다');
INSERT INTO lplan VALUES ('l002','102','P404','화장품의 원료로 간단 제작해본다');
INSERT INTO lplan VALUES ('l003','103','P410','열에너지를 이용한 터빈 작동');
INSERT INTO lplan VALUES ('l004','201','P416','공리적인 프로젝트를 구축한다');
INSERT INTO lplan VALUES ('l005','202','P107','c언어를 이용한 소켓프로그래밍');
INSERT INTO lplan VALUES ('l006','203','P107','객체지향을 이해한다');
INSERT INTO lplan VALUES ('l007','101','P113','기초과확과 받도체 응용토론한다');
INSERT INTO lplan VALUES ('l008','102','P606','대중음악을 이해한다');
INSERT INTO lplan VALUES ('l009','103','P612','베토벤의 비창을 이해한다');
INSERT INTO lplan VALUES ('l010','201','P618','화성의 개념 습득및 응용한다');
INSERT INTO lplan VALUES ('l011','202','P202','영어동화를 통해 단어의 어원을 배운다');
INSERT INTO lplan VALUES ('l012','203','P208','마블영화를 보고 영어작문을한다');
INSERT INTO lplan VALUES ('l013','101','P214','역대 히트작 드라마를 보고 나만의 대본을 작성해본다.');
INSERT INTO lplan VALUES ('l014','102','P101','국어의 문학을 공부한다.');
INSERT INTO lplan VALUES ('l015','103','P101','현대시를 이해한다.');
INSERT INTO lplan VALUES ('l016','201','P101','고전명시를 읽고 명상을 해본다.');
INSERT INTO lplan VALUES ('l017','202','P101','국어의 음운에 대하여 토론한다.');
INSERT INTO lplan VALUES ('l018','203','P107','현대비평을 해보고 토론한다.');
INSERT INTO lplan VALUES ('l019','101','P107','국어문법');
INSERT INTO lplan VALUES ('l020','102','P113','재밌는 한국사를 듣고 국어의 역사를 공부한다.');
INSERT INTO lplan VALUES ('l021','103','P113','일상속에 숨어있는 문학에 집중해본다.');
INSERT INTO lplan VALUES ('l022','201','P505','경영학의 기초지식과 그에 부합하는 프로그램을 제작한다.');
INSERT INTO lplan VALUES ('l023','202','P511','팀플레이 활동을 통해 팀워크를 배운다.');
INSERT INTO lplan VALUES ('l024','203','P517','자신감을 통해 대인관계의 본질을 배운다. ');

-- 휴보강 신청
INSERT INTO reception VALUES ('r001','P505','개인사정','대리강의','19/04/08','19/04/08','전체','l022','101','P606');
INSERT INTO reception VALUES ('r002','P416','출장','e강의','19/04/22','19/04/22','전체','l004','202','P505');
INSERT INTO reception VALUES ('r003','P511','질병','일반강의','19/05/07','19/05/14','전체','l023','103','P517');
INSERT INTO reception VALUES ('r004','P517','질병','일반강의','19/05/23','19/05/30','전체','l024','203','P511');
INSERT INTO reception VALUES ('r005','P101','질병','일반강의','19/06/03','19/06/10','전체','l001','201','P202');
INSERT INTO reception VALUES ('r006','P107','질병','일반강의','19/06/05','19/06/12','전체','l007','102','P101');
INSERT INTO reception VALUES ('r007','P113','질병','일반강의','19/06/14','19/06/21','전체','l020','101','P113');
INSERT INTO reception VALUES ('r008','P202','개인사정','대리강의','19/06/17','19/06/17','전체','l011','202','P208');
INSERT INTO reception VALUES ('r009','P208','질병','일반강의','19/06/18','19/06/25','전체','l012','103','P612');
INSERT INTO reception VALUES ('r010','P214','질병','일반강의','19/06/27','19/07/04','전체','l013','203','P606');
INSERT INTO reception VALUES ('r011','P606','개인사정','대리강의','19/07/08','19/07/08','전체','l008','201','P612');
INSERT INTO reception VALUES ('r012','P612','질병','일반강의','19/07/11','19/07/18','전체','l009','102','P618');
INSERT INTO reception VALUES ('r013','P618','출장','e강의','19/10/23','19/10/23','전체','l010','101','P404');
INSERT INTO reception VALUES ('r014','P404','질병','일반강의','20/05/06','20/05/13','전체','l002','202','P410');
INSERT INTO reception VALUES ('r015','P410','출장','e강의','20/06/25','20/07/02','전체','l003','103','P416');


--강의별성적


INSERT INTO lecturescore VALUES ('r1901001','l001','201901211','100','77','67','81','B','N');
INSERT INTO lecturescore VALUES ('r1901002','l001','201901231','90','88','100','93','A','N');
INSERT INTO lecturescore VALUES ('r1901003','l001','201901272','70','81','72','74','C','N');
INSERT INTO lecturescore VALUES ('r1901004','l001','201901273','110','57','34','67','D+','N');
INSERT INTO lecturescore VALUES ('r1901005','l001','201901534','90','68','84','81','B','N');
INSERT INTO lecturescore VALUES ('r1901006','l001','201901585','110','100','100','103','A+','N');
INSERT INTO lecturescore VALUES ('r1901007','l001','201801345','60','67','51','59','F','Y');
INSERT INTO lecturescore VALUES ('r1901008','l001','201901592','100','68','44','71','C','N');
INSERT INTO lecturescore VALUES ('r1901009','l001','201901594','80','56','53','63','D','N');
INSERT INTO lecturescore VALUES ('r1901010','l001','201901649','60','88','79','76','C+','N');
INSERT INTO lecturescore VALUES ('r1901011','l001','201901848','100','91','87','93','A','N');
INSERT INTO lecturescore VALUES ('r1901012','l001','201702117','80','90','100','90','B+','N');
INSERT INTO lecturescore VALUES ('r1901013','l001','201702359','80','77','71','76','C+','N');
INSERT INTO lecturescore VALUES ('r1901014','l001','201702632','90','64','76','77','C+','N');
INSERT INTO lecturescore VALUES ('r1901015','l001','201702813','90','78','60','76','C+','N');
INSERT INTO lecturescore VALUES ('r1901016','l001','201702857','120','82','34','79','C+','N');
INSERT INTO lecturescore VALUES ('r1901017','l002','201703153','80','68','73','74','C','N');
INSERT INTO lecturescore VALUES ('r1901018','l002','201703341','80','92','72','81','B','N');
INSERT INTO lecturescore VALUES ('r1901019','l002','201703446','90','88','80','86','B+','N');
INSERT INTO lecturescore VALUES ('r1901020','l002','201703739','80','51','76','69','D+','N');
INSERT INTO lecturescore VALUES ('r1901021','l002','201703915','90','78','100','89','B+','N');
INSERT INTO lecturescore VALUES ('r1901022','l002','201704261','90','69','57','72','C','N');
INSERT INTO lecturescore VALUES ('r1901023','l003','201704412','70','100','74','81','B','N');
INSERT INTO lecturescore VALUES ('r1901024','l003','201704854','90','68','60','73','C','N');
INSERT INTO lecturescore VALUES ('r1901025','l004','201704913','90','78','83','84','B','N');
INSERT INTO lecturescore VALUES ('r1901026','l004','201704962','80','94','98','91','A','N');
INSERT INTO lecturescore VALUES ('r1901027','l005','201705171','60','56','77','64','D','Y');
INSERT INTO lecturescore VALUES ('r1901028','l005','201701341','80','89','78','82','B','N');
INSERT INTO lecturescore VALUES ('r1901029','l005','201701456','80','87','78','82','B','N');
INSERT INTO lecturescore VALUES ('r1901030','l005','201701457','80','74','100','85','B','N');
INSERT INTO lecturescore VALUES ('r1901031','l006','201705523','100','85','91','92','A','N');
INSERT INTO lecturescore VALUES ('r1901032','l006','201701341','90','70','100','87','B+','N');
INSERT INTO lecturescore VALUES ('r1901033','l006','201701456','70','83','84','79','C+','N');
INSERT INTO lecturescore VALUES ('r1901034','l006','201701457','80','58','68','69','D+','N');
INSERT INTO lecturescore VALUES ('r1901035','l007','201705645','90','69','92','84','B','N');
INSERT INTO lecturescore VALUES ('r1901036','l007','201701341','100','88','77','88','B+','N');
INSERT INTO lecturescore VALUES ('r1901037','l007','201701456','90','82','91','88','B+','N');
INSERT INTO lecturescore VALUES ('r1901038','l007','201701457','70','60','22','51','F','N');
INSERT INTO lecturescore VALUES ('r1901039','l008','201705756','70','74','76','73','C','N');
INSERT INTO lecturescore VALUES ('r1901040','l009','201705853','100','79','78','86','B+','N');
INSERT INTO lecturescore VALUES ('r1901041','l010','201701341','80','80','63','74','C','N');
INSERT INTO lecturescore VALUES ('r1901042','l011','201701456','90','100','78','89','B+','N');
INSERT INTO lecturescore VALUES ('r1901043','l012','201701457','80','92','95','89','B+','N');
INSERT INTO lecturescore VALUES ('r1901044','l013','201701541','100','52','57','70','D+','N');
INSERT INTO lecturescore VALUES ('r1901045','l014','201701621','80','90','76','82','B','N');
INSERT INTO lecturescore VALUES ('r1901046','l015','201801284','90','85','100','92','A','N');
INSERT INTO lecturescore VALUES ('r1901047','l016','201801345','70','84','74','76','C+','N');
INSERT INTO lecturescore VALUES ('r1901048','l017','201704854','60','58','60','59','F','Y');
INSERT INTO lecturescore VALUES ('r1901049','l017','201801719','70','49','32','50','F','N');
INSERT INTO lecturescore VALUES ('r1901050','l018','201801738','100','86','87','91','A','N');
INSERT INTO lecturescore VALUES ('r1901051','l019','201801748','70','80','67','72','C','N');
INSERT INTO lecturescore VALUES ('r1901052','l020','201801759','100','57','36','64','D','N');
INSERT INTO lecturescore VALUES ('r1901053','l021','201801917','80','88','90','86','B+','N');
INSERT INTO lecturescore VALUES ('r1901054','l022','201801967','100','70','61','77','C+','N');
INSERT INTO lecturescore VALUES ('r1901055','l023','201901122','100','70','87','86','B+','N');
INSERT INTO lecturescore VALUES ('r1901056','l024','201901131','100','74','76','83','B','N');
INSERT INTO lecturescore VALUES ('r1902001','l001','201703153','80','23','86','63','D','N');
INSERT INTO lecturescore VALUES ('r1902002','l001','201703341','100','75','87','87','B+','N');
INSERT INTO lecturescore VALUES ('r1902003','l001','201703446','100','67','98','88','B+','N');
INSERT INTO lecturescore VALUES ('r1902004','l001','201703739','80','66','62','69','D+','N');
INSERT INTO lecturescore VALUES ('r1902005','l001','201703915','80','58','83','74','C','N');
INSERT INTO lecturescore VALUES ('r1902006','l001','201704261','100','66','52','73','C','N');
INSERT INTO lecturescore VALUES ('r1902007','l001','201704412','90','94','73','86','B+','N');
INSERT INTO lecturescore VALUES ('r1902008','l001','201704854','100','56','48','68','D+','N');
INSERT INTO lecturescore VALUES ('r1902009','l001','201704913','80','78','100','86','B+','N');
INSERT INTO lecturescore VALUES ('r1902010','l001','201704962','90','92','85','89','B+','N');
INSERT INTO lecturescore VALUES ('r1902011','l001','201705171','90','89','67','82','B','N');
INSERT INTO lecturescore VALUES ('r1902012','l001','201705523','80','88','69','79','C+','N');
INSERT INTO lecturescore VALUES ('r1902013','l001','201705645','90','86','88','88','B+','N');
INSERT INTO lecturescore VALUES ('r1902014','l001','201705756','80','100','100','93','A','N');
INSERT INTO lecturescore VALUES ('r1902015','l001','201705853','90','80','65','78','C+','N');
INSERT INTO lecturescore VALUES ('r1902016','l002','201701541','80','85','77','81','B','N');
INSERT INTO lecturescore VALUES ('r1902017','l002','201701621','100','93','100','98','A+','N');
INSERT INTO lecturescore VALUES ('r1902018','l002','201801284','90','72','68','77','C+','N');
INSERT INTO lecturescore VALUES ('r1902019','l002','201801345','70','84','82','79','C+','N');
INSERT INTO lecturescore VALUES ('r1902020','l002','201801719','70','93','94','86','B+','N');
INSERT INTO lecturescore VALUES ('r1902021','l002','201801738','110','73','60','81','B','N');
INSERT INTO lecturescore VALUES ('r1902022','l003','201801748','100','87','100','96','A+','N');
INSERT INTO lecturescore VALUES ('r1902023','l003','201801759','80','41','59','60','D','N');
INSERT INTO lecturescore VALUES ('r1902024','l004','201801917','100','100','83','94','A','N');
INSERT INTO lecturescore VALUES ('r1902025','l004','201801967','80','87','59','75','C+','N');
INSERT INTO lecturescore VALUES ('r1902026','l005','201901122','100','61','85','82','B','N');
INSERT INTO lecturescore VALUES ('r1902027','l006','201901131','90','52','78','73','C','N');
INSERT INTO lecturescore VALUES ('r1902028','l007','201702632','80','65','76','74','C','Y');
INSERT INTO lecturescore VALUES ('r1902029','l007','201901211','90','80','64','78','C+','N');
INSERT INTO lecturescore VALUES ('r1902030','l008','201901231','100','86','50','79','C+','N');
INSERT INTO lecturescore VALUES ('r1902031','l009','201901272','100','75','62','79','C+','N');
INSERT INTO lecturescore VALUES ('r1902032','l010','201901273','100','93','93','95','A+','N');
INSERT INTO lecturescore VALUES ('r1902033','l011','201901534','110','61','69','80','B','N');
INSERT INTO lecturescore VALUES ('r1902034','l012','201901585','80','100','95','92','A','N');
INSERT INTO lecturescore VALUES ('r1902035','l013','201901592','90','76','74','80','C+','N');
INSERT INTO lecturescore VALUES ('r1902036','l014','201901594','100','61','64','75','C','N');
INSERT INTO lecturescore VALUES ('r1902037','l015','201901649','100','65','62','76','C+','N');
INSERT INTO lecturescore VALUES ('r1902038','l016','201901848','90','82','98','90','A','N');
INSERT INTO lecturescore VALUES ('r1902039','l017','201702117','80','82','70','77','C+','N');
INSERT INTO lecturescore VALUES ('r1902040','l018','201702359','80','72','88','80','C+','N');
INSERT INTO lecturescore VALUES ('r1902041','l019','201701341','100','82','75','86','B+','N');
INSERT INTO lecturescore VALUES ('r1902042','l020','201701456','90','75','67','77','C+','N');
INSERT INTO lecturescore VALUES ('r1902043','l021','201701457','90','88','98','92','A','N');
INSERT INTO lecturescore VALUES ('r1902044','l022','201702632','70','88','68','75','C+','N');
INSERT INTO lecturescore VALUES ('r1902045','l022','201701341','80','80','75','78','C+','N');
INSERT INTO lecturescore VALUES ('r1902046','l022','201701456','90','81','60','77','C+','N');
INSERT INTO lecturescore VALUES ('r1902047','l022','201701457','60','64','65','63','D','N');
INSERT INTO lecturescore VALUES ('r1902048','l023','201702813','100','79','100','93','A','N');
INSERT INTO lecturescore VALUES ('r1902049','l023','201701341','90','82','98','90','B+','N');
INSERT INTO lecturescore VALUES ('r1902050','l023','201701456','90','60','78','76','C+','N');
INSERT INTO lecturescore VALUES ('r1902051','l023','201701457','90','57','87','78','C+','N');
INSERT INTO lecturescore VALUES ('r1902052','l024','201702857','90','71','90','84','B','N');
INSERT INTO lecturescore VALUES ('r1902053','l024','201701341','100','64','64','76','C+','N');
INSERT INTO lecturescore VALUES ('r1902054','l024','201701456','90','50','54','65','D','N');
INSERT INTO lecturescore VALUES ('r1902055','l024','201701457','90','85','74','83','B','N');
INSERT INTO lecturescore VALUES ('r2001001','l001','201701341','90','72','100','87','B+','N');
INSERT INTO lecturescore VALUES ('r2001002','l001','201701456','80','98','99','92','A','N');
INSERT INTO lecturescore VALUES ('r2001003','l001','201701457','100','94','98','97','A+','N');
INSERT INTO lecturescore VALUES ('r2001004','l001','201701541','90','81','26','66','D+','N');
INSERT INTO lecturescore VALUES ('r2001005','l001','201701621','70','69','89','76','C+','N');
INSERT INTO lecturescore VALUES ('r2001006','l001','201801284','100','100','90','97','A+','N');
INSERT INTO lecturescore VALUES ('r2001007','l001','201801345','90','97','83','90','A','N');
INSERT INTO lecturescore VALUES ('r2001008','l001','201801719','90','78','92','87','B+','N');
INSERT INTO lecturescore VALUES ('r2001009','l001','201801738','90','86','84','87','B+','N');
INSERT INTO lecturescore VALUES ('r2001010','l001','201801748','90','34','40','55','F','Y');
INSERT INTO lecturescore VALUES ('r2001011','l001','201801759','90','82','87','86','B+','N');
INSERT INTO lecturescore VALUES ('r2001012','l001','201801917','100','75','64','80','C+','N');
INSERT INTO lecturescore VALUES ('r2001013','l001','201801967','60','100','100','87','B+','Y');
INSERT INTO lecturescore VALUES ('r2001014','l001','201901122','90','94','93','92','A','N');
INSERT INTO lecturescore VALUES ('r2001015','l001','201901131','90','54','75','73','C','N');
INSERT INTO lecturescore VALUES ('r2001016','l002','201701341','100','77','100','92','A','N');
INSERT INTO lecturescore VALUES ('r2001017','l002','201701456','90','95','72','86','B+','N');
INSERT INTO lecturescore VALUES ('r2001018','l002','201701457','100','82','69','84','B','N');
INSERT INTO lecturescore VALUES ('r2001019','l002','201901211','80','100','100','93','A','N');
INSERT INTO lecturescore VALUES ('r2001020','l002','201901231','90','100','94','95','A','N');
INSERT INTO lecturescore VALUES ('r2001021','l002','201901272','90','93','100','94','A','N');
INSERT INTO lecturescore VALUES ('r2001022','l002','201901273','80','76','66','74','C','N');
INSERT INTO lecturescore VALUES ('r2001023','l002','201901534','90','46','80','72','C','N');
INSERT INTO lecturescore VALUES ('r2001024','l002','201901585','90','55','75','73','C','N');
INSERT INTO lecturescore VALUES ('r2001025','l003','201701341','90','91','79','87','B+','N');
INSERT INTO lecturescore VALUES ('r2001026','l003','201701456','90','90','74','85','B','N');
INSERT INTO lecturescore VALUES ('r2001027','l003','201701457','90','76','100','89','B+','N');
INSERT INTO lecturescore VALUES ('r2001028','l003','201901592','80','93','95','89','B+','N');
INSERT INTO lecturescore VALUES ('r2001029','l003','201901594','110','68','39','72','C','N');
INSERT INTO lecturescore VALUES ('r2001030','l004','201701341','100','70','86','85','B+','N');
INSERT INTO lecturescore VALUES ('r2001031','l004','201701456','100','69','70','80','C+','N');
INSERT INTO lecturescore VALUES ('r2001032','l004','201701457','80','89','80','83','B','N');
INSERT INTO lecturescore VALUES ('r2001033','l004','201901649','80','69','57','69','D+','N');
INSERT INTO lecturescore VALUES ('r2001034','l004','201901848','80','78','71','76','C+','N');
INSERT INTO lecturescore VALUES ('r2001035','l005','201702117','90','78','50','73','C','N');
INSERT INTO lecturescore VALUES ('r2001036','l006','201702359','90','100','95','95','A','N');
INSERT INTO lecturescore VALUES ('r2001037','l007','201702632','80','80','98','86','B+','N');
INSERT INTO lecturescore VALUES ('r2001038','l008','201702813','90','67','96','84','B','N');
INSERT INTO lecturescore VALUES ('r2001039','l009','201702857','80','66','77','74','C','N');
INSERT INTO lecturescore VALUES ('r2001040','l010','201703153','90','42','53','62','D','Y');
INSERT INTO lecturescore VALUES ('r2001041','l011','201703341','90','82','83','85','B','N');
INSERT INTO lecturescore VALUES ('r2001042','l012','201703446','80','64','74','73','C','N');
INSERT INTO lecturescore VALUES ('r2001043','l013','201703739','100','70','88','86','B+','N');
INSERT INTO lecturescore VALUES ('r2001044','l014','201703915','80','73','80','78','C+','N');
INSERT INTO lecturescore VALUES ('r2001045','l015','201704261','70','84','63','72','C','N');
INSERT INTO lecturescore VALUES ('r2001046','l016','201704412','90','79','72','80','B','N');
INSERT INTO lecturescore VALUES ('r2001047','l017','201704854','80','94','89','88','B+','N');
INSERT INTO lecturescore VALUES ('r2001048','l018','201704913','100','91','100','97','A+','N');
INSERT INTO lecturescore VALUES ('r2001049','l019','201704962','80','65','54','66','D+','N');
INSERT INTO lecturescore VALUES ('r2001050','l020','201705171','90','66','52','69','D+','Y');
INSERT INTO lecturescore VALUES ('r2001051','l021','201705523','90','97','100','96','A+','N');
INSERT INTO lecturescore VALUES ('r2001052','l022','201705645','90','74','86','83','B','N');
INSERT INTO lecturescore VALUES ('r2001053','l023','201705756','80','87','100','89','B+','N');
INSERT INTO lecturescore VALUES ('r2001054','l024','201705853','90','68','70','76','C+','N');


--학기성적 termscore
INSERT INTO termscore VALUES ('201901','201701341','10','7','130','3');
INSERT INTO termscore VALUES ('201901','201701456','10','10','130','3.1');
INSERT INTO termscore VALUES ('201901','201701457','10','10','130','2');
INSERT INTO termscore VALUES ('201901','201701541','3','0','130','1.5');
INSERT INTO termscore VALUES ('201901','201701621','3','3','130','3');
INSERT INTO termscore VALUES ('201901','201702117','3','3','130','3.5');
INSERT INTO termscore VALUES ('201901','201702359','2','2','130','2.5');
INSERT INTO termscore VALUES ('201901','201702632','3','3','130','2.5');
INSERT INTO termscore VALUES ('201901','201702813','2','0','130','2.5');
INSERT INTO termscore VALUES ('201901','201702857','3','3','130','2.5');
INSERT INTO termscore VALUES ('201901','201703153','2','2','130','2');
INSERT INTO termscore VALUES ('201901','201703341','3','3','130','3');
INSERT INTO termscore VALUES ('201901','201703446','2','2','130','3.5');
INSERT INTO termscore VALUES ('201901','201703739','3','3','130','1.5');
INSERT INTO termscore VALUES ('201901','201703915','2','0','130','3.5');
INSERT INTO termscore VALUES ('201901','201704261','3','3','130','2');
INSERT INTO termscore VALUES ('201901','201704412','2','2','130','3');
INSERT INTO termscore VALUES ('201901','201704854','3','3','130','1');
INSERT INTO termscore VALUES ('201901','201704913','2','2','130','3');
INSERT INTO termscore VALUES ('201901','201704962','3','0','130','4');
INSERT INTO termscore VALUES ('201901','201705171','2','0','130','1');
INSERT INTO termscore VALUES ('201901','201705523','3','3','130','4');
INSERT INTO termscore VALUES ('201901','201705645','2','0','130','3');
INSERT INTO termscore VALUES ('201901','201705756','3','3','130','2');
INSERT INTO termscore VALUES ('201901','201705853','2','2','130','3.5');
INSERT INTO termscore VALUES ('201901','201801284','3','3','130','4');
INSERT INTO termscore VALUES ('201901','201801345','3','3','130','1.3');
INSERT INTO termscore VALUES ('201901','201801719','3','3','130','0');
INSERT INTO termscore VALUES ('201901','201801738','3','3','130','4');
INSERT INTO termscore VALUES ('201901','201801748','3','3','130','2');
INSERT INTO termscore VALUES ('201901','201801759','3','3','130','1');
INSERT INTO termscore VALUES ('201901','201801917','3','3','130','3.5');
INSERT INTO termscore VALUES ('201901','201801967','3','3','130','2.5');
INSERT INTO termscore VALUES ('201901','201901122','3','3','130','3.5');
INSERT INTO termscore VALUES ('201901','201901131','3','3','130','3');
INSERT INTO termscore VALUES ('201901','201901211','2','2','130','3');
INSERT INTO termscore VALUES ('201901','201901231','2','0','130','4');
INSERT INTO termscore VALUES ('201901','201901272','2','2','130','2');
INSERT INTO termscore VALUES ('201901','201901273','2','2','130','1.5');
INSERT INTO termscore VALUES ('201901','201901534','2','2','130','3');
INSERT INTO termscore VALUES ('201901','201901585','2','2','130','4.5');
INSERT INTO termscore VALUES ('201901','201901592','3','3','130','2');
INSERT INTO termscore VALUES ('201901','201901594','3','0','130','1');
INSERT INTO termscore VALUES ('201901','201901649','2','2','130','2.5');
INSERT INTO termscore VALUES ('201901','201901848','2','2','130','4');
INSERT INTO termscore VALUES ('201902','201701341','10','10','130','3');
INSERT INTO termscore VALUES ('201902','201701456','9','9','130','2.1');
INSERT INTO termscore VALUES ('201902','201701457','10','10','130','2.6');
INSERT INTO termscore VALUES ('201902','201701541','2','2','130','3');
INSERT INTO termscore VALUES ('201902','201701621','2','2','130','4.5');
INSERT INTO termscore VALUES ('201902','201702117','3','3','130','2.5');
INSERT INTO termscore VALUES ('201902','201702359','2','2','130','2.5');
INSERT INTO termscore VALUES ('201902','201702632','5','2','130','2.3');
INSERT INTO termscore VALUES ('201902','201702813','3','3','130','4');
INSERT INTO termscore VALUES ('201902','201702857','2','2','130','3');
INSERT INTO termscore VALUES ('201902','201703153','3','3','130','1');
INSERT INTO termscore VALUES ('201902','201703341','3','3','130','3.5');
INSERT INTO termscore VALUES ('201902','201703446','3','3','130','3.5');
INSERT INTO termscore VALUES ('201902','201703739','3','3','130','1.5');
INSERT INTO termscore VALUES ('201902','201703915','3','3','130','2');
INSERT INTO termscore VALUES ('201902','201704261','3','3','130','2');
INSERT INTO termscore VALUES ('201902','201704412','3','3','130','3.5');
INSERT INTO termscore VALUES ('201902','201704854','3','3','130','1.5');
INSERT INTO termscore VALUES ('201902','201704913','3','3','130','3.5');
INSERT INTO termscore VALUES ('201902','201704962','3','3','130','3.5');
INSERT INTO termscore VALUES ('201902','201705171','3','3','130','3');
INSERT INTO termscore VALUES ('201902','201705523','3','3','130','2.5');
INSERT INTO termscore VALUES ('201902','201705645','3','3','130','3.5');
INSERT INTO termscore VALUES ('201902','201705756','3','3','130','4');
INSERT INTO termscore VALUES ('201902','201705853','3','3','130','2.5');
INSERT INTO termscore VALUES ('201902','201801284','2','2','130','2.5');
INSERT INTO termscore VALUES ('201902','201801345','2','2','130','2.5');
INSERT INTO termscore VALUES ('201902','201801719','2','2','130','3.5');
INSERT INTO termscore VALUES ('201902','201801738','2','2','130','3');
INSERT INTO termscore VALUES ('201902','201801748','3','3','130','4.5');
INSERT INTO termscore VALUES ('201902','201801759','3','3','130','1');
INSERT INTO termscore VALUES ('201902','201801917','2','2','130','4');
INSERT INTO termscore VALUES ('201902','201801967','2','2','130','2.5');
INSERT INTO termscore VALUES ('201902','201901122','3','3','130','3');
INSERT INTO termscore VALUES ('201902','201901131','2','2','130','2');
INSERT INTO termscore VALUES ('201902','201901211','3','3','130','2.5');
INSERT INTO termscore VALUES ('201902','201901231','2','2','130','2.5');
INSERT INTO termscore VALUES ('201902','201901272','3','3','130','2.5');
INSERT INTO termscore VALUES ('201902','201901273','2','2','130','4.5');
INSERT INTO termscore VALUES ('201902','201901534','3','3','130','3');
INSERT INTO termscore VALUES ('201902','201901585','2','2','130','4');
INSERT INTO termscore VALUES ('201902','201901592','3','3','130','2.5');
INSERT INTO termscore VALUES ('201902','201901594','2','2','130','2');
INSERT INTO termscore VALUES ('201902','201901649','3','3','130','2.5');
INSERT INTO termscore VALUES ('201902','201901848','2','2','130','4');
INSERT INTO termscore VALUES ('202001','201701341','10','10','130','3.6');
INSERT INTO termscore VALUES ('202001','201701456','10','10','130','3.3');
INSERT INTO termscore VALUES ('202001','201701457','10','10','130','3.5');
INSERT INTO termscore VALUES ('202001','201701541','3','3','130','1.5');
INSERT INTO termscore VALUES ('202001','201701621','3','3','130','2.5');
INSERT INTO termscore VALUES ('202001','201702117','3','3','130','2');
INSERT INTO termscore VALUES ('202001','201702359','2','2','130','4');
INSERT INTO termscore VALUES ('202001','201702632','3','3','130','3.5');
INSERT INTO termscore VALUES ('202001','201702813','2','2','130','3');
INSERT INTO termscore VALUES ('202001','201702857','3','3','130','2');
INSERT INTO termscore VALUES ('202001','201703153','2','0','130','1');
INSERT INTO termscore VALUES ('202001','201703341','3','3','130','3');
INSERT INTO termscore VALUES ('202001','201703446','2','2','130','2');
INSERT INTO termscore VALUES ('202001','201703739','3','3','130','3.5');
INSERT INTO termscore VALUES ('202001','201703915','2','2','130','2.5');
INSERT INTO termscore VALUES ('202001','201704261','3','3','130','2');
INSERT INTO termscore VALUES ('202001','201704412','2','2','130','3');
INSERT INTO termscore VALUES ('202001','201704854','3','3','130','3.5');
INSERT INTO termscore VALUES ('202001','201704913','2','2','130','4.5');
INSERT INTO termscore VALUES ('202001','201704962','3','3','130','1.5');
INSERT INTO termscore VALUES ('202001','201705171','2','0','130','1.5');
INSERT INTO termscore VALUES ('202001','201705523','3','3','130','4.5');
INSERT INTO termscore VALUES ('202001','201705645','2','2','130','3');
INSERT INTO termscore VALUES ('202001','201705756','3','3','130','3.5');
INSERT INTO termscore VALUES ('202001','201705853','2','2','130','2.5');
INSERT INTO termscore VALUES ('202001','201801284','3','3','130','4.5');
INSERT INTO termscore VALUES ('202001','201801345','3','3','130','4');
INSERT INTO termscore VALUES ('202001','201801719','3','3','130','3.5');
INSERT INTO termscore VALUES ('202001','201801738','3','3','130','3.5');
INSERT INTO termscore VALUES ('202001','201801748','3','0','130','0');
INSERT INTO termscore VALUES ('202001','201801759','3','3','130','3.5');
INSERT INTO termscore VALUES ('202001','201801917','3','3','130','2.5');
INSERT INTO termscore VALUES ('202001','201801967','3','0','130','3.5');
INSERT INTO termscore VALUES ('202001','201901122','3','3','130','4');
INSERT INTO termscore VALUES ('202001','201901131','3','3','130','2');
INSERT INTO termscore VALUES ('202001','201901211','2','2','130','4');
INSERT INTO termscore VALUES ('202001','201901231','2','2','130','4');
INSERT INTO termscore VALUES ('202001','201901272','2','2','130','4');
INSERT INTO termscore VALUES ('202001','201901273','2','2','130','2');
INSERT INTO termscore VALUES ('202001','201901534','2','2','130','2');
INSERT INTO termscore VALUES ('202001','201901585','2','2','130','2');
INSERT INTO termscore VALUES ('202001','201901592','3','3','130','3.5');
INSERT INTO termscore VALUES ('202001','201901594','3','3','130','2');
INSERT INTO termscore VALUES ('202001','201901649','2','2','130','1.5');
INSERT INTO termscore VALUES ('202001','201901848','2','2','130','2.5');


--출결관리

INSERT INTO attendance VALUES ('l001','201701341','90','N','1','1','2','1','1','1','1','1','1','1','1','1','1','1','1','1');
INSERT INTO attendance VALUES ('l001','201701456','80','N','1','1','1','1','1','1','3','3','1','1','2','1','1','2','1','1');
INSERT INTO attendance VALUES ('l001','201701457','100','N','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1');
INSERT INTO attendance VALUES ('l001','201701541','90','N','1','1','2','1','1','1','1','1','1','1','1','1','1','1','1','1');
INSERT INTO attendance VALUES ('l001','201701621','70','N','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1');
INSERT INTO attendance VALUES ('l001','201801284','100','N','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1');
INSERT INTO attendance VALUES ('l001','201801345','90','N','1','1','1','2','1','1','1','1','1','1','1','1','1','1','1','1');
INSERT INTO attendance VALUES ('l001','201801719','90','N','1','1','1','1','1','2','1','1','1','1','1','1','1','1','1','1');
INSERT INTO attendance VALUES ('l001','201801738','90','N','1','1','1','1','1','1','1','2','1','1','1','1','1','1','1','1');
INSERT INTO attendance VALUES ('l001','201801748','90','N','1','1','1','1','1','2','1','1','1','1','1','1','1','1','1','1');
INSERT INTO attendance VALUES ('l001','201801759','90','N','3','1','1','3','1','1','1','1','1','1','1','1','1','1','1','1');
INSERT INTO attendance VALUES ('l001','201801917','100','N','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1');
INSERT INTO attendance VALUES ('l001','201801967','60','Y','1','1','2','1','2','1','2','1','2','1','1','1','1','1','1','1');
INSERT INTO attendance VALUES ('l001','201901122','90','N','1','1','1','3','3','1','1','1','1','1','1','1','1','1','1','1');
INSERT INTO attendance VALUES ('l001','201901131','90','N','1','1','1','1','1','2','1','1','1','1','1','1','1','1','1','1');

INSERT INTO attendance VALUES ('l002','201701341','100','N','1','1','1','1','1','1','1','','','','','','','','','');
INSERT INTO attendance VALUES ('l002','201701456','90','N','1','1','1','1','1','1','1','','','','','','','','','');
INSERT INTO attendance VALUES ('l002','201701457','100','N','1','1','1','1','1','1','1','','','','','','','','','');
INSERT INTO attendance VALUES ('l002','201901211','80','N','1','1','1','1','1','1','1','','','','','','','','','');
INSERT INTO attendance VALUES ('l002','201901231','90','N','1','1','1','1','1','1','1','','','','','','','','','');
INSERT INTO attendance VALUES ('l002','201901272','90','N','1','1','1','1','1','1','1','','','','','','','','','');
INSERT INTO attendance VALUES ('l002','201901273','80','N','1','1','1','1','1','1','1','','','','','','','','','');
INSERT INTO attendance VALUES ('l002','201901534','90','N','1','1','1','1','1','1','1','','','','','','','','','');
INSERT INTO attendance VALUES ('l002','201901585','90','N','1','1','1','1','1','1','1','','','','','','','','','');


-- 학사일정


INSERT INTO schedule VALUES ('s101','A003','2019학년도 1학기 복학 신청','2019','02','12','2019','02','15' );
INSERT INTO schedule VALUES ('s102','A003','2019학년도 1학기 등록','2019','02','18','2020','02','20');
INSERT INTO schedule VALUES ('s103','A003',' 1학기 휴학 신청','2019','02','21','2019','02','23');
INSERT INTO schedule VALUES ('s104','A003',' 신입생 입학식','2019','02','15','2019','02','15');
INSERT INTO schedule VALUES ('s105','A003',' 1학기 수강신청','2019','02','24','2019','02','27');
INSERT INTO schedule VALUES ('s106','A003','2019학년도 1학기 개강','2019','03','02','2019','03','03');
INSERT INTO schedule VALUES ('s107','A003','1학기 수강신청 정정','2019','03','02','2019','03','05');
INSERT INTO schedule VALUES ('s108','A003','1학기 중간 평가기간','2019','04','06','2019','04','20');
INSERT INTO schedule VALUES ('s109','A003',' 2학기 교내장학금 신청','2019','05','10','2019','05','10');
INSERT INTO schedule VALUES ('s110','A003','1학기 기말 평가기간','2019','06','01','2019','06','20');
INSERT INTO schedule VALUES ('s111','A003','1학기 종강','2019','06','12','2019','06','13');
INSERT INTO schedule VALUES ('s112','A003','1학기 성적입력 및 정정','2019','06','12','2019','06','25');
INSERT INTO schedule VALUES ('s113','A003','1학기 공휴일로 인한 수업보강기간','2019','06','15','2019','06','18');
INSERT INTO schedule VALUES ('s114','A003','개교기념일','2019','06','28','2019','06','28');
INSERT INTO schedule VALUES ('s115','A003','2019학년도 2학기 복학 신청','2019','07','27','2019','08','02');
INSERT INTO schedule VALUES ('s116','A003','후기 학위수여식','2019','08','21','2019','08','22');
INSERT INTO schedule VALUES ('s117','A003',' 2학기 수강신청','2019','08','24','2019','08','27');
INSERT INTO schedule VALUES ('s118','A003',' 2019년 2학기 등록 및 휴학 신청','2019','08','25','2019','08','28');
INSERT INTO schedule VALUES ('s119','A003','2학기 개강','2019','09','01','2019','09','01');
INSERT INTO schedule VALUES ('s120','A003','수강신청 정정','2019','09','07','2019','09','07');
INSERT INTO schedule VALUES ('s121','A003','2학기 중간 평가 기간','2019','09','28','2019','10','13');
INSERT INTO schedule VALUES ('s122','A003','2020학년도 1학기 교내장학금 신청','2019','11','01','2019','11','13');
INSERT INTO schedule VALUES ('s123','A003',' 2학기 기말 평가 기간','2019','11','30','2019','12','20');
INSERT INTO schedule VALUES ('s124','A003',' 2학기 종강','2019','12','14','2019','12','14');
INSERT INTO schedule VALUES ('s125','A003','2학기 성적입력 및 정정','2019','12','15','2019','01','04');
INSERT INTO schedule VALUES ('s126','A003','2학기 공휴일로 인한 수업보강기간','2019','12','16','2019','12','18');
INSERT INTO schedule VALUES ('s127','A005','2020학년도 신입생 정시 입학전형','2020','01','10','2020','02','01');
INSERT INTO schedule VALUES ('s128','A005','2020학년도 1학기 복학 신청','2020','02','12','2020','02','15');
INSERT INTO schedule VALUES ('s129','A005','2020학년도 1학기 등록','2020','02','18','2020','02','20');
INSERT INTO schedule VALUES ('s130','A005',' 1학기 휴학 신청','2020','02','21','2020','02','23');
INSERT INTO schedule VALUES ('s131','A005',' 신입생 입학식','2020','02','15','2020','02','15');
INSERT INTO schedule VALUES ('s132','A005',' 1학기 수강신청','2020','02','24','2020','02','27');
INSERT INTO schedule VALUES ('s133','A005','2020학년도 1학기 개강','2020','03','02','2020','03','02');
INSERT INTO schedule VALUES ('s134','A005','1학기 수강신청 정정','2020','03','02','2020','03','05');
INSERT INTO schedule VALUES ('s135','A005','1학기 중간 평가기간','2020','04','06','2020','04','20');
INSERT INTO schedule VALUES ('s136','A005',' 2학기 교내장학금 신청','2020','05','10','2020','05','10');
INSERT INTO schedule VALUES ('s137','A005','1학기 기말 평가기간','2020','06','01','2020','06','20');
INSERT INTO schedule VALUES ('s138','A005','1학기 종강','2020','06','12','2020','06','12');
INSERT INTO schedule VALUES ('s139','A005','1학기 성적입력 및 정정','2020','06','12','2020','06','25');
INSERT INTO schedule VALUES ('s140','A005','1학기 공휴일로 인한 수업보강기간','2020','06','15','2020','06','18');
INSERT INTO schedule VALUES ('s141','A005','개교기념일','2020','06','28','2020','06','28');
INSERT INTO schedule VALUES ('s142','A005','2020학년도 2학기 복학 신청','2020','07','27','2020','08','02');
INSERT INTO schedule VALUES ('s143','A005','후기 학위수여식','2020','08','21','2020','08','21');
INSERT INTO schedule VALUES ('s144','A005',' 2학기 수강신청','2020','08','24','2020','08','27');
INSERT INTO schedule VALUES ('s145','A005',' 2020년 2학기 등록 및 휴학 신청','2020','08','25','2020','08','28');
INSERT INTO schedule VALUES ('s146','A005','2학기 개강','2020','09','01','2020','09','01');
INSERT INTO schedule VALUES ('s147','A005','수강신청 정정','2020','09','01','2020','09','07');
INSERT INTO schedule VALUES ('s148','A005','2학기 중간 평가 기간','2020','09','28','2020','10','13');
INSERT INTO schedule VALUES ('s149','A005','2021학년도 1학기 교내장학금 신청','2020','10','20','2020','10','27');
INSERT INTO schedule VALUES ('s150','A005',' 2학기 기말 평가 기간','2020','11','30','2020','12','20');
INSERT INTO schedule VALUES ('s156','A005',' 2학기 종강','2020','12','14','2020','12','14');
INSERT INTO schedule VALUES ('s157','A005','2학기 성적입력 및 정정','2020','12','15','2020','01','04');
INSERT INTO schedule VALUES ('s158','A005','2학기 공휴일로 인한 수업보강기간','2020','12','16','2020','12','18');
INSERT INTO schedule VALUES ('s159','A005','2021학년도 신입생 정시 입학전형','2021','01','10','2021','02','01');
INSERT INTO schedule VALUES ('s160','A005','2021학년도 1학기 복학 신청','2021','01','27','2021','02','03');


-- 공지사항
INSERT INTO notice VALUES ('10001','A002','2020학년도 제2학기 비전임교원(초빙/겸임/강사) 초빙','김기수','20/07/10','2020학년도 제2학기 신규 임용할 비전임교원(초빙/겸임/강사)을 다음과 같이 모십니다.\n<인터넷 지원서 입력기간>\n2020.07.22(수) ~ 07.26(일) 오후 23:00까지\n<서류접수(지원자 전원)>\n2020.07.27(월) ~ 07.28(화) 오후 14:00까지(2일간)\n자세한 사항은 아래 사이트에서 확인하시기 바랍니다.','','',50);

CREATE OR REPLACE VIEW AtndnView
as select semester, lcode, lname, studentid, majorname, studentname, category, lpoint, ltime, le.room, le.capacity, professorname, absent3, week1, week2, week3, week4,
week5, week6, week7, week8, week9, week10, week11, week12, week13, week14, week15, week16
from student s
join major m using (majorno)
join lapplication la using (studentid)
join lecture le using (lcode)
join professor using (professorid)
left join attendance using (lcode, studentid);

CREATE OR REPLACE VIEW LScoreView
as SELECT STUDENTID, STUDENTNAME, MAJORNAME, LCODE, LNAME, CATEGORY, ATNDNSCORE, MIDSCORE, FINALSCORE, TOTALSCORE, GRADE
FROM STUDENT
JOIN MAJOR USING (MAJORNO)
JOIN LECTURESCORE USING (STUDENTID)
JOIN LECTURE USING (LCODE);

select s.id, s.name, majorname, lcode, lname, category, ATNDNSCORE, MIDSCORE, FINALSCORE, TOTALSCORE, GRADE
from student s
join major using (majorno)
join lecturescore ls on (s.id=ls.id)
join lecture using (lcode);

commit;



