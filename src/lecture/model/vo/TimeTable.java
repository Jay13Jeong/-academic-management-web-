package lecture.model.vo;
//시간표
public class TimeTable implements java.io.Serializable{
	private static final long serialVersionUID = 345456456;
	private String time;
	private String name;
	private String day;
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDay() {
		return day;
	}
	public void setDay(String day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "TimeTable [time=" + time + ", name=" + name + ", day=" + day + "]";
	}
	public TimeTable(String time, String name, String day) {
		super();
		this.time = time;
		this.name = name;
		this.day = day;
	}
	public TimeTable() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
