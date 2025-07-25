package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.AbstractC30318fj;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.g8 */
/* loaded from: classes8.dex */
public final class C30369g8 implements AbstractC30318fj.InterfaceC30319a<String> {
    @NotNull

    /* renamed from: a */
    private final C31145pp f79569a;

    public /* synthetic */ C30369g8() {
        this(new C31145pp());
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30318fj.InterfaceC30319a
    @NotNull
    /* renamed from: a */
    public final gl1 mo31654a(@Nullable om1<C30149d8<String>> om1Var, @NotNull C30359g3 adConfiguration) {
        C30149d8<String> c30149d8;
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        C31145pp c31145pp = this.f79569a;
        if (om1Var != null) {
            c30149d8 = om1Var.f83557a;
        } else {
            c30149d8 = null;
        }
        return c31145pp.m30605a(c30149d8, adConfiguration);
    }

    public C30369g8(@NotNull C31145pp commonReportDataProvider) {
        Intrinsics.checkNotNullParameter(commonReportDataProvider, "commonReportDataProvider");
        this.f79569a = commonReportDataProvider;
    }
}
