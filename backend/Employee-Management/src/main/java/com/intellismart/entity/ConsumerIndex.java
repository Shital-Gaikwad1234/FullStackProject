package com.intellismart.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CunsumerIndex")
public class ConsumerIndex {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
    private int	Sequence_No; 
	private String Discom ;
	private String Zone;
	private String Circle;
	private String Division;
	private String Sub_Division;
	private String Substation_Code;
    private String Feeder_Name;
    private String Consumer_Number;
	private String Landmark;
	private String Consumer_Name;
	private String Address;
	private String Area;
	private Long Mobile_Number;
	private String Email_ID;
	private String Billing_Type;
	private String Old_Meter_Number;
	private String Old_Meter_Manufacturer;
	private int Load_Unit;
	private String Meter_Location;
	private String Old_Meter_Status;
	private int Old_meter_Current_Kva_CI;
	private int Old_meter_Current_Kvah_CI;
	private int  Old_meter_Current_Kwh_CI;
	private int Old_Meter_Phase;
	private String Survey_done_by;
	private String Contractor_Name;
	private Date CI_Date;
	private String CI_Remarks;

	public ConsumerIndex() {
		// TODO Auto-generated constructor stub
		super();
	}

	public ConsumerIndex(int sequence_No, String discom, String zone, String circle, String division,
			String sub_Division, String substation_Code, String feeder_Name, String consumer_Number, String landmark,
			String consumer_Name, String address, String area, Long mobile_Number, String email_ID, String billing_Type,
			String old_Meter_Number, String old_Meter_Manufacturer, int load_Unit, String meter_Location,
			String old_Meter_Status, int old_meter_Current_Kva_CI, int old_meter_Current_Kvah_CI,
			int old_meter_Current_Kwh_CI, int old_Meter_Phase, String survey_done_by, String contractor_Name,
			Date cI_Date, String cI_Remarks) {
		super();
		Sequence_No = sequence_No;
		Discom = discom;
		Zone = zone;
		Circle = circle;
		Division = division;
		Sub_Division = sub_Division;
		Substation_Code = substation_Code;
		Feeder_Name = feeder_Name;
		Consumer_Number = consumer_Number;
		Landmark = landmark;
		Consumer_Name = consumer_Name;
		Address = address;
		Area = area;
		Mobile_Number = mobile_Number;
		Email_ID = email_ID;
		Billing_Type = billing_Type;
		Old_Meter_Number = old_Meter_Number;
		Old_Meter_Manufacturer = old_Meter_Manufacturer;
		Load_Unit = load_Unit;
		Meter_Location = meter_Location;
		Old_Meter_Status = old_Meter_Status;
		Old_meter_Current_Kva_CI = old_meter_Current_Kva_CI;
		Old_meter_Current_Kvah_CI = old_meter_Current_Kvah_CI;
		Old_meter_Current_Kwh_CI = old_meter_Current_Kwh_CI;
		Old_Meter_Phase = old_Meter_Phase;
		Survey_done_by = survey_done_by;
		Contractor_Name = contractor_Name;
		CI_Date = cI_Date;
		CI_Remarks = cI_Remarks;
	}

	public int getSequence_No() {
		return Sequence_No;
	}

	public void setSequence_No(int sequence_No) {
		Sequence_No = sequence_No;
	}

	public String getDiscom() {
		return Discom;
	}

	public void setDiscom(String discom) {
		Discom = discom;
	}

	public String getZone() {
		return Zone;
	}

	public void setZone(String zone) {
		Zone = zone;
	}

	public String getCircle() {
		return Circle;
	}

	public void setCircle(String circle) {
		Circle = circle;
	}

	public String getDivision() {
		return Division;
	}

	public void setDivision(String division) {
		Division = division;
	}

	public String getSub_Division() {
		return Sub_Division;
	}

	public void setSub_Division(String sub_Division) {
		Sub_Division = sub_Division;
	}

	public String getSubstation_Code() {
		return Substation_Code;
	}

	public void setSubstation_Code(String substation_Code) {
		Substation_Code = substation_Code;
	}

	public String getFeeder_Name() {
		return Feeder_Name;
	}

	public void setFeeder_Name(String feeder_Name) {
		Feeder_Name = feeder_Name;
	}

	public String getConsumer_Number() {
		return Consumer_Number;
	}

	public void setConsumer_Number(String consumer_Number) {
		Consumer_Number = consumer_Number;
	}

	public String getLandmark() {
		return Landmark;
	}

	public void setLandmark(String landmark) {
		Landmark = landmark;
	}

	public String getConsumer_Name() {
		return Consumer_Name;
	}

