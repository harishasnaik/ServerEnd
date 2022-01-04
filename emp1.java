package Q1;

public class emp1 {
	String empName, empJob;
	int empNo;

	public emp1(String empName, String empJob, int empNo) {
		super();
		this.empName = empName;
		this.empJob = empJob;
		this.empNo = empNo;
	}

	public String showInfo() {
		return "Employee [empName=" + empName + ", empNo=" + empNo + ", empJob=" + empJob + "]";
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empJob=" + empJob + ", empNo=" + empNo + "]";
	}
	
	public int getEmpNo(){
		return empNo;
	}

}
