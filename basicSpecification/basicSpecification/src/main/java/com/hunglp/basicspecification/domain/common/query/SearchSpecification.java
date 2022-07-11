package com.hunglp.basicspecification.domain.common.query;


import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Filter;

@AllArgsConstructor
public class SearchSpecification<T> implements Specification<T> {

    private static final long serialVersionUID = -3772674969470637522L;

    private final transient SearchRequest searchRequest;

    @Override
    public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        Predicate predicate = criteriaBuilder.equal(criteriaBuilder.literal(Boolean.TRUE), Boolean.TRUE);

        for(FilterRequest filter : searchRequest.getFilters()){
            predicate = filter.getOperator().build(root,criteriaBuilder,filter,predicate);
        }

        List<Order> orders = new ArrayList<>();
        for(SortRequest sort : this.searchRequest.getSorts()){
            orders.add(sort.getSortDirection().build(root,criteriaBuilder,sort));
        }

        query.orderBy(orders);
        return predicate;

    }

    public static Pageable getPageable(Integer page, Integer size){
        return PageRequest.of(page, size);
    }

}
