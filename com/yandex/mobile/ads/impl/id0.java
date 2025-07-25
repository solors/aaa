package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class id0 {
    @NotNull

    /* renamed from: a */
    private final kd0 f80420a;
    @NotNull

    /* renamed from: b */
    private final C30356g2 f80421b;
    @NotNull

    /* renamed from: c */
    private final pd0 f80422c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ id0(android.content.Context r4) {
        /*
            r3 = this;
            com.yandex.mobile.ads.impl.kd0 r0 = new com.yandex.mobile.ads.impl.kd0
            r0.<init>()
            int r1 = com.yandex.mobile.ads.impl.C30356g2.f79435e
            com.yandex.mobile.ads.impl.g2 r1 = com.yandex.mobile.ads.impl.C30356g2.C30357a.m33996a(r4)
            com.yandex.mobile.ads.impl.pd0 r2 = new com.yandex.mobile.ads.impl.pd0
            r2.<init>(r4)
            r3.<init>(r4, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.id0.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public final void m33305a(@NotNull final InterfaceC31786x1 adBlockerDetectorListener, @NotNull final EnumC31944z1 requestPolicy) {
        Intrinsics.checkNotNullParameter(adBlockerDetectorListener, "adBlockerDetectorListener");
        Intrinsics.checkNotNullParameter(requestPolicy, "requestPolicy");
        this.f80420a.m32582a(new ld0() { // from class: com.yandex.mobile.ads.impl.jq2
            {
                id0.this = this;
            }

            @Override // com.yandex.mobile.ads.impl.ld0
            /* renamed from: a */
            public final void mo32290a(Boolean bool) {
                id0.m33306a(id0.this, requestPolicy, adBlockerDetectorListener, bool);
            }
        }, this.f80422c.m30758a(requestPolicy));
    }

    public id0(@NotNull Context context, @NotNull kd0 hostAccessAdBlockerDetector, @NotNull C30356g2 adBlockerStateStorageManager, @NotNull pd0 hostAccessCheckerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(hostAccessAdBlockerDetector, "hostAccessAdBlockerDetector");
        Intrinsics.checkNotNullParameter(adBlockerStateStorageManager, "adBlockerStateStorageManager");
        Intrinsics.checkNotNullParameter(hostAccessCheckerFactory, "hostAccessCheckerFactory");
        this.f80420a = hostAccessAdBlockerDetector;
        this.f80421b = adBlockerStateStorageManager;
        this.f80422c = hostAccessCheckerFactory;
    }

    /* renamed from: a */
    public static final void m33306a(id0 this$0, EnumC31944z1 requestPolicy, InterfaceC31786x1 adBlockerDetectorListener, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(requestPolicy, "$requestPolicy");
        Intrinsics.checkNotNullParameter(adBlockerDetectorListener, "$adBlockerDetectorListener");
        this$0.f80421b.m33998a(bool, requestPolicy);
        adBlockerDetectorListener.mo27707a();
    }
}
