package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class so0 {
    @NotNull

    /* renamed from: a */
    private final List<C31034of<?>> f85318a;

    private so0(List list) {
        this.f85318a = list;
    }

    @NotNull
    /* renamed from: a */
    public final List<C31034of<?>> m29576a() {
        return this.f85318a;
    }

    /* renamed from: com.yandex.mobile.ads.impl.so0$a */
    /* loaded from: classes8.dex */
    public static final class C31384a {
        @NotNull

        /* renamed from: a */
        private List<? extends C31034of<?>> f85319a;

        public C31384a() {
            List<? extends C31034of<?>> m17166m;
            m17166m = C37563v.m17166m();
            this.f85319a = m17166m;
        }

        /* renamed from: a */
        public final void m29573a(@NotNull List<? extends C31034of<?>> assets) {
            Intrinsics.checkNotNullParameter(assets, "assets");
            this.f85319a = assets;
        }

        /* renamed from: a */
        public final void m29574a(@NotNull xo0 link) {
            Intrinsics.checkNotNullParameter(link, "link");
        }

        @NotNull
        /* renamed from: a */
        public final so0 m29575a() {
            return new so0(this.f85319a, 0);
        }
    }

    public /* synthetic */ so0(List list, int i) {
        this(list);
    }
}
