package com.wasu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class InventoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InventoryExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAssetNumIsNull() {
            addCriterion("ASSET_NUM is null");
            return (Criteria) this;
        }

        public Criteria andAssetNumIsNotNull() {
            addCriterion("ASSET_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andAssetNumEqualTo(Long value) {
            addCriterion("ASSET_NUM =", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumNotEqualTo(Long value) {
            addCriterion("ASSET_NUM <>", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumGreaterThan(Long value) {
            addCriterion("ASSET_NUM >", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumGreaterThanOrEqualTo(Long value) {
            addCriterion("ASSET_NUM >=", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumLessThan(Long value) {
            addCriterion("ASSET_NUM <", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumLessThanOrEqualTo(Long value) {
            addCriterion("ASSET_NUM <=", value, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumIn(List<Long> values) {
            addCriterion("ASSET_NUM in", values, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumNotIn(List<Long> values) {
            addCriterion("ASSET_NUM not in", values, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumBetween(Long value1, Long value2) {
            addCriterion("ASSET_NUM between", value1, value2, "assetNum");
            return (Criteria) this;
        }

        public Criteria andAssetNumNotBetween(Long value1, Long value2) {
            addCriterion("ASSET_NUM not between", value1, value2, "assetNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumIsNull() {
            addCriterion("COMPLETE_NUM is null");
            return (Criteria) this;
        }

        public Criteria andCompleteNumIsNotNull() {
            addCriterion("COMPLETE_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteNumEqualTo(Long value) {
            addCriterion("COMPLETE_NUM =", value, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumNotEqualTo(Long value) {
            addCriterion("COMPLETE_NUM <>", value, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumGreaterThan(Long value) {
            addCriterion("COMPLETE_NUM >", value, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPLETE_NUM >=", value, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumLessThan(Long value) {
            addCriterion("COMPLETE_NUM <", value, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumLessThanOrEqualTo(Long value) {
            addCriterion("COMPLETE_NUM <=", value, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumIn(List<Long> values) {
            addCriterion("COMPLETE_NUM in", values, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumNotIn(List<Long> values) {
            addCriterion("COMPLETE_NUM not in", values, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumBetween(Long value1, Long value2) {
            addCriterion("COMPLETE_NUM between", value1, value2, "completeNum");
            return (Criteria) this;
        }

        public Criteria andCompleteNumNotBetween(Long value1, Long value2) {
            addCriterion("COMPLETE_NUM not between", value1, value2, "completeNum");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNull() {
            addCriterion("DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIsNotNull() {
            addCriterion("DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdEqualTo(Long value) {
            addCriterion("DEPARTMENT_ID =", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotEqualTo(Long value) {
            addCriterion("DEPARTMENT_ID <>", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThan(Long value) {
            addCriterion("DEPARTMENT_ID >", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPARTMENT_ID >=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThan(Long value) {
            addCriterion("DEPARTMENT_ID <", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("DEPARTMENT_ID <=", value, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdIn(List<Long> values) {
            addCriterion("DEPARTMENT_ID in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotIn(List<Long> values) {
            addCriterion("DEPARTMENT_ID not in", values, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("DEPARTMENT_ID between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("DEPARTMENT_ID not between", value1, value2, "departmentId");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("END_TIME >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterionForJDBCDate("END_TIME <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_TIME <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterionForJDBCDate("END_TIME in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_TIME not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_TIME between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_TIME not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andNoNumIsNull() {
            addCriterion("NO_NUM is null");
            return (Criteria) this;
        }

        public Criteria andNoNumIsNotNull() {
            addCriterion("NO_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNoNumEqualTo(Long value) {
            addCriterion("NO_NUM =", value, "noNum");
            return (Criteria) this;
        }

        public Criteria andNoNumNotEqualTo(Long value) {
            addCriterion("NO_NUM <>", value, "noNum");
            return (Criteria) this;
        }

        public Criteria andNoNumGreaterThan(Long value) {
            addCriterion("NO_NUM >", value, "noNum");
            return (Criteria) this;
        }

        public Criteria andNoNumGreaterThanOrEqualTo(Long value) {
            addCriterion("NO_NUM >=", value, "noNum");
            return (Criteria) this;
        }

        public Criteria andNoNumLessThan(Long value) {
            addCriterion("NO_NUM <", value, "noNum");
            return (Criteria) this;
        }

        public Criteria andNoNumLessThanOrEqualTo(Long value) {
            addCriterion("NO_NUM <=", value, "noNum");
            return (Criteria) this;
        }

        public Criteria andNoNumIn(List<Long> values) {
            addCriterion("NO_NUM in", values, "noNum");
            return (Criteria) this;
        }

        public Criteria andNoNumNotIn(List<Long> values) {
            addCriterion("NO_NUM not in", values, "noNum");
            return (Criteria) this;
        }

        public Criteria andNoNumBetween(Long value1, Long value2) {
            addCriterion("NO_NUM between", value1, value2, "noNum");
            return (Criteria) this;
        }

        public Criteria andNoNumNotBetween(Long value1, Long value2) {
            addCriterion("NO_NUM not between", value1, value2, "noNum");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterionForJDBCDate("START_TIME =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("START_TIME <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("START_TIME >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_TIME >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterionForJDBCDate("START_TIME <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_TIME <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterionForJDBCDate("START_TIME in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("START_TIME not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_TIME between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_TIME not between", value1, value2, "startTime");
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