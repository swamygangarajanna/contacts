package com.kuvira.contacts.app.dao.impl;

import java.io.IOException;

import com.kuvira.contacts.app.dao.exceptions.BadRequestException;

public class MyInterceptor extends ContactsInterceptor {
	
	MyInterceptor() {
	}
	
	@Override
	public String abc(int a, int b) throws IOException{

	return "abc";
	}
	

	public String abc(int a , float b) throws BadRequestException{

	return "def";
	}
	
	
	public static void main(String[] args) {
		try {
			System.out.println(new MyInterceptor().abc(1,2f));
			//System.out.println(new MyInterceptor().abc(1f,2f));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
