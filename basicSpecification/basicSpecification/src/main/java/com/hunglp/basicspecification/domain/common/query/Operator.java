package com.hunglp.basicspecification.domain.common.query;

import lombok.extern.slf4j.Slf4j;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@Slf4j
public enum Operator {

    EQUAL{
        public  <T> Predicate build(Root<T> root, CriteriaBuilder criteriaBuilder, FilterRequest filterRequest, Predicate predicate){
            Object value = filterRequest.getFieldType().parse(filterRequest.getValue().toString());
            Expression<?> key = root.get(filterRequest.getKey());
            return criteriaBuilder.and(criteriaBuilder.equal(key,value), predicate);
        }
    };



    public abstract <T> Predicate build(Root<T> root, CriteriaBuilder criteriaBuilder, FilterRequest filterRequest, Predicate predicate);

}
