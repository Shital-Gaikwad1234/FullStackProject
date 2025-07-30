package com.intellismart.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MeterInstallation")
public class MeterInstallation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	@JoinColumn(name = "consumer_index_no", referencedColumnName = "Sequence_No")
	private ConsumerIndex consumerIndex ;
	private String LT_Pole_Condtion_For_Service_Cable;
	private String Is_Armoured_Service_Cable_To_Be_Installed;
    private String Neutral_Availability;
    private String Village_Name;
    private String Village_Census_Code;
    private String Gram_Panchayat;
    private String Block;
    private String Street_Name;
    private String Old_Meter_Billing_Type;
    private String Scan_Barcode_Sticker_Placed_On_Old_Meter;
    private String Old_Meter_Number_MI;
    private String New_Meter_Number;
    private String Mismatch_Between_Old_Meter_Number_Of_CI_And_MI;
    private String New_Meter_Billing_Type;
    private String Meter_Communication_Type;
    private String Meter_CT_Ratio;
    private String Meter_PT_Ratio;
    private String Line_CT_Ratio;
    private String Line_PT_Ratio;
    private String Network_Provider_Name_SIM1;
    private String Signal_Strength_SIM1;
    private String Signal_Category_SIM1;
    private String Network_Type1;
    private String Network_Provider_Name_SIM2;
    private String Signal_Strength_SIM2;
    private String Signal_Category_SIM2;
    private String Network_Type2;
    private String Length_Of_Service_Cable_In_Meter;
    private String Cable_Type;
    private String Old_Meter_Current_KWH_MI;
    private String Mismatch_Between_Reading_Of_CI_And_MI;
    private int Old_Meter_Current_KVAH_MI;
    private int Old_Meter_KVA_MI;
    private int New_Meter_Current_KWH;
    private int New_Meter_Current_KVAH;
    private String New_Meter_Phase;
    private String Meter_Installation_Type;
    private String Meter_Box_Seal_Number1;
    private String Meter_Box_Seal_Number2;
    private String NIC_Card1;
    private String NIC_Card2;
    private String NIC_Seal_Number1;
    private String NIC_Seal_Type;
    private String Meter_Body_Seal_Type;
    private String Terminal_Seal_Number1;
    private String Terminal_Seal_Number2 ;
    private String Meter_Box_Seal_Type;
    private String MRN_No;
    private String Page_No;
    private String New_Meter_Manufacturer;
    private String Error_Code_Error_Description;
    private String Latitude;
    private String Longitude;
    private String Updated_By;
    private Date New_Meter_Installed_Date;
    private String Status;
    private Date QC_Contractor_Approved_Date;
    private String Approved_By_QC_Contractor;
    private Date IntelliSmart_Approved_Date;
    private String Approved_By_IntelliSmart;
    private Date Discom_Approved_Date;
    private String Approved_By_Discom;
    private String QC_Contractor_Rejected_Remarks;
    private Date QC_Contractor_Rejected_Date;
    private String Rejected_By_QC_Contractor;
    private String IntelliSmart_Rejected_Remarks;
    private Date IntelliSmart_Rejected_Date;
    private String IntelliSmart_Rejected_By;
    private String Discom_Rejected_Remarks;
    private Date Discom_Rejected_Date;
    private String Rejected_By_Discom;
    private int No_Of_Rejections;
    private String Area;
    private String  CT_Chamber_Seal_No;
    
    
    public MeterInstallation() {
		// TODO Auto-generated constructor stub
	}
    //Constructor 
	public MeterInstallation(int id, ConsumerIndex consumerIndex, String lT_Pole_Condtion_for_Service_cable,
			String is_Armoured_Service_Cable_To_be_Installed, String neutral_Availability, String village_Name,
			String village_Census_code, String gram_Panchayat, String block, String street_Name,
			String old_Meter_Billing_Type, String scan_Barcode_Sticker_placed_on_Old_Meter, String old_Meter_Number_MI,
			String new_Meter_Number, String mismatch_betwwen_old_meter_number_of_CI_and_MI,
			String new_Meter_Billing_Type, String meter_Communication_Type, String meter_CT_Ratio,
			String meter_PT_Ratio, String line_CT_Ratio, String line_PT_Ratio, String network_Provider_Name_SIM1,
			String signal_Strength_SIM1, String signal_Category_SIM1, String network_Type1,
			String network_Provider_Name_SIM2, String signal_Strength_SIM2, String signal_Category_SIM2,
			String network_Type2, String length_Of_Service_Cable_in_Meter, String cable_Type,
			String old_Meter_Current_Kwh_MI, String mismatch_Between_Reading_of_CI_and_MI,
			int old_Meter_Current_KVah_MI, int old_Meter_Kva_MI, int new_Meter_Current_KWH, int new_Meter_current_KVAH,
			String new_Meter_Phase, String meter_Installation_Type, String meter_Box_seal_Number1,
			String meter_Box_Seal_Number2, String nIC_Card1, String nIC_Card2, String nIC_Seal_Number1,
			String nIC_Seal_Type, String meter_Body_Seal_Type, String terminal_Seal_Number1,
			String terminal_Seal_Number2, String meter_Box_Seal_Type, String mRN_No, String page_No,
			String new_Meter_Manufacturer, String error_Code_Error_Description, String latitude, String longitude,
			String updated_By, Date new_Meter_Installed_Date, String status, Date qC_Contractor_Approved_Date,
			String approved_By_QC_Contractor, Date intelliSmart_Approved_Date, String approved_By_IntelliSmart,
			Date discom_Approved_Date, String approved_By_Discom, String qC_Contractor_Rejected_Remarks,
			Date qC_Contractor_Rejected_Date, String rejected_By_QC_Contractor, String intelliSmart_Rejected_Remarks,
			Date intelliSmart_Rejected_Date, String intelliSmar_Rejected_By, String discom_Rejected_Remarks,
			Date discom_Rejected_Date, String rejected_By_Discom, int no_Of_Rejections, String area,
			String cT_Chamber_Seal_No) {
		super();
		this.id = id;
		this.consumerIndex = consumerIndex;
		LT_Pole_Condtion_For_Service_Cable = lT_Pole_Condtion_for_Service_cable;
		Is_Armoured_Service_Cable_To_Be_Installed = is_Armoured_Service_Cable_To_be_Installed;
		Neutral_Availability = neutral_Availability;
		Village_Name = village_Name;
		Village_Census_Code = village_Census_code;
		Gram_Panchayat = gram_Panchayat;
		Block = block;
		Street_Name = street_Name;
		Old_Meter_Billing_Type = old_Meter_Billing_Type;
		Scan_Barcode_Sticker_Placed_On_Old_Meter = scan_Barcode_Sticker_placed_on_Old_Meter;
		Old_Meter_Number_MI = old_Meter_Number_MI;
		New_Meter_Number = new_Meter_Number;
		Mismatch_Between_Old_Meter_Number_Of_CI_And_MI = mismatch_betwwen_old_meter_number_of_CI_and_MI;
		New_Meter_Billing_Type = new_Meter_Billing_Type;
		Meter_Communication_Type = meter_Communication_Type;
		Meter_CT_Ratio = meter_CT_Ratio;
		Meter_PT_Ratio = meter_PT_Ratio;
		Line_CT_Ratio = line_CT_Ratio;
		Line_PT_Ratio = line_PT_Ratio;
		Network_Provider_Name_SIM1 = network_Provider_Name_SIM1;
		Signal_Strength_SIM1 = signal_Strength_SIM1;
		Signal_Category_SIM1 = signal_Category_SIM1;
		Network_Type1 = network_Type1;
		Network_Provider_Name_SIM2 = network_Provider_Name_SIM2;
		Signal_Strength_SIM2 = signal_Strength_SIM2;
		Signal_Category_SIM2 = signal_Category_SIM2;
		Network_Type2 = network_Type2;
		Length_Of_Service_Cable_In_Meter = length_Of_Service_Cable_in_Meter;
		Cable_Type = cable_Type;
		Old_Meter_Current_KWH_MI = old_Meter_Current_Kwh_MI;
		Mismatch_Between_Reading_Of_CI_And_MI = mismatch_Between_Reading_of_CI_and_MI;
		Old_Meter_Current_KVAH_MI = old_Meter_Current_KVah_MI;
		Old_Meter_KVA_MI = old_Meter_Kva_MI;
		New_Meter_Current_KWH = new_Meter_Current_KWH;
		New_Meter_Current_KVAH = new_Meter_current_KVAH;
		New_Meter_Phase = new_Meter_Phase;
		Meter_Installation_Type = meter_Installation_Type;
		Meter_Box_Seal_Number1 = meter_Box_seal_Number1;
		Meter_Box_Seal_Number2 = meter_Box_Seal_Number2;
		NIC_Card1 = nIC_Card1;
		NIC_Card2 = nIC_Card2;
		NIC_Seal_Number1 = nIC_Seal_Number1;
		NIC_Seal_Type = nIC_Seal_Type;
		Meter_Body_Seal_Type = meter_Body_Seal_Type;
		Terminal_Seal_Number1 = terminal_Seal_Number1;
		Terminal_Seal_Number2 = terminal_Seal_Number2;
		Meter_Box_Seal_Type = meter_Box_Seal_Type;
		MRN_No = mRN_No;
		Page_No = page_No;
		New_Meter_Manufacturer = new_Meter_Manufacturer;
		Error_Code_Error_Description = error_Code_Error_Description;
		this.Latitude = latitude;
		this.Longitude = longitude;
		Updated_By = updated_By;
		New_Meter_Installed_Date = new_Meter_Installed_Date;
		Status = status;
		QC_Contractor_Approved_Date = qC_Contractor_Approved_Date;
		Approved_By_QC_Contractor = approved_By_QC_Contractor;
		IntelliSmart_Approved_Date = intelliSmart_Approved_Date;
		Approved_By_IntelliSmart = approved_By_IntelliSmart;
		Discom_Approved_Date = discom_Approved_Date;
		Approved_By_Discom = approved_By_Discom;
		QC_Contractor_Rejected_Remarks = qC_Contractor_Rejected_Remarks;
		QC_Contractor_Rejected_Date = qC_Contractor_Rejected_Date;
		Rejected_By_QC_Contractor = rejected_By_QC_Contractor;
		IntelliSmart_Rejected_Remarks = intelliSmart_Rejected_Remarks;
		IntelliSmart_Rejected_Date = intelliSmart_Rejected_Date;
		IntelliSmart_Rejected_By = intelliSmar_Rejected_By;
		Discom_Rejected_Remarks = discom_Rejected_Remarks;
		Discom_Rejected_Date = discom_Rejected_Date;
		Rejected_By_Discom = rejected_By_Discom;
		No_Of_Rejections = no_Of_Rejections;
		Area = area;
		CT_Chamber_Seal_No = cT_Chamber_Seal_No;
	}
	
	//getter setter 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ConsumerIndex getConsumerIndex() {
		return consumerIndex;
	}

	public void setConsumerIndex(ConsumerIndex consumerIndex) {
		this.consumerIndex = consumerIndex;
	}

	public String getLT_Pole_Condtion_for_Service_cable() {
		return LT_Pole_Condtion_For_Service_Cable;
	}

	public void setLT_Pole_Condtion_for_Service_cable(String lT_Pole_Condtion_for_Service_cable) {
		LT_Pole_Condtion_For_Service_Cable = lT_Pole_Condtion_for_Service_cable;
	}

	public String getIs_Armoured_Service_Cable_To_be_Installed() {
		return Is_Armoured_Service_Cable_To_Be_Installed;
	}

	public void setIs_Armoured_Service_Cable_To_be_Installed(String is_Armoured_Service_Cable_To_be_Installed) {
		Is_Armoured_Service_Cable_To_Be_Installed = is_Armoured_Service_Cable_To_be_Installed;
	}

	public String getNeutral_Availability() {
		return Neutral_Availability;
	}

	public void setNeutral_Availability(String neutral_Availability) {
		Neutral_Availability = neutral_Availability;
	}

	public String getVillage_Name() {
		return Village_Name;
	}

	public void setVillage_Name(String village_Name) {
		Village_Name = village_Name;
	}

	public String getVillage_Census_code() {
		return Village_Census_Code;
	}

	public void setVillage_Census_code(String village_Census_code) {
		Village_Census_Code = village_Census_code;
	}

	public String getGram_Panchayat() {
		return Gram_Panchayat;
	}

	public void setGram_Panchayat(String gram_Panchayat) {
		Gram_Panchayat = gram_Panchayat;
	}

	public String getBlock() {
		return Block;
	}

	public void setBlock(String block) {
		Block = block;
	}

	public String getStreet_Name() {
		return Street_Name;
	}

	public void setStreet_Name(String street_Name) {
		Street_Name = street_Name;
	}

	public String getOld_Meter_Billing_Type() {
		return Old_Meter_Billing_Type;
	}

	public void setOld_Meter_Billing_Type(String old_Meter_Billing_Type) {
		Old_Meter_Billing_Type = old_Meter_Billing_Type;
	}

	public String getScan_Barcode_Sticker_placed_on_Old_Meter() {
		return Scan_Barcode_Sticker_Placed_On_Old_Meter;
	}

	public void setScan_Barcode_Sticker_placed_on_Old_Meter(String scan_Barcode_Sticker_placed_on_Old_Meter) {
		Scan_Barcode_Sticker_Placed_On_Old_Meter = scan_Barcode_Sticker_placed_on_Old_Meter;
	}

	public String getOld_Meter_Number_MI() {
		return Old_Meter_Number_MI;
	}

	public void setOld_Meter_Number_MI(String old_Meter_Number_MI) {
		Old_Meter_Number_MI = old_Meter_Number_MI;
	}

	public String getNew_Meter_Number() {
		return New_Meter_Number;
	}

	public void setNew_Meter_Number(String new_Meter_Number) {
		New_Meter_Number = new_Meter_Number;
	}

	public String getMismatch_betwwen_old_meter_number_of_CI_and_MI() {
		return Mismatch_Between_Old_Meter_Number_Of_CI_And_MI;
	}

	public void setMismatch_betwwen_old_meter_number_of_CI_and_MI(String mismatch_betwwen_old_meter_number_of_CI_and_MI) {
		Mismatch_Between_Old_Meter_Number_Of_CI_And_MI = mismatch_betwwen_old_meter_number_of_CI_and_MI;
	}

	public String getNew_Meter_Billing_Type() {
		return New_Meter_Billing_Type;
	}

	public void setNew_Meter_Billing_Type(String new_Meter_Billing_Type) {
		New_Meter_Billing_Type = new_Meter_Billing_Type;
	}

	public String getMeter_Communication_Type() {
		return Meter_Communication_Type;
	}

	public void setMeter_Communication_Type(String meter_Communication_Type) {
		Meter_Communication_Type = meter_Communication_Type;
	}

	public String getMeter_CT_Ratio() {
		return Meter_CT_Ratio;
	}

	public void setMeter_CT_Ratio(String meter_CT_Ratio) {
		Meter_CT_Ratio = meter_CT_Ratio;
	}

	public String getMeter_PT_Ratio() {
		return Meter_PT_Ratio;
	}

	public void setMeter_PT_Ratio(String meter_PT_Ratio) {
		Meter_PT_Ratio = meter_PT_Ratio;
	}

	public String getLine_CT_Ratio() {
		return Line_CT_Ratio;
	}

	public void setLine_CT_Ratio(String line_CT_Ratio) {
		Line_CT_Ratio = line_CT_Ratio;
	}

	public String getLine_PT_Ratio() {
		return Line_PT_Ratio;
	}

	public void setLine_PT_Ratio(String line_PT_Ratio) {
		Line_PT_Ratio = line_PT_Ratio;
	}

	public String getNetwork_Provider_Name_SIM1() {
		return Network_Provider_Name_SIM1;
	}

	public void setNetwork_Provider_Name_SIM1(String network_Provider_Name_SIM1) {
		Network_Provider_Name_SIM1 = network_Provider_Name_SIM1;
	}

	public String getSignal_Strength_SIM1() {
		return Signal_Strength_SIM1;
	}

	public void setSignal_Strength_SIM1(String signal_Strength_SIM1) {
		Signal_Strength_SIM1 = signal_Strength_SIM1;
	}

	public String getSignal_Category_SIM1() {
		return Signal_Category_SIM1;
	}

	public void setSignal_Category_SIM1(String signal_Category_SIM1) {
		Signal_Category_SIM1 = signal_Category_SIM1;
	}

	public String getNetwork_Type1() {
		return Network_Type1;
	}

	public void setNetwork_Type1(String network_Type1) {
		Network_Type1 = network_Type1;
	}

	public String getNetwork_Provider_Name_SIM2() {
		return Network_Provider_Name_SIM2;
	}

	public void setNetwork_Provider_Name_SIM2(String network_Provider_Name_SIM2) {
		Network_Provider_Name_SIM2 = network_Provider_Name_SIM2;
	}

	public String getSignal_Strength_SIM2() {
		return Signal_Strength_SIM2;
	}

	public void setSignal_Strength_SIM2(String signal_Strength_SIM2) {
		Signal_Strength_SIM2 = signal_Strength_SIM2;
	}

	public String getSignal_Category_SIM2() {
		return Signal_Category_SIM2;
	}

	public void setSignal_Category_SIM2(String signal_Category_SIM2) {
		Signal_Category_SIM2 = signal_Category_SIM2;
	}

	public String getNetwork_Type2() {
		return Network_Type2;
	}

	public void setNetwork_Type2(String network_Type2) {
		Network_Type2 = network_Type2;
	}

	public String getLength_Of_Service_Cable_in_Meter() {
		return Length_Of_Service_Cable_In_Meter;
	}

	public void setLength_Of_Service_Cable_in_Meter(String length_Of_Service_Cable_in_Meter) {
		Length_Of_Service_Cable_In_Meter = length_Of_Service_Cable_in_Meter;
	}

	public String getCable_Type() {
		return Cable_Type;
	}

	public void setCable_Type(String cable_Type) {
		Cable_Type = cable_Type;
	}

	public String getOld_Meter_Current_Kwh_MI() {
		return Old_Meter_Current_KWH_MI;
	}

	public void setOld_Meter_Current_Kwh_MI(String old_Meter_Current_Kwh_MI) {
		Old_Meter_Current_KWH_MI = old_Meter_Current_Kwh_MI;
	}

	public String getMismatch_Between_Reading_of_CI_and_MI() {
		return Mismatch_Between_Reading_Of_CI_And_MI;
	}

	public void setMismatch_Between_Reading_of_CI_and_MI(String mismatch_Between_Reading_of_CI_and_MI) {
		Mismatch_Between_Reading_Of_CI_And_MI = mismatch_Between_Reading_of_CI_and_MI;
	}

	public int getOld_Meter_Current_KVah_MI() {
		return Old_Meter_Current_KVAH_MI;
	}

	public void setOld_Meter_Current_KVah_MI(int old_Meter_Current_KVah_MI) {
		Old_Meter_Current_KVAH_MI = old_Meter_Current_KVah_MI;
	}

	public int getOld_Meter_Kva_MI() {
		return Old_Meter_KVA_MI;
	}

	public void setOld_Meter_Kva_MI(int old_Meter_Kva_MI) {
		Old_Meter_KVA_MI = old_Meter_Kva_MI;
	}

	public int getNew_Meter_Current_KWH() {
		return New_Meter_Current_KWH;
	}

	public void setNew_Meter_Current_KWH(int new_Meter_Current_KWH) {
		New_Meter_Current_KWH = new_Meter_Current_KWH;
	}

	public int getNew_Meter_current_KVAH() {
		return New_Meter_Current_KVAH;
	}

	public void setNew_Meter_current_KVAH(int new_Meter_current_KVAH) {
		New_Meter_Current_KVAH = new_Meter_current_KVAH;
	}

	public String getNew_Meter_Phase() {
		return New_Meter_Phase;
	}

	public void setNew_Meter_Phase(String new_Meter_Phase) {
		New_Meter_Phase = new_Meter_Phase;
	}

	public String getMeter_Installation_Type() {
		return Meter_Installation_Type;
	}

	public void setMeter_Installation_Type(String meter_Installation_Type) {
		Meter_Installation_Type = meter_Installation_Type;
	}

	public String getMeter_Box_seal_Number1() {
		return Meter_Box_Seal_Number1;
	}

	public void setMeter_Box_seal_Number1(String meter_Box_seal_Number1) {
		Meter_Box_Seal_Number1 = meter_Box_seal_Number1;
	}

	public String getMeter_Box_Seal_Number2() {
		return Meter_Box_Seal_Number2;
	}

	public void setMeter_Box_Seal_Number2(String meter_Box_Seal_Number2) {
		Meter_Box_Seal_Number2 = meter_Box_Seal_Number2;
	}

	public String getNIC_Card1() {
		return NIC_Card1;
	}

	public void setNIC_Card1(String nIC_Card1) {
		NIC_Card1 = nIC_Card1;
	}

	public String getNIC_Card2() {
		return NIC_Card2;
	}

	public void setNIC_Card2(String nIC_Card2) {
		NIC_Card2 = nIC_Card2;
	}

	public String getNIC_Seal_Number1() {
		return NIC_Seal_Number1;
	}

	public void setNIC_Seal_Number1(String nIC_Seal_Number1) {
		NIC_Seal_Number1 = nIC_Seal_Number1;
	}

	public String getNIC_Seal_Type() {
		return NIC_Seal_Type;
	}

	public void setNIC_Seal_Type(String nIC_Seal_Type) {
		NIC_Seal_Type = nIC_Seal_Type;
	}

	public String getMeter_Body_Seal_Type() {
		return Meter_Body_Seal_Type;
	}

	public void setMeter_Body_Seal_Type(String meter_Body_Seal_Type) {
		Meter_Body_Seal_Type = meter_Body_Seal_Type;
	}

	public String getTerminal_Seal_Number1() {
		return Terminal_Seal_Number1;
	}

	public void setTerminal_Seal_Number1(String terminal_Seal_Number1) {
		Terminal_Seal_Number1 = terminal_Seal_Number1;
	}

	public String getTerminal_Seal_Number2() {
		return Terminal_Seal_Number2;
	}

	public void setTerminal_Seal_Number2(String terminal_Seal_Number2) {
		Terminal_Seal_Number2 = terminal_Seal_Number2;
	}

	public String getMeter_Box_Seal_Type() {
		return Meter_Box_Seal_Type;
	}

	public void setMeter_Box_Seal_Type(String meter_Box_Seal_Type) {
		Meter_Box_Seal_Type = meter_Box_Seal_Type;
	}

	public String getMRN_No() {
		return MRN_No;
	}

	public void setMRN_No(String mRN_No) {
		MRN_No = mRN_No;
	}

	public String getPage_No() {
		return Page_No;
	}

	public void setPage_No(String page_No) {
		Page_No = page_No;
	}

	public String getNew_Meter_Manufacturer() {
		return New_Meter_Manufacturer;
	}

	public void setNew_Meter_Manufacturer(String new_Meter_Manufacturer) {
		New_Meter_Manufacturer = new_Meter_Manufacturer;
	}

	public String getError_Code_Error_Description() {
		return Error_Code_Error_Description;
	}

	public void setError_Code_Error_Description(String error_Code_Error_Description) {
		Error_Code_Error_Description = error_Code_Error_Description;
	}

	public String getLatitude() {
		return Latitude;
	}

	public void setLatitude(String latitude) {
		this.Latitude = latitude;
	}

	public String getLongitude() {
		return Longitude;
	}

	public void setLongitude(String longitude) {
		this.Longitude = longitude;
	}

	public String getUpdated_By() {
		return Updated_By;
	}

	public void setUpdated_By(String updated_By) {
		Updated_By = updated_By;
	}

	public Date getNew_Meter_Installed_Date() {
		return New_Meter_Installed_Date;
	}

	public void setNew_Meter_Installed_Date(Date new_Meter_Installed_Date) {
		New_Meter_Installed_Date = new_Meter_Installed_Date;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Date getQC_Contractor_Approved_Date() {
		return QC_Contractor_Approved_Date;
	}

	public void setQC_Contractor_Approved_Date(Date qC_Contractor_Approved_Date) {
		QC_Contractor_Approved_Date = qC_Contractor_Approved_Date;
	}

	public String getApproved_By_QC_Contractor() {
		return Approved_By_QC_Contractor;
	}

	public void setApproved_By_QC_Contractor(String approved_By_QC_Contractor) {
		Approved_By_QC_Contractor = approved_By_QC_Contractor;
	}

	public Date getIntelliSmart_Approved_Date() {
		return IntelliSmart_Approved_Date;
	}

	public void setIntelliSmart_Approved_Date(Date intelliSmart_Approved_Date) {
		IntelliSmart_Approved_Date = intelliSmart_Approved_Date;
	}

	public String getApproved_By_IntelliSmart() {
		return Approved_By_IntelliSmart;
	}

	public void setApproved_By_IntelliSmart(String approved_By_IntelliSmart) {
		Approved_By_IntelliSmart = approved_By_IntelliSmart;
	}

	public Date getDiscom_Approved_Date() {
		return Discom_Approved_Date;
	}

	public void setDiscom_Approved_Date(Date discom_Approved_Date) {
		Discom_Approved_Date = discom_Approved_Date;
	}

	public String getApproved_By_Discom() {
		return Approved_By_Discom;
	}

	public void setApproved_By_Discom(String approved_By_Discom) {
		Approved_By_Discom = approved_By_Discom;
	}

	public String getQC_Contractor_Rejected_Remarks() {
		return QC_Contractor_Rejected_Remarks;
	}

	public void setQC_Contractor_Rejected_Remarks(String qC_Contractor_Rejected_Remarks) {
		QC_Contractor_Rejected_Remarks = qC_Contractor_Rejected_Remarks;
	}

	public Date getQC_Contractor_Rejected_Date() {
		return QC_Contractor_Rejected_Date;
	}

	public void setQC_Contractor_Rejected_Date(Date qC_Contractor_Rejected_Date) {
		QC_Contractor_Rejected_Date = qC_Contractor_Rejected_Date;
	}

	public String getRejected_By_QC_Contractor() {
		return Rejected_By_QC_Contractor;
	}

	public void setRejected_By_QC_Contractor(String rejected_By_QC_Contractor) {
		Rejected_By_QC_Contractor = rejected_By_QC_Contractor;
	}

	public String getIntelliSmart_Rejected_Remarks() {
		return IntelliSmart_Rejected_Remarks;
	}

	public void setIntelliSmart_Rejected_Remarks(String intelliSmart_Rejected_Remarks) {
		IntelliSmart_Rejected_Remarks = intelliSmart_Rejected_Remarks;
	}

	public Date getIntelliSmart_Rejected_Date() {
		return IntelliSmart_Rejected_Date;
	}

	public void setIntelliSmart_Rejected_Date(Date intelliSmart_Rejected_Date) {
		IntelliSmart_Rejected_Date = intelliSmart_Rejected_Date;
	}

	public String getIntelliSmar_Rejected_By() {
		return IntelliSmart_Rejected_By;
	}

	public void setIntelliSmar_Rejected_By(String intelliSmar_Rejected_By) {
		IntelliSmart_Rejected_By = intelliSmar_Rejected_By;
	}

	public String getDiscom_Rejected_Remarks() {
		return Discom_Rejected_Remarks;
	}

	public void setDiscom_Rejected_Remarks(String discom_Rejected_Remarks) {
		Discom_Rejected_Remarks = discom_Rejected_Remarks;
	}

	public Date getDiscom_Rejected_Date() {
		return Discom_Rejected_Date;
	}

	public void setDiscom_Rejected_Date(Date discom_Rejected_Date) {
		Discom_Rejected_Date = discom_Rejected_Date;
	}

	public String getRejected_By_Discom() {
		return Rejected_By_Discom;
	}

	public void setRejected_By_Discom(String rejected_By_Discom) {
		Rejected_By_Discom = rejected_By_Discom;
	}

	public int getNo_Of_Rejections() {
		return No_Of_Rejections;
	}

	public void setNo_Of_Rejections(int no_Of_Rejections) {
		No_Of_Rejections = no_Of_Rejections;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getCT_Chamber_Seal_No() {
		return CT_Chamber_Seal_No;
	}

	public void setCT_Chamber_Seal_No(String cT_Chamber_Seal_No) {
		CT_Chamber_Seal_No = cT_Chamber_Seal_No;
	}
	@Override
	public String toString() {
		return "MeterInstallation [id=" + id + ", consumerIndex=" + consumerIndex
				+ ", LT_Pole_Condtion_For_Service_Cable=" + LT_Pole_Condtion_For_Service_Cable
				+ ", Is_Armoured_Service_Cable_To_Be_Installed=" + Is_Armoured_Service_Cable_To_Be_Installed
				+ ", Neutral_Availability=" + Neutral_Availability + ", Village_Name=" + Village_Name
				+ ", Village_Census_Code=" + Village_Census_Code + ", Gram_Panchayat=" + Gram_Panchayat + ", Block="
				+ Block + ", Street_Name=" + Street_Name + ", Old_Meter_Billing_Type=" + Old_Meter_Billing_Type
				+ ", Scan_Barcode_Sticker_Placed_On_Old_Meter=" + Scan_Barcode_Sticker_Placed_On_Old_Meter
				+ ", Old_Meter_Number_MI=" + Old_Meter_Number_MI + ", New_Meter_Number=" + New_Meter_Number
				+ ", Mismatch_Between_Old_Meter_Number_Of_CI_And_MI=" + Mismatch_Between_Old_Meter_Number_Of_CI_And_MI
				+ ", New_Meter_Billing_Type=" + New_Meter_Billing_Type + ", Meter_Communication_Type="
				+ Meter_Communication_Type + ", Meter_CT_Ratio=" + Meter_CT_Ratio + ", Meter_PT_Ratio=" + Meter_PT_Ratio
				+ ", Line_CT_Ratio=" + Line_CT_Ratio + ", Line_PT_Ratio=" + Line_PT_Ratio
				+ ", Network_Provider_Name_SIM1=" + Network_Provider_Name_SIM1 + ", Signal_Strength_SIM1="
				+ Signal_Strength_SIM1 + ", Signal_Category_SIM1=" + Signal_Category_SIM1 + ", Network_Type1="
				+ Network_Type1 + ", Network_Provider_Name_SIM2=" + Network_Provider_Name_SIM2
				+ ", Signal_Strength_SIM2=" + Signal_Strength_SIM2 + ", Signal_Category_SIM2=" + Signal_Category_SIM2
				+ ", Network_Type2=" + Network_Type2 + ", Length_Of_Service_Cable_In_Meter="
				+ Length_Of_Service_Cable_In_Meter + ", Cable_Type=" + Cable_Type + ", Old_Meter_Current_KWH_MI="
				+ Old_Meter_Current_KWH_MI + ", Mismatch_Between_Reading_Of_CI_And_MI="
				+ Mismatch_Between_Reading_Of_CI_And_MI + ", Old_Meter_Current_KVAH_MI=" + Old_Meter_Current_KVAH_MI
				+ ", Old_Meter_KVA_MI=" + Old_Meter_KVA_MI + ", New_Meter_Current_KWH=" + New_Meter_Current_KWH
				+ ", New_Meter_Current_KVAH=" + New_Meter_Current_KVAH + ", New_Meter_Phase=" + New_Meter_Phase
				+ ", Meter_Installation_Type=" + Meter_Installation_Type + ", Meter_Box_Seal_Number1="
				+ Meter_Box_Seal_Number1 + ", Meter_Box_Seal_Number2=" + Meter_Box_Seal_Number2 + ", NIC_Card1="
				+ NIC_Card1 + ", NIC_Card2=" + NIC_Card2 + ", NIC_Seal_Number1=" + NIC_Seal_Number1 + ", NIC_Seal_Type="
				+ NIC_Seal_Type + ", Meter_Body_Seal_Type=" + Meter_Body_Seal_Type + ", Terminal_Seal_Number1="
				+ Terminal_Seal_Number1 + ", Terminal_Seal_Number2=" + Terminal_Seal_Number2 + ", Meter_Box_Seal_Type="
				+ Meter_Box_Seal_Type + ", MRN_No=" + MRN_No + ", Page_No=" + Page_No + ", New_Meter_Manufacturer="
				+ New_Meter_Manufacturer + ", Error_Code_Error_Description=" + Error_Code_Error_Description
				+ ", Latitude=" + Latitude + ", Longitude=" + Longitude + ", Updated_By=" + Updated_By
				+ ", New_Meter_Installed_Date=" + New_Meter_Installed_Date + ", Status=" + Status
				+ ", QC_Contractor_Approved_Date=" + QC_Contractor_Approved_Date + ", Approved_By_QC_Contractor="
				+ Approved_By_QC_Contractor + ", IntelliSmart_Approved_Date=" + IntelliSmart_Approved_Date
				+ ", Approved_By_IntelliSmart=" + Approved_By_IntelliSmart + ", Discom_Approved_Date="
				+ Discom_Approved_Date + ", Approved_By_Discom=" + Approved_By_Discom
				+ ", QC_Contractor_Rejected_Remarks=" + QC_Contractor_Rejected_Remarks
				+ ", QC_Contractor_Rejected_Date=" + QC_Contractor_Rejected_Date + ", Rejected_By_QC_Contractor="
				+ Rejected_By_QC_Contractor + ", IntelliSmart_Rejected_Remarks=" + IntelliSmart_Rejected_Remarks
				+ ", IntelliSmart_Rejected_Date=" + IntelliSmart_Rejected_Date + ", IntelliSmart_Rejected_By="
				+ IntelliSmart_Rejected_By + ", Discom_Rejected_Remarks=" + Discom_Rejected_Remarks
				+ ", Discom_Rejected_Date=" + Discom_Rejected_Date + ", Rejected_By_Discom=" + Rejected_By_Discom
				+ ", No_Of_Rejections=" + No_Of_Rejections + ", Area=" + Area + ", CT_Chamber_Seal_No="
				+ CT_Chamber_Seal_No + "]";
	}

	
	

	
    
	
	
	
    
}
  