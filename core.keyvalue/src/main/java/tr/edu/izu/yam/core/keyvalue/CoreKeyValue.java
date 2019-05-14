package tr.edu.izu.yam.core.keyvalue;

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
@Table(name = "core_keyvalue")
public class CoreKeyValue implements Serializable {

	private static final long serialVersionUID = 3404264584217623947L;

	@Id
	@Basic
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Basic
	@Column(name = "ORDERNO", nullable = true)
	private Integer orderNo;

	@Basic
	@Column(name = "CODE", nullable = true)
	private String code;

	@Basic
	@Column(name = "VALUE", nullable = true)
	private String value;

	@Basic
	@Column(name = "SHORTVALUE", nullable = true)
	private String shortValue;

	@Basic
	@Column(name = "STATUS", nullable = true)
	private String status;

	@Basic
	@Column(name = "CK_01", nullable = true)
	//Buraya(referans olan yerlere) hibernate mappingler ile ekleyerek tekrar commit edilecek
	private CoreKeyValue ck_01;

	@Basic
	@Column(name = "CK_02", nullable = true)
	private CoreKeyValue ck_02;

	@Basic
	@Column(name = "CK_03", nullable = true)
	private CoreKeyValue ck_03;

	@Basic
	@Column(name = "CK_04", nullable = true)
	private CoreKeyValue ck_04;

	@Basic
	@Column(name = "CK_05", nullable = true)
	private CoreKeyValue ck_05;

	@Basic
	@Column(name = "CK_06", nullable = true)
	private CoreKeyValue ck_06;

	@Basic
	@Column(name = "CK_07", nullable = true)
	private CoreKeyValue ck_07;

	@Basic
	@Column(name = "CK_08", nullable = true)
	private CoreKeyValue ck_08;

	@Basic
	@Column(name = "CK_09", nullable = true)
	private CoreKeyValue ck_09;

	@Basic
	@Column(name = "CK_10", nullable = true)
	private CoreKeyValue ck_10;

	@Basic
	@Column(name = "DESC_01", nullable = true)
	private String desc_01;

	@Basic
	@Column(name = "DESC_02", nullable = true)
	private String desc_02;

	@Basic
	@Column(name = "DESC_03", nullable = true)
	private String desc_03;

	@Basic
	@Column(name = "DESC_04", nullable = true)
	private String desc_04;

	@Basic
	@Column(name = "DESC_05", nullable = true)
	private String desc_05;

	@Basic
	@Column(name = "DESC_06", nullable = true)
	private String desc_06;

	@Basic
	@Column(name = "DESC_07", nullable = true)
	private String desc_07;

	@Basic
	@Column(name = "DESC_08", nullable = true)
	private String desc_08;

	@Basic
	@Column(name = "DESC_09", nullable = true)
	private String desc_09;

	@Basic
	@Column(name = "DESC_10", nullable = true)
	private String desc_10;

	@Basic
	@Column(name = "INT_01", nullable = true)
	private Long int_01;

	@Basic
	@Column(name = "INT_02", nullable = true)
	private Long int_02;

	@Basic
	@Column(name = "INT_03", nullable = true)
	private Integer int_03;

	@Basic
	@Column(name = "INT_04", nullable = true)
	private Integer int_04;

	@Basic
	@Column(name = "INT_05", nullable = true)
	private Integer int_05;

	@Basic
	@Column(name = "INT_06", nullable = true)
	private Integer int_06;

	@Basic
	@Column(name = "INT_07", nullable = true)
	private Integer int_07;

	@Basic
	@Column(name = "INT_08", nullable = true)
	private Integer int_08;

	@Basic
	@Column(name = "INT_09", nullable = true)
	private Integer int_09;

	@Basic
	@Column(name = "INT_10", nullable = true)
	private Integer int_10;

	@Basic
	@Column(name = "MON_01", nullable = true)
	private BigDecimal mon_01;

	@Basic
	@Column(name = "MON_02", nullable = true)
	private BigDecimal mon_02;

	@Basic
	@Column(name = "MON_03", nullable = true)
	private BigDecimal mon_03;

	@Basic
	@Column(name = "MON_04", nullable = true)
	private BigDecimal mon_04;

	@Basic
	@Column(name = "MON_05", nullable = true)
	private BigDecimal mon_05;

	@Basic
	@Column(name = "MON_06", nullable = true)
	private BigDecimal mon_06;

