package com.hunglp.basicspecification.domain.common.query;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Root;

public enum SortDirection {
    ASC {
        public <T> Order build(Root<T> root, CriteriaBuilder criteriaBuilder, SortRequest sortRequest) {
            return criteriaBuilder.asc(root.get(sortRequest.getKey()));
        }
    },

    DESC {
        public <T> Order build(Root<T> root, CriteriaBuilder criteriaBuilder, SortRequest sortRequest) {
            return criteriaBuilder.desc((root.get(sortRequest.getKey())));
        }
    };

    public abstract <T> Order build(Root<T> root, CriteriaBuilder criteriaBuilder, SortRequest sortRequest);


}
