package com.baidu.po;

import java.util.ArrayList;
import java.util.List;

public class RegisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RegisterExample() {
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

        public Criteria andRidIsNull() {
            addCriterion("rid is null");
            return (Criteria) this;
        }

        public Criteria andRidIsNotNull() {
            addCriterion("rid is not null");
            return (Criteria) this;
        }

        public Criteria andRidEqualTo(Integer value) {
            addCriterion("rid =", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotEqualTo(Integer value) {
            addCriterion("rid <>", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThan(Integer value) {
            addCriterion("rid >", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidGreaterThanOrEqualTo(Integer value) {
            addCriterion("rid >=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThan(Integer value) {
            addCriterion("rid <", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidLessThanOrEqualTo(Integer value) {
            addCriterion("rid <=", value, "rid");
            return (Criteria) this;
        }

        public Criteria andRidIn(List<Integer> values) {
            addCriterion("rid in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotIn(List<Integer> values) {
            addCriterion("rid not in", values, "rid");
            return (Criteria) this;
        }

        public Criteria andRidBetween(Integer value1, Integer value2) {
            addCriterion("rid between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andRidNotBetween(Integer value1, Integer value2) {
            addCriterion("rid not between", value1, value2, "rid");
            return (Criteria) this;
        }

        public Criteria andLidIsNull() {
            addCriterion("lid is null");
            return (Criteria) this;
        }

        public Criteria andLidIsNotNull() {
            addCriterion("lid is not null");
            return (Criteria) this;
        }

        public Criteria andLidEqualTo(Integer value) {
            addCriterion("lid =", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotEqualTo(Integer value) {
            addCriterion("lid <>", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThan(Integer value) {
            addCriterion("lid >", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lid >=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThan(Integer value) {
            addCriterion("lid <", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidLessThanOrEqualTo(Integer value) {
            addCriterion("lid <=", value, "lid");
            return (Criteria) this;
        }

        public Criteria andLidIn(List<Integer> values) {
            addCriterion("lid in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotIn(List<Integer> values) {
            addCriterion("lid not in", values, "lid");
            return (Criteria) this;
        }

        public Criteria andLidBetween(Integer value1, Integer value2) {
            addCriterion("lid between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLidNotBetween(Integer value1, Integer value2) {
            addCriterion("lid not between", value1, value2, "lid");
            return (Criteria) this;
        }

        public Criteria andLnameIsNull() {
            addCriterion("lname is null");
            return (Criteria) this;
        }

        public Criteria andLnameIsNotNull() {
            addCriterion("lname is not null");
            return (Criteria) this;
        }

        public Criteria andLnameEqualTo(String value) {
            addCriterion("lname =", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotEqualTo(String value) {
            addCriterion("lname <>", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameGreaterThan(String value) {
            addCriterion("lname >", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameGreaterThanOrEqualTo(String value) {
            addCriterion("lname >=", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLessThan(String value) {
            addCriterion("lname <", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLessThanOrEqualTo(String value) {
            addCriterion("lname <=", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameLike(String value) {
            addCriterion("lname like", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotLike(String value) {
            addCriterion("lname not like", value, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameIn(List<String> values) {
            addCriterion("lname in", values, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotIn(List<String> values) {
            addCriterion("lname not in", values, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameBetween(String value1, String value2) {
            addCriterion("lname between", value1, value2, "lname");
            return (Criteria) this;
        }

        public Criteria andLnameNotBetween(String value1, String value2) {
            addCriterion("lname not between", value1, value2, "lname");
            return (Criteria) this;
        }

        public Criteria andPasswoedIsNull() {
            addCriterion("passwoed is null");
            return (Criteria) this;
        }

        public Criteria andPasswoedIsNotNull() {
            addCriterion("passwoed is not null");
            return (Criteria) this;
        }

        public Criteria andPasswoedEqualTo(String value) {
            addCriterion("passwoed =", value, "passwoed");
            return (Criteria) this;
        }

        public Criteria andPasswoedNotEqualTo(String value) {
            addCriterion("passwoed <>", value, "passwoed");
            return (Criteria) this;
        }

        public Criteria andPasswoedGreaterThan(String value) {
            addCriterion("passwoed >", value, "passwoed");
            return (Criteria) this;
        }

        public Criteria andPasswoedGreaterThanOrEqualTo(String value) {
            addCriterion("passwoed >=", value, "passwoed");
            return (Criteria) this;
        }

        public Criteria andPasswoedLessThan(String value) {
            addCriterion("passwoed <", value, "passwoed");
            return (Criteria) this;
        }

        public Criteria andPasswoedLessThanOrEqualTo(String value) {
            addCriterion("passwoed <=", value, "passwoed");
            return (Criteria) this;
        }

        public Criteria andPasswoedLike(String value) {
            addCriterion("passwoed like", value, "passwoed");
            return (Criteria) this;
        }

        public Criteria andPasswoedNotLike(String value) {
            addCriterion("passwoed not like", value, "passwoed");
            return (Criteria) this;
        }

        public Criteria andPasswoedIn(List<String> values) {
            addCriterion("passwoed in", values, "passwoed");
            return (Criteria) this;
        }

        public Criteria andPasswoedNotIn(List<String> values) {
            addCriterion("passwoed not in", values, "passwoed");
            return (Criteria) this;
        }

        public Criteria andPasswoedBetween(String value1, String value2) {
            addCriterion("passwoed between", value1, value2, "passwoed");
            return (Criteria) this;
        }

        public Criteria andPasswoedNotBetween(String value1, String value2) {
            addCriterion("passwoed not between", value1, value2, "passwoed");
            return (Criteria) this;
        }

        public Criteria andRsexIsNull() {
            addCriterion("rsex is null");
            return (Criteria) this;
        }

        public Criteria andRsexIsNotNull() {
            addCriterion("rsex is not null");
            return (Criteria) this;
        }

        public Criteria andRsexEqualTo(String value) {
            addCriterion("rsex =", value, "rsex");
            return (Criteria) this;
        }

        public Criteria andRsexNotEqualTo(String value) {
            addCriterion("rsex <>", value, "rsex");
            return (Criteria) this;
        }

        public Criteria andRsexGreaterThan(String value) {
            addCriterion("rsex >", value, "rsex");
            return (Criteria) this;
        }

        public Criteria andRsexGreaterThanOrEqualTo(String value) {
            addCriterion("rsex >=", value, "rsex");
            return (Criteria) this;
        }

        public Criteria andRsexLessThan(String value) {
            addCriterion("rsex <", value, "rsex");
            return (Criteria) this;
        }

        public Criteria andRsexLessThanOrEqualTo(String value) {
            addCriterion("rsex <=", value, "rsex");
            return (Criteria) this;
        }

        public Criteria andRsexLike(String value) {
            addCriterion("rsex like", value, "rsex");
            return (Criteria) this;
        }

        public Criteria andRsexNotLike(String value) {
            addCriterion("rsex not like", value, "rsex");
            return (Criteria) this;
        }

        public Criteria andRsexIn(List<String> values) {
            addCriterion("rsex in", values, "rsex");
            return (Criteria) this;
        }

        public Criteria andRsexNotIn(List<String> values) {
            addCriterion("rsex not in", values, "rsex");
            return (Criteria) this;
        }

        public Criteria andRsexBetween(String value1, String value2) {
            addCriterion("rsex between", value1, value2, "rsex");
            return (Criteria) this;
        }

        public Criteria andRsexNotBetween(String value1, String value2) {
            addCriterion("rsex not between", value1, value2, "rsex");
            return (Criteria) this;
        }

        public Criteria andImgerIsNull() {
            addCriterion("imger is null");
            return (Criteria) this;
        }

        public Criteria andImgerIsNotNull() {
            addCriterion("imger is not null");
            return (Criteria) this;
        }

        public Criteria andImgerEqualTo(String value) {
            addCriterion("imger =", value, "imger");
            return (Criteria) this;
        }

        public Criteria andImgerNotEqualTo(String value) {
            addCriterion("imger <>", value, "imger");
            return (Criteria) this;
        }

        public Criteria andImgerGreaterThan(String value) {
            addCriterion("imger >", value, "imger");
            return (Criteria) this;
        }

        public Criteria andImgerGreaterThanOrEqualTo(String value) {
            addCriterion("imger >=", value, "imger");
            return (Criteria) this;
        }

        public Criteria andImgerLessThan(String value) {
            addCriterion("imger <", value, "imger");
            return (Criteria) this;
        }

        public Criteria andImgerLessThanOrEqualTo(String value) {
            addCriterion("imger <=", value, "imger");
            return (Criteria) this;
        }

        public Criteria andImgerLike(String value) {
            addCriterion("imger like", value, "imger");
            return (Criteria) this;
        }

        public Criteria andImgerNotLike(String value) {
            addCriterion("imger not like", value, "imger");
            return (Criteria) this;
        }

        public Criteria andImgerIn(List<String> values) {
            addCriterion("imger in", values, "imger");
            return (Criteria) this;
        }

        public Criteria andImgerNotIn(List<String> values) {
            addCriterion("imger not in", values, "imger");
            return (Criteria) this;
        }

        public Criteria andImgerBetween(String value1, String value2) {
            addCriterion("imger between", value1, value2, "imger");
            return (Criteria) this;
        }

        public Criteria andImgerNotBetween(String value1, String value2) {
            addCriterion("imger not between", value1, value2, "imger");
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