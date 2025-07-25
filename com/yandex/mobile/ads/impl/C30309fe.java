package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.pp0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.fe */
/* loaded from: classes8.dex */
public final class C30309fe {
    @NotNull

    /* renamed from: a */
    private final Executor f79057a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC30014be f79058b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C30309fe() {
        this(pp0.C31146a.m30600a().m30601c(), C30087ce.m35245a());
        int i = pp0.f84044f;
    }

    /* renamed from: a */
    public final void m34169a(@NotNull final InterfaceC30231ee listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f79057a.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.no2
            {
                C30309fe.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C30309fe.m34168a(C30309fe.this, listener);
            }
        });
    }

    /* renamed from: a */
    public static final void m34168a(C30309fe this$0, InterfaceC30231ee listener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        try {
            this$0.f79058b.mo28353a(listener);
        } catch (Throwable th) {
            listener.mo33872a(th.getMessage());
        }
    }

    public C30309fe(@NotNull Executor executor, @NotNull InterfaceC30014be appMetricaAdapter) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(appMetricaAdapter, "appMetricaAdapter");
        this.f79057a = executor;
        this.f79058b = appMetricaAdapter;
    }
}
