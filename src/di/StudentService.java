package di;

public class StudentService {

	private StudentDao studentDao;
	private Integer sasa;

	public Integer getSasa() {
		return sasa;
	}

	public void setSasa(Integer sasa) {
		this.sasa = sasa;
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void addStudent() {
		this.studentDao.addStudent();
	}
}
