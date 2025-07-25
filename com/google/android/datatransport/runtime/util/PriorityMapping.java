package com.google.android.datatransport.runtime.util;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.google.android.datatransport.Priority;
import java.util.HashMap;

/* loaded from: classes4.dex */
public final class PriorityMapping {

    /* renamed from: a */
    private static SparseArray<Priority> f31326a = new SparseArray<>();

    /* renamed from: b */
    private static HashMap<Priority, Integer> f31327b;

    static {
        HashMap<Priority, Integer> hashMap = new HashMap<>();
        f31327b = hashMap;
        hashMap.put(Priority.DEFAULT, 0);
        f31327b.put(Priority.VERY_LOW, 1);
        f31327b.put(Priority.HIGHEST, 2);
        for (Priority priority : f31327b.keySet()) {
            f31326a.append(f31327b.get(priority).intValue(), priority);
        }
    }

    public static int toInt(@NonNull Priority priority) {
        Integer num = f31327b.get(priority);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + priority);
    }

    @NonNull
    public static Priority valueOf(int i) {
        Priority priority = f31326a.get(i);
        if (priority != null) {
            return priority;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i);
    }
}
