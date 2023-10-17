//22/11/22
public class Course {
	private int crsId;
	private String crsNm;
	private String dur;
	private double fees;
	public Course(int crsId, String crsNm, String dur, double fees) {
		super();
		this.crsId = crsId;
		this.crsNm = crsNm;
		this.dur = dur;
		this.fees = fees;
	}
	public int getCrsId() {
		return crsId;
	}
	public void setCrsId(int crsId) {
		this.crsId = crsId;
	}
	public String getCrsNm() {
		return crsNm;
	}
	public void setCrsNm(String crsNm) {
		this.crsNm = crsNm;
	}
	public String getDur() {
		return dur;
	}
	public void setDur(String dur) {
		this.dur = dur;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
}