	@Basic
	@Column(name = "MON_07", nullable = true)
	private BigDecimal mon_07;

	@Basic
	@Column(name = "MON_08", nullable = true)
	private BigDecimal mon_08;

	@Basic
	@Column(name = "MON_09", nullable = true)
	private BigDecimal mon_09;

	@Basic
	@Column(name = "MON_10", nullable = true)
	private BigDecimal mon_10;

	@Basic
	@Column(name = "DATE_01", nullable = true)
	private Date date_01;

	@Basic
	@Column(name = "DATE_02", nullable = true)
	private Date date_02;

	@Basic
	@Column(name = "DATE_03", nullable = true)
	private Date date_03;

	@Basic
	@Column(name = "DATE_04", nullable = true)
	private Date date_04;

	@Basic
	@Column(name = "DATE_05", nullable = true)
	private Date date_05;

	@Basic
	@Column(name = "CK_OWNER", nullable = true)
	private CoreKeyValue ck_owner;

	@Basic
	@Column(name = "ENTITY_TYPE_ID", nullable = true)
	private Long entity_type_id;

	@Basic
	@Column(name = "DESCRIPTION", nullable = true)
	private String description;

	@Basic
	@Column(name = "BYTE_01", nullable = true)
	private byte[] byte_01;

	@Basic
	@Column(name = "BYTE_01_NAME", nullable = true)
	private String byte_01_name;

	@Basic
	@Column(name = "VALUE_01", nullable = true)
	private String value_01;

	@Basic
	@Column(name = "VALUE_02", nullable = true)
	private String value_02;

	@Basic
	@Column(name = "VALUE_03", nullable = true)
	private String value_03;

	@Basic
	@Column(name = "VALUE_04", nullable = true)
	private String value_04;

	@Basic
	@Column(name = "VALUE_05", nullable = true)
	private String value_05;

	@Basic
	@Column(name = "VALUE_06", nullable = true)
	private String value_06;

	@Basic
	@Column(name = "VALUE_07", nullable = true)
	private String value_07;

	@Basic
	@Column(name = "VALUE_08", nullable = true)
	private String value_08;

	@Basic
	@Column(name = "VALUE_09", nullable = true)
	private String value_09;

	@Basic
	@Column(name = "VALUE_10", nullable = true)
	private String value_10;

	@Basic
	@Column(name = "LOCKED", nullable = true)
	private String locked;

	@Basic
	@Column(name = "CK_11", nullable = true)
	private CoreKeyValue ck_11;

	@Basic
	@Column(name = "CK_12", nullable = true)
	private CoreKeyValue ck_12;

	@Basic
	@Column(name = "CK_13", nullable = true)
	private CoreKeyValue ck_13;

	@Basic
	@Column(name = "CK_14", nullable = true)
	private CoreKeyValue ck_14;

	@Basic
	@Column(name = "CK_15", nullable = true)
	private CoreKeyValue ck_15;

	@Basic
	@Column(name = "BOOL_1", nullable = true)
	private Boolean bool_1;

	@Basic
	@Column(name = "BOOL_2", nullable = true)
	private Boolean bool_2;

	@Basic
	@Column(name = "BOOL_3", nullable = true)
	private Boolean bool_3;

	@Basic
	@Column(name = "BOOL_4", nullable = true)
	private Boolean bool_4;

	@Basic
	@Column(name = "BOOL_5", nullable = true)
	private Boolean bool_5;

	@Basic
	@Column(name = "BOOL_6", nullable = true)
	private Boolean bool_6;

	@Basic
	@Column(name = "BOOL_7", nullable = true)
	private Boolean bool_7;

	@Basic
	@Column(name = "BOOL_8", nullable = true)
	private Boolean bool_8;

	@Basic
	@Column(name = "BOOL_9", nullable = true)
	private Boolean bool_9;

	@Basic
	@Column(name = "BOOL_10", nullable = true)
	private Boolean bool_10;

	@Basic
	@Column(name = "BYTE_02", nullable = true)
	private byte[] byte_02;

	@Basic
	@Column(name = "BYTE_02_NAME", nullable = true)
	private String byte_02_name;

	@Basic
	@Column(name = "BOOL_11", nullable = true)
	private String bool_11;

	@Basic
	@Column(name = "DATE_06", nullable = true)
	private Date date_06;

	@Basic
	@Column(name = "DATE_07", nullable = true)
	private Date date_07;

