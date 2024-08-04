package com.zohocrm.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zohocrm.entities.Leads;

public interface leadsRepository extends JpaRepository<Leads, Long> {

}
