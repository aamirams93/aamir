package com.image.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.image.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Serializable>
{

}
