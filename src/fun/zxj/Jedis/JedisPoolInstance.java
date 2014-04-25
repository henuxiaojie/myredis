package fun.zxj.Jedis;

import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolInstance {

	private static JedisPool pool = null;
	static {
		pool = new JedisPool(new JedisPoolConfig(),"localhost");
	}
	public static JedisPool getInstance(){
		return pool;
	}
	
}
