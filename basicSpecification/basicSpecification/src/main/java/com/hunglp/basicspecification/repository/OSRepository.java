package com.hunglp.basicspecification.repository;

import com.hunglp.basicspecification.domain.dao.OperatingSystem;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface OSRepository extends JpaRepository<OperatingSystem, Long>, JpaSpecificationExecutor<OperatingSystem> {
}
