package com.sortdemo.sorting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sortdemo.sorting.dao.SortDataModel;

/**
 * The Interface SortDataRepository.
 */
public interface SortDataRepository extends JpaRepository<SortDataModel, Long> {

}
