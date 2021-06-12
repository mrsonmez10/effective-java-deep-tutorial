package com.effectivejava.tutorial.effectivejava.item3;

import java.util.HashMap;

public class EagerCache implements Cache {
		
	private static final EagerCache instance = new EagerCache();
	private HashMap<Object, Object> map;

	private EagerCache() { 
		map = new HashMap<Object, Object>();
	}

	public void put(Object key, Object value) {
		map = new HashMap<Object, Object>();
	}

	public Object get(Object key) {
		return map.get(key);
	}
	
    public static EagerCache getInstance(){
        return instance;
    }

}
