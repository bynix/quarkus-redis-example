package io.spinach;

import javax.annotation.PreDestroy;
import javax.inject.Singleton;

/**
 * @author aomsweet
 */
@Singleton
public class DestroyAbleBean {

    @PreDestroy
    public void destroy() {
        System.out.println("DestroyAbleBean destroying...");
    }
}
