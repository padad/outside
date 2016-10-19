package com.padad.outside.pojo;

import java.util.ArrayList;
import java.util.List;

public class MissionMytaskExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MissionMytaskExample() {
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

        public Criteria andTaskIdIsNull() {
            addCriterion("task_id is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("task_id is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("task_id =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("task_id <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("task_id >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("task_id >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("task_id <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("task_id <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("task_id like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("task_id not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("task_id in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("task_id not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("task_id between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("task_id not between", value1, value2, "taskId");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
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

        public Criteria andDoleIsNull() {
            addCriterion("dole is null");
            return (Criteria) this;
        }

        public Criteria andDoleIsNotNull() {
            addCriterion("dole is not null");
            return (Criteria) this;
        }

        public Criteria andDoleEqualTo(Integer value) {
            addCriterion("dole =", value, "dole");
            return (Criteria) this;
        }

        public Criteria andDoleNotEqualTo(Integer value) {
            addCriterion("dole <>", value, "dole");
            return (Criteria) this;
        }

        public Criteria andDoleGreaterThan(Integer value) {
            addCriterion("dole >", value, "dole");
            return (Criteria) this;
        }

        public Criteria andDoleGreaterThanOrEqualTo(Integer value) {
            addCriterion("dole >=", value, "dole");
            return (Criteria) this;
        }

        public Criteria andDoleLessThan(Integer value) {
            addCriterion("dole <", value, "dole");
            return (Criteria) this;
        }

        public Criteria andDoleLessThanOrEqualTo(Integer value) {
            addCriterion("dole <=", value, "dole");
            return (Criteria) this;
        }

        public Criteria andDoleIn(List<Integer> values) {
            addCriterion("dole in", values, "dole");
            return (Criteria) this;
        }

        public Criteria andDoleNotIn(List<Integer> values) {
            addCriterion("dole not in", values, "dole");
            return (Criteria) this;
        }

        public Criteria andDoleBetween(Integer value1, Integer value2) {
            addCriterion("dole between", value1, value2, "dole");
            return (Criteria) this;
        }

        public Criteria andDoleNotBetween(Integer value1, Integer value2) {
            addCriterion("dole not between", value1, value2, "dole");
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