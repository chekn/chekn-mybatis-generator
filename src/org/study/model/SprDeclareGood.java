package org.study.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SprDeclareGood implements Serializable {
    private String id;
    private String sSDcustomsDeclarationFormDtlId;
    private Integer iRowNo;
    private String sGoodsCode;
    private String sGoodsNameCn;
    private String sGoodsNameEn;
    private String sFullGoodsName;
    private String sGoodsModel;
    private Double nDeclareQuantity;
    private Integer iDeclareUnitId;
    private String sDeclareUnitCode;
    private String sDeclareUnitName;
    private BigDecimal nTradePrice;
    private BigDecimal nTradeTotalAmountPre;
    private BigDecimal nTradeTotalAmount;
    private Integer iTradeCurrencyId;
    private String sTradeCurrencyCode;
    private String sTradeCurrencyName;
    private Double iQuantity1;
    private Integer iFirstUnitId;
    private String sFirstUnitCode;
    private String sFirstUnitName;
    private Integer iCHlevyExemptionId;
    private String sCHlevyExemptionCode;
    private String sCHlevyExemptionName;
    private Double iQuantity2;
    private Integer iSecondUnitId;
    private String sSecondUnitCode;
    private String sSecondUnitName;
    private Integer iOriginCountryId;
    private String sOriginCountryCode;
    private String sOriginCountryNameCn;
    private String sOriginCountryNameEn;
    private Integer iTargetCountryId;
    private String sTargetCountryCode;
    private String sTargetCountryNameCn;
    private String sTargetCountryNameEn;
    private Byte bDeleted;
    private String sCreator;
    private Date tCreateTime;
    private String sUpdateMan;
    private Date tUpdateTime;
    private String sRemark;
    private Integer iNewTradeSerialNumber;
    private String sProductModel;
    private String sManufacturer;
    private String sFineshGoodsNo;
    private String sFineshGoodsVersion;
    private Double nProcessingFees;
    private Integer iOriginCertificateItem;
    private Integer iBoxRowNo;
    private Integer iPBcommodityWarehouseId;
    private String sGoodsModelEx;
    private Integer iSDcustomsDeclarationOrderHdrId;
    private Integer iSequenceNo;
    private Date tDeclareDate;
    private String sCustomsNo;
    private Integer iCHcustomsAreaId;
    private String sCHcustomsAreaCode;
    private String sCHcustomsAreaName;
    private String sManualNo;
    private String sContractNo;
    private String dImportsDate;
    private Integer iTradeCompanyId;
    private String sTradeCompanyNo;
    private String sTradeCompanyNameCn;
    private String sTradeCompanyNameEn;
    private Integer iCHtransportationModeId;
    private String sCHtransportationModeCode;
    private String sCHtransportationModeName;
    private Integer iReceiverCompanyId;
    private String sReceiverCompanyNo;
    private String sReceiverCompanyNameCn;
    private String sReceiverCompanyNameEn;
    private String sTransportationName;
    private String sTransportationNo;
    private Integer iAgentCompanyId;
    private String sAgentCompanyNo;
    private String sAgentCompanyNameCn;
    private String sAgentCompanyNameEn;
    private String sPickUpBillNo;
    private Integer iCHtaxKindId;
    private String sCHtaxKindCode;
    private String sCHtaxKindName;
    private String sCHtaxKindFullName;
    private String sLisenceNo;
    private Integer iTradeCountryId;
    private String sTradeCountryCode;
    private String sTradeCountryNameCn;
    private String sTradeCountryNameEn;
    private Integer iLoadingCountryId;
    private String sLoadingCountryCode;
    private String sLoadingCountryNameCn;
    private String sLoadingCountryNameEn;
    private Integer iDomesticSupplyOfGoodsToId;
    private String sDomesticSupplyOfGoodsToCode;
    private String sDomesticSupplyOfGoodsToName;
    private Integer iCHtransactionTypeId;
    private String sCHtransactionTypeCode;
    private String sCHtransactionTypeName;
    private Integer iPackCount;
    private Double nGrossWeight;
    private Double nNetWeight;
    private String sAttachedBills;
    private Integer iCHharbourId;
    private String sCHharbourCode;
    private String sCHharbourNameCn;
    private String sCHharbourNameEn;
    private String sSupplierInfo;
    private String sOrderNo;
    private String sCustomerBillNo;
    private Integer iCHregulationFormId;
    private String sCHregulationFormCode;
    private String sCHregulationFormName;
    private String sPackingType;
    private Integer iCustomsDeclarationOrderStatus;
    private String sCustomsDeclarationOrderStatus;
    private Integer iDeclarationPortId;
    private String sDeclarationPortCode;
    private String sDeclarationPortName;
    private Integer iPaperlessDeclare;
    private Double nTaxRate;
    private String sCustomsNoRef;
    private String sManualNoRef;
    private String sBondedWarehouseNo;
    private String sPaperlessDeclare;
    private String sCustomsDeclarationTypeCode;
    private String sCustomsDeclarationTypeName;
    private String sTariffName;
    private Integer iPriorityLevel;
    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
    public String getsSDcustomsDeclarationFormDtlId() {
        return sSDcustomsDeclarationFormDtlId;
    }
    public void setsSDcustomsDeclarationFormDtlId(String sSDcustomsDeclarationFormDtlId) {
        this.sSDcustomsDeclarationFormDtlId = sSDcustomsDeclarationFormDtlId == null ? null : sSDcustomsDeclarationFormDtlId.trim();
    }
    public Integer getiRowNo() {
        return iRowNo;
    }
    public void setiRowNo(Integer iRowNo) {
        this.iRowNo = iRowNo;
    }
    public String getsGoodsCode() {
        return sGoodsCode;
    }
    public void setsGoodsCode(String sGoodsCode) {
        this.sGoodsCode = sGoodsCode == null ? null : sGoodsCode.trim();
    }
    public String getsGoodsNameCn() {
        return sGoodsNameCn;
    }
    public void setsGoodsNameCn(String sGoodsNameCn) {
        this.sGoodsNameCn = sGoodsNameCn == null ? null : sGoodsNameCn.trim();
    }
    public String getsGoodsNameEn() {
        return sGoodsNameEn;
    }
    public void setsGoodsNameEn(String sGoodsNameEn) {
        this.sGoodsNameEn = sGoodsNameEn == null ? null : sGoodsNameEn.trim();
    }
    public String getsFullGoodsName() {
        return sFullGoodsName;
    }
    public void setsFullGoodsName(String sFullGoodsName) {
        this.sFullGoodsName = sFullGoodsName == null ? null : sFullGoodsName.trim();
    }
    public String getsGoodsModel() {
        return sGoodsModel;
    }
    public void setsGoodsModel(String sGoodsModel) {
        this.sGoodsModel = sGoodsModel == null ? null : sGoodsModel.trim();
    }
    public Double getnDeclareQuantity() {
        return nDeclareQuantity;
    }
    public void setnDeclareQuantity(Double nDeclareQuantity) {
        this.nDeclareQuantity = nDeclareQuantity;
    }
    public Integer getiDeclareUnitId() {
        return iDeclareUnitId;
    }
    public void setiDeclareUnitId(Integer iDeclareUnitId) {
        this.iDeclareUnitId = iDeclareUnitId;
    }
    public String getsDeclareUnitCode() {
        return sDeclareUnitCode;
    }
    public void setsDeclareUnitCode(String sDeclareUnitCode) {
        this.sDeclareUnitCode = sDeclareUnitCode == null ? null : sDeclareUnitCode.trim();
    }
    public String getsDeclareUnitName() {
        return sDeclareUnitName;
    }
    public void setsDeclareUnitName(String sDeclareUnitName) {
        this.sDeclareUnitName = sDeclareUnitName == null ? null : sDeclareUnitName.trim();
    }
    public BigDecimal getnTradePrice() {
        return nTradePrice;
    }
    public void setnTradePrice(BigDecimal nTradePrice) {
        this.nTradePrice = nTradePrice;
    }
    public BigDecimal getnTradeTotalAmountPre() {
        return nTradeTotalAmountPre;
    }
    public void setnTradeTotalAmountPre(BigDecimal nTradeTotalAmountPre) {
        this.nTradeTotalAmountPre = nTradeTotalAmountPre;
    }
    public BigDecimal getnTradeTotalAmount() {
        return nTradeTotalAmount;
    }
    public void setnTradeTotalAmount(BigDecimal nTradeTotalAmount) {
        this.nTradeTotalAmount = nTradeTotalAmount;
    }
    public Integer getiTradeCurrencyId() {
        return iTradeCurrencyId;
    }
    public void setiTradeCurrencyId(Integer iTradeCurrencyId) {
        this.iTradeCurrencyId = iTradeCurrencyId;
    }
    public String getsTradeCurrencyCode() {
        return sTradeCurrencyCode;
    }
    public void setsTradeCurrencyCode(String sTradeCurrencyCode) {
        this.sTradeCurrencyCode = sTradeCurrencyCode == null ? null : sTradeCurrencyCode.trim();
    }
    public String getsTradeCurrencyName() {
        return sTradeCurrencyName;
    }
    public void setsTradeCurrencyName(String sTradeCurrencyName) {
        this.sTradeCurrencyName = sTradeCurrencyName == null ? null : sTradeCurrencyName.trim();
    }
    public Double getiQuantity1() {
        return iQuantity1;
    }
    public void setiQuantity1(Double iQuantity1) {
        this.iQuantity1 = iQuantity1;
    }
    public Integer getiFirstUnitId() {
        return iFirstUnitId;
    }
    public void setiFirstUnitId(Integer iFirstUnitId) {
        this.iFirstUnitId = iFirstUnitId;
    }
    public String getsFirstUnitCode() {
        return sFirstUnitCode;
    }
    public void setsFirstUnitCode(String sFirstUnitCode) {
        this.sFirstUnitCode = sFirstUnitCode == null ? null : sFirstUnitCode.trim();
    }
    public String getsFirstUnitName() {
        return sFirstUnitName;
    }
    public void setsFirstUnitName(String sFirstUnitName) {
        this.sFirstUnitName = sFirstUnitName == null ? null : sFirstUnitName.trim();
    }
    public Integer getiCHlevyExemptionId() {
        return iCHlevyExemptionId;
    }
    public void setiCHlevyExemptionId(Integer iCHlevyExemptionId) {
        this.iCHlevyExemptionId = iCHlevyExemptionId;
    }
    public String getsCHlevyExemptionCode() {
        return sCHlevyExemptionCode;
    }
    public void setsCHlevyExemptionCode(String sCHlevyExemptionCode) {
        this.sCHlevyExemptionCode = sCHlevyExemptionCode == null ? null : sCHlevyExemptionCode.trim();
    }
    public String getsCHlevyExemptionName() {
        return sCHlevyExemptionName;
    }
    public void setsCHlevyExemptionName(String sCHlevyExemptionName) {
        this.sCHlevyExemptionName = sCHlevyExemptionName == null ? null : sCHlevyExemptionName.trim();
    }
    public Double getiQuantity2() {
        return iQuantity2;
    }
    public void setiQuantity2(Double iQuantity2) {
        this.iQuantity2 = iQuantity2;
    }
    public Integer getiSecondUnitId() {
        return iSecondUnitId;
    }
    public void setiSecondUnitId(Integer iSecondUnitId) {
        this.iSecondUnitId = iSecondUnitId;
    }
    public String getsSecondUnitCode() {
        return sSecondUnitCode;
    }
    public void setsSecondUnitCode(String sSecondUnitCode) {
        this.sSecondUnitCode = sSecondUnitCode == null ? null : sSecondUnitCode.trim();
    }
    public String getsSecondUnitName() {
        return sSecondUnitName;
    }
    public void setsSecondUnitName(String sSecondUnitName) {
        this.sSecondUnitName = sSecondUnitName == null ? null : sSecondUnitName.trim();
    }
    public Integer getiOriginCountryId() {
        return iOriginCountryId;
    }
    public void setiOriginCountryId(Integer iOriginCountryId) {
        this.iOriginCountryId = iOriginCountryId;
    }
    public String getsOriginCountryCode() {
        return sOriginCountryCode;
    }
    public void setsOriginCountryCode(String sOriginCountryCode) {
        this.sOriginCountryCode = sOriginCountryCode == null ? null : sOriginCountryCode.trim();
    }
    public String getsOriginCountryNameCn() {
        return sOriginCountryNameCn;
    }
    public void setsOriginCountryNameCn(String sOriginCountryNameCn) {
        this.sOriginCountryNameCn = sOriginCountryNameCn == null ? null : sOriginCountryNameCn.trim();
    }
    public String getsOriginCountryNameEn() {
        return sOriginCountryNameEn;
    }
    public void setsOriginCountryNameEn(String sOriginCountryNameEn) {
        this.sOriginCountryNameEn = sOriginCountryNameEn == null ? null : sOriginCountryNameEn.trim();
    }
    public Integer getiTargetCountryId() {
        return iTargetCountryId;
    }
    public void setiTargetCountryId(Integer iTargetCountryId) {
        this.iTargetCountryId = iTargetCountryId;
    }
    public String getsTargetCountryCode() {
        return sTargetCountryCode;
    }
    public void setsTargetCountryCode(String sTargetCountryCode) {
        this.sTargetCountryCode = sTargetCountryCode == null ? null : sTargetCountryCode.trim();
    }
    public String getsTargetCountryNameCn() {
        return sTargetCountryNameCn;
    }
    public void setsTargetCountryNameCn(String sTargetCountryNameCn) {
        this.sTargetCountryNameCn = sTargetCountryNameCn == null ? null : sTargetCountryNameCn.trim();
    }
    public String getsTargetCountryNameEn() {
        return sTargetCountryNameEn;
    }
    public void setsTargetCountryNameEn(String sTargetCountryNameEn) {
        this.sTargetCountryNameEn = sTargetCountryNameEn == null ? null : sTargetCountryNameEn.trim();
    }
    public Byte getbDeleted() {
        return bDeleted;
    }
    public void setbDeleted(Byte bDeleted) {
        this.bDeleted = bDeleted;
    }
    public String getsCreator() {
        return sCreator;
    }
    public void setsCreator(String sCreator) {
        this.sCreator = sCreator == null ? null : sCreator.trim();
    }
    public Date gettCreateTime() {
        return tCreateTime;
    }
    public void settCreateTime(Date tCreateTime) {
        this.tCreateTime = tCreateTime;
    }
    public String getsUpdateMan() {
        return sUpdateMan;
    }
    public void setsUpdateMan(String sUpdateMan) {
        this.sUpdateMan = sUpdateMan == null ? null : sUpdateMan.trim();
    }
    public Date gettUpdateTime() {
        return tUpdateTime;
    }
    public void settUpdateTime(Date tUpdateTime) {
        this.tUpdateTime = tUpdateTime;
    }
    public String getsRemark() {
        return sRemark;
    }
    public void setsRemark(String sRemark) {
        this.sRemark = sRemark == null ? null : sRemark.trim();
    }
    public Integer getiNewTradeSerialNumber() {
        return iNewTradeSerialNumber;
    }
    public void setiNewTradeSerialNumber(Integer iNewTradeSerialNumber) {
        this.iNewTradeSerialNumber = iNewTradeSerialNumber;
    }
    public String getsProductModel() {
        return sProductModel;
    }
    public void setsProductModel(String sProductModel) {
        this.sProductModel = sProductModel == null ? null : sProductModel.trim();
    }
    public String getsManufacturer() {
        return sManufacturer;
    }
    public void setsManufacturer(String sManufacturer) {
        this.sManufacturer = sManufacturer == null ? null : sManufacturer.trim();
    }
    public String getsFineshGoodsNo() {
        return sFineshGoodsNo;
    }
    public void setsFineshGoodsNo(String sFineshGoodsNo) {
        this.sFineshGoodsNo = sFineshGoodsNo == null ? null : sFineshGoodsNo.trim();
    }
    public String getsFineshGoodsVersion() {
        return sFineshGoodsVersion;
    }
    public void setsFineshGoodsVersion(String sFineshGoodsVersion) {
        this.sFineshGoodsVersion = sFineshGoodsVersion == null ? null : sFineshGoodsVersion.trim();
    }
    public Double getnProcessingFees() {
        return nProcessingFees;
    }
    public void setnProcessingFees(Double nProcessingFees) {
        this.nProcessingFees = nProcessingFees;
    }
    public Integer getiOriginCertificateItem() {
        return iOriginCertificateItem;
    }
    public void setiOriginCertificateItem(Integer iOriginCertificateItem) {
        this.iOriginCertificateItem = iOriginCertificateItem;
    }
    public Integer getiBoxRowNo() {
        return iBoxRowNo;
    }
    public void setiBoxRowNo(Integer iBoxRowNo) {
        this.iBoxRowNo = iBoxRowNo;
    }
    public Integer getiPBcommodityWarehouseId() {
        return iPBcommodityWarehouseId;
    }
    public void setiPBcommodityWarehouseId(Integer iPBcommodityWarehouseId) {
        this.iPBcommodityWarehouseId = iPBcommodityWarehouseId;
    }
    public String getsGoodsModelEx() {
        return sGoodsModelEx;
    }
    public void setsGoodsModelEx(String sGoodsModelEx) {
        this.sGoodsModelEx = sGoodsModelEx == null ? null : sGoodsModelEx.trim();
    }
    public Integer getiSDcustomsDeclarationOrderHdrId() {
        return iSDcustomsDeclarationOrderHdrId;
    }
    public void setiSDcustomsDeclarationOrderHdrId(Integer iSDcustomsDeclarationOrderHdrId) {
        this.iSDcustomsDeclarationOrderHdrId = iSDcustomsDeclarationOrderHdrId;
    }
    public Integer getiSequenceNo() {
        return iSequenceNo;
    }
    public void setiSequenceNo(Integer iSequenceNo) {
        this.iSequenceNo = iSequenceNo;
    }
    public Date gettDeclareDate() {
        return tDeclareDate;
    }
    public void settDeclareDate(Date tDeclareDate) {
        this.tDeclareDate = tDeclareDate;
    }
    public String getsCustomsNo() {
        return sCustomsNo;
    }
    public void setsCustomsNo(String sCustomsNo) {
        this.sCustomsNo = sCustomsNo == null ? null : sCustomsNo.trim();
    }
    public Integer getiCHcustomsAreaId() {
        return iCHcustomsAreaId;
    }
    public void setiCHcustomsAreaId(Integer iCHcustomsAreaId) {
        this.iCHcustomsAreaId = iCHcustomsAreaId;
    }
    public String getsCHcustomsAreaCode() {
        return sCHcustomsAreaCode;
    }
    public void setsCHcustomsAreaCode(String sCHcustomsAreaCode) {
        this.sCHcustomsAreaCode = sCHcustomsAreaCode == null ? null : sCHcustomsAreaCode.trim();
    }
    public String getsCHcustomsAreaName() {
        return sCHcustomsAreaName;
    }
    public void setsCHcustomsAreaName(String sCHcustomsAreaName) {
        this.sCHcustomsAreaName = sCHcustomsAreaName == null ? null : sCHcustomsAreaName.trim();
    }
    public String getsManualNo() {
        return sManualNo;
    }
    public void setsManualNo(String sManualNo) {
        this.sManualNo = sManualNo == null ? null : sManualNo.trim();
    }
    public String getsContractNo() {
        return sContractNo;
    }
    public void setsContractNo(String sContractNo) {
        this.sContractNo = sContractNo == null ? null : sContractNo.trim();
    }
    public String getdImportsDate() {
        return dImportsDate;
    }
    public void setdImportsDate(String dImportsDate) {
        this.dImportsDate = dImportsDate == null ? null : dImportsDate.trim();
    }
    public Integer getiTradeCompanyId() {
        return iTradeCompanyId;
    }
    public void setiTradeCompanyId(Integer iTradeCompanyId) {
        this.iTradeCompanyId = iTradeCompanyId;
    }
    public String getsTradeCompanyNo() {
        return sTradeCompanyNo;
    }
    public void setsTradeCompanyNo(String sTradeCompanyNo) {
        this.sTradeCompanyNo = sTradeCompanyNo == null ? null : sTradeCompanyNo.trim();
    }
    public String getsTradeCompanyNameCn() {
        return sTradeCompanyNameCn;
    }
    public void setsTradeCompanyNameCn(String sTradeCompanyNameCn) {
        this.sTradeCompanyNameCn = sTradeCompanyNameCn == null ? null : sTradeCompanyNameCn.trim();
    }
    public String getsTradeCompanyNameEn() {
        return sTradeCompanyNameEn;
    }
    public void setsTradeCompanyNameEn(String sTradeCompanyNameEn) {
        this.sTradeCompanyNameEn = sTradeCompanyNameEn == null ? null : sTradeCompanyNameEn.trim();
    }
    public Integer getiCHtransportationModeId() {
        return iCHtransportationModeId;
    }
    public void setiCHtransportationModeId(Integer iCHtransportationModeId) {
        this.iCHtransportationModeId = iCHtransportationModeId;
    }
    public String getsCHtransportationModeCode() {
        return sCHtransportationModeCode;
    }
    public void setsCHtransportationModeCode(String sCHtransportationModeCode) {
        this.sCHtransportationModeCode = sCHtransportationModeCode == null ? null : sCHtransportationModeCode.trim();
    }
    public String getsCHtransportationModeName() {
        return sCHtransportationModeName;
    }
    public void setsCHtransportationModeName(String sCHtransportationModeName) {
        this.sCHtransportationModeName = sCHtransportationModeName == null ? null : sCHtransportationModeName.trim();
    }
    public Integer getiReceiverCompanyId() {
        return iReceiverCompanyId;
    }
    public void setiReceiverCompanyId(Integer iReceiverCompanyId) {
        this.iReceiverCompanyId = iReceiverCompanyId;
    }
    public String getsReceiverCompanyNo() {
        return sReceiverCompanyNo;
    }
    public void setsReceiverCompanyNo(String sReceiverCompanyNo) {
        this.sReceiverCompanyNo = sReceiverCompanyNo == null ? null : sReceiverCompanyNo.trim();
    }
    public String getsReceiverCompanyNameCn() {
        return sReceiverCompanyNameCn;
    }
    public void setsReceiverCompanyNameCn(String sReceiverCompanyNameCn) {
        this.sReceiverCompanyNameCn = sReceiverCompanyNameCn == null ? null : sReceiverCompanyNameCn.trim();
    }
    public String getsReceiverCompanyNameEn() {
        return sReceiverCompanyNameEn;
    }
    public void setsReceiverCompanyNameEn(String sReceiverCompanyNameEn) {
        this.sReceiverCompanyNameEn = sReceiverCompanyNameEn == null ? null : sReceiverCompanyNameEn.trim();
    }
    public String getsTransportationName() {
        return sTransportationName;
    }
    public void setsTransportationName(String sTransportationName) {
        this.sTransportationName = sTransportationName == null ? null : sTransportationName.trim();
    }
    public String getsTransportationNo() {
        return sTransportationNo;
    }
    public void setsTransportationNo(String sTransportationNo) {
        this.sTransportationNo = sTransportationNo == null ? null : sTransportationNo.trim();
    }
    public Integer getiAgentCompanyId() {
        return iAgentCompanyId;
    }
    public void setiAgentCompanyId(Integer iAgentCompanyId) {
        this.iAgentCompanyId = iAgentCompanyId;
    }
    public String getsAgentCompanyNo() {
        return sAgentCompanyNo;
    }
    public void setsAgentCompanyNo(String sAgentCompanyNo) {
        this.sAgentCompanyNo = sAgentCompanyNo == null ? null : sAgentCompanyNo.trim();
    }
    public String getsAgentCompanyNameCn() {
        return sAgentCompanyNameCn;
    }
    public void setsAgentCompanyNameCn(String sAgentCompanyNameCn) {
        this.sAgentCompanyNameCn = sAgentCompanyNameCn == null ? null : sAgentCompanyNameCn.trim();
    }
    public String getsAgentCompanyNameEn() {
        return sAgentCompanyNameEn;
    }
    public void setsAgentCompanyNameEn(String sAgentCompanyNameEn) {
        this.sAgentCompanyNameEn = sAgentCompanyNameEn == null ? null : sAgentCompanyNameEn.trim();
    }
    public String getsPickUpBillNo() {
        return sPickUpBillNo;
    }
    public void setsPickUpBillNo(String sPickUpBillNo) {
        this.sPickUpBillNo = sPickUpBillNo == null ? null : sPickUpBillNo.trim();
    }
    public Integer getiCHtaxKindId() {
        return iCHtaxKindId;
    }
    public void setiCHtaxKindId(Integer iCHtaxKindId) {
        this.iCHtaxKindId = iCHtaxKindId;
    }
    public String getsCHtaxKindCode() {
        return sCHtaxKindCode;
    }
    public void setsCHtaxKindCode(String sCHtaxKindCode) {
        this.sCHtaxKindCode = sCHtaxKindCode == null ? null : sCHtaxKindCode.trim();
    }
    public String getsCHtaxKindName() {
        return sCHtaxKindName;
    }
    public void setsCHtaxKindName(String sCHtaxKindName) {
        this.sCHtaxKindName = sCHtaxKindName == null ? null : sCHtaxKindName.trim();
    }
    public String getsCHtaxKindFullName() {
        return sCHtaxKindFullName;
    }
    public void setsCHtaxKindFullName(String sCHtaxKindFullName) {
        this.sCHtaxKindFullName = sCHtaxKindFullName == null ? null : sCHtaxKindFullName.trim();
    }
    public String getsLisenceNo() {
        return sLisenceNo;
    }
    public void setsLisenceNo(String sLisenceNo) {
        this.sLisenceNo = sLisenceNo == null ? null : sLisenceNo.trim();
    }
    public Integer getiTradeCountryId() {
        return iTradeCountryId;
    }
    public void setiTradeCountryId(Integer iTradeCountryId) {
        this.iTradeCountryId = iTradeCountryId;
    }
    public String getsTradeCountryCode() {
        return sTradeCountryCode;
    }
    public void setsTradeCountryCode(String sTradeCountryCode) {
        this.sTradeCountryCode = sTradeCountryCode == null ? null : sTradeCountryCode.trim();
    }
    public String getsTradeCountryNameCn() {
        return sTradeCountryNameCn;
    }
    public void setsTradeCountryNameCn(String sTradeCountryNameCn) {
        this.sTradeCountryNameCn = sTradeCountryNameCn == null ? null : sTradeCountryNameCn.trim();
    }
    public String getsTradeCountryNameEn() {
        return sTradeCountryNameEn;
    }
    public void setsTradeCountryNameEn(String sTradeCountryNameEn) {
        this.sTradeCountryNameEn = sTradeCountryNameEn == null ? null : sTradeCountryNameEn.trim();
    }
    public Integer getiLoadingCountryId() {
        return iLoadingCountryId;
    }
    public void setiLoadingCountryId(Integer iLoadingCountryId) {
        this.iLoadingCountryId = iLoadingCountryId;
    }
    public String getsLoadingCountryCode() {
        return sLoadingCountryCode;
    }
    public void setsLoadingCountryCode(String sLoadingCountryCode) {
        this.sLoadingCountryCode = sLoadingCountryCode == null ? null : sLoadingCountryCode.trim();
    }
    public String getsLoadingCountryNameCn() {
        return sLoadingCountryNameCn;
    }
    public void setsLoadingCountryNameCn(String sLoadingCountryNameCn) {
        this.sLoadingCountryNameCn = sLoadingCountryNameCn == null ? null : sLoadingCountryNameCn.trim();
    }
    public String getsLoadingCountryNameEn() {
        return sLoadingCountryNameEn;
    }
    public void setsLoadingCountryNameEn(String sLoadingCountryNameEn) {
        this.sLoadingCountryNameEn = sLoadingCountryNameEn == null ? null : sLoadingCountryNameEn.trim();
    }
    public Integer getiDomesticSupplyOfGoodsToId() {
        return iDomesticSupplyOfGoodsToId;
    }
    public void setiDomesticSupplyOfGoodsToId(Integer iDomesticSupplyOfGoodsToId) {
        this.iDomesticSupplyOfGoodsToId = iDomesticSupplyOfGoodsToId;
    }
    public String getsDomesticSupplyOfGoodsToCode() {
        return sDomesticSupplyOfGoodsToCode;
    }
    public void setsDomesticSupplyOfGoodsToCode(String sDomesticSupplyOfGoodsToCode) {
        this.sDomesticSupplyOfGoodsToCode = sDomesticSupplyOfGoodsToCode == null ? null : sDomesticSupplyOfGoodsToCode.trim();
    }
    public String getsDomesticSupplyOfGoodsToName() {
        return sDomesticSupplyOfGoodsToName;
    }
    public void setsDomesticSupplyOfGoodsToName(String sDomesticSupplyOfGoodsToName) {
        this.sDomesticSupplyOfGoodsToName = sDomesticSupplyOfGoodsToName == null ? null : sDomesticSupplyOfGoodsToName.trim();
    }
    public Integer getiCHtransactionTypeId() {
        return iCHtransactionTypeId;
    }
    public void setiCHtransactionTypeId(Integer iCHtransactionTypeId) {
        this.iCHtransactionTypeId = iCHtransactionTypeId;
    }
    public String getsCHtransactionTypeCode() {
        return sCHtransactionTypeCode;
    }
    public void setsCHtransactionTypeCode(String sCHtransactionTypeCode) {
        this.sCHtransactionTypeCode = sCHtransactionTypeCode == null ? null : sCHtransactionTypeCode.trim();
    }
    public String getsCHtransactionTypeName() {
        return sCHtransactionTypeName;
    }
    public void setsCHtransactionTypeName(String sCHtransactionTypeName) {
        this.sCHtransactionTypeName = sCHtransactionTypeName == null ? null : sCHtransactionTypeName.trim();
    }
    public Integer getiPackCount() {
        return iPackCount;
    }
    public void setiPackCount(Integer iPackCount) {
        this.iPackCount = iPackCount;
    }
    public Double getnGrossWeight() {
        return nGrossWeight;
    }
    public void setnGrossWeight(Double nGrossWeight) {
        this.nGrossWeight = nGrossWeight;
    }
    public Double getnNetWeight() {
        return nNetWeight;
    }
    public void setnNetWeight(Double nNetWeight) {
        this.nNetWeight = nNetWeight;
    }
    public String getsAttachedBills() {
        return sAttachedBills;
    }
    public void setsAttachedBills(String sAttachedBills) {
        this.sAttachedBills = sAttachedBills == null ? null : sAttachedBills.trim();
    }
    public Integer getiCHharbourId() {
        return iCHharbourId;
    }
    public void setiCHharbourId(Integer iCHharbourId) {
        this.iCHharbourId = iCHharbourId;
    }
    public String getsCHharbourCode() {
        return sCHharbourCode;
    }
    public void setsCHharbourCode(String sCHharbourCode) {
        this.sCHharbourCode = sCHharbourCode == null ? null : sCHharbourCode.trim();
    }
    public String getsCHharbourNameCn() {
        return sCHharbourNameCn;
    }
    public void setsCHharbourNameCn(String sCHharbourNameCn) {
        this.sCHharbourNameCn = sCHharbourNameCn == null ? null : sCHharbourNameCn.trim();
    }
    public String getsCHharbourNameEn() {
        return sCHharbourNameEn;
    }
    public void setsCHharbourNameEn(String sCHharbourNameEn) {
        this.sCHharbourNameEn = sCHharbourNameEn == null ? null : sCHharbourNameEn.trim();
    }
    public String getsSupplierInfo() {
        return sSupplierInfo;
    }
    public void setsSupplierInfo(String sSupplierInfo) {
        this.sSupplierInfo = sSupplierInfo == null ? null : sSupplierInfo.trim();
    }
    public String getsOrderNo() {
        return sOrderNo;
    }
    public void setsOrderNo(String sOrderNo) {
        this.sOrderNo = sOrderNo == null ? null : sOrderNo.trim();
    }
    public String getsCustomerBillNo() {
        return sCustomerBillNo;
    }
    public void setsCustomerBillNo(String sCustomerBillNo) {
        this.sCustomerBillNo = sCustomerBillNo == null ? null : sCustomerBillNo.trim();
    }
    public Integer getiCHregulationFormId() {
        return iCHregulationFormId;
    }
    public void setiCHregulationFormId(Integer iCHregulationFormId) {
        this.iCHregulationFormId = iCHregulationFormId;
    }
    public String getsCHregulationFormCode() {
        return sCHregulationFormCode;
    }
    public void setsCHregulationFormCode(String sCHregulationFormCode) {
        this.sCHregulationFormCode = sCHregulationFormCode == null ? null : sCHregulationFormCode.trim();
    }
    public String getsCHregulationFormName() {
        return sCHregulationFormName;
    }
    public void setsCHregulationFormName(String sCHregulationFormName) {
        this.sCHregulationFormName = sCHregulationFormName == null ? null : sCHregulationFormName.trim();
    }
    public String getsPackingType() {
        return sPackingType;
    }
    public void setsPackingType(String sPackingType) {
        this.sPackingType = sPackingType == null ? null : sPackingType.trim();
    }
    public Integer getiCustomsDeclarationOrderStatus() {
        return iCustomsDeclarationOrderStatus;
    }
    public void setiCustomsDeclarationOrderStatus(Integer iCustomsDeclarationOrderStatus) {
        this.iCustomsDeclarationOrderStatus = iCustomsDeclarationOrderStatus;
    }
    public String getsCustomsDeclarationOrderStatus() {
        return sCustomsDeclarationOrderStatus;
    }
    public void setsCustomsDeclarationOrderStatus(String sCustomsDeclarationOrderStatus) {
        this.sCustomsDeclarationOrderStatus = sCustomsDeclarationOrderStatus == null ? null : sCustomsDeclarationOrderStatus.trim();
    }
    public Integer getiDeclarationPortId() {
        return iDeclarationPortId;
    }
    public void setiDeclarationPortId(Integer iDeclarationPortId) {
        this.iDeclarationPortId = iDeclarationPortId;
    }
    public String getsDeclarationPortCode() {
        return sDeclarationPortCode;
    }
    public void setsDeclarationPortCode(String sDeclarationPortCode) {
        this.sDeclarationPortCode = sDeclarationPortCode == null ? null : sDeclarationPortCode.trim();
    }
    public String getsDeclarationPortName() {
        return sDeclarationPortName;
    }
    public void setsDeclarationPortName(String sDeclarationPortName) {
        this.sDeclarationPortName = sDeclarationPortName == null ? null : sDeclarationPortName.trim();
    }
    public Integer getiPaperlessDeclare() {
        return iPaperlessDeclare;
    }
    public void setiPaperlessDeclare(Integer iPaperlessDeclare) {
        this.iPaperlessDeclare = iPaperlessDeclare;
    }
    public Double getnTaxRate() {
        return nTaxRate;
    }
    public void setnTaxRate(Double nTaxRate) {
        this.nTaxRate = nTaxRate;
    }
    public String getsCustomsNoRef() {
        return sCustomsNoRef;
    }
    public void setsCustomsNoRef(String sCustomsNoRef) {
        this.sCustomsNoRef = sCustomsNoRef == null ? null : sCustomsNoRef.trim();
    }
    public String getsManualNoRef() {
        return sManualNoRef;
    }
    public void setsManualNoRef(String sManualNoRef) {
        this.sManualNoRef = sManualNoRef == null ? null : sManualNoRef.trim();
    }
    public String getsBondedWarehouseNo() {
        return sBondedWarehouseNo;
    }
    public void setsBondedWarehouseNo(String sBondedWarehouseNo) {
        this.sBondedWarehouseNo = sBondedWarehouseNo == null ? null : sBondedWarehouseNo.trim();
    }
    public String getsPaperlessDeclare() {
        return sPaperlessDeclare;
    }
    public void setsPaperlessDeclare(String sPaperlessDeclare) {
        this.sPaperlessDeclare = sPaperlessDeclare == null ? null : sPaperlessDeclare.trim();
    }
    public String getsCustomsDeclarationTypeCode() {
        return sCustomsDeclarationTypeCode;
    }
    public void setsCustomsDeclarationTypeCode(String sCustomsDeclarationTypeCode) {
        this.sCustomsDeclarationTypeCode = sCustomsDeclarationTypeCode == null ? null : sCustomsDeclarationTypeCode.trim();
    }
    public String getsCustomsDeclarationTypeName() {
        return sCustomsDeclarationTypeName;
    }
    public void setsCustomsDeclarationTypeName(String sCustomsDeclarationTypeName) {
        this.sCustomsDeclarationTypeName = sCustomsDeclarationTypeName == null ? null : sCustomsDeclarationTypeName.trim();
    }
    public String getsTariffName() {
        return sTariffName;
    }
    public void setsTariffName(String sTariffName) {
        this.sTariffName = sTariffName == null ? null : sTariffName.trim();
    }
    public Integer getiPriorityLevel() {
        return iPriorityLevel;
    }
    public void setiPriorityLevel(Integer iPriorityLevel) {
        this.iPriorityLevel = iPriorityLevel;
    }
}