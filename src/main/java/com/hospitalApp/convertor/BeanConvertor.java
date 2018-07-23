package com.hospitalApp.convertor;

import org.springframework.stereotype.Component;

import com.hospitalApp.dao.Hospital;
import com.hospitalApp.model.HospitalDto;


@Component
public class BeanConvertor {
	public  Hospital dtoToDaoConvertor(HospitalDto hospitalDto){
		Hospital hospital= new Hospital();
		hospital.setName(hospitalDto.getHospitalName());
		return hospital;
	}
}
