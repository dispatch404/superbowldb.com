package com.superbowldb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.superbowldb.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{

}
