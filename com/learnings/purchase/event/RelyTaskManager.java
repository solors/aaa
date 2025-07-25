package com.learnings.purchase.event;

import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class RelyTaskManager {
    public static final String TASK_PURCHASE_EVENT_INIT_FINISH = "task_purchase_event_init_finish";
    private final Map<String, Runnable> mTaskMap;
    private final Set<String> mTaskStatusSet;

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
            Runnable runnable = this.mTaskMap.get(str);
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.mTaskMap.remove(str);
            this.mTaskStatusSet.remove(str);
        }
    }

    public void dealTask(String str, Runnable runnable) {
        synchronized (this) {
            if (this.mTaskMap.containsKey(str)) {
                return;
            }
            this.mTaskMap.put(str, runnable);
            if (this.mTaskStatusSet.contains(str)) {
                realDealTask(str);
            }
        }
    }

    public void markTaskCanDeal(String str) {
        synchronized (this) {
            if (this.mTaskStatusSet.contains(str)) {
                return;
            }
            this.mTaskStatusSet.add(str);
            realDealTask(str);
        }
    }

    private RelyTaskManager() {
        this.mTaskMap = new ArrayMap();
        this.mTaskStatusSet = new ArraySet();
    }
}
