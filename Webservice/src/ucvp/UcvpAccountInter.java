
package ucvp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>UcvpAccountInter complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
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
     * 获取id属性的值。
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
     * 设置id属性的值。
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
     * 获取created属性的值。
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
     * 设置created属性的值。
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
     * 获取createdBy属性的值。
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
     * 设置createdBy属性的值。
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
     * 获取updated属性的值。
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
     * 设置updated属性的值。
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
     * 获取updatedBy属性的值。
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
     * 设置updatedBy属性的值。
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
     * 获取conflictId属性的值。
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
     * 设置conflictId属性的值。
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
     * 获取modId属性的值。
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
     * 设置modId属性的值。
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
     * 获取searchspec属性的值。
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
     * 设置searchspec属性的值。
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
     * 获取adsUserId属性的值。
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
     * 设置adsUserId属性的值。
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
     * 获取address属性的值。
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
     * 设置address属性的值。
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
     * 获取areaCode属性的值。
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
     * 设置areaCode属性的值。
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
     * 获取areaName属性的值。
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
     * 设置areaName属性的值。
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
     * 获取bankName属性的值。
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
     * 设置bankName属性的值。
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
     * 获取brand属性的值。
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
     * 设置brand属性的值。
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
     * 获取carNumber属性的值。
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
     * 设置carNumber属性的值。
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
     * 获取carUse属性的值。
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
     * 设置carUse属性的值。
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
     * 获取chassNumber属性的值。
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
     * 设置chassNumber属性的值。
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
     * 获取cityName属性的值。
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
     * 设置cityName属性的值。
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
     * 获取contact属性的值。
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
     * 设置contact属性的值。
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
     * 获取contactMobile属性的值。
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
     * 设置contactMobile属性的值。
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
     * 获取creditCard属性的值。
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
     * 设置creditCard属性的值。
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
     * 获取custId属性的值。
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
     * 设置custId属性的值。
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
     * 获取customerId属性的值。
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
     * 设置customerId属性的值。
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
     * 获取customerName属性的值。
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
     * 设置customerName属性的值。
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
     * 获取customerType属性的值。
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
     * 设置customerType属性的值。
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
     * 获取dmfplx属性的值。
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
     * 设置dmfplx属性的值。
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
     * 获取dmgsxc属性的值。
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
     * 设置dmgsxc属性的值。
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
     * 获取daiKuanType属性的值。
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
     * 设置daiKuanType属性的值。
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
     * 获取dataConsumer属性的值。
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
     * 设置dataConsumer属性的值。
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
     * 获取dataSource属性的值。
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
     * 设置dataSource属性的值。
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
     * 获取dealerCode属性的值。
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
     * 设置dealerCode属性的值。
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
     * 获取dealerName属性的值。
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
     * 设置dealerName属性的值。
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
     * 获取duties属性的值。
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
     * 设置duties属性的值。
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
     * 获取egNumber属性的值。
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
     * 设置egNumber属性的值。
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
     * 获取educationLevel属性的值。
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
     * 设置educationLevel属性的值。
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
     * 获取email属性的值。
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
     * 设置email属性的值。
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
     * 获取errorCode属性的值。
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
     * 设置errorCode属性的值。
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
     * 获取errorMessage属性的值。
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
     * 设置errorMessage属性的值。
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
     * 获取extNumber属性的值。
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
     * 设置extNumber属性的值。
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
     * 获取familyIncome属性的值。
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
     * 设置familyIncome属性的值。
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
     * 获取gender属性的值。
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
     * 设置gender属性的值。
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
     * 获取handtakeTime属性的值。
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
     * 设置handtakeTime属性的值。
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
     * 获取idNumber属性的值。
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
     * 设置idNumber属性的值。
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
     * 获取idType属性的值。
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
     * 设置idType属性的值。
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
     * 获取interId属性的值。
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
     * 设置interId属性的值。
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
     * 获取interiorCode属性的值。
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
     * 设置interiorCode属性的值。
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
     * 获取invoiceNumber属性的值。
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
     * 设置invoiceNumber属性的值。
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
     * 获取invoiceTime属性的值。
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
     * 设置invoiceTime属性的值。
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
     * 获取isJoinClub属性的值。
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
     * 设置isJoinClub属性的值。
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
     * 获取isOwner属性的值。
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
     * 设置isOwner属性的值。
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
     * 获取jsfxdm属性的值。
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
     * 设置jsfxdm属性的值。
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
     * 获取jobFunc属性的值。
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
     * 设置jobFunc属性的值。
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
     * 获取keyCustomerName属性的值。
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
     * 设置keyCustomerName属性的值。
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
     * 获取linkTel属性的值。
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
     * 设置linkTel属性的值。
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
     * 获取mileNumber属性的值。
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
     * 设置mileNumber属性的值。
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
     * 获取mobile属性的值。
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
     * 设置mobile属性的值。
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
     * 获取modelCode属性的值。
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
     * 设置modelCode属性的值。
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
     * 获取modelVersion属性的值。
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
     * 设置modelVersion属性的值。
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
     * 获取modelYear属性的值。
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
     * 设置modelYear属性的值。
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
     * 获取oldSaleId属性的值。
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
     * 设置oldSaleId属性的值。
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
     * 获取onSaleFlag属性的值。
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
     * 设置onSaleFlag属性的值。
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
     * 获取onSaleRemark属性的值。
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
     * 设置onSaleRemark属性的值。
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
     * 获取ownerMarriage属性的值。
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
     * 设置ownerMarriage属性的值。
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
     * 获取packageCodeList属性的值。
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
     * 设置packageCodeList属性的值。
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
     * 获取paymentType属性的值。
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
     * 设置paymentType属性的值。
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
     * 获取prospectId属性的值。
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
     * 设置prospectId属性的值。
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
     * 获取province属性的值。
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
     * 设置province属性的值。
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
     * 获取rateCode属性的值。
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
     * 设置rateCode属性的值。
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
     * 获取refuseReason属性的值。
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
     * 设置refuseReason属性的值。
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
     * 获取saleCode属性的值。
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
     * 设置saleCode属性的值。
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
     * 获取saleId属性的值。
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
     * 设置saleId属性的值。
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
     * 获取saleType属性的值。
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
     * 设置saleType属性的值。
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
     * 获取salesIDNumber属性的值。
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
     * 设置salesIDNumber属性的值。
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
     * 获取salesName属性的值。
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
     * 设置salesName属性的值。
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
     * 获取specialFeeFlag属性的值。
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
     * 设置specialFeeFlag属性的值。
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
     * 获取status属性的值。
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
     * 设置status属性的值。
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
     * 获取totalPrice属性的值。
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
     * 设置totalPrice属性的值。
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
     * 获取vin属性的值。
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
     * 设置vin属性的值。
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
     * 获取vslsbz属性的值。
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
     * 设置vslsbz属性的值。
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
     * 获取vssbcl属性的值。
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
     * 设置vssbcl属性的值。
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
     * 获取vsxsry属性的值。
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
     * 设置vsxsry属性的值。
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
     * 获取xscldm属性的值。
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
     * 设置xscldm属性的值。
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
     * 获取xsclm1属性的值。
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
     * 设置xsclm1属性的值。
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
     * 获取xscxdl属性的值。
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
     * 设置xscxdl属性的值。
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
     * 获取zipCode属性的值。
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
     * 设置zipCode属性的值。
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
     * 获取cardCode属性的值。
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
     * 设置cardCode属性的值。
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
     * 获取colorCode属性的值。
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
     * 设置colorCode属性的值。
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
     * 获取lnkId属性的值。
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
     * 设置lnkId属性的值。
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
     * 获取lnkName属性的值。
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
     * 设置lnkName属性的值。
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
     * 获取lnkTel属性的值。
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
     * 设置lnkTel属性的值。
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
     * 获取lnkType属性的值。
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
     * 设置lnkType属性的值。
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
     * 获取customerModelId属性的值。
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
     * 设置customerModelId属性的值。
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
     * 获取ext1属性的值。
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
     * 设置ext1属性的值。
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
     * 获取ext10属性的值。
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
     * 设置ext10属性的值。
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
     * 获取ext11属性的值。
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
     * 设置ext11属性的值。
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
     * 获取ext12属性的值。
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
     * 设置ext12属性的值。
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
     * 获取ext13属性的值。
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
     * 设置ext13属性的值。
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
     * 获取ext14属性的值。
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
     * 设置ext14属性的值。
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
     * 获取ext15属性的值。
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
     * 设置ext15属性的值。
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
     * 获取ext16属性的值。
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
     * 设置ext16属性的值。
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
     * 获取ext17属性的值。
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
     * 设置ext17属性的值。
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
     * 获取ext18属性的值。
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
     * 设置ext18属性的值。
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
     * 获取ext19属性的值。
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
     * 设置ext19属性的值。
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
     * 获取ext2属性的值。
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
     * 设置ext2属性的值。
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
     * 获取ext20属性的值。
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
     * 设置ext20属性的值。
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
     * 获取ext3属性的值。
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
     * 设置ext3属性的值。
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
     * 获取ext4属性的值。
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
     * 设置ext4属性的值。
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
     * 获取ext5属性的值。
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
     * 设置ext5属性的值。
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
     * 获取ext6属性的值。
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
     * 设置ext6属性的值。
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
     * 获取ext7属性的值。
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
     * 设置ext7属性的值。
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
     * 获取ext8属性的值。
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
     * 设置ext8属性的值。
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
     * 获取ext9属性的值。
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
     * 设置ext9属性的值。
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
     * 获取birthday属性的值。
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
     * 设置birthday属性的值。
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
     * 获取carMasterType属性的值。
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
     * 设置carMasterType属性的值。
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
     * 获取carNo属性的值。
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
     * 设置carNo属性的值。
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
     * 获取seriesCode属性的值。
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
     * 设置seriesCode属性的值。
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
     * 获取company属性的值。
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
     * 设置company属性的值。
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
     * 获取industry属性的值。
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
     * 设置industry属性的值。
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
     * 获取modelName属性的值。
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
     * 设置modelName属性的值。
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
     * 获取purchaseDate属性的值。
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
     * 设置purchaseDate属性的值。
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
     * 获取saleDate属性的值。
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
     * 设置saleDate属性的值。
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
     * 获取seriesName属性的值。
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
     * 设置seriesName属性的值。
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
     * 获取sourceType属性的值。
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
     * 设置sourceType属性的值。
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
     * 获取colorName属性的值。
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
     * 设置colorName属性的值。
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
     * 获取contactIDType属性的值。
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
     * 设置contactIDType属性的值。
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
     * 获取contactIDNumber属性的值。
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
     * 设置contactIDNumber属性的值。
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
     * 获取contactType属性的值。
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
     * 设置contactType属性的值。
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
     * 获取operation属性的值。
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
     * 设置operation属性的值。
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
     * 获取uiactive属性的值。
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
     * 设置uiactive属性的值。
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
     * 获取uiselected属性的值。
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
     * 设置uiselected属性的值。
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
