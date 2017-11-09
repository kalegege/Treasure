package com.wasu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AssertExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AssertExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andAssetcodeIsNull() {
            addCriterion("ASSETCODE is null");
            return (Criteria) this;
        }

        public Criteria andAssetcodeIsNotNull() {
            addCriterion("ASSETCODE is not null");
            return (Criteria) this;
        }

        public Criteria andAssetcodeEqualTo(String value) {
            addCriterion("ASSETCODE =", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeNotEqualTo(String value) {
            addCriterion("ASSETCODE <>", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeGreaterThan(String value) {
            addCriterion("ASSETCODE >", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeGreaterThanOrEqualTo(String value) {
            addCriterion("ASSETCODE >=", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeLessThan(String value) {
            addCriterion("ASSETCODE <", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeLessThanOrEqualTo(String value) {
            addCriterion("ASSETCODE <=", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeLike(String value) {
            addCriterion("ASSETCODE like", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeNotLike(String value) {
            addCriterion("ASSETCODE not like", value, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeIn(List<String> values) {
            addCriterion("ASSETCODE in", values, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeNotIn(List<String> values) {
            addCriterion("ASSETCODE not in", values, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeBetween(String value1, String value2) {
            addCriterion("ASSETCODE between", value1, value2, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAssetcodeNotBetween(String value1, String value2) {
            addCriterion("ASSETCODE not between", value1, value2, "assetcode");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAssetsortnameIsNull() {
            addCriterion("ASSETSORTNAME is null");
            return (Criteria) this;
        }

        public Criteria andAssetsortnameIsNotNull() {
            addCriterion("ASSETSORTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andAssetsortnameEqualTo(String value) {
            addCriterion("ASSETSORTNAME =", value, "assetsortname");
            return (Criteria) this;
        }

        public Criteria andAssetsortnameNotEqualTo(String value) {
            addCriterion("ASSETSORTNAME <>", value, "assetsortname");
            return (Criteria) this;
        }

        public Criteria andAssetsortnameGreaterThan(String value) {
            addCriterion("ASSETSORTNAME >", value, "assetsortname");
            return (Criteria) this;
        }

        public Criteria andAssetsortnameGreaterThanOrEqualTo(String value) {
            addCriterion("ASSETSORTNAME >=", value, "assetsortname");
            return (Criteria) this;
        }

        public Criteria andAssetsortnameLessThan(String value) {
            addCriterion("ASSETSORTNAME <", value, "assetsortname");
            return (Criteria) this;
        }

        public Criteria andAssetsortnameLessThanOrEqualTo(String value) {
            addCriterion("ASSETSORTNAME <=", value, "assetsortname");
            return (Criteria) this;
        }

        public Criteria andAssetsortnameLike(String value) {
            addCriterion("ASSETSORTNAME like", value, "assetsortname");
            return (Criteria) this;
        }

        public Criteria andAssetsortnameNotLike(String value) {
            addCriterion("ASSETSORTNAME not like", value, "assetsortname");
            return (Criteria) this;
        }

        public Criteria andAssetsortnameIn(List<String> values) {
            addCriterion("ASSETSORTNAME in", values, "assetsortname");
            return (Criteria) this;
        }

        public Criteria andAssetsortnameNotIn(List<String> values) {
            addCriterion("ASSETSORTNAME not in", values, "assetsortname");
            return (Criteria) this;
        }

        public Criteria andAssetsortnameBetween(String value1, String value2) {
            addCriterion("ASSETSORTNAME between", value1, value2, "assetsortname");
            return (Criteria) this;
        }

        public Criteria andAssetsortnameNotBetween(String value1, String value2) {
            addCriterion("ASSETSORTNAME not between", value1, value2, "assetsortname");
            return (Criteria) this;
        }

        public Criteria andBuydateIsNull() {
            addCriterion("BUYDATE is null");
            return (Criteria) this;
        }

        public Criteria andBuydateIsNotNull() {
            addCriterion("BUYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBuydateEqualTo(Date value) {
            addCriterionForJDBCDate("BUYDATE =", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("BUYDATE <>", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateGreaterThan(Date value) {
            addCriterionForJDBCDate("BUYDATE >", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BUYDATE >=", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLessThan(Date value) {
            addCriterionForJDBCDate("BUYDATE <", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("BUYDATE <=", value, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateIn(List<Date> values) {
            addCriterionForJDBCDate("BUYDATE in", values, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("BUYDATE not in", values, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BUYDATE between", value1, value2, "buydate");
            return (Criteria) this;
        }

        public Criteria andBuydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("BUYDATE not between", value1, value2, "buydate");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("DEPTNAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("DEPTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("DEPTNAME =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("DEPTNAME <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("DEPTNAME >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPTNAME >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("DEPTNAME <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("DEPTNAME <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("DEPTNAME like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("DEPTNAME not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("DEPTNAME in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("DEPTNAME not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("DEPTNAME between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("DEPTNAME not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDetailedlocationIsNull() {
            addCriterion("DETAILEDLOCATION is null");
            return (Criteria) this;
        }

        public Criteria andDetailedlocationIsNotNull() {
            addCriterion("DETAILEDLOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andDetailedlocationEqualTo(String value) {
            addCriterion("DETAILEDLOCATION =", value, "detailedlocation");
            return (Criteria) this;
        }

        public Criteria andDetailedlocationNotEqualTo(String value) {
            addCriterion("DETAILEDLOCATION <>", value, "detailedlocation");
            return (Criteria) this;
        }

        public Criteria andDetailedlocationGreaterThan(String value) {
            addCriterion("DETAILEDLOCATION >", value, "detailedlocation");
            return (Criteria) this;
        }

        public Criteria andDetailedlocationGreaterThanOrEqualTo(String value) {
            addCriterion("DETAILEDLOCATION >=", value, "detailedlocation");
            return (Criteria) this;
        }

        public Criteria andDetailedlocationLessThan(String value) {
            addCriterion("DETAILEDLOCATION <", value, "detailedlocation");
            return (Criteria) this;
        }

        public Criteria andDetailedlocationLessThanOrEqualTo(String value) {
            addCriterion("DETAILEDLOCATION <=", value, "detailedlocation");
            return (Criteria) this;
        }

        public Criteria andDetailedlocationLike(String value) {
            addCriterion("DETAILEDLOCATION like", value, "detailedlocation");
            return (Criteria) this;
        }

        public Criteria andDetailedlocationNotLike(String value) {
            addCriterion("DETAILEDLOCATION not like", value, "detailedlocation");
            return (Criteria) this;
        }

        public Criteria andDetailedlocationIn(List<String> values) {
            addCriterion("DETAILEDLOCATION in", values, "detailedlocation");
            return (Criteria) this;
        }

        public Criteria andDetailedlocationNotIn(List<String> values) {
            addCriterion("DETAILEDLOCATION not in", values, "detailedlocation");
            return (Criteria) this;
        }

        public Criteria andDetailedlocationBetween(String value1, String value2) {
            addCriterion("DETAILEDLOCATION between", value1, value2, "detailedlocation");
            return (Criteria) this;
        }

        public Criteria andDetailedlocationNotBetween(String value1, String value2) {
            addCriterion("DETAILEDLOCATION not between", value1, value2, "detailedlocation");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIsNull() {
            addCriterion("GUARANTEE is null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIsNotNull() {
            addCriterion("GUARANTEE is not null");
            return (Criteria) this;
        }

        public Criteria andGuaranteeEqualTo(Long value) {
            addCriterion("GUARANTEE =", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotEqualTo(Long value) {
            addCriterion("GUARANTEE <>", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeGreaterThan(Long value) {
            addCriterion("GUARANTEE >", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeGreaterThanOrEqualTo(Long value) {
            addCriterion("GUARANTEE >=", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeLessThan(Long value) {
            addCriterion("GUARANTEE <", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeLessThanOrEqualTo(Long value) {
            addCriterion("GUARANTEE <=", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIn(List<Long> values) {
            addCriterion("GUARANTEE in", values, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotIn(List<Long> values) {
            addCriterion("GUARANTEE not in", values, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeBetween(Long value1, Long value2) {
            addCriterion("GUARANTEE between", value1, value2, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotBetween(Long value1, Long value2) {
            addCriterion("GUARANTEE not between", value1, value2, "guarantee");
            return (Criteria) this;
        }

        public Criteria andInventorydateIsNull() {
            addCriterion("INVENTORYDATE is null");
            return (Criteria) this;
        }

        public Criteria andInventorydateIsNotNull() {
            addCriterion("INVENTORYDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInventorydateEqualTo(Date value) {
            addCriterionForJDBCDate("INVENTORYDATE =", value, "inventorydate");
            return (Criteria) this;
        }

        public Criteria andInventorydateNotEqualTo(Date value) {
            addCriterionForJDBCDate("INVENTORYDATE <>", value, "inventorydate");
            return (Criteria) this;
        }

        public Criteria andInventorydateGreaterThan(Date value) {
            addCriterionForJDBCDate("INVENTORYDATE >", value, "inventorydate");
            return (Criteria) this;
        }

        public Criteria andInventorydateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INVENTORYDATE >=", value, "inventorydate");
            return (Criteria) this;
        }

        public Criteria andInventorydateLessThan(Date value) {
            addCriterionForJDBCDate("INVENTORYDATE <", value, "inventorydate");
            return (Criteria) this;
        }

        public Criteria andInventorydateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("INVENTORYDATE <=", value, "inventorydate");
            return (Criteria) this;
        }

        public Criteria andInventorydateIn(List<Date> values) {
            addCriterionForJDBCDate("INVENTORYDATE in", values, "inventorydate");
            return (Criteria) this;
        }

        public Criteria andInventorydateNotIn(List<Date> values) {
            addCriterionForJDBCDate("INVENTORYDATE not in", values, "inventorydate");
            return (Criteria) this;
        }

        public Criteria andInventorydateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INVENTORYDATE between", value1, value2, "inventorydate");
            return (Criteria) this;
        }

        public Criteria andInventorydateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("INVENTORYDATE not between", value1, value2, "inventorydate");
            return (Criteria) this;
        }

        public Criteria andInventorystateIsNull() {
            addCriterion("INVENTORYSTATE is null");
            return (Criteria) this;
        }

        public Criteria andInventorystateIsNotNull() {
            addCriterion("INVENTORYSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andInventorystateEqualTo(Long value) {
            addCriterion("INVENTORYSTATE =", value, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateNotEqualTo(Long value) {
            addCriterion("INVENTORYSTATE <>", value, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateGreaterThan(Long value) {
            addCriterion("INVENTORYSTATE >", value, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateGreaterThanOrEqualTo(Long value) {
            addCriterion("INVENTORYSTATE >=", value, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateLessThan(Long value) {
            addCriterion("INVENTORYSTATE <", value, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateLessThanOrEqualTo(Long value) {
            addCriterion("INVENTORYSTATE <=", value, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateIn(List<Long> values) {
            addCriterion("INVENTORYSTATE in", values, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateNotIn(List<Long> values) {
            addCriterion("INVENTORYSTATE not in", values, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateBetween(Long value1, Long value2) {
            addCriterion("INVENTORYSTATE between", value1, value2, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andInventorystateNotBetween(Long value1, Long value2) {
            addCriterion("INVENTORYSTATE not between", value1, value2, "inventorystate");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNull() {
            addCriterion("LATITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLatitudeIsNotNull() {
            addCriterion("LATITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLatitudeEqualTo(Long value) {
            addCriterion("LATITUDE =", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotEqualTo(Long value) {
            addCriterion("LATITUDE <>", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThan(Long value) {
            addCriterion("LATITUDE >", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeGreaterThanOrEqualTo(Long value) {
            addCriterion("LATITUDE >=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThan(Long value) {
            addCriterion("LATITUDE <", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeLessThanOrEqualTo(Long value) {
            addCriterion("LATITUDE <=", value, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeIn(List<Long> values) {
            addCriterion("LATITUDE in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotIn(List<Long> values) {
            addCriterion("LATITUDE not in", values, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeBetween(Long value1, Long value2) {
            addCriterion("LATITUDE between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLatitudeNotBetween(Long value1, Long value2) {
            addCriterion("LATITUDE not between", value1, value2, "latitude");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsIsNull() {
            addCriterion("LIFEPERIODS is null");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsIsNotNull() {
            addCriterion("LIFEPERIODS is not null");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsEqualTo(Long value) {
            addCriterion("LIFEPERIODS =", value, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsNotEqualTo(Long value) {
            addCriterion("LIFEPERIODS <>", value, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsGreaterThan(Long value) {
            addCriterion("LIFEPERIODS >", value, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsGreaterThanOrEqualTo(Long value) {
            addCriterion("LIFEPERIODS >=", value, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsLessThan(Long value) {
            addCriterion("LIFEPERIODS <", value, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsLessThanOrEqualTo(Long value) {
            addCriterion("LIFEPERIODS <=", value, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsIn(List<Long> values) {
            addCriterion("LIFEPERIODS in", values, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsNotIn(List<Long> values) {
            addCriterion("LIFEPERIODS not in", values, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsBetween(Long value1, Long value2) {
            addCriterion("LIFEPERIODS between", value1, value2, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsNotBetween(Long value1, Long value2) {
            addCriterion("LIFEPERIODS not between", value1, value2, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNull() {
            addCriterion("LONGITUDE is null");
            return (Criteria) this;
        }

        public Criteria andLongitudeIsNotNull() {
            addCriterion("LONGITUDE is not null");
            return (Criteria) this;
        }

        public Criteria andLongitudeEqualTo(Long value) {
            addCriterion("LONGITUDE =", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotEqualTo(Long value) {
            addCriterion("LONGITUDE <>", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThan(Long value) {
            addCriterion("LONGITUDE >", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeGreaterThanOrEqualTo(Long value) {
            addCriterion("LONGITUDE >=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThan(Long value) {
            addCriterion("LONGITUDE <", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeLessThanOrEqualTo(Long value) {
            addCriterion("LONGITUDE <=", value, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeIn(List<Long> values) {
            addCriterion("LONGITUDE in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotIn(List<Long> values) {
            addCriterion("LONGITUDE not in", values, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeBetween(Long value1, Long value2) {
            addCriterion("LONGITUDE between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andLongitudeNotBetween(Long value1, Long value2) {
            addCriterion("LONGITUDE not between", value1, value2, "longitude");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNull() {
            addCriterion("MANUFACTURER is null");
            return (Criteria) this;
        }

        public Criteria andManufacturerIsNotNull() {
            addCriterion("MANUFACTURER is not null");
            return (Criteria) this;
        }

        public Criteria andManufacturerEqualTo(String value) {
            addCriterion("MANUFACTURER =", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotEqualTo(String value) {
            addCriterion("MANUFACTURER <>", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThan(String value) {
            addCriterion("MANUFACTURER >", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerGreaterThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER >=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThan(String value) {
            addCriterion("MANUFACTURER <", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLessThanOrEqualTo(String value) {
            addCriterion("MANUFACTURER <=", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerLike(String value) {
            addCriterion("MANUFACTURER like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotLike(String value) {
            addCriterion("MANUFACTURER not like", value, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerIn(List<String> values) {
            addCriterion("MANUFACTURER in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotIn(List<String> values) {
            addCriterion("MANUFACTURER not in", values, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerBetween(String value1, String value2) {
            addCriterion("MANUFACTURER between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andManufacturerNotBetween(String value1, String value2) {
            addCriterion("MANUFACTURER not between", value1, value2, "manufacturer");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNormsIsNull() {
            addCriterion("NORMS is null");
            return (Criteria) this;
        }

        public Criteria andNormsIsNotNull() {
            addCriterion("NORMS is not null");
            return (Criteria) this;
        }

        public Criteria andNormsEqualTo(String value) {
            addCriterion("NORMS =", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotEqualTo(String value) {
            addCriterion("NORMS <>", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsGreaterThan(String value) {
            addCriterion("NORMS >", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsGreaterThanOrEqualTo(String value) {
            addCriterion("NORMS >=", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsLessThan(String value) {
            addCriterion("NORMS <", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsLessThanOrEqualTo(String value) {
            addCriterion("NORMS <=", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsLike(String value) {
            addCriterion("NORMS like", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotLike(String value) {
            addCriterion("NORMS not like", value, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsIn(List<String> values) {
            addCriterion("NORMS in", values, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotIn(List<String> values) {
            addCriterion("NORMS not in", values, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsBetween(String value1, String value2) {
            addCriterion("NORMS between", value1, value2, "norms");
            return (Criteria) this;
        }

        public Criteria andNormsNotBetween(String value1, String value2) {
            addCriterion("NORMS not between", value1, value2, "norms");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNull() {
            addCriterion("NUMBERS is null");
            return (Criteria) this;
        }

        public Criteria andNumbersIsNotNull() {
            addCriterion("NUMBERS is not null");
            return (Criteria) this;
        }

        public Criteria andNumbersEqualTo(Long value) {
            addCriterion("NUMBERS =", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotEqualTo(Long value) {
            addCriterion("NUMBERS <>", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThan(Long value) {
            addCriterion("NUMBERS >", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThanOrEqualTo(Long value) {
            addCriterion("NUMBERS >=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThan(Long value) {
            addCriterion("NUMBERS <", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThanOrEqualTo(Long value) {
            addCriterion("NUMBERS <=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersIn(List<Long> values) {
            addCriterion("NUMBERS in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotIn(List<Long> values) {
            addCriterion("NUMBERS not in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersBetween(Long value1, Long value2) {
            addCriterion("NUMBERS between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotBetween(Long value1, Long value2) {
            addCriterion("NUMBERS not between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedIsNull() {
            addCriterion("PERIODSUSED is null");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedIsNotNull() {
            addCriterion("PERIODSUSED is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedEqualTo(Long value) {
            addCriterion("PERIODSUSED =", value, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedNotEqualTo(Long value) {
            addCriterion("PERIODSUSED <>", value, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedGreaterThan(Long value) {
            addCriterion("PERIODSUSED >", value, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedGreaterThanOrEqualTo(Long value) {
            addCriterion("PERIODSUSED >=", value, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedLessThan(Long value) {
            addCriterion("PERIODSUSED <", value, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedLessThanOrEqualTo(Long value) {
            addCriterion("PERIODSUSED <=", value, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedIn(List<Long> values) {
            addCriterion("PERIODSUSED in", values, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedNotIn(List<Long> values) {
            addCriterion("PERIODSUSED not in", values, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedBetween(Long value1, Long value2) {
            addCriterion("PERIODSUSED between", value1, value2, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedNotBetween(Long value1, Long value2) {
            addCriterion("PERIODSUSED not between", value1, value2, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNull() {
            addCriterion("PHOTO is null");
            return (Criteria) this;
        }

        public Criteria andPhotoIsNotNull() {
            addCriterion("PHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andPhotoEqualTo(String value) {
            addCriterion("PHOTO =", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotEqualTo(String value) {
            addCriterion("PHOTO <>", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThan(String value) {
            addCriterion("PHOTO >", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoGreaterThanOrEqualTo(String value) {
            addCriterion("PHOTO >=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThan(String value) {
            addCriterion("PHOTO <", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLessThanOrEqualTo(String value) {
            addCriterion("PHOTO <=", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoLike(String value) {
            addCriterion("PHOTO like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotLike(String value) {
            addCriterion("PHOTO not like", value, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoIn(List<String> values) {
            addCriterion("PHOTO in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotIn(List<String> values) {
            addCriterion("PHOTO not in", values, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoBetween(String value1, String value2) {
            addCriterion("PHOTO between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPhotoNotBetween(String value1, String value2) {
            addCriterion("PHOTO not between", value1, value2, "photo");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNull() {
            addCriterion("PLACE is null");
            return (Criteria) this;
        }

        public Criteria andPlaceIsNotNull() {
            addCriterion("PLACE is not null");
            return (Criteria) this;
        }

        public Criteria andPlaceEqualTo(String value) {
            addCriterion("PLACE =", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotEqualTo(String value) {
            addCriterion("PLACE <>", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThan(String value) {
            addCriterion("PLACE >", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("PLACE >=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThan(String value) {
            addCriterion("PLACE <", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLessThanOrEqualTo(String value) {
            addCriterion("PLACE <=", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceLike(String value) {
            addCriterion("PLACE like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotLike(String value) {
            addCriterion("PLACE not like", value, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceIn(List<String> values) {
            addCriterion("PLACE in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotIn(List<String> values) {
            addCriterion("PLACE not in", values, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceBetween(String value1, String value2) {
            addCriterion("PLACE between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPlaceNotBetween(String value1, String value2) {
            addCriterion("PLACE not between", value1, value2, "place");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("PRICE is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(Long value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Long value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Long value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Long value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Long value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Long value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Long> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Long> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Long value1, Long value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Long value1, Long value2) {
            addCriterion("PRICE not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNull() {
            addCriterion("PROJECTID is null");
            return (Criteria) this;
        }

        public Criteria andProjectidIsNotNull() {
            addCriterion("PROJECTID is not null");
            return (Criteria) this;
        }

        public Criteria andProjectidEqualTo(String value) {
            addCriterion("PROJECTID =", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotEqualTo(String value) {
            addCriterion("PROJECTID <>", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThan(String value) {
            addCriterion("PROJECTID >", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTID >=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThan(String value) {
            addCriterion("PROJECTID <", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLessThanOrEqualTo(String value) {
            addCriterion("PROJECTID <=", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidLike(String value) {
            addCriterion("PROJECTID like", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotLike(String value) {
            addCriterion("PROJECTID not like", value, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidIn(List<String> values) {
            addCriterion("PROJECTID in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotIn(List<String> values) {
            addCriterion("PROJECTID not in", values, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidBetween(String value1, String value2) {
            addCriterion("PROJECTID between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectidNotBetween(String value1, String value2) {
            addCriterion("PROJECTID not between", value1, value2, "projectid");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNull() {
            addCriterion("PROJECTNAME is null");
            return (Criteria) this;
        }

        public Criteria andProjectnameIsNotNull() {
            addCriterion("PROJECTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andProjectnameEqualTo(String value) {
            addCriterion("PROJECTNAME =", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotEqualTo(String value) {
            addCriterion("PROJECTNAME <>", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThan(String value) {
            addCriterion("PROJECTNAME >", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECTNAME >=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThan(String value) {
            addCriterion("PROJECTNAME <", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLessThanOrEqualTo(String value) {
            addCriterion("PROJECTNAME <=", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameLike(String value) {
            addCriterion("PROJECTNAME like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotLike(String value) {
            addCriterion("PROJECTNAME not like", value, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameIn(List<String> values) {
            addCriterion("PROJECTNAME in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotIn(List<String> values) {
            addCriterion("PROJECTNAME not in", values, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameBetween(String value1, String value2) {
            addCriterion("PROJECTNAME between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andProjectnameNotBetween(String value1, String value2) {
            addCriterion("PROJECTNAME not between", value1, value2, "projectname");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Long value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Long value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Long value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Long value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Long value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Long value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Long> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Long> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Long value1, Long value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Long value1, Long value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(Long value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(Long value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(Long value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(Long value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(Long value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(Long value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<Long> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<Long> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(Long value1, Long value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(Long value1, Long value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("VALID is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("VALID is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Long value) {
            addCriterion("VALID =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Long value) {
            addCriterion("VALID <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Long value) {
            addCriterion("VALID >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Long value) {
            addCriterion("VALID >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Long value) {
            addCriterion("VALID <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Long value) {
            addCriterion("VALID <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Long> values) {
            addCriterion("VALID in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Long> values) {
            addCriterion("VALID not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Long value1, Long value2) {
            addCriterion("VALID between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Long value1, Long value2) {
            addCriterion("VALID not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarkIsNull() {
            addCriterion("INVENTORY_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarkIsNotNull() {
            addCriterion("INVENTORY_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarkEqualTo(String value) {
            addCriterion("INVENTORY_REMARK =", value, "inventoryRemark");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarkNotEqualTo(String value) {
            addCriterion("INVENTORY_REMARK <>", value, "inventoryRemark");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarkGreaterThan(String value) {
            addCriterion("INVENTORY_REMARK >", value, "inventoryRemark");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY_REMARK >=", value, "inventoryRemark");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarkLessThan(String value) {
            addCriterion("INVENTORY_REMARK <", value, "inventoryRemark");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarkLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY_REMARK <=", value, "inventoryRemark");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarkLike(String value) {
            addCriterion("INVENTORY_REMARK like", value, "inventoryRemark");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarkNotLike(String value) {
            addCriterion("INVENTORY_REMARK not like", value, "inventoryRemark");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarkIn(List<String> values) {
            addCriterion("INVENTORY_REMARK in", values, "inventoryRemark");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarkNotIn(List<String> values) {
            addCriterion("INVENTORY_REMARK not in", values, "inventoryRemark");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarkBetween(String value1, String value2) {
            addCriterion("INVENTORY_REMARK between", value1, value2, "inventoryRemark");
            return (Criteria) this;
        }

        public Criteria andInventoryRemarkNotBetween(String value1, String value2) {
            addCriterion("INVENTORY_REMARK not between", value1, value2, "inventoryRemark");
            return (Criteria) this;
        }

        public Criteria andInventoryUserIsNull() {
            addCriterion("INVENTORY_USER is null");
            return (Criteria) this;
        }

        public Criteria andInventoryUserIsNotNull() {
            addCriterion("INVENTORY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryUserEqualTo(String value) {
            addCriterion("INVENTORY_USER =", value, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserNotEqualTo(String value) {
            addCriterion("INVENTORY_USER <>", value, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserGreaterThan(String value) {
            addCriterion("INVENTORY_USER >", value, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserGreaterThanOrEqualTo(String value) {
            addCriterion("INVENTORY_USER >=", value, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserLessThan(String value) {
            addCriterion("INVENTORY_USER <", value, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserLessThanOrEqualTo(String value) {
            addCriterion("INVENTORY_USER <=", value, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserLike(String value) {
            addCriterion("INVENTORY_USER like", value, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserNotLike(String value) {
            addCriterion("INVENTORY_USER not like", value, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserIn(List<String> values) {
            addCriterion("INVENTORY_USER in", values, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserNotIn(List<String> values) {
            addCriterion("INVENTORY_USER not in", values, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserBetween(String value1, String value2) {
            addCriterion("INVENTORY_USER between", value1, value2, "inventoryUser");
            return (Criteria) this;
        }

        public Criteria andInventoryUserNotBetween(String value1, String value2) {
            addCriterion("INVENTORY_USER not between", value1, value2, "inventoryUser");
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