package com.cake.bean;

import java.util.ArrayList;
import java.util.List;

public class AddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AddressExample() {
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

        public Criteria andAddressidIsNull() {
            addCriterion("AddressId is null");
            return (Criteria) this;
        }

        public Criteria andAddressidIsNotNull() {
            addCriterion("AddressId is not null");
            return (Criteria) this;
        }

        public Criteria andAddressidEqualTo(Integer value) {
            addCriterion("AddressId =", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotEqualTo(Integer value) {
            addCriterion("AddressId <>", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThan(Integer value) {
            addCriterion("AddressId >", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidGreaterThanOrEqualTo(Integer value) {
            addCriterion("AddressId >=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThan(Integer value) {
            addCriterion("AddressId <", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidLessThanOrEqualTo(Integer value) {
            addCriterion("AddressId <=", value, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidIn(List<Integer> values) {
            addCriterion("AddressId in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotIn(List<Integer> values) {
            addCriterion("AddressId not in", values, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidBetween(Integer value1, Integer value2) {
            addCriterion("AddressId between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andAddressidNotBetween(Integer value1, Integer value2) {
            addCriterion("AddressId not between", value1, value2, "addressid");
            return (Criteria) this;
        }

        public Criteria andUsrcountryIsNull() {
            addCriterion("UsrCountry is null");
            return (Criteria) this;
        }

        public Criteria andUsrcountryIsNotNull() {
            addCriterion("UsrCountry is not null");
            return (Criteria) this;
        }

        public Criteria andUsrcountryEqualTo(String value) {
            addCriterion("UsrCountry =", value, "usrcountry");
            return (Criteria) this;
        }

        public Criteria andUsrcountryNotEqualTo(String value) {
            addCriterion("UsrCountry <>", value, "usrcountry");
            return (Criteria) this;
        }

        public Criteria andUsrcountryGreaterThan(String value) {
            addCriterion("UsrCountry >", value, "usrcountry");
            return (Criteria) this;
        }

        public Criteria andUsrcountryGreaterThanOrEqualTo(String value) {
            addCriterion("UsrCountry >=", value, "usrcountry");
            return (Criteria) this;
        }

        public Criteria andUsrcountryLessThan(String value) {
            addCriterion("UsrCountry <", value, "usrcountry");
            return (Criteria) this;
        }

        public Criteria andUsrcountryLessThanOrEqualTo(String value) {
            addCriterion("UsrCountry <=", value, "usrcountry");
            return (Criteria) this;
        }

        public Criteria andUsrcountryLike(String value) {
            addCriterion("UsrCountry like", value, "usrcountry");
            return (Criteria) this;
        }

        public Criteria andUsrcountryNotLike(String value) {
            addCriterion("UsrCountry not like", value, "usrcountry");
            return (Criteria) this;
        }

        public Criteria andUsrcountryIn(List<String> values) {
            addCriterion("UsrCountry in", values, "usrcountry");
            return (Criteria) this;
        }

        public Criteria andUsrcountryNotIn(List<String> values) {
            addCriterion("UsrCountry not in", values, "usrcountry");
            return (Criteria) this;
        }

        public Criteria andUsrcountryBetween(String value1, String value2) {
            addCriterion("UsrCountry between", value1, value2, "usrcountry");
            return (Criteria) this;
        }

        public Criteria andUsrcountryNotBetween(String value1, String value2) {
            addCriterion("UsrCountry not between", value1, value2, "usrcountry");
            return (Criteria) this;
        }

        public Criteria andUsrprovinceIsNull() {
            addCriterion("UsrProvince is null");
            return (Criteria) this;
        }

        public Criteria andUsrprovinceIsNotNull() {
            addCriterion("UsrProvince is not null");
            return (Criteria) this;
        }

        public Criteria andUsrprovinceEqualTo(String value) {
            addCriterion("UsrProvince =", value, "usrprovince");
            return (Criteria) this;
        }

        public Criteria andUsrprovinceNotEqualTo(String value) {
            addCriterion("UsrProvince <>", value, "usrprovince");
            return (Criteria) this;
        }

        public Criteria andUsrprovinceGreaterThan(String value) {
            addCriterion("UsrProvince >", value, "usrprovince");
            return (Criteria) this;
        }

        public Criteria andUsrprovinceGreaterThanOrEqualTo(String value) {
            addCriterion("UsrProvince >=", value, "usrprovince");
            return (Criteria) this;
        }

        public Criteria andUsrprovinceLessThan(String value) {
            addCriterion("UsrProvince <", value, "usrprovince");
            return (Criteria) this;
        }

        public Criteria andUsrprovinceLessThanOrEqualTo(String value) {
            addCriterion("UsrProvince <=", value, "usrprovince");
            return (Criteria) this;
        }

        public Criteria andUsrprovinceLike(String value) {
            addCriterion("UsrProvince like", value, "usrprovince");
            return (Criteria) this;
        }

        public Criteria andUsrprovinceNotLike(String value) {
            addCriterion("UsrProvince not like", value, "usrprovince");
            return (Criteria) this;
        }

        public Criteria andUsrprovinceIn(List<String> values) {
            addCriterion("UsrProvince in", values, "usrprovince");
            return (Criteria) this;
        }

        public Criteria andUsrprovinceNotIn(List<String> values) {
            addCriterion("UsrProvince not in", values, "usrprovince");
            return (Criteria) this;
        }

        public Criteria andUsrprovinceBetween(String value1, String value2) {
            addCriterion("UsrProvince between", value1, value2, "usrprovince");
            return (Criteria) this;
        }

        public Criteria andUsrprovinceNotBetween(String value1, String value2) {
            addCriterion("UsrProvince not between", value1, value2, "usrprovince");
            return (Criteria) this;
        }

        public Criteria andUsrcityIsNull() {
            addCriterion("UsrCity is null");
            return (Criteria) this;
        }

        public Criteria andUsrcityIsNotNull() {
            addCriterion("UsrCity is not null");
            return (Criteria) this;
        }

        public Criteria andUsrcityEqualTo(String value) {
            addCriterion("UsrCity =", value, "usrcity");
            return (Criteria) this;
        }

        public Criteria andUsrcityNotEqualTo(String value) {
            addCriterion("UsrCity <>", value, "usrcity");
            return (Criteria) this;
        }

        public Criteria andUsrcityGreaterThan(String value) {
            addCriterion("UsrCity >", value, "usrcity");
            return (Criteria) this;
        }

        public Criteria andUsrcityGreaterThanOrEqualTo(String value) {
            addCriterion("UsrCity >=", value, "usrcity");
            return (Criteria) this;
        }

        public Criteria andUsrcityLessThan(String value) {
            addCriterion("UsrCity <", value, "usrcity");
            return (Criteria) this;
        }

        public Criteria andUsrcityLessThanOrEqualTo(String value) {
            addCriterion("UsrCity <=", value, "usrcity");
            return (Criteria) this;
        }

        public Criteria andUsrcityLike(String value) {
            addCriterion("UsrCity like", value, "usrcity");
            return (Criteria) this;
        }

        public Criteria andUsrcityNotLike(String value) {
            addCriterion("UsrCity not like", value, "usrcity");
            return (Criteria) this;
        }

        public Criteria andUsrcityIn(List<String> values) {
            addCriterion("UsrCity in", values, "usrcity");
            return (Criteria) this;
        }

        public Criteria andUsrcityNotIn(List<String> values) {
            addCriterion("UsrCity not in", values, "usrcity");
            return (Criteria) this;
        }

        public Criteria andUsrcityBetween(String value1, String value2) {
            addCriterion("UsrCity between", value1, value2, "usrcity");
            return (Criteria) this;
        }

        public Criteria andUsrcityNotBetween(String value1, String value2) {
            addCriterion("UsrCity not between", value1, value2, "usrcity");
            return (Criteria) this;
        }

        public Criteria andUsremailIsNull() {
            addCriterion("UsrEmail is null");
            return (Criteria) this;
        }

        public Criteria andUsremailIsNotNull() {
            addCriterion("UsrEmail is not null");
            return (Criteria) this;
        }

        public Criteria andUsremailEqualTo(String value) {
            addCriterion("UsrEmail =", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailNotEqualTo(String value) {
            addCriterion("UsrEmail <>", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailGreaterThan(String value) {
            addCriterion("UsrEmail >", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailGreaterThanOrEqualTo(String value) {
            addCriterion("UsrEmail >=", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailLessThan(String value) {
            addCriterion("UsrEmail <", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailLessThanOrEqualTo(String value) {
            addCriterion("UsrEmail <=", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailLike(String value) {
            addCriterion("UsrEmail like", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailNotLike(String value) {
            addCriterion("UsrEmail not like", value, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailIn(List<String> values) {
            addCriterion("UsrEmail in", values, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailNotIn(List<String> values) {
            addCriterion("UsrEmail not in", values, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailBetween(String value1, String value2) {
            addCriterion("UsrEmail between", value1, value2, "usremail");
            return (Criteria) this;
        }

        public Criteria andUsremailNotBetween(String value1, String value2) {
            addCriterion("UsrEmail not between", value1, value2, "usremail");
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