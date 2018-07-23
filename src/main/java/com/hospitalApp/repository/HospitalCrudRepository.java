package com.hospitalApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospitalApp.dao.Hospital;


public interface HospitalCrudRepository extends JpaRepository<Hospital, Integer>{

}
