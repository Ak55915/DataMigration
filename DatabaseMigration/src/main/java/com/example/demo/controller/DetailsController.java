package com.example.demo.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dataSource.DataSourceContextHolder;
import com.example.demo.dataSource.DataSourceEnum;
import com.example.demo.user.User;
import com.example.demo.user.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class DetailsController {
	 private UserService userService;
	    private  DataSourceContextHolder dataSourceContextHolder;
	    @GetMapping(value="/getEmployeeDetails/{dataSourceType}" , produces=MediaType.APPLICATION_JSON_VALUE)
	    public List<User> getAllEmployeeDetails(@PathVariable("dataSourceType") String dataSourceType) throws Exception{
	        if(DataSourceEnum.DATASOURCE_TWO.toString().equals(dataSourceType)){
	            dataSourceContextHolder.setBranchContext(DataSourceEnum.DATASOURCE_TWO);
	        }else{
	            dataSourceContextHolder.setBranchContext(DataSourceEnum.DATASOURCE_ONE);
	        }
	        return userService.getAllUserDetails(); 
	    }
	
}
