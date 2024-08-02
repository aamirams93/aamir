package com.image.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "TBL_USER_IMAGE")
public class User
{
	@Id
	@Column(name = "USER_ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "USER_EMAIL")
	private String userEmail;

	@Column(name = "USER_IMAGE",length = 100000)
	//@Lob // for large Object
	private byte[] userImage;
}
