package com.citizen.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.citizen.Entity.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, Integer> {

	public List<Citizen> findByVaccinationCenterId(Integer id);
}
