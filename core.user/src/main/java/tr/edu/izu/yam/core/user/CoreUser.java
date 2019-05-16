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
	@Column(name = "PASSWORD", nullable = false)
	private String encrypted;

	@Basic
	@Column(name = "ROLE", nullable = false)
	private String role;
	
	@Basic
	@Column(name = "USERNAME", nullable = false)
	private String userName;

	@Basic
	@Column(name = "CLEAR", nullable = false)
	private String clear;

	@Basic
	@Column(name = "STATUS", nullable = false)
	private int status;
	
	@Basic
	@Column(name = "EXPIREDATE", nullable = true)
	private Date expireDate;
}
