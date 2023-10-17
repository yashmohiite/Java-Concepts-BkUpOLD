//6/1/23
import java.util.*;
public class Bill {
	private Date date;
	private double total;
	private double cgst;
	private double sgst;
	private double finaltotal;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getCgst() {
		return cgst;
	}
	public void setCgst(double cgst) {
		this.cgst = cgst;
	}
	public double getSgst() {
		return sgst;
	}
	public void setSgst(double sgst) {
		this.sgst = sgst;
	}
	public double getFinaltotal() {
		return finaltotal;
	}
	public void setFinaltotal(double finaltotal) {
		this.finaltotal = finaltotal;
	}
	public Bill(Date date, double total, double cgst, double sgst, double finaltotal) {
		super();
		this.date = date;
		this.total = total;
		this.cgst = cgst;
		this.sgst = sgst;
		this.finaltotal = finaltotal;
	}
}
