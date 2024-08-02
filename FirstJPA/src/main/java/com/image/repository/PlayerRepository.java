package com.image.repository;

import org.springframework.data.repository.CrudRepository;

import com.image.Entity.Player;

public interface PlayerRepository extends CrudRepository<Player, Integer>
{

}
