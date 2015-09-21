package com.lamfire.redis;

import redis.clients.jedis.BasicCommands;
import redis.clients.jedis.DebugParams;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * Created with IntelliJ IDEA.
 * User: linfan
 * Date: 15-9-15
 * Time: 上午11:20
 * To change this template use File | Settings | File Templates.
 */
public class Admin implements BasicCommands {
    private JedisPool pool;

    Admin(JedisPool pool){
        this.pool = pool;
    }

    @Override
    public String ping() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.ping();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String quit() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.quit();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String flushDB() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.flushDB();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long dbSize() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.dbSize();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String select(int index) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.select(index);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String flushAll() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.flushAll();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String auth(String password) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.auth(password);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String save() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.save();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String bgsave() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.bgsave();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String bgrewriteaof() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.bgrewriteaof();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long lastsave() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.lastsave();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String shutdown() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.shutdown();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String info() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.info();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String info(String section) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.info(section);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String slaveof(String host, int port) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.slaveof(host,port);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String slaveofNoOne() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.slaveofNoOne();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long getDB() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.getDB();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String debug(DebugParams params) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.debug(params);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public String configResetStat() {
        Jedis jedis = pool.getResource();
        try {
            return jedis.configResetStat();

        } finally {
            pool.returnResourceObject(jedis);
        }
    }

    @Override
    public Long waitReplicas(int replicas, long timeout) {
        Jedis jedis = pool.getResource();
        try {
            return jedis.waitReplicas(replicas, timeout);

        } finally {
            pool.returnResourceObject(jedis);
        }
    }
}