	public void setConsumer_Name(String consumer_Name) {
		Consumer_Name = consumer_Name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public Long getMobile_Number() {
		return Mobile_Number;
	}

	public void setMobile_Number(Long mobile_Number) {
		Mobile_Number = mobile_Number;
	}

	public String getEmail_ID() {
		return Email_ID;
	}

	public void setEmail_ID(String email_ID) {
		Email_ID = email_ID;
	}

	public String getBilling_Type() {
		return Billing_Type;
	}

	public void setBilling_Type(String billing_Type) {
		Billing_Type = billing_Type;
	}

	public String getOld_Meter_Number() {
		return Old_Meter_Number;
	}

	public void setOld_Meter_Number(String old_Meter_Number) {
		Old_Meter_Number = old_Meter_Number;
	}

	public String getOld_Meter_Manufacturer() {
		return Old_Meter_Manufacturer;
	}

	public void setOld_Meter_Manufacturer(String old_Meter_Manufacturer) {
		Old_Meter_Manufacturer = old_Meter_Manufacturer;
	}

	public int getLoad_Unit() {
		return Load_Unit;
	}

	public void setLoad_Unit(int load_Unit) {
		Load_Unit = load_Unit;
	}

	public String getMeter_Location() {
		return Meter_Location;
	}

	public void setMeter_Location(String meter_Location) {
		Meter_Location = meter_Location;
	}

	public String getOld_Meter_Status() {
		return Old_Meter_Status;
	}

	public void setOld_Meter_Status(String old_Meter_Status) {
		Old_Meter_Status = old_Meter_Status;
	}

	public int getOld_meter_Current_Kva_CI() {
		return Old_meter_Current_Kva_CI;
	}

	public void setOld_meter_Current_Kva_CI(int old_meter_Current_Kva_CI) {
		Old_meter_Current_Kva_CI = old_meter_Current_Kva_CI;
	}

	public int getOld_meter_Current_Kvah_CI() {
		return Old_meter_Current_Kvah_CI;
	}

	public void setOld_meter_Current_Kvah_CI(int old_meter_Current_Kvah_CI) {
		Old_meter_Current_Kvah_CI = old_meter_Current_Kvah_CI;
	}

	public int getOld_meter_Current_Kwh_CI() {
		return Old_meter_Current_Kwh_CI;
	}

	public void setOld_meter_Current_Kwh_CI(int old_meter_Current_Kwh_CI) {
		Old_meter_Current_Kwh_CI = old_meter_Current_Kwh_CI;
	}

	public int getOld_Meter_Phase() {
		return Old_Meter_Phase;
	}

	public void setOld_Meter_Phase(int old_Meter_Phase) {
		Old_Meter_Phase = old_Meter_Phase;
	}

	public String getSurvey_done_by() {
		return Survey_done_by;
	}

	public void setSurvey_done_by(String survey_done_by) {
		Survey_done_by = survey_done_by;
	}

	public String getContractor_Name() {
		return Contractor_Name;
	}

	public void setContractor_Name(String contractor_Name) {
		Contractor_Name = contractor_Name;
	}

	public Date getCI_Date() {
		return CI_Date;
	}

	public void setCI_Date(Date cI_Date) {
		CI_Date = cI_Date;
	}

	public String getCI_Remarks() {
		return CI_Remarks;
	}

	public void setCI_Remarks(String cI_Remarks) {
		CI_Remarks = cI_Remarks;
	}

	@Override
	public String toString() {
		return "ConsumerIndex [Sequence_No=" + Sequence_No + ", Discom=" + Discom + ", Zone=" + Zone + ", Circle="
				+ Circle + ", Division=" + Division + ", Sub_Division=" + Sub_Division + ", Substation_Code="
				+ Substation_Code + ", Feeder_Name=" + Feeder_Name + ", Consumer_Number=" + Consumer_Number
				+ ", Landmark=" + Landmark + ", Consumer_Name=" + Consumer_Name + ", Address=" + Address + ", Area="
				+ Area + ", Mobile_Number=" + Mobile_Number + ", Email_ID=" + Email_ID + ", Billing_Type="
				+ Billing_Type + ", Old_Meter_Number=" + Old_Meter_Number + ", Old_Meter_Manufacturer="
				+ Old_Meter_Manufacturer + ", Load_Unit=" + Load_Unit + ", Meter_Location=" + Meter_Location
				+ ", Old_Meter_Status=" + Old_Meter_Status + ", Old_meter_Current_Kva_CI=" + Old_meter_Current_Kva_CI
				+ ", Old_meter_Current_Kvah_CI=" + Old_meter_Current_Kvah_CI + ", Old_meter_Current_Kwh_CI="
				+ Old_meter_Current_Kwh_CI + ", Old_Meter_Phase=" + Old_Meter_Phase + ", Survey_done_by="
				+ Survey_done_by + ", Contractor_Name=" + Contractor_Name + ", CI_Date=" + CI_Date + ", CI_Remarks="
				+ CI_Remarks + "]";
	}
	
	
}
