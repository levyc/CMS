package com.levy.config;

import org.beetl.core.GroupTemplate;
import org.beetl.ext.jfinal.BeetlRenderFactory;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.levy.controler.IndexController;
import com.levy.controler.MysControler;

public class MysConfig extends JFinalConfig
{

	@Override
	public void configConstant(Constants arg0)
	{
		// TODO Auto-generated method stub
		arg0.setDevMode(true);
		arg0.setMainRenderFactory(new BeetlRenderFactory());
		GroupTemplate gt = BeetlRenderFactory.groupTemplate;
	}

	@Override
	public void configHandler(Handlers arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configInterceptor(Interceptors arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configPlugin(Plugins arg0)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void configRoute(Routes arg0)
	{
		// TODO Auto-generated method stub
		arg0.add("/",IndexController.class);
	}
    
} 
