package com.hunglp.basicspecification.service;


import com.hunglp.basicspecification.domain.common.query.SearchRequest;
import com.hunglp.basicspecification.domain.common.query.SearchSpecification;
import com.hunglp.basicspecification.domain.dao.OperatingSystem;
import com.hunglp.basicspecification.repository.OSRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class OSService {

    @Autowired
    private OSRepository osRepository;

    public Page<OperatingSystem> searchOperatingSystem(SearchRequest request){
        SearchSpecification<OperatingSystem> specification = new SearchSpecification<>(request);
        Pageable pageable = SearchSpecification.getPageable(request.getPage() != null ? request.getPage() : 0, request.getSize() != null ? request.getSize() : 20);
        return osRepository.findAll(specification, pageable);
    }


}
