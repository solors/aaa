package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class mo0<V extends ViewGroup> {
    @NotNull

    /* renamed from: a */
    private final Context f82322a;
    @NotNull

    /* renamed from: b */
    private final ViewGroup f82323b;
    @NotNull

    /* renamed from: c */
    private final lo0<V> f82324c;
    @NotNull

    /* renamed from: d */
    private final jo0<V> f82325d;
    @NotNull

    /* renamed from: e */
    private final io0<V> f82326e;

    public mo0(@NotNull Context context, @NotNull ViewGroup container, @NotNull ArrayList designs, @NotNull lo0 layoutDesignProvider, @NotNull jo0 layoutDesignCreator, @NotNull io0 layoutDesignBinder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(designs, "designs");
        Intrinsics.checkNotNullParameter(layoutDesignProvider, "layoutDesignProvider");
        Intrinsics.checkNotNullParameter(layoutDesignCreator, "layoutDesignCreator");
        Intrinsics.checkNotNullParameter(layoutDesignBinder, "layoutDesignBinder");
        this.f82322a = context;
        this.f82323b = container;
        this.f82324c = layoutDesignProvider;
        this.f82325d = layoutDesignCreator;
        this.f82326e = layoutDesignBinder;
    }

    /* renamed from: a */
    public final boolean m31889a() {
        V m32830a;
        ho0<V> m32222a = this.f82324c.m32222a(this.f82322a);
        if (m32222a != null && (m32830a = this.f82325d.m32830a(this.f82323b, m32222a)) != null) {
            this.f82326e.m33159a(this.f82323b, m32830a, m32222a);
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void m31888b() {
        this.f82326e.m33160a(this.f82323b);
    }
}
