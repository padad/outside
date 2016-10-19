package com.padad.outside.pojo;

import java.util.ArrayList;
import java.util.List;

public class MissionTaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MissionTaskExample() {
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

        public Criteria andMissionIdIsNull() {
            addCriterion("mission_id is null");
            return (Criteria) this;
        }

        public Criteria andMissionIdIsNotNull() {
            addCriterion("mission_id is not null");
            return (Criteria) this;
        }

        public Criteria andMissionIdEqualTo(String value) {
            addCriterion("mission_id =", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotEqualTo(String value) {
            addCriterion("mission_id <>", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThan(String value) {
            addCriterion("mission_id >", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdGreaterThanOrEqualTo(String value) {
            addCriterion("mission_id >=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThan(String value) {
            addCriterion("mission_id <", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLessThanOrEqualTo(String value) {
            addCriterion("mission_id <=", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdLike(String value) {
            addCriterion("mission_id like", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotLike(String value) {
            addCriterion("mission_id not like", value, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdIn(List<String> values) {
            addCriterion("mission_id in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotIn(List<String> values) {
            addCriterion("mission_id not in", values, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdBetween(String value1, String value2) {
            addCriterion("mission_id between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andMissionIdNotBetween(String value1, String value2) {
            addCriterion("mission_id not between", value1, value2, "missionId");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andMissionStarIsNull() {
            addCriterion("mission_star is null");
            return (Criteria) this;
        }

        public Criteria andMissionStarIsNotNull() {
            addCriterion("mission_star is not null");
            return (Criteria) this;
        }

        public Criteria andMissionStarEqualTo(Integer value) {
            addCriterion("mission_star =", value, "missionStar");
            return (Criteria) this;
        }

        public Criteria andMissionStarNotEqualTo(Integer value) {
            addCriterion("mission_star <>", value, "missionStar");
            return (Criteria) this;
        }

        public Criteria andMissionStarGreaterThan(Integer value) {
            addCriterion("mission_star >", value, "missionStar");
            return (Criteria) this;
        }

        public Criteria andMissionStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("mission_star >=", value, "missionStar");
            return (Criteria) this;
        }

        public Criteria andMissionStarLessThan(Integer value) {
            addCriterion("mission_star <", value, "missionStar");
            return (Criteria) this;
        }

        public Criteria andMissionStarLessThanOrEqualTo(Integer value) {
            addCriterion("mission_star <=", value, "missionStar");
            return (Criteria) this;
        }

        public Criteria andMissionStarIn(List<Integer> values) {
            addCriterion("mission_star in", values, "missionStar");
            return (Criteria) this;
        }

        public Criteria andMissionStarNotIn(List<Integer> values) {
            addCriterion("mission_star not in", values, "missionStar");
            return (Criteria) this;
        }

        public Criteria andMissionStarBetween(Integer value1, Integer value2) {
            addCriterion("mission_star between", value1, value2, "missionStar");
            return (Criteria) this;
        }

        public Criteria andMissionStarNotBetween(Integer value1, Integer value2) {
            addCriterion("mission_star not between", value1, value2, "missionStar");
            return (Criteria) this;
        }

        public Criteria andMissionTimeIsNull() {
            addCriterion("mission_time is null");
            return (Criteria) this;
        }

        public Criteria andMissionTimeIsNotNull() {
            addCriterion("mission_time is not null");
            return (Criteria) this;
        }

        public Criteria andMissionTimeEqualTo(String value) {
            addCriterion("mission_time =", value, "missionTime");
            return (Criteria) this;
        }

        public Criteria andMissionTimeNotEqualTo(String value) {
            addCriterion("mission_time <>", value, "missionTime");
            return (Criteria) this;
        }

        public Criteria andMissionTimeGreaterThan(String value) {
            addCriterion("mission_time >", value, "missionTime");
            return (Criteria) this;
        }

        public Criteria andMissionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("mission_time >=", value, "missionTime");
            return (Criteria) this;
        }

        public Criteria andMissionTimeLessThan(String value) {
            addCriterion("mission_time <", value, "missionTime");
            return (Criteria) this;
        }

        public Criteria andMissionTimeLessThanOrEqualTo(String value) {
            addCriterion("mission_time <=", value, "missionTime");
            return (Criteria) this;
        }

        public Criteria andMissionTimeLike(String value) {
            addCriterion("mission_time like", value, "missionTime");
            return (Criteria) this;
        }

        public Criteria andMissionTimeNotLike(String value) {
            addCriterion("mission_time not like", value, "missionTime");
            return (Criteria) this;
        }

        public Criteria andMissionTimeIn(List<String> values) {
            addCriterion("mission_time in", values, "missionTime");
            return (Criteria) this;
        }

        public Criteria andMissionTimeNotIn(List<String> values) {
            addCriterion("mission_time not in", values, "missionTime");
            return (Criteria) this;
        }

        public Criteria andMissionTimeBetween(String value1, String value2) {
            addCriterion("mission_time between", value1, value2, "missionTime");
            return (Criteria) this;
        }

        public Criteria andMissionTimeNotBetween(String value1, String value2) {
            addCriterion("mission_time not between", value1, value2, "missionTime");
            return (Criteria) this;
        }

        public Criteria andMoneyPriceIsNull() {
            addCriterion("money_price is null");
            return (Criteria) this;
        }

        public Criteria andMoneyPriceIsNotNull() {
            addCriterion("money_price is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyPriceEqualTo(String value) {
            addCriterion("money_price =", value, "moneyPrice");
            return (Criteria) this;
        }

        public Criteria andMoneyPriceNotEqualTo(String value) {
            addCriterion("money_price <>", value, "moneyPrice");
            return (Criteria) this;
        }

        public Criteria andMoneyPriceGreaterThan(String value) {
            addCriterion("money_price >", value, "moneyPrice");
            return (Criteria) this;
        }

        public Criteria andMoneyPriceGreaterThanOrEqualTo(String value) {
            addCriterion("money_price >=", value, "moneyPrice");
            return (Criteria) this;
        }

        public Criteria andMoneyPriceLessThan(String value) {
            addCriterion("money_price <", value, "moneyPrice");
            return (Criteria) this;
        }

        public Criteria andMoneyPriceLessThanOrEqualTo(String value) {
            addCriterion("money_price <=", value, "moneyPrice");
            return (Criteria) this;
        }

        public Criteria andMoneyPriceLike(String value) {
            addCriterion("money_price like", value, "moneyPrice");
            return (Criteria) this;
        }

        public Criteria andMoneyPriceNotLike(String value) {
            addCriterion("money_price not like", value, "moneyPrice");
            return (Criteria) this;
        }

        public Criteria andMoneyPriceIn(List<String> values) {
            addCriterion("money_price in", values, "moneyPrice");
            return (Criteria) this;
        }

        public Criteria andMoneyPriceNotIn(List<String> values) {
            addCriterion("money_price not in", values, "moneyPrice");
            return (Criteria) this;
        }

        public Criteria andMoneyPriceBetween(String value1, String value2) {
            addCriterion("money_price between", value1, value2, "moneyPrice");
            return (Criteria) this;
        }

        public Criteria andMoneyPriceNotBetween(String value1, String value2) {
            addCriterion("money_price not between", value1, value2, "moneyPrice");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Integer value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Integer value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Integer value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Integer value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Integer value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Integer> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Integer> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Integer value1, Integer value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("active not between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andMissionContentIsNull() {
            addCriterion("mission_content is null");
            return (Criteria) this;
        }

        public Criteria andMissionContentIsNotNull() {
            addCriterion("mission_content is not null");
            return (Criteria) this;
        }

        public Criteria andMissionContentEqualTo(String value) {
            addCriterion("mission_content =", value, "missionContent");
            return (Criteria) this;
        }

        public Criteria andMissionContentNotEqualTo(String value) {
            addCriterion("mission_content <>", value, "missionContent");
            return (Criteria) this;
        }

        public Criteria andMissionContentGreaterThan(String value) {
            addCriterion("mission_content >", value, "missionContent");
            return (Criteria) this;
        }

        public Criteria andMissionContentGreaterThanOrEqualTo(String value) {
            addCriterion("mission_content >=", value, "missionContent");
            return (Criteria) this;
        }

        public Criteria andMissionContentLessThan(String value) {
            addCriterion("mission_content <", value, "missionContent");
            return (Criteria) this;
        }

        public Criteria andMissionContentLessThanOrEqualTo(String value) {
            addCriterion("mission_content <=", value, "missionContent");
            return (Criteria) this;
        }

        public Criteria andMissionContentLike(String value) {
            addCriterion("mission_content like", value, "missionContent");
            return (Criteria) this;
        }

        public Criteria andMissionContentNotLike(String value) {
            addCriterion("mission_content not like", value, "missionContent");
            return (Criteria) this;
        }

        public Criteria andMissionContentIn(List<String> values) {
            addCriterion("mission_content in", values, "missionContent");
            return (Criteria) this;
        }

        public Criteria andMissionContentNotIn(List<String> values) {
            addCriterion("mission_content not in", values, "missionContent");
            return (Criteria) this;
        }

        public Criteria andMissionContentBetween(String value1, String value2) {
            addCriterion("mission_content between", value1, value2, "missionContent");
            return (Criteria) this;
        }

        public Criteria andMissionContentNotBetween(String value1, String value2) {
            addCriterion("mission_content not between", value1, value2, "missionContent");
            return (Criteria) this;
        }

        public Criteria andTaskApiIsNull() {
            addCriterion("task_api is null");
            return (Criteria) this;
        }

        public Criteria andTaskApiIsNotNull() {
            addCriterion("task_api is not null");
            return (Criteria) this;
        }

        public Criteria andTaskApiEqualTo(String value) {
            addCriterion("task_api =", value, "taskApi");
            return (Criteria) this;
        }

        public Criteria andTaskApiNotEqualTo(String value) {
            addCriterion("task_api <>", value, "taskApi");
            return (Criteria) this;
        }

        public Criteria andTaskApiGreaterThan(String value) {
            addCriterion("task_api >", value, "taskApi");
            return (Criteria) this;
        }

        public Criteria andTaskApiGreaterThanOrEqualTo(String value) {
            addCriterion("task_api >=", value, "taskApi");
            return (Criteria) this;
        }

        public Criteria andTaskApiLessThan(String value) {
            addCriterion("task_api <", value, "taskApi");
            return (Criteria) this;
        }

        public Criteria andTaskApiLessThanOrEqualTo(String value) {
            addCriterion("task_api <=", value, "taskApi");
            return (Criteria) this;
        }

        public Criteria andTaskApiLike(String value) {
            addCriterion("task_api like", value, "taskApi");
            return (Criteria) this;
        }

        public Criteria andTaskApiNotLike(String value) {
            addCriterion("task_api not like", value, "taskApi");
            return (Criteria) this;
        }

        public Criteria andTaskApiIn(List<String> values) {
            addCriterion("task_api in", values, "taskApi");
            return (Criteria) this;
        }

        public Criteria andTaskApiNotIn(List<String> values) {
            addCriterion("task_api not in", values, "taskApi");
            return (Criteria) this;
        }

        public Criteria andTaskApiBetween(String value1, String value2) {
            addCriterion("task_api between", value1, value2, "taskApi");
            return (Criteria) this;
        }

        public Criteria andTaskApiNotBetween(String value1, String value2) {
            addCriterion("task_api not between", value1, value2, "taskApi");
            return (Criteria) this;
        }

        public Criteria andMovieUrlIsNull() {
            addCriterion("movie_url is null");
            return (Criteria) this;
        }

        public Criteria andMovieUrlIsNotNull() {
            addCriterion("movie_url is not null");
            return (Criteria) this;
        }

        public Criteria andMovieUrlEqualTo(String value) {
            addCriterion("movie_url =", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlNotEqualTo(String value) {
            addCriterion("movie_url <>", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlGreaterThan(String value) {
            addCriterion("movie_url >", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlGreaterThanOrEqualTo(String value) {
            addCriterion("movie_url >=", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlLessThan(String value) {
            addCriterion("movie_url <", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlLessThanOrEqualTo(String value) {
            addCriterion("movie_url <=", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlLike(String value) {
            addCriterion("movie_url like", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlNotLike(String value) {
            addCriterion("movie_url not like", value, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlIn(List<String> values) {
            addCriterion("movie_url in", values, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlNotIn(List<String> values) {
            addCriterion("movie_url not in", values, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlBetween(String value1, String value2) {
            addCriterion("movie_url between", value1, value2, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andMovieUrlNotBetween(String value1, String value2) {
            addCriterion("movie_url not between", value1, value2, "movieUrl");
            return (Criteria) this;
        }

        public Criteria andKindTitleIsNull() {
            addCriterion("kind_title is null");
            return (Criteria) this;
        }

        public Criteria andKindTitleIsNotNull() {
            addCriterion("kind_title is not null");
            return (Criteria) this;
        }

        public Criteria andKindTitleEqualTo(String value) {
            addCriterion("kind_title =", value, "kindTitle");
            return (Criteria) this;
        }

        public Criteria andKindTitleNotEqualTo(String value) {
            addCriterion("kind_title <>", value, "kindTitle");
            return (Criteria) this;
        }

        public Criteria andKindTitleGreaterThan(String value) {
            addCriterion("kind_title >", value, "kindTitle");
            return (Criteria) this;
        }

        public Criteria andKindTitleGreaterThanOrEqualTo(String value) {
            addCriterion("kind_title >=", value, "kindTitle");
            return (Criteria) this;
        }

        public Criteria andKindTitleLessThan(String value) {
            addCriterion("kind_title <", value, "kindTitle");
            return (Criteria) this;
        }

        public Criteria andKindTitleLessThanOrEqualTo(String value) {
            addCriterion("kind_title <=", value, "kindTitle");
            return (Criteria) this;
        }

        public Criteria andKindTitleLike(String value) {
            addCriterion("kind_title like", value, "kindTitle");
            return (Criteria) this;
        }

        public Criteria andKindTitleNotLike(String value) {
            addCriterion("kind_title not like", value, "kindTitle");
            return (Criteria) this;
        }

        public Criteria andKindTitleIn(List<String> values) {
            addCriterion("kind_title in", values, "kindTitle");
            return (Criteria) this;
        }

        public Criteria andKindTitleNotIn(List<String> values) {
            addCriterion("kind_title not in", values, "kindTitle");
            return (Criteria) this;
        }

        public Criteria andKindTitleBetween(String value1, String value2) {
            addCriterion("kind_title between", value1, value2, "kindTitle");
            return (Criteria) this;
        }

        public Criteria andKindTitleNotBetween(String value1, String value2) {
            addCriterion("kind_title not between", value1, value2, "kindTitle");
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