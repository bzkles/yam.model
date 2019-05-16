package tr.edu.izu.yam.core.entype;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import tr.edu.izu.yam.core.base.IEntity;

@Entity
@Table(name = "core_entity_type")
public class CoreEntityType implements Serializable,IEntity {

	private static final long serialVersionUID = -7331889990411975802L;

    @Id
	@Basic
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Basic
	@Column(name = "ENTITYTYPE", nullable = false)
	private String entity_type;

	@Basic
	@Column(name = "CLASS_NAME", nullable = false)
	private Long class_name;

	@Basic
	@Column(name = "OWENER_ID", nullable = false)
	private int owner_id;

	@Basic
	@Column(name = "ORDERNO", nullable = false)
	private int orderno;

	@Basic
	@Column(name = "NAME", nullable = false)
	private String name;

	@Basic
	@Column(name = "STATUS", nullable = false)
	private String status;

	@Basic
	@Column(name = "DESCRIPTION", nullable = false)
	private String description;

	@Basic
	@Column(name = "STRING_ELEMENTS", nullable = false)
	private String string_elements;

	@Basic
	@Column(name = "SEARCHRESTRICTION", nullable = false)
	private String search_restriction;

		public Long getId() {
			return id;
		}
		
		public void setId(Long id) {
			this.id = id;
		}

		public String getEntity_type() {
			return entity_type;
		}

		public void setEntity_type(String entity_type) {
			this.entity_type = entity_type;
		}

		public Long getClass_name() {
			return class_name;
		}

		public void setClass_name(Long class_name) {
			this.class_name = class_name;
		}

		public int getOwner_id() {
			return owner_id;
		}

		public void setOwner_id(int owner_id) {
			this.owner_id = owner_id;
		}

		public int getOrderno() {
			return orderno;
		}

		public void setOrderno(int orderno) {
			this.orderno = orderno;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getString_elements() {
			return string_elements;
		}

		public void setString_elements(String string_elements) {
			this.string_elements = string_elements;
		}

		public String getSearch_restriction() {
			return search_restriction;
		}

		public void setSearch_restriction(String search_restriction) {
			this.search_restriction = search_restriction;
		}

}
