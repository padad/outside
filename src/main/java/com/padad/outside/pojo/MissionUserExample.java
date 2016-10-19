package com.padad.outside.pojo;

import java.util.ArrayList;
import java.util.List;

public class MissionUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MissionUserExample() {
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

        public Criteria andMytaobaoIsNull() {
            addCriterion("mytaobao is null");
            return (Criteria) this;
        }

        public Criteria andMytaobaoIsNotNull() {
            addCriterion("mytaobao is not null");
            return (Criteria) this;
        }

        public Criteria andMytaobaoEqualTo(String value) {
            addCriterion("mytaobao =", value, "mytaobao");
            return (Criteria) this;
        }

        public Criteria andMytaobaoNotEqualTo(String value) {
            addCriterion("mytaobao <>", value, "mytaobao");
            return (Criteria) this;
        }

        public Criteria andMytaobaoGreaterThan(String value) {
            addCriterion("mytaobao >", value, "mytaobao");
            return (Criteria) this;
        }

        public Criteria andMytaobaoGreaterThanOrEqualTo(String value) {
            addCriterion("mytaobao >=", value, "mytaobao");
            return (Criteria) this;
        }

        public Criteria andMytaobaoLessThan(String value) {
            addCriterion("mytaobao <", value, "mytaobao");
            return (Criteria) this;
        }

        public Criteria andMytaobaoLessThanOrEqualTo(String value) {
            addCriterion("mytaobao <=", value, "mytaobao");
            return (Criteria) this;
        }

        public Criteria andMytaobaoLike(String value) {
            addCriterion("mytaobao like", value, "mytaobao");
            return (Criteria) this;
        }

        public Criteria andMytaobaoNotLike(String value) {
            addCriterion("mytaobao not like", value, "mytaobao");
            return (Criteria) this;
        }

        public Criteria andMytaobaoIn(List<String> values) {
            addCriterion("mytaobao in", values, "mytaobao");
            return (Criteria) this;
        }

        public Criteria andMytaobaoNotIn(List<String> values) {
            addCriterion("mytaobao not in", values, "mytaobao");
            return (Criteria) this;
        }

        public Criteria andMytaobaoBetween(String value1, String value2) {
            addCriterion("mytaobao between", value1, value2, "mytaobao");
            return (Criteria) this;
        }

        public Criteria andMytaobaoNotBetween(String value1, String value2) {
            addCriterion("mytaobao not between", value1, value2, "mytaobao");
            return (Criteria) this;
        }

        public Criteria andMyphoneIsNull() {
            addCriterion("myphone is null");
            return (Criteria) this;
        }

        public Criteria andMyphoneIsNotNull() {
            addCriterion("myphone is not null");
            return (Criteria) this;
        }

