package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class io1<V extends ViewGroup> implements InterfaceC30890mz<V> {
    @NotNull

    /* renamed from: a */
    private final C29980b1 f80570a;
    @NotNull

    /* renamed from: b */
    private final l02 f80571b;
    @NotNull

    /* renamed from: c */
    private final q61 f80572c;
    @NotNull

    /* renamed from: d */
    private final InterfaceC30065c1 f80573d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.io1$a */
    /* loaded from: classes8.dex */
    public static final class C30574a implements InterfaceC30065c1 {
        @NotNull

        /* renamed from: a */
        private final q61 f80574a;

        public C30574a(@NotNull q61 nativeRewardViewController) {
            Intrinsics.checkNotNullParameter(nativeRewardViewController, "nativeRewardViewController");
            this.f80574a = nativeRewardViewController;
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30065c1
        /* renamed from: a */
        public final void mo26079a() {
            this.f80574a.m30457c();
        }

        @Override // com.yandex.mobile.ads.impl.InterfaceC30065c1
        /* renamed from: b */
        public final void mo26076b() {
            this.f80574a.m30459b();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ io1(com.yandex.mobile.ads.impl.C29980b1 r8, com.yandex.mobile.ads.impl.m02 r9, com.yandex.mobile.ads.impl.b61 r10, com.yandex.mobile.ads.impl.e02 r11) {
        /*
            r7 = this;
            com.yandex.mobile.ads.impl.q61 r5 = new com.yandex.mobile.ads.impl.q61
            r5.<init>(r9, r10, r11)
            com.yandex.mobile.ads.impl.io1$a r6 = new com.yandex.mobile.ads.impl.io1$a
            r6.<init>(r5)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.io1.<init>(com.yandex.mobile.ads.impl.b1, com.yandex.mobile.ads.impl.m02, com.yandex.mobile.ads.impl.b61, com.yandex.mobile.ads.impl.e02):void");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: a */
    public final void mo26077a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f80570a.m35719a(this.f80573d);
        this.f80572c.m30461a(this.f80571b.mo32162b(container));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30890mz
    /* renamed from: c */
    public final void mo26075c() {
        this.f80570a.m35717b(this.f80573d);
        this.f80572c.m30462a();
    }

    public io1(@NotNull C29980b1 adActivityEventController, @NotNull m02 timerViewProvider, @NotNull b61 nativeMediaContent, @NotNull e02 timeProviderContainer, @NotNull q61 nativeRewardViewController, @NotNull InterfaceC30065c1 adActivityFocusListener) {
        Intrinsics.checkNotNullParameter(adActivityEventController, "adActivityEventController");
        Intrinsics.checkNotNullParameter(timerViewProvider, "timerViewProvider");
        Intrinsics.checkNotNullParameter(nativeMediaContent, "nativeMediaContent");
        Intrinsics.checkNotNullParameter(timeProviderContainer, "timeProviderContainer");
        Intrinsics.checkNotNullParameter(nativeRewardViewController, "nativeRewardViewController");
        Intrinsics.checkNotNullParameter(adActivityFocusListener, "adActivityFocusListener");
        this.f80570a = adActivityEventController;
        this.f80571b = timerViewProvider;
        this.f80572c = nativeRewardViewController;
        this.f80573d = adActivityFocusListener;
    }
}
