
package ucvp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UcvpAccountInter complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="UcvpAccountInter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Created" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Updated" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Searchspec" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ADSUserId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="AreaName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Brand" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarUse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ChassNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactMobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CreditCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DMFPLX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DMGSXC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DaiKuanType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DataConsumer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DataSource" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DealerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DealerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Duties" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EGNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EducationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ExtNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FamilyIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HandtakeTime" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="InterId" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InteriorCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InvoiceNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InvoiceTime" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="IsJoinClub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="IsOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JSFXDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="JobFunc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="KeyCustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LinkTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="MileNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Mobile" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModelCode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ModelVersion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ModelYear" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="OldSaleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OnSaleFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OnSaleRemark" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OwnerMarriage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PackageCodeList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProspectId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="RefuseReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaleId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaleType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesIDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SalesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SpecialFeeFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalPrice" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VSLSBZ" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VSSBCL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="VSXSRY" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XSCLDM" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XSCLM1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XSCXDL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CardCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ColorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LnkId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LnkName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LnkTel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="LnkType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CustomerModelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext10" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext11" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext12" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext13" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext14" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext15" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext16" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext17" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext18" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext19" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext20" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext8" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Ext9" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Birthday" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarMasterType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="CarNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeriesCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Company" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ModelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PurchaseDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SaleDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeriesName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ColorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactIDType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactIDNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ContactType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Operation" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Uiactive" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="Uiselected" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UcvpAccountInter", propOrder = {
    "id",
    "created",
    "createdBy",
    "updated",
    "updatedBy",
    "conflictId",
    "modId",
    "searchspec",
    "adsUserId",
    "address",
    "areaCode",
    "areaName",
    "bankName",
    "brand",
    "carNumber",
    "carUse",
    "chassNumber",
    "cityName",
    "contact",
    "contactMobile",
    "creditCard",
    "custId",
    "customerId",
    "customerName",
    "customerType",
    "dmfplx",
    "dmgsxc",
    "daiKuanType",
    "dataConsumer",
    "dataSource",
    "dealerCode",
    "dealerName",
    "duties",
    "egNumber",
    "educationLevel",
    "email",
    "errorCode",
    "errorMessage",
    "extNumber",
    "familyIncome",
    "gender",
    "handtakeTime",
    "idNumber",
    "idType",
    "interId",
    "interiorCode",
    "invoiceNumber",
    "invoiceTime",
    "isJoinClub",
    "isOwner",
    "jsfxdm",
    "jobFunc",
    "keyCustomerName",
    "linkTel",
    "mileNumber",
    "mobile",
    "modelCode",
    "modelVersion",
    "modelYear",
    "oldSaleId",
    "onSaleFlag",
    "onSaleRemark",
    "ownerMarriage",
    "packageCodeList",
    "paymentType",
    "prospectId",
    "province",
    "rateCode",
    "refuseReason",
    "saleCode",
    "saleId",
    "saleType",
    "salesIDNumber",
    "salesName",
    "specialFeeFlag",
    "status",
    "totalPrice",
    "vin",
    "vslsbz",
    "vssbcl",
    "vsxsry",
    "xscldm",
    "xsclm1",
    "xscxdl",
    "zipCode",
    "cardCode",
    "colorCode",
    "lnkId",
    "lnkName",
    "lnkTel",
    "lnkType",
    "customerModelId",
    "ext1",
    "ext10",
    "ext11",
    "ext12",
    "ext13",
    "ext14",
    "ext15",
    "ext16",
    "ext17",
    "ext18",
    "ext19",
    "ext2",
    "ext20",
    "ext3",
    "ext4",
    "ext5",
    "ext6",
    "ext7",
    "ext8",
    "ext9",
    "birthday",
    "carMasterType",
    "carNo",
    "seriesCode",
    "company",
    "industry",
    "modelName",
    "purchaseDate",
    "saleDate",
    "seriesName",
    "sourceType",
    "colorName",
    "contactIDType",
    "contactIDNumber",
    "contactType"
})
public class UcvpAccountInter {

