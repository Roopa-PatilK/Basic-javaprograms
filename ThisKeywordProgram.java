package pack;

public class ThisKeywordProgram {
	
	int ctdid;
	String name;
	double salary;
	void CandidateDetails(int ctdid,String name,double salary)
	{
		//System.out.println(ctdid);
		//System.out.println(name);
		//System.out.println(salary);
		this.ctdid=ctdid;
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {
		ThisKeywordProgram t1=new ThisKeywordProgram();
		t1.CandidateDetails(12,"Roopa",980000);
		System.out.println(t1.ctdid);//will give default global variable value before using this keyword
		System.out.println(t1.name);
		System.out.println(t1.salary);

	}

}
