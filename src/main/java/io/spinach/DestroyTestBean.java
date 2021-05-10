package io.spinach;

import io.quarkus.runtime.Startup;
import io.vertx.redis.client.RedisAPI;

import javax.annotation.PreDestroy;
import javax.inject.Inject;

/**
 * @author aomsweet
 */
@Startup
public class DestroyTestBean {

    @Inject
    RedisAPI redisAPI;

    @PreDestroy
    public void destroy() {
        System.out.println("DestroyAbleBean destroying...");
    }
}
