package cn.comm.jax;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class CpYwGlDailyReportI implements Serializable {
    private String batchNo;

    private String midTableName;

    private BigDecimal lineId;

    @XmlElement(name="SRC_LINE_ID")
    private BigDecimal srcLineId;
    
    private String srcSystem;

    private String templateCode;

    private String lineType;

    private BigDecimal organizationId;
    @XmlElement(name="BUSINESS_DATE")
    private Date businessDate;
    @XmlElement(name="SERVICE_CODE")
    private String serviceCode;
    @XmlElement(name="SERVICE")
    private String service;
    @XmlElement(name="INST_CODE")
    private String instCode;

    private String instName;

    private String personInChargeCode;

    private String personInCharge;

    private String customerCode;

    private String customer;

    private String prodCatelogCode;

    private String prodCatelogName;

    private String prodCode;

    private String prodName;

    private String transactionType;

    private String transactionCode;

    private BigDecimal incTaxAmount;

    private BigDecimal taxAmount;

    private BigDecimal excTaxAmount;

    private BigDecimal cashAmount;

    private BigDecimal taxRate;

    private String currency;

    private BigDecimal currencyConversionRate;

    private Date currencyConversionDate;

    private String currencyConversionType;

    private String paymentMethod;

    private Timestamp paymentDate;

    private String clearingPeriod;

    private String noticeNum;

    private String infCollectionFlag;

    private BigDecimal isValidate;

    private BigDecimal isImportFlag;

    private Timestamp importDate;

    private String errorMsg;

    private Timestamp creationDate;

    private BigDecimal createdBy;

    private BigDecimal lastUpdatedBy;

    private Timestamp lastUpdateDate;

    private BigDecimal lastUpdateLogin;

    private String attributeCategory;

    private String attribute1;

    private String attribute2;

    private String attribute3;

    private String attribute4;

    private String attribute5;

    private String attribute6;

    private String attribute7;

    private String attribute8;

    private String attribute9;

    private String attribute10;

    private String attribute11;

    private String attribute12;

    private String attribute13;

    private String attribute14;

    private String attribute15;

    private String clearFlag;

    private Date initGlDate;

    private static final long serialVersionUID = 1L;

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    public String getMidTableName() {
        return midTableName;
    }

    public void setMidTableName(String midTableName) {
        this.midTableName = midTableName == null ? null : midTableName.trim();
    }

    public BigDecimal getLineId() {
        return lineId;
    }

    public void setLineId(BigDecimal lineId) {
        this.lineId = lineId;
    }

    public BigDecimal getSrcLineId() {
        return srcLineId;
    }

    public void setSrcLineId(BigDecimal srcLineId) {
        this.srcLineId = srcLineId;
    }

    public String getSrcSystem() {
        return srcSystem;
    }

    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem == null ? null : srcSystem.trim();
    }

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode == null ? null : templateCode.trim();
    }

    public String getLineType() {
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType == null ? null : lineType.trim();
    }

    public BigDecimal getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(BigDecimal organizationId) {
        this.organizationId = organizationId;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode == null ? null : serviceCode.trim();
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service == null ? null : service.trim();
    }

    public String getInstCode() {
        return instCode;
    }

    public void setInstCode(String instCode) {
        this.instCode = instCode == null ? null : instCode.trim();
    }

    public String getInstName() {
        return instName;
    }

    public void setInstName(String instName) {
        this.instName = instName == null ? null : instName.trim();
    }

    public String getPersonInChargeCode() {
        return personInChargeCode;
    }

    public void setPersonInChargeCode(String personInChargeCode) {
        this.personInChargeCode = personInChargeCode == null ? null : personInChargeCode.trim();
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge == null ? null : personInCharge.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getProdCatelogCode() {
        return prodCatelogCode;
    }

    public void setProdCatelogCode(String prodCatelogCode) {
        this.prodCatelogCode = prodCatelogCode == null ? null : prodCatelogCode.trim();
    }

    public String getProdCatelogName() {
        return prodCatelogName;
    }

    public void setProdCatelogName(String prodCatelogName) {
        this.prodCatelogName = prodCatelogName == null ? null : prodCatelogName.trim();
    }

    public String getProdCode() {
        return prodCode;
    }

    public void setProdCode(String prodCode) {
        this.prodCode = prodCode == null ? null : prodCode.trim();
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName == null ? null : prodName.trim();
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType == null ? null : transactionType.trim();
    }

    public String getTransactionCode() {
        return transactionCode;
    }

    public void setTransactionCode(String transactionCode) {
        this.transactionCode = transactionCode == null ? null : transactionCode.trim();
    }

    public BigDecimal getIncTaxAmount() {
        return incTaxAmount;
    }

    public void setIncTaxAmount(BigDecimal incTaxAmount) {
        this.incTaxAmount = incTaxAmount;
    }

    public BigDecimal getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(BigDecimal taxAmount) {
        this.taxAmount = taxAmount;
    }

    public BigDecimal getExcTaxAmount() {
        return excTaxAmount;
    }

    public void setExcTaxAmount(BigDecimal excTaxAmount) {
        this.excTaxAmount = excTaxAmount;
    }

    public BigDecimal getCashAmount() {
        return cashAmount;
    }

    public void setCashAmount(BigDecimal cashAmount) {
        this.cashAmount = cashAmount;
    }

    public BigDecimal getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(BigDecimal taxRate) {
        this.taxRate = taxRate;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public BigDecimal getCurrencyConversionRate() {
        return currencyConversionRate;
    }

    public void setCurrencyConversionRate(BigDecimal currencyConversionRate) {
        this.currencyConversionRate = currencyConversionRate;
    }

    public Date getCurrencyConversionDate() {
        return currencyConversionDate;
    }

    public void setCurrencyConversionDate(Date currencyConversionDate) {
        this.currencyConversionDate = currencyConversionDate;
    }

    public String getCurrencyConversionType() {
        return currencyConversionType;
    }

    public void setCurrencyConversionType(String currencyConversionType) {
        this.currencyConversionType = currencyConversionType == null ? null : currencyConversionType.trim();
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }

    public Timestamp getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Timestamp paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getClearingPeriod() {
        return clearingPeriod;
    }

    public void setClearingPeriod(String clearingPeriod) {
        this.clearingPeriod = clearingPeriod == null ? null : clearingPeriod.trim();
    }

    public String getNoticeNum() {
        return noticeNum;
    }

    public void setNoticeNum(String noticeNum) {
        this.noticeNum = noticeNum == null ? null : noticeNum.trim();
    }

    public String getInfCollectionFlag() {
        return infCollectionFlag;
    }

    public void setInfCollectionFlag(String infCollectionFlag) {
        this.infCollectionFlag = infCollectionFlag == null ? null : infCollectionFlag.trim();
    }

    public BigDecimal getIsValidate() {
        return isValidate;
    }

    public void setIsValidate(BigDecimal isValidate) {
        this.isValidate = isValidate;
    }

    public BigDecimal getIsImportFlag() {
        return isImportFlag;
    }

    public void setIsImportFlag(BigDecimal isImportFlag) {
        this.isImportFlag = isImportFlag;
    }

    public Timestamp getImportDate() {
        return importDate;
    }

    public void setImportDate(Timestamp importDate) {
        this.importDate = importDate;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(BigDecimal createdBy) {
        this.createdBy = createdBy;
    }

    public BigDecimal getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdatedBy(BigDecimal lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Timestamp getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Timestamp lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public BigDecimal getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public void setLastUpdateLogin(BigDecimal lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    public String getAttributeCategory() {
        return attributeCategory;
    }

    public void setAttributeCategory(String attributeCategory) {
        this.attributeCategory = attributeCategory == null ? null : attributeCategory.trim();
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1 == null ? null : attribute1.trim();
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2 == null ? null : attribute2.trim();
    }

    public String getAttribute3() {
        return attribute3;
    }

    public void setAttribute3(String attribute3) {
        this.attribute3 = attribute3 == null ? null : attribute3.trim();
    }

    public String getAttribute4() {
        return attribute4;
    }

    public void setAttribute4(String attribute4) {
        this.attribute4 = attribute4 == null ? null : attribute4.trim();
    }

    public String getAttribute5() {
        return attribute5;
    }

    public void setAttribute5(String attribute5) {
        this.attribute5 = attribute5 == null ? null : attribute5.trim();
    }

    public String getAttribute6() {
        return attribute6;
    }

    public void setAttribute6(String attribute6) {
        this.attribute6 = attribute6 == null ? null : attribute6.trim();
    }

    public String getAttribute7() {
        return attribute7;
    }

    public void setAttribute7(String attribute7) {
        this.attribute7 = attribute7 == null ? null : attribute7.trim();
    }

    public String getAttribute8() {
        return attribute8;
    }

    public void setAttribute8(String attribute8) {
        this.attribute8 = attribute8 == null ? null : attribute8.trim();
    }

    public String getAttribute9() {
        return attribute9;
    }

    public void setAttribute9(String attribute9) {
        this.attribute9 = attribute9 == null ? null : attribute9.trim();
    }

    public String getAttribute10() {
        return attribute10;
    }

    public void setAttribute10(String attribute10) {
        this.attribute10 = attribute10 == null ? null : attribute10.trim();
    }

    public String getAttribute11() {
        return attribute11;
    }

    public void setAttribute11(String attribute11) {
        this.attribute11 = attribute11 == null ? null : attribute11.trim();
    }

    public String getAttribute12() {
        return attribute12;
    }

    public void setAttribute12(String attribute12) {
        this.attribute12 = attribute12 == null ? null : attribute12.trim();
    }

    public String getAttribute13() {
        return attribute13;
    }

    public void setAttribute13(String attribute13) {
        this.attribute13 = attribute13 == null ? null : attribute13.trim();
    }

    public String getAttribute14() {
        return attribute14;
    }

    public void setAttribute14(String attribute14) {
        this.attribute14 = attribute14 == null ? null : attribute14.trim();
    }

    public String getAttribute15() {
        return attribute15;
    }

    public void setAttribute15(String attribute15) {
        this.attribute15 = attribute15 == null ? null : attribute15.trim();
    }

    public String getClearFlag() {
        return clearFlag;
    }

    public void setClearFlag(String clearFlag) {
        this.clearFlag = clearFlag == null ? null : clearFlag.trim();
    }

    public Date getInitGlDate() {
        return initGlDate;
    }

    public void setInitGlDate(Date initGlDate) {
        this.initGlDate = initGlDate;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CpYwGlDailyReportI other = (CpYwGlDailyReportI) that;
        return (this.getBatchNo() == null ? other.getBatchNo() == null : this.getBatchNo().equals(other.getBatchNo()))
            && (this.getMidTableName() == null ? other.getMidTableName() == null : this.getMidTableName().equals(other.getMidTableName()))
            && (this.getLineId() == null ? other.getLineId() == null : this.getLineId().equals(other.getLineId()))
            && (this.getSrcLineId() == null ? other.getSrcLineId() == null : this.getSrcLineId().equals(other.getSrcLineId()))
            && (this.getSrcSystem() == null ? other.getSrcSystem() == null : this.getSrcSystem().equals(other.getSrcSystem()))
            && (this.getTemplateCode() == null ? other.getTemplateCode() == null : this.getTemplateCode().equals(other.getTemplateCode()))
            && (this.getLineType() == null ? other.getLineType() == null : this.getLineType().equals(other.getLineType()))
            && (this.getOrganizationId() == null ? other.getOrganizationId() == null : this.getOrganizationId().equals(other.getOrganizationId()))
            && (this.getBusinessDate() == null ? other.getBusinessDate() == null : this.getBusinessDate().equals(other.getBusinessDate()))
            && (this.getServiceCode() == null ? other.getServiceCode() == null : this.getServiceCode().equals(other.getServiceCode()))
            && (this.getService() == null ? other.getService() == null : this.getService().equals(other.getService()))
            && (this.getInstCode() == null ? other.getInstCode() == null : this.getInstCode().equals(other.getInstCode()))
            && (this.getInstName() == null ? other.getInstName() == null : this.getInstName().equals(other.getInstName()))
            && (this.getPersonInChargeCode() == null ? other.getPersonInChargeCode() == null : this.getPersonInChargeCode().equals(other.getPersonInChargeCode()))
            && (this.getPersonInCharge() == null ? other.getPersonInCharge() == null : this.getPersonInCharge().equals(other.getPersonInCharge()))
            && (this.getCustomerCode() == null ? other.getCustomerCode() == null : this.getCustomerCode().equals(other.getCustomerCode()))
            && (this.getCustomer() == null ? other.getCustomer() == null : this.getCustomer().equals(other.getCustomer()))
            && (this.getProdCatelogCode() == null ? other.getProdCatelogCode() == null : this.getProdCatelogCode().equals(other.getProdCatelogCode()))
            && (this.getProdCatelogName() == null ? other.getProdCatelogName() == null : this.getProdCatelogName().equals(other.getProdCatelogName()))
            && (this.getProdCode() == null ? other.getProdCode() == null : this.getProdCode().equals(other.getProdCode()))
            && (this.getProdName() == null ? other.getProdName() == null : this.getProdName().equals(other.getProdName()))
            && (this.getTransactionType() == null ? other.getTransactionType() == null : this.getTransactionType().equals(other.getTransactionType()))
            && (this.getTransactionCode() == null ? other.getTransactionCode() == null : this.getTransactionCode().equals(other.getTransactionCode()))
            && (this.getIncTaxAmount() == null ? other.getIncTaxAmount() == null : this.getIncTaxAmount().equals(other.getIncTaxAmount()))
            && (this.getTaxAmount() == null ? other.getTaxAmount() == null : this.getTaxAmount().equals(other.getTaxAmount()))
            && (this.getExcTaxAmount() == null ? other.getExcTaxAmount() == null : this.getExcTaxAmount().equals(other.getExcTaxAmount()))
            && (this.getCashAmount() == null ? other.getCashAmount() == null : this.getCashAmount().equals(other.getCashAmount()))
            && (this.getTaxRate() == null ? other.getTaxRate() == null : this.getTaxRate().equals(other.getTaxRate()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getCurrencyConversionRate() == null ? other.getCurrencyConversionRate() == null : this.getCurrencyConversionRate().equals(other.getCurrencyConversionRate()))
            && (this.getCurrencyConversionDate() == null ? other.getCurrencyConversionDate() == null : this.getCurrencyConversionDate().equals(other.getCurrencyConversionDate()))
            && (this.getCurrencyConversionType() == null ? other.getCurrencyConversionType() == null : this.getCurrencyConversionType().equals(other.getCurrencyConversionType()))
            && (this.getPaymentMethod() == null ? other.getPaymentMethod() == null : this.getPaymentMethod().equals(other.getPaymentMethod()))
            && (this.getPaymentDate() == null ? other.getPaymentDate() == null : this.getPaymentDate().equals(other.getPaymentDate()))
            && (this.getClearingPeriod() == null ? other.getClearingPeriod() == null : this.getClearingPeriod().equals(other.getClearingPeriod()))
            && (this.getNoticeNum() == null ? other.getNoticeNum() == null : this.getNoticeNum().equals(other.getNoticeNum()))
            && (this.getInfCollectionFlag() == null ? other.getInfCollectionFlag() == null : this.getInfCollectionFlag().equals(other.getInfCollectionFlag()))
            && (this.getIsValidate() == null ? other.getIsValidate() == null : this.getIsValidate().equals(other.getIsValidate()))
            && (this.getIsImportFlag() == null ? other.getIsImportFlag() == null : this.getIsImportFlag().equals(other.getIsImportFlag()))
            && (this.getImportDate() == null ? other.getImportDate() == null : this.getImportDate().equals(other.getImportDate()))
            && (this.getErrorMsg() == null ? other.getErrorMsg() == null : this.getErrorMsg().equals(other.getErrorMsg()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()))
            && (this.getCreatedBy() == null ? other.getCreatedBy() == null : this.getCreatedBy().equals(other.getCreatedBy()))
            && (this.getLastUpdatedBy() == null ? other.getLastUpdatedBy() == null : this.getLastUpdatedBy().equals(other.getLastUpdatedBy()))
            && (this.getLastUpdateDate() == null ? other.getLastUpdateDate() == null : this.getLastUpdateDate().equals(other.getLastUpdateDate()))
            && (this.getLastUpdateLogin() == null ? other.getLastUpdateLogin() == null : this.getLastUpdateLogin().equals(other.getLastUpdateLogin()))
            && (this.getAttributeCategory() == null ? other.getAttributeCategory() == null : this.getAttributeCategory().equals(other.getAttributeCategory()))
            && (this.getAttribute1() == null ? other.getAttribute1() == null : this.getAttribute1().equals(other.getAttribute1()))
            && (this.getAttribute2() == null ? other.getAttribute2() == null : this.getAttribute2().equals(other.getAttribute2()))
            && (this.getAttribute3() == null ? other.getAttribute3() == null : this.getAttribute3().equals(other.getAttribute3()))
            && (this.getAttribute4() == null ? other.getAttribute4() == null : this.getAttribute4().equals(other.getAttribute4()))
            && (this.getAttribute5() == null ? other.getAttribute5() == null : this.getAttribute5().equals(other.getAttribute5()))
            && (this.getAttribute6() == null ? other.getAttribute6() == null : this.getAttribute6().equals(other.getAttribute6()))
            && (this.getAttribute7() == null ? other.getAttribute7() == null : this.getAttribute7().equals(other.getAttribute7()))
            && (this.getAttribute8() == null ? other.getAttribute8() == null : this.getAttribute8().equals(other.getAttribute8()))
            && (this.getAttribute9() == null ? other.getAttribute9() == null : this.getAttribute9().equals(other.getAttribute9()))
            && (this.getAttribute10() == null ? other.getAttribute10() == null : this.getAttribute10().equals(other.getAttribute10()))
            && (this.getAttribute11() == null ? other.getAttribute11() == null : this.getAttribute11().equals(other.getAttribute11()))
            && (this.getAttribute12() == null ? other.getAttribute12() == null : this.getAttribute12().equals(other.getAttribute12()))
            && (this.getAttribute13() == null ? other.getAttribute13() == null : this.getAttribute13().equals(other.getAttribute13()))
            && (this.getAttribute14() == null ? other.getAttribute14() == null : this.getAttribute14().equals(other.getAttribute14()))
            && (this.getAttribute15() == null ? other.getAttribute15() == null : this.getAttribute15().equals(other.getAttribute15()))
            && (this.getClearFlag() == null ? other.getClearFlag() == null : this.getClearFlag().equals(other.getClearFlag()))
            && (this.getInitGlDate() == null ? other.getInitGlDate() == null : this.getInitGlDate().equals(other.getInitGlDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBatchNo() == null) ? 0 : getBatchNo().hashCode());
        result = prime * result + ((getMidTableName() == null) ? 0 : getMidTableName().hashCode());
        result = prime * result + ((getLineId() == null) ? 0 : getLineId().hashCode());
        result = prime * result + ((getSrcLineId() == null) ? 0 : getSrcLineId().hashCode());
        result = prime * result + ((getSrcSystem() == null) ? 0 : getSrcSystem().hashCode());
        result = prime * result + ((getTemplateCode() == null) ? 0 : getTemplateCode().hashCode());
        result = prime * result + ((getLineType() == null) ? 0 : getLineType().hashCode());
        result = prime * result + ((getOrganizationId() == null) ? 0 : getOrganizationId().hashCode());
        result = prime * result + ((getBusinessDate() == null) ? 0 : getBusinessDate().hashCode());
        result = prime * result + ((getServiceCode() == null) ? 0 : getServiceCode().hashCode());
        result = prime * result + ((getService() == null) ? 0 : getService().hashCode());
        result = prime * result + ((getInstCode() == null) ? 0 : getInstCode().hashCode());
        result = prime * result + ((getInstName() == null) ? 0 : getInstName().hashCode());
        result = prime * result + ((getPersonInChargeCode() == null) ? 0 : getPersonInChargeCode().hashCode());
        result = prime * result + ((getPersonInCharge() == null) ? 0 : getPersonInCharge().hashCode());
        result = prime * result + ((getCustomerCode() == null) ? 0 : getCustomerCode().hashCode());
        result = prime * result + ((getCustomer() == null) ? 0 : getCustomer().hashCode());
        result = prime * result + ((getProdCatelogCode() == null) ? 0 : getProdCatelogCode().hashCode());
        result = prime * result + ((getProdCatelogName() == null) ? 0 : getProdCatelogName().hashCode());
        result = prime * result + ((getProdCode() == null) ? 0 : getProdCode().hashCode());
        result = prime * result + ((getProdName() == null) ? 0 : getProdName().hashCode());
        result = prime * result + ((getTransactionType() == null) ? 0 : getTransactionType().hashCode());
        result = prime * result + ((getTransactionCode() == null) ? 0 : getTransactionCode().hashCode());
        result = prime * result + ((getIncTaxAmount() == null) ? 0 : getIncTaxAmount().hashCode());
        result = prime * result + ((getTaxAmount() == null) ? 0 : getTaxAmount().hashCode());
        result = prime * result + ((getExcTaxAmount() == null) ? 0 : getExcTaxAmount().hashCode());
        result = prime * result + ((getCashAmount() == null) ? 0 : getCashAmount().hashCode());
        result = prime * result + ((getTaxRate() == null) ? 0 : getTaxRate().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getCurrencyConversionRate() == null) ? 0 : getCurrencyConversionRate().hashCode());
        result = prime * result + ((getCurrencyConversionDate() == null) ? 0 : getCurrencyConversionDate().hashCode());
        result = prime * result + ((getCurrencyConversionType() == null) ? 0 : getCurrencyConversionType().hashCode());
        result = prime * result + ((getPaymentMethod() == null) ? 0 : getPaymentMethod().hashCode());
        result = prime * result + ((getPaymentDate() == null) ? 0 : getPaymentDate().hashCode());
        result = prime * result + ((getClearingPeriod() == null) ? 0 : getClearingPeriod().hashCode());
        result = prime * result + ((getNoticeNum() == null) ? 0 : getNoticeNum().hashCode());
        result = prime * result + ((getInfCollectionFlag() == null) ? 0 : getInfCollectionFlag().hashCode());
        result = prime * result + ((getIsValidate() == null) ? 0 : getIsValidate().hashCode());
        result = prime * result + ((getIsImportFlag() == null) ? 0 : getIsImportFlag().hashCode());
        result = prime * result + ((getImportDate() == null) ? 0 : getImportDate().hashCode());
        result = prime * result + ((getErrorMsg() == null) ? 0 : getErrorMsg().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        result = prime * result + ((getCreatedBy() == null) ? 0 : getCreatedBy().hashCode());
        result = prime * result + ((getLastUpdatedBy() == null) ? 0 : getLastUpdatedBy().hashCode());
        result = prime * result + ((getLastUpdateDate() == null) ? 0 : getLastUpdateDate().hashCode());
        result = prime * result + ((getLastUpdateLogin() == null) ? 0 : getLastUpdateLogin().hashCode());
        result = prime * result + ((getAttributeCategory() == null) ? 0 : getAttributeCategory().hashCode());
        result = prime * result + ((getAttribute1() == null) ? 0 : getAttribute1().hashCode());
        result = prime * result + ((getAttribute2() == null) ? 0 : getAttribute2().hashCode());
        result = prime * result + ((getAttribute3() == null) ? 0 : getAttribute3().hashCode());
        result = prime * result + ((getAttribute4() == null) ? 0 : getAttribute4().hashCode());
        result = prime * result + ((getAttribute5() == null) ? 0 : getAttribute5().hashCode());
        result = prime * result + ((getAttribute6() == null) ? 0 : getAttribute6().hashCode());
        result = prime * result + ((getAttribute7() == null) ? 0 : getAttribute7().hashCode());
        result = prime * result + ((getAttribute8() == null) ? 0 : getAttribute8().hashCode());
        result = prime * result + ((getAttribute9() == null) ? 0 : getAttribute9().hashCode());
        result = prime * result + ((getAttribute10() == null) ? 0 : getAttribute10().hashCode());
        result = prime * result + ((getAttribute11() == null) ? 0 : getAttribute11().hashCode());
        result = prime * result + ((getAttribute12() == null) ? 0 : getAttribute12().hashCode());
        result = prime * result + ((getAttribute13() == null) ? 0 : getAttribute13().hashCode());
        result = prime * result + ((getAttribute14() == null) ? 0 : getAttribute14().hashCode());
        result = prime * result + ((getAttribute15() == null) ? 0 : getAttribute15().hashCode());
        result = prime * result + ((getClearFlag() == null) ? 0 : getClearFlag().hashCode());
        result = prime * result + ((getInitGlDate() == null) ? 0 : getInitGlDate().hashCode());
        return result;
    }
}