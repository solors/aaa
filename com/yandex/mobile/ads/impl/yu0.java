package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.base.model.MediationNetwork;
import com.monetization.ads.mediation.base.C25606a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class yu0<T extends C25606a> {
    @NotNull

    /* renamed from: a */
    private final List<MediationNetwork> f88552a;
    @NotNull

    /* renamed from: b */
    private final s50 f88553b;
    @NotNull

    /* renamed from: c */
    private final bv0<T> f88554c;

    /* renamed from: d */
    private int f88555d;

    public /* synthetic */ yu0(List list, kv0 kv0Var, fv0 fv0Var) {
        this(list, kv0Var, fv0Var, new bv0(fv0Var));
    }

    @Nullable
    /* renamed from: a */
    public final qu0<T> m26572a(@NotNull Context context, @NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        while (this.f88555d < this.f88552a.size()) {
            List<MediationNetwork> list = this.f88552a;
            int i = this.f88555d;
            this.f88555d = i + 1;
            MediationNetwork mediationNetwork = list.get(i);
            T m35434a = this.f88554c.m35434a(context, mediationNetwork, clazz);
            if (m35434a != null) {
                return new qu0<>(m35434a, mediationNetwork, this.f88553b);
            }
        }
        return null;
    }

    public yu0(@NotNull List mediationNetworks, @NotNull kv0 extrasCreator, @NotNull fv0 mediatedAdapterReporter, @NotNull bv0 mediatedAdapterCreator) {
        Intrinsics.checkNotNullParameter(mediationNetworks, "mediationNetworks");
        Intrinsics.checkNotNullParameter(extrasCreator, "extrasCreator");
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(mediatedAdapterCreator, "mediatedAdapterCreator");
        this.f88552a = mediationNetworks;
        this.f88553b = extrasCreator;
        this.f88554c = mediatedAdapterCreator;
    }
}