	@Basic
	@Column(name = "DATE_08", nullable = true)
	private Date date_08;

	@Basic
	@Column(name = "BYTE_03", nullable = true)
	private byte[] byte_03;

	@Basic
	@Column(name = "BYTE_03_NAME", nullable = true)
	private String byte_03_name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getShortValue() {
		return shortValue;
	}

	public void setShortValue(String shortValue) {
		this.shortValue = shortValue;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public CoreKeyValue getCk_01() {
		return ck_01;
	}

	public void setCk_01(CoreKeyValue ck_01) {
		this.ck_01 = ck_01;
	}

	public CoreKeyValue getCk_02() {
		return ck_02;
	}

	public void setCk_02(CoreKeyValue ck_02) {
		this.ck_02 = ck_02;
	}

	public CoreKeyValue getCk_03() {
		return ck_03;
	}

	public void setCk_03(CoreKeyValue ck_03) {
		this.ck_03 = ck_03;
	}

	public CoreKeyValue getCk_04() {
		return ck_04;
	}

	public void setCk_04(CoreKeyValue ck_04) {
		this.ck_04 = ck_04;
	}

	public CoreKeyValue getCk_05() {
		return ck_05;
	}

	public void setCk_05(CoreKeyValue ck_05) {
		this.ck_05 = ck_05;
	}

	public CoreKeyValue getCk_06() {
		return ck_06;
	}

	public void setCk_06(CoreKeyValue ck_06) {
		this.ck_06 = ck_06;
	}

	public CoreKeyValue getCk_07() {
		return ck_07;
	}

	public void setCk_07(CoreKeyValue ck_07) {
		this.ck_07 = ck_07;
	}

	public CoreKeyValue getCk_08() {
		return ck_08;
	}

	public void setCk_08(CoreKeyValue ck_08) {
		this.ck_08 = ck_08;
	}

	public CoreKeyValue getCk_09() {
		return ck_09;
	}

	public void setCk_09(CoreKeyValue ck_09) {
		this.ck_09 = ck_09;
	}

	public CoreKeyValue getCk_10() {
		return ck_10;
	}

	public void setCk_10(CoreKeyValue ck_10) {
		this.ck_10 = ck_10;
	}

	public String getDesc_01() {
		return desc_01;
	}

	public void setDesc_01(String desc_01) {
		this.desc_01 = desc_01;
	}

	public String getDesc_02() {
		return desc_02;
	}

	public void setDesc_02(String desc_02) {
		this.desc_02 = desc_02;
	}

	public String getDesc_03() {
		return desc_03;
	}

	public void setDesc_03(String desc_03) {
		this.desc_03 = desc_03;
	}

	public String getDesc_04() {
		return desc_04;
	}

	public void setDesc_04(String desc_04) {
		this.desc_04 = desc_04;
	}

	public String getDesc_05() {
		return desc_05;
	}

	public void setDesc_05(String desc_05) {
		this.desc_05 = desc_05;
	}

	public String getDesc_06() {
		return desc_06;
	}

	public void setDesc_06(String desc_06) {
		this.desc_06 = desc_06;
	}

	public String getDesc_07() {
		return desc_07;
	}

	public void setDesc_07(String desc_07) {
		this.desc_07 = desc_07;
	}

	public String getDesc_08() {
		return desc_08;
	}

	public void setDesc_08(String desc_08) {
		this.desc_08 = desc_08;
	}

	public String getDesc_09() {
		return desc_09;
	}

	public void setDesc_09(String desc_09) {
		this.desc_09 = desc_09;
	}

	public String getDesc_10() {
		return desc_10;
	}

	public void setDesc_10(String desc_10) {
		this.desc_10 = desc_10;
	}

	public long getInt_01() {
		return int_01;
	}

	public void setInt_01(long int_01) {
		this.int_01 = int_01;
	}

	public long getInt_02() {
		return int_02;
	}

	public void setInt_02(long int_02) {
		this.int_02 = int_02;
	}

	public int getInt_03() {
		return int_03;
	}

	public void setInt_03(int int_03) {
		this.int_03 = int_03;
	}

	public int getInt_04() {
		return int_04;
	}

	public void setInt_04(int int_04) {
		this.int_04 = int_04;
	}

	public int getInt_05() {
		return int_05;
	}

	public void setInt_05(int int_05) {
		this.int_05 = int_05;
	}

	public int getInt_06() {
		return int_06;
	}

	public void setInt_06(int int_06) {
		this.int_06 = int_06;
	}

	public int getInt_07() {
		return int_07;
	}

	public void setInt_07(int int_07) {
		this.int_07 = int_07;
	}

	public int getInt_08() {
		return int_08;
	}

	public void setInt_08(int int_08) {
		this.int_08 = int_08;
	}

	public int getInt_09() {
		return int_09;
	}

	public void setInt_09(int int_09) {
		this.int_09 = int_09;
	}

	public int getInt_10() {
		return int_10;
	}

	public void setInt_10(int int_10) {
		this.int_10 = int_10;
	}

	public BigDecimal getMon_01() {
		return mon_01;
	}

	public void setMon_01(BigDecimal mon_01) {
		this.mon_01 = mon_01;
	}

	public BigDecimal getMon_02() {
		return mon_02;
	}

	public void setMon_02(BigDecimal mon_02) {
		this.mon_02 = mon_02;
	}

	public BigDecimal getMon_03() {
		return mon_03;
	}

	public void setMon_03(BigDecimal mon_03) {
		this.mon_03 = mon_03;
	}

	public BigDecimal getMon_04() {
		return mon_04;
	}

	public void setMon_04(BigDecimal mon_04) {
		this.mon_04 = mon_04;
	}

	public BigDecimal getMon_05() {
		return mon_05;
	}

	public void setMon_05(BigDecimal mon_05) {
		this.mon_05 = mon_05;
	}

	public BigDecimal getMon_06() {
		return mon_06;
	}

	public void setMon_06(BigDecimal mon_06) {
		this.mon_06 = mon_06;
	}

	public BigDecimal getMon_07() {
		return mon_07;
	}

	public void setMon_07(BigDecimal mon_07) {
		this.mon_07 = mon_07;
	}

	public BigDecimal getMon_08() {
		return mon_08;
	}

	public void setMon_08(BigDecimal mon_08) {
		this.mon_08 = mon_08;
	}

	public BigDecimal getMon_09() {
		return mon_09;
	}

	public void setMon_09(BigDecimal mon_09) {
		this.mon_09 = mon_09;
	}

	public BigDecimal getMon_10() {
		return mon_10;
	}

	public void setMon_10(BigDecimal mon_10) {
		this.mon_10 = mon_10;
	}

	public Date getDate_01() {
		return date_01;
	}

	public void setDate_01(Date date_01) {
		this.date_01 = date_01;
	}

	public Date getDate_02() {
		return date_02;
	}

	public void setDate_02(Date date_02) {
		this.date_02 = date_02;
	}

	public Date getDate_03() {
		return date_03;
	}

	public void setDate_03(Date date_03) {
		this.date_03 = date_03;
	}

	public Date getDate_04() {
		return date_04;
	}

	public void setDate_04(Date date_04) {
		this.date_04 = date_04;
	}

	public Date getDate_05() {
		return date_05;
	}

	public void setDate_05(Date date_05) {
		this.date_05 = date_05;
	}

	public CoreKeyValue getCk_owner() {
		return ck_owner;
	}

	public void setCk_owner(CoreKeyValue ck_owner) {
		this.ck_owner = ck_owner;
	}

	public Long getEntity_type_id() {
		return entity_type_id;
	}

	public void setEntity_type_id(Long entity_type_id) {
		this.entity_type_id = entity_type_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getByte_01() {
		return byte_01;
	}

	public void setByte_01(byte[] byte_01) {
		this.byte_01 = byte_01;
	}

	public String getByte_01_name() {
		return byte_01_name;
	}

	public void setByte_01_name(String byte_01_name) {
		this.byte_01_name = byte_01_name;
	}

	public String getValue_01() {
		return value_01;
	}

	public void setValue_01(String value_01) {
		this.value_01 = value_01;
	}

	public String getValue_02() {
		return value_02;
	}

	public void setValue_02(String value_02) {
		this.value_02 = value_02;
	}

	public String getValue_03() {
		return value_03;
	}

	public void setValue_03(String value_03) {
		this.value_03 = value_03;
	}

	public String getValue_04() {
		return value_04;
	}

	public void setValue_04(String value_04) {
		this.value_04 = value_04;
	}

	public String getValue_05() {
		return value_05;
	}

	public void setValue_05(String value_05) {
		this.value_05 = value_05;
	}

	public String getValue_06() {
		return value_06;
	}

	public void setValue_06(String value_06) {
		this.value_06 = value_06;
	}

	public String getValue_07() {
		return value_07;
	}

	public void setValue_07(String value_07) {
		this.value_07 = value_07;
	}

	public String getValue_08() {
		return value_08;
	}

	public void setValue_08(String value_08) {
		this.value_08 = value_08;
	}

	public String getValue_09() {
		return value_09;
	}

	public void setValue_09(String value_09) {
		this.value_09 = value_09;
	}

	public String getValue_10() {
		return value_10;
	}

	public void setValue_10(String value_10) {
		this.value_10 = value_10;
	}

	public String getLocked() {
		return locked;
	}

	public void setLocked(String locked) {
		this.locked = locked;
	}

	public CoreKeyValue getCk_11() {
		return ck_11;
	}

	public void setCk_11(CoreKeyValue ck_11) {
		this.ck_11 = ck_11;
	}

	public CoreKeyValue getCk_12() {
		return ck_12;
	}

	public void setCk_12(CoreKeyValue ck_12) {
		this.ck_12 = ck_12;
	}

	public CoreKeyValue getCk_13() {
		return ck_13;
	}

	public void setCk_13(CoreKeyValue ck_13) {
		this.ck_13 = ck_13;
	}

	public CoreKeyValue getCk_14() {
		return ck_14;
	}

	public void setCk_14(CoreKeyValue ck_14) {
		this.ck_14 = ck_14;
	}

	public CoreKeyValue getCk_15() {
		return ck_15;
	}

	public void setCk_15(CoreKeyValue ck_15) {
		this.ck_15 = ck_15;
	}

	public Boolean isBool_1() {
		return bool_1;
	}

	public void setBool_1(Boolean bool_1) {
		this.bool_1 = bool_1;
	}

	public Boolean isBool_2() {
		return bool_2;
	}

	public void setBool_2(Boolean bool_2) {
		this.bool_2 = bool_2;
	}

	public Boolean isBool_3() {
		return bool_3;
	}

	public void setBool_3(Boolean bool_3) {
		this.bool_3 = bool_3;
	}

	public Boolean isBool_4() {
		return bool_4;
	}

	public void setBool_4(Boolean bool_4) {
		this.bool_4 = bool_4;
	}

	public Boolean isBool_5() {
		return bool_5;
	}

	public void setBool_5(Boolean bool_5) {
		this.bool_5 = bool_5;
	}

	public Boolean isBool_6() {
		return bool_6;
	}

	public void setBool_6(Boolean bool_6) {
		this.bool_6 = bool_6;
	}

	public Boolean isBool_7() {
		return bool_7;
	}

	public void setBool_7(Boolean bool_7) {
		this.bool_7 = bool_7;
	}

	public Boolean isBool_8() {
		return bool_8;
	}

	public void setBool_8(Boolean bool_8) {
		this.bool_8 = bool_8;
	}

	public Boolean isBool_9() {
		return bool_9;
	}

	public void setBool_9(Boolean bool_9) {
		this.bool_9 = bool_9;
	}

	public Boolean isBool_10() {
		return bool_10;
	}

	public void setBool_10(Boolean bool_10) {
		this.bool_10 = bool_10;
	}

	public byte[] getByte_02() {
		return byte_02;
	}

	public void setByte_02(byte[] byte_02) {
		this.byte_02 = byte_02;
	}

	public String getByte_02_name() {
		return byte_02_name;
	}

	public void setByte_02_name(String byte_02_name) {
		this.byte_02_name = byte_02_name;
	}

	public String getBool_11() {
		return bool_11;
	}

	public void setBool_11(String bool_11) {
		this.bool_11 = bool_11;
	}

	public Date getDate_06() {
		return date_06;
	}

	public void setDate_06(Date date_06) {
		this.date_06 = date_06;
	}

	public Date getDate_07() {
		return date_07;
	}

	public void setDate_07(Date date_07) {
		this.date_07 = date_07;
	}

	public Date getDate_08() {
		return date_08;
	}

	public void setDate_08(Date date_08) {
		this.date_08 = date_08;
	}

	public byte[] getByte_03() {
		return byte_03;
	}

	public void setByte_03(byte[] byte_03) {
		this.byte_03 = byte_03;
	}

	public String getByte_03_name() {
		return byte_03_name;
	}

	public void setByte_03_name(String byte_03_name) {
		this.byte_03_name = byte_03_name;
	}
}
