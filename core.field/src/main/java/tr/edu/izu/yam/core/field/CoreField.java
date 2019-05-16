package tr.edu.izu.yam.core.field;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "core_field")

public class CoreField implements Serializable {

	private static final long serialVersionUID = 3404264584217623947L;

	@Id
	@Basic
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Basic
	@Column(name = "NAME", nullable = true)
	private String name;
	
	@Basic
	@Column(name = "ENTITY_TYPE_ID", nullable = true)
	private Integer entity_type_id;
	//ss
	@Basic
	@Column(name = "WITDTH", nullable = true)
	private String width;
	
	@Basic
	@Column(name = "HEIGHT", nullable = true)
	private String height;
	
	@Basic
	@Column(name = "VISIBLE", nullable = true)
	private Integer visible;
	
	@Basic
	@Column(name = "COLUMN_INDEX", nullable = true)
	private Integer column_index;
	
	@Basic
	@Column(name = "LABEL_TEXT", nullable = true)
	private String label_text;
	
	@Basic
	@Column(name = "REF_TYPE_ID", nullable = true)
	private Integer ref_type_id;
	
	@Basic
	@Column(name = "TYPE", nullable = true)
	private String type;
	
	@Basic
	@Column(name = "REF_COLUMN", nullable = true)
	private String ref_column;
	
	@Basic
	@Column(name = "ORDERNO", nullable = true)
	private Integer orderno;
	
	@Basic
	@Column(name = "DEPENDS", nullable = true)
	private String depends;
	
	@Basic
	@Column(name = "SEARCHABLE", nullable = true)
	private String searchable;
	
	@Basic
	@Column(name = "NOT_NULL", nullable = true)
	private String not_null;
	
	@Basic
	@Column(name = "VALIDATE", nullable = true)
	private String validate;
	
//
	@Basic
	@Column(name = "VALIDATION_REGEX", nullable = true)
	private String validation_regex;
	
	@Basic
	@Column(name = "VALIDATION_ERROR_MESSAGE", nullable = true)
	private String validation_error_message;
	
	@Basic
	@Column(name = "DETAIL_ICON", nullable = true)
	private String detail_icon;
	
	@Basic
	@Column(name = "VISIBLE_AS_COLUMN", nullable = true)
	private String visible_as_column;
	
	@Basic
	@Column(name = "GENERATED", nullable = true)
	private String generated;
	
	@Basic
	@Column(name = "REPORT_ALIAS", nullable = true)
	private String report_alias;

	@Basic
	@Column(name = "PARENT_TYPE_ID", nullable = true)
	private Integer parent_type_id;
	
	@Basic
	@Column(name = "READONLY", nullable = true)
	private String readonly;
	
	@Basic
	@Column(name = "DEFAULT_VALUE", nullable = true)
	private String default_value;
	
	@Basic
	@Column(name = "NEED_DEFAULT_VALUE", nullable = true)
	private String need_default_value;

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

	public Integer getEntity_type_id() {
		return entity_type_id;
	}

	public void setEntity_type_id(Integer entity_type_id) {
		this.entity_type_id = entity_type_id;
	}

	public String getWidth() {
		return width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public Integer getVisible() {
		return visible;
	}

	public void setVisible(Integer visible) {
		this.visible = visible;
	}

	public Integer getColumn_index() {
		return column_index;
	}

	public void setColumn_index(Integer column_index) {
		this.column_index = column_index;
	}

	public String getLabel_text() {
		return label_text;
	}

	public void setLabel_text(String label_text) {
		this.label_text = label_text;
	}

	public Integer getRef_type_id() {
		return ref_type_id;
	}

	public void setRef_type_id(Integer ref_type_id) {
		this.ref_type_id = ref_type_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getRef_column() {
		return ref_column;
	}

	public void setRef_column(String ref_column) {
		this.ref_column = ref_column;
	}

	public Integer getOrderno() {
		return orderno;
	}

	public void setOrderno(Integer orderno) {
		this.orderno = orderno;
	}

	public String getDepends() {
		return depends;
	}

	public void setDepends(String depends) {
		this.depends = depends;
	}

	public String getSearchable() {
		return searchable;
	}

	public void setSearchable(String searchable) {
		this.searchable = searchable;
	}

	public String getNot_null() {
		return not_null;
	}

	public void setNot_null(String not_null) {
		this.not_null = not_null;
	}

	public String getValidate() {
		return validate;
	}

	public void setValidate(String validate) {
		this.validate = validate;
	}

	public String getValidation_regex() {
		return validation_regex;
	}

	public void setValidation_regex(String validation_regex) {
		this.validation_regex = validation_regex;
	}

	public String getValidation_error_message() {
		return validation_error_message;
	}

	public void setValidation_error_message(String validation_error_message) {
		this.validation_error_message = validation_error_message;
	}

	public String getDetail_icon() {
		return detail_icon;
	}

	public void setDetail_icon(String detail_icon) {
		this.detail_icon = detail_icon;
	}

	public String getVisible_as_column() {
		return visible_as_column;
	}

	public void setVisible_as_column(String visible_as_column) {
		this.visible_as_column = visible_as_column;
	}

	public String getGenerated() {
		return generated;
	}

	public void setGenerated(String generated) {
		this.generated = generated;
	}

	public String getReport_alias() {
		return report_alias;
	}

	public void setReport_alias(String report_alias) {
		this.report_alias = report_alias;
	}

	public Integer getParent_type_id() {
		return parent_type_id;
	}

	public void setParent_type_id(Integer parent_type_id) {
		this.parent_type_id = parent_type_id;
	}

	public String getReadonly() {
		return readonly;
	}

	public void setReadonly(String readonly) {
		this.readonly = readonly;
	}

	public String getDefault_value() {
		return default_value;
	}

	public void setDefault_value(String default_value) {
		this.default_value = default_value;
	}

	public String getNeed_default_value() {
		return need_default_value;
	}

	public void setNeed_default_value(String need_default_value) {
		this.need_default_value = need_default_value;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
