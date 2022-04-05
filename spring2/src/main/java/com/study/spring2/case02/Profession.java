package com.study.spring2.case02;
import java.util.List; 
import java.util.Map;
import java.util.Set; 
import java.util.function.ToIntFunction;
public class Profession { 
	private Integer id;
	private String name;
	private Set<StudentOfClazz> studentOfClazzs;
	private List<String> subjects;
	private Map<String, Integer> salary;
	public Profession() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Profession(Integer id, String name, Set<StudentOfClazz> studentOfClazzs) {
		super();
		this.id = id;
		this.name = name;
		this.studentOfClazzs = studentOfClazzs;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<StudentOfClazz> getStudentOfClazzs() {
		return studentOfClazzs;
	}
	public void setStudentOfClazzs(Set<StudentOfClazz> studentOfClazzs) {
		this.studentOfClazzs = studentOfClazzs;
	}
	
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public Map<String, Integer> getSalary() {
		return salary;
	}
	public void setSalary(Map<String, Integer> salary) {
		this.salary = salary;
	}
	
	public int getTotalCredits() {
		int total=0;
		if(studentOfClazzs != null ) { // 如果有學生就執行
			ToIntFunction<StudentOfClazz> fun1 = (s) -> s.getClazzs().stream().mapToInt(c -> c.getCredit()).sum();
			total = studentOfClazzs.stream().mapToInt(fun1).sum();
		}		
		return total;
	}
	
	@Override
	public String toString() {
		return "Profession [id=" + id + ", name=" + name + ", studentOfClazzs=" + studentOfClazzs + ", subjects="
				+ subjects + ", salary=" + salary + "]";
	}
}