    @XmlElement(name = "Id")
    protected String id;
    @XmlElement(name = "Created")
    protected String created;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "Updated")
    protected String updated;
    @XmlElement(name = "UpdatedBy")
    protected String updatedBy;
    @XmlElement(name = "ConflictId")
    protected String conflictId;
    @XmlElement(name = "ModId")
    protected String modId;
    @XmlElement(name = "Searchspec")
    protected String searchspec;
    @XmlElement(name = "ADSUserId", required = true)
    protected String adsUserId;
    @XmlElement(name = "Address")
    protected String address;
    @XmlElement(name = "AreaCode")
    protected String areaCode;
    @XmlElement(name = "AreaName")
    protected String areaName;
    @XmlElement(name = "BankName")
    protected String bankName;
    @XmlElement(name = "Brand")
    protected String brand;
    @XmlElement(name = "CarNumber")
    protected String carNumber;
    @XmlElement(name = "CarUse")
    protected String carUse;
    @XmlElement(name = "ChassNumber")
    protected String chassNumber;
    @XmlElement(name = "CityName")
    protected String cityName;
    @XmlElement(name = "Contact")
    protected String contact;
    @XmlElement(name = "ContactMobile")
    protected String contactMobile;
    @XmlElement(name = "CreditCard")
    protected String creditCard;
    @XmlElement(name = "CustId", required = true)
    protected String custId;
    @XmlElement(name = "CustomerId")
    protected String customerId;
    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "CustomerType")
    protected String customerType;
    @XmlElement(name = "DMFPLX")
    protected String dmfplx;
    @XmlElement(name = "DMGSXC")
    protected String dmgsxc;
    @XmlElement(name = "DaiKuanType")
    protected String daiKuanType;
    @XmlElement(name = "DataConsumer", required = true)
    protected String dataConsumer;
    @XmlElement(name = "DataSource", required = true)
    protected String dataSource;
    @XmlElement(name = "DealerCode")
    protected String dealerCode;
    @XmlElement(name = "DealerName")
    protected String dealerName;
    @XmlElement(name = "Duties")
    protected String duties;
    @XmlElement(name = "EGNumber")
    protected String egNumber;
    @XmlElement(name = "EducationLevel")
    protected String educationLevel;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "ErrorCode")
    protected String errorCode;
    @XmlElement(name = "ErrorMessage")
    protected String errorMessage;
    @XmlElement(name = "ExtNumber")
    protected String extNumber;
    @XmlElement(name = "FamilyIncome")
    protected String familyIncome;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "HandtakeTime")
    protected String handtakeTime;
    @XmlElement(name = "IDNumber")
    protected String idNumber;
    @XmlElement(name = "IDType")
    protected String idType;
    @XmlElement(name = "InterId", required = true)
    protected String interId;
    @XmlElement(name = "InteriorCode", required = true)
    protected String interiorCode;
    @XmlElement(name = "InvoiceNumber", required = true)
    protected String invoiceNumber;
    @XmlElement(name = "InvoiceTime", required = true)
    protected String invoiceTime;
    @XmlElement(name = "IsJoinClub")
    protected String isJoinClub;
    @XmlElement(name = "IsOwner")
    protected String isOwner;
    @XmlElement(name = "JSFXDM")
    protected String jsfxdm;
    @XmlElement(name = "JobFunc")
    protected String jobFunc;
    @XmlElement(name = "KeyCustomerName")
    protected String keyCustomerName;
    @XmlElement(name = "LinkTel")
    protected String linkTel;
    @XmlElement(name = "MileNumber")
    protected String mileNumber;
    @XmlElement(name = "Mobile")
    protected String mobile;
    @XmlElement(name = "ModelCode", required = true)
    protected String modelCode;
    @XmlElement(name = "ModelVersion", required = true)
    protected String modelVersion;
    @XmlElement(name = "ModelYear", required = true)
    protected String modelYear;
    @XmlElement(name = "OldSaleId")
    protected String oldSaleId;
    @XmlElement(name = "OnSaleFlag")
    protected String onSaleFlag;
    @XmlElement(name = "OnSaleRemark")
    protected String onSaleRemark;
    @XmlElement(name = "OwnerMarriage")
    protected String ownerMarriage;
    @XmlElement(name = "PackageCodeList")
    protected String packageCodeList;
    @XmlElement(name = "PaymentType")
    protected String paymentType;
    @XmlElement(name = "ProspectId")
    protected String prospectId;
    @XmlElement(name = "Province")
    protected String province;
    @XmlElement(name = "RateCode")
    protected String rateCode;
    @XmlElement(name = "RefuseReason")
    protected String refuseReason;
    @XmlElement(name = "SaleCode")
    protected String saleCode;
    @XmlElement(name = "SaleId")
    protected String saleId;
    @XmlElement(name = "SaleType")
    protected String saleType;
    @XmlElement(name = "SalesIDNumber")
    protected String salesIDNumber;
    @XmlElement(name = "SalesName")
    protected String salesName;
    @XmlElement(name = "SpecialFeeFlag")
    protected String specialFeeFlag;
    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "TotalPrice", required = true)
    protected String totalPrice;
    @XmlElement(name = "VIN", required = true)
    protected String vin;
    @XmlElement(name = "VSLSBZ")
    protected String vslsbz;
    @XmlElement(name = "VSSBCL")
    protected String vssbcl;
    @XmlElement(name = "VSXSRY")
    protected String vsxsry;
    @XmlElement(name = "XSCLDM")
    protected String xscldm;
    @XmlElement(name = "XSCLM1")
    protected String xsclm1;
    @XmlElement(name = "XSCXDL")
    protected String xscxdl;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "CardCode")
    protected String cardCode;
    @XmlElement(name = "ColorCode")
    protected String colorCode;
    @XmlElement(name = "LnkId")
    protected String lnkId;
    @XmlElement(name = "LnkName")
    protected String lnkName;
    @XmlElement(name = "LnkTel")
    protected String lnkTel;
    @XmlElement(name = "LnkType")
    protected String lnkType;
    @XmlElement(name = "CustomerModelId")
    protected String customerModelId;
    @XmlElement(name = "Ext1")
    protected String ext1;
    @XmlElement(name = "Ext10")
    protected String ext10;
    @XmlElement(name = "Ext11")
    protected String ext11;
    @XmlElement(name = "Ext12")
    protected String ext12;
    @XmlElement(name = "Ext13")
    protected String ext13;
    @XmlElement(name = "Ext14")
    protected String ext14;
    @XmlElement(name = "Ext15")
    protected String ext15;
    @XmlElement(name = "Ext16")
    protected String ext16;
    @XmlElement(name = "Ext17")
    protected String ext17;
    @XmlElement(name = "Ext18")
    protected String ext18;
    @XmlElement(name = "Ext19")
    protected String ext19;
    @XmlElement(name = "Ext2")
    protected String ext2;
    @XmlElement(name = "Ext20")
    protected String ext20;
    @XmlElement(name = "Ext3")
    protected String ext3;
    @XmlElement(name = "Ext4")
    protected String ext4;
    @XmlElement(name = "Ext5")
    protected String ext5;
    @XmlElement(name = "Ext6")
    protected String ext6;
    @XmlElement(name = "Ext7")
    protected String ext7;
    @XmlElement(name = "Ext8")
    protected String ext8;
    @XmlElement(name = "Ext9")
    protected String ext9;
    @XmlElement(name = "Birthday")
    protected String birthday;
    @XmlElement(name = "CarMasterType")
    protected String carMasterType;
    @XmlElement(name = "CarNo")
    protected String carNo;
    @XmlElement(name = "SeriesCode")
    protected String seriesCode;
    @XmlElement(name = "Company")
    protected String company;
    @XmlElement(name = "Industry")
    protected String industry;
    @XmlElement(name = "ModelName")
    protected String modelName;
    @XmlElement(name = "PurchaseDate")
    protected String purchaseDate;
    @XmlElement(name = "SaleDate")
    protected String saleDate;
    @XmlElement(name = "SeriesName")
    protected String seriesName;
    @XmlElement(name = "SourceType")
    protected String sourceType;
    @XmlElement(name = "ColorName")
    protected String colorName;
    @XmlElement(name = "ContactIDType")
    protected String contactIDType;
    @XmlElement(name = "ContactIDNumber")
    protected String contactIDNumber;
    @XmlElement(name = "ContactType")
    protected String contactType;
    @XmlAttribute(name = "Operation")
    protected String operation;
    @XmlAttribute(name = "Uiactive")
    protected String uiactive;
    @XmlAttribute(name = "Uiselected")
    protected String uiselected;

    /**
     * ��ȡid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * ����id���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * ��ȡcreated���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreated() {
        return created;
    }

    /**
     * ����created���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreated(String value) {
        this.created = value;
    }

    /**
     * ��ȡcreatedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * ����createdBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
    }

    /**
     * ��ȡupdated���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdated() {
        return updated;
    }

    /**
     * ����updated���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdated(String value) {
        this.updated = value;
    }

    /**
     * ��ȡupdatedBy���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * ����updatedBy���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdatedBy(String value) {
        this.updatedBy = value;
    }

    /**
     * ��ȡconflictId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConflictId() {
        return conflictId;
    }

    /**
     * ����conflictId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConflictId(String value) {
        this.conflictId = value;
    }

    /**
     * ��ȡmodId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModId() {
        return modId;
    }

    /**
     * ����modId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModId(String value) {
        this.modId = value;
    }

    /**
     * ��ȡsearchspec���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchspec() {
        return searchspec;
    }

    /**
     * ����searchspec���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchspec(String value) {
        this.searchspec = value;
    }

    /**
     * ��ȡadsUserId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getADSUserId() {
        return adsUserId;
    }

    /**
     * ����adsUserId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setADSUserId(String value) {
        this.adsUserId = value;
    }

    /**
     * ��ȡaddress���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * ����address���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * ��ȡareaCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * ����areaCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCode(String value) {
        this.areaCode = value;
    }

    /**
     * ��ȡareaName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * ����areaName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaName(String value) {
        this.areaName = value;
    }

    /**
     * ��ȡbankName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * ����bankName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * ��ȡbrand���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * ����brand���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * ��ȡcarNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarNumber() {
        return carNumber;
    }

    /**
     * ����carNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarNumber(String value) {
        this.carNumber = value;
    }

    /**
     * ��ȡcarUse���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarUse() {
        return carUse;
    }

    /**
     * ����carUse���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarUse(String value) {
        this.carUse = value;
    }

    /**
     * ��ȡchassNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChassNumber() {
        return chassNumber;
    }

    /**
     * ����chassNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChassNumber(String value) {
        this.chassNumber = value;
    }

    /**
     * ��ȡcityName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * ����cityName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * ��ȡcontact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContact() {
        return contact;
    }

    /**
     * ����contact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContact(String value) {
        this.contact = value;
    }

    /**
     * ��ȡcontactMobile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactMobile() {
        return contactMobile;
    }

    /**
     * ����contactMobile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactMobile(String value) {
        this.contactMobile = value;
    }

    /**
     * ��ȡcreditCard���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditCard() {
        return creditCard;
    }

    /**
     * ����creditCard���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditCard(String value) {
        this.creditCard = value;
    }

    /**
     * ��ȡcustId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustId() {
        return custId;
    }

    /**
     * ����custId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustId(String value) {
        this.custId = value;
    }

    /**
     * ��ȡcustomerId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * ����customerId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerId(String value) {
        this.customerId = value;
    }

    /**
     * ��ȡcustomerName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * ����customerName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * ��ȡcustomerType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * ����customerType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * ��ȡdmfplx���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMFPLX() {
        return dmfplx;
    }

    /**
     * ����dmfplx���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMFPLX(String value) {
        this.dmfplx = value;
    }

    /**
     * ��ȡdmgsxc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDMGSXC() {
        return dmgsxc;
    }

    /**
     * ����dmgsxc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDMGSXC(String value) {
        this.dmgsxc = value;
    }

    /**
     * ��ȡdaiKuanType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaiKuanType() {
        return daiKuanType;
    }

    /**
     * ����daiKuanType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaiKuanType(String value) {
        this.daiKuanType = value;
    }

    /**
     * ��ȡdataConsumer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataConsumer() {
        return dataConsumer;
    }

    /**
     * ����dataConsumer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataConsumer(String value) {
        this.dataConsumer = value;
    }

    /**
     * ��ȡdataSource���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * ����dataSource���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * ��ȡdealerCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerCode() {
        return dealerCode;
    }

    /**
     * ����dealerCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerCode(String value) {
        this.dealerCode = value;
    }

    /**
     * ��ȡdealerName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealerName() {
        return dealerName;
    }

    /**
     * ����dealerName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDealerName(String value) {
        this.dealerName = value;
    }

    /**
     * ��ȡduties���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuties() {
        return duties;
    }

    /**
     * ����duties���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuties(String value) {
        this.duties = value;
    }

    /**
     * ��ȡegNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEGNumber() {
        return egNumber;
    }

    /**
     * ����egNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEGNumber(String value) {
        this.egNumber = value;
    }

    /**
     * ��ȡeducationLevel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducationLevel() {
        return educationLevel;
    }

    /**
     * ����educationLevel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducationLevel(String value) {
        this.educationLevel = value;
    }

    /**
     * ��ȡemail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����email���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * ��ȡerrorCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * ����errorCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {
        this.errorCode = value;
    }

    /**
     * ��ȡerrorMessage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * ����errorMessage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorMessage(String value) {
        this.errorMessage = value;
    }

    /**
     * ��ȡextNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtNumber() {
        return extNumber;
    }

    /**
     * ����extNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtNumber(String value) {
        this.extNumber = value;
    }

    /**
     * ��ȡfamilyIncome���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyIncome() {
        return familyIncome;
    }

    /**
     * ����familyIncome���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyIncome(String value) {
        this.familyIncome = value;
    }

    /**
     * ��ȡgender���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * ����gender���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * ��ȡhandtakeTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHandtakeTime() {
        return handtakeTime;
    }

    /**
     * ����handtakeTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHandtakeTime(String value) {
        this.handtakeTime = value;
    }

    /**
     * ��ȡidNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNumber() {
        return idNumber;
    }

    /**
     * ����idNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNumber(String value) {
        this.idNumber = value;
    }

    /**
     * ��ȡidType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * ����idType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * ��ȡinterId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInterId() {
        return interId;
    }

    /**
     * ����interId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInterId(String value) {
        this.interId = value;
    }

    /**
     * ��ȡinteriorCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteriorCode() {
        return interiorCode;
    }

    /**
     * ����interiorCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteriorCode(String value) {
        this.interiorCode = value;
    }

    /**
     * ��ȡinvoiceNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * ����invoiceNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * ��ȡinvoiceTime���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceTime() {
        return invoiceTime;
    }

    /**
     * ����invoiceTime���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceTime(String value) {
        this.invoiceTime = value;
    }

    /**
     * ��ȡisJoinClub���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsJoinClub() {
        return isJoinClub;
    }

    /**
     * ����isJoinClub���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsJoinClub(String value) {
        this.isJoinClub = value;
    }

    /**
     * ��ȡisOwner���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsOwner() {
        return isOwner;
    }

    /**
     * ����isOwner���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsOwner(String value) {
        this.isOwner = value;
    }

    /**
     * ��ȡjsfxdm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJSFXDM() {
        return jsfxdm;
    }

    /**
     * ����jsfxdm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJSFXDM(String value) {
        this.jsfxdm = value;
    }

    /**
     * ��ȡjobFunc���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobFunc() {
        return jobFunc;
    }

    /**
     * ����jobFunc���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobFunc(String value) {
        this.jobFunc = value;
    }

    /**
     * ��ȡkeyCustomerName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyCustomerName() {
        return keyCustomerName;
    }

    /**
     * ����keyCustomerName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyCustomerName(String value) {
        this.keyCustomerName = value;
    }

    /**
     * ��ȡlinkTel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLinkTel() {
        return linkTel;
    }

    /**
     * ����linkTel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLinkTel(String value) {
        this.linkTel = value;
    }

    /**
     * ��ȡmileNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMileNumber() {
        return mileNumber;
    }

    /**
     * ����mileNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMileNumber(String value) {
        this.mileNumber = value;
    }

    /**
     * ��ȡmobile���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * ����mobile���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobile(String value) {
        this.mobile = value;
    }

    /**
     * ��ȡmodelCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelCode() {
        return modelCode;
    }

    /**
     * ����modelCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelCode(String value) {
        this.modelCode = value;
    }

    /**
     * ��ȡmodelVersion���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelVersion() {
        return modelVersion;
    }

    /**
     * ����modelVersion���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelVersion(String value) {
        this.modelVersion = value;
    }

    /**
     * ��ȡmodelYear���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelYear() {
        return modelYear;
    }

    /**
     * ����modelYear���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelYear(String value) {
        this.modelYear = value;
    }

    /**
     * ��ȡoldSaleId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOldSaleId() {
        return oldSaleId;
    }

    /**
     * ����oldSaleId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOldSaleId(String value) {
        this.oldSaleId = value;
    }

    /**
     * ��ȡonSaleFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnSaleFlag() {
        return onSaleFlag;
    }

    /**
     * ����onSaleFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnSaleFlag(String value) {
        this.onSaleFlag = value;
    }

    /**
     * ��ȡonSaleRemark���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnSaleRemark() {
        return onSaleRemark;
    }

    /**
     * ����onSaleRemark���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnSaleRemark(String value) {
        this.onSaleRemark = value;
    }

    /**
     * ��ȡownerMarriage���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwnerMarriage() {
        return ownerMarriage;
    }

    /**
     * ����ownerMarriage���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwnerMarriage(String value) {
        this.ownerMarriage = value;
    }

    /**
     * ��ȡpackageCodeList���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageCodeList() {
        return packageCodeList;
    }

    /**
     * ����packageCodeList���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageCodeList(String value) {
        this.packageCodeList = value;
    }

    /**
     * ��ȡpaymentType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * ����paymentType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
    }

    /**
     * ��ȡprospectId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProspectId() {
        return prospectId;
    }

    /**
     * ����prospectId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProspectId(String value) {
        this.prospectId = value;
    }

    /**
     * ��ȡprovince���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * ����province���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * ��ȡrateCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRateCode() {
        return rateCode;
    }

    /**
     * ����rateCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRateCode(String value) {
        this.rateCode = value;
    }

    /**
     * ��ȡrefuseReason���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefuseReason() {
        return refuseReason;
    }

    /**
     * ����refuseReason���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefuseReason(String value) {
        this.refuseReason = value;
    }

    /**
     * ��ȡsaleCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleCode() {
        return saleCode;
    }

    /**
     * ����saleCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleCode(String value) {
        this.saleCode = value;
    }

    /**
     * ��ȡsaleId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleId() {
        return saleId;
    }

    /**
     * ����saleId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleId(String value) {
        this.saleId = value;
    }

    /**
     * ��ȡsaleType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleType() {
        return saleType;
    }

    /**
     * ����saleType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleType(String value) {
        this.saleType = value;
    }

    /**
     * ��ȡsalesIDNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesIDNumber() {
        return salesIDNumber;
    }

    /**
     * ����salesIDNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesIDNumber(String value) {
        this.salesIDNumber = value;
    }

    /**
     * ��ȡsalesName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesName() {
        return salesName;
    }

    /**
     * ����salesName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesName(String value) {
        this.salesName = value;
    }

    /**
     * ��ȡspecialFeeFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialFeeFlag() {
        return specialFeeFlag;
    }

    /**
     * ����specialFeeFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialFeeFlag(String value) {
        this.specialFeeFlag = value;
    }

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * ��ȡtotalPrice���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPrice() {
        return totalPrice;
    }

    /**
     * ����totalPrice���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPrice(String value) {
        this.totalPrice = value;
    }

    /**
     * ��ȡvin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIN() {
        return vin;
    }

    /**
     * ����vin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIN(String value) {
        this.vin = value;
    }

    /**
     * ��ȡvslsbz���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSLSBZ() {
        return vslsbz;
    }

    /**
     * ����vslsbz���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSLSBZ(String value) {
        this.vslsbz = value;
    }

    /**
     * ��ȡvssbcl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSSBCL() {
        return vssbcl;
    }

    /**
     * ����vssbcl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSSBCL(String value) {
        this.vssbcl = value;
    }

    /**
     * ��ȡvsxsry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVSXSRY() {
        return vsxsry;
    }

    /**
     * ����vsxsry���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVSXSRY(String value) {
        this.vsxsry = value;
    }

    /**
     * ��ȡxscldm���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXSCLDM() {
        return xscldm;
    }

    /**
     * ����xscldm���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXSCLDM(String value) {
        this.xscldm = value;
    }

    /**
     * ��ȡxsclm1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXSCLM1() {
        return xsclm1;
    }

    /**
     * ����xsclm1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXSCLM1(String value) {
        this.xsclm1 = value;
    }

    /**
     * ��ȡxscxdl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXSCXDL() {
        return xscxdl;
    }

    /**
     * ����xscxdl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXSCXDL(String value) {
        this.xscxdl = value;
    }

    /**
     * ��ȡzipCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * ����zipCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * ��ȡcardCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * ����cardCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * ��ȡcolorCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorCode() {
        return colorCode;
    }

    /**
     * ����colorCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorCode(String value) {
        this.colorCode = value;
    }

    /**
     * ��ȡlnkId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnkId() {
        return lnkId;
    }

    /**
     * ����lnkId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnkId(String value) {
        this.lnkId = value;
    }

    /**
     * ��ȡlnkName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnkName() {
        return lnkName;
    }

    /**
     * ����lnkName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnkName(String value) {
        this.lnkName = value;
    }

    /**
     * ��ȡlnkTel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnkTel() {
        return lnkTel;
    }

    /**
     * ����lnkTel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnkTel(String value) {
        this.lnkTel = value;
    }

    /**
     * ��ȡlnkType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLnkType() {
        return lnkType;
    }

    /**
     * ����lnkType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLnkType(String value) {
        this.lnkType = value;
    }

    /**
     * ��ȡcustomerModelId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerModelId() {
        return customerModelId;
    }

    /**
     * ����customerModelId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerModelId(String value) {
        this.customerModelId = value;
    }

    /**
     * ��ȡext1���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt1() {
        return ext1;
    }

    /**
     * ����ext1���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt1(String value) {
        this.ext1 = value;
    }

    /**
     * ��ȡext10���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt10() {
        return ext10;
    }

    /**
     * ����ext10���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt10(String value) {
        this.ext10 = value;
    }

    /**
     * ��ȡext11���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt11() {
        return ext11;
    }

    /**
     * ����ext11���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt11(String value) {
        this.ext11 = value;
    }

    /**
     * ��ȡext12���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt12() {
        return ext12;
    }

    /**
     * ����ext12���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt12(String value) {
        this.ext12 = value;
    }

    /**
     * ��ȡext13���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt13() {
        return ext13;
    }

    /**
     * ����ext13���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt13(String value) {
        this.ext13 = value;
    }

    /**
     * ��ȡext14���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt14() {
        return ext14;
    }

    /**
     * ����ext14���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt14(String value) {
        this.ext14 = value;
    }

    /**
     * ��ȡext15���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt15() {
        return ext15;
    }

    /**
     * ����ext15���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt15(String value) {
        this.ext15 = value;
    }

    /**
     * ��ȡext16���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt16() {
        return ext16;
    }

    /**
     * ����ext16���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt16(String value) {
        this.ext16 = value;
    }

    /**
     * ��ȡext17���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt17() {
        return ext17;
    }

    /**
     * ����ext17���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt17(String value) {
        this.ext17 = value;
    }

    /**
     * ��ȡext18���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt18() {
        return ext18;
    }

    /**
     * ����ext18���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt18(String value) {
        this.ext18 = value;
    }

    /**
     * ��ȡext19���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt19() {
        return ext19;
    }

    /**
     * ����ext19���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt19(String value) {
        this.ext19 = value;
    }

    /**
     * ��ȡext2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt2() {
        return ext2;
    }

    /**
     * ����ext2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt2(String value) {
        this.ext2 = value;
    }

    /**
     * ��ȡext20���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt20() {
        return ext20;
    }

    /**
     * ����ext20���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt20(String value) {
        this.ext20 = value;
    }

    /**
     * ��ȡext3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt3() {
        return ext3;
    }

    /**
     * ����ext3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt3(String value) {
        this.ext3 = value;
    }

    /**
     * ��ȡext4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt4() {
        return ext4;
    }

    /**
     * ����ext4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt4(String value) {
        this.ext4 = value;
    }

    /**
     * ��ȡext5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt5() {
        return ext5;
    }

    /**
     * ����ext5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt5(String value) {
        this.ext5 = value;
    }

    /**
     * ��ȡext6���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt6() {
        return ext6;
    }

    /**
     * ����ext6���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt6(String value) {
        this.ext6 = value;
    }

    /**
     * ��ȡext7���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt7() {
        return ext7;
    }

    /**
     * ����ext7���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt7(String value) {
        this.ext7 = value;
    }

    /**
     * ��ȡext8���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt8() {
        return ext8;
    }

    /**
     * ����ext8���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt8(String value) {
        this.ext8 = value;
    }

    /**
     * ��ȡext9���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExt9() {
        return ext9;
    }

    /**
     * ����ext9���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExt9(String value) {
        this.ext9 = value;
    }

    /**
     * ��ȡbirthday���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * ����birthday���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(String value) {
        this.birthday = value;
    }

    /**
     * ��ȡcarMasterType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarMasterType() {
        return carMasterType;
    }

    /**
     * ����carMasterType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarMasterType(String value) {
        this.carMasterType = value;
    }

    /**
     * ��ȡcarNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCarNo() {
        return carNo;
    }

    /**
     * ����carNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCarNo(String value) {
        this.carNo = value;
    }

    /**
     * ��ȡseriesCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesCode() {
        return seriesCode;
    }

    /**
     * ����seriesCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesCode(String value) {
        this.seriesCode = value;
    }

    /**
     * ��ȡcompany���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompany() {
        return company;
    }

    /**
     * ����company���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompany(String value) {
        this.company = value;
    }

    /**
     * ��ȡindustry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * ����industry���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndustry(String value) {
        this.industry = value;
    }

    /**
     * ��ȡmodelName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelName() {
        return modelName;
    }

    /**
     * ����modelName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelName(String value) {
        this.modelName = value;
    }

    /**
     * ��ȡpurchaseDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * ����purchaseDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseDate(String value) {
        this.purchaseDate = value;
    }

    /**
     * ��ȡsaleDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleDate() {
        return saleDate;
    }

    /**
     * ����saleDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleDate(String value) {
        this.saleDate = value;
    }

    /**
     * ��ȡseriesName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesName() {
        return seriesName;
    }

    /**
     * ����seriesName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesName(String value) {
        this.seriesName = value;
    }

    /**
     * ��ȡsourceType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceType() {
        return sourceType;
    }

    /**
     * ����sourceType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceType(String value) {
        this.sourceType = value;
    }

    /**
     * ��ȡcolorName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColorName() {
        return colorName;
    }

    /**
     * ����colorName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColorName(String value) {
        this.colorName = value;
    }

    /**
     * ��ȡcontactIDType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactIDType() {
        return contactIDType;
    }

    /**
     * ����contactIDType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactIDType(String value) {
        this.contactIDType = value;
    }

    /**
     * ��ȡcontactIDNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactIDNumber() {
        return contactIDNumber;
    }

    /**
     * ����contactIDNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactIDNumber(String value) {
        this.contactIDNumber = value;
    }

    /**
     * ��ȡcontactType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactType() {
        return contactType;
    }

    /**
     * ����contactType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactType(String value) {
        this.contactType = value;
    }

    /**
     * ��ȡoperation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperation() {
        return operation;
    }

    /**
     * ����operation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperation(String value) {
        this.operation = value;
    }

    /**
     * ��ȡuiactive���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUiactive() {
        return uiactive;
    }

    /**
     * ����uiactive���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUiactive(String value) {
        this.uiactive = value;
    }

    /**
     * ��ȡuiselected���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUiselected() {
        return uiselected;
    }

    /**
     * ����uiselected���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUiselected(String value) {
        this.uiselected = value;
    }

}
