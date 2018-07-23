package com.hospitalApp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospitalApp.convertor.BeanConvertor;
import com.hospitalApp.dao.Hospital;
import com.hospitalApp.model.HospitalDto;
import com.hospitalApp.repository.HospitalCrudRepository;

@Service
public class HospitalCrudServiceImpl implements HospitalCrudService {

	@Autowired
	BeanConvertor beanConvertor;
	
	@Autowired
	HospitalCrudRepository hospitalCrudRepository;
	
	@Override
	public void addHospital(HospitalDto hospitalDto) {
		Hospital hospital = beanConvertor.dtoToDaoConvertor(hospitalDto);
		hospitalCrudRepository.save(hospital);

	}

}
