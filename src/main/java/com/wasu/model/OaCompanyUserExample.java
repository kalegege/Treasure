package com.wasu.model;

import java.util.ArrayList;
import java.util.List;

public class OaCompanyUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OaCompanyUserExample() {
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

        public Criteria andWorkcodeIsNull() {
            addCriterion("WORKCODE is null");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIsNotNull() {
            addCriterion("WORKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andWorkcodeEqualTo(String value) {
            addCriterion("WORKCODE =", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotEqualTo(String value) {
            addCriterion("WORKCODE <>", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeGreaterThan(String value) {
            addCriterion("WORKCODE >", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeGreaterThanOrEqualTo(String value) {
            addCriterion("WORKCODE >=", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLessThan(String value) {
            addCriterion("WORKCODE <", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLessThanOrEqualTo(String value) {
            addCriterion("WORKCODE <=", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeLike(String value) {
            addCriterion("WORKCODE like", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotLike(String value) {
            addCriterion("WORKCODE not like", value, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeIn(List<String> values) {
            addCriterion("WORKCODE in", values, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotIn(List<String> values) {
            addCriterion("WORKCODE not in", values, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeBetween(String value1, String value2) {
            addCriterion("WORKCODE between", value1, value2, "workcode");
            return (Criteria) this;
        }

        public Criteria andWorkcodeNotBetween(String value1, String value2) {
            addCriterion("WORKCODE not between", value1, value2, "workcode");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNull() {
            addCriterion("LASTNAME is null");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNotNull() {
            addCriterion("LASTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andLastnameEqualTo(String value) {
            addCriterion("LASTNAME =", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotEqualTo(String value) {
            addCriterion("LASTNAME <>", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThan(String value) {
            addCriterion("LASTNAME >", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("LASTNAME >=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThan(String value) {
            addCriterion("LASTNAME <", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThanOrEqualTo(String value) {
            addCriterion("LASTNAME <=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLike(String value) {
            addCriterion("LASTNAME like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotLike(String value) {
            addCriterion("LASTNAME not like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameIn(List<String> values) {
            addCriterion("LASTNAME in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotIn(List<String> values) {
            addCriterion("LASTNAME not in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameBetween(String value1, String value2) {
            addCriterion("LASTNAME between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotBetween(String value1, String value2) {
            addCriterion("LASTNAME not between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andSupnameIsNull() {
            addCriterion("SUPNAME is null");
            return (Criteria) this;
        }

        public Criteria andSupnameIsNotNull() {
            addCriterion("SUPNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSupnameEqualTo(String value) {
            addCriterion("SUPNAME =", value, "supname");
            return (Criteria) this;
        }

        public Criteria andSupnameNotEqualTo(String value) {
            addCriterion("SUPNAME <>", value, "supname");
            return (Criteria) this;
        }

        public Criteria andSupnameGreaterThan(String value) {
            addCriterion("SUPNAME >", value, "supname");
            return (Criteria) this;
        }

        public Criteria andSupnameGreaterThanOrEqualTo(String value) {
            addCriterion("SUPNAME >=", value, "supname");
            return (Criteria) this;
        }

        public Criteria andSupnameLessThan(String value) {
            addCriterion("SUPNAME <", value, "supname");
            return (Criteria) this;
        }

        public Criteria andSupnameLessThanOrEqualTo(String value) {
            addCriterion("SUPNAME <=", value, "supname");
            return (Criteria) this;
        }

        public Criteria andSupnameLike(String value) {
            addCriterion("SUPNAME like", value, "supname");
            return (Criteria) this;
        }

        public Criteria andSupnameNotLike(String value) {
            addCriterion("SUPNAME not like", value, "supname");
            return (Criteria) this;
        }

        public Criteria andSupnameIn(List<String> values) {
            addCriterion("SUPNAME in", values, "supname");
            return (Criteria) this;
        }

        public Criteria andSupnameNotIn(List<String> values) {
            addCriterion("SUPNAME not in", values, "supname");
            return (Criteria) this;
        }

        public Criteria andSupnameBetween(String value1, String value2) {
            addCriterion("SUPNAME between", value1, value2, "supname");
            return (Criteria) this;
        }

        public Criteria andSupnameNotBetween(String value1, String value2) {
            addCriterion("SUPNAME not between", value1, value2, "supname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameIsNull() {
            addCriterion("SUBCOMPANYNAME is null");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameIsNotNull() {
            addCriterion("SUBCOMPANYNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameEqualTo(String value) {
            addCriterion("SUBCOMPANYNAME =", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameNotEqualTo(String value) {
            addCriterion("SUBCOMPANYNAME <>", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameGreaterThan(String value) {
            addCriterion("SUBCOMPANYNAME >", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameGreaterThanOrEqualTo(String value) {
            addCriterion("SUBCOMPANYNAME >=", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameLessThan(String value) {
            addCriterion("SUBCOMPANYNAME <", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameLessThanOrEqualTo(String value) {
            addCriterion("SUBCOMPANYNAME <=", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameLike(String value) {
            addCriterion("SUBCOMPANYNAME like", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameNotLike(String value) {
            addCriterion("SUBCOMPANYNAME not like", value, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameIn(List<String> values) {
            addCriterion("SUBCOMPANYNAME in", values, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameNotIn(List<String> values) {
            addCriterion("SUBCOMPANYNAME not in", values, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameBetween(String value1, String value2) {
            addCriterion("SUBCOMPANYNAME between", value1, value2, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andSubcompanynameNotBetween(String value1, String value2) {
            addCriterion("SUBCOMPANYNAME not between", value1, value2, "subcompanyname");
            return (Criteria) this;
        }

        public Criteria andManagerIsNull() {
            addCriterion("MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andManagerIsNotNull() {
            addCriterion("MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andManagerEqualTo(String value) {
            addCriterion("MANAGER =", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotEqualTo(String value) {
            addCriterion("MANAGER <>", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThan(String value) {
            addCriterion("MANAGER >", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerGreaterThanOrEqualTo(String value) {
            addCriterion("MANAGER >=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThan(String value) {
            addCriterion("MANAGER <", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLessThanOrEqualTo(String value) {
            addCriterion("MANAGER <=", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerLike(String value) {
            addCriterion("MANAGER like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotLike(String value) {
            addCriterion("MANAGER not like", value, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerIn(List<String> values) {
            addCriterion("MANAGER in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotIn(List<String> values) {
            addCriterion("MANAGER not in", values, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerBetween(String value1, String value2) {
            addCriterion("MANAGER between", value1, value2, "manager");
            return (Criteria) this;
        }

        public Criteria andManagerNotBetween(String value1, String value2) {
            addCriterion("MANAGER not between", value1, value2, "manager");
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