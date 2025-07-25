package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ge1;
import com.yandex.mobile.ads.impl.oc1;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class n40 {

    /* renamed from: c */
    private static final long f82609c = TimeUnit.SECONDS.toMillis(10);
    @NotNull

    /* renamed from: a */
    private final ge1.InterfaceC30382b f82610a;
    @NotNull

    /* renamed from: b */
    private final oc1 f82611b;

    /* renamed from: com.yandex.mobile.ads.impl.n40$a */
    /* loaded from: classes8.dex */
    private final class C30910a implements qc1 {
        public C30910a() {
        }

        @Override // com.yandex.mobile.ads.impl.qc1
        /* renamed from: a */
        public final void mo25973a() {
            n40.this.f82610a.mo28031b(a40.m35975a());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n40(ge1.InterfaceC30382b interfaceC30382b) {
        this(interfaceC30382b, oc1.C31031a.m31055a(false));
        int i = oc1.f83452a;
    }

    /* renamed from: b */
    public final void m31662b() {
        this.f82611b.stop();
    }

    /* renamed from: a */
    public final void m31664a() {
        this.f82611b.mo30764a(f82609c, new C30910a());
    }

    public n40(@NotNull ge1.InterfaceC30382b eventListener, @NotNull oc1 pausableTimer) {
        Intrinsics.checkNotNullParameter(eventListener, "eventListener");
        Intrinsics.checkNotNullParameter(pausableTimer, "pausableTimer");
        this.f82610a = eventListener;
        this.f82611b = pausableTimer;
    }
}
