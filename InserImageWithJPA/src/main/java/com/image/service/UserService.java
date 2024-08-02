package com.image.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.image.entity.User;
import com.image.repository.UserRepository;

@Service
public class UserService
{
	@Autowired
	private UserRepository userRepo;

	public void saveData() throws Exception
	{
		String image_path="/home/administrator/Documents/Screenshot from 2024-05-20 16-53-55.png";
		User u = new User();
		u.setUserName("Aamir");
		u.setUserEmail("aamirams13@gmail.com");
		byte[] arr = new byte[4096];
		FileInputStream fis = new FileInputStream(new File(image_path));
		fis.read(arr);
		u.setUserImage(arr);
		

		userRepo.save(u);

	}
}
