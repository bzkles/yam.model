package tr.edu.izu.yam.core.user;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "core_user")
public class CoreUser implements Serializable {

	private static final long serialVersionUID = -8985506282453260487L;

	@Id
 	@Basic
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Basic
	@Column(name = "NAME", nullable = false)
	private String name;

	@Basic
	@Column(name = "SURNAME", nullable = false)
	private String surname;

	@Basic
	@Column(name = "EMAIL", nullable = false)
	private String email;

	@Basic
	@Column(name = "USERNAME", nullable = false)
	private String userName;

	@Basic
	@Column(name = "ROLE", nullable = false)
	private String role;

	@Basic
	@Column(name = "CLEAR", nullable = false)
	private String clear;

	@Basic
	@Column(name = "PASSWORD", nullable = false)
	private String encrypted;

	@Basic
	@Column(name = "EXPIREDATE", nullable = true)
	private Date expireDate;

	@Basic
	@Column(name = "STATUS", nullable = false)
	private int status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getClear() {
		return clear;
	}

	public void setClear(String clear) {
		this.clear = clear;
	}

	public String getEncrypted() {
		return encrypted;
	}

	public void setEncrypted(String encrypted) {
		this.encrypted = encrypted;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
	

}
