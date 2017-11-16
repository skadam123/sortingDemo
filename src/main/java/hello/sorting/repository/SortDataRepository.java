package hello.sorting.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hello.sorting.dao.SortDataModel;

public interface SortDataRepository extends JpaRepository<SortDataModel,Long>{

}
