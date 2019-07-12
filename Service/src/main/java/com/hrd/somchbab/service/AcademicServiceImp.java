package com.hrd.somchbab.service;

import com.hrd.somchbab.repository.academic_repository.AcademicRepository;
import com.hrd.somchbab.repository.model.Academic;
import com.hrd.somchbab.service.academic_service.AcademicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcademicServiceImp implements AcademicService {

    @Autowired
    AcademicRepository academicRepository;

    @Override
    public List<Academic> findAll() {
        return academicRepository.findAll();
    }
}
