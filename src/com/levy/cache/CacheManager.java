package com.levy.cache;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import com.levy.cache.Caches;
import com.levy.cache.ICacheManager;
import com.levy.serializable.MemorySerializeCache;
import com.levy.serializable.SerilizerManage;

public class CacheManager
{
	private static ConcurrentHashMap<String, Caches> cacheManager = new ConcurrentHashMap<String,Caches>();
	static ICacheManager _CreateCache;

	protected CacheManager() {
	}

	static {
		_CreateCache = new ICacheManager() {
			public Caches getCache() {
				return new MemorySerializeCache(SerilizerManage.get("java"));
			}
		};
	}

	public static void setCache(ICacheManager thisCache) {
		_CreateCache = thisCache;
	}

	public static Caches get(String name) {
		Caches cache = cacheManager.get(name);
		if (cache == null) {
			synchronized (cacheManager) {
				cache = cacheManager.get(name);
				if (cache == null) {
					cache = _CreateCache.getCache();
					cache.name(name);
					cacheManager.put(name, cache);
				}
			}
		}
		return cache;
	}

	public static int size() {
		return cacheManager.size();
	}

	public static Collection<Caches> values() {
		return cacheManager.values();
	}

	public static Set<String> keys() {
		return cacheManager.keySet();
	}

}
