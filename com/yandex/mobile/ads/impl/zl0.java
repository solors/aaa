package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class zl0 implements ya2 {
    @NotNull

    /* renamed from: a */
    private final ik0 f88944a;

    public zl0(@NotNull ik0 instreamAdViewsHolderManager) {
        Intrinsics.checkNotNullParameter(instreamAdViewsHolderManager, "instreamAdViewsHolderManager");
        this.f88944a = instreamAdViewsHolderManager;
    }

    @Override // com.yandex.mobile.ads.impl.ya2
    @NotNull
    /* renamed from: a */
    public final List<k62> mo26144a() {
        List<k62> m17166m;
        List<k62> m33541a;
        hk0 m33219a = this.f88944a.m33219a();
        if (m33219a == null || (m33541a = m33219a.m33541a()) == null) {
            m17166m = C37563v.m17166m();
            return m17166m;
        }
        return m33541a;
    }

    @Override // com.yandex.mobile.ads.impl.ya2
    @Nullable
    public final View getView() {
        hk0 m33219a = this.f88944a.m33219a();
        if (m33219a != null) {
            return m33219a.m33540b();
        }
        return null;
    }
}
