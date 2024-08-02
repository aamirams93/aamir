package com.image.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CRICKET_PLAYER")
public class Player
{
	@Id
	@Column(name = "PLAYER_ID")
	private Integer playerId;

	@Column(name = "PLAYER_NAME")
	private String PlayerName;

	@Column(name = "PLAYER_AGE")
	private Integer playerAge;

	//@Column(name = "LOCATION")
	private String location;

	public Integer getPlayerId()
	{
		return playerId;
	}

	public void setPlayerId(Integer playerId)
	{
		this.playerId = playerId;
	}

	public String getPlayerName()
	{
		return PlayerName;
	}

	public void setPlayerName(String playerName)
	{
		PlayerName = playerName;
	}

	public Integer getPlayerAge()
	{
		return playerAge;
	}

	public void setPlayerAge(Integer playerAge)
	{
		this.playerAge = playerAge;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	@Override
	public String toString()
	{
		return "Player [playerId=" + playerId + ", PlayerName=" + PlayerName + ", playerAge=" + playerAge
				+ ", location=" + location + "]";
	} 
	
}
