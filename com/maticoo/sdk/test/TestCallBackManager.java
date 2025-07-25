package com.maticoo.sdk.test;

import androidx.annotation.VisibleForTesting;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.util.concurrent.ConcurrentHashMap;

@VisibleForTesting
/* loaded from: classes6.dex */
public class TestCallBackManager {
    private static final ConcurrentHashMap<String, TestCallBackManager> MANAGERS = new ConcurrentHashMap<>(2);
    private boolean counter = true;
    private Runnable idleCallback;
    private final String name;

    private TestCallBackManager(String str) {
        this.name = str;
    }

    public static String deTestPlacementId(String str) {
        String[] split = str.split("_");
        if (split.length > 1) {
            return split[0];
        }
        return str;
    }

    @VisibleForTesting
    public static TestCallBackManager getAndCreate(String str) {
        ConcurrentHashMap<String, TestCallBackManager> concurrentHashMap = MANAGERS;
        synchronized (concurrentHashMap) {
            if (concurrentHashMap.get(str) == null) {
                concurrentHashMap.put(str, new TestCallBackManager(str));
            }
        }
        return concurrentHashMap.get(str);
    }

    public void executeIdleCallBack() {
        if (this.counter) {
            return;
        }
        this.counter = true;
        Runnable runnable = this.idleCallback;
        if (runnable != null) {
            runnable.run();
            this.idleCallback = null;
        }
        MANAGERS.remove(this.name);
        DeveloperLog.LogD("TestCallBackManager", String.format("executeIdleCallBack name:%s, thread-name:%s", this.name, Thread.currentThread().getName()));
    }

    public String getName() {
        return this.name;
    }

    public void increment() {
        this.counter = false;
        DeveloperLog.LogD("TestCallBackManager", "increment name=" + this.name);
    }

    public boolean isIdleNow() {
        return this.counter;
    }

    public void setIdleCallback(Runnable runnable) {
        this.idleCallback = runnable;
    }
}
