package com.vungle.ads.internal.task;

import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.vungle.ads.internal.task.h */
/* loaded from: classes7.dex */
public abstract class PriorityRunnable implements VungleThreadPoolExecutor.InterfaceRunnableC29202b {
    @Override // java.lang.Comparable
    public int compareTo(@NotNull Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other instanceof PriorityRunnable) {
            return Intrinsics.m17071j(((PriorityRunnable) other).getPriority(), getPriority());
        }
        return -1;
    }

    public abstract int getPriority();
}
