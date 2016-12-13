package org.study.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SprDeclareGoodCriteria {
    protected String orderByClause;
    protected boolean distinct;
    protected List<Criteria> oredCriteria;

    public SprDeclareGoodCriteria() {
        oredCriteria = new ArrayList<Criteria>();
    }
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }
    public String getOrderByClause() {
        return orderByClause;
    }
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }
    public boolean isDistinct() {
        return distinct;
    }
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }
        public boolean isValid() {
            return criteria.size() > 0;
        }
        public List<Criterion> getAllCriteria() {
            return criteria;
        }
        public List<Criterion> getCriteria() {
            return criteria;
        }
        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }
        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }
        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }
        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }
        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }
        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }
        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }
        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }
        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }
        public Criteria andSSDcustomsDeclarationFormDtlIdIsNull() {
            addCriterion("sSDcustomsDeclarationFormDtlId is null");
            return (Criteria) this;
        }
        public Criteria andSSDcustomsDeclarationFormDtlIdIsNotNull() {
            addCriterion("sSDcustomsDeclarationFormDtlId is not null");
            return (Criteria) this;
        }
        public Criteria andSSDcustomsDeclarationFormDtlIdEqualTo(String value) {
            addCriterion("sSDcustomsDeclarationFormDtlId =", value, "sSDcustomsDeclarationFormDtlId");
            return (Criteria) this;
        }
        public Criteria andSSDcustomsDeclarationFormDtlIdNotEqualTo(String value) {
            addCriterion("sSDcustomsDeclarationFormDtlId <>", value, "sSDcustomsDeclarationFormDtlId");
            return (Criteria) this;
        }
        public Criteria andSSDcustomsDeclarationFormDtlIdGreaterThan(String value) {
            addCriterion("sSDcustomsDeclarationFormDtlId >", value, "sSDcustomsDeclarationFormDtlId");
            return (Criteria) this;
        }
        public Criteria andSSDcustomsDeclarationFormDtlIdGreaterThanOrEqualTo(String value) {
            addCriterion("sSDcustomsDeclarationFormDtlId >=", value, "sSDcustomsDeclarationFormDtlId");
            return (Criteria) this;
        }
        public Criteria andSSDcustomsDeclarationFormDtlIdLessThan(String value) {
            addCriterion("sSDcustomsDeclarationFormDtlId <", value, "sSDcustomsDeclarationFormDtlId");
            return (Criteria) this;
        }
        public Criteria andSSDcustomsDeclarationFormDtlIdLessThanOrEqualTo(String value) {
            addCriterion("sSDcustomsDeclarationFormDtlId <=", value, "sSDcustomsDeclarationFormDtlId");
            return (Criteria) this;
        }
        public Criteria andSSDcustomsDeclarationFormDtlIdLike(String value) {
            addCriterion("sSDcustomsDeclarationFormDtlId like", value, "sSDcustomsDeclarationFormDtlId");
            return (Criteria) this;
        }
        public Criteria andSSDcustomsDeclarationFormDtlIdNotLike(String value) {
            addCriterion("sSDcustomsDeclarationFormDtlId not like", value, "sSDcustomsDeclarationFormDtlId");
            return (Criteria) this;
        }
        public Criteria andSSDcustomsDeclarationFormDtlIdIn(List<String> values) {
            addCriterion("sSDcustomsDeclarationFormDtlId in", values, "sSDcustomsDeclarationFormDtlId");
            return (Criteria) this;
        }
        public Criteria andSSDcustomsDeclarationFormDtlIdNotIn(List<String> values) {
            addCriterion("sSDcustomsDeclarationFormDtlId not in", values, "sSDcustomsDeclarationFormDtlId");
            return (Criteria) this;
        }
        public Criteria andSSDcustomsDeclarationFormDtlIdBetween(String value1, String value2) {
            addCriterion("sSDcustomsDeclarationFormDtlId between", value1, value2, "sSDcustomsDeclarationFormDtlId");
            return (Criteria) this;
        }
        public Criteria andSSDcustomsDeclarationFormDtlIdNotBetween(String value1, String value2) {
            addCriterion("sSDcustomsDeclarationFormDtlId not between", value1, value2, "sSDcustomsDeclarationFormDtlId");
            return (Criteria) this;
        }
        public Criteria andIRowNoIsNull() {
            addCriterion("iRowNo is null");
            return (Criteria) this;
        }
        public Criteria andIRowNoIsNotNull() {
            addCriterion("iRowNo is not null");
            return (Criteria) this;
        }
        public Criteria andIRowNoEqualTo(Integer value) {
            addCriterion("iRowNo =", value, "iRowNo");
            return (Criteria) this;
        }
        public Criteria andIRowNoNotEqualTo(Integer value) {
            addCriterion("iRowNo <>", value, "iRowNo");
            return (Criteria) this;
        }
        public Criteria andIRowNoGreaterThan(Integer value) {
            addCriterion("iRowNo >", value, "iRowNo");
            return (Criteria) this;
        }
        public Criteria andIRowNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("iRowNo >=", value, "iRowNo");
            return (Criteria) this;
        }
        public Criteria andIRowNoLessThan(Integer value) {
            addCriterion("iRowNo <", value, "iRowNo");
            return (Criteria) this;
        }
        public Criteria andIRowNoLessThanOrEqualTo(Integer value) {
            addCriterion("iRowNo <=", value, "iRowNo");
            return (Criteria) this;
        }
        public Criteria andIRowNoIn(List<Integer> values) {
            addCriterion("iRowNo in", values, "iRowNo");
            return (Criteria) this;
        }
        public Criteria andIRowNoNotIn(List<Integer> values) {
            addCriterion("iRowNo not in", values, "iRowNo");
            return (Criteria) this;
        }
        public Criteria andIRowNoBetween(Integer value1, Integer value2) {
            addCriterion("iRowNo between", value1, value2, "iRowNo");
            return (Criteria) this;
        }
        public Criteria andIRowNoNotBetween(Integer value1, Integer value2) {
            addCriterion("iRowNo not between", value1, value2, "iRowNo");
            return (Criteria) this;
        }
        public Criteria andSGoodsCodeIsNull() {
            addCriterion("sGoodsCode is null");
            return (Criteria) this;
        }
        public Criteria andSGoodsCodeIsNotNull() {
            addCriterion("sGoodsCode is not null");
            return (Criteria) this;
        }
        public Criteria andSGoodsCodeEqualTo(String value) {
            addCriterion("sGoodsCode =", value, "sGoodsCode");
            return (Criteria) this;
        }
        public Criteria andSGoodsCodeNotEqualTo(String value) {
            addCriterion("sGoodsCode <>", value, "sGoodsCode");
            return (Criteria) this;
        }
        public Criteria andSGoodsCodeGreaterThan(String value) {
            addCriterion("sGoodsCode >", value, "sGoodsCode");
            return (Criteria) this;
        }
        public Criteria andSGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sGoodsCode >=", value, "sGoodsCode");
            return (Criteria) this;
        }
        public Criteria andSGoodsCodeLessThan(String value) {
            addCriterion("sGoodsCode <", value, "sGoodsCode");
            return (Criteria) this;
        }
        public Criteria andSGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("sGoodsCode <=", value, "sGoodsCode");
            return (Criteria) this;
        }
        public Criteria andSGoodsCodeLike(String value) {
            addCriterion("sGoodsCode like", value, "sGoodsCode");
            return (Criteria) this;
        }
        public Criteria andSGoodsCodeNotLike(String value) {
            addCriterion("sGoodsCode not like", value, "sGoodsCode");
            return (Criteria) this;
        }
        public Criteria andSGoodsCodeIn(List<String> values) {
            addCriterion("sGoodsCode in", values, "sGoodsCode");
            return (Criteria) this;
        }
        public Criteria andSGoodsCodeNotIn(List<String> values) {
            addCriterion("sGoodsCode not in", values, "sGoodsCode");
            return (Criteria) this;
        }
        public Criteria andSGoodsCodeBetween(String value1, String value2) {
            addCriterion("sGoodsCode between", value1, value2, "sGoodsCode");
            return (Criteria) this;
        }
        public Criteria andSGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("sGoodsCode not between", value1, value2, "sGoodsCode");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameCnIsNull() {
            addCriterion("sGoodsNameCn is null");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameCnIsNotNull() {
            addCriterion("sGoodsNameCn is not null");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameCnEqualTo(String value) {
            addCriterion("sGoodsNameCn =", value, "sGoodsNameCn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameCnNotEqualTo(String value) {
            addCriterion("sGoodsNameCn <>", value, "sGoodsNameCn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameCnGreaterThan(String value) {
            addCriterion("sGoodsNameCn >", value, "sGoodsNameCn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("sGoodsNameCn >=", value, "sGoodsNameCn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameCnLessThan(String value) {
            addCriterion("sGoodsNameCn <", value, "sGoodsNameCn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameCnLessThanOrEqualTo(String value) {
            addCriterion("sGoodsNameCn <=", value, "sGoodsNameCn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameCnLike(String value) {
            addCriterion("sGoodsNameCn like", value, "sGoodsNameCn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameCnNotLike(String value) {
            addCriterion("sGoodsNameCn not like", value, "sGoodsNameCn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameCnIn(List<String> values) {
            addCriterion("sGoodsNameCn in", values, "sGoodsNameCn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameCnNotIn(List<String> values) {
            addCriterion("sGoodsNameCn not in", values, "sGoodsNameCn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameCnBetween(String value1, String value2) {
            addCriterion("sGoodsNameCn between", value1, value2, "sGoodsNameCn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameCnNotBetween(String value1, String value2) {
            addCriterion("sGoodsNameCn not between", value1, value2, "sGoodsNameCn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameEnIsNull() {
            addCriterion("sGoodsNameEn is null");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameEnIsNotNull() {
            addCriterion("sGoodsNameEn is not null");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameEnEqualTo(String value) {
            addCriterion("sGoodsNameEn =", value, "sGoodsNameEn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameEnNotEqualTo(String value) {
            addCriterion("sGoodsNameEn <>", value, "sGoodsNameEn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameEnGreaterThan(String value) {
            addCriterion("sGoodsNameEn >", value, "sGoodsNameEn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("sGoodsNameEn >=", value, "sGoodsNameEn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameEnLessThan(String value) {
            addCriterion("sGoodsNameEn <", value, "sGoodsNameEn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameEnLessThanOrEqualTo(String value) {
            addCriterion("sGoodsNameEn <=", value, "sGoodsNameEn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameEnLike(String value) {
            addCriterion("sGoodsNameEn like", value, "sGoodsNameEn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameEnNotLike(String value) {
            addCriterion("sGoodsNameEn not like", value, "sGoodsNameEn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameEnIn(List<String> values) {
            addCriterion("sGoodsNameEn in", values, "sGoodsNameEn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameEnNotIn(List<String> values) {
            addCriterion("sGoodsNameEn not in", values, "sGoodsNameEn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameEnBetween(String value1, String value2) {
            addCriterion("sGoodsNameEn between", value1, value2, "sGoodsNameEn");
            return (Criteria) this;
        }
        public Criteria andSGoodsNameEnNotBetween(String value1, String value2) {
            addCriterion("sGoodsNameEn not between", value1, value2, "sGoodsNameEn");
            return (Criteria) this;
        }
        public Criteria andSFullGoodsNameIsNull() {
            addCriterion("sFullGoodsName is null");
            return (Criteria) this;
        }
        public Criteria andSFullGoodsNameIsNotNull() {
            addCriterion("sFullGoodsName is not null");
            return (Criteria) this;
        }
        public Criteria andSFullGoodsNameEqualTo(String value) {
            addCriterion("sFullGoodsName =", value, "sFullGoodsName");
            return (Criteria) this;
        }
        public Criteria andSFullGoodsNameNotEqualTo(String value) {
            addCriterion("sFullGoodsName <>", value, "sFullGoodsName");
            return (Criteria) this;
        }
        public Criteria andSFullGoodsNameGreaterThan(String value) {
            addCriterion("sFullGoodsName >", value, "sFullGoodsName");
            return (Criteria) this;
        }
        public Criteria andSFullGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("sFullGoodsName >=", value, "sFullGoodsName");
            return (Criteria) this;
        }
        public Criteria andSFullGoodsNameLessThan(String value) {
            addCriterion("sFullGoodsName <", value, "sFullGoodsName");
            return (Criteria) this;
        }
        public Criteria andSFullGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("sFullGoodsName <=", value, "sFullGoodsName");
            return (Criteria) this;
        }
        public Criteria andSFullGoodsNameLike(String value) {
            addCriterion("sFullGoodsName like", value, "sFullGoodsName");
            return (Criteria) this;
        }
        public Criteria andSFullGoodsNameNotLike(String value) {
            addCriterion("sFullGoodsName not like", value, "sFullGoodsName");
            return (Criteria) this;
        }
        public Criteria andSFullGoodsNameIn(List<String> values) {
            addCriterion("sFullGoodsName in", values, "sFullGoodsName");
            return (Criteria) this;
        }
        public Criteria andSFullGoodsNameNotIn(List<String> values) {
            addCriterion("sFullGoodsName not in", values, "sFullGoodsName");
            return (Criteria) this;
        }
        public Criteria andSFullGoodsNameBetween(String value1, String value2) {
            addCriterion("sFullGoodsName between", value1, value2, "sFullGoodsName");
            return (Criteria) this;
        }
        public Criteria andSFullGoodsNameNotBetween(String value1, String value2) {
            addCriterion("sFullGoodsName not between", value1, value2, "sFullGoodsName");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelIsNull() {
            addCriterion("sGoodsModel is null");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelIsNotNull() {
            addCriterion("sGoodsModel is not null");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelEqualTo(String value) {
            addCriterion("sGoodsModel =", value, "sGoodsModel");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelNotEqualTo(String value) {
            addCriterion("sGoodsModel <>", value, "sGoodsModel");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelGreaterThan(String value) {
            addCriterion("sGoodsModel >", value, "sGoodsModel");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelGreaterThanOrEqualTo(String value) {
            addCriterion("sGoodsModel >=", value, "sGoodsModel");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelLessThan(String value) {
            addCriterion("sGoodsModel <", value, "sGoodsModel");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelLessThanOrEqualTo(String value) {
            addCriterion("sGoodsModel <=", value, "sGoodsModel");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelLike(String value) {
            addCriterion("sGoodsModel like", value, "sGoodsModel");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelNotLike(String value) {
            addCriterion("sGoodsModel not like", value, "sGoodsModel");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelIn(List<String> values) {
            addCriterion("sGoodsModel in", values, "sGoodsModel");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelNotIn(List<String> values) {
            addCriterion("sGoodsModel not in", values, "sGoodsModel");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelBetween(String value1, String value2) {
            addCriterion("sGoodsModel between", value1, value2, "sGoodsModel");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelNotBetween(String value1, String value2) {
            addCriterion("sGoodsModel not between", value1, value2, "sGoodsModel");
            return (Criteria) this;
        }
        public Criteria andNDeclareQuantityIsNull() {
            addCriterion("nDeclareQuantity is null");
            return (Criteria) this;
        }
        public Criteria andNDeclareQuantityIsNotNull() {
            addCriterion("nDeclareQuantity is not null");
            return (Criteria) this;
        }
        public Criteria andNDeclareQuantityEqualTo(Double value) {
            addCriterion("nDeclareQuantity =", value, "nDeclareQuantity");
            return (Criteria) this;
        }
        public Criteria andNDeclareQuantityNotEqualTo(Double value) {
            addCriterion("nDeclareQuantity <>", value, "nDeclareQuantity");
            return (Criteria) this;
        }
        public Criteria andNDeclareQuantityGreaterThan(Double value) {
            addCriterion("nDeclareQuantity >", value, "nDeclareQuantity");
            return (Criteria) this;
        }
        public Criteria andNDeclareQuantityGreaterThanOrEqualTo(Double value) {
            addCriterion("nDeclareQuantity >=", value, "nDeclareQuantity");
            return (Criteria) this;
        }
        public Criteria andNDeclareQuantityLessThan(Double value) {
            addCriterion("nDeclareQuantity <", value, "nDeclareQuantity");
            return (Criteria) this;
        }
        public Criteria andNDeclareQuantityLessThanOrEqualTo(Double value) {
            addCriterion("nDeclareQuantity <=", value, "nDeclareQuantity");
            return (Criteria) this;
        }
        public Criteria andNDeclareQuantityIn(List<Double> values) {
            addCriterion("nDeclareQuantity in", values, "nDeclareQuantity");
            return (Criteria) this;
        }
        public Criteria andNDeclareQuantityNotIn(List<Double> values) {
            addCriterion("nDeclareQuantity not in", values, "nDeclareQuantity");
            return (Criteria) this;
        }
        public Criteria andNDeclareQuantityBetween(Double value1, Double value2) {
            addCriterion("nDeclareQuantity between", value1, value2, "nDeclareQuantity");
            return (Criteria) this;
        }
        public Criteria andNDeclareQuantityNotBetween(Double value1, Double value2) {
            addCriterion("nDeclareQuantity not between", value1, value2, "nDeclareQuantity");
            return (Criteria) this;
        }
        public Criteria andIDeclareUnitIdIsNull() {
            addCriterion("iDeclareUnitId is null");
            return (Criteria) this;
        }
        public Criteria andIDeclareUnitIdIsNotNull() {
            addCriterion("iDeclareUnitId is not null");
            return (Criteria) this;
        }
        public Criteria andIDeclareUnitIdEqualTo(Integer value) {
            addCriterion("iDeclareUnitId =", value, "iDeclareUnitId");
            return (Criteria) this;
        }
        public Criteria andIDeclareUnitIdNotEqualTo(Integer value) {
            addCriterion("iDeclareUnitId <>", value, "iDeclareUnitId");
            return (Criteria) this;
        }
        public Criteria andIDeclareUnitIdGreaterThan(Integer value) {
            addCriterion("iDeclareUnitId >", value, "iDeclareUnitId");
            return (Criteria) this;
        }
        public Criteria andIDeclareUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iDeclareUnitId >=", value, "iDeclareUnitId");
            return (Criteria) this;
        }
        public Criteria andIDeclareUnitIdLessThan(Integer value) {
            addCriterion("iDeclareUnitId <", value, "iDeclareUnitId");
            return (Criteria) this;
        }
        public Criteria andIDeclareUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("iDeclareUnitId <=", value, "iDeclareUnitId");
            return (Criteria) this;
        }
        public Criteria andIDeclareUnitIdIn(List<Integer> values) {
            addCriterion("iDeclareUnitId in", values, "iDeclareUnitId");
            return (Criteria) this;
        }
        public Criteria andIDeclareUnitIdNotIn(List<Integer> values) {
            addCriterion("iDeclareUnitId not in", values, "iDeclareUnitId");
            return (Criteria) this;
        }
        public Criteria andIDeclareUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("iDeclareUnitId between", value1, value2, "iDeclareUnitId");
            return (Criteria) this;
        }
        public Criteria andIDeclareUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iDeclareUnitId not between", value1, value2, "iDeclareUnitId");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitCodeIsNull() {
            addCriterion("sDeclareUnitCode is null");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitCodeIsNotNull() {
            addCriterion("sDeclareUnitCode is not null");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitCodeEqualTo(String value) {
            addCriterion("sDeclareUnitCode =", value, "sDeclareUnitCode");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitCodeNotEqualTo(String value) {
            addCriterion("sDeclareUnitCode <>", value, "sDeclareUnitCode");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitCodeGreaterThan(String value) {
            addCriterion("sDeclareUnitCode >", value, "sDeclareUnitCode");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sDeclareUnitCode >=", value, "sDeclareUnitCode");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitCodeLessThan(String value) {
            addCriterion("sDeclareUnitCode <", value, "sDeclareUnitCode");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("sDeclareUnitCode <=", value, "sDeclareUnitCode");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitCodeLike(String value) {
            addCriterion("sDeclareUnitCode like", value, "sDeclareUnitCode");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitCodeNotLike(String value) {
            addCriterion("sDeclareUnitCode not like", value, "sDeclareUnitCode");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitCodeIn(List<String> values) {
            addCriterion("sDeclareUnitCode in", values, "sDeclareUnitCode");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitCodeNotIn(List<String> values) {
            addCriterion("sDeclareUnitCode not in", values, "sDeclareUnitCode");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitCodeBetween(String value1, String value2) {
            addCriterion("sDeclareUnitCode between", value1, value2, "sDeclareUnitCode");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitCodeNotBetween(String value1, String value2) {
            addCriterion("sDeclareUnitCode not between", value1, value2, "sDeclareUnitCode");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitNameIsNull() {
            addCriterion("sDeclareUnitName is null");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitNameIsNotNull() {
            addCriterion("sDeclareUnitName is not null");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitNameEqualTo(String value) {
            addCriterion("sDeclareUnitName =", value, "sDeclareUnitName");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitNameNotEqualTo(String value) {
            addCriterion("sDeclareUnitName <>", value, "sDeclareUnitName");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitNameGreaterThan(String value) {
            addCriterion("sDeclareUnitName >", value, "sDeclareUnitName");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("sDeclareUnitName >=", value, "sDeclareUnitName");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitNameLessThan(String value) {
            addCriterion("sDeclareUnitName <", value, "sDeclareUnitName");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitNameLessThanOrEqualTo(String value) {
            addCriterion("sDeclareUnitName <=", value, "sDeclareUnitName");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitNameLike(String value) {
            addCriterion("sDeclareUnitName like", value, "sDeclareUnitName");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitNameNotLike(String value) {
            addCriterion("sDeclareUnitName not like", value, "sDeclareUnitName");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitNameIn(List<String> values) {
            addCriterion("sDeclareUnitName in", values, "sDeclareUnitName");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitNameNotIn(List<String> values) {
            addCriterion("sDeclareUnitName not in", values, "sDeclareUnitName");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitNameBetween(String value1, String value2) {
            addCriterion("sDeclareUnitName between", value1, value2, "sDeclareUnitName");
            return (Criteria) this;
        }
        public Criteria andSDeclareUnitNameNotBetween(String value1, String value2) {
            addCriterion("sDeclareUnitName not between", value1, value2, "sDeclareUnitName");
            return (Criteria) this;
        }
        public Criteria andNTradePriceIsNull() {
            addCriterion("nTradePrice is null");
            return (Criteria) this;
        }
        public Criteria andNTradePriceIsNotNull() {
            addCriterion("nTradePrice is not null");
            return (Criteria) this;
        }
        public Criteria andNTradePriceEqualTo(BigDecimal value) {
            addCriterion("nTradePrice =", value, "nTradePrice");
            return (Criteria) this;
        }
        public Criteria andNTradePriceNotEqualTo(BigDecimal value) {
            addCriterion("nTradePrice <>", value, "nTradePrice");
            return (Criteria) this;
        }
        public Criteria andNTradePriceGreaterThan(BigDecimal value) {
            addCriterion("nTradePrice >", value, "nTradePrice");
            return (Criteria) this;
        }
        public Criteria andNTradePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nTradePrice >=", value, "nTradePrice");
            return (Criteria) this;
        }
        public Criteria andNTradePriceLessThan(BigDecimal value) {
            addCriterion("nTradePrice <", value, "nTradePrice");
            return (Criteria) this;
        }
        public Criteria andNTradePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nTradePrice <=", value, "nTradePrice");
            return (Criteria) this;
        }
        public Criteria andNTradePriceIn(List<BigDecimal> values) {
            addCriterion("nTradePrice in", values, "nTradePrice");
            return (Criteria) this;
        }
        public Criteria andNTradePriceNotIn(List<BigDecimal> values) {
            addCriterion("nTradePrice not in", values, "nTradePrice");
            return (Criteria) this;
        }
        public Criteria andNTradePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nTradePrice between", value1, value2, "nTradePrice");
            return (Criteria) this;
        }
        public Criteria andNTradePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nTradePrice not between", value1, value2, "nTradePrice");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountPreIsNull() {
            addCriterion("nTradeTotalAmountPre is null");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountPreIsNotNull() {
            addCriterion("nTradeTotalAmountPre is not null");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountPreEqualTo(BigDecimal value) {
            addCriterion("nTradeTotalAmountPre =", value, "nTradeTotalAmountPre");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountPreNotEqualTo(BigDecimal value) {
            addCriterion("nTradeTotalAmountPre <>", value, "nTradeTotalAmountPre");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountPreGreaterThan(BigDecimal value) {
            addCriterion("nTradeTotalAmountPre >", value, "nTradeTotalAmountPre");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountPreGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nTradeTotalAmountPre >=", value, "nTradeTotalAmountPre");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountPreLessThan(BigDecimal value) {
            addCriterion("nTradeTotalAmountPre <", value, "nTradeTotalAmountPre");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountPreLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nTradeTotalAmountPre <=", value, "nTradeTotalAmountPre");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountPreIn(List<BigDecimal> values) {
            addCriterion("nTradeTotalAmountPre in", values, "nTradeTotalAmountPre");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountPreNotIn(List<BigDecimal> values) {
            addCriterion("nTradeTotalAmountPre not in", values, "nTradeTotalAmountPre");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountPreBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nTradeTotalAmountPre between", value1, value2, "nTradeTotalAmountPre");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountPreNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nTradeTotalAmountPre not between", value1, value2, "nTradeTotalAmountPre");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountIsNull() {
            addCriterion("nTradeTotalAmount is null");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountIsNotNull() {
            addCriterion("nTradeTotalAmount is not null");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountEqualTo(BigDecimal value) {
            addCriterion("nTradeTotalAmount =", value, "nTradeTotalAmount");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("nTradeTotalAmount <>", value, "nTradeTotalAmount");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("nTradeTotalAmount >", value, "nTradeTotalAmount");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("nTradeTotalAmount >=", value, "nTradeTotalAmount");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountLessThan(BigDecimal value) {
            addCriterion("nTradeTotalAmount <", value, "nTradeTotalAmount");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("nTradeTotalAmount <=", value, "nTradeTotalAmount");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountIn(List<BigDecimal> values) {
            addCriterion("nTradeTotalAmount in", values, "nTradeTotalAmount");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("nTradeTotalAmount not in", values, "nTradeTotalAmount");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nTradeTotalAmount between", value1, value2, "nTradeTotalAmount");
            return (Criteria) this;
        }
        public Criteria andNTradeTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("nTradeTotalAmount not between", value1, value2, "nTradeTotalAmount");
            return (Criteria) this;
        }
        public Criteria andITradeCurrencyIdIsNull() {
            addCriterion("iTradeCurrencyId is null");
            return (Criteria) this;
        }
        public Criteria andITradeCurrencyIdIsNotNull() {
            addCriterion("iTradeCurrencyId is not null");
            return (Criteria) this;
        }
        public Criteria andITradeCurrencyIdEqualTo(Integer value) {
            addCriterion("iTradeCurrencyId =", value, "iTradeCurrencyId");
            return (Criteria) this;
        }
        public Criteria andITradeCurrencyIdNotEqualTo(Integer value) {
            addCriterion("iTradeCurrencyId <>", value, "iTradeCurrencyId");
            return (Criteria) this;
        }
        public Criteria andITradeCurrencyIdGreaterThan(Integer value) {
            addCriterion("iTradeCurrencyId >", value, "iTradeCurrencyId");
            return (Criteria) this;
        }
        public Criteria andITradeCurrencyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iTradeCurrencyId >=", value, "iTradeCurrencyId");
            return (Criteria) this;
        }
        public Criteria andITradeCurrencyIdLessThan(Integer value) {
            addCriterion("iTradeCurrencyId <", value, "iTradeCurrencyId");
            return (Criteria) this;
        }
        public Criteria andITradeCurrencyIdLessThanOrEqualTo(Integer value) {
            addCriterion("iTradeCurrencyId <=", value, "iTradeCurrencyId");
            return (Criteria) this;
        }
        public Criteria andITradeCurrencyIdIn(List<Integer> values) {
            addCriterion("iTradeCurrencyId in", values, "iTradeCurrencyId");
            return (Criteria) this;
        }
        public Criteria andITradeCurrencyIdNotIn(List<Integer> values) {
            addCriterion("iTradeCurrencyId not in", values, "iTradeCurrencyId");
            return (Criteria) this;
        }
        public Criteria andITradeCurrencyIdBetween(Integer value1, Integer value2) {
            addCriterion("iTradeCurrencyId between", value1, value2, "iTradeCurrencyId");
            return (Criteria) this;
        }
        public Criteria andITradeCurrencyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iTradeCurrencyId not between", value1, value2, "iTradeCurrencyId");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyCodeIsNull() {
            addCriterion("sTradeCurrencyCode is null");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyCodeIsNotNull() {
            addCriterion("sTradeCurrencyCode is not null");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyCodeEqualTo(String value) {
            addCriterion("sTradeCurrencyCode =", value, "sTradeCurrencyCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyCodeNotEqualTo(String value) {
            addCriterion("sTradeCurrencyCode <>", value, "sTradeCurrencyCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyCodeGreaterThan(String value) {
            addCriterion("sTradeCurrencyCode >", value, "sTradeCurrencyCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sTradeCurrencyCode >=", value, "sTradeCurrencyCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyCodeLessThan(String value) {
            addCriterion("sTradeCurrencyCode <", value, "sTradeCurrencyCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyCodeLessThanOrEqualTo(String value) {
            addCriterion("sTradeCurrencyCode <=", value, "sTradeCurrencyCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyCodeLike(String value) {
            addCriterion("sTradeCurrencyCode like", value, "sTradeCurrencyCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyCodeNotLike(String value) {
            addCriterion("sTradeCurrencyCode not like", value, "sTradeCurrencyCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyCodeIn(List<String> values) {
            addCriterion("sTradeCurrencyCode in", values, "sTradeCurrencyCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyCodeNotIn(List<String> values) {
            addCriterion("sTradeCurrencyCode not in", values, "sTradeCurrencyCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyCodeBetween(String value1, String value2) {
            addCriterion("sTradeCurrencyCode between", value1, value2, "sTradeCurrencyCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyCodeNotBetween(String value1, String value2) {
            addCriterion("sTradeCurrencyCode not between", value1, value2, "sTradeCurrencyCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyNameIsNull() {
            addCriterion("sTradeCurrencyName is null");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyNameIsNotNull() {
            addCriterion("sTradeCurrencyName is not null");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyNameEqualTo(String value) {
            addCriterion("sTradeCurrencyName =", value, "sTradeCurrencyName");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyNameNotEqualTo(String value) {
            addCriterion("sTradeCurrencyName <>", value, "sTradeCurrencyName");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyNameGreaterThan(String value) {
            addCriterion("sTradeCurrencyName >", value, "sTradeCurrencyName");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("sTradeCurrencyName >=", value, "sTradeCurrencyName");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyNameLessThan(String value) {
            addCriterion("sTradeCurrencyName <", value, "sTradeCurrencyName");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyNameLessThanOrEqualTo(String value) {
            addCriterion("sTradeCurrencyName <=", value, "sTradeCurrencyName");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyNameLike(String value) {
            addCriterion("sTradeCurrencyName like", value, "sTradeCurrencyName");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyNameNotLike(String value) {
            addCriterion("sTradeCurrencyName not like", value, "sTradeCurrencyName");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyNameIn(List<String> values) {
            addCriterion("sTradeCurrencyName in", values, "sTradeCurrencyName");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyNameNotIn(List<String> values) {
            addCriterion("sTradeCurrencyName not in", values, "sTradeCurrencyName");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyNameBetween(String value1, String value2) {
            addCriterion("sTradeCurrencyName between", value1, value2, "sTradeCurrencyName");
            return (Criteria) this;
        }
        public Criteria andSTradeCurrencyNameNotBetween(String value1, String value2) {
            addCriterion("sTradeCurrencyName not between", value1, value2, "sTradeCurrencyName");
            return (Criteria) this;
        }
        public Criteria andIQuantity1IsNull() {
            addCriterion("iQuantity1 is null");
            return (Criteria) this;
        }
        public Criteria andIQuantity1IsNotNull() {
            addCriterion("iQuantity1 is not null");
            return (Criteria) this;
        }
        public Criteria andIQuantity1EqualTo(Double value) {
            addCriterion("iQuantity1 =", value, "iQuantity1");
            return (Criteria) this;
        }
        public Criteria andIQuantity1NotEqualTo(Double value) {
            addCriterion("iQuantity1 <>", value, "iQuantity1");
            return (Criteria) this;
        }
        public Criteria andIQuantity1GreaterThan(Double value) {
            addCriterion("iQuantity1 >", value, "iQuantity1");
            return (Criteria) this;
        }
        public Criteria andIQuantity1GreaterThanOrEqualTo(Double value) {
            addCriterion("iQuantity1 >=", value, "iQuantity1");
            return (Criteria) this;
        }
        public Criteria andIQuantity1LessThan(Double value) {
            addCriterion("iQuantity1 <", value, "iQuantity1");
            return (Criteria) this;
        }
        public Criteria andIQuantity1LessThanOrEqualTo(Double value) {
            addCriterion("iQuantity1 <=", value, "iQuantity1");
            return (Criteria) this;
        }
        public Criteria andIQuantity1In(List<Double> values) {
            addCriterion("iQuantity1 in", values, "iQuantity1");
            return (Criteria) this;
        }
        public Criteria andIQuantity1NotIn(List<Double> values) {
            addCriterion("iQuantity1 not in", values, "iQuantity1");
            return (Criteria) this;
        }
        public Criteria andIQuantity1Between(Double value1, Double value2) {
            addCriterion("iQuantity1 between", value1, value2, "iQuantity1");
            return (Criteria) this;
        }
        public Criteria andIQuantity1NotBetween(Double value1, Double value2) {
            addCriterion("iQuantity1 not between", value1, value2, "iQuantity1");
            return (Criteria) this;
        }
        public Criteria andIFirstUnitIdIsNull() {
            addCriterion("iFirstUnitId is null");
            return (Criteria) this;
        }
        public Criteria andIFirstUnitIdIsNotNull() {
            addCriterion("iFirstUnitId is not null");
            return (Criteria) this;
        }
        public Criteria andIFirstUnitIdEqualTo(Integer value) {
            addCriterion("iFirstUnitId =", value, "iFirstUnitId");
            return (Criteria) this;
        }
        public Criteria andIFirstUnitIdNotEqualTo(Integer value) {
            addCriterion("iFirstUnitId <>", value, "iFirstUnitId");
            return (Criteria) this;
        }
        public Criteria andIFirstUnitIdGreaterThan(Integer value) {
            addCriterion("iFirstUnitId >", value, "iFirstUnitId");
            return (Criteria) this;
        }
        public Criteria andIFirstUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iFirstUnitId >=", value, "iFirstUnitId");
            return (Criteria) this;
        }
        public Criteria andIFirstUnitIdLessThan(Integer value) {
            addCriterion("iFirstUnitId <", value, "iFirstUnitId");
            return (Criteria) this;
        }
        public Criteria andIFirstUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("iFirstUnitId <=", value, "iFirstUnitId");
            return (Criteria) this;
        }
        public Criteria andIFirstUnitIdIn(List<Integer> values) {
            addCriterion("iFirstUnitId in", values, "iFirstUnitId");
            return (Criteria) this;
        }
        public Criteria andIFirstUnitIdNotIn(List<Integer> values) {
            addCriterion("iFirstUnitId not in", values, "iFirstUnitId");
            return (Criteria) this;
        }
        public Criteria andIFirstUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("iFirstUnitId between", value1, value2, "iFirstUnitId");
            return (Criteria) this;
        }
        public Criteria andIFirstUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iFirstUnitId not between", value1, value2, "iFirstUnitId");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitCodeIsNull() {
            addCriterion("sFirstUnitCode is null");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitCodeIsNotNull() {
            addCriterion("sFirstUnitCode is not null");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitCodeEqualTo(String value) {
            addCriterion("sFirstUnitCode =", value, "sFirstUnitCode");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitCodeNotEqualTo(String value) {
            addCriterion("sFirstUnitCode <>", value, "sFirstUnitCode");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitCodeGreaterThan(String value) {
            addCriterion("sFirstUnitCode >", value, "sFirstUnitCode");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sFirstUnitCode >=", value, "sFirstUnitCode");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitCodeLessThan(String value) {
            addCriterion("sFirstUnitCode <", value, "sFirstUnitCode");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("sFirstUnitCode <=", value, "sFirstUnitCode");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitCodeLike(String value) {
            addCriterion("sFirstUnitCode like", value, "sFirstUnitCode");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitCodeNotLike(String value) {
            addCriterion("sFirstUnitCode not like", value, "sFirstUnitCode");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitCodeIn(List<String> values) {
            addCriterion("sFirstUnitCode in", values, "sFirstUnitCode");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitCodeNotIn(List<String> values) {
            addCriterion("sFirstUnitCode not in", values, "sFirstUnitCode");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitCodeBetween(String value1, String value2) {
            addCriterion("sFirstUnitCode between", value1, value2, "sFirstUnitCode");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitCodeNotBetween(String value1, String value2) {
            addCriterion("sFirstUnitCode not between", value1, value2, "sFirstUnitCode");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitNameIsNull() {
            addCriterion("sFirstUnitName is null");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitNameIsNotNull() {
            addCriterion("sFirstUnitName is not null");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitNameEqualTo(String value) {
            addCriterion("sFirstUnitName =", value, "sFirstUnitName");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitNameNotEqualTo(String value) {
            addCriterion("sFirstUnitName <>", value, "sFirstUnitName");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitNameGreaterThan(String value) {
            addCriterion("sFirstUnitName >", value, "sFirstUnitName");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("sFirstUnitName >=", value, "sFirstUnitName");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitNameLessThan(String value) {
            addCriterion("sFirstUnitName <", value, "sFirstUnitName");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitNameLessThanOrEqualTo(String value) {
            addCriterion("sFirstUnitName <=", value, "sFirstUnitName");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitNameLike(String value) {
            addCriterion("sFirstUnitName like", value, "sFirstUnitName");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitNameNotLike(String value) {
            addCriterion("sFirstUnitName not like", value, "sFirstUnitName");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitNameIn(List<String> values) {
            addCriterion("sFirstUnitName in", values, "sFirstUnitName");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitNameNotIn(List<String> values) {
            addCriterion("sFirstUnitName not in", values, "sFirstUnitName");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitNameBetween(String value1, String value2) {
            addCriterion("sFirstUnitName between", value1, value2, "sFirstUnitName");
            return (Criteria) this;
        }
        public Criteria andSFirstUnitNameNotBetween(String value1, String value2) {
            addCriterion("sFirstUnitName not between", value1, value2, "sFirstUnitName");
            return (Criteria) this;
        }
        public Criteria andICHlevyExemptionIdIsNull() {
            addCriterion("iCHlevyExemptionId is null");
            return (Criteria) this;
        }
        public Criteria andICHlevyExemptionIdIsNotNull() {
            addCriterion("iCHlevyExemptionId is not null");
            return (Criteria) this;
        }
        public Criteria andICHlevyExemptionIdEqualTo(Integer value) {
            addCriterion("iCHlevyExemptionId =", value, "iCHlevyExemptionId");
            return (Criteria) this;
        }
        public Criteria andICHlevyExemptionIdNotEqualTo(Integer value) {
            addCriterion("iCHlevyExemptionId <>", value, "iCHlevyExemptionId");
            return (Criteria) this;
        }
        public Criteria andICHlevyExemptionIdGreaterThan(Integer value) {
            addCriterion("iCHlevyExemptionId >", value, "iCHlevyExemptionId");
            return (Criteria) this;
        }
        public Criteria andICHlevyExemptionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iCHlevyExemptionId >=", value, "iCHlevyExemptionId");
            return (Criteria) this;
        }
        public Criteria andICHlevyExemptionIdLessThan(Integer value) {
            addCriterion("iCHlevyExemptionId <", value, "iCHlevyExemptionId");
            return (Criteria) this;
        }
        public Criteria andICHlevyExemptionIdLessThanOrEqualTo(Integer value) {
            addCriterion("iCHlevyExemptionId <=", value, "iCHlevyExemptionId");
            return (Criteria) this;
        }
        public Criteria andICHlevyExemptionIdIn(List<Integer> values) {
            addCriterion("iCHlevyExemptionId in", values, "iCHlevyExemptionId");
            return (Criteria) this;
        }
        public Criteria andICHlevyExemptionIdNotIn(List<Integer> values) {
            addCriterion("iCHlevyExemptionId not in", values, "iCHlevyExemptionId");
            return (Criteria) this;
        }
        public Criteria andICHlevyExemptionIdBetween(Integer value1, Integer value2) {
            addCriterion("iCHlevyExemptionId between", value1, value2, "iCHlevyExemptionId");
            return (Criteria) this;
        }
        public Criteria andICHlevyExemptionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iCHlevyExemptionId not between", value1, value2, "iCHlevyExemptionId");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionCodeIsNull() {
            addCriterion("sCHlevyExemptionCode is null");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionCodeIsNotNull() {
            addCriterion("sCHlevyExemptionCode is not null");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionCodeEqualTo(String value) {
            addCriterion("sCHlevyExemptionCode =", value, "sCHlevyExemptionCode");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionCodeNotEqualTo(String value) {
            addCriterion("sCHlevyExemptionCode <>", value, "sCHlevyExemptionCode");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionCodeGreaterThan(String value) {
            addCriterion("sCHlevyExemptionCode >", value, "sCHlevyExemptionCode");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sCHlevyExemptionCode >=", value, "sCHlevyExemptionCode");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionCodeLessThan(String value) {
            addCriterion("sCHlevyExemptionCode <", value, "sCHlevyExemptionCode");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionCodeLessThanOrEqualTo(String value) {
            addCriterion("sCHlevyExemptionCode <=", value, "sCHlevyExemptionCode");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionCodeLike(String value) {
            addCriterion("sCHlevyExemptionCode like", value, "sCHlevyExemptionCode");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionCodeNotLike(String value) {
            addCriterion("sCHlevyExemptionCode not like", value, "sCHlevyExemptionCode");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionCodeIn(List<String> values) {
            addCriterion("sCHlevyExemptionCode in", values, "sCHlevyExemptionCode");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionCodeNotIn(List<String> values) {
            addCriterion("sCHlevyExemptionCode not in", values, "sCHlevyExemptionCode");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionCodeBetween(String value1, String value2) {
            addCriterion("sCHlevyExemptionCode between", value1, value2, "sCHlevyExemptionCode");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionCodeNotBetween(String value1, String value2) {
            addCriterion("sCHlevyExemptionCode not between", value1, value2, "sCHlevyExemptionCode");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionNameIsNull() {
            addCriterion("sCHlevyExemptionName is null");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionNameIsNotNull() {
            addCriterion("sCHlevyExemptionName is not null");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionNameEqualTo(String value) {
            addCriterion("sCHlevyExemptionName =", value, "sCHlevyExemptionName");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionNameNotEqualTo(String value) {
            addCriterion("sCHlevyExemptionName <>", value, "sCHlevyExemptionName");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionNameGreaterThan(String value) {
            addCriterion("sCHlevyExemptionName >", value, "sCHlevyExemptionName");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionNameGreaterThanOrEqualTo(String value) {
            addCriterion("sCHlevyExemptionName >=", value, "sCHlevyExemptionName");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionNameLessThan(String value) {
            addCriterion("sCHlevyExemptionName <", value, "sCHlevyExemptionName");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionNameLessThanOrEqualTo(String value) {
            addCriterion("sCHlevyExemptionName <=", value, "sCHlevyExemptionName");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionNameLike(String value) {
            addCriterion("sCHlevyExemptionName like", value, "sCHlevyExemptionName");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionNameNotLike(String value) {
            addCriterion("sCHlevyExemptionName not like", value, "sCHlevyExemptionName");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionNameIn(List<String> values) {
            addCriterion("sCHlevyExemptionName in", values, "sCHlevyExemptionName");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionNameNotIn(List<String> values) {
            addCriterion("sCHlevyExemptionName not in", values, "sCHlevyExemptionName");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionNameBetween(String value1, String value2) {
            addCriterion("sCHlevyExemptionName between", value1, value2, "sCHlevyExemptionName");
            return (Criteria) this;
        }
        public Criteria andSCHlevyExemptionNameNotBetween(String value1, String value2) {
            addCriterion("sCHlevyExemptionName not between", value1, value2, "sCHlevyExemptionName");
            return (Criteria) this;
        }
        public Criteria andIQuantity2IsNull() {
            addCriterion("iQuantity2 is null");
            return (Criteria) this;
        }
        public Criteria andIQuantity2IsNotNull() {
            addCriterion("iQuantity2 is not null");
            return (Criteria) this;
        }
        public Criteria andIQuantity2EqualTo(Double value) {
            addCriterion("iQuantity2 =", value, "iQuantity2");
            return (Criteria) this;
        }
        public Criteria andIQuantity2NotEqualTo(Double value) {
            addCriterion("iQuantity2 <>", value, "iQuantity2");
            return (Criteria) this;
        }
        public Criteria andIQuantity2GreaterThan(Double value) {
            addCriterion("iQuantity2 >", value, "iQuantity2");
            return (Criteria) this;
        }
        public Criteria andIQuantity2GreaterThanOrEqualTo(Double value) {
            addCriterion("iQuantity2 >=", value, "iQuantity2");
            return (Criteria) this;
        }
        public Criteria andIQuantity2LessThan(Double value) {
            addCriterion("iQuantity2 <", value, "iQuantity2");
            return (Criteria) this;
        }
        public Criteria andIQuantity2LessThanOrEqualTo(Double value) {
            addCriterion("iQuantity2 <=", value, "iQuantity2");
            return (Criteria) this;
        }
        public Criteria andIQuantity2In(List<Double> values) {
            addCriterion("iQuantity2 in", values, "iQuantity2");
            return (Criteria) this;
        }
        public Criteria andIQuantity2NotIn(List<Double> values) {
            addCriterion("iQuantity2 not in", values, "iQuantity2");
            return (Criteria) this;
        }
        public Criteria andIQuantity2Between(Double value1, Double value2) {
            addCriterion("iQuantity2 between", value1, value2, "iQuantity2");
            return (Criteria) this;
        }
        public Criteria andIQuantity2NotBetween(Double value1, Double value2) {
            addCriterion("iQuantity2 not between", value1, value2, "iQuantity2");
            return (Criteria) this;
        }
        public Criteria andISecondUnitIdIsNull() {
            addCriterion("iSecondUnitId is null");
            return (Criteria) this;
        }
        public Criteria andISecondUnitIdIsNotNull() {
            addCriterion("iSecondUnitId is not null");
            return (Criteria) this;
        }
        public Criteria andISecondUnitIdEqualTo(Integer value) {
            addCriterion("iSecondUnitId =", value, "iSecondUnitId");
            return (Criteria) this;
        }
        public Criteria andISecondUnitIdNotEqualTo(Integer value) {
            addCriterion("iSecondUnitId <>", value, "iSecondUnitId");
            return (Criteria) this;
        }
        public Criteria andISecondUnitIdGreaterThan(Integer value) {
            addCriterion("iSecondUnitId >", value, "iSecondUnitId");
            return (Criteria) this;
        }
        public Criteria andISecondUnitIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iSecondUnitId >=", value, "iSecondUnitId");
            return (Criteria) this;
        }
        public Criteria andISecondUnitIdLessThan(Integer value) {
            addCriterion("iSecondUnitId <", value, "iSecondUnitId");
            return (Criteria) this;
        }
        public Criteria andISecondUnitIdLessThanOrEqualTo(Integer value) {
            addCriterion("iSecondUnitId <=", value, "iSecondUnitId");
            return (Criteria) this;
        }
        public Criteria andISecondUnitIdIn(List<Integer> values) {
            addCriterion("iSecondUnitId in", values, "iSecondUnitId");
            return (Criteria) this;
        }
        public Criteria andISecondUnitIdNotIn(List<Integer> values) {
            addCriterion("iSecondUnitId not in", values, "iSecondUnitId");
            return (Criteria) this;
        }
        public Criteria andISecondUnitIdBetween(Integer value1, Integer value2) {
            addCriterion("iSecondUnitId between", value1, value2, "iSecondUnitId");
            return (Criteria) this;
        }
        public Criteria andISecondUnitIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iSecondUnitId not between", value1, value2, "iSecondUnitId");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitCodeIsNull() {
            addCriterion("sSecondUnitCode is null");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitCodeIsNotNull() {
            addCriterion("sSecondUnitCode is not null");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitCodeEqualTo(String value) {
            addCriterion("sSecondUnitCode =", value, "sSecondUnitCode");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitCodeNotEqualTo(String value) {
            addCriterion("sSecondUnitCode <>", value, "sSecondUnitCode");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitCodeGreaterThan(String value) {
            addCriterion("sSecondUnitCode >", value, "sSecondUnitCode");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sSecondUnitCode >=", value, "sSecondUnitCode");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitCodeLessThan(String value) {
            addCriterion("sSecondUnitCode <", value, "sSecondUnitCode");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitCodeLessThanOrEqualTo(String value) {
            addCriterion("sSecondUnitCode <=", value, "sSecondUnitCode");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitCodeLike(String value) {
            addCriterion("sSecondUnitCode like", value, "sSecondUnitCode");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitCodeNotLike(String value) {
            addCriterion("sSecondUnitCode not like", value, "sSecondUnitCode");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitCodeIn(List<String> values) {
            addCriterion("sSecondUnitCode in", values, "sSecondUnitCode");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitCodeNotIn(List<String> values) {
            addCriterion("sSecondUnitCode not in", values, "sSecondUnitCode");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitCodeBetween(String value1, String value2) {
            addCriterion("sSecondUnitCode between", value1, value2, "sSecondUnitCode");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitCodeNotBetween(String value1, String value2) {
            addCriterion("sSecondUnitCode not between", value1, value2, "sSecondUnitCode");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitNameIsNull() {
            addCriterion("sSecondUnitName is null");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitNameIsNotNull() {
            addCriterion("sSecondUnitName is not null");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitNameEqualTo(String value) {
            addCriterion("sSecondUnitName =", value, "sSecondUnitName");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitNameNotEqualTo(String value) {
            addCriterion("sSecondUnitName <>", value, "sSecondUnitName");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitNameGreaterThan(String value) {
            addCriterion("sSecondUnitName >", value, "sSecondUnitName");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitNameGreaterThanOrEqualTo(String value) {
            addCriterion("sSecondUnitName >=", value, "sSecondUnitName");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitNameLessThan(String value) {
            addCriterion("sSecondUnitName <", value, "sSecondUnitName");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitNameLessThanOrEqualTo(String value) {
            addCriterion("sSecondUnitName <=", value, "sSecondUnitName");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitNameLike(String value) {
            addCriterion("sSecondUnitName like", value, "sSecondUnitName");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitNameNotLike(String value) {
            addCriterion("sSecondUnitName not like", value, "sSecondUnitName");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitNameIn(List<String> values) {
            addCriterion("sSecondUnitName in", values, "sSecondUnitName");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitNameNotIn(List<String> values) {
            addCriterion("sSecondUnitName not in", values, "sSecondUnitName");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitNameBetween(String value1, String value2) {
            addCriterion("sSecondUnitName between", value1, value2, "sSecondUnitName");
            return (Criteria) this;
        }
        public Criteria andSSecondUnitNameNotBetween(String value1, String value2) {
            addCriterion("sSecondUnitName not between", value1, value2, "sSecondUnitName");
            return (Criteria) this;
        }
        public Criteria andIOriginCountryIdIsNull() {
            addCriterion("iOriginCountryId is null");
            return (Criteria) this;
        }
        public Criteria andIOriginCountryIdIsNotNull() {
            addCriterion("iOriginCountryId is not null");
            return (Criteria) this;
        }
        public Criteria andIOriginCountryIdEqualTo(Integer value) {
            addCriterion("iOriginCountryId =", value, "iOriginCountryId");
            return (Criteria) this;
        }
        public Criteria andIOriginCountryIdNotEqualTo(Integer value) {
            addCriterion("iOriginCountryId <>", value, "iOriginCountryId");
            return (Criteria) this;
        }
        public Criteria andIOriginCountryIdGreaterThan(Integer value) {
            addCriterion("iOriginCountryId >", value, "iOriginCountryId");
            return (Criteria) this;
        }
        public Criteria andIOriginCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iOriginCountryId >=", value, "iOriginCountryId");
            return (Criteria) this;
        }
        public Criteria andIOriginCountryIdLessThan(Integer value) {
            addCriterion("iOriginCountryId <", value, "iOriginCountryId");
            return (Criteria) this;
        }
        public Criteria andIOriginCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("iOriginCountryId <=", value, "iOriginCountryId");
            return (Criteria) this;
        }
        public Criteria andIOriginCountryIdIn(List<Integer> values) {
            addCriterion("iOriginCountryId in", values, "iOriginCountryId");
            return (Criteria) this;
        }
        public Criteria andIOriginCountryIdNotIn(List<Integer> values) {
            addCriterion("iOriginCountryId not in", values, "iOriginCountryId");
            return (Criteria) this;
        }
        public Criteria andIOriginCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("iOriginCountryId between", value1, value2, "iOriginCountryId");
            return (Criteria) this;
        }
        public Criteria andIOriginCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iOriginCountryId not between", value1, value2, "iOriginCountryId");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryCodeIsNull() {
            addCriterion("sOriginCountryCode is null");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryCodeIsNotNull() {
            addCriterion("sOriginCountryCode is not null");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryCodeEqualTo(String value) {
            addCriterion("sOriginCountryCode =", value, "sOriginCountryCode");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryCodeNotEqualTo(String value) {
            addCriterion("sOriginCountryCode <>", value, "sOriginCountryCode");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryCodeGreaterThan(String value) {
            addCriterion("sOriginCountryCode >", value, "sOriginCountryCode");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sOriginCountryCode >=", value, "sOriginCountryCode");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryCodeLessThan(String value) {
            addCriterion("sOriginCountryCode <", value, "sOriginCountryCode");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("sOriginCountryCode <=", value, "sOriginCountryCode");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryCodeLike(String value) {
            addCriterion("sOriginCountryCode like", value, "sOriginCountryCode");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryCodeNotLike(String value) {
            addCriterion("sOriginCountryCode not like", value, "sOriginCountryCode");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryCodeIn(List<String> values) {
            addCriterion("sOriginCountryCode in", values, "sOriginCountryCode");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryCodeNotIn(List<String> values) {
            addCriterion("sOriginCountryCode not in", values, "sOriginCountryCode");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryCodeBetween(String value1, String value2) {
            addCriterion("sOriginCountryCode between", value1, value2, "sOriginCountryCode");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryCodeNotBetween(String value1, String value2) {
            addCriterion("sOriginCountryCode not between", value1, value2, "sOriginCountryCode");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameCnIsNull() {
            addCriterion("sOriginCountryNameCn is null");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameCnIsNotNull() {
            addCriterion("sOriginCountryNameCn is not null");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameCnEqualTo(String value) {
            addCriterion("sOriginCountryNameCn =", value, "sOriginCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameCnNotEqualTo(String value) {
            addCriterion("sOriginCountryNameCn <>", value, "sOriginCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameCnGreaterThan(String value) {
            addCriterion("sOriginCountryNameCn >", value, "sOriginCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("sOriginCountryNameCn >=", value, "sOriginCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameCnLessThan(String value) {
            addCriterion("sOriginCountryNameCn <", value, "sOriginCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameCnLessThanOrEqualTo(String value) {
            addCriterion("sOriginCountryNameCn <=", value, "sOriginCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameCnLike(String value) {
            addCriterion("sOriginCountryNameCn like", value, "sOriginCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameCnNotLike(String value) {
            addCriterion("sOriginCountryNameCn not like", value, "sOriginCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameCnIn(List<String> values) {
            addCriterion("sOriginCountryNameCn in", values, "sOriginCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameCnNotIn(List<String> values) {
            addCriterion("sOriginCountryNameCn not in", values, "sOriginCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameCnBetween(String value1, String value2) {
            addCriterion("sOriginCountryNameCn between", value1, value2, "sOriginCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameCnNotBetween(String value1, String value2) {
            addCriterion("sOriginCountryNameCn not between", value1, value2, "sOriginCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameEnIsNull() {
            addCriterion("sOriginCountryNameEn is null");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameEnIsNotNull() {
            addCriterion("sOriginCountryNameEn is not null");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameEnEqualTo(String value) {
            addCriterion("sOriginCountryNameEn =", value, "sOriginCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameEnNotEqualTo(String value) {
            addCriterion("sOriginCountryNameEn <>", value, "sOriginCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameEnGreaterThan(String value) {
            addCriterion("sOriginCountryNameEn >", value, "sOriginCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("sOriginCountryNameEn >=", value, "sOriginCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameEnLessThan(String value) {
            addCriterion("sOriginCountryNameEn <", value, "sOriginCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameEnLessThanOrEqualTo(String value) {
            addCriterion("sOriginCountryNameEn <=", value, "sOriginCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameEnLike(String value) {
            addCriterion("sOriginCountryNameEn like", value, "sOriginCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameEnNotLike(String value) {
            addCriterion("sOriginCountryNameEn not like", value, "sOriginCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameEnIn(List<String> values) {
            addCriterion("sOriginCountryNameEn in", values, "sOriginCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameEnNotIn(List<String> values) {
            addCriterion("sOriginCountryNameEn not in", values, "sOriginCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameEnBetween(String value1, String value2) {
            addCriterion("sOriginCountryNameEn between", value1, value2, "sOriginCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSOriginCountryNameEnNotBetween(String value1, String value2) {
            addCriterion("sOriginCountryNameEn not between", value1, value2, "sOriginCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andITargetCountryIdIsNull() {
            addCriterion("iTargetCountryId is null");
            return (Criteria) this;
        }
        public Criteria andITargetCountryIdIsNotNull() {
            addCriterion("iTargetCountryId is not null");
            return (Criteria) this;
        }
        public Criteria andITargetCountryIdEqualTo(Integer value) {
            addCriterion("iTargetCountryId =", value, "iTargetCountryId");
            return (Criteria) this;
        }
        public Criteria andITargetCountryIdNotEqualTo(Integer value) {
            addCriterion("iTargetCountryId <>", value, "iTargetCountryId");
            return (Criteria) this;
        }
        public Criteria andITargetCountryIdGreaterThan(Integer value) {
            addCriterion("iTargetCountryId >", value, "iTargetCountryId");
            return (Criteria) this;
        }
        public Criteria andITargetCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iTargetCountryId >=", value, "iTargetCountryId");
            return (Criteria) this;
        }
        public Criteria andITargetCountryIdLessThan(Integer value) {
            addCriterion("iTargetCountryId <", value, "iTargetCountryId");
            return (Criteria) this;
        }
        public Criteria andITargetCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("iTargetCountryId <=", value, "iTargetCountryId");
            return (Criteria) this;
        }
        public Criteria andITargetCountryIdIn(List<Integer> values) {
            addCriterion("iTargetCountryId in", values, "iTargetCountryId");
            return (Criteria) this;
        }
        public Criteria andITargetCountryIdNotIn(List<Integer> values) {
            addCriterion("iTargetCountryId not in", values, "iTargetCountryId");
            return (Criteria) this;
        }
        public Criteria andITargetCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("iTargetCountryId between", value1, value2, "iTargetCountryId");
            return (Criteria) this;
        }
        public Criteria andITargetCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iTargetCountryId not between", value1, value2, "iTargetCountryId");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryCodeIsNull() {
            addCriterion("sTargetCountryCode is null");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryCodeIsNotNull() {
            addCriterion("sTargetCountryCode is not null");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryCodeEqualTo(String value) {
            addCriterion("sTargetCountryCode =", value, "sTargetCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryCodeNotEqualTo(String value) {
            addCriterion("sTargetCountryCode <>", value, "sTargetCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryCodeGreaterThan(String value) {
            addCriterion("sTargetCountryCode >", value, "sTargetCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sTargetCountryCode >=", value, "sTargetCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryCodeLessThan(String value) {
            addCriterion("sTargetCountryCode <", value, "sTargetCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("sTargetCountryCode <=", value, "sTargetCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryCodeLike(String value) {
            addCriterion("sTargetCountryCode like", value, "sTargetCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryCodeNotLike(String value) {
            addCriterion("sTargetCountryCode not like", value, "sTargetCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryCodeIn(List<String> values) {
            addCriterion("sTargetCountryCode in", values, "sTargetCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryCodeNotIn(List<String> values) {
            addCriterion("sTargetCountryCode not in", values, "sTargetCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryCodeBetween(String value1, String value2) {
            addCriterion("sTargetCountryCode between", value1, value2, "sTargetCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryCodeNotBetween(String value1, String value2) {
            addCriterion("sTargetCountryCode not between", value1, value2, "sTargetCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameCnIsNull() {
            addCriterion("sTargetCountryNameCn is null");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameCnIsNotNull() {
            addCriterion("sTargetCountryNameCn is not null");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameCnEqualTo(String value) {
            addCriterion("sTargetCountryNameCn =", value, "sTargetCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameCnNotEqualTo(String value) {
            addCriterion("sTargetCountryNameCn <>", value, "sTargetCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameCnGreaterThan(String value) {
            addCriterion("sTargetCountryNameCn >", value, "sTargetCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("sTargetCountryNameCn >=", value, "sTargetCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameCnLessThan(String value) {
            addCriterion("sTargetCountryNameCn <", value, "sTargetCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameCnLessThanOrEqualTo(String value) {
            addCriterion("sTargetCountryNameCn <=", value, "sTargetCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameCnLike(String value) {
            addCriterion("sTargetCountryNameCn like", value, "sTargetCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameCnNotLike(String value) {
            addCriterion("sTargetCountryNameCn not like", value, "sTargetCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameCnIn(List<String> values) {
            addCriterion("sTargetCountryNameCn in", values, "sTargetCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameCnNotIn(List<String> values) {
            addCriterion("sTargetCountryNameCn not in", values, "sTargetCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameCnBetween(String value1, String value2) {
            addCriterion("sTargetCountryNameCn between", value1, value2, "sTargetCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameCnNotBetween(String value1, String value2) {
            addCriterion("sTargetCountryNameCn not between", value1, value2, "sTargetCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameEnIsNull() {
            addCriterion("sTargetCountryNameEn is null");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameEnIsNotNull() {
            addCriterion("sTargetCountryNameEn is not null");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameEnEqualTo(String value) {
            addCriterion("sTargetCountryNameEn =", value, "sTargetCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameEnNotEqualTo(String value) {
            addCriterion("sTargetCountryNameEn <>", value, "sTargetCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameEnGreaterThan(String value) {
            addCriterion("sTargetCountryNameEn >", value, "sTargetCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("sTargetCountryNameEn >=", value, "sTargetCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameEnLessThan(String value) {
            addCriterion("sTargetCountryNameEn <", value, "sTargetCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameEnLessThanOrEqualTo(String value) {
            addCriterion("sTargetCountryNameEn <=", value, "sTargetCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameEnLike(String value) {
            addCriterion("sTargetCountryNameEn like", value, "sTargetCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameEnNotLike(String value) {
            addCriterion("sTargetCountryNameEn not like", value, "sTargetCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameEnIn(List<String> values) {
            addCriterion("sTargetCountryNameEn in", values, "sTargetCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameEnNotIn(List<String> values) {
            addCriterion("sTargetCountryNameEn not in", values, "sTargetCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameEnBetween(String value1, String value2) {
            addCriterion("sTargetCountryNameEn between", value1, value2, "sTargetCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTargetCountryNameEnNotBetween(String value1, String value2) {
            addCriterion("sTargetCountryNameEn not between", value1, value2, "sTargetCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andBDeletedIsNull() {
            addCriterion("bDeleted is null");
            return (Criteria) this;
        }
        public Criteria andBDeletedIsNotNull() {
            addCriterion("bDeleted is not null");
            return (Criteria) this;
        }
        public Criteria andBDeletedEqualTo(Byte value) {
            addCriterion("bDeleted =", value, "bDeleted");
            return (Criteria) this;
        }
        public Criteria andBDeletedNotEqualTo(Byte value) {
            addCriterion("bDeleted <>", value, "bDeleted");
            return (Criteria) this;
        }
        public Criteria andBDeletedGreaterThan(Byte value) {
            addCriterion("bDeleted >", value, "bDeleted");
            return (Criteria) this;
        }
        public Criteria andBDeletedGreaterThanOrEqualTo(Byte value) {
            addCriterion("bDeleted >=", value, "bDeleted");
            return (Criteria) this;
        }
        public Criteria andBDeletedLessThan(Byte value) {
            addCriterion("bDeleted <", value, "bDeleted");
            return (Criteria) this;
        }
        public Criteria andBDeletedLessThanOrEqualTo(Byte value) {
            addCriterion("bDeleted <=", value, "bDeleted");
            return (Criteria) this;
        }
        public Criteria andBDeletedIn(List<Byte> values) {
            addCriterion("bDeleted in", values, "bDeleted");
            return (Criteria) this;
        }
        public Criteria andBDeletedNotIn(List<Byte> values) {
            addCriterion("bDeleted not in", values, "bDeleted");
            return (Criteria) this;
        }
        public Criteria andBDeletedBetween(Byte value1, Byte value2) {
            addCriterion("bDeleted between", value1, value2, "bDeleted");
            return (Criteria) this;
        }
        public Criteria andBDeletedNotBetween(Byte value1, Byte value2) {
            addCriterion("bDeleted not between", value1, value2, "bDeleted");
            return (Criteria) this;
        }
        public Criteria andSCreatorIsNull() {
            addCriterion("sCreator is null");
            return (Criteria) this;
        }
        public Criteria andSCreatorIsNotNull() {
            addCriterion("sCreator is not null");
            return (Criteria) this;
        }
        public Criteria andSCreatorEqualTo(String value) {
            addCriterion("sCreator =", value, "sCreator");
            return (Criteria) this;
        }
        public Criteria andSCreatorNotEqualTo(String value) {
            addCriterion("sCreator <>", value, "sCreator");
            return (Criteria) this;
        }
        public Criteria andSCreatorGreaterThan(String value) {
            addCriterion("sCreator >", value, "sCreator");
            return (Criteria) this;
        }
        public Criteria andSCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("sCreator >=", value, "sCreator");
            return (Criteria) this;
        }
        public Criteria andSCreatorLessThan(String value) {
            addCriterion("sCreator <", value, "sCreator");
            return (Criteria) this;
        }
        public Criteria andSCreatorLessThanOrEqualTo(String value) {
            addCriterion("sCreator <=", value, "sCreator");
            return (Criteria) this;
        }
        public Criteria andSCreatorLike(String value) {
            addCriterion("sCreator like", value, "sCreator");
            return (Criteria) this;
        }
        public Criteria andSCreatorNotLike(String value) {
            addCriterion("sCreator not like", value, "sCreator");
            return (Criteria) this;
        }
        public Criteria andSCreatorIn(List<String> values) {
            addCriterion("sCreator in", values, "sCreator");
            return (Criteria) this;
        }
        public Criteria andSCreatorNotIn(List<String> values) {
            addCriterion("sCreator not in", values, "sCreator");
            return (Criteria) this;
        }
        public Criteria andSCreatorBetween(String value1, String value2) {
            addCriterion("sCreator between", value1, value2, "sCreator");
            return (Criteria) this;
        }
        public Criteria andSCreatorNotBetween(String value1, String value2) {
            addCriterion("sCreator not between", value1, value2, "sCreator");
            return (Criteria) this;
        }
        public Criteria andTCreateTimeIsNull() {
            addCriterion("tCreateTime is null");
            return (Criteria) this;
        }
        public Criteria andTCreateTimeIsNotNull() {
            addCriterion("tCreateTime is not null");
            return (Criteria) this;
        }
        public Criteria andTCreateTimeEqualTo(Date value) {
            addCriterion("tCreateTime =", value, "tCreateTime");
            return (Criteria) this;
        }
        public Criteria andTCreateTimeNotEqualTo(Date value) {
            addCriterion("tCreateTime <>", value, "tCreateTime");
            return (Criteria) this;
        }
        public Criteria andTCreateTimeGreaterThan(Date value) {
            addCriterion("tCreateTime >", value, "tCreateTime");
            return (Criteria) this;
        }
        public Criteria andTCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tCreateTime >=", value, "tCreateTime");
            return (Criteria) this;
        }
        public Criteria andTCreateTimeLessThan(Date value) {
            addCriterion("tCreateTime <", value, "tCreateTime");
            return (Criteria) this;
        }
        public Criteria andTCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tCreateTime <=", value, "tCreateTime");
            return (Criteria) this;
        }
        public Criteria andTCreateTimeIn(List<Date> values) {
            addCriterion("tCreateTime in", values, "tCreateTime");
            return (Criteria) this;
        }
        public Criteria andTCreateTimeNotIn(List<Date> values) {
            addCriterion("tCreateTime not in", values, "tCreateTime");
            return (Criteria) this;
        }
        public Criteria andTCreateTimeBetween(Date value1, Date value2) {
            addCriterion("tCreateTime between", value1, value2, "tCreateTime");
            return (Criteria) this;
        }
        public Criteria andTCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tCreateTime not between", value1, value2, "tCreateTime");
            return (Criteria) this;
        }
        public Criteria andSUpdateManIsNull() {
            addCriterion("sUpdateMan is null");
            return (Criteria) this;
        }
        public Criteria andSUpdateManIsNotNull() {
            addCriterion("sUpdateMan is not null");
            return (Criteria) this;
        }
        public Criteria andSUpdateManEqualTo(String value) {
            addCriterion("sUpdateMan =", value, "sUpdateMan");
            return (Criteria) this;
        }
        public Criteria andSUpdateManNotEqualTo(String value) {
            addCriterion("sUpdateMan <>", value, "sUpdateMan");
            return (Criteria) this;
        }
        public Criteria andSUpdateManGreaterThan(String value) {
            addCriterion("sUpdateMan >", value, "sUpdateMan");
            return (Criteria) this;
        }
        public Criteria andSUpdateManGreaterThanOrEqualTo(String value) {
            addCriterion("sUpdateMan >=", value, "sUpdateMan");
            return (Criteria) this;
        }
        public Criteria andSUpdateManLessThan(String value) {
            addCriterion("sUpdateMan <", value, "sUpdateMan");
            return (Criteria) this;
        }
        public Criteria andSUpdateManLessThanOrEqualTo(String value) {
            addCriterion("sUpdateMan <=", value, "sUpdateMan");
            return (Criteria) this;
        }
        public Criteria andSUpdateManLike(String value) {
            addCriterion("sUpdateMan like", value, "sUpdateMan");
            return (Criteria) this;
        }
        public Criteria andSUpdateManNotLike(String value) {
            addCriterion("sUpdateMan not like", value, "sUpdateMan");
            return (Criteria) this;
        }
        public Criteria andSUpdateManIn(List<String> values) {
            addCriterion("sUpdateMan in", values, "sUpdateMan");
            return (Criteria) this;
        }
        public Criteria andSUpdateManNotIn(List<String> values) {
            addCriterion("sUpdateMan not in", values, "sUpdateMan");
            return (Criteria) this;
        }
        public Criteria andSUpdateManBetween(String value1, String value2) {
            addCriterion("sUpdateMan between", value1, value2, "sUpdateMan");
            return (Criteria) this;
        }
        public Criteria andSUpdateManNotBetween(String value1, String value2) {
            addCriterion("sUpdateMan not between", value1, value2, "sUpdateMan");
            return (Criteria) this;
        }
        public Criteria andTUpdateTimeIsNull() {
            addCriterion("tUpdateTime is null");
            return (Criteria) this;
        }
        public Criteria andTUpdateTimeIsNotNull() {
            addCriterion("tUpdateTime is not null");
            return (Criteria) this;
        }
        public Criteria andTUpdateTimeEqualTo(Date value) {
            addCriterion("tUpdateTime =", value, "tUpdateTime");
            return (Criteria) this;
        }
        public Criteria andTUpdateTimeNotEqualTo(Date value) {
            addCriterion("tUpdateTime <>", value, "tUpdateTime");
            return (Criteria) this;
        }
        public Criteria andTUpdateTimeGreaterThan(Date value) {
            addCriterion("tUpdateTime >", value, "tUpdateTime");
            return (Criteria) this;
        }
        public Criteria andTUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("tUpdateTime >=", value, "tUpdateTime");
            return (Criteria) this;
        }
        public Criteria andTUpdateTimeLessThan(Date value) {
            addCriterion("tUpdateTime <", value, "tUpdateTime");
            return (Criteria) this;
        }
        public Criteria andTUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("tUpdateTime <=", value, "tUpdateTime");
            return (Criteria) this;
        }
        public Criteria andTUpdateTimeIn(List<Date> values) {
            addCriterion("tUpdateTime in", values, "tUpdateTime");
            return (Criteria) this;
        }
        public Criteria andTUpdateTimeNotIn(List<Date> values) {
            addCriterion("tUpdateTime not in", values, "tUpdateTime");
            return (Criteria) this;
        }
        public Criteria andTUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("tUpdateTime between", value1, value2, "tUpdateTime");
            return (Criteria) this;
        }
        public Criteria andTUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("tUpdateTime not between", value1, value2, "tUpdateTime");
            return (Criteria) this;
        }
        public Criteria andSRemarkIsNull() {
            addCriterion("sRemark is null");
            return (Criteria) this;
        }
        public Criteria andSRemarkIsNotNull() {
            addCriterion("sRemark is not null");
            return (Criteria) this;
        }
        public Criteria andSRemarkEqualTo(String value) {
            addCriterion("sRemark =", value, "sRemark");
            return (Criteria) this;
        }
        public Criteria andSRemarkNotEqualTo(String value) {
            addCriterion("sRemark <>", value, "sRemark");
            return (Criteria) this;
        }
        public Criteria andSRemarkGreaterThan(String value) {
            addCriterion("sRemark >", value, "sRemark");
            return (Criteria) this;
        }
        public Criteria andSRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("sRemark >=", value, "sRemark");
            return (Criteria) this;
        }
        public Criteria andSRemarkLessThan(String value) {
            addCriterion("sRemark <", value, "sRemark");
            return (Criteria) this;
        }
        public Criteria andSRemarkLessThanOrEqualTo(String value) {
            addCriterion("sRemark <=", value, "sRemark");
            return (Criteria) this;
        }
        public Criteria andSRemarkLike(String value) {
            addCriterion("sRemark like", value, "sRemark");
            return (Criteria) this;
        }
        public Criteria andSRemarkNotLike(String value) {
            addCriterion("sRemark not like", value, "sRemark");
            return (Criteria) this;
        }
        public Criteria andSRemarkIn(List<String> values) {
            addCriterion("sRemark in", values, "sRemark");
            return (Criteria) this;
        }
        public Criteria andSRemarkNotIn(List<String> values) {
            addCriterion("sRemark not in", values, "sRemark");
            return (Criteria) this;
        }
        public Criteria andSRemarkBetween(String value1, String value2) {
            addCriterion("sRemark between", value1, value2, "sRemark");
            return (Criteria) this;
        }
        public Criteria andSRemarkNotBetween(String value1, String value2) {
            addCriterion("sRemark not between", value1, value2, "sRemark");
            return (Criteria) this;
        }
        public Criteria andINewTradeSerialNumberIsNull() {
            addCriterion("iNewTradeSerialNumber is null");
            return (Criteria) this;
        }
        public Criteria andINewTradeSerialNumberIsNotNull() {
            addCriterion("iNewTradeSerialNumber is not null");
            return (Criteria) this;
        }
        public Criteria andINewTradeSerialNumberEqualTo(Integer value) {
            addCriterion("iNewTradeSerialNumber =", value, "iNewTradeSerialNumber");
            return (Criteria) this;
        }
        public Criteria andINewTradeSerialNumberNotEqualTo(Integer value) {
            addCriterion("iNewTradeSerialNumber <>", value, "iNewTradeSerialNumber");
            return (Criteria) this;
        }
        public Criteria andINewTradeSerialNumberGreaterThan(Integer value) {
            addCriterion("iNewTradeSerialNumber >", value, "iNewTradeSerialNumber");
            return (Criteria) this;
        }
        public Criteria andINewTradeSerialNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("iNewTradeSerialNumber >=", value, "iNewTradeSerialNumber");
            return (Criteria) this;
        }
        public Criteria andINewTradeSerialNumberLessThan(Integer value) {
            addCriterion("iNewTradeSerialNumber <", value, "iNewTradeSerialNumber");
            return (Criteria) this;
        }
        public Criteria andINewTradeSerialNumberLessThanOrEqualTo(Integer value) {
            addCriterion("iNewTradeSerialNumber <=", value, "iNewTradeSerialNumber");
            return (Criteria) this;
        }
        public Criteria andINewTradeSerialNumberIn(List<Integer> values) {
            addCriterion("iNewTradeSerialNumber in", values, "iNewTradeSerialNumber");
            return (Criteria) this;
        }
        public Criteria andINewTradeSerialNumberNotIn(List<Integer> values) {
            addCriterion("iNewTradeSerialNumber not in", values, "iNewTradeSerialNumber");
            return (Criteria) this;
        }
        public Criteria andINewTradeSerialNumberBetween(Integer value1, Integer value2) {
            addCriterion("iNewTradeSerialNumber between", value1, value2, "iNewTradeSerialNumber");
            return (Criteria) this;
        }
        public Criteria andINewTradeSerialNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("iNewTradeSerialNumber not between", value1, value2, "iNewTradeSerialNumber");
            return (Criteria) this;
        }
        public Criteria andSProductModelIsNull() {
            addCriterion("sProductModel is null");
            return (Criteria) this;
        }
        public Criteria andSProductModelIsNotNull() {
            addCriterion("sProductModel is not null");
            return (Criteria) this;
        }
        public Criteria andSProductModelEqualTo(String value) {
            addCriterion("sProductModel =", value, "sProductModel");
            return (Criteria) this;
        }
        public Criteria andSProductModelNotEqualTo(String value) {
            addCriterion("sProductModel <>", value, "sProductModel");
            return (Criteria) this;
        }
        public Criteria andSProductModelGreaterThan(String value) {
            addCriterion("sProductModel >", value, "sProductModel");
            return (Criteria) this;
        }
        public Criteria andSProductModelGreaterThanOrEqualTo(String value) {
            addCriterion("sProductModel >=", value, "sProductModel");
            return (Criteria) this;
        }
        public Criteria andSProductModelLessThan(String value) {
            addCriterion("sProductModel <", value, "sProductModel");
            return (Criteria) this;
        }
        public Criteria andSProductModelLessThanOrEqualTo(String value) {
            addCriterion("sProductModel <=", value, "sProductModel");
            return (Criteria) this;
        }
        public Criteria andSProductModelLike(String value) {
            addCriterion("sProductModel like", value, "sProductModel");
            return (Criteria) this;
        }
        public Criteria andSProductModelNotLike(String value) {
            addCriterion("sProductModel not like", value, "sProductModel");
            return (Criteria) this;
        }
        public Criteria andSProductModelIn(List<String> values) {
            addCriterion("sProductModel in", values, "sProductModel");
            return (Criteria) this;
        }
        public Criteria andSProductModelNotIn(List<String> values) {
            addCriterion("sProductModel not in", values, "sProductModel");
            return (Criteria) this;
        }
        public Criteria andSProductModelBetween(String value1, String value2) {
            addCriterion("sProductModel between", value1, value2, "sProductModel");
            return (Criteria) this;
        }
        public Criteria andSProductModelNotBetween(String value1, String value2) {
            addCriterion("sProductModel not between", value1, value2, "sProductModel");
            return (Criteria) this;
        }
        public Criteria andSManufacturerIsNull() {
            addCriterion("sManufacturer is null");
            return (Criteria) this;
        }
        public Criteria andSManufacturerIsNotNull() {
            addCriterion("sManufacturer is not null");
            return (Criteria) this;
        }
        public Criteria andSManufacturerEqualTo(String value) {
            addCriterion("sManufacturer =", value, "sManufacturer");
            return (Criteria) this;
        }
        public Criteria andSManufacturerNotEqualTo(String value) {
            addCriterion("sManufacturer <>", value, "sManufacturer");
            return (Criteria) this;
        }
        public Criteria andSManufacturerGreaterThan(String value) {
            addCriterion("sManufacturer >", value, "sManufacturer");
            return (Criteria) this;
        }
        public Criteria andSManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("sManufacturer >=", value, "sManufacturer");
            return (Criteria) this;
        }
        public Criteria andSManufacturerLessThan(String value) {
            addCriterion("sManufacturer <", value, "sManufacturer");
            return (Criteria) this;
        }
        public Criteria andSManufacturerLessThanOrEqualTo(String value) {
            addCriterion("sManufacturer <=", value, "sManufacturer");
            return (Criteria) this;
        }
        public Criteria andSManufacturerLike(String value) {
            addCriterion("sManufacturer like", value, "sManufacturer");
            return (Criteria) this;
        }
        public Criteria andSManufacturerNotLike(String value) {
            addCriterion("sManufacturer not like", value, "sManufacturer");
            return (Criteria) this;
        }
        public Criteria andSManufacturerIn(List<String> values) {
            addCriterion("sManufacturer in", values, "sManufacturer");
            return (Criteria) this;
        }
        public Criteria andSManufacturerNotIn(List<String> values) {
            addCriterion("sManufacturer not in", values, "sManufacturer");
            return (Criteria) this;
        }
        public Criteria andSManufacturerBetween(String value1, String value2) {
            addCriterion("sManufacturer between", value1, value2, "sManufacturer");
            return (Criteria) this;
        }
        public Criteria andSManufacturerNotBetween(String value1, String value2) {
            addCriterion("sManufacturer not between", value1, value2, "sManufacturer");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsNoIsNull() {
            addCriterion("sFineshGoodsNo is null");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsNoIsNotNull() {
            addCriterion("sFineshGoodsNo is not null");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsNoEqualTo(String value) {
            addCriterion("sFineshGoodsNo =", value, "sFineshGoodsNo");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsNoNotEqualTo(String value) {
            addCriterion("sFineshGoodsNo <>", value, "sFineshGoodsNo");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsNoGreaterThan(String value) {
            addCriterion("sFineshGoodsNo >", value, "sFineshGoodsNo");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsNoGreaterThanOrEqualTo(String value) {
            addCriterion("sFineshGoodsNo >=", value, "sFineshGoodsNo");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsNoLessThan(String value) {
            addCriterion("sFineshGoodsNo <", value, "sFineshGoodsNo");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsNoLessThanOrEqualTo(String value) {
            addCriterion("sFineshGoodsNo <=", value, "sFineshGoodsNo");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsNoLike(String value) {
            addCriterion("sFineshGoodsNo like", value, "sFineshGoodsNo");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsNoNotLike(String value) {
            addCriterion("sFineshGoodsNo not like", value, "sFineshGoodsNo");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsNoIn(List<String> values) {
            addCriterion("sFineshGoodsNo in", values, "sFineshGoodsNo");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsNoNotIn(List<String> values) {
            addCriterion("sFineshGoodsNo not in", values, "sFineshGoodsNo");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsNoBetween(String value1, String value2) {
            addCriterion("sFineshGoodsNo between", value1, value2, "sFineshGoodsNo");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsNoNotBetween(String value1, String value2) {
            addCriterion("sFineshGoodsNo not between", value1, value2, "sFineshGoodsNo");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsVersionIsNull() {
            addCriterion("sFineshGoodsVersion is null");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsVersionIsNotNull() {
            addCriterion("sFineshGoodsVersion is not null");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsVersionEqualTo(String value) {
            addCriterion("sFineshGoodsVersion =", value, "sFineshGoodsVersion");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsVersionNotEqualTo(String value) {
            addCriterion("sFineshGoodsVersion <>", value, "sFineshGoodsVersion");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsVersionGreaterThan(String value) {
            addCriterion("sFineshGoodsVersion >", value, "sFineshGoodsVersion");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsVersionGreaterThanOrEqualTo(String value) {
            addCriterion("sFineshGoodsVersion >=", value, "sFineshGoodsVersion");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsVersionLessThan(String value) {
            addCriterion("sFineshGoodsVersion <", value, "sFineshGoodsVersion");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsVersionLessThanOrEqualTo(String value) {
            addCriterion("sFineshGoodsVersion <=", value, "sFineshGoodsVersion");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsVersionLike(String value) {
            addCriterion("sFineshGoodsVersion like", value, "sFineshGoodsVersion");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsVersionNotLike(String value) {
            addCriterion("sFineshGoodsVersion not like", value, "sFineshGoodsVersion");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsVersionIn(List<String> values) {
            addCriterion("sFineshGoodsVersion in", values, "sFineshGoodsVersion");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsVersionNotIn(List<String> values) {
            addCriterion("sFineshGoodsVersion not in", values, "sFineshGoodsVersion");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsVersionBetween(String value1, String value2) {
            addCriterion("sFineshGoodsVersion between", value1, value2, "sFineshGoodsVersion");
            return (Criteria) this;
        }
        public Criteria andSFineshGoodsVersionNotBetween(String value1, String value2) {
            addCriterion("sFineshGoodsVersion not between", value1, value2, "sFineshGoodsVersion");
            return (Criteria) this;
        }
        public Criteria andNProcessingFeesIsNull() {
            addCriterion("nProcessingFees is null");
            return (Criteria) this;
        }
        public Criteria andNProcessingFeesIsNotNull() {
            addCriterion("nProcessingFees is not null");
            return (Criteria) this;
        }
        public Criteria andNProcessingFeesEqualTo(Double value) {
            addCriterion("nProcessingFees =", value, "nProcessingFees");
            return (Criteria) this;
        }
        public Criteria andNProcessingFeesNotEqualTo(Double value) {
            addCriterion("nProcessingFees <>", value, "nProcessingFees");
            return (Criteria) this;
        }
        public Criteria andNProcessingFeesGreaterThan(Double value) {
            addCriterion("nProcessingFees >", value, "nProcessingFees");
            return (Criteria) this;
        }
        public Criteria andNProcessingFeesGreaterThanOrEqualTo(Double value) {
            addCriterion("nProcessingFees >=", value, "nProcessingFees");
            return (Criteria) this;
        }
        public Criteria andNProcessingFeesLessThan(Double value) {
            addCriterion("nProcessingFees <", value, "nProcessingFees");
            return (Criteria) this;
        }
        public Criteria andNProcessingFeesLessThanOrEqualTo(Double value) {
            addCriterion("nProcessingFees <=", value, "nProcessingFees");
            return (Criteria) this;
        }
        public Criteria andNProcessingFeesIn(List<Double> values) {
            addCriterion("nProcessingFees in", values, "nProcessingFees");
            return (Criteria) this;
        }
        public Criteria andNProcessingFeesNotIn(List<Double> values) {
            addCriterion("nProcessingFees not in", values, "nProcessingFees");
            return (Criteria) this;
        }
        public Criteria andNProcessingFeesBetween(Double value1, Double value2) {
            addCriterion("nProcessingFees between", value1, value2, "nProcessingFees");
            return (Criteria) this;
        }
        public Criteria andNProcessingFeesNotBetween(Double value1, Double value2) {
            addCriterion("nProcessingFees not between", value1, value2, "nProcessingFees");
            return (Criteria) this;
        }
        public Criteria andIOriginCertificateItemIsNull() {
            addCriterion("iOriginCertificateItem is null");
            return (Criteria) this;
        }
        public Criteria andIOriginCertificateItemIsNotNull() {
            addCriterion("iOriginCertificateItem is not null");
            return (Criteria) this;
        }
        public Criteria andIOriginCertificateItemEqualTo(Integer value) {
            addCriterion("iOriginCertificateItem =", value, "iOriginCertificateItem");
            return (Criteria) this;
        }
        public Criteria andIOriginCertificateItemNotEqualTo(Integer value) {
            addCriterion("iOriginCertificateItem <>", value, "iOriginCertificateItem");
            return (Criteria) this;
        }
        public Criteria andIOriginCertificateItemGreaterThan(Integer value) {
            addCriterion("iOriginCertificateItem >", value, "iOriginCertificateItem");
            return (Criteria) this;
        }
        public Criteria andIOriginCertificateItemGreaterThanOrEqualTo(Integer value) {
            addCriterion("iOriginCertificateItem >=", value, "iOriginCertificateItem");
            return (Criteria) this;
        }
        public Criteria andIOriginCertificateItemLessThan(Integer value) {
            addCriterion("iOriginCertificateItem <", value, "iOriginCertificateItem");
            return (Criteria) this;
        }
        public Criteria andIOriginCertificateItemLessThanOrEqualTo(Integer value) {
            addCriterion("iOriginCertificateItem <=", value, "iOriginCertificateItem");
            return (Criteria) this;
        }
        public Criteria andIOriginCertificateItemIn(List<Integer> values) {
            addCriterion("iOriginCertificateItem in", values, "iOriginCertificateItem");
            return (Criteria) this;
        }
        public Criteria andIOriginCertificateItemNotIn(List<Integer> values) {
            addCriterion("iOriginCertificateItem not in", values, "iOriginCertificateItem");
            return (Criteria) this;
        }
        public Criteria andIOriginCertificateItemBetween(Integer value1, Integer value2) {
            addCriterion("iOriginCertificateItem between", value1, value2, "iOriginCertificateItem");
            return (Criteria) this;
        }
        public Criteria andIOriginCertificateItemNotBetween(Integer value1, Integer value2) {
            addCriterion("iOriginCertificateItem not between", value1, value2, "iOriginCertificateItem");
            return (Criteria) this;
        }
        public Criteria andIBoxRowNoIsNull() {
            addCriterion("iBoxRowNo is null");
            return (Criteria) this;
        }
        public Criteria andIBoxRowNoIsNotNull() {
            addCriterion("iBoxRowNo is not null");
            return (Criteria) this;
        }
        public Criteria andIBoxRowNoEqualTo(Integer value) {
            addCriterion("iBoxRowNo =", value, "iBoxRowNo");
            return (Criteria) this;
        }
        public Criteria andIBoxRowNoNotEqualTo(Integer value) {
            addCriterion("iBoxRowNo <>", value, "iBoxRowNo");
            return (Criteria) this;
        }
        public Criteria andIBoxRowNoGreaterThan(Integer value) {
            addCriterion("iBoxRowNo >", value, "iBoxRowNo");
            return (Criteria) this;
        }
        public Criteria andIBoxRowNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("iBoxRowNo >=", value, "iBoxRowNo");
            return (Criteria) this;
        }
        public Criteria andIBoxRowNoLessThan(Integer value) {
            addCriterion("iBoxRowNo <", value, "iBoxRowNo");
            return (Criteria) this;
        }
        public Criteria andIBoxRowNoLessThanOrEqualTo(Integer value) {
            addCriterion("iBoxRowNo <=", value, "iBoxRowNo");
            return (Criteria) this;
        }
        public Criteria andIBoxRowNoIn(List<Integer> values) {
            addCriterion("iBoxRowNo in", values, "iBoxRowNo");
            return (Criteria) this;
        }
        public Criteria andIBoxRowNoNotIn(List<Integer> values) {
            addCriterion("iBoxRowNo not in", values, "iBoxRowNo");
            return (Criteria) this;
        }
        public Criteria andIBoxRowNoBetween(Integer value1, Integer value2) {
            addCriterion("iBoxRowNo between", value1, value2, "iBoxRowNo");
            return (Criteria) this;
        }
        public Criteria andIBoxRowNoNotBetween(Integer value1, Integer value2) {
            addCriterion("iBoxRowNo not between", value1, value2, "iBoxRowNo");
            return (Criteria) this;
        }
        public Criteria andIPBcommodityWarehouseIdIsNull() {
            addCriterion("iPBcommodityWarehouseId is null");
            return (Criteria) this;
        }
        public Criteria andIPBcommodityWarehouseIdIsNotNull() {
            addCriterion("iPBcommodityWarehouseId is not null");
            return (Criteria) this;
        }
        public Criteria andIPBcommodityWarehouseIdEqualTo(Integer value) {
            addCriterion("iPBcommodityWarehouseId =", value, "iPBcommodityWarehouseId");
            return (Criteria) this;
        }
        public Criteria andIPBcommodityWarehouseIdNotEqualTo(Integer value) {
            addCriterion("iPBcommodityWarehouseId <>", value, "iPBcommodityWarehouseId");
            return (Criteria) this;
        }
        public Criteria andIPBcommodityWarehouseIdGreaterThan(Integer value) {
            addCriterion("iPBcommodityWarehouseId >", value, "iPBcommodityWarehouseId");
            return (Criteria) this;
        }
        public Criteria andIPBcommodityWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iPBcommodityWarehouseId >=", value, "iPBcommodityWarehouseId");
            return (Criteria) this;
        }
        public Criteria andIPBcommodityWarehouseIdLessThan(Integer value) {
            addCriterion("iPBcommodityWarehouseId <", value, "iPBcommodityWarehouseId");
            return (Criteria) this;
        }
        public Criteria andIPBcommodityWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("iPBcommodityWarehouseId <=", value, "iPBcommodityWarehouseId");
            return (Criteria) this;
        }
        public Criteria andIPBcommodityWarehouseIdIn(List<Integer> values) {
            addCriterion("iPBcommodityWarehouseId in", values, "iPBcommodityWarehouseId");
            return (Criteria) this;
        }
        public Criteria andIPBcommodityWarehouseIdNotIn(List<Integer> values) {
            addCriterion("iPBcommodityWarehouseId not in", values, "iPBcommodityWarehouseId");
            return (Criteria) this;
        }
        public Criteria andIPBcommodityWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("iPBcommodityWarehouseId between", value1, value2, "iPBcommodityWarehouseId");
            return (Criteria) this;
        }
        public Criteria andIPBcommodityWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iPBcommodityWarehouseId not between", value1, value2, "iPBcommodityWarehouseId");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelExIsNull() {
            addCriterion("sGoodsModelEx is null");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelExIsNotNull() {
            addCriterion("sGoodsModelEx is not null");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelExEqualTo(String value) {
            addCriterion("sGoodsModelEx =", value, "sGoodsModelEx");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelExNotEqualTo(String value) {
            addCriterion("sGoodsModelEx <>", value, "sGoodsModelEx");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelExGreaterThan(String value) {
            addCriterion("sGoodsModelEx >", value, "sGoodsModelEx");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelExGreaterThanOrEqualTo(String value) {
            addCriterion("sGoodsModelEx >=", value, "sGoodsModelEx");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelExLessThan(String value) {
            addCriterion("sGoodsModelEx <", value, "sGoodsModelEx");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelExLessThanOrEqualTo(String value) {
            addCriterion("sGoodsModelEx <=", value, "sGoodsModelEx");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelExLike(String value) {
            addCriterion("sGoodsModelEx like", value, "sGoodsModelEx");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelExNotLike(String value) {
            addCriterion("sGoodsModelEx not like", value, "sGoodsModelEx");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelExIn(List<String> values) {
            addCriterion("sGoodsModelEx in", values, "sGoodsModelEx");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelExNotIn(List<String> values) {
            addCriterion("sGoodsModelEx not in", values, "sGoodsModelEx");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelExBetween(String value1, String value2) {
            addCriterion("sGoodsModelEx between", value1, value2, "sGoodsModelEx");
            return (Criteria) this;
        }
        public Criteria andSGoodsModelExNotBetween(String value1, String value2) {
            addCriterion("sGoodsModelEx not between", value1, value2, "sGoodsModelEx");
            return (Criteria) this;
        }
        public Criteria andISDcustomsDeclarationOrderHdrIdIsNull() {
            addCriterion("iSDcustomsDeclarationOrderHdrId is null");
            return (Criteria) this;
        }
        public Criteria andISDcustomsDeclarationOrderHdrIdIsNotNull() {
            addCriterion("iSDcustomsDeclarationOrderHdrId is not null");
            return (Criteria) this;
        }
        public Criteria andISDcustomsDeclarationOrderHdrIdEqualTo(Integer value) {
            addCriterion("iSDcustomsDeclarationOrderHdrId =", value, "iSDcustomsDeclarationOrderHdrId");
            return (Criteria) this;
        }
        public Criteria andISDcustomsDeclarationOrderHdrIdNotEqualTo(Integer value) {
            addCriterion("iSDcustomsDeclarationOrderHdrId <>", value, "iSDcustomsDeclarationOrderHdrId");
            return (Criteria) this;
        }
        public Criteria andISDcustomsDeclarationOrderHdrIdGreaterThan(Integer value) {
            addCriterion("iSDcustomsDeclarationOrderHdrId >", value, "iSDcustomsDeclarationOrderHdrId");
            return (Criteria) this;
        }
        public Criteria andISDcustomsDeclarationOrderHdrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iSDcustomsDeclarationOrderHdrId >=", value, "iSDcustomsDeclarationOrderHdrId");
            return (Criteria) this;
        }
        public Criteria andISDcustomsDeclarationOrderHdrIdLessThan(Integer value) {
            addCriterion("iSDcustomsDeclarationOrderHdrId <", value, "iSDcustomsDeclarationOrderHdrId");
            return (Criteria) this;
        }
        public Criteria andISDcustomsDeclarationOrderHdrIdLessThanOrEqualTo(Integer value) {
            addCriterion("iSDcustomsDeclarationOrderHdrId <=", value, "iSDcustomsDeclarationOrderHdrId");
            return (Criteria) this;
        }
        public Criteria andISDcustomsDeclarationOrderHdrIdIn(List<Integer> values) {
            addCriterion("iSDcustomsDeclarationOrderHdrId in", values, "iSDcustomsDeclarationOrderHdrId");
            return (Criteria) this;
        }
        public Criteria andISDcustomsDeclarationOrderHdrIdNotIn(List<Integer> values) {
            addCriterion("iSDcustomsDeclarationOrderHdrId not in", values, "iSDcustomsDeclarationOrderHdrId");
            return (Criteria) this;
        }
        public Criteria andISDcustomsDeclarationOrderHdrIdBetween(Integer value1, Integer value2) {
            addCriterion("iSDcustomsDeclarationOrderHdrId between", value1, value2, "iSDcustomsDeclarationOrderHdrId");
            return (Criteria) this;
        }
        public Criteria andISDcustomsDeclarationOrderHdrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iSDcustomsDeclarationOrderHdrId not between", value1, value2, "iSDcustomsDeclarationOrderHdrId");
            return (Criteria) this;
        }
        public Criteria andISequenceNoIsNull() {
            addCriterion("iSequenceNo is null");
            return (Criteria) this;
        }
        public Criteria andISequenceNoIsNotNull() {
            addCriterion("iSequenceNo is not null");
            return (Criteria) this;
        }
        public Criteria andISequenceNoEqualTo(Integer value) {
            addCriterion("iSequenceNo =", value, "iSequenceNo");
            return (Criteria) this;
        }
        public Criteria andISequenceNoNotEqualTo(Integer value) {
            addCriterion("iSequenceNo <>", value, "iSequenceNo");
            return (Criteria) this;
        }
        public Criteria andISequenceNoGreaterThan(Integer value) {
            addCriterion("iSequenceNo >", value, "iSequenceNo");
            return (Criteria) this;
        }
        public Criteria andISequenceNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("iSequenceNo >=", value, "iSequenceNo");
            return (Criteria) this;
        }
        public Criteria andISequenceNoLessThan(Integer value) {
            addCriterion("iSequenceNo <", value, "iSequenceNo");
            return (Criteria) this;
        }
        public Criteria andISequenceNoLessThanOrEqualTo(Integer value) {
            addCriterion("iSequenceNo <=", value, "iSequenceNo");
            return (Criteria) this;
        }
        public Criteria andISequenceNoIn(List<Integer> values) {
            addCriterion("iSequenceNo in", values, "iSequenceNo");
            return (Criteria) this;
        }
        public Criteria andISequenceNoNotIn(List<Integer> values) {
            addCriterion("iSequenceNo not in", values, "iSequenceNo");
            return (Criteria) this;
        }
        public Criteria andISequenceNoBetween(Integer value1, Integer value2) {
            addCriterion("iSequenceNo between", value1, value2, "iSequenceNo");
            return (Criteria) this;
        }
        public Criteria andISequenceNoNotBetween(Integer value1, Integer value2) {
            addCriterion("iSequenceNo not between", value1, value2, "iSequenceNo");
            return (Criteria) this;
        }
        public Criteria andTDeclareDateIsNull() {
            addCriterion("tDeclareDate is null");
            return (Criteria) this;
        }
        public Criteria andTDeclareDateIsNotNull() {
            addCriterion("tDeclareDate is not null");
            return (Criteria) this;
        }
        public Criteria andTDeclareDateEqualTo(Date value) {
            addCriterion("tDeclareDate =", value, "tDeclareDate");
            return (Criteria) this;
        }
        public Criteria andTDeclareDateNotEqualTo(Date value) {
            addCriterion("tDeclareDate <>", value, "tDeclareDate");
            return (Criteria) this;
        }
        public Criteria andTDeclareDateGreaterThan(Date value) {
            addCriterion("tDeclareDate >", value, "tDeclareDate");
            return (Criteria) this;
        }
        public Criteria andTDeclareDateGreaterThanOrEqualTo(Date value) {
            addCriterion("tDeclareDate >=", value, "tDeclareDate");
            return (Criteria) this;
        }
        public Criteria andTDeclareDateLessThan(Date value) {
            addCriterion("tDeclareDate <", value, "tDeclareDate");
            return (Criteria) this;
        }
        public Criteria andTDeclareDateLessThanOrEqualTo(Date value) {
            addCriterion("tDeclareDate <=", value, "tDeclareDate");
            return (Criteria) this;
        }
        public Criteria andTDeclareDateIn(List<Date> values) {
            addCriterion("tDeclareDate in", values, "tDeclareDate");
            return (Criteria) this;
        }
        public Criteria andTDeclareDateNotIn(List<Date> values) {
            addCriterion("tDeclareDate not in", values, "tDeclareDate");
            return (Criteria) this;
        }
        public Criteria andTDeclareDateBetween(Date value1, Date value2) {
            addCriterion("tDeclareDate between", value1, value2, "tDeclareDate");
            return (Criteria) this;
        }
        public Criteria andTDeclareDateNotBetween(Date value1, Date value2) {
            addCriterion("tDeclareDate not between", value1, value2, "tDeclareDate");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoIsNull() {
            addCriterion("sCustomsNo is null");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoIsNotNull() {
            addCriterion("sCustomsNo is not null");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoEqualTo(String value) {
            addCriterion("sCustomsNo =", value, "sCustomsNo");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoNotEqualTo(String value) {
            addCriterion("sCustomsNo <>", value, "sCustomsNo");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoGreaterThan(String value) {
            addCriterion("sCustomsNo >", value, "sCustomsNo");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoGreaterThanOrEqualTo(String value) {
            addCriterion("sCustomsNo >=", value, "sCustomsNo");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoLessThan(String value) {
            addCriterion("sCustomsNo <", value, "sCustomsNo");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoLessThanOrEqualTo(String value) {
            addCriterion("sCustomsNo <=", value, "sCustomsNo");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoLike(String value) {
            addCriterion("sCustomsNo like", value, "sCustomsNo");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoNotLike(String value) {
            addCriterion("sCustomsNo not like", value, "sCustomsNo");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoIn(List<String> values) {
            addCriterion("sCustomsNo in", values, "sCustomsNo");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoNotIn(List<String> values) {
            addCriterion("sCustomsNo not in", values, "sCustomsNo");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoBetween(String value1, String value2) {
            addCriterion("sCustomsNo between", value1, value2, "sCustomsNo");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoNotBetween(String value1, String value2) {
            addCriterion("sCustomsNo not between", value1, value2, "sCustomsNo");
            return (Criteria) this;
        }
        public Criteria andICHcustomsAreaIdIsNull() {
            addCriterion("iCHcustomsAreaId is null");
            return (Criteria) this;
        }
        public Criteria andICHcustomsAreaIdIsNotNull() {
            addCriterion("iCHcustomsAreaId is not null");
            return (Criteria) this;
        }
        public Criteria andICHcustomsAreaIdEqualTo(Integer value) {
            addCriterion("iCHcustomsAreaId =", value, "iCHcustomsAreaId");
            return (Criteria) this;
        }
        public Criteria andICHcustomsAreaIdNotEqualTo(Integer value) {
            addCriterion("iCHcustomsAreaId <>", value, "iCHcustomsAreaId");
            return (Criteria) this;
        }
        public Criteria andICHcustomsAreaIdGreaterThan(Integer value) {
            addCriterion("iCHcustomsAreaId >", value, "iCHcustomsAreaId");
            return (Criteria) this;
        }
        public Criteria andICHcustomsAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iCHcustomsAreaId >=", value, "iCHcustomsAreaId");
            return (Criteria) this;
        }
        public Criteria andICHcustomsAreaIdLessThan(Integer value) {
            addCriterion("iCHcustomsAreaId <", value, "iCHcustomsAreaId");
            return (Criteria) this;
        }
        public Criteria andICHcustomsAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("iCHcustomsAreaId <=", value, "iCHcustomsAreaId");
            return (Criteria) this;
        }
        public Criteria andICHcustomsAreaIdIn(List<Integer> values) {
            addCriterion("iCHcustomsAreaId in", values, "iCHcustomsAreaId");
            return (Criteria) this;
        }
        public Criteria andICHcustomsAreaIdNotIn(List<Integer> values) {
            addCriterion("iCHcustomsAreaId not in", values, "iCHcustomsAreaId");
            return (Criteria) this;
        }
        public Criteria andICHcustomsAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("iCHcustomsAreaId between", value1, value2, "iCHcustomsAreaId");
            return (Criteria) this;
        }
        public Criteria andICHcustomsAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iCHcustomsAreaId not between", value1, value2, "iCHcustomsAreaId");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaCodeIsNull() {
            addCriterion("sCHcustomsAreaCode is null");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaCodeIsNotNull() {
            addCriterion("sCHcustomsAreaCode is not null");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaCodeEqualTo(String value) {
            addCriterion("sCHcustomsAreaCode =", value, "sCHcustomsAreaCode");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaCodeNotEqualTo(String value) {
            addCriterion("sCHcustomsAreaCode <>", value, "sCHcustomsAreaCode");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaCodeGreaterThan(String value) {
            addCriterion("sCHcustomsAreaCode >", value, "sCHcustomsAreaCode");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sCHcustomsAreaCode >=", value, "sCHcustomsAreaCode");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaCodeLessThan(String value) {
            addCriterion("sCHcustomsAreaCode <", value, "sCHcustomsAreaCode");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("sCHcustomsAreaCode <=", value, "sCHcustomsAreaCode");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaCodeLike(String value) {
            addCriterion("sCHcustomsAreaCode like", value, "sCHcustomsAreaCode");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaCodeNotLike(String value) {
            addCriterion("sCHcustomsAreaCode not like", value, "sCHcustomsAreaCode");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaCodeIn(List<String> values) {
            addCriterion("sCHcustomsAreaCode in", values, "sCHcustomsAreaCode");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaCodeNotIn(List<String> values) {
            addCriterion("sCHcustomsAreaCode not in", values, "sCHcustomsAreaCode");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaCodeBetween(String value1, String value2) {
            addCriterion("sCHcustomsAreaCode between", value1, value2, "sCHcustomsAreaCode");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaCodeNotBetween(String value1, String value2) {
            addCriterion("sCHcustomsAreaCode not between", value1, value2, "sCHcustomsAreaCode");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaNameIsNull() {
            addCriterion("sCHcustomsAreaName is null");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaNameIsNotNull() {
            addCriterion("sCHcustomsAreaName is not null");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaNameEqualTo(String value) {
            addCriterion("sCHcustomsAreaName =", value, "sCHcustomsAreaName");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaNameNotEqualTo(String value) {
            addCriterion("sCHcustomsAreaName <>", value, "sCHcustomsAreaName");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaNameGreaterThan(String value) {
            addCriterion("sCHcustomsAreaName >", value, "sCHcustomsAreaName");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaNameGreaterThanOrEqualTo(String value) {
            addCriterion("sCHcustomsAreaName >=", value, "sCHcustomsAreaName");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaNameLessThan(String value) {
            addCriterion("sCHcustomsAreaName <", value, "sCHcustomsAreaName");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaNameLessThanOrEqualTo(String value) {
            addCriterion("sCHcustomsAreaName <=", value, "sCHcustomsAreaName");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaNameLike(String value) {
            addCriterion("sCHcustomsAreaName like", value, "sCHcustomsAreaName");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaNameNotLike(String value) {
            addCriterion("sCHcustomsAreaName not like", value, "sCHcustomsAreaName");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaNameIn(List<String> values) {
            addCriterion("sCHcustomsAreaName in", values, "sCHcustomsAreaName");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaNameNotIn(List<String> values) {
            addCriterion("sCHcustomsAreaName not in", values, "sCHcustomsAreaName");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaNameBetween(String value1, String value2) {
            addCriterion("sCHcustomsAreaName between", value1, value2, "sCHcustomsAreaName");
            return (Criteria) this;
        }
        public Criteria andSCHcustomsAreaNameNotBetween(String value1, String value2) {
            addCriterion("sCHcustomsAreaName not between", value1, value2, "sCHcustomsAreaName");
            return (Criteria) this;
        }
        public Criteria andSManualNoIsNull() {
            addCriterion("sManualNo is null");
            return (Criteria) this;
        }
        public Criteria andSManualNoIsNotNull() {
            addCriterion("sManualNo is not null");
            return (Criteria) this;
        }
        public Criteria andSManualNoEqualTo(String value) {
            addCriterion("sManualNo =", value, "sManualNo");
            return (Criteria) this;
        }
        public Criteria andSManualNoNotEqualTo(String value) {
            addCriterion("sManualNo <>", value, "sManualNo");
            return (Criteria) this;
        }
        public Criteria andSManualNoGreaterThan(String value) {
            addCriterion("sManualNo >", value, "sManualNo");
            return (Criteria) this;
        }
        public Criteria andSManualNoGreaterThanOrEqualTo(String value) {
            addCriterion("sManualNo >=", value, "sManualNo");
            return (Criteria) this;
        }
        public Criteria andSManualNoLessThan(String value) {
            addCriterion("sManualNo <", value, "sManualNo");
            return (Criteria) this;
        }
        public Criteria andSManualNoLessThanOrEqualTo(String value) {
            addCriterion("sManualNo <=", value, "sManualNo");
            return (Criteria) this;
        }
        public Criteria andSManualNoLike(String value) {
            addCriterion("sManualNo like", value, "sManualNo");
            return (Criteria) this;
        }
        public Criteria andSManualNoNotLike(String value) {
            addCriterion("sManualNo not like", value, "sManualNo");
            return (Criteria) this;
        }
        public Criteria andSManualNoIn(List<String> values) {
            addCriterion("sManualNo in", values, "sManualNo");
            return (Criteria) this;
        }
        public Criteria andSManualNoNotIn(List<String> values) {
            addCriterion("sManualNo not in", values, "sManualNo");
            return (Criteria) this;
        }
        public Criteria andSManualNoBetween(String value1, String value2) {
            addCriterion("sManualNo between", value1, value2, "sManualNo");
            return (Criteria) this;
        }
        public Criteria andSManualNoNotBetween(String value1, String value2) {
            addCriterion("sManualNo not between", value1, value2, "sManualNo");
            return (Criteria) this;
        }
        public Criteria andSContractNoIsNull() {
            addCriterion("sContractNo is null");
            return (Criteria) this;
        }
        public Criteria andSContractNoIsNotNull() {
            addCriterion("sContractNo is not null");
            return (Criteria) this;
        }
        public Criteria andSContractNoEqualTo(String value) {
            addCriterion("sContractNo =", value, "sContractNo");
            return (Criteria) this;
        }
        public Criteria andSContractNoNotEqualTo(String value) {
            addCriterion("sContractNo <>", value, "sContractNo");
            return (Criteria) this;
        }
        public Criteria andSContractNoGreaterThan(String value) {
            addCriterion("sContractNo >", value, "sContractNo");
            return (Criteria) this;
        }
        public Criteria andSContractNoGreaterThanOrEqualTo(String value) {
            addCriterion("sContractNo >=", value, "sContractNo");
            return (Criteria) this;
        }
        public Criteria andSContractNoLessThan(String value) {
            addCriterion("sContractNo <", value, "sContractNo");
            return (Criteria) this;
        }
        public Criteria andSContractNoLessThanOrEqualTo(String value) {
            addCriterion("sContractNo <=", value, "sContractNo");
            return (Criteria) this;
        }
        public Criteria andSContractNoLike(String value) {
            addCriterion("sContractNo like", value, "sContractNo");
            return (Criteria) this;
        }
        public Criteria andSContractNoNotLike(String value) {
            addCriterion("sContractNo not like", value, "sContractNo");
            return (Criteria) this;
        }
        public Criteria andSContractNoIn(List<String> values) {
            addCriterion("sContractNo in", values, "sContractNo");
            return (Criteria) this;
        }
        public Criteria andSContractNoNotIn(List<String> values) {
            addCriterion("sContractNo not in", values, "sContractNo");
            return (Criteria) this;
        }
        public Criteria andSContractNoBetween(String value1, String value2) {
            addCriterion("sContractNo between", value1, value2, "sContractNo");
            return (Criteria) this;
        }
        public Criteria andSContractNoNotBetween(String value1, String value2) {
            addCriterion("sContractNo not between", value1, value2, "sContractNo");
            return (Criteria) this;
        }
        public Criteria andDImportsDateIsNull() {
            addCriterion("dImportsDate is null");
            return (Criteria) this;
        }
        public Criteria andDImportsDateIsNotNull() {
            addCriterion("dImportsDate is not null");
            return (Criteria) this;
        }
        public Criteria andDImportsDateEqualTo(String value) {
            addCriterion("dImportsDate =", value, "dImportsDate");
            return (Criteria) this;
        }
        public Criteria andDImportsDateNotEqualTo(String value) {
            addCriterion("dImportsDate <>", value, "dImportsDate");
            return (Criteria) this;
        }
        public Criteria andDImportsDateGreaterThan(String value) {
            addCriterion("dImportsDate >", value, "dImportsDate");
            return (Criteria) this;
        }
        public Criteria andDImportsDateGreaterThanOrEqualTo(String value) {
            addCriterion("dImportsDate >=", value, "dImportsDate");
            return (Criteria) this;
        }
        public Criteria andDImportsDateLessThan(String value) {
            addCriterion("dImportsDate <", value, "dImportsDate");
            return (Criteria) this;
        }
        public Criteria andDImportsDateLessThanOrEqualTo(String value) {
            addCriterion("dImportsDate <=", value, "dImportsDate");
            return (Criteria) this;
        }
        public Criteria andDImportsDateLike(String value) {
            addCriterion("dImportsDate like", value, "dImportsDate");
            return (Criteria) this;
        }
        public Criteria andDImportsDateNotLike(String value) {
            addCriterion("dImportsDate not like", value, "dImportsDate");
            return (Criteria) this;
        }
        public Criteria andDImportsDateIn(List<String> values) {
            addCriterion("dImportsDate in", values, "dImportsDate");
            return (Criteria) this;
        }
        public Criteria andDImportsDateNotIn(List<String> values) {
            addCriterion("dImportsDate not in", values, "dImportsDate");
            return (Criteria) this;
        }
        public Criteria andDImportsDateBetween(String value1, String value2) {
            addCriterion("dImportsDate between", value1, value2, "dImportsDate");
            return (Criteria) this;
        }
        public Criteria andDImportsDateNotBetween(String value1, String value2) {
            addCriterion("dImportsDate not between", value1, value2, "dImportsDate");
            return (Criteria) this;
        }
        public Criteria andITradeCompanyIdIsNull() {
            addCriterion("iTradeCompanyId is null");
            return (Criteria) this;
        }
        public Criteria andITradeCompanyIdIsNotNull() {
            addCriterion("iTradeCompanyId is not null");
            return (Criteria) this;
        }
        public Criteria andITradeCompanyIdEqualTo(Integer value) {
            addCriterion("iTradeCompanyId =", value, "iTradeCompanyId");
            return (Criteria) this;
        }
        public Criteria andITradeCompanyIdNotEqualTo(Integer value) {
            addCriterion("iTradeCompanyId <>", value, "iTradeCompanyId");
            return (Criteria) this;
        }
        public Criteria andITradeCompanyIdGreaterThan(Integer value) {
            addCriterion("iTradeCompanyId >", value, "iTradeCompanyId");
            return (Criteria) this;
        }
        public Criteria andITradeCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iTradeCompanyId >=", value, "iTradeCompanyId");
            return (Criteria) this;
        }
        public Criteria andITradeCompanyIdLessThan(Integer value) {
            addCriterion("iTradeCompanyId <", value, "iTradeCompanyId");
            return (Criteria) this;
        }
        public Criteria andITradeCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("iTradeCompanyId <=", value, "iTradeCompanyId");
            return (Criteria) this;
        }
        public Criteria andITradeCompanyIdIn(List<Integer> values) {
            addCriterion("iTradeCompanyId in", values, "iTradeCompanyId");
            return (Criteria) this;
        }
        public Criteria andITradeCompanyIdNotIn(List<Integer> values) {
            addCriterion("iTradeCompanyId not in", values, "iTradeCompanyId");
            return (Criteria) this;
        }
        public Criteria andITradeCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("iTradeCompanyId between", value1, value2, "iTradeCompanyId");
            return (Criteria) this;
        }
        public Criteria andITradeCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iTradeCompanyId not between", value1, value2, "iTradeCompanyId");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNoIsNull() {
            addCriterion("sTradeCompanyNo is null");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNoIsNotNull() {
            addCriterion("sTradeCompanyNo is not null");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNoEqualTo(String value) {
            addCriterion("sTradeCompanyNo =", value, "sTradeCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNoNotEqualTo(String value) {
            addCriterion("sTradeCompanyNo <>", value, "sTradeCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNoGreaterThan(String value) {
            addCriterion("sTradeCompanyNo >", value, "sTradeCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNoGreaterThanOrEqualTo(String value) {
            addCriterion("sTradeCompanyNo >=", value, "sTradeCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNoLessThan(String value) {
            addCriterion("sTradeCompanyNo <", value, "sTradeCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNoLessThanOrEqualTo(String value) {
            addCriterion("sTradeCompanyNo <=", value, "sTradeCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNoLike(String value) {
            addCriterion("sTradeCompanyNo like", value, "sTradeCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNoNotLike(String value) {
            addCriterion("sTradeCompanyNo not like", value, "sTradeCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNoIn(List<String> values) {
            addCriterion("sTradeCompanyNo in", values, "sTradeCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNoNotIn(List<String> values) {
            addCriterion("sTradeCompanyNo not in", values, "sTradeCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNoBetween(String value1, String value2) {
            addCriterion("sTradeCompanyNo between", value1, value2, "sTradeCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNoNotBetween(String value1, String value2) {
            addCriterion("sTradeCompanyNo not between", value1, value2, "sTradeCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameCnIsNull() {
            addCriterion("sTradeCompanyNameCn is null");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameCnIsNotNull() {
            addCriterion("sTradeCompanyNameCn is not null");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameCnEqualTo(String value) {
            addCriterion("sTradeCompanyNameCn =", value, "sTradeCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameCnNotEqualTo(String value) {
            addCriterion("sTradeCompanyNameCn <>", value, "sTradeCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameCnGreaterThan(String value) {
            addCriterion("sTradeCompanyNameCn >", value, "sTradeCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("sTradeCompanyNameCn >=", value, "sTradeCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameCnLessThan(String value) {
            addCriterion("sTradeCompanyNameCn <", value, "sTradeCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameCnLessThanOrEqualTo(String value) {
            addCriterion("sTradeCompanyNameCn <=", value, "sTradeCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameCnLike(String value) {
            addCriterion("sTradeCompanyNameCn like", value, "sTradeCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameCnNotLike(String value) {
            addCriterion("sTradeCompanyNameCn not like", value, "sTradeCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameCnIn(List<String> values) {
            addCriterion("sTradeCompanyNameCn in", values, "sTradeCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameCnNotIn(List<String> values) {
            addCriterion("sTradeCompanyNameCn not in", values, "sTradeCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameCnBetween(String value1, String value2) {
            addCriterion("sTradeCompanyNameCn between", value1, value2, "sTradeCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameCnNotBetween(String value1, String value2) {
            addCriterion("sTradeCompanyNameCn not between", value1, value2, "sTradeCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameEnIsNull() {
            addCriterion("sTradeCompanyNameEn is null");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameEnIsNotNull() {
            addCriterion("sTradeCompanyNameEn is not null");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameEnEqualTo(String value) {
            addCriterion("sTradeCompanyNameEn =", value, "sTradeCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameEnNotEqualTo(String value) {
            addCriterion("sTradeCompanyNameEn <>", value, "sTradeCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameEnGreaterThan(String value) {
            addCriterion("sTradeCompanyNameEn >", value, "sTradeCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("sTradeCompanyNameEn >=", value, "sTradeCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameEnLessThan(String value) {
            addCriterion("sTradeCompanyNameEn <", value, "sTradeCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameEnLessThanOrEqualTo(String value) {
            addCriterion("sTradeCompanyNameEn <=", value, "sTradeCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameEnLike(String value) {
            addCriterion("sTradeCompanyNameEn like", value, "sTradeCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameEnNotLike(String value) {
            addCriterion("sTradeCompanyNameEn not like", value, "sTradeCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameEnIn(List<String> values) {
            addCriterion("sTradeCompanyNameEn in", values, "sTradeCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameEnNotIn(List<String> values) {
            addCriterion("sTradeCompanyNameEn not in", values, "sTradeCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameEnBetween(String value1, String value2) {
            addCriterion("sTradeCompanyNameEn between", value1, value2, "sTradeCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCompanyNameEnNotBetween(String value1, String value2) {
            addCriterion("sTradeCompanyNameEn not between", value1, value2, "sTradeCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andICHtransportationModeIdIsNull() {
            addCriterion("iCHtransportationModeId is null");
            return (Criteria) this;
        }
        public Criteria andICHtransportationModeIdIsNotNull() {
            addCriterion("iCHtransportationModeId is not null");
            return (Criteria) this;
        }
        public Criteria andICHtransportationModeIdEqualTo(Integer value) {
            addCriterion("iCHtransportationModeId =", value, "iCHtransportationModeId");
            return (Criteria) this;
        }
        public Criteria andICHtransportationModeIdNotEqualTo(Integer value) {
            addCriterion("iCHtransportationModeId <>", value, "iCHtransportationModeId");
            return (Criteria) this;
        }
        public Criteria andICHtransportationModeIdGreaterThan(Integer value) {
            addCriterion("iCHtransportationModeId >", value, "iCHtransportationModeId");
            return (Criteria) this;
        }
        public Criteria andICHtransportationModeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iCHtransportationModeId >=", value, "iCHtransportationModeId");
            return (Criteria) this;
        }
        public Criteria andICHtransportationModeIdLessThan(Integer value) {
            addCriterion("iCHtransportationModeId <", value, "iCHtransportationModeId");
            return (Criteria) this;
        }
        public Criteria andICHtransportationModeIdLessThanOrEqualTo(Integer value) {
            addCriterion("iCHtransportationModeId <=", value, "iCHtransportationModeId");
            return (Criteria) this;
        }
        public Criteria andICHtransportationModeIdIn(List<Integer> values) {
            addCriterion("iCHtransportationModeId in", values, "iCHtransportationModeId");
            return (Criteria) this;
        }
        public Criteria andICHtransportationModeIdNotIn(List<Integer> values) {
            addCriterion("iCHtransportationModeId not in", values, "iCHtransportationModeId");
            return (Criteria) this;
        }
        public Criteria andICHtransportationModeIdBetween(Integer value1, Integer value2) {
            addCriterion("iCHtransportationModeId between", value1, value2, "iCHtransportationModeId");
            return (Criteria) this;
        }
        public Criteria andICHtransportationModeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iCHtransportationModeId not between", value1, value2, "iCHtransportationModeId");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeCodeIsNull() {
            addCriterion("sCHtransportationModeCode is null");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeCodeIsNotNull() {
            addCriterion("sCHtransportationModeCode is not null");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeCodeEqualTo(String value) {
            addCriterion("sCHtransportationModeCode =", value, "sCHtransportationModeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeCodeNotEqualTo(String value) {
            addCriterion("sCHtransportationModeCode <>", value, "sCHtransportationModeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeCodeGreaterThan(String value) {
            addCriterion("sCHtransportationModeCode >", value, "sCHtransportationModeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sCHtransportationModeCode >=", value, "sCHtransportationModeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeCodeLessThan(String value) {
            addCriterion("sCHtransportationModeCode <", value, "sCHtransportationModeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeCodeLessThanOrEqualTo(String value) {
            addCriterion("sCHtransportationModeCode <=", value, "sCHtransportationModeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeCodeLike(String value) {
            addCriterion("sCHtransportationModeCode like", value, "sCHtransportationModeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeCodeNotLike(String value) {
            addCriterion("sCHtransportationModeCode not like", value, "sCHtransportationModeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeCodeIn(List<String> values) {
            addCriterion("sCHtransportationModeCode in", values, "sCHtransportationModeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeCodeNotIn(List<String> values) {
            addCriterion("sCHtransportationModeCode not in", values, "sCHtransportationModeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeCodeBetween(String value1, String value2) {
            addCriterion("sCHtransportationModeCode between", value1, value2, "sCHtransportationModeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeCodeNotBetween(String value1, String value2) {
            addCriterion("sCHtransportationModeCode not between", value1, value2, "sCHtransportationModeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeNameIsNull() {
            addCriterion("sCHtransportationModeName is null");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeNameIsNotNull() {
            addCriterion("sCHtransportationModeName is not null");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeNameEqualTo(String value) {
            addCriterion("sCHtransportationModeName =", value, "sCHtransportationModeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeNameNotEqualTo(String value) {
            addCriterion("sCHtransportationModeName <>", value, "sCHtransportationModeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeNameGreaterThan(String value) {
            addCriterion("sCHtransportationModeName >", value, "sCHtransportationModeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeNameGreaterThanOrEqualTo(String value) {
            addCriterion("sCHtransportationModeName >=", value, "sCHtransportationModeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeNameLessThan(String value) {
            addCriterion("sCHtransportationModeName <", value, "sCHtransportationModeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeNameLessThanOrEqualTo(String value) {
            addCriterion("sCHtransportationModeName <=", value, "sCHtransportationModeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeNameLike(String value) {
            addCriterion("sCHtransportationModeName like", value, "sCHtransportationModeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeNameNotLike(String value) {
            addCriterion("sCHtransportationModeName not like", value, "sCHtransportationModeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeNameIn(List<String> values) {
            addCriterion("sCHtransportationModeName in", values, "sCHtransportationModeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeNameNotIn(List<String> values) {
            addCriterion("sCHtransportationModeName not in", values, "sCHtransportationModeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeNameBetween(String value1, String value2) {
            addCriterion("sCHtransportationModeName between", value1, value2, "sCHtransportationModeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransportationModeNameNotBetween(String value1, String value2) {
            addCriterion("sCHtransportationModeName not between", value1, value2, "sCHtransportationModeName");
            return (Criteria) this;
        }
        public Criteria andIReceiverCompanyIdIsNull() {
            addCriterion("iReceiverCompanyId is null");
            return (Criteria) this;
        }
        public Criteria andIReceiverCompanyIdIsNotNull() {
            addCriterion("iReceiverCompanyId is not null");
            return (Criteria) this;
        }
        public Criteria andIReceiverCompanyIdEqualTo(Integer value) {
            addCriterion("iReceiverCompanyId =", value, "iReceiverCompanyId");
            return (Criteria) this;
        }
        public Criteria andIReceiverCompanyIdNotEqualTo(Integer value) {
            addCriterion("iReceiverCompanyId <>", value, "iReceiverCompanyId");
            return (Criteria) this;
        }
        public Criteria andIReceiverCompanyIdGreaterThan(Integer value) {
            addCriterion("iReceiverCompanyId >", value, "iReceiverCompanyId");
            return (Criteria) this;
        }
        public Criteria andIReceiverCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iReceiverCompanyId >=", value, "iReceiverCompanyId");
            return (Criteria) this;
        }
        public Criteria andIReceiverCompanyIdLessThan(Integer value) {
            addCriterion("iReceiverCompanyId <", value, "iReceiverCompanyId");
            return (Criteria) this;
        }
        public Criteria andIReceiverCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("iReceiverCompanyId <=", value, "iReceiverCompanyId");
            return (Criteria) this;
        }
        public Criteria andIReceiverCompanyIdIn(List<Integer> values) {
            addCriterion("iReceiverCompanyId in", values, "iReceiverCompanyId");
            return (Criteria) this;
        }
        public Criteria andIReceiverCompanyIdNotIn(List<Integer> values) {
            addCriterion("iReceiverCompanyId not in", values, "iReceiverCompanyId");
            return (Criteria) this;
        }
        public Criteria andIReceiverCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("iReceiverCompanyId between", value1, value2, "iReceiverCompanyId");
            return (Criteria) this;
        }
        public Criteria andIReceiverCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iReceiverCompanyId not between", value1, value2, "iReceiverCompanyId");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNoIsNull() {
            addCriterion("sReceiverCompanyNo is null");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNoIsNotNull() {
            addCriterion("sReceiverCompanyNo is not null");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNoEqualTo(String value) {
            addCriterion("sReceiverCompanyNo =", value, "sReceiverCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNoNotEqualTo(String value) {
            addCriterion("sReceiverCompanyNo <>", value, "sReceiverCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNoGreaterThan(String value) {
            addCriterion("sReceiverCompanyNo >", value, "sReceiverCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNoGreaterThanOrEqualTo(String value) {
            addCriterion("sReceiverCompanyNo >=", value, "sReceiverCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNoLessThan(String value) {
            addCriterion("sReceiverCompanyNo <", value, "sReceiverCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNoLessThanOrEqualTo(String value) {
            addCriterion("sReceiverCompanyNo <=", value, "sReceiverCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNoLike(String value) {
            addCriterion("sReceiverCompanyNo like", value, "sReceiverCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNoNotLike(String value) {
            addCriterion("sReceiverCompanyNo not like", value, "sReceiverCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNoIn(List<String> values) {
            addCriterion("sReceiverCompanyNo in", values, "sReceiverCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNoNotIn(List<String> values) {
            addCriterion("sReceiverCompanyNo not in", values, "sReceiverCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNoBetween(String value1, String value2) {
            addCriterion("sReceiverCompanyNo between", value1, value2, "sReceiverCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNoNotBetween(String value1, String value2) {
            addCriterion("sReceiverCompanyNo not between", value1, value2, "sReceiverCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameCnIsNull() {
            addCriterion("sReceiverCompanyNameCn is null");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameCnIsNotNull() {
            addCriterion("sReceiverCompanyNameCn is not null");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameCnEqualTo(String value) {
            addCriterion("sReceiverCompanyNameCn =", value, "sReceiverCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameCnNotEqualTo(String value) {
            addCriterion("sReceiverCompanyNameCn <>", value, "sReceiverCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameCnGreaterThan(String value) {
            addCriterion("sReceiverCompanyNameCn >", value, "sReceiverCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("sReceiverCompanyNameCn >=", value, "sReceiverCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameCnLessThan(String value) {
            addCriterion("sReceiverCompanyNameCn <", value, "sReceiverCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameCnLessThanOrEqualTo(String value) {
            addCriterion("sReceiverCompanyNameCn <=", value, "sReceiverCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameCnLike(String value) {
            addCriterion("sReceiverCompanyNameCn like", value, "sReceiverCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameCnNotLike(String value) {
            addCriterion("sReceiverCompanyNameCn not like", value, "sReceiverCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameCnIn(List<String> values) {
            addCriterion("sReceiverCompanyNameCn in", values, "sReceiverCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameCnNotIn(List<String> values) {
            addCriterion("sReceiverCompanyNameCn not in", values, "sReceiverCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameCnBetween(String value1, String value2) {
            addCriterion("sReceiverCompanyNameCn between", value1, value2, "sReceiverCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameCnNotBetween(String value1, String value2) {
            addCriterion("sReceiverCompanyNameCn not between", value1, value2, "sReceiverCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameEnIsNull() {
            addCriterion("sReceiverCompanyNameEn is null");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameEnIsNotNull() {
            addCriterion("sReceiverCompanyNameEn is not null");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameEnEqualTo(String value) {
            addCriterion("sReceiverCompanyNameEn =", value, "sReceiverCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameEnNotEqualTo(String value) {
            addCriterion("sReceiverCompanyNameEn <>", value, "sReceiverCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameEnGreaterThan(String value) {
            addCriterion("sReceiverCompanyNameEn >", value, "sReceiverCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("sReceiverCompanyNameEn >=", value, "sReceiverCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameEnLessThan(String value) {
            addCriterion("sReceiverCompanyNameEn <", value, "sReceiverCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameEnLessThanOrEqualTo(String value) {
            addCriterion("sReceiverCompanyNameEn <=", value, "sReceiverCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameEnLike(String value) {
            addCriterion("sReceiverCompanyNameEn like", value, "sReceiverCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameEnNotLike(String value) {
            addCriterion("sReceiverCompanyNameEn not like", value, "sReceiverCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameEnIn(List<String> values) {
            addCriterion("sReceiverCompanyNameEn in", values, "sReceiverCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameEnNotIn(List<String> values) {
            addCriterion("sReceiverCompanyNameEn not in", values, "sReceiverCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameEnBetween(String value1, String value2) {
            addCriterion("sReceiverCompanyNameEn between", value1, value2, "sReceiverCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSReceiverCompanyNameEnNotBetween(String value1, String value2) {
            addCriterion("sReceiverCompanyNameEn not between", value1, value2, "sReceiverCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSTransportationNameIsNull() {
            addCriterion("sTransportationName is null");
            return (Criteria) this;
        }
        public Criteria andSTransportationNameIsNotNull() {
            addCriterion("sTransportationName is not null");
            return (Criteria) this;
        }
        public Criteria andSTransportationNameEqualTo(String value) {
            addCriterion("sTransportationName =", value, "sTransportationName");
            return (Criteria) this;
        }
        public Criteria andSTransportationNameNotEqualTo(String value) {
            addCriterion("sTransportationName <>", value, "sTransportationName");
            return (Criteria) this;
        }
        public Criteria andSTransportationNameGreaterThan(String value) {
            addCriterion("sTransportationName >", value, "sTransportationName");
            return (Criteria) this;
        }
        public Criteria andSTransportationNameGreaterThanOrEqualTo(String value) {
            addCriterion("sTransportationName >=", value, "sTransportationName");
            return (Criteria) this;
        }
        public Criteria andSTransportationNameLessThan(String value) {
            addCriterion("sTransportationName <", value, "sTransportationName");
            return (Criteria) this;
        }
        public Criteria andSTransportationNameLessThanOrEqualTo(String value) {
            addCriterion("sTransportationName <=", value, "sTransportationName");
            return (Criteria) this;
        }
        public Criteria andSTransportationNameLike(String value) {
            addCriterion("sTransportationName like", value, "sTransportationName");
            return (Criteria) this;
        }
        public Criteria andSTransportationNameNotLike(String value) {
            addCriterion("sTransportationName not like", value, "sTransportationName");
            return (Criteria) this;
        }
        public Criteria andSTransportationNameIn(List<String> values) {
            addCriterion("sTransportationName in", values, "sTransportationName");
            return (Criteria) this;
        }
        public Criteria andSTransportationNameNotIn(List<String> values) {
            addCriterion("sTransportationName not in", values, "sTransportationName");
            return (Criteria) this;
        }
        public Criteria andSTransportationNameBetween(String value1, String value2) {
            addCriterion("sTransportationName between", value1, value2, "sTransportationName");
            return (Criteria) this;
        }
        public Criteria andSTransportationNameNotBetween(String value1, String value2) {
            addCriterion("sTransportationName not between", value1, value2, "sTransportationName");
            return (Criteria) this;
        }
        public Criteria andSTransportationNoIsNull() {
            addCriterion("sTransportationNo is null");
            return (Criteria) this;
        }
        public Criteria andSTransportationNoIsNotNull() {
            addCriterion("sTransportationNo is not null");
            return (Criteria) this;
        }
        public Criteria andSTransportationNoEqualTo(String value) {
            addCriterion("sTransportationNo =", value, "sTransportationNo");
            return (Criteria) this;
        }
        public Criteria andSTransportationNoNotEqualTo(String value) {
            addCriterion("sTransportationNo <>", value, "sTransportationNo");
            return (Criteria) this;
        }
        public Criteria andSTransportationNoGreaterThan(String value) {
            addCriterion("sTransportationNo >", value, "sTransportationNo");
            return (Criteria) this;
        }
        public Criteria andSTransportationNoGreaterThanOrEqualTo(String value) {
            addCriterion("sTransportationNo >=", value, "sTransportationNo");
            return (Criteria) this;
        }
        public Criteria andSTransportationNoLessThan(String value) {
            addCriterion("sTransportationNo <", value, "sTransportationNo");
            return (Criteria) this;
        }
        public Criteria andSTransportationNoLessThanOrEqualTo(String value) {
            addCriterion("sTransportationNo <=", value, "sTransportationNo");
            return (Criteria) this;
        }
        public Criteria andSTransportationNoLike(String value) {
            addCriterion("sTransportationNo like", value, "sTransportationNo");
            return (Criteria) this;
        }
        public Criteria andSTransportationNoNotLike(String value) {
            addCriterion("sTransportationNo not like", value, "sTransportationNo");
            return (Criteria) this;
        }
        public Criteria andSTransportationNoIn(List<String> values) {
            addCriterion("sTransportationNo in", values, "sTransportationNo");
            return (Criteria) this;
        }
        public Criteria andSTransportationNoNotIn(List<String> values) {
            addCriterion("sTransportationNo not in", values, "sTransportationNo");
            return (Criteria) this;
        }
        public Criteria andSTransportationNoBetween(String value1, String value2) {
            addCriterion("sTransportationNo between", value1, value2, "sTransportationNo");
            return (Criteria) this;
        }
        public Criteria andSTransportationNoNotBetween(String value1, String value2) {
            addCriterion("sTransportationNo not between", value1, value2, "sTransportationNo");
            return (Criteria) this;
        }
        public Criteria andIAgentCompanyIdIsNull() {
            addCriterion("iAgentCompanyId is null");
            return (Criteria) this;
        }
        public Criteria andIAgentCompanyIdIsNotNull() {
            addCriterion("iAgentCompanyId is not null");
            return (Criteria) this;
        }
        public Criteria andIAgentCompanyIdEqualTo(Integer value) {
            addCriterion("iAgentCompanyId =", value, "iAgentCompanyId");
            return (Criteria) this;
        }
        public Criteria andIAgentCompanyIdNotEqualTo(Integer value) {
            addCriterion("iAgentCompanyId <>", value, "iAgentCompanyId");
            return (Criteria) this;
        }
        public Criteria andIAgentCompanyIdGreaterThan(Integer value) {
            addCriterion("iAgentCompanyId >", value, "iAgentCompanyId");
            return (Criteria) this;
        }
        public Criteria andIAgentCompanyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iAgentCompanyId >=", value, "iAgentCompanyId");
            return (Criteria) this;
        }
        public Criteria andIAgentCompanyIdLessThan(Integer value) {
            addCriterion("iAgentCompanyId <", value, "iAgentCompanyId");
            return (Criteria) this;
        }
        public Criteria andIAgentCompanyIdLessThanOrEqualTo(Integer value) {
            addCriterion("iAgentCompanyId <=", value, "iAgentCompanyId");
            return (Criteria) this;
        }
        public Criteria andIAgentCompanyIdIn(List<Integer> values) {
            addCriterion("iAgentCompanyId in", values, "iAgentCompanyId");
            return (Criteria) this;
        }
        public Criteria andIAgentCompanyIdNotIn(List<Integer> values) {
            addCriterion("iAgentCompanyId not in", values, "iAgentCompanyId");
            return (Criteria) this;
        }
        public Criteria andIAgentCompanyIdBetween(Integer value1, Integer value2) {
            addCriterion("iAgentCompanyId between", value1, value2, "iAgentCompanyId");
            return (Criteria) this;
        }
        public Criteria andIAgentCompanyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iAgentCompanyId not between", value1, value2, "iAgentCompanyId");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNoIsNull() {
            addCriterion("sAgentCompanyNo is null");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNoIsNotNull() {
            addCriterion("sAgentCompanyNo is not null");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNoEqualTo(String value) {
            addCriterion("sAgentCompanyNo =", value, "sAgentCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNoNotEqualTo(String value) {
            addCriterion("sAgentCompanyNo <>", value, "sAgentCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNoGreaterThan(String value) {
            addCriterion("sAgentCompanyNo >", value, "sAgentCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNoGreaterThanOrEqualTo(String value) {
            addCriterion("sAgentCompanyNo >=", value, "sAgentCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNoLessThan(String value) {
            addCriterion("sAgentCompanyNo <", value, "sAgentCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNoLessThanOrEqualTo(String value) {
            addCriterion("sAgentCompanyNo <=", value, "sAgentCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNoLike(String value) {
            addCriterion("sAgentCompanyNo like", value, "sAgentCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNoNotLike(String value) {
            addCriterion("sAgentCompanyNo not like", value, "sAgentCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNoIn(List<String> values) {
            addCriterion("sAgentCompanyNo in", values, "sAgentCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNoNotIn(List<String> values) {
            addCriterion("sAgentCompanyNo not in", values, "sAgentCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNoBetween(String value1, String value2) {
            addCriterion("sAgentCompanyNo between", value1, value2, "sAgentCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNoNotBetween(String value1, String value2) {
            addCriterion("sAgentCompanyNo not between", value1, value2, "sAgentCompanyNo");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameCnIsNull() {
            addCriterion("sAgentCompanyNameCn is null");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameCnIsNotNull() {
            addCriterion("sAgentCompanyNameCn is not null");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameCnEqualTo(String value) {
            addCriterion("sAgentCompanyNameCn =", value, "sAgentCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameCnNotEqualTo(String value) {
            addCriterion("sAgentCompanyNameCn <>", value, "sAgentCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameCnGreaterThan(String value) {
            addCriterion("sAgentCompanyNameCn >", value, "sAgentCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("sAgentCompanyNameCn >=", value, "sAgentCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameCnLessThan(String value) {
            addCriterion("sAgentCompanyNameCn <", value, "sAgentCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameCnLessThanOrEqualTo(String value) {
            addCriterion("sAgentCompanyNameCn <=", value, "sAgentCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameCnLike(String value) {
            addCriterion("sAgentCompanyNameCn like", value, "sAgentCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameCnNotLike(String value) {
            addCriterion("sAgentCompanyNameCn not like", value, "sAgentCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameCnIn(List<String> values) {
            addCriterion("sAgentCompanyNameCn in", values, "sAgentCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameCnNotIn(List<String> values) {
            addCriterion("sAgentCompanyNameCn not in", values, "sAgentCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameCnBetween(String value1, String value2) {
            addCriterion("sAgentCompanyNameCn between", value1, value2, "sAgentCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameCnNotBetween(String value1, String value2) {
            addCriterion("sAgentCompanyNameCn not between", value1, value2, "sAgentCompanyNameCn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameEnIsNull() {
            addCriterion("sAgentCompanyNameEn is null");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameEnIsNotNull() {
            addCriterion("sAgentCompanyNameEn is not null");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameEnEqualTo(String value) {
            addCriterion("sAgentCompanyNameEn =", value, "sAgentCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameEnNotEqualTo(String value) {
            addCriterion("sAgentCompanyNameEn <>", value, "sAgentCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameEnGreaterThan(String value) {
            addCriterion("sAgentCompanyNameEn >", value, "sAgentCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("sAgentCompanyNameEn >=", value, "sAgentCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameEnLessThan(String value) {
            addCriterion("sAgentCompanyNameEn <", value, "sAgentCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameEnLessThanOrEqualTo(String value) {
            addCriterion("sAgentCompanyNameEn <=", value, "sAgentCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameEnLike(String value) {
            addCriterion("sAgentCompanyNameEn like", value, "sAgentCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameEnNotLike(String value) {
            addCriterion("sAgentCompanyNameEn not like", value, "sAgentCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameEnIn(List<String> values) {
            addCriterion("sAgentCompanyNameEn in", values, "sAgentCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameEnNotIn(List<String> values) {
            addCriterion("sAgentCompanyNameEn not in", values, "sAgentCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameEnBetween(String value1, String value2) {
            addCriterion("sAgentCompanyNameEn between", value1, value2, "sAgentCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSAgentCompanyNameEnNotBetween(String value1, String value2) {
            addCriterion("sAgentCompanyNameEn not between", value1, value2, "sAgentCompanyNameEn");
            return (Criteria) this;
        }
        public Criteria andSPickUpBillNoIsNull() {
            addCriterion("sPickUpBillNo is null");
            return (Criteria) this;
        }
        public Criteria andSPickUpBillNoIsNotNull() {
            addCriterion("sPickUpBillNo is not null");
            return (Criteria) this;
        }
        public Criteria andSPickUpBillNoEqualTo(String value) {
            addCriterion("sPickUpBillNo =", value, "sPickUpBillNo");
            return (Criteria) this;
        }
        public Criteria andSPickUpBillNoNotEqualTo(String value) {
            addCriterion("sPickUpBillNo <>", value, "sPickUpBillNo");
            return (Criteria) this;
        }
        public Criteria andSPickUpBillNoGreaterThan(String value) {
            addCriterion("sPickUpBillNo >", value, "sPickUpBillNo");
            return (Criteria) this;
        }
        public Criteria andSPickUpBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("sPickUpBillNo >=", value, "sPickUpBillNo");
            return (Criteria) this;
        }
        public Criteria andSPickUpBillNoLessThan(String value) {
            addCriterion("sPickUpBillNo <", value, "sPickUpBillNo");
            return (Criteria) this;
        }
        public Criteria andSPickUpBillNoLessThanOrEqualTo(String value) {
            addCriterion("sPickUpBillNo <=", value, "sPickUpBillNo");
            return (Criteria) this;
        }
        public Criteria andSPickUpBillNoLike(String value) {
            addCriterion("sPickUpBillNo like", value, "sPickUpBillNo");
            return (Criteria) this;
        }
        public Criteria andSPickUpBillNoNotLike(String value) {
            addCriterion("sPickUpBillNo not like", value, "sPickUpBillNo");
            return (Criteria) this;
        }
        public Criteria andSPickUpBillNoIn(List<String> values) {
            addCriterion("sPickUpBillNo in", values, "sPickUpBillNo");
            return (Criteria) this;
        }
        public Criteria andSPickUpBillNoNotIn(List<String> values) {
            addCriterion("sPickUpBillNo not in", values, "sPickUpBillNo");
            return (Criteria) this;
        }
        public Criteria andSPickUpBillNoBetween(String value1, String value2) {
            addCriterion("sPickUpBillNo between", value1, value2, "sPickUpBillNo");
            return (Criteria) this;
        }
        public Criteria andSPickUpBillNoNotBetween(String value1, String value2) {
            addCriterion("sPickUpBillNo not between", value1, value2, "sPickUpBillNo");
            return (Criteria) this;
        }
        public Criteria andICHtaxKindIdIsNull() {
            addCriterion("iCHtaxKindId is null");
            return (Criteria) this;
        }
        public Criteria andICHtaxKindIdIsNotNull() {
            addCriterion("iCHtaxKindId is not null");
            return (Criteria) this;
        }
        public Criteria andICHtaxKindIdEqualTo(Integer value) {
            addCriterion("iCHtaxKindId =", value, "iCHtaxKindId");
            return (Criteria) this;
        }
        public Criteria andICHtaxKindIdNotEqualTo(Integer value) {
            addCriterion("iCHtaxKindId <>", value, "iCHtaxKindId");
            return (Criteria) this;
        }
        public Criteria andICHtaxKindIdGreaterThan(Integer value) {
            addCriterion("iCHtaxKindId >", value, "iCHtaxKindId");
            return (Criteria) this;
        }
        public Criteria andICHtaxKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iCHtaxKindId >=", value, "iCHtaxKindId");
            return (Criteria) this;
        }
        public Criteria andICHtaxKindIdLessThan(Integer value) {
            addCriterion("iCHtaxKindId <", value, "iCHtaxKindId");
            return (Criteria) this;
        }
        public Criteria andICHtaxKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("iCHtaxKindId <=", value, "iCHtaxKindId");
            return (Criteria) this;
        }
        public Criteria andICHtaxKindIdIn(List<Integer> values) {
            addCriterion("iCHtaxKindId in", values, "iCHtaxKindId");
            return (Criteria) this;
        }
        public Criteria andICHtaxKindIdNotIn(List<Integer> values) {
            addCriterion("iCHtaxKindId not in", values, "iCHtaxKindId");
            return (Criteria) this;
        }
        public Criteria andICHtaxKindIdBetween(Integer value1, Integer value2) {
            addCriterion("iCHtaxKindId between", value1, value2, "iCHtaxKindId");
            return (Criteria) this;
        }
        public Criteria andICHtaxKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iCHtaxKindId not between", value1, value2, "iCHtaxKindId");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindCodeIsNull() {
            addCriterion("sCHtaxKindCode is null");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindCodeIsNotNull() {
            addCriterion("sCHtaxKindCode is not null");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindCodeEqualTo(String value) {
            addCriterion("sCHtaxKindCode =", value, "sCHtaxKindCode");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindCodeNotEqualTo(String value) {
            addCriterion("sCHtaxKindCode <>", value, "sCHtaxKindCode");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindCodeGreaterThan(String value) {
            addCriterion("sCHtaxKindCode >", value, "sCHtaxKindCode");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sCHtaxKindCode >=", value, "sCHtaxKindCode");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindCodeLessThan(String value) {
            addCriterion("sCHtaxKindCode <", value, "sCHtaxKindCode");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindCodeLessThanOrEqualTo(String value) {
            addCriterion("sCHtaxKindCode <=", value, "sCHtaxKindCode");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindCodeLike(String value) {
            addCriterion("sCHtaxKindCode like", value, "sCHtaxKindCode");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindCodeNotLike(String value) {
            addCriterion("sCHtaxKindCode not like", value, "sCHtaxKindCode");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindCodeIn(List<String> values) {
            addCriterion("sCHtaxKindCode in", values, "sCHtaxKindCode");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindCodeNotIn(List<String> values) {
            addCriterion("sCHtaxKindCode not in", values, "sCHtaxKindCode");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindCodeBetween(String value1, String value2) {
            addCriterion("sCHtaxKindCode between", value1, value2, "sCHtaxKindCode");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindCodeNotBetween(String value1, String value2) {
            addCriterion("sCHtaxKindCode not between", value1, value2, "sCHtaxKindCode");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindNameIsNull() {
            addCriterion("sCHtaxKindName is null");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindNameIsNotNull() {
            addCriterion("sCHtaxKindName is not null");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindNameEqualTo(String value) {
            addCriterion("sCHtaxKindName =", value, "sCHtaxKindName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindNameNotEqualTo(String value) {
            addCriterion("sCHtaxKindName <>", value, "sCHtaxKindName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindNameGreaterThan(String value) {
            addCriterion("sCHtaxKindName >", value, "sCHtaxKindName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindNameGreaterThanOrEqualTo(String value) {
            addCriterion("sCHtaxKindName >=", value, "sCHtaxKindName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindNameLessThan(String value) {
            addCriterion("sCHtaxKindName <", value, "sCHtaxKindName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindNameLessThanOrEqualTo(String value) {
            addCriterion("sCHtaxKindName <=", value, "sCHtaxKindName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindNameLike(String value) {
            addCriterion("sCHtaxKindName like", value, "sCHtaxKindName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindNameNotLike(String value) {
            addCriterion("sCHtaxKindName not like", value, "sCHtaxKindName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindNameIn(List<String> values) {
            addCriterion("sCHtaxKindName in", values, "sCHtaxKindName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindNameNotIn(List<String> values) {
            addCriterion("sCHtaxKindName not in", values, "sCHtaxKindName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindNameBetween(String value1, String value2) {
            addCriterion("sCHtaxKindName between", value1, value2, "sCHtaxKindName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindNameNotBetween(String value1, String value2) {
            addCriterion("sCHtaxKindName not between", value1, value2, "sCHtaxKindName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindFullNameIsNull() {
            addCriterion("sCHtaxKindFullName is null");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindFullNameIsNotNull() {
            addCriterion("sCHtaxKindFullName is not null");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindFullNameEqualTo(String value) {
            addCriterion("sCHtaxKindFullName =", value, "sCHtaxKindFullName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindFullNameNotEqualTo(String value) {
            addCriterion("sCHtaxKindFullName <>", value, "sCHtaxKindFullName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindFullNameGreaterThan(String value) {
            addCriterion("sCHtaxKindFullName >", value, "sCHtaxKindFullName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindFullNameGreaterThanOrEqualTo(String value) {
            addCriterion("sCHtaxKindFullName >=", value, "sCHtaxKindFullName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindFullNameLessThan(String value) {
            addCriterion("sCHtaxKindFullName <", value, "sCHtaxKindFullName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindFullNameLessThanOrEqualTo(String value) {
            addCriterion("sCHtaxKindFullName <=", value, "sCHtaxKindFullName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindFullNameLike(String value) {
            addCriterion("sCHtaxKindFullName like", value, "sCHtaxKindFullName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindFullNameNotLike(String value) {
            addCriterion("sCHtaxKindFullName not like", value, "sCHtaxKindFullName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindFullNameIn(List<String> values) {
            addCriterion("sCHtaxKindFullName in", values, "sCHtaxKindFullName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindFullNameNotIn(List<String> values) {
            addCriterion("sCHtaxKindFullName not in", values, "sCHtaxKindFullName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindFullNameBetween(String value1, String value2) {
            addCriterion("sCHtaxKindFullName between", value1, value2, "sCHtaxKindFullName");
            return (Criteria) this;
        }
        public Criteria andSCHtaxKindFullNameNotBetween(String value1, String value2) {
            addCriterion("sCHtaxKindFullName not between", value1, value2, "sCHtaxKindFullName");
            return (Criteria) this;
        }
        public Criteria andSLisenceNoIsNull() {
            addCriterion("sLisenceNo is null");
            return (Criteria) this;
        }
        public Criteria andSLisenceNoIsNotNull() {
            addCriterion("sLisenceNo is not null");
            return (Criteria) this;
        }
        public Criteria andSLisenceNoEqualTo(String value) {
            addCriterion("sLisenceNo =", value, "sLisenceNo");
            return (Criteria) this;
        }
        public Criteria andSLisenceNoNotEqualTo(String value) {
            addCriterion("sLisenceNo <>", value, "sLisenceNo");
            return (Criteria) this;
        }
        public Criteria andSLisenceNoGreaterThan(String value) {
            addCriterion("sLisenceNo >", value, "sLisenceNo");
            return (Criteria) this;
        }
        public Criteria andSLisenceNoGreaterThanOrEqualTo(String value) {
            addCriterion("sLisenceNo >=", value, "sLisenceNo");
            return (Criteria) this;
        }
        public Criteria andSLisenceNoLessThan(String value) {
            addCriterion("sLisenceNo <", value, "sLisenceNo");
            return (Criteria) this;
        }
        public Criteria andSLisenceNoLessThanOrEqualTo(String value) {
            addCriterion("sLisenceNo <=", value, "sLisenceNo");
            return (Criteria) this;
        }
        public Criteria andSLisenceNoLike(String value) {
            addCriterion("sLisenceNo like", value, "sLisenceNo");
            return (Criteria) this;
        }
        public Criteria andSLisenceNoNotLike(String value) {
            addCriterion("sLisenceNo not like", value, "sLisenceNo");
            return (Criteria) this;
        }
        public Criteria andSLisenceNoIn(List<String> values) {
            addCriterion("sLisenceNo in", values, "sLisenceNo");
            return (Criteria) this;
        }
        public Criteria andSLisenceNoNotIn(List<String> values) {
            addCriterion("sLisenceNo not in", values, "sLisenceNo");
            return (Criteria) this;
        }
        public Criteria andSLisenceNoBetween(String value1, String value2) {
            addCriterion("sLisenceNo between", value1, value2, "sLisenceNo");
            return (Criteria) this;
        }
        public Criteria andSLisenceNoNotBetween(String value1, String value2) {
            addCriterion("sLisenceNo not between", value1, value2, "sLisenceNo");
            return (Criteria) this;
        }
        public Criteria andITradeCountryIdIsNull() {
            addCriterion("iTradeCountryId is null");
            return (Criteria) this;
        }
        public Criteria andITradeCountryIdIsNotNull() {
            addCriterion("iTradeCountryId is not null");
            return (Criteria) this;
        }
        public Criteria andITradeCountryIdEqualTo(Integer value) {
            addCriterion("iTradeCountryId =", value, "iTradeCountryId");
            return (Criteria) this;
        }
        public Criteria andITradeCountryIdNotEqualTo(Integer value) {
            addCriterion("iTradeCountryId <>", value, "iTradeCountryId");
            return (Criteria) this;
        }
        public Criteria andITradeCountryIdGreaterThan(Integer value) {
            addCriterion("iTradeCountryId >", value, "iTradeCountryId");
            return (Criteria) this;
        }
        public Criteria andITradeCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iTradeCountryId >=", value, "iTradeCountryId");
            return (Criteria) this;
        }
        public Criteria andITradeCountryIdLessThan(Integer value) {
            addCriterion("iTradeCountryId <", value, "iTradeCountryId");
            return (Criteria) this;
        }
        public Criteria andITradeCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("iTradeCountryId <=", value, "iTradeCountryId");
            return (Criteria) this;
        }
        public Criteria andITradeCountryIdIn(List<Integer> values) {
            addCriterion("iTradeCountryId in", values, "iTradeCountryId");
            return (Criteria) this;
        }
        public Criteria andITradeCountryIdNotIn(List<Integer> values) {
            addCriterion("iTradeCountryId not in", values, "iTradeCountryId");
            return (Criteria) this;
        }
        public Criteria andITradeCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("iTradeCountryId between", value1, value2, "iTradeCountryId");
            return (Criteria) this;
        }
        public Criteria andITradeCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iTradeCountryId not between", value1, value2, "iTradeCountryId");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryCodeIsNull() {
            addCriterion("sTradeCountryCode is null");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryCodeIsNotNull() {
            addCriterion("sTradeCountryCode is not null");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryCodeEqualTo(String value) {
            addCriterion("sTradeCountryCode =", value, "sTradeCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryCodeNotEqualTo(String value) {
            addCriterion("sTradeCountryCode <>", value, "sTradeCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryCodeGreaterThan(String value) {
            addCriterion("sTradeCountryCode >", value, "sTradeCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sTradeCountryCode >=", value, "sTradeCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryCodeLessThan(String value) {
            addCriterion("sTradeCountryCode <", value, "sTradeCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("sTradeCountryCode <=", value, "sTradeCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryCodeLike(String value) {
            addCriterion("sTradeCountryCode like", value, "sTradeCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryCodeNotLike(String value) {
            addCriterion("sTradeCountryCode not like", value, "sTradeCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryCodeIn(List<String> values) {
            addCriterion("sTradeCountryCode in", values, "sTradeCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryCodeNotIn(List<String> values) {
            addCriterion("sTradeCountryCode not in", values, "sTradeCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryCodeBetween(String value1, String value2) {
            addCriterion("sTradeCountryCode between", value1, value2, "sTradeCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryCodeNotBetween(String value1, String value2) {
            addCriterion("sTradeCountryCode not between", value1, value2, "sTradeCountryCode");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameCnIsNull() {
            addCriterion("sTradeCountryNameCn is null");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameCnIsNotNull() {
            addCriterion("sTradeCountryNameCn is not null");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameCnEqualTo(String value) {
            addCriterion("sTradeCountryNameCn =", value, "sTradeCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameCnNotEqualTo(String value) {
            addCriterion("sTradeCountryNameCn <>", value, "sTradeCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameCnGreaterThan(String value) {
            addCriterion("sTradeCountryNameCn >", value, "sTradeCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("sTradeCountryNameCn >=", value, "sTradeCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameCnLessThan(String value) {
            addCriterion("sTradeCountryNameCn <", value, "sTradeCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameCnLessThanOrEqualTo(String value) {
            addCriterion("sTradeCountryNameCn <=", value, "sTradeCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameCnLike(String value) {
            addCriterion("sTradeCountryNameCn like", value, "sTradeCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameCnNotLike(String value) {
            addCriterion("sTradeCountryNameCn not like", value, "sTradeCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameCnIn(List<String> values) {
            addCriterion("sTradeCountryNameCn in", values, "sTradeCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameCnNotIn(List<String> values) {
            addCriterion("sTradeCountryNameCn not in", values, "sTradeCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameCnBetween(String value1, String value2) {
            addCriterion("sTradeCountryNameCn between", value1, value2, "sTradeCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameCnNotBetween(String value1, String value2) {
            addCriterion("sTradeCountryNameCn not between", value1, value2, "sTradeCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameEnIsNull() {
            addCriterion("sTradeCountryNameEn is null");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameEnIsNotNull() {
            addCriterion("sTradeCountryNameEn is not null");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameEnEqualTo(String value) {
            addCriterion("sTradeCountryNameEn =", value, "sTradeCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameEnNotEqualTo(String value) {
            addCriterion("sTradeCountryNameEn <>", value, "sTradeCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameEnGreaterThan(String value) {
            addCriterion("sTradeCountryNameEn >", value, "sTradeCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("sTradeCountryNameEn >=", value, "sTradeCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameEnLessThan(String value) {
            addCriterion("sTradeCountryNameEn <", value, "sTradeCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameEnLessThanOrEqualTo(String value) {
            addCriterion("sTradeCountryNameEn <=", value, "sTradeCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameEnLike(String value) {
            addCriterion("sTradeCountryNameEn like", value, "sTradeCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameEnNotLike(String value) {
            addCriterion("sTradeCountryNameEn not like", value, "sTradeCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameEnIn(List<String> values) {
            addCriterion("sTradeCountryNameEn in", values, "sTradeCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameEnNotIn(List<String> values) {
            addCriterion("sTradeCountryNameEn not in", values, "sTradeCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameEnBetween(String value1, String value2) {
            addCriterion("sTradeCountryNameEn between", value1, value2, "sTradeCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSTradeCountryNameEnNotBetween(String value1, String value2) {
            addCriterion("sTradeCountryNameEn not between", value1, value2, "sTradeCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andILoadingCountryIdIsNull() {
            addCriterion("iLoadingCountryId is null");
            return (Criteria) this;
        }
        public Criteria andILoadingCountryIdIsNotNull() {
            addCriterion("iLoadingCountryId is not null");
            return (Criteria) this;
        }
        public Criteria andILoadingCountryIdEqualTo(Integer value) {
            addCriterion("iLoadingCountryId =", value, "iLoadingCountryId");
            return (Criteria) this;
        }
        public Criteria andILoadingCountryIdNotEqualTo(Integer value) {
            addCriterion("iLoadingCountryId <>", value, "iLoadingCountryId");
            return (Criteria) this;
        }
        public Criteria andILoadingCountryIdGreaterThan(Integer value) {
            addCriterion("iLoadingCountryId >", value, "iLoadingCountryId");
            return (Criteria) this;
        }
        public Criteria andILoadingCountryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iLoadingCountryId >=", value, "iLoadingCountryId");
            return (Criteria) this;
        }
        public Criteria andILoadingCountryIdLessThan(Integer value) {
            addCriterion("iLoadingCountryId <", value, "iLoadingCountryId");
            return (Criteria) this;
        }
        public Criteria andILoadingCountryIdLessThanOrEqualTo(Integer value) {
            addCriterion("iLoadingCountryId <=", value, "iLoadingCountryId");
            return (Criteria) this;
        }
        public Criteria andILoadingCountryIdIn(List<Integer> values) {
            addCriterion("iLoadingCountryId in", values, "iLoadingCountryId");
            return (Criteria) this;
        }
        public Criteria andILoadingCountryIdNotIn(List<Integer> values) {
            addCriterion("iLoadingCountryId not in", values, "iLoadingCountryId");
            return (Criteria) this;
        }
        public Criteria andILoadingCountryIdBetween(Integer value1, Integer value2) {
            addCriterion("iLoadingCountryId between", value1, value2, "iLoadingCountryId");
            return (Criteria) this;
        }
        public Criteria andILoadingCountryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iLoadingCountryId not between", value1, value2, "iLoadingCountryId");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryCodeIsNull() {
            addCriterion("sLoadingCountryCode is null");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryCodeIsNotNull() {
            addCriterion("sLoadingCountryCode is not null");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryCodeEqualTo(String value) {
            addCriterion("sLoadingCountryCode =", value, "sLoadingCountryCode");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryCodeNotEqualTo(String value) {
            addCriterion("sLoadingCountryCode <>", value, "sLoadingCountryCode");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryCodeGreaterThan(String value) {
            addCriterion("sLoadingCountryCode >", value, "sLoadingCountryCode");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sLoadingCountryCode >=", value, "sLoadingCountryCode");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryCodeLessThan(String value) {
            addCriterion("sLoadingCountryCode <", value, "sLoadingCountryCode");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("sLoadingCountryCode <=", value, "sLoadingCountryCode");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryCodeLike(String value) {
            addCriterion("sLoadingCountryCode like", value, "sLoadingCountryCode");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryCodeNotLike(String value) {
            addCriterion("sLoadingCountryCode not like", value, "sLoadingCountryCode");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryCodeIn(List<String> values) {
            addCriterion("sLoadingCountryCode in", values, "sLoadingCountryCode");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryCodeNotIn(List<String> values) {
            addCriterion("sLoadingCountryCode not in", values, "sLoadingCountryCode");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryCodeBetween(String value1, String value2) {
            addCriterion("sLoadingCountryCode between", value1, value2, "sLoadingCountryCode");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryCodeNotBetween(String value1, String value2) {
            addCriterion("sLoadingCountryCode not between", value1, value2, "sLoadingCountryCode");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameCnIsNull() {
            addCriterion("sLoadingCountryNameCn is null");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameCnIsNotNull() {
            addCriterion("sLoadingCountryNameCn is not null");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameCnEqualTo(String value) {
            addCriterion("sLoadingCountryNameCn =", value, "sLoadingCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameCnNotEqualTo(String value) {
            addCriterion("sLoadingCountryNameCn <>", value, "sLoadingCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameCnGreaterThan(String value) {
            addCriterion("sLoadingCountryNameCn >", value, "sLoadingCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("sLoadingCountryNameCn >=", value, "sLoadingCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameCnLessThan(String value) {
            addCriterion("sLoadingCountryNameCn <", value, "sLoadingCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameCnLessThanOrEqualTo(String value) {
            addCriterion("sLoadingCountryNameCn <=", value, "sLoadingCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameCnLike(String value) {
            addCriterion("sLoadingCountryNameCn like", value, "sLoadingCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameCnNotLike(String value) {
            addCriterion("sLoadingCountryNameCn not like", value, "sLoadingCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameCnIn(List<String> values) {
            addCriterion("sLoadingCountryNameCn in", values, "sLoadingCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameCnNotIn(List<String> values) {
            addCriterion("sLoadingCountryNameCn not in", values, "sLoadingCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameCnBetween(String value1, String value2) {
            addCriterion("sLoadingCountryNameCn between", value1, value2, "sLoadingCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameCnNotBetween(String value1, String value2) {
            addCriterion("sLoadingCountryNameCn not between", value1, value2, "sLoadingCountryNameCn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameEnIsNull() {
            addCriterion("sLoadingCountryNameEn is null");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameEnIsNotNull() {
            addCriterion("sLoadingCountryNameEn is not null");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameEnEqualTo(String value) {
            addCriterion("sLoadingCountryNameEn =", value, "sLoadingCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameEnNotEqualTo(String value) {
            addCriterion("sLoadingCountryNameEn <>", value, "sLoadingCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameEnGreaterThan(String value) {
            addCriterion("sLoadingCountryNameEn >", value, "sLoadingCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("sLoadingCountryNameEn >=", value, "sLoadingCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameEnLessThan(String value) {
            addCriterion("sLoadingCountryNameEn <", value, "sLoadingCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameEnLessThanOrEqualTo(String value) {
            addCriterion("sLoadingCountryNameEn <=", value, "sLoadingCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameEnLike(String value) {
            addCriterion("sLoadingCountryNameEn like", value, "sLoadingCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameEnNotLike(String value) {
            addCriterion("sLoadingCountryNameEn not like", value, "sLoadingCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameEnIn(List<String> values) {
            addCriterion("sLoadingCountryNameEn in", values, "sLoadingCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameEnNotIn(List<String> values) {
            addCriterion("sLoadingCountryNameEn not in", values, "sLoadingCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameEnBetween(String value1, String value2) {
            addCriterion("sLoadingCountryNameEn between", value1, value2, "sLoadingCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andSLoadingCountryNameEnNotBetween(String value1, String value2) {
            addCriterion("sLoadingCountryNameEn not between", value1, value2, "sLoadingCountryNameEn");
            return (Criteria) this;
        }
        public Criteria andIDomesticSupplyOfGoodsToIdIsNull() {
            addCriterion("iDomesticSupplyOfGoodsToId is null");
            return (Criteria) this;
        }
        public Criteria andIDomesticSupplyOfGoodsToIdIsNotNull() {
            addCriterion("iDomesticSupplyOfGoodsToId is not null");
            return (Criteria) this;
        }
        public Criteria andIDomesticSupplyOfGoodsToIdEqualTo(Integer value) {
            addCriterion("iDomesticSupplyOfGoodsToId =", value, "iDomesticSupplyOfGoodsToId");
            return (Criteria) this;
        }
        public Criteria andIDomesticSupplyOfGoodsToIdNotEqualTo(Integer value) {
            addCriterion("iDomesticSupplyOfGoodsToId <>", value, "iDomesticSupplyOfGoodsToId");
            return (Criteria) this;
        }
        public Criteria andIDomesticSupplyOfGoodsToIdGreaterThan(Integer value) {
            addCriterion("iDomesticSupplyOfGoodsToId >", value, "iDomesticSupplyOfGoodsToId");
            return (Criteria) this;
        }
        public Criteria andIDomesticSupplyOfGoodsToIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iDomesticSupplyOfGoodsToId >=", value, "iDomesticSupplyOfGoodsToId");
            return (Criteria) this;
        }
        public Criteria andIDomesticSupplyOfGoodsToIdLessThan(Integer value) {
            addCriterion("iDomesticSupplyOfGoodsToId <", value, "iDomesticSupplyOfGoodsToId");
            return (Criteria) this;
        }
        public Criteria andIDomesticSupplyOfGoodsToIdLessThanOrEqualTo(Integer value) {
            addCriterion("iDomesticSupplyOfGoodsToId <=", value, "iDomesticSupplyOfGoodsToId");
            return (Criteria) this;
        }
        public Criteria andIDomesticSupplyOfGoodsToIdIn(List<Integer> values) {
            addCriterion("iDomesticSupplyOfGoodsToId in", values, "iDomesticSupplyOfGoodsToId");
            return (Criteria) this;
        }
        public Criteria andIDomesticSupplyOfGoodsToIdNotIn(List<Integer> values) {
            addCriterion("iDomesticSupplyOfGoodsToId not in", values, "iDomesticSupplyOfGoodsToId");
            return (Criteria) this;
        }
        public Criteria andIDomesticSupplyOfGoodsToIdBetween(Integer value1, Integer value2) {
            addCriterion("iDomesticSupplyOfGoodsToId between", value1, value2, "iDomesticSupplyOfGoodsToId");
            return (Criteria) this;
        }
        public Criteria andIDomesticSupplyOfGoodsToIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iDomesticSupplyOfGoodsToId not between", value1, value2, "iDomesticSupplyOfGoodsToId");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToCodeIsNull() {
            addCriterion("sDomesticSupplyOfGoodsToCode is null");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToCodeIsNotNull() {
            addCriterion("sDomesticSupplyOfGoodsToCode is not null");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToCodeEqualTo(String value) {
            addCriterion("sDomesticSupplyOfGoodsToCode =", value, "sDomesticSupplyOfGoodsToCode");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToCodeNotEqualTo(String value) {
            addCriterion("sDomesticSupplyOfGoodsToCode <>", value, "sDomesticSupplyOfGoodsToCode");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToCodeGreaterThan(String value) {
            addCriterion("sDomesticSupplyOfGoodsToCode >", value, "sDomesticSupplyOfGoodsToCode");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sDomesticSupplyOfGoodsToCode >=", value, "sDomesticSupplyOfGoodsToCode");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToCodeLessThan(String value) {
            addCriterion("sDomesticSupplyOfGoodsToCode <", value, "sDomesticSupplyOfGoodsToCode");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToCodeLessThanOrEqualTo(String value) {
            addCriterion("sDomesticSupplyOfGoodsToCode <=", value, "sDomesticSupplyOfGoodsToCode");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToCodeLike(String value) {
            addCriterion("sDomesticSupplyOfGoodsToCode like", value, "sDomesticSupplyOfGoodsToCode");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToCodeNotLike(String value) {
            addCriterion("sDomesticSupplyOfGoodsToCode not like", value, "sDomesticSupplyOfGoodsToCode");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToCodeIn(List<String> values) {
            addCriterion("sDomesticSupplyOfGoodsToCode in", values, "sDomesticSupplyOfGoodsToCode");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToCodeNotIn(List<String> values) {
            addCriterion("sDomesticSupplyOfGoodsToCode not in", values, "sDomesticSupplyOfGoodsToCode");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToCodeBetween(String value1, String value2) {
            addCriterion("sDomesticSupplyOfGoodsToCode between", value1, value2, "sDomesticSupplyOfGoodsToCode");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToCodeNotBetween(String value1, String value2) {
            addCriterion("sDomesticSupplyOfGoodsToCode not between", value1, value2, "sDomesticSupplyOfGoodsToCode");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToNameIsNull() {
            addCriterion("sDomesticSupplyOfGoodsToName is null");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToNameIsNotNull() {
            addCriterion("sDomesticSupplyOfGoodsToName is not null");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToNameEqualTo(String value) {
            addCriterion("sDomesticSupplyOfGoodsToName =", value, "sDomesticSupplyOfGoodsToName");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToNameNotEqualTo(String value) {
            addCriterion("sDomesticSupplyOfGoodsToName <>", value, "sDomesticSupplyOfGoodsToName");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToNameGreaterThan(String value) {
            addCriterion("sDomesticSupplyOfGoodsToName >", value, "sDomesticSupplyOfGoodsToName");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToNameGreaterThanOrEqualTo(String value) {
            addCriterion("sDomesticSupplyOfGoodsToName >=", value, "sDomesticSupplyOfGoodsToName");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToNameLessThan(String value) {
            addCriterion("sDomesticSupplyOfGoodsToName <", value, "sDomesticSupplyOfGoodsToName");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToNameLessThanOrEqualTo(String value) {
            addCriterion("sDomesticSupplyOfGoodsToName <=", value, "sDomesticSupplyOfGoodsToName");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToNameLike(String value) {
            addCriterion("sDomesticSupplyOfGoodsToName like", value, "sDomesticSupplyOfGoodsToName");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToNameNotLike(String value) {
            addCriterion("sDomesticSupplyOfGoodsToName not like", value, "sDomesticSupplyOfGoodsToName");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToNameIn(List<String> values) {
            addCriterion("sDomesticSupplyOfGoodsToName in", values, "sDomesticSupplyOfGoodsToName");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToNameNotIn(List<String> values) {
            addCriterion("sDomesticSupplyOfGoodsToName not in", values, "sDomesticSupplyOfGoodsToName");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToNameBetween(String value1, String value2) {
            addCriterion("sDomesticSupplyOfGoodsToName between", value1, value2, "sDomesticSupplyOfGoodsToName");
            return (Criteria) this;
        }
        public Criteria andSDomesticSupplyOfGoodsToNameNotBetween(String value1, String value2) {
            addCriterion("sDomesticSupplyOfGoodsToName not between", value1, value2, "sDomesticSupplyOfGoodsToName");
            return (Criteria) this;
        }
        public Criteria andICHtransactionTypeIdIsNull() {
            addCriterion("iCHtransactionTypeId is null");
            return (Criteria) this;
        }
        public Criteria andICHtransactionTypeIdIsNotNull() {
            addCriterion("iCHtransactionTypeId is not null");
            return (Criteria) this;
        }
        public Criteria andICHtransactionTypeIdEqualTo(Integer value) {
            addCriterion("iCHtransactionTypeId =", value, "iCHtransactionTypeId");
            return (Criteria) this;
        }
        public Criteria andICHtransactionTypeIdNotEqualTo(Integer value) {
            addCriterion("iCHtransactionTypeId <>", value, "iCHtransactionTypeId");
            return (Criteria) this;
        }
        public Criteria andICHtransactionTypeIdGreaterThan(Integer value) {
            addCriterion("iCHtransactionTypeId >", value, "iCHtransactionTypeId");
            return (Criteria) this;
        }
        public Criteria andICHtransactionTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iCHtransactionTypeId >=", value, "iCHtransactionTypeId");
            return (Criteria) this;
        }
        public Criteria andICHtransactionTypeIdLessThan(Integer value) {
            addCriterion("iCHtransactionTypeId <", value, "iCHtransactionTypeId");
            return (Criteria) this;
        }
        public Criteria andICHtransactionTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("iCHtransactionTypeId <=", value, "iCHtransactionTypeId");
            return (Criteria) this;
        }
        public Criteria andICHtransactionTypeIdIn(List<Integer> values) {
            addCriterion("iCHtransactionTypeId in", values, "iCHtransactionTypeId");
            return (Criteria) this;
        }
        public Criteria andICHtransactionTypeIdNotIn(List<Integer> values) {
            addCriterion("iCHtransactionTypeId not in", values, "iCHtransactionTypeId");
            return (Criteria) this;
        }
        public Criteria andICHtransactionTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("iCHtransactionTypeId between", value1, value2, "iCHtransactionTypeId");
            return (Criteria) this;
        }
        public Criteria andICHtransactionTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iCHtransactionTypeId not between", value1, value2, "iCHtransactionTypeId");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeCodeIsNull() {
            addCriterion("sCHtransactionTypeCode is null");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeCodeIsNotNull() {
            addCriterion("sCHtransactionTypeCode is not null");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeCodeEqualTo(String value) {
            addCriterion("sCHtransactionTypeCode =", value, "sCHtransactionTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeCodeNotEqualTo(String value) {
            addCriterion("sCHtransactionTypeCode <>", value, "sCHtransactionTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeCodeGreaterThan(String value) {
            addCriterion("sCHtransactionTypeCode >", value, "sCHtransactionTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sCHtransactionTypeCode >=", value, "sCHtransactionTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeCodeLessThan(String value) {
            addCriterion("sCHtransactionTypeCode <", value, "sCHtransactionTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("sCHtransactionTypeCode <=", value, "sCHtransactionTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeCodeLike(String value) {
            addCriterion("sCHtransactionTypeCode like", value, "sCHtransactionTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeCodeNotLike(String value) {
            addCriterion("sCHtransactionTypeCode not like", value, "sCHtransactionTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeCodeIn(List<String> values) {
            addCriterion("sCHtransactionTypeCode in", values, "sCHtransactionTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeCodeNotIn(List<String> values) {
            addCriterion("sCHtransactionTypeCode not in", values, "sCHtransactionTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeCodeBetween(String value1, String value2) {
            addCriterion("sCHtransactionTypeCode between", value1, value2, "sCHtransactionTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeCodeNotBetween(String value1, String value2) {
            addCriterion("sCHtransactionTypeCode not between", value1, value2, "sCHtransactionTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeNameIsNull() {
            addCriterion("sCHtransactionTypeName is null");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeNameIsNotNull() {
            addCriterion("sCHtransactionTypeName is not null");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeNameEqualTo(String value) {
            addCriterion("sCHtransactionTypeName =", value, "sCHtransactionTypeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeNameNotEqualTo(String value) {
            addCriterion("sCHtransactionTypeName <>", value, "sCHtransactionTypeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeNameGreaterThan(String value) {
            addCriterion("sCHtransactionTypeName >", value, "sCHtransactionTypeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("sCHtransactionTypeName >=", value, "sCHtransactionTypeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeNameLessThan(String value) {
            addCriterion("sCHtransactionTypeName <", value, "sCHtransactionTypeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeNameLessThanOrEqualTo(String value) {
            addCriterion("sCHtransactionTypeName <=", value, "sCHtransactionTypeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeNameLike(String value) {
            addCriterion("sCHtransactionTypeName like", value, "sCHtransactionTypeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeNameNotLike(String value) {
            addCriterion("sCHtransactionTypeName not like", value, "sCHtransactionTypeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeNameIn(List<String> values) {
            addCriterion("sCHtransactionTypeName in", values, "sCHtransactionTypeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeNameNotIn(List<String> values) {
            addCriterion("sCHtransactionTypeName not in", values, "sCHtransactionTypeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeNameBetween(String value1, String value2) {
            addCriterion("sCHtransactionTypeName between", value1, value2, "sCHtransactionTypeName");
            return (Criteria) this;
        }
        public Criteria andSCHtransactionTypeNameNotBetween(String value1, String value2) {
            addCriterion("sCHtransactionTypeName not between", value1, value2, "sCHtransactionTypeName");
            return (Criteria) this;
        }
        public Criteria andIPackCountIsNull() {
            addCriterion("iPackCount is null");
            return (Criteria) this;
        }
        public Criteria andIPackCountIsNotNull() {
            addCriterion("iPackCount is not null");
            return (Criteria) this;
        }
        public Criteria andIPackCountEqualTo(Integer value) {
            addCriterion("iPackCount =", value, "iPackCount");
            return (Criteria) this;
        }
        public Criteria andIPackCountNotEqualTo(Integer value) {
            addCriterion("iPackCount <>", value, "iPackCount");
            return (Criteria) this;
        }
        public Criteria andIPackCountGreaterThan(Integer value) {
            addCriterion("iPackCount >", value, "iPackCount");
            return (Criteria) this;
        }
        public Criteria andIPackCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("iPackCount >=", value, "iPackCount");
            return (Criteria) this;
        }
        public Criteria andIPackCountLessThan(Integer value) {
            addCriterion("iPackCount <", value, "iPackCount");
            return (Criteria) this;
        }
        public Criteria andIPackCountLessThanOrEqualTo(Integer value) {
            addCriterion("iPackCount <=", value, "iPackCount");
            return (Criteria) this;
        }
        public Criteria andIPackCountIn(List<Integer> values) {
            addCriterion("iPackCount in", values, "iPackCount");
            return (Criteria) this;
        }
        public Criteria andIPackCountNotIn(List<Integer> values) {
            addCriterion("iPackCount not in", values, "iPackCount");
            return (Criteria) this;
        }
        public Criteria andIPackCountBetween(Integer value1, Integer value2) {
            addCriterion("iPackCount between", value1, value2, "iPackCount");
            return (Criteria) this;
        }
        public Criteria andIPackCountNotBetween(Integer value1, Integer value2) {
            addCriterion("iPackCount not between", value1, value2, "iPackCount");
            return (Criteria) this;
        }
        public Criteria andNGrossWeightIsNull() {
            addCriterion("nGrossWeight is null");
            return (Criteria) this;
        }
        public Criteria andNGrossWeightIsNotNull() {
            addCriterion("nGrossWeight is not null");
            return (Criteria) this;
        }
        public Criteria andNGrossWeightEqualTo(Double value) {
            addCriterion("nGrossWeight =", value, "nGrossWeight");
            return (Criteria) this;
        }
        public Criteria andNGrossWeightNotEqualTo(Double value) {
            addCriterion("nGrossWeight <>", value, "nGrossWeight");
            return (Criteria) this;
        }
        public Criteria andNGrossWeightGreaterThan(Double value) {
            addCriterion("nGrossWeight >", value, "nGrossWeight");
            return (Criteria) this;
        }
        public Criteria andNGrossWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("nGrossWeight >=", value, "nGrossWeight");
            return (Criteria) this;
        }
        public Criteria andNGrossWeightLessThan(Double value) {
            addCriterion("nGrossWeight <", value, "nGrossWeight");
            return (Criteria) this;
        }
        public Criteria andNGrossWeightLessThanOrEqualTo(Double value) {
            addCriterion("nGrossWeight <=", value, "nGrossWeight");
            return (Criteria) this;
        }
        public Criteria andNGrossWeightIn(List<Double> values) {
            addCriterion("nGrossWeight in", values, "nGrossWeight");
            return (Criteria) this;
        }
        public Criteria andNGrossWeightNotIn(List<Double> values) {
            addCriterion("nGrossWeight not in", values, "nGrossWeight");
            return (Criteria) this;
        }
        public Criteria andNGrossWeightBetween(Double value1, Double value2) {
            addCriterion("nGrossWeight between", value1, value2, "nGrossWeight");
            return (Criteria) this;
        }
        public Criteria andNGrossWeightNotBetween(Double value1, Double value2) {
            addCriterion("nGrossWeight not between", value1, value2, "nGrossWeight");
            return (Criteria) this;
        }
        public Criteria andNNetWeightIsNull() {
            addCriterion("nNetWeight is null");
            return (Criteria) this;
        }
        public Criteria andNNetWeightIsNotNull() {
            addCriterion("nNetWeight is not null");
            return (Criteria) this;
        }
        public Criteria andNNetWeightEqualTo(Double value) {
            addCriterion("nNetWeight =", value, "nNetWeight");
            return (Criteria) this;
        }
        public Criteria andNNetWeightNotEqualTo(Double value) {
            addCriterion("nNetWeight <>", value, "nNetWeight");
            return (Criteria) this;
        }
        public Criteria andNNetWeightGreaterThan(Double value) {
            addCriterion("nNetWeight >", value, "nNetWeight");
            return (Criteria) this;
        }
        public Criteria andNNetWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("nNetWeight >=", value, "nNetWeight");
            return (Criteria) this;
        }
        public Criteria andNNetWeightLessThan(Double value) {
            addCriterion("nNetWeight <", value, "nNetWeight");
            return (Criteria) this;
        }
        public Criteria andNNetWeightLessThanOrEqualTo(Double value) {
            addCriterion("nNetWeight <=", value, "nNetWeight");
            return (Criteria) this;
        }
        public Criteria andNNetWeightIn(List<Double> values) {
            addCriterion("nNetWeight in", values, "nNetWeight");
            return (Criteria) this;
        }
        public Criteria andNNetWeightNotIn(List<Double> values) {
            addCriterion("nNetWeight not in", values, "nNetWeight");
            return (Criteria) this;
        }
        public Criteria andNNetWeightBetween(Double value1, Double value2) {
            addCriterion("nNetWeight between", value1, value2, "nNetWeight");
            return (Criteria) this;
        }
        public Criteria andNNetWeightNotBetween(Double value1, Double value2) {
            addCriterion("nNetWeight not between", value1, value2, "nNetWeight");
            return (Criteria) this;
        }
        public Criteria andSAttachedBillsIsNull() {
            addCriterion("sAttachedBills is null");
            return (Criteria) this;
        }
        public Criteria andSAttachedBillsIsNotNull() {
            addCriterion("sAttachedBills is not null");
            return (Criteria) this;
        }
        public Criteria andSAttachedBillsEqualTo(String value) {
            addCriterion("sAttachedBills =", value, "sAttachedBills");
            return (Criteria) this;
        }
        public Criteria andSAttachedBillsNotEqualTo(String value) {
            addCriterion("sAttachedBills <>", value, "sAttachedBills");
            return (Criteria) this;
        }
        public Criteria andSAttachedBillsGreaterThan(String value) {
            addCriterion("sAttachedBills >", value, "sAttachedBills");
            return (Criteria) this;
        }
        public Criteria andSAttachedBillsGreaterThanOrEqualTo(String value) {
            addCriterion("sAttachedBills >=", value, "sAttachedBills");
            return (Criteria) this;
        }
        public Criteria andSAttachedBillsLessThan(String value) {
            addCriterion("sAttachedBills <", value, "sAttachedBills");
            return (Criteria) this;
        }
        public Criteria andSAttachedBillsLessThanOrEqualTo(String value) {
            addCriterion("sAttachedBills <=", value, "sAttachedBills");
            return (Criteria) this;
        }
        public Criteria andSAttachedBillsLike(String value) {
            addCriterion("sAttachedBills like", value, "sAttachedBills");
            return (Criteria) this;
        }
        public Criteria andSAttachedBillsNotLike(String value) {
            addCriterion("sAttachedBills not like", value, "sAttachedBills");
            return (Criteria) this;
        }
        public Criteria andSAttachedBillsIn(List<String> values) {
            addCriterion("sAttachedBills in", values, "sAttachedBills");
            return (Criteria) this;
        }
        public Criteria andSAttachedBillsNotIn(List<String> values) {
            addCriterion("sAttachedBills not in", values, "sAttachedBills");
            return (Criteria) this;
        }
        public Criteria andSAttachedBillsBetween(String value1, String value2) {
            addCriterion("sAttachedBills between", value1, value2, "sAttachedBills");
            return (Criteria) this;
        }
        public Criteria andSAttachedBillsNotBetween(String value1, String value2) {
            addCriterion("sAttachedBills not between", value1, value2, "sAttachedBills");
            return (Criteria) this;
        }
        public Criteria andICHharbourIdIsNull() {
            addCriterion("iCHharbourId is null");
            return (Criteria) this;
        }
        public Criteria andICHharbourIdIsNotNull() {
            addCriterion("iCHharbourId is not null");
            return (Criteria) this;
        }
        public Criteria andICHharbourIdEqualTo(Integer value) {
            addCriterion("iCHharbourId =", value, "iCHharbourId");
            return (Criteria) this;
        }
        public Criteria andICHharbourIdNotEqualTo(Integer value) {
            addCriterion("iCHharbourId <>", value, "iCHharbourId");
            return (Criteria) this;
        }
        public Criteria andICHharbourIdGreaterThan(Integer value) {
            addCriterion("iCHharbourId >", value, "iCHharbourId");
            return (Criteria) this;
        }
        public Criteria andICHharbourIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iCHharbourId >=", value, "iCHharbourId");
            return (Criteria) this;
        }
        public Criteria andICHharbourIdLessThan(Integer value) {
            addCriterion("iCHharbourId <", value, "iCHharbourId");
            return (Criteria) this;
        }
        public Criteria andICHharbourIdLessThanOrEqualTo(Integer value) {
            addCriterion("iCHharbourId <=", value, "iCHharbourId");
            return (Criteria) this;
        }
        public Criteria andICHharbourIdIn(List<Integer> values) {
            addCriterion("iCHharbourId in", values, "iCHharbourId");
            return (Criteria) this;
        }
        public Criteria andICHharbourIdNotIn(List<Integer> values) {
            addCriterion("iCHharbourId not in", values, "iCHharbourId");
            return (Criteria) this;
        }
        public Criteria andICHharbourIdBetween(Integer value1, Integer value2) {
            addCriterion("iCHharbourId between", value1, value2, "iCHharbourId");
            return (Criteria) this;
        }
        public Criteria andICHharbourIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iCHharbourId not between", value1, value2, "iCHharbourId");
            return (Criteria) this;
        }
        public Criteria andSCHharbourCodeIsNull() {
            addCriterion("sCHharbourCode is null");
            return (Criteria) this;
        }
        public Criteria andSCHharbourCodeIsNotNull() {
            addCriterion("sCHharbourCode is not null");
            return (Criteria) this;
        }
        public Criteria andSCHharbourCodeEqualTo(String value) {
            addCriterion("sCHharbourCode =", value, "sCHharbourCode");
            return (Criteria) this;
        }
        public Criteria andSCHharbourCodeNotEqualTo(String value) {
            addCriterion("sCHharbourCode <>", value, "sCHharbourCode");
            return (Criteria) this;
        }
        public Criteria andSCHharbourCodeGreaterThan(String value) {
            addCriterion("sCHharbourCode >", value, "sCHharbourCode");
            return (Criteria) this;
        }
        public Criteria andSCHharbourCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sCHharbourCode >=", value, "sCHharbourCode");
            return (Criteria) this;
        }
        public Criteria andSCHharbourCodeLessThan(String value) {
            addCriterion("sCHharbourCode <", value, "sCHharbourCode");
            return (Criteria) this;
        }
        public Criteria andSCHharbourCodeLessThanOrEqualTo(String value) {
            addCriterion("sCHharbourCode <=", value, "sCHharbourCode");
            return (Criteria) this;
        }
        public Criteria andSCHharbourCodeLike(String value) {
            addCriterion("sCHharbourCode like", value, "sCHharbourCode");
            return (Criteria) this;
        }
        public Criteria andSCHharbourCodeNotLike(String value) {
            addCriterion("sCHharbourCode not like", value, "sCHharbourCode");
            return (Criteria) this;
        }
        public Criteria andSCHharbourCodeIn(List<String> values) {
            addCriterion("sCHharbourCode in", values, "sCHharbourCode");
            return (Criteria) this;
        }
        public Criteria andSCHharbourCodeNotIn(List<String> values) {
            addCriterion("sCHharbourCode not in", values, "sCHharbourCode");
            return (Criteria) this;
        }
        public Criteria andSCHharbourCodeBetween(String value1, String value2) {
            addCriterion("sCHharbourCode between", value1, value2, "sCHharbourCode");
            return (Criteria) this;
        }
        public Criteria andSCHharbourCodeNotBetween(String value1, String value2) {
            addCriterion("sCHharbourCode not between", value1, value2, "sCHharbourCode");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameCnIsNull() {
            addCriterion("sCHharbourNameCn is null");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameCnIsNotNull() {
            addCriterion("sCHharbourNameCn is not null");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameCnEqualTo(String value) {
            addCriterion("sCHharbourNameCn =", value, "sCHharbourNameCn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameCnNotEqualTo(String value) {
            addCriterion("sCHharbourNameCn <>", value, "sCHharbourNameCn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameCnGreaterThan(String value) {
            addCriterion("sCHharbourNameCn >", value, "sCHharbourNameCn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("sCHharbourNameCn >=", value, "sCHharbourNameCn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameCnLessThan(String value) {
            addCriterion("sCHharbourNameCn <", value, "sCHharbourNameCn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameCnLessThanOrEqualTo(String value) {
            addCriterion("sCHharbourNameCn <=", value, "sCHharbourNameCn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameCnLike(String value) {
            addCriterion("sCHharbourNameCn like", value, "sCHharbourNameCn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameCnNotLike(String value) {
            addCriterion("sCHharbourNameCn not like", value, "sCHharbourNameCn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameCnIn(List<String> values) {
            addCriterion("sCHharbourNameCn in", values, "sCHharbourNameCn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameCnNotIn(List<String> values) {
            addCriterion("sCHharbourNameCn not in", values, "sCHharbourNameCn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameCnBetween(String value1, String value2) {
            addCriterion("sCHharbourNameCn between", value1, value2, "sCHharbourNameCn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameCnNotBetween(String value1, String value2) {
            addCriterion("sCHharbourNameCn not between", value1, value2, "sCHharbourNameCn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameEnIsNull() {
            addCriterion("sCHharbourNameEn is null");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameEnIsNotNull() {
            addCriterion("sCHharbourNameEn is not null");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameEnEqualTo(String value) {
            addCriterion("sCHharbourNameEn =", value, "sCHharbourNameEn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameEnNotEqualTo(String value) {
            addCriterion("sCHharbourNameEn <>", value, "sCHharbourNameEn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameEnGreaterThan(String value) {
            addCriterion("sCHharbourNameEn >", value, "sCHharbourNameEn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameEnGreaterThanOrEqualTo(String value) {
            addCriterion("sCHharbourNameEn >=", value, "sCHharbourNameEn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameEnLessThan(String value) {
            addCriterion("sCHharbourNameEn <", value, "sCHharbourNameEn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameEnLessThanOrEqualTo(String value) {
            addCriterion("sCHharbourNameEn <=", value, "sCHharbourNameEn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameEnLike(String value) {
            addCriterion("sCHharbourNameEn like", value, "sCHharbourNameEn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameEnNotLike(String value) {
            addCriterion("sCHharbourNameEn not like", value, "sCHharbourNameEn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameEnIn(List<String> values) {
            addCriterion("sCHharbourNameEn in", values, "sCHharbourNameEn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameEnNotIn(List<String> values) {
            addCriterion("sCHharbourNameEn not in", values, "sCHharbourNameEn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameEnBetween(String value1, String value2) {
            addCriterion("sCHharbourNameEn between", value1, value2, "sCHharbourNameEn");
            return (Criteria) this;
        }
        public Criteria andSCHharbourNameEnNotBetween(String value1, String value2) {
            addCriterion("sCHharbourNameEn not between", value1, value2, "sCHharbourNameEn");
            return (Criteria) this;
        }
        public Criteria andSSupplierInfoIsNull() {
            addCriterion("sSupplierInfo is null");
            return (Criteria) this;
        }
        public Criteria andSSupplierInfoIsNotNull() {
            addCriterion("sSupplierInfo is not null");
            return (Criteria) this;
        }
        public Criteria andSSupplierInfoEqualTo(String value) {
            addCriterion("sSupplierInfo =", value, "sSupplierInfo");
            return (Criteria) this;
        }
        public Criteria andSSupplierInfoNotEqualTo(String value) {
            addCriterion("sSupplierInfo <>", value, "sSupplierInfo");
            return (Criteria) this;
        }
        public Criteria andSSupplierInfoGreaterThan(String value) {
            addCriterion("sSupplierInfo >", value, "sSupplierInfo");
            return (Criteria) this;
        }
        public Criteria andSSupplierInfoGreaterThanOrEqualTo(String value) {
            addCriterion("sSupplierInfo >=", value, "sSupplierInfo");
            return (Criteria) this;
        }
        public Criteria andSSupplierInfoLessThan(String value) {
            addCriterion("sSupplierInfo <", value, "sSupplierInfo");
            return (Criteria) this;
        }
        public Criteria andSSupplierInfoLessThanOrEqualTo(String value) {
            addCriterion("sSupplierInfo <=", value, "sSupplierInfo");
            return (Criteria) this;
        }
        public Criteria andSSupplierInfoLike(String value) {
            addCriterion("sSupplierInfo like", value, "sSupplierInfo");
            return (Criteria) this;
        }
        public Criteria andSSupplierInfoNotLike(String value) {
            addCriterion("sSupplierInfo not like", value, "sSupplierInfo");
            return (Criteria) this;
        }
        public Criteria andSSupplierInfoIn(List<String> values) {
            addCriterion("sSupplierInfo in", values, "sSupplierInfo");
            return (Criteria) this;
        }
        public Criteria andSSupplierInfoNotIn(List<String> values) {
            addCriterion("sSupplierInfo not in", values, "sSupplierInfo");
            return (Criteria) this;
        }
        public Criteria andSSupplierInfoBetween(String value1, String value2) {
            addCriterion("sSupplierInfo between", value1, value2, "sSupplierInfo");
            return (Criteria) this;
        }
        public Criteria andSSupplierInfoNotBetween(String value1, String value2) {
            addCriterion("sSupplierInfo not between", value1, value2, "sSupplierInfo");
            return (Criteria) this;
        }
        public Criteria andSOrderNoIsNull() {
            addCriterion("sOrderNo is null");
            return (Criteria) this;
        }
        public Criteria andSOrderNoIsNotNull() {
            addCriterion("sOrderNo is not null");
            return (Criteria) this;
        }
        public Criteria andSOrderNoEqualTo(String value) {
            addCriterion("sOrderNo =", value, "sOrderNo");
            return (Criteria) this;
        }
        public Criteria andSOrderNoNotEqualTo(String value) {
            addCriterion("sOrderNo <>", value, "sOrderNo");
            return (Criteria) this;
        }
        public Criteria andSOrderNoGreaterThan(String value) {
            addCriterion("sOrderNo >", value, "sOrderNo");
            return (Criteria) this;
        }
        public Criteria andSOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("sOrderNo >=", value, "sOrderNo");
            return (Criteria) this;
        }
        public Criteria andSOrderNoLessThan(String value) {
            addCriterion("sOrderNo <", value, "sOrderNo");
            return (Criteria) this;
        }
        public Criteria andSOrderNoLessThanOrEqualTo(String value) {
            addCriterion("sOrderNo <=", value, "sOrderNo");
            return (Criteria) this;
        }
        public Criteria andSOrderNoLike(String value) {
            addCriterion("sOrderNo like", value, "sOrderNo");
            return (Criteria) this;
        }
        public Criteria andSOrderNoNotLike(String value) {
            addCriterion("sOrderNo not like", value, "sOrderNo");
            return (Criteria) this;
        }
        public Criteria andSOrderNoIn(List<String> values) {
            addCriterion("sOrderNo in", values, "sOrderNo");
            return (Criteria) this;
        }
        public Criteria andSOrderNoNotIn(List<String> values) {
            addCriterion("sOrderNo not in", values, "sOrderNo");
            return (Criteria) this;
        }
        public Criteria andSOrderNoBetween(String value1, String value2) {
            addCriterion("sOrderNo between", value1, value2, "sOrderNo");
            return (Criteria) this;
        }
        public Criteria andSOrderNoNotBetween(String value1, String value2) {
            addCriterion("sOrderNo not between", value1, value2, "sOrderNo");
            return (Criteria) this;
        }
        public Criteria andSCustomerBillNoIsNull() {
            addCriterion("sCustomerBillNo is null");
            return (Criteria) this;
        }
        public Criteria andSCustomerBillNoIsNotNull() {
            addCriterion("sCustomerBillNo is not null");
            return (Criteria) this;
        }
        public Criteria andSCustomerBillNoEqualTo(String value) {
            addCriterion("sCustomerBillNo =", value, "sCustomerBillNo");
            return (Criteria) this;
        }
        public Criteria andSCustomerBillNoNotEqualTo(String value) {
            addCriterion("sCustomerBillNo <>", value, "sCustomerBillNo");
            return (Criteria) this;
        }
        public Criteria andSCustomerBillNoGreaterThan(String value) {
            addCriterion("sCustomerBillNo >", value, "sCustomerBillNo");
            return (Criteria) this;
        }
        public Criteria andSCustomerBillNoGreaterThanOrEqualTo(String value) {
            addCriterion("sCustomerBillNo >=", value, "sCustomerBillNo");
            return (Criteria) this;
        }
        public Criteria andSCustomerBillNoLessThan(String value) {
            addCriterion("sCustomerBillNo <", value, "sCustomerBillNo");
            return (Criteria) this;
        }
        public Criteria andSCustomerBillNoLessThanOrEqualTo(String value) {
            addCriterion("sCustomerBillNo <=", value, "sCustomerBillNo");
            return (Criteria) this;
        }
        public Criteria andSCustomerBillNoLike(String value) {
            addCriterion("sCustomerBillNo like", value, "sCustomerBillNo");
            return (Criteria) this;
        }
        public Criteria andSCustomerBillNoNotLike(String value) {
            addCriterion("sCustomerBillNo not like", value, "sCustomerBillNo");
            return (Criteria) this;
        }
        public Criteria andSCustomerBillNoIn(List<String> values) {
            addCriterion("sCustomerBillNo in", values, "sCustomerBillNo");
            return (Criteria) this;
        }
        public Criteria andSCustomerBillNoNotIn(List<String> values) {
            addCriterion("sCustomerBillNo not in", values, "sCustomerBillNo");
            return (Criteria) this;
        }
        public Criteria andSCustomerBillNoBetween(String value1, String value2) {
            addCriterion("sCustomerBillNo between", value1, value2, "sCustomerBillNo");
            return (Criteria) this;
        }
        public Criteria andSCustomerBillNoNotBetween(String value1, String value2) {
            addCriterion("sCustomerBillNo not between", value1, value2, "sCustomerBillNo");
            return (Criteria) this;
        }
        public Criteria andICHregulationFormIdIsNull() {
            addCriterion("iCHregulationFormId is null");
            return (Criteria) this;
        }
        public Criteria andICHregulationFormIdIsNotNull() {
            addCriterion("iCHregulationFormId is not null");
            return (Criteria) this;
        }
        public Criteria andICHregulationFormIdEqualTo(Integer value) {
            addCriterion("iCHregulationFormId =", value, "iCHregulationFormId");
            return (Criteria) this;
        }
        public Criteria andICHregulationFormIdNotEqualTo(Integer value) {
            addCriterion("iCHregulationFormId <>", value, "iCHregulationFormId");
            return (Criteria) this;
        }
        public Criteria andICHregulationFormIdGreaterThan(Integer value) {
            addCriterion("iCHregulationFormId >", value, "iCHregulationFormId");
            return (Criteria) this;
        }
        public Criteria andICHregulationFormIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iCHregulationFormId >=", value, "iCHregulationFormId");
            return (Criteria) this;
        }
        public Criteria andICHregulationFormIdLessThan(Integer value) {
            addCriterion("iCHregulationFormId <", value, "iCHregulationFormId");
            return (Criteria) this;
        }
        public Criteria andICHregulationFormIdLessThanOrEqualTo(Integer value) {
            addCriterion("iCHregulationFormId <=", value, "iCHregulationFormId");
            return (Criteria) this;
        }
        public Criteria andICHregulationFormIdIn(List<Integer> values) {
            addCriterion("iCHregulationFormId in", values, "iCHregulationFormId");
            return (Criteria) this;
        }
        public Criteria andICHregulationFormIdNotIn(List<Integer> values) {
            addCriterion("iCHregulationFormId not in", values, "iCHregulationFormId");
            return (Criteria) this;
        }
        public Criteria andICHregulationFormIdBetween(Integer value1, Integer value2) {
            addCriterion("iCHregulationFormId between", value1, value2, "iCHregulationFormId");
            return (Criteria) this;
        }
        public Criteria andICHregulationFormIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iCHregulationFormId not between", value1, value2, "iCHregulationFormId");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormCodeIsNull() {
            addCriterion("sCHregulationFormCode is null");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormCodeIsNotNull() {
            addCriterion("sCHregulationFormCode is not null");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormCodeEqualTo(String value) {
            addCriterion("sCHregulationFormCode =", value, "sCHregulationFormCode");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormCodeNotEqualTo(String value) {
            addCriterion("sCHregulationFormCode <>", value, "sCHregulationFormCode");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormCodeGreaterThan(String value) {
            addCriterion("sCHregulationFormCode >", value, "sCHregulationFormCode");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sCHregulationFormCode >=", value, "sCHregulationFormCode");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormCodeLessThan(String value) {
            addCriterion("sCHregulationFormCode <", value, "sCHregulationFormCode");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormCodeLessThanOrEqualTo(String value) {
            addCriterion("sCHregulationFormCode <=", value, "sCHregulationFormCode");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormCodeLike(String value) {
            addCriterion("sCHregulationFormCode like", value, "sCHregulationFormCode");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormCodeNotLike(String value) {
            addCriterion("sCHregulationFormCode not like", value, "sCHregulationFormCode");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormCodeIn(List<String> values) {
            addCriterion("sCHregulationFormCode in", values, "sCHregulationFormCode");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormCodeNotIn(List<String> values) {
            addCriterion("sCHregulationFormCode not in", values, "sCHregulationFormCode");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormCodeBetween(String value1, String value2) {
            addCriterion("sCHregulationFormCode between", value1, value2, "sCHregulationFormCode");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormCodeNotBetween(String value1, String value2) {
            addCriterion("sCHregulationFormCode not between", value1, value2, "sCHregulationFormCode");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormNameIsNull() {
            addCriterion("sCHregulationFormName is null");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormNameIsNotNull() {
            addCriterion("sCHregulationFormName is not null");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormNameEqualTo(String value) {
            addCriterion("sCHregulationFormName =", value, "sCHregulationFormName");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormNameNotEqualTo(String value) {
            addCriterion("sCHregulationFormName <>", value, "sCHregulationFormName");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormNameGreaterThan(String value) {
            addCriterion("sCHregulationFormName >", value, "sCHregulationFormName");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormNameGreaterThanOrEqualTo(String value) {
            addCriterion("sCHregulationFormName >=", value, "sCHregulationFormName");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormNameLessThan(String value) {
            addCriterion("sCHregulationFormName <", value, "sCHregulationFormName");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormNameLessThanOrEqualTo(String value) {
            addCriterion("sCHregulationFormName <=", value, "sCHregulationFormName");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormNameLike(String value) {
            addCriterion("sCHregulationFormName like", value, "sCHregulationFormName");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormNameNotLike(String value) {
            addCriterion("sCHregulationFormName not like", value, "sCHregulationFormName");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormNameIn(List<String> values) {
            addCriterion("sCHregulationFormName in", values, "sCHregulationFormName");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormNameNotIn(List<String> values) {
            addCriterion("sCHregulationFormName not in", values, "sCHregulationFormName");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormNameBetween(String value1, String value2) {
            addCriterion("sCHregulationFormName between", value1, value2, "sCHregulationFormName");
            return (Criteria) this;
        }
        public Criteria andSCHregulationFormNameNotBetween(String value1, String value2) {
            addCriterion("sCHregulationFormName not between", value1, value2, "sCHregulationFormName");
            return (Criteria) this;
        }
        public Criteria andSPackingTypeIsNull() {
            addCriterion("sPackingType is null");
            return (Criteria) this;
        }
        public Criteria andSPackingTypeIsNotNull() {
            addCriterion("sPackingType is not null");
            return (Criteria) this;
        }
        public Criteria andSPackingTypeEqualTo(String value) {
            addCriterion("sPackingType =", value, "sPackingType");
            return (Criteria) this;
        }
        public Criteria andSPackingTypeNotEqualTo(String value) {
            addCriterion("sPackingType <>", value, "sPackingType");
            return (Criteria) this;
        }
        public Criteria andSPackingTypeGreaterThan(String value) {
            addCriterion("sPackingType >", value, "sPackingType");
            return (Criteria) this;
        }
        public Criteria andSPackingTypeGreaterThanOrEqualTo(String value) {
            addCriterion("sPackingType >=", value, "sPackingType");
            return (Criteria) this;
        }
        public Criteria andSPackingTypeLessThan(String value) {
            addCriterion("sPackingType <", value, "sPackingType");
            return (Criteria) this;
        }
        public Criteria andSPackingTypeLessThanOrEqualTo(String value) {
            addCriterion("sPackingType <=", value, "sPackingType");
            return (Criteria) this;
        }
        public Criteria andSPackingTypeLike(String value) {
            addCriterion("sPackingType like", value, "sPackingType");
            return (Criteria) this;
        }
        public Criteria andSPackingTypeNotLike(String value) {
            addCriterion("sPackingType not like", value, "sPackingType");
            return (Criteria) this;
        }
        public Criteria andSPackingTypeIn(List<String> values) {
            addCriterion("sPackingType in", values, "sPackingType");
            return (Criteria) this;
        }
        public Criteria andSPackingTypeNotIn(List<String> values) {
            addCriterion("sPackingType not in", values, "sPackingType");
            return (Criteria) this;
        }
        public Criteria andSPackingTypeBetween(String value1, String value2) {
            addCriterion("sPackingType between", value1, value2, "sPackingType");
            return (Criteria) this;
        }
        public Criteria andSPackingTypeNotBetween(String value1, String value2) {
            addCriterion("sPackingType not between", value1, value2, "sPackingType");
            return (Criteria) this;
        }
        public Criteria andICustomsDeclarationOrderStatusIsNull() {
            addCriterion("iCustomsDeclarationOrderStatus is null");
            return (Criteria) this;
        }
        public Criteria andICustomsDeclarationOrderStatusIsNotNull() {
            addCriterion("iCustomsDeclarationOrderStatus is not null");
            return (Criteria) this;
        }
        public Criteria andICustomsDeclarationOrderStatusEqualTo(Integer value) {
            addCriterion("iCustomsDeclarationOrderStatus =", value, "iCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andICustomsDeclarationOrderStatusNotEqualTo(Integer value) {
            addCriterion("iCustomsDeclarationOrderStatus <>", value, "iCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andICustomsDeclarationOrderStatusGreaterThan(Integer value) {
            addCriterion("iCustomsDeclarationOrderStatus >", value, "iCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andICustomsDeclarationOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("iCustomsDeclarationOrderStatus >=", value, "iCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andICustomsDeclarationOrderStatusLessThan(Integer value) {
            addCriterion("iCustomsDeclarationOrderStatus <", value, "iCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andICustomsDeclarationOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("iCustomsDeclarationOrderStatus <=", value, "iCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andICustomsDeclarationOrderStatusIn(List<Integer> values) {
            addCriterion("iCustomsDeclarationOrderStatus in", values, "iCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andICustomsDeclarationOrderStatusNotIn(List<Integer> values) {
            addCriterion("iCustomsDeclarationOrderStatus not in", values, "iCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andICustomsDeclarationOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("iCustomsDeclarationOrderStatus between", value1, value2, "iCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andICustomsDeclarationOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("iCustomsDeclarationOrderStatus not between", value1, value2, "iCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationOrderStatusIsNull() {
            addCriterion("sCustomsDeclarationOrderStatus is null");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationOrderStatusIsNotNull() {
            addCriterion("sCustomsDeclarationOrderStatus is not null");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationOrderStatusEqualTo(String value) {
            addCriterion("sCustomsDeclarationOrderStatus =", value, "sCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationOrderStatusNotEqualTo(String value) {
            addCriterion("sCustomsDeclarationOrderStatus <>", value, "sCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationOrderStatusGreaterThan(String value) {
            addCriterion("sCustomsDeclarationOrderStatus >", value, "sCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationOrderStatusGreaterThanOrEqualTo(String value) {
            addCriterion("sCustomsDeclarationOrderStatus >=", value, "sCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationOrderStatusLessThan(String value) {
            addCriterion("sCustomsDeclarationOrderStatus <", value, "sCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationOrderStatusLessThanOrEqualTo(String value) {
            addCriterion("sCustomsDeclarationOrderStatus <=", value, "sCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationOrderStatusLike(String value) {
            addCriterion("sCustomsDeclarationOrderStatus like", value, "sCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationOrderStatusNotLike(String value) {
            addCriterion("sCustomsDeclarationOrderStatus not like", value, "sCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationOrderStatusIn(List<String> values) {
            addCriterion("sCustomsDeclarationOrderStatus in", values, "sCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationOrderStatusNotIn(List<String> values) {
            addCriterion("sCustomsDeclarationOrderStatus not in", values, "sCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationOrderStatusBetween(String value1, String value2) {
            addCriterion("sCustomsDeclarationOrderStatus between", value1, value2, "sCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationOrderStatusNotBetween(String value1, String value2) {
            addCriterion("sCustomsDeclarationOrderStatus not between", value1, value2, "sCustomsDeclarationOrderStatus");
            return (Criteria) this;
        }
        public Criteria andIDeclarationPortIdIsNull() {
            addCriterion("iDeclarationPortId is null");
            return (Criteria) this;
        }
        public Criteria andIDeclarationPortIdIsNotNull() {
            addCriterion("iDeclarationPortId is not null");
            return (Criteria) this;
        }
        public Criteria andIDeclarationPortIdEqualTo(Integer value) {
            addCriterion("iDeclarationPortId =", value, "iDeclarationPortId");
            return (Criteria) this;
        }
        public Criteria andIDeclarationPortIdNotEqualTo(Integer value) {
            addCriterion("iDeclarationPortId <>", value, "iDeclarationPortId");
            return (Criteria) this;
        }
        public Criteria andIDeclarationPortIdGreaterThan(Integer value) {
            addCriterion("iDeclarationPortId >", value, "iDeclarationPortId");
            return (Criteria) this;
        }
        public Criteria andIDeclarationPortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("iDeclarationPortId >=", value, "iDeclarationPortId");
            return (Criteria) this;
        }
        public Criteria andIDeclarationPortIdLessThan(Integer value) {
            addCriterion("iDeclarationPortId <", value, "iDeclarationPortId");
            return (Criteria) this;
        }
        public Criteria andIDeclarationPortIdLessThanOrEqualTo(Integer value) {
            addCriterion("iDeclarationPortId <=", value, "iDeclarationPortId");
            return (Criteria) this;
        }
        public Criteria andIDeclarationPortIdIn(List<Integer> values) {
            addCriterion("iDeclarationPortId in", values, "iDeclarationPortId");
            return (Criteria) this;
        }
        public Criteria andIDeclarationPortIdNotIn(List<Integer> values) {
            addCriterion("iDeclarationPortId not in", values, "iDeclarationPortId");
            return (Criteria) this;
        }
        public Criteria andIDeclarationPortIdBetween(Integer value1, Integer value2) {
            addCriterion("iDeclarationPortId between", value1, value2, "iDeclarationPortId");
            return (Criteria) this;
        }
        public Criteria andIDeclarationPortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("iDeclarationPortId not between", value1, value2, "iDeclarationPortId");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortCodeIsNull() {
            addCriterion("sDeclarationPortCode is null");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortCodeIsNotNull() {
            addCriterion("sDeclarationPortCode is not null");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortCodeEqualTo(String value) {
            addCriterion("sDeclarationPortCode =", value, "sDeclarationPortCode");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortCodeNotEqualTo(String value) {
            addCriterion("sDeclarationPortCode <>", value, "sDeclarationPortCode");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortCodeGreaterThan(String value) {
            addCriterion("sDeclarationPortCode >", value, "sDeclarationPortCode");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sDeclarationPortCode >=", value, "sDeclarationPortCode");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortCodeLessThan(String value) {
            addCriterion("sDeclarationPortCode <", value, "sDeclarationPortCode");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortCodeLessThanOrEqualTo(String value) {
            addCriterion("sDeclarationPortCode <=", value, "sDeclarationPortCode");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortCodeLike(String value) {
            addCriterion("sDeclarationPortCode like", value, "sDeclarationPortCode");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortCodeNotLike(String value) {
            addCriterion("sDeclarationPortCode not like", value, "sDeclarationPortCode");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortCodeIn(List<String> values) {
            addCriterion("sDeclarationPortCode in", values, "sDeclarationPortCode");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortCodeNotIn(List<String> values) {
            addCriterion("sDeclarationPortCode not in", values, "sDeclarationPortCode");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortCodeBetween(String value1, String value2) {
            addCriterion("sDeclarationPortCode between", value1, value2, "sDeclarationPortCode");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortCodeNotBetween(String value1, String value2) {
            addCriterion("sDeclarationPortCode not between", value1, value2, "sDeclarationPortCode");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortNameIsNull() {
            addCriterion("sDeclarationPortName is null");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortNameIsNotNull() {
            addCriterion("sDeclarationPortName is not null");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortNameEqualTo(String value) {
            addCriterion("sDeclarationPortName =", value, "sDeclarationPortName");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortNameNotEqualTo(String value) {
            addCriterion("sDeclarationPortName <>", value, "sDeclarationPortName");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortNameGreaterThan(String value) {
            addCriterion("sDeclarationPortName >", value, "sDeclarationPortName");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortNameGreaterThanOrEqualTo(String value) {
            addCriterion("sDeclarationPortName >=", value, "sDeclarationPortName");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortNameLessThan(String value) {
            addCriterion("sDeclarationPortName <", value, "sDeclarationPortName");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortNameLessThanOrEqualTo(String value) {
            addCriterion("sDeclarationPortName <=", value, "sDeclarationPortName");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortNameLike(String value) {
            addCriterion("sDeclarationPortName like", value, "sDeclarationPortName");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortNameNotLike(String value) {
            addCriterion("sDeclarationPortName not like", value, "sDeclarationPortName");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortNameIn(List<String> values) {
            addCriterion("sDeclarationPortName in", values, "sDeclarationPortName");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortNameNotIn(List<String> values) {
            addCriterion("sDeclarationPortName not in", values, "sDeclarationPortName");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortNameBetween(String value1, String value2) {
            addCriterion("sDeclarationPortName between", value1, value2, "sDeclarationPortName");
            return (Criteria) this;
        }
        public Criteria andSDeclarationPortNameNotBetween(String value1, String value2) {
            addCriterion("sDeclarationPortName not between", value1, value2, "sDeclarationPortName");
            return (Criteria) this;
        }
        public Criteria andIPaperlessDeclareIsNull() {
            addCriterion("iPaperlessDeclare is null");
            return (Criteria) this;
        }
        public Criteria andIPaperlessDeclareIsNotNull() {
            addCriterion("iPaperlessDeclare is not null");
            return (Criteria) this;
        }
        public Criteria andIPaperlessDeclareEqualTo(Integer value) {
            addCriterion("iPaperlessDeclare =", value, "iPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andIPaperlessDeclareNotEqualTo(Integer value) {
            addCriterion("iPaperlessDeclare <>", value, "iPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andIPaperlessDeclareGreaterThan(Integer value) {
            addCriterion("iPaperlessDeclare >", value, "iPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andIPaperlessDeclareGreaterThanOrEqualTo(Integer value) {
            addCriterion("iPaperlessDeclare >=", value, "iPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andIPaperlessDeclareLessThan(Integer value) {
            addCriterion("iPaperlessDeclare <", value, "iPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andIPaperlessDeclareLessThanOrEqualTo(Integer value) {
            addCriterion("iPaperlessDeclare <=", value, "iPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andIPaperlessDeclareIn(List<Integer> values) {
            addCriterion("iPaperlessDeclare in", values, "iPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andIPaperlessDeclareNotIn(List<Integer> values) {
            addCriterion("iPaperlessDeclare not in", values, "iPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andIPaperlessDeclareBetween(Integer value1, Integer value2) {
            addCriterion("iPaperlessDeclare between", value1, value2, "iPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andIPaperlessDeclareNotBetween(Integer value1, Integer value2) {
            addCriterion("iPaperlessDeclare not between", value1, value2, "iPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andNTaxRateIsNull() {
            addCriterion("nTaxRate is null");
            return (Criteria) this;
        }
        public Criteria andNTaxRateIsNotNull() {
            addCriterion("nTaxRate is not null");
            return (Criteria) this;
        }
        public Criteria andNTaxRateEqualTo(Double value) {
            addCriterion("nTaxRate =", value, "nTaxRate");
            return (Criteria) this;
        }
        public Criteria andNTaxRateNotEqualTo(Double value) {
            addCriterion("nTaxRate <>", value, "nTaxRate");
            return (Criteria) this;
        }
        public Criteria andNTaxRateGreaterThan(Double value) {
            addCriterion("nTaxRate >", value, "nTaxRate");
            return (Criteria) this;
        }
        public Criteria andNTaxRateGreaterThanOrEqualTo(Double value) {
            addCriterion("nTaxRate >=", value, "nTaxRate");
            return (Criteria) this;
        }
        public Criteria andNTaxRateLessThan(Double value) {
            addCriterion("nTaxRate <", value, "nTaxRate");
            return (Criteria) this;
        }
        public Criteria andNTaxRateLessThanOrEqualTo(Double value) {
            addCriterion("nTaxRate <=", value, "nTaxRate");
            return (Criteria) this;
        }
        public Criteria andNTaxRateIn(List<Double> values) {
            addCriterion("nTaxRate in", values, "nTaxRate");
            return (Criteria) this;
        }
        public Criteria andNTaxRateNotIn(List<Double> values) {
            addCriterion("nTaxRate not in", values, "nTaxRate");
            return (Criteria) this;
        }
        public Criteria andNTaxRateBetween(Double value1, Double value2) {
            addCriterion("nTaxRate between", value1, value2, "nTaxRate");
            return (Criteria) this;
        }
        public Criteria andNTaxRateNotBetween(Double value1, Double value2) {
            addCriterion("nTaxRate not between", value1, value2, "nTaxRate");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoRefIsNull() {
            addCriterion("sCustomsNoRef is null");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoRefIsNotNull() {
            addCriterion("sCustomsNoRef is not null");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoRefEqualTo(String value) {
            addCriterion("sCustomsNoRef =", value, "sCustomsNoRef");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoRefNotEqualTo(String value) {
            addCriterion("sCustomsNoRef <>", value, "sCustomsNoRef");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoRefGreaterThan(String value) {
            addCriterion("sCustomsNoRef >", value, "sCustomsNoRef");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoRefGreaterThanOrEqualTo(String value) {
            addCriterion("sCustomsNoRef >=", value, "sCustomsNoRef");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoRefLessThan(String value) {
            addCriterion("sCustomsNoRef <", value, "sCustomsNoRef");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoRefLessThanOrEqualTo(String value) {
            addCriterion("sCustomsNoRef <=", value, "sCustomsNoRef");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoRefLike(String value) {
            addCriterion("sCustomsNoRef like", value, "sCustomsNoRef");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoRefNotLike(String value) {
            addCriterion("sCustomsNoRef not like", value, "sCustomsNoRef");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoRefIn(List<String> values) {
            addCriterion("sCustomsNoRef in", values, "sCustomsNoRef");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoRefNotIn(List<String> values) {
            addCriterion("sCustomsNoRef not in", values, "sCustomsNoRef");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoRefBetween(String value1, String value2) {
            addCriterion("sCustomsNoRef between", value1, value2, "sCustomsNoRef");
            return (Criteria) this;
        }
        public Criteria andSCustomsNoRefNotBetween(String value1, String value2) {
            addCriterion("sCustomsNoRef not between", value1, value2, "sCustomsNoRef");
            return (Criteria) this;
        }
        public Criteria andSManualNoRefIsNull() {
            addCriterion("sManualNoRef is null");
            return (Criteria) this;
        }
        public Criteria andSManualNoRefIsNotNull() {
            addCriterion("sManualNoRef is not null");
            return (Criteria) this;
        }
        public Criteria andSManualNoRefEqualTo(String value) {
            addCriterion("sManualNoRef =", value, "sManualNoRef");
            return (Criteria) this;
        }
        public Criteria andSManualNoRefNotEqualTo(String value) {
            addCriterion("sManualNoRef <>", value, "sManualNoRef");
            return (Criteria) this;
        }
        public Criteria andSManualNoRefGreaterThan(String value) {
            addCriterion("sManualNoRef >", value, "sManualNoRef");
            return (Criteria) this;
        }
        public Criteria andSManualNoRefGreaterThanOrEqualTo(String value) {
            addCriterion("sManualNoRef >=", value, "sManualNoRef");
            return (Criteria) this;
        }
        public Criteria andSManualNoRefLessThan(String value) {
            addCriterion("sManualNoRef <", value, "sManualNoRef");
            return (Criteria) this;
        }
        public Criteria andSManualNoRefLessThanOrEqualTo(String value) {
            addCriterion("sManualNoRef <=", value, "sManualNoRef");
            return (Criteria) this;
        }
        public Criteria andSManualNoRefLike(String value) {
            addCriterion("sManualNoRef like", value, "sManualNoRef");
            return (Criteria) this;
        }
        public Criteria andSManualNoRefNotLike(String value) {
            addCriterion("sManualNoRef not like", value, "sManualNoRef");
            return (Criteria) this;
        }
        public Criteria andSManualNoRefIn(List<String> values) {
            addCriterion("sManualNoRef in", values, "sManualNoRef");
            return (Criteria) this;
        }
        public Criteria andSManualNoRefNotIn(List<String> values) {
            addCriterion("sManualNoRef not in", values, "sManualNoRef");
            return (Criteria) this;
        }
        public Criteria andSManualNoRefBetween(String value1, String value2) {
            addCriterion("sManualNoRef between", value1, value2, "sManualNoRef");
            return (Criteria) this;
        }
        public Criteria andSManualNoRefNotBetween(String value1, String value2) {
            addCriterion("sManualNoRef not between", value1, value2, "sManualNoRef");
            return (Criteria) this;
        }
        public Criteria andSBondedWarehouseNoIsNull() {
            addCriterion("sBondedWarehouseNo is null");
            return (Criteria) this;
        }
        public Criteria andSBondedWarehouseNoIsNotNull() {
            addCriterion("sBondedWarehouseNo is not null");
            return (Criteria) this;
        }
        public Criteria andSBondedWarehouseNoEqualTo(String value) {
            addCriterion("sBondedWarehouseNo =", value, "sBondedWarehouseNo");
            return (Criteria) this;
        }
        public Criteria andSBondedWarehouseNoNotEqualTo(String value) {
            addCriterion("sBondedWarehouseNo <>", value, "sBondedWarehouseNo");
            return (Criteria) this;
        }
        public Criteria andSBondedWarehouseNoGreaterThan(String value) {
            addCriterion("sBondedWarehouseNo >", value, "sBondedWarehouseNo");
            return (Criteria) this;
        }
        public Criteria andSBondedWarehouseNoGreaterThanOrEqualTo(String value) {
            addCriterion("sBondedWarehouseNo >=", value, "sBondedWarehouseNo");
            return (Criteria) this;
        }
        public Criteria andSBondedWarehouseNoLessThan(String value) {
            addCriterion("sBondedWarehouseNo <", value, "sBondedWarehouseNo");
            return (Criteria) this;
        }
        public Criteria andSBondedWarehouseNoLessThanOrEqualTo(String value) {
            addCriterion("sBondedWarehouseNo <=", value, "sBondedWarehouseNo");
            return (Criteria) this;
        }
        public Criteria andSBondedWarehouseNoLike(String value) {
            addCriterion("sBondedWarehouseNo like", value, "sBondedWarehouseNo");
            return (Criteria) this;
        }
        public Criteria andSBondedWarehouseNoNotLike(String value) {
            addCriterion("sBondedWarehouseNo not like", value, "sBondedWarehouseNo");
            return (Criteria) this;
        }
        public Criteria andSBondedWarehouseNoIn(List<String> values) {
            addCriterion("sBondedWarehouseNo in", values, "sBondedWarehouseNo");
            return (Criteria) this;
        }
        public Criteria andSBondedWarehouseNoNotIn(List<String> values) {
            addCriterion("sBondedWarehouseNo not in", values, "sBondedWarehouseNo");
            return (Criteria) this;
        }
        public Criteria andSBondedWarehouseNoBetween(String value1, String value2) {
            addCriterion("sBondedWarehouseNo between", value1, value2, "sBondedWarehouseNo");
            return (Criteria) this;
        }
        public Criteria andSBondedWarehouseNoNotBetween(String value1, String value2) {
            addCriterion("sBondedWarehouseNo not between", value1, value2, "sBondedWarehouseNo");
            return (Criteria) this;
        }
        public Criteria andSPaperlessDeclareIsNull() {
            addCriterion("sPaperlessDeclare is null");
            return (Criteria) this;
        }
        public Criteria andSPaperlessDeclareIsNotNull() {
            addCriterion("sPaperlessDeclare is not null");
            return (Criteria) this;
        }
        public Criteria andSPaperlessDeclareEqualTo(String value) {
            addCriterion("sPaperlessDeclare =", value, "sPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andSPaperlessDeclareNotEqualTo(String value) {
            addCriterion("sPaperlessDeclare <>", value, "sPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andSPaperlessDeclareGreaterThan(String value) {
            addCriterion("sPaperlessDeclare >", value, "sPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andSPaperlessDeclareGreaterThanOrEqualTo(String value) {
            addCriterion("sPaperlessDeclare >=", value, "sPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andSPaperlessDeclareLessThan(String value) {
            addCriterion("sPaperlessDeclare <", value, "sPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andSPaperlessDeclareLessThanOrEqualTo(String value) {
            addCriterion("sPaperlessDeclare <=", value, "sPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andSPaperlessDeclareLike(String value) {
            addCriterion("sPaperlessDeclare like", value, "sPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andSPaperlessDeclareNotLike(String value) {
            addCriterion("sPaperlessDeclare not like", value, "sPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andSPaperlessDeclareIn(List<String> values) {
            addCriterion("sPaperlessDeclare in", values, "sPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andSPaperlessDeclareNotIn(List<String> values) {
            addCriterion("sPaperlessDeclare not in", values, "sPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andSPaperlessDeclareBetween(String value1, String value2) {
            addCriterion("sPaperlessDeclare between", value1, value2, "sPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andSPaperlessDeclareNotBetween(String value1, String value2) {
            addCriterion("sPaperlessDeclare not between", value1, value2, "sPaperlessDeclare");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeCodeIsNull() {
            addCriterion("sCustomsDeclarationTypeCode is null");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeCodeIsNotNull() {
            addCriterion("sCustomsDeclarationTypeCode is not null");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeCodeEqualTo(String value) {
            addCriterion("sCustomsDeclarationTypeCode =", value, "sCustomsDeclarationTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeCodeNotEqualTo(String value) {
            addCriterion("sCustomsDeclarationTypeCode <>", value, "sCustomsDeclarationTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeCodeGreaterThan(String value) {
            addCriterion("sCustomsDeclarationTypeCode >", value, "sCustomsDeclarationTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("sCustomsDeclarationTypeCode >=", value, "sCustomsDeclarationTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeCodeLessThan(String value) {
            addCriterion("sCustomsDeclarationTypeCode <", value, "sCustomsDeclarationTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeCodeLessThanOrEqualTo(String value) {
            addCriterion("sCustomsDeclarationTypeCode <=", value, "sCustomsDeclarationTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeCodeLike(String value) {
            addCriterion("sCustomsDeclarationTypeCode like", value, "sCustomsDeclarationTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeCodeNotLike(String value) {
            addCriterion("sCustomsDeclarationTypeCode not like", value, "sCustomsDeclarationTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeCodeIn(List<String> values) {
            addCriterion("sCustomsDeclarationTypeCode in", values, "sCustomsDeclarationTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeCodeNotIn(List<String> values) {
            addCriterion("sCustomsDeclarationTypeCode not in", values, "sCustomsDeclarationTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeCodeBetween(String value1, String value2) {
            addCriterion("sCustomsDeclarationTypeCode between", value1, value2, "sCustomsDeclarationTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeCodeNotBetween(String value1, String value2) {
            addCriterion("sCustomsDeclarationTypeCode not between", value1, value2, "sCustomsDeclarationTypeCode");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeNameIsNull() {
            addCriterion("sCustomsDeclarationTypeName is null");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeNameIsNotNull() {
            addCriterion("sCustomsDeclarationTypeName is not null");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeNameEqualTo(String value) {
            addCriterion("sCustomsDeclarationTypeName =", value, "sCustomsDeclarationTypeName");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeNameNotEqualTo(String value) {
            addCriterion("sCustomsDeclarationTypeName <>", value, "sCustomsDeclarationTypeName");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeNameGreaterThan(String value) {
            addCriterion("sCustomsDeclarationTypeName >", value, "sCustomsDeclarationTypeName");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("sCustomsDeclarationTypeName >=", value, "sCustomsDeclarationTypeName");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeNameLessThan(String value) {
            addCriterion("sCustomsDeclarationTypeName <", value, "sCustomsDeclarationTypeName");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeNameLessThanOrEqualTo(String value) {
            addCriterion("sCustomsDeclarationTypeName <=", value, "sCustomsDeclarationTypeName");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeNameLike(String value) {
            addCriterion("sCustomsDeclarationTypeName like", value, "sCustomsDeclarationTypeName");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeNameNotLike(String value) {
            addCriterion("sCustomsDeclarationTypeName not like", value, "sCustomsDeclarationTypeName");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeNameIn(List<String> values) {
            addCriterion("sCustomsDeclarationTypeName in", values, "sCustomsDeclarationTypeName");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeNameNotIn(List<String> values) {
            addCriterion("sCustomsDeclarationTypeName not in", values, "sCustomsDeclarationTypeName");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeNameBetween(String value1, String value2) {
            addCriterion("sCustomsDeclarationTypeName between", value1, value2, "sCustomsDeclarationTypeName");
            return (Criteria) this;
        }
        public Criteria andSCustomsDeclarationTypeNameNotBetween(String value1, String value2) {
            addCriterion("sCustomsDeclarationTypeName not between", value1, value2, "sCustomsDeclarationTypeName");
            return (Criteria) this;
        }
        public Criteria andSTariffNameIsNull() {
            addCriterion("sTariffName is null");
            return (Criteria) this;
        }
        public Criteria andSTariffNameIsNotNull() {
            addCriterion("sTariffName is not null");
            return (Criteria) this;
        }
        public Criteria andSTariffNameEqualTo(String value) {
            addCriterion("sTariffName =", value, "sTariffName");
            return (Criteria) this;
        }
        public Criteria andSTariffNameNotEqualTo(String value) {
            addCriterion("sTariffName <>", value, "sTariffName");
            return (Criteria) this;
        }
        public Criteria andSTariffNameGreaterThan(String value) {
            addCriterion("sTariffName >", value, "sTariffName");
            return (Criteria) this;
        }
        public Criteria andSTariffNameGreaterThanOrEqualTo(String value) {
            addCriterion("sTariffName >=", value, "sTariffName");
            return (Criteria) this;
        }
        public Criteria andSTariffNameLessThan(String value) {
            addCriterion("sTariffName <", value, "sTariffName");
            return (Criteria) this;
        }
        public Criteria andSTariffNameLessThanOrEqualTo(String value) {
            addCriterion("sTariffName <=", value, "sTariffName");
            return (Criteria) this;
        }
        public Criteria andSTariffNameLike(String value) {
            addCriterion("sTariffName like", value, "sTariffName");
            return (Criteria) this;
        }
        public Criteria andSTariffNameNotLike(String value) {
            addCriterion("sTariffName not like", value, "sTariffName");
            return (Criteria) this;
        }
        public Criteria andSTariffNameIn(List<String> values) {
            addCriterion("sTariffName in", values, "sTariffName");
            return (Criteria) this;
        }
        public Criteria andSTariffNameNotIn(List<String> values) {
            addCriterion("sTariffName not in", values, "sTariffName");
            return (Criteria) this;
        }
        public Criteria andSTariffNameBetween(String value1, String value2) {
            addCriterion("sTariffName between", value1, value2, "sTariffName");
            return (Criteria) this;
        }
        public Criteria andSTariffNameNotBetween(String value1, String value2) {
            addCriterion("sTariffName not between", value1, value2, "sTariffName");
            return (Criteria) this;
        }
        public Criteria andIPriorityLevelIsNull() {
            addCriterion("iPriorityLevel is null");
            return (Criteria) this;
        }
        public Criteria andIPriorityLevelIsNotNull() {
            addCriterion("iPriorityLevel is not null");
            return (Criteria) this;
        }
        public Criteria andIPriorityLevelEqualTo(Integer value) {
            addCriterion("iPriorityLevel =", value, "iPriorityLevel");
            return (Criteria) this;
        }
        public Criteria andIPriorityLevelNotEqualTo(Integer value) {
            addCriterion("iPriorityLevel <>", value, "iPriorityLevel");
            return (Criteria) this;
        }
        public Criteria andIPriorityLevelGreaterThan(Integer value) {
            addCriterion("iPriorityLevel >", value, "iPriorityLevel");
            return (Criteria) this;
        }
        public Criteria andIPriorityLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("iPriorityLevel >=", value, "iPriorityLevel");
            return (Criteria) this;
        }
        public Criteria andIPriorityLevelLessThan(Integer value) {
            addCriterion("iPriorityLevel <", value, "iPriorityLevel");
            return (Criteria) this;
        }
        public Criteria andIPriorityLevelLessThanOrEqualTo(Integer value) {
            addCriterion("iPriorityLevel <=", value, "iPriorityLevel");
            return (Criteria) this;
        }
        public Criteria andIPriorityLevelIn(List<Integer> values) {
            addCriterion("iPriorityLevel in", values, "iPriorityLevel");
            return (Criteria) this;
        }
        public Criteria andIPriorityLevelNotIn(List<Integer> values) {
            addCriterion("iPriorityLevel not in", values, "iPriorityLevel");
            return (Criteria) this;
        }
        public Criteria andIPriorityLevelBetween(Integer value1, Integer value2) {
            addCriterion("iPriorityLevel between", value1, value2, "iPriorityLevel");
            return (Criteria) this;
        }
        public Criteria andIPriorityLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("iPriorityLevel not between", value1, value2, "iPriorityLevel");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;
        private Object value;
        private Object secondValue;
        private boolean noValue;
        private boolean singleValue;
        private boolean betweenValue;
        private boolean listValue;
        private String typeHandler;

        public String getCondition() {
            return condition;
        }
        public Object getValue() {
            return value;
        }
        public Object getSecondValue() {
            return secondValue;
        }
        public boolean isNoValue() {
            return noValue;
        }
        public boolean isSingleValue() {
            return singleValue;
        }
        public boolean isBetweenValue() {
            return betweenValue;
        }
        public boolean isListValue() {
            return listValue;
        }
        public String getTypeHandler() {
            return typeHandler;
        }
        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }
        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }
        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }
        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }
        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}