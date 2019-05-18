package tr.edu.izu.yam.core.log;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Id;
import javax.persistence.Table;

import tr.edu.izu.yam.core.base.IEntity;


@Entity
@Table (name="core_log")


public class CoreLog implements Serializable, IEntity {


	
	private static final long serialVersionUID = -659819251336193013L;
	
	
//	@SequenceGenerator(name="SeqGenerator", sequenceName = "core_log_id_seq")
//	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SeqGenerator")
	
	@Id
	@Basic
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	@Basic
	@Column(name = "TYPE", nullable = false)
	private String type;
	
	@Basic 
	@Column(name = "USER_NAME", nullable = false)
	private String user_name;
	
	@Basic 
	@Column(name = "IP", nullable = false)
	private String ip;
	
	@Basic
	@Column(name = "VIEW_NAME", nullable = false)
	private String view_name;
	
	@Basic
	@Column(name = "ENTITY_CLASS" , nullable = false)
	private String entity_class;
	
	@Basic 
	@Column(name = "ACTION" , nullable = false)
	private String action;
	
	@Basic 
	@Column(name = "CREATE_DATE", nullable = false)
	private String create_date;
	
	@Basic
	@Column(name = "SNAPSHOT" , nullable = false)
	private String snapshot;
	
	@Basic 
	@Column(name = "RESULT" , nullable = false)
	private String result;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getView_name() {
		return view_name;
	}

	public void setView_name(String view_name) {
		this.view_name = view_name;
	}

	public String getEntity_class() {
		return entity_class;
	}

	public void setEntity_class(String entity_class) {
		this.entity_class = entity_class;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getCreate_date() {
		return create_date;
	}

	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

	public String getSnapshot() {
		return snapshot;
	}

	public void setSnapshot(String snapshot) {
		this.snapshot = snapshot;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	
	
}
