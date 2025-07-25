package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.lh */
/* loaded from: classes8.dex */
public final class C30787lh implements InterfaceC30623jh {
    @NotNull

    /* renamed from: a */
    private final C30555ih f81807a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC30854mh f81808b;
    @NotNull

    /* renamed from: c */
    private final Object f81809c;
    @NotNull

    /* renamed from: d */
    private final ArrayList f81810d;

    public C30787lh(@NotNull vs1 sensitiveModeChecker, @NotNull C30555ih autograbCollectionEnabledValidator, @NotNull InterfaceC30854mh autograbProvider) {
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        Intrinsics.checkNotNullParameter(autograbCollectionEnabledValidator, "autograbCollectionEnabledValidator");
        Intrinsics.checkNotNullParameter(autograbProvider, "autograbProvider");
        this.f81807a = autograbCollectionEnabledValidator;
        this.f81808b = autograbProvider;
        this.f81809c = new Object();
        this.f81810d = new ArrayList();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30623jh
    /* renamed from: a */
    public final void mo32270a() {
        HashSet hashSet;
        synchronized (this.f81809c) {
            hashSet = new HashSet(this.f81810d);
            this.f81810d.clear();
            Unit unit = Unit.f99208a;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.f81808b.mo32002b((InterfaceC30947nh) it.next());
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30623jh
    /* renamed from: a */
    public final void mo32269a(@NotNull Context context, @NotNull InterfaceC30947nh autograbRequestListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(autograbRequestListener, "autograbRequestListener");
        if (this.f81807a.m33275a(context)) {
            synchronized (this.f81809c) {
                this.f81810d.add(autograbRequestListener);
                this.f81808b.mo32003a(autograbRequestListener);
                Unit unit = Unit.f99208a;
            }
            return;
        }
        autograbRequestListener.mo31511a(null);
    }
}
