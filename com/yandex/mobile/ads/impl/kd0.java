package com.yandex.mobile.ads.impl;

import com.p552ot.pubsub.p553a.C26484a;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class kd0 {
    @NotNull

    /* renamed from: a */
    private final md0 f81392a;
    @NotNull

    /* renamed from: b */
    private final jd0 f81393b;
    @NotNull

    /* renamed from: c */
    private final Executor f81394c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ kd0() {
        /*
            r4 = this;
            com.yandex.mobile.ads.impl.md0 r0 = new com.yandex.mobile.ads.impl.md0
            r0.<init>()
            com.yandex.mobile.ads.impl.jd0 r1 = new com.yandex.mobile.ads.impl.jd0
            r1.<init>()
            java.util.concurrent.ExecutorService r2 = java.util.concurrent.Executors.newSingleThreadExecutor()
            java.lang.String r3 = "newSingleThreadExecutor(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r4.<init>(r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.kd0.<init>():void");
    }

    /* renamed from: b */
    public static /* synthetic */ void m32580b(kd0 kd0Var, InterfaceC31607ur interfaceC31607ur, ld0 ld0Var) {
        m32583a(kd0Var, interfaceC31607ur, ld0Var);
    }

    /* renamed from: a */
    public final void m32582a(@NotNull final ld0 listener, @NotNull final InterfaceC31607ur hostAccessChecker) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(hostAccessChecker, "hostAccessChecker");
        this.f81394c.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.tr2
            @Override // java.lang.Runnable
            public final void run() {
                kd0.m32580b(kd0.this, hostAccessChecker, listener);
            }
        });
    }

    /* renamed from: a */
    public static final void m32583a(kd0 this$0, InterfaceC31607ur hostAccessChecker, ld0 listener) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(hostAccessChecker, "$hostAccessChecker");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        try {
            bool = this$0.m32581a(hostAccessChecker);
        } catch (Throwable unused) {
            um0.m28726c(new Object[0]);
            bool = null;
        }
        listener.mo32290a(bool);
    }

    public kd0(@NotNull md0 hostAccessCheckRequester, @NotNull jd0 hostAccessAdBlockerDetectionValidator, @NotNull Executor singleThreadExecutor) {
        Intrinsics.checkNotNullParameter(hostAccessCheckRequester, "hostAccessCheckRequester");
        Intrinsics.checkNotNullParameter(hostAccessAdBlockerDetectionValidator, "hostAccessAdBlockerDetectionValidator");
        Intrinsics.checkNotNullParameter(singleThreadExecutor, "singleThreadExecutor");
        this.f81392a = hostAccessCheckRequester;
        this.f81393b = hostAccessAdBlockerDetectionValidator;
        this.f81394c = singleThreadExecutor;
    }

    /* renamed from: a */
    private final Boolean m32581a(InterfaceC31607ur hostAccessChecker) {
        this.f81392a.getClass();
        Intrinsics.checkNotNullParameter("yandex.ru", C26484a.f69188E);
        Intrinsics.checkNotNullParameter(hostAccessChecker, "hostAccessChecker");
        FutureTask futureTask = new FutureTask(new od0("yandex.ru", hostAccessChecker, new qd0(hostAccessChecker)));
        new Thread(futureTask).start();
        this.f81392a.getClass();
        Intrinsics.checkNotNullParameter("mobile.yandexadexchange.net", C26484a.f69188E);
        Intrinsics.checkNotNullParameter(hostAccessChecker, "hostAccessChecker");
        FutureTask futureTask2 = new FutureTask(new od0("mobile.yandexadexchange.net", hostAccessChecker, new qd0(hostAccessChecker)));
        new Thread(futureTask2).start();
        boolean m31596a = ((nd0) futureTask.get()).m31596a();
        boolean m31596a2 = ((nd0) futureTask2.get()).m31596a();
        this.f81393b.getClass();
        if (m31596a2 || !m31596a) {
            if (m31596a2 || m31596a) {
                return Boolean.FALSE;
            }
            return null;
        }
        return Boolean.TRUE;
    }
}
