package com.meevii.adsdk.common;

import androidx.collection.ArrayMap;
import androidx.collection.ArraySet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes6.dex */
public class AdRelyTaskManager {
    private static volatile AdRelyTaskManager sAdRelyTaskManager;
    private Map<String, List<Runnable>> mTaskMap = new ArrayMap();
    private Set<String> mTaskStatusSet = new ArraySet();

    private AdRelyTaskManager() {
    }

    public static AdRelyTaskManager getInstance() {
        if (sAdRelyTaskManager == null) {
            synchronized (AdRelyTaskManager.class) {
                if (sAdRelyTaskManager == null) {
                    sAdRelyTaskManager = new AdRelyTaskManager();
                }
            }
        }
        return sAdRelyTaskManager;
    }

    private void realDealTask(String str) {
        synchronized (this) {
            List<Runnable> list = this.mTaskMap.get(str);
            if (list == null) {
                return;
            }
            for (Runnable runnable : list) {
                runnable.run();
            }
            this.mTaskMap.remove(str);
        }
    }

    public void dealTask(String str, Runnable runnable) {
        synchronized (this) {
            if (this.mTaskStatusSet.contains(str)) {
                runnable.run();
                return;
            }
            if (this.mTaskMap.containsKey(str)) {
                this.mTaskMap.get(str).add(runnable);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(runnable);
                this.mTaskMap.put(str, arrayList);
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
}
