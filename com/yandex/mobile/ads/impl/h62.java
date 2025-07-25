package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h62 {
    @NotNull

    /* renamed from: a */
    private final List<i50> f79966a;
    @NotNull

    /* renamed from: b */
    private final List<i12> f79967b;

    private h62(List<i50> list, List<i12> list2) {
        this.f79966a = list;
        this.f79967b = list2;
    }

    @NotNull
    /* renamed from: a */
    public final List<i50> m33606a() {
        return this.f79966a;
    }

    @NotNull
    /* renamed from: b */
    public final List<i12> m33605b() {
        return this.f79967b;
    }

    /* renamed from: com.yandex.mobile.ads.impl.h62$a */
    /* loaded from: classes8.dex */
    public static final class C30445a {
        @NotNull

        /* renamed from: a */
        private List<i50> f79968a;
        @NotNull

        /* renamed from: b */
        private List<i12> f79969b;

        public C30445a() {
            List<i50> m17166m;
            List<i12> m17166m2;
            m17166m = C37563v.m17166m();
            this.f79968a = m17166m;
            m17166m2 = C37563v.m17166m();
            this.f79969b = m17166m2;
        }

        @NotNull
        /* renamed from: a */
        public final C30445a m33603a(@NotNull List<i50> extensions) {
            Intrinsics.checkNotNullParameter(extensions, "extensions");
            this.f79968a = extensions;
            return this;
        }

        @NotNull
        /* renamed from: b */
        public final C30445a m33602b(@NotNull List<i12> trackingEvents) {
            Intrinsics.checkNotNullParameter(trackingEvents, "trackingEvents");
            this.f79969b = trackingEvents;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final h62 m33604a() {
            return new h62(this.f79968a, this.f79969b, 0);
        }
    }

    public /* synthetic */ h62(List list, List list2, int i) {
        this(list, list2);
    }
}
