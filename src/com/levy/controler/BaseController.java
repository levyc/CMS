package com.levy.controler;
/*
 * BaseController
 *功能：实现渲染Message模板文件的功能
 * 	  自动化将一个view文件名变更名后渲染	
 * 	 自动化将一个view文件名变更成后重定向
 * 	自动化将一个view文件名变更成PC端或移动端
 * */

import com.jfinal.core.Controller;
import com.levy.attribute.Attr;
import com.levy.utils.Config;
import com.levy.utils.StringUtils;

public class BaseController extends Controller{
	 /*用于渲染模板文件Message.html */
     public  void renderMessage(String str,String obj)
     {
    	 String script = "";
    	  if(StringUtils.isEmpty(obj)){//关闭页面
    		  script = "closeIframe();";
    	  }
    	  else if(script.endsWith(".jsp")){
    		  script = "window.location.href = \"" + obj + "\"";
		}
    	  else {
			script = obj ;
		}
    	 setAttr("msg",str);
    	 setAttr("script", script);
    	 render("pages/template/message.html");
     }
     public void renderMessage(String str){
    	 renderMessage(str, "closeIframe();");
     }
     public void renderMessageByFailed(String str){
    	 renderMessage(str,"history.back();");
     }
     public void renderAuto(String view) {
 		String path = getAutoPath(view);

 		super.render(path);
 	}

 	public void redirectAuto(String view) {
 		String path = getAutoPath(view);

 		super.redirect(path);
 	}

 	protected String getAutoPath(String view) {  //通过session检查是移动端还是PC端访问
 		String path = view;

 		if (!view.startsWith("/")) {
 			path = "/" + path;
 		}

 		path = (isMoblie() ? Attr.PATH_MOBILE : Attr.PATH_PC) + path;//用于判断是移动设备还是PC设备  得以加上合适的前缀以获得适合的网址

 		if (view.startsWith("/")) {
 			path = "/" + path;
 		}

 		path = path.replace("//", "/");
 		return path;
 	}

 	public boolean isMoblie() { //用于判断是不是移动端
 		return getSessionAttr(Config.getStr("ATTR.SESSION_IS_MOILE"));
 	}
     
}
