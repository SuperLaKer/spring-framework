package com.slk.proxy;

import org.omg.CORBA.SystemException;
import org.omg.CORBA.portable.InputStream;
import org.omg.CORBA.portable.InvokeHandler;
import org.omg.CORBA.portable.OutputStream;
import org.omg.CORBA.portable.ResponseHandler;

import java.lang.reflect.Proxy;

public class DaoProxy implements InvokeHandler {

	@Override
	public OutputStream _invoke(String method, InputStream input, ResponseHandler handler) throws SystemException {
		return null;
	}
}
