package com.acme.sorting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.sorting.dao.SortDataModel;

/**
 * The Interface SortDataRepository.
 */
public interface SortDataRepository extends JpaRepository<SortDataModel, Long> {

}
