package emp_dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Emp_dto {
	@Id
	private String email;
	private String name;
	private int pwd;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPwd() {
		return pwd;
	}
	public void setPwd(int pwd) {
		this.pwd = pwd;
	}
}
