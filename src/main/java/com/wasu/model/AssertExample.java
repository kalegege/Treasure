package com.wasu.model;

import java.math.BigDecimal;
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
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

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(Short value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(Short value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(Short value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(Short value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(Short value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(Short value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<Short> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<Short> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(Short value1, Short value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(Short value1, Short value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
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

        public Criteria andNumbersEqualTo(Integer value) {
            addCriterion("NUMBERS =", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotEqualTo(Integer value) {
            addCriterion("NUMBERS <>", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThan(Integer value) {
            addCriterion("NUMBERS >", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUMBERS >=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThan(Integer value) {
            addCriterion("NUMBERS <", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersLessThanOrEqualTo(Integer value) {
            addCriterion("NUMBERS <=", value, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersIn(List<Integer> values) {
            addCriterion("NUMBERS in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotIn(List<Integer> values) {
            addCriterion("NUMBERS not in", values, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersBetween(Integer value1, Integer value2) {
            addCriterion("NUMBERS between", value1, value2, "numbers");
            return (Criteria) this;
        }

        public Criteria andNumbersNotBetween(Integer value1, Integer value2) {
            addCriterion("NUMBERS not between", value1, value2, "numbers");
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

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("PRICE =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("PRICE <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("PRICE >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("PRICE <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICE <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("PRICE in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("PRICE not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICE not between", value1, value2, "price");
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

        public Criteria andStateEqualTo(Short value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Short value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Short value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Short value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Short value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Short value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Short> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Short> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Short value1, Short value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Short value1, Short value2) {
            addCriterion("STATE not between", value1, value2, "state");
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

        public Criteria andValidIsNull() {
            addCriterion("VALID is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("VALID is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(Short value) {
            addCriterion("VALID =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(Short value) {
            addCriterion("VALID <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(Short value) {
            addCriterion("VALID >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(Short value) {
            addCriterion("VALID >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(Short value) {
            addCriterion("VALID <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(Short value) {
            addCriterion("VALID <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<Short> values) {
            addCriterion("VALID in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<Short> values) {
            addCriterion("VALID not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(Short value1, Short value2) {
            addCriterion("VALID between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(Short value1, Short value2) {
            addCriterion("VALID not between", value1, value2, "valid");
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

        public Criteria andGuaranteeEqualTo(Short value) {
            addCriterion("GUARANTEE =", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotEqualTo(Short value) {
            addCriterion("GUARANTEE <>", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeGreaterThan(Short value) {
            addCriterion("GUARANTEE >", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeGreaterThanOrEqualTo(Short value) {
            addCriterion("GUARANTEE >=", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeLessThan(Short value) {
            addCriterion("GUARANTEE <", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeLessThanOrEqualTo(Short value) {
            addCriterion("GUARANTEE <=", value, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeIn(List<Short> values) {
            addCriterion("GUARANTEE in", values, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotIn(List<Short> values) {
            addCriterion("GUARANTEE not in", values, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeBetween(Short value1, Short value2) {
            addCriterion("GUARANTEE between", value1, value2, "guarantee");
            return (Criteria) this;
        }

        public Criteria andGuaranteeNotBetween(Short value1, Short value2) {
            addCriterion("GUARANTEE not between", value1, value2, "guarantee");
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

        public Criteria andLifeperiodsEqualTo(Short value) {
            addCriterion("LIFEPERIODS =", value, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsNotEqualTo(Short value) {
            addCriterion("LIFEPERIODS <>", value, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsGreaterThan(Short value) {
            addCriterion("LIFEPERIODS >", value, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsGreaterThanOrEqualTo(Short value) {
            addCriterion("LIFEPERIODS >=", value, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsLessThan(Short value) {
            addCriterion("LIFEPERIODS <", value, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsLessThanOrEqualTo(Short value) {
            addCriterion("LIFEPERIODS <=", value, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsIn(List<Short> values) {
            addCriterion("LIFEPERIODS in", values, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsNotIn(List<Short> values) {
            addCriterion("LIFEPERIODS not in", values, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsBetween(Short value1, Short value2) {
            addCriterion("LIFEPERIODS between", value1, value2, "lifeperiods");
            return (Criteria) this;
        }

        public Criteria andLifeperiodsNotBetween(Short value1, Short value2) {
            addCriterion("LIFEPERIODS not between", value1, value2, "lifeperiods");
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

        public Criteria andPeriodsusedEqualTo(Short value) {
            addCriterion("PERIODSUSED =", value, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedNotEqualTo(Short value) {
            addCriterion("PERIODSUSED <>", value, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedGreaterThan(Short value) {
            addCriterion("PERIODSUSED >", value, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedGreaterThanOrEqualTo(Short value) {
            addCriterion("PERIODSUSED >=", value, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedLessThan(Short value) {
            addCriterion("PERIODSUSED <", value, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedLessThanOrEqualTo(Short value) {
            addCriterion("PERIODSUSED <=", value, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedIn(List<Short> values) {
            addCriterion("PERIODSUSED in", values, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedNotIn(List<Short> values) {
            addCriterion("PERIODSUSED not in", values, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedBetween(Short value1, Short value2) {
            addCriterion("PERIODSUSED between", value1, value2, "periodsused");
            return (Criteria) this;
        }

        public Criteria andPeriodsusedNotBetween(Short value1, Short value2) {
            addCriterion("PERIODSUSED not between", value1, value2, "periodsused");
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