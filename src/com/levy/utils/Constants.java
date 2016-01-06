package com.levy.utils;

import com.levy.utils.Config;


	/**
	 * 常量类
	 * 
	 * @author flyfox 2012.08.08
	 * @email 330627517@qq.com
	 */
	public class Constants {

		/**
		 * 底层调试标示
		 */
		public static final boolean DEBUG = Config.getToBoolean("CONSTANTS.DEBUG");
		/**
		 * 测试标示
		 */
		public static final boolean TEST = Config.getToBoolean("CONSTANTS.TEST");
		/**
		 * 默认分页
		 */
		public static final int DEFAULT_PAGE_SIZE = Config.getToInt("CONSTANTS.DEFAULT_PAGE_SIZE");
	}

