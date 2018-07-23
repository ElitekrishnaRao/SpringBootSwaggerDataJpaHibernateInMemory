package com.hospitalApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hospitalApp.model.HospitalDto;
import com.hospitalApp.service.HospitalCrudService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/rest")
@Api(value="centralHospitalRepositpry", description="Central system having list of all hospitals")
public class HospitalAppRestController {
	
	@Autowired
	HospitalCrudService hospitalCrudService;
	
	@RequestMapping("ping")
	public String queryList() {
		return "ServerAlive";
	}

	@ApiOperation(value = "Add a hospital")
	@RequestMapping(value = "/hospitals", method = RequestMethod.POST)
	public ResponseEntity<String> addVehicle(@RequestBody HospitalDto hospitalDto) {
		try {
			hospitalCrudService.addHospital(hospitalDto);
		} catch (Exception ex) {
			ex.printStackTrace();
			return new ResponseEntity<String>("Failure", HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<String>("Success", HttpStatus.OK);
	}

}
