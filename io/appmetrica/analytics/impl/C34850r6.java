package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.backport.Function;

/* renamed from: io.appmetrica.analytics.impl.r6 */
/* loaded from: classes9.dex */
public final class C34850r6 implements Function {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @NonNull
    /* renamed from: a */
    public final C34970vm apply(Thread thread) {
        String str;
        String name = thread.getName();
        int priority = thread.getPriority();
        long id2 = thread.getId();
        ThreadGroup threadGroup = thread.getThreadGroup();
        if (threadGroup != null) {
            str = threadGroup.getName();
        } else {
            str = "";
        }
        return new C34970vm(name, priority, id2, str, null, null);
    }
}
