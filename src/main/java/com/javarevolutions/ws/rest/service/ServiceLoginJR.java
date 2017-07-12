package com.javarevolutions.ws.rest.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javarevolutions.ws.rest.vo.VOUser;


@Path("/JavaRevolutions")
public class ServiceLoginJR {

	@POST
	@Path("/validUser")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUser validUser(VOUser vo){
		/*vo.setUserValid(false);
		if(vo.getUsername().equals("nikhil") && vo.getPassword().equals("nikhil")){
			vo.setUserValid(true);
		}*/
		VOUser newUser= new VOUser(vo.getUsername(), vo.getPassword(), vo.isUserValid());
		List<VOUser> list = new ArrayList<VOUser>();
		list=createUserList();
		list.add(newUser);
		//add(vo.getUsername(), vo.getPassword(), vo.isUserValid());
		
		return vo;
		
	}
	


	@GET
	@Path("/getUser")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})	
	public List<VOUser> getUser(){
		
			List<VOUser> list = new ArrayList<VOUser>();
			list=createUserList();
			return  list;
			
		}
	
	public List<VOUser> createUserList()
	{
		VOUser akashUser=new VOUser("Akash", "akash", true);
		VOUser nikhilUser=new VOUser("Nikhil", "nikhil", true);
		VOUser SanketUser=new VOUser("Sanket", "sanket", true);
		VOUser SachinUser=new VOUser("Sachin", "sachin", true);

		List<VOUser> listofUsers = new ArrayList<VOUser>();
		listofUsers.add(akashUser);
		listofUsers.add(nikhilUser);
		listofUsers.add(SanketUser);
		listofUsers.add(SachinUser);
		return listofUsers;
	}
	
	
}
