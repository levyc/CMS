package com.levy.cache;

import java.util.List;

public interface Caches {

		/**
		 * 设置缓存名称
		 * 
		 * 2015年4月26日 下午8:31:14 flyfox 330627517@qq.com
		 * 
		 * @param name
		 * @return
		 */
		public Caches name(String name);

		/**
		 * 根据key获取缓存数据
		 * 
		 * 2015年4月26日 下午8:31:25 flyfox 330627517@qq.com
		 * 
		 * @param key
		 * @return
		 */
		public <T> T get(String key);

		/**
		 * 添加缓存获取
		 * 
		 * 2015年4月26日 下午8:31:46 flyfox 330627517@qq.com
		 * 
		 * @param key
		 * @param value
		 * @return
		 */
		public Caches add(String key, Object value);

		/**
		 * 移除缓存数据
		 * 
		 * 2015年4月26日 下午8:31:52 flyfox 330627517@qq.com
		 * 
		 * @param key
		 * @return
		 */
		public Object remove(String key);
		
		/**
		 * 清楚所有数据
		 * 
		 * 2015年4月26日 下午8:31:52 flyfox 330627517@qq.com
		 * 
		 * @return
		 */
		public void clear();

		/**
		 * 获取缓存数量
		 * 
		 * 2015年4月26日 下午8:31:59 flyfox 330627517@qq.com
		 * 
		 * @return
		 */
		public int size();

		/**
		 * 返回缓存列表
		 * 
		 * 2015年4月26日 下午8:33:11 flyfox 330627517@qq.com
		 * 
		 * @return
		 */
		public <T> List<T> list();
	}


