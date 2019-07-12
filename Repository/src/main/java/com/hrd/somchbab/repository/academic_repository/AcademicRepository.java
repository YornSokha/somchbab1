package com.hrd.somchbab.repository.academic_repository;

import com.hrd.somchbab.repository.model.Academic;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AcademicRepository {

    @Select("SELECT * FROM sc_academics")
    List<Academic> findAll();
}
