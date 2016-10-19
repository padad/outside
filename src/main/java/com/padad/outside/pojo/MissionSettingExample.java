package com.padad.outside.pojo;

import java.util.ArrayList;
import java.util.List;

public class MissionSettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MissionSettingExample() {
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

        public Criteria andAppVersionIsNull() {
            addCriterion("app_version is null");
            return (Criteria) this;
        }

        public Criteria andAppVersionIsNotNull() {
            addCriterion("app_version is not null");
            return (Criteria) this;
        }

        public Criteria andAppVersionEqualTo(Integer value) {
            addCriterion("app_version =", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotEqualTo(Integer value) {
            addCriterion("app_version <>", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThan(Integer value) {
            addCriterion("app_version >", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_version >=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThan(Integer value) {
            addCriterion("app_version <", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionLessThanOrEqualTo(Integer value) {
            addCriterion("app_version <=", value, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionIn(List<Integer> values) {
            addCriterion("app_version in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotIn(List<Integer> values) {
            addCriterion("app_version not in", values, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionBetween(Integer value1, Integer value2) {
            addCriterion("app_version between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppVersionNotBetween(Integer value1, Integer value2) {
            addCriterion("app_version not between", value1, value2, "appVersion");
            return (Criteria) this;
        }

        public Criteria andAppDescIsNull() {
            addCriterion("app_desc is null");
            return (Criteria) this;
        }

        public Criteria andAppDescIsNotNull() {
            addCriterion("app_desc is not null");
            return (Criteria) this;
        }

        public Criteria andAppDescEqualTo(String value) {
            addCriterion("app_desc =", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescNotEqualTo(String value) {
            addCriterion("app_desc <>", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescGreaterThan(String value) {
            addCriterion("app_desc >", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescGreaterThanOrEqualTo(String value) {
            addCriterion("app_desc >=", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescLessThan(String value) {
            addCriterion("app_desc <", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescLessThanOrEqualTo(String value) {
            addCriterion("app_desc <=", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescLike(String value) {
            addCriterion("app_desc like", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescNotLike(String value) {
            addCriterion("app_desc not like", value, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescIn(List<String> values) {
            addCriterion("app_desc in", values, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescNotIn(List<String> values) {
            addCriterion("app_desc not in", values, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescBetween(String value1, String value2) {
            addCriterion("app_desc between", value1, value2, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppDescNotBetween(String value1, String value2) {
            addCriterion("app_desc not between", value1, value2, "appDesc");
            return (Criteria) this;
        }

        public Criteria andAppAddressIsNull() {
            addCriterion("app_address is null");
            return (Criteria) this;
        }

        public Criteria andAppAddressIsNotNull() {
            addCriterion("app_address is not null");
            return (Criteria) this;
        }

        public Criteria andAppAddressEqualTo(String value) {
            addCriterion("app_address =", value, "appAddress");
            return (Criteria) this;
        }

        public Criteria andAppAddressNotEqualTo(String value) {
            addCriterion("app_address <>", value, "appAddress");
            return (Criteria) this;
        }

        public Criteria andAppAddressGreaterThan(String value) {
            addCriterion("app_address >", value, "appAddress");
            return (Criteria) this;
        }

        public Criteria andAppAddressGreaterThanOrEqualTo(String value) {
            addCriterion("app_address >=", value, "appAddress");
            return (Criteria) this;
        }

        public Criteria andAppAddressLessThan(String value) {
            addCriterion("app_address <", value, "appAddress");
            return (Criteria) this;
        }

        public Criteria andAppAddressLessThanOrEqualTo(String value) {
            addCriterion("app_address <=", value, "appAddress");
            return (Criteria) this;
        }

        public Criteria andAppAddressLike(String value) {
            addCriterion("app_address like", value, "appAddress");
            return (Criteria) this;
        }

        public Criteria andAppAddressNotLike(String value) {
            addCriterion("app_address not like", value, "appAddress");
            return (Criteria) this;
        }

        public Criteria andAppAddressIn(List<String> values) {
            addCriterion("app_address in", values, "appAddress");
            return (Criteria) this;
        }

        public Criteria andAppAddressNotIn(List<String> values) {
            addCriterion("app_address not in", values, "appAddress");
            return (Criteria) this;
        }

        public Criteria andAppAddressBetween(String value1, String value2) {
            addCriterion("app_address between", value1, value2, "appAddress");
            return (Criteria) this;
        }

        public Criteria andAppAddressNotBetween(String value1, String value2) {
            addCriterion("app_address not between", value1, value2, "appAddress");
            return (Criteria) this;
        }

        public Criteria andForceIsNull() {
            addCriterion("force is null");
            return (Criteria) this;
        }

        public Criteria andForceIsNotNull() {
            addCriterion("force is not null");
            return (Criteria) this;
        }

        public Criteria andForceEqualTo(Integer value) {
            addCriterion("force =", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceNotEqualTo(Integer value) {
            addCriterion("force <>", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceGreaterThan(Integer value) {
            addCriterion("force >", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceGreaterThanOrEqualTo(Integer value) {
            addCriterion("force >=", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceLessThan(Integer value) {
            addCriterion("force <", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceLessThanOrEqualTo(Integer value) {
            addCriterion("force <=", value, "force");
            return (Criteria) this;
        }

        public Criteria andForceIn(List<Integer> values) {
            addCriterion("force in", values, "force");
            return (Criteria) this;
        }

        public Criteria andForceNotIn(List<Integer> values) {
            addCriterion("force not in", values, "force");
            return (Criteria) this;
        }

        public Criteria andForceBetween(Integer value1, Integer value2) {
            addCriterion("force between", value1, value2, "force");
            return (Criteria) this;
        }

        public Criteria andForceNotBetween(Integer value1, Integer value2) {
            addCriterion("force not between", value1, value2, "force");
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