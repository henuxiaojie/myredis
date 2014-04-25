package fun.zxj.Jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class JedisDemo {

	private JedisPool pool = JedisPoolInstance.getInstance();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try{
			
		}catch(){
			
		}
		jedis.set("mysex", "test");
	}
	public <T> void pushCache(String key,T value){
		Jedis jedis = pool.getResource();
		try{
			jedis.set(key, value);
		}catch(){
			
		}
	}

}
