package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.v4 */
/* loaded from: classes8.dex */
public final class C31629v4 implements InterfaceC30599j3 {
    @NotNull

    /* renamed from: a */
    private final C30537i8 f86553a;
    @NotNull

    /* renamed from: b */
    private final WeakReference<e21> f86554b;

    public /* synthetic */ C31629v4(e21 e21Var) {
        this(e21Var, new C30537i8(), new WeakReference(e21Var));
    }

    @NotNull
    /* renamed from: a */
    public final C30537i8 m28536a() {
        return this.f86553a;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30599j3
    /* renamed from: a */
    public final void mo28535a(int i, @Nullable Bundle bundle) {
        e21 e21Var = this.f86554b.get();
        if (e21Var != null) {
            if (i == 19) {
                e21Var.m34693g();
            } else if (i != 20) {
                switch (i) {
                    case 6:
                        e21Var.m34695e();
                        return;
                    case 7:
                        e21Var.m34696d();
                        return;
                    case 8:
                        e21Var.m34697c();
                        return;
                    case 9:
                        e21Var.m34698b();
                        return;
                    default:
                        return;
                }
            } else {
                e21Var.m34694f();
            }
        }
    }

    public C31629v4(@NotNull e21 nativeAdEventController, @NotNull C30537i8 adResultReceiver, @NotNull WeakReference<e21> eventControllerReference) {
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        Intrinsics.checkNotNullParameter(adResultReceiver, "adResultReceiver");
        Intrinsics.checkNotNullParameter(eventControllerReference, "eventControllerReference");
        this.f86553a = adResultReceiver;
        this.f86554b = eventControllerReference;
        adResultReceiver.m33353a(this);
    }
}
