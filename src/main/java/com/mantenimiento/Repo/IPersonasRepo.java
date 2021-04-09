package com.mantenimiento.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mantenimiento.modelo.Personas;

public interface IPersonasRepo extends JpaRepository<Personas,Integer> {
	

}
