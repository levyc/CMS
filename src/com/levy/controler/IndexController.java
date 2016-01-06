package com.levy.controler;

import com.levy.service.FrontService;

public class IndexController extends BaseController
{ 
	 
     public void index(){
    	 new FrontService().menu(this);
     }
} 
