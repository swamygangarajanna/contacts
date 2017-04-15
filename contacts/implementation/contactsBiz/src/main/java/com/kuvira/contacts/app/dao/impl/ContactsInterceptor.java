package com.kuvira.contacts.app.dao.impl;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;

import org.hibernate.CallbackException;
import org.hibernate.EmptyInterceptor;
import org.hibernate.EntityMode;
import org.hibernate.Interceptor;
import org.hibernate.Transaction;
import org.hibernate.type.Type;

public class ContactsInterceptor extends EmptyInterceptor implements Interceptor {

	public String abc(int a, int b) throws IOException{
		return "";
	}
	
	
	@Override
	public void afterTransactionBegin(Transaction arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterTransactionCompletion(Transaction arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeTransactionCompletion(Transaction arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int[] findDirty(Object arg0, Serializable arg1, Object[] arg2, Object[] arg3, String[] arg4, Type[] arg5) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getEntity(String arg0, Serializable arg1) throws CallbackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEntityName(Object arg0) throws CallbackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object instantiate(String arg0, EntityMode arg1, Serializable arg2) throws CallbackException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isTransient(Object arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onCollectionRecreate(Object arg0, Serializable arg1) throws CallbackException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onCollectionRemove(Object arg0, Serializable arg1) throws CallbackException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onCollectionUpdate(Object arg0, Serializable arg1) throws CallbackException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onDelete(Object arg0, Serializable arg1, Object[] arg2, String[] arg3, Type[] arg4)
			throws CallbackException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onFlushDirty(Object arg0, Serializable arg1, Object[] arg2, Object[] arg3, String[] arg4,
			Type[] arg5) throws CallbackException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onLoad(Object arg0, Serializable arg1, Object[] arg2, String[] arg3, Type[] arg4)
			throws CallbackException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String onPrepareStatement(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean onSave(Object arg0, Serializable arg1, Object[] arg2, String[] arg3, Type[] arg4)
			throws CallbackException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void postFlush(Iterator arg0) throws CallbackException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void preFlush(Iterator arg0) throws CallbackException {
		// TODO Auto-generated method stub
		
	}

}
