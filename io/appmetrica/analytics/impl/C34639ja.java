package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.BiFunction;
import java.util.Arrays;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ja */
/* loaded from: classes9.dex */
public final class C34639ja implements BiFunction {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.BiFunction
    @NonNull
    /* renamed from: a */
    public final C34970vm apply(@NonNull Thread thread, @Nullable StackTraceElement[] stackTraceElementArr) {
        String str;
        List asList;
        String name = thread.getName();
        int priority = thread.getPriority();
        long id2 = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        if (threadGroup != null) {
            str = threadGroup.getName();
        } else {
            str = "";
        }
        String str2 = str;
        Integer valueOf = Integer.valueOf(thread.getState().ordinal());
        if (stackTraceElementArr == null) {
            asList = null;
        } else {
            asList = Arrays.asList(stackTraceElementArr);
        }
        return new C34970vm(name, priority, id2, str2, valueOf, asList);
    }
}
