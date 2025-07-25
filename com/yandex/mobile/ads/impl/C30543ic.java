package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.ic */
/* loaded from: classes8.dex */
public final class C30543ic {
    @NotNull

    /* renamed from: a */
    private final Executor f80401a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC30228ec f80402b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC30228ec f80403c;
    @NotNull

    /* renamed from: d */
    private final cc0 f80404d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ C30543ic(android.content.Context r9) {
        /*
            r8 = this;
            com.yandex.mobile.ads.impl.y01 r0 = new com.yandex.mobile.ads.impl.y01
            java.lang.String r1 = com.yandex.mobile.ads.impl.y01.f87980d
            r0.<init>(r1)
            java.util.concurrent.ExecutorService r4 = java.util.concurrent.Executors.newSingleThreadExecutor(r0)
            java.lang.String r0 = "newSingleThreadExecutor(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            com.yandex.mobile.ads.impl.ec0 r5 = new com.yandex.mobile.ads.impl.ec0
            r5.<init>(r9)
            com.yandex.mobile.ads.impl.dd0 r6 = new com.yandex.mobile.ads.impl.dd0
            r6.<init>(r9)
            com.yandex.mobile.ads.impl.cc0 r7 = com.yandex.mobile.ads.impl.dc0.m34973a(r9)
            r2 = r8
            r3 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C30543ic.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final void m33320a(@NotNull final InterfaceC30375gc listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f80401a.execute(new Runnable() { // from class: com.yandex.mobile.ads.impl.gq2
            {
                C30543ic.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C30543ic.m33319a(C30543ic.this, listener);
            }
        });
    }

    /* renamed from: a */
    public static final void m33319a(C30543ic this$0, InterfaceC30375gc listener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        C31967zb mo34639a = this$0.f80402b.mo34639a();
        C31967zb mo34639a2 = this$0.f80403c.mo34639a();
        this$0.f80404d.m35301b(mo34639a);
        C30011bc c30011bc = new C30011bc(mo34639a, mo34639a2, this$0.f80404d.m35302a(mo34639a));
        if (c30011bc.m35511a() == null && c30011bc.m35509c() == null) {
            listener.mo33889a();
        } else {
            listener.mo33888a(c30011bc);
        }
    }

    public C30543ic(@NotNull Context context, @NotNull Executor executor, @NotNull InterfaceC30228ec gmsAdvertisingInfoProvider, @NotNull InterfaceC30228ec hmsAdvertisingInfoProvider, @NotNull cc0 gmsAdvertisingIdStorage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(gmsAdvertisingInfoProvider, "gmsAdvertisingInfoProvider");
        Intrinsics.checkNotNullParameter(hmsAdvertisingInfoProvider, "hmsAdvertisingInfoProvider");
        Intrinsics.checkNotNullParameter(gmsAdvertisingIdStorage, "gmsAdvertisingIdStorage");
        this.f80401a = executor;
        this.f80402b = gmsAdvertisingInfoProvider;
        this.f80403c = hmsAdvertisingInfoProvider;
        this.f80404d = gmsAdvertisingIdStorage;
    }
}
