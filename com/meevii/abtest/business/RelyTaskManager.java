package com.meevii.abtest.business;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class RelyTaskManager {
    private final Map<String, Runnable> taskMap;
    private final Set<String> taskStatusSet;

    /* loaded from: classes6.dex */
    private static class Holder {
        private static final RelyTaskManager singleton = new RelyTaskManager();

        private Holder() {
        }
    }

    public static RelyTaskManager get() {
        return Holder.singleton;
    }

    private void realDealTask(String str) {
        synchronized (this) {
            Runnable runnable = this.taskMap.get(str);
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.taskMap.remove(str);
        }
    }

    public void dealTask(String str, Runnable runnable) {
        synchronized (this) {
            if (this.taskMap.containsKey(str)) {
                return;
            }
            this.taskMap.put(str, runnable);
            if (this.taskStatusSet.contains(str)) {
                realDealTask(str);
            }
        }
    }

    public void markTaskCanDeal(String str) {
        synchronized (this) {
            if (this.taskStatusSet.contains(str)) {
                return;
            }
            this.taskStatusSet.add(str);
            realDealTask(str);
        }
    }

    private RelyTaskManager() {
        this.taskMap = new HashMap();
        this.taskStatusSet = new HashSet();
    }
}
