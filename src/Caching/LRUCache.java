package Caching;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> {
	
	private final float loadFactor = 0.75F;
	 
	int capacity;
	int currentSize;
	
	public LRUCache(int capacity)
	{
		this.capacity = capacity;
		currentSize = 0;
	}

	LinkedHashMap<K,V> cache = new LinkedHashMap<K, V>(capacity, loadFactor, true)
			{
				@Override
				protected boolean removeEldestEntry(Map.Entry<K, V> eldest) 
				{
					return this.size() > capacity;
				}
			};
	
	public synchronized void put(K key, V value)
	{
		if(value == null)
			return;
		
		cache.put(key, value);
	}
	
	public synchronized V get(K key)
	{
		return cache.get(key);
	}
}
