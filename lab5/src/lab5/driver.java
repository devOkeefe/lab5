package lab5;

public class driver {
	public static void main(String[] args) {
		student s = new undergraduate();
		student g = new graduate();
		student e = new exchange();
		s.print();
		g.print();
		e.print();
		
	}
}
class student {
private String major;
private double gpa;
private int creditHours;
private String year;


student(String major, double gpa, int creditHours, String year){
	this.major=major;
	this.gpa=gpa;
	this.creditHours=creditHours;
	this.year=year;
	
	
}
student(){
	this.major="cs";
	this.gpa=4.2;
	this.creditHours=40;
	
	
}
public void setYear(String year) {
	this.year=year;
}
public void setMajor(String Major){
	this.major=major;
}
public void setGpa(double gpa){
	this.gpa=gpa;
}
public void setcreditHours(int creditHours){
	this.creditHours=creditHours;
}
public String getMajor(){
	return major;
}
public double getGpa(){
	return gpa;
}
public double getCreditHours(){
	return creditHours;
}
public String getYear(){
	if (creditHours<32){
		this.year = "Freshman";	
	}
	else if(creditHours>32&&creditHours<64){
		this.year = "Sophmore";
	}
	else if(creditHours>64&&creditHours<96){
		this.year = "Junior";
	}
	else{
		this.year = "Senior";
	}
	return year;
	}
public void print(){
	System.out.println("GPA is " +getGpa()+", year is "+getYear()+" credit hours are "+getCreditHours() +" and major is "+getMajor());
}
}
class graduate extends student{
	private String degree;
	private String concentration;
	private int years;
	graduate(String degree, String concentration, int years){
		this.degree=degree;
		this.concentration=concentration;
		this.years=years;
		
		
	}
	graduate(){
		this.degree="masters";
		this.concentration="cs";
		this.years=5;
		
		
	}
	public void setDegree(String degree){
		this.degree=degree;
	}
	public void setConcentration(String concentration){
		this.concentration=concentration;
	
	}
	public void setYears(int years){
		this.years=years;
	}
	public String getConcentration(){
		return concentration;
	}
	public String getDegree(){
		return degree;
	}
	public int getYears(){
		return years;
	}
	public void print(){
		System.out.println("Concentration is "+getConcentration()+" degree is "+getDegree()+" and years spent is "+getYears());
	}
	
}
class undergraduate extends student{
	
	undergraduate(boolean honors){
		this.honors=honors;
	}
	undergraduate(){
		this.honors=true;
	}
	private boolean honors;
	private String status;
	public void setStatus(String status){
		this.status=status;
	}
	public void setHonors(boolean honors){
		this.honors=honors;
		
	}
	public String isHonors(){
		if (honors==true){
			status = "Honors";
		}
		else {
			status = "no honors";
		}
		return status;
	}
	
	public void print(){
		super.print();
		System.out.println(isHonors());
	}
}
class exchange extends undergraduate{
	
	exchange(String country, String year){
		this.country=country;
		this.year=year;
	}
	exchange(){
		this.country="USA";
		this.year="Spring 2019";
	}
	private String country;
	private String year;
	public void setCountry(String country){
		this.country=country;
	}
	public void setYear(String year){
		this.year=year;
	}
	public String getCountry(){
		return country;
	}
	public String getYear() {
		return year;
	}
	public void print(){
		System.out.println("GPA is " +getGpa()+", year is "+getYear()+" credit hours are "+getCreditHours() +" major is "+getMajor() + " and Country is "+getCountry());
	}
}