        public Criteria andMyphoneEqualTo(String value) {
            addCriterion("myphone =", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneNotEqualTo(String value) {
            addCriterion("myphone <>", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneGreaterThan(String value) {
            addCriterion("myphone >", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneGreaterThanOrEqualTo(String value) {
            addCriterion("myphone >=", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneLessThan(String value) {
            addCriterion("myphone <", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneLessThanOrEqualTo(String value) {
            addCriterion("myphone <=", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneLike(String value) {
            addCriterion("myphone like", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneNotLike(String value) {
            addCriterion("myphone not like", value, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneIn(List<String> values) {
            addCriterion("myphone in", values, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneNotIn(List<String> values) {
            addCriterion("myphone not in", values, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneBetween(String value1, String value2) {
            addCriterion("myphone between", value1, value2, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyphoneNotBetween(String value1, String value2) {
            addCriterion("myphone not between", value1, value2, "myphone");
            return (Criteria) this;
        }

        public Criteria andMyaddressIsNull() {
            addCriterion("myaddress is null");
            return (Criteria) this;
        }

        public Criteria andMyaddressIsNotNull() {
            addCriterion("myaddress is not null");
            return (Criteria) this;
        }

        public Criteria andMyaddressEqualTo(String value) {
            addCriterion("myaddress =", value, "myaddress");
            return (Criteria) this;
        }

        public Criteria andMyaddressNotEqualTo(String value) {
            addCriterion("myaddress <>", value, "myaddress");
            return (Criteria) this;
        }

        public Criteria andMyaddressGreaterThan(String value) {
            addCriterion("myaddress >", value, "myaddress");
            return (Criteria) this;
        }

        public Criteria andMyaddressGreaterThanOrEqualTo(String value) {
            addCriterion("myaddress >=", value, "myaddress");
            return (Criteria) this;
        }

        public Criteria andMyaddressLessThan(String value) {
            addCriterion("myaddress <", value, "myaddress");
            return (Criteria) this;
        }

        public Criteria andMyaddressLessThanOrEqualTo(String value) {
            addCriterion("myaddress <=", value, "myaddress");
            return (Criteria) this;
        }

        public Criteria andMyaddressLike(String value) {
            addCriterion("myaddress like", value, "myaddress");
            return (Criteria) this;
        }

        public Criteria andMyaddressNotLike(String value) {
            addCriterion("myaddress not like", value, "myaddress");
            return (Criteria) this;
        }

        public Criteria andMyaddressIn(List<String> values) {
            addCriterion("myaddress in", values, "myaddress");
            return (Criteria) this;
        }

        public Criteria andMyaddressNotIn(List<String> values) {
            addCriterion("myaddress not in", values, "myaddress");
            return (Criteria) this;
        }

        public Criteria andMyaddressBetween(String value1, String value2) {
            addCriterion("myaddress between", value1, value2, "myaddress");
            return (Criteria) this;
        }

        public Criteria andMyaddressNotBetween(String value1, String value2) {
            addCriterion("myaddress not between", value1, value2, "myaddress");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andMymoneyIsNull() {
            addCriterion("mymoney is null");
            return (Criteria) this;
        }

        public Criteria andMymoneyIsNotNull() {
            addCriterion("mymoney is not null");
            return (Criteria) this;
        }

        public Criteria andMymoneyEqualTo(String value) {
            addCriterion("mymoney =", value, "mymoney");
            return (Criteria) this;
        }

        public Criteria andMymoneyNotEqualTo(String value) {
            addCriterion("mymoney <>", value, "mymoney");
            return (Criteria) this;
        }

        public Criteria andMymoneyGreaterThan(String value) {
            addCriterion("mymoney >", value, "mymoney");
            return (Criteria) this;
        }

        public Criteria andMymoneyGreaterThanOrEqualTo(String value) {
            addCriterion("mymoney >=", value, "mymoney");
            return (Criteria) this;
        }

        public Criteria andMymoneyLessThan(String value) {
            addCriterion("mymoney <", value, "mymoney");
            return (Criteria) this;
        }

        public Criteria andMymoneyLessThanOrEqualTo(String value) {
            addCriterion("mymoney <=", value, "mymoney");
            return (Criteria) this;
        }

        public Criteria andMymoneyLike(String value) {
            addCriterion("mymoney like", value, "mymoney");
            return (Criteria) this;
        }

        public Criteria andMymoneyNotLike(String value) {
            addCriterion("mymoney not like", value, "mymoney");
            return (Criteria) this;
        }

        public Criteria andMymoneyIn(List<String> values) {
            addCriterion("mymoney in", values, "mymoney");
            return (Criteria) this;
        }

        public Criteria andMymoneyNotIn(List<String> values) {
            addCriterion("mymoney not in", values, "mymoney");
            return (Criteria) this;
        }

        public Criteria andMymoneyBetween(String value1, String value2) {
            addCriterion("mymoney between", value1, value2, "mymoney");
            return (Criteria) this;
        }

        public Criteria andMymoneyNotBetween(String value1, String value2) {
            addCriterion("mymoney not between", value1, value2, "mymoney");
            return (Criteria) this;
        }

        public Criteria andMylevelIsNull() {
            addCriterion("mylevel is null");
            return (Criteria) this;
        }

        public Criteria andMylevelIsNotNull() {
            addCriterion("mylevel is not null");
            return (Criteria) this;
        }

        public Criteria andMylevelEqualTo(String value) {
            addCriterion("mylevel =", value, "mylevel");
            return (Criteria) this;
        }

        public Criteria andMylevelNotEqualTo(String value) {
            addCriterion("mylevel <>", value, "mylevel");
            return (Criteria) this;
        }

        public Criteria andMylevelGreaterThan(String value) {
            addCriterion("mylevel >", value, "mylevel");
            return (Criteria) this;
        }

        public Criteria andMylevelGreaterThanOrEqualTo(String value) {
            addCriterion("mylevel >=", value, "mylevel");
            return (Criteria) this;
        }

        public Criteria andMylevelLessThan(String value) {
            addCriterion("mylevel <", value, "mylevel");
            return (Criteria) this;
        }

        public Criteria andMylevelLessThanOrEqualTo(String value) {
            addCriterion("mylevel <=", value, "mylevel");
            return (Criteria) this;
        }

        public Criteria andMylevelLike(String value) {
            addCriterion("mylevel like", value, "mylevel");
            return (Criteria) this;
        }

        public Criteria andMylevelNotLike(String value) {
            addCriterion("mylevel not like", value, "mylevel");
            return (Criteria) this;
        }

        public Criteria andMylevelIn(List<String> values) {
            addCriterion("mylevel in", values, "mylevel");
            return (Criteria) this;
        }

        public Criteria andMylevelNotIn(List<String> values) {
            addCriterion("mylevel not in", values, "mylevel");
            return (Criteria) this;
        }

        public Criteria andMylevelBetween(String value1, String value2) {
            addCriterion("mylevel between", value1, value2, "mylevel");
            return (Criteria) this;
        }

        public Criteria andMylevelNotBetween(String value1, String value2) {
            addCriterion("mylevel not between", value1, value2, "mylevel");
            return (Criteria) this;
        }

        public Criteria andMyexperienceIsNull() {
            addCriterion("myexperience is null");
            return (Criteria) this;
        }

        public Criteria andMyexperienceIsNotNull() {
            addCriterion("myexperience is not null");
            return (Criteria) this;
        }

        public Criteria andMyexperienceEqualTo(String value) {
            addCriterion("myexperience =", value, "myexperience");
            return (Criteria) this;
        }

        public Criteria andMyexperienceNotEqualTo(String value) {
            addCriterion("myexperience <>", value, "myexperience");
            return (Criteria) this;
        }

        public Criteria andMyexperienceGreaterThan(String value) {
            addCriterion("myexperience >", value, "myexperience");
            return (Criteria) this;
        }

        public Criteria andMyexperienceGreaterThanOrEqualTo(String value) {
            addCriterion("myexperience >=", value, "myexperience");
            return (Criteria) this;
        }

        public Criteria andMyexperienceLessThan(String value) {
            addCriterion("myexperience <", value, "myexperience");
            return (Criteria) this;
        }

        public Criteria andMyexperienceLessThanOrEqualTo(String value) {
            addCriterion("myexperience <=", value, "myexperience");
            return (Criteria) this;
        }

        public Criteria andMyexperienceLike(String value) {
            addCriterion("myexperience like", value, "myexperience");
            return (Criteria) this;
        }

        public Criteria andMyexperienceNotLike(String value) {
            addCriterion("myexperience not like", value, "myexperience");
            return (Criteria) this;
        }

        public Criteria andMyexperienceIn(List<String> values) {
            addCriterion("myexperience in", values, "myexperience");
            return (Criteria) this;
        }

        public Criteria andMyexperienceNotIn(List<String> values) {
            addCriterion("myexperience not in", values, "myexperience");
            return (Criteria) this;
        }

        public Criteria andMyexperienceBetween(String value1, String value2) {
            addCriterion("myexperience between", value1, value2, "myexperience");
            return (Criteria) this;
        }

        public Criteria andMyexperienceNotBetween(String value1, String value2) {
            addCriterion("myexperience not between", value1, value2, "myexperience");
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