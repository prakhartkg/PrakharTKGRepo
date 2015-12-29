package MyMap;

import java.util.Arrays;

public  class MyHashMap implements MyMap {
	int initialCapacity=0;
	
	Object[] key1=new Object[initialCapacity];

	Object[] value1=new Object[initialCapacity];
	static int i=0;
	

	@Override
	public void put(Object key, Object value) {
		int index=Arrays.binarySearch(key1, key);
		if(index<0){
		key1=Arrays.copyOf(key1, key1.length+1);
		value1=Arrays.copyOf(value1, value1.length+1);
		key1[i]=key;
		value1[i]=value;
		i++;
		}else{
			value1[index]=value;
		}
				
	}


	@Override
	public Object get(Object k) {
		for(int i=0;i<key1.length;i++){
			if(key1[i].equals(k)){
				return value1[i];
			}
		}
			
		/*int index=Arrays.binarySearch(key1,k);
		System.out.println(index);
		if(index>=0)
			
		return value1[index];*/
		return null;
	}
		

	
}
