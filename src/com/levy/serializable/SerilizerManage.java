package com.levy.serializable;

import java.util.HashMap;
import java.util.Map;


public class SerilizerManage 
{
	private static final Map<String, Serializer> map = new HashMap<String, Serializer>();

	static {
		map.put("java", new JavaSerializer());
	}

	public static void add(String key, Serializer serializer) {
		map.put(key, serializer);
	}

	public static Serializer get(String key) {
		return map.get(key);
	}
}
