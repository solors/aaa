package com.inmobi.media;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.Z1 */
/* loaded from: classes6.dex */
public abstract class AbstractC19183Z1 {

    /* renamed from: a */
    public static final C19428q9 f48030a;

    static {
        int i = C19428q9.f48599a;
        ThreadFactoryC18962I4 threadFactory = new ThreadFactoryC18962I4("ClickManagerExecutor", true);
        Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
        C19428q9 c19428q9 = new C19428q9(TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), threadFactory);
        Intrinsics.m17073h(c19428q9, "null cannot be cast to non-null type com.inmobi.commons.sdk.PriorityExecutor");
        f48030a = c19428q9;
    }

    /* renamed from: a */
    public static void m60516a(Runnable runnable, EnumC19414p9 enumC19414p9) {
        try {
            C19428q9 c19428q9 = f48030a;
            c19428q9.getClass();
            Intrinsics.m17074g(enumC19414p9);
            c19428q9.execute(new C19239d2(runnable, enumC19414p9));
        } catch (RejectedExecutionException unused) {
        }
    }
}
