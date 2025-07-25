package com.yandex.mobile.ads.impl;

import com.monetization.ads.base.tracker.interaction.model.FalseClick;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.nt */
/* loaded from: classes8.dex */
public final class C30972nt {
    @Nullable

    /* renamed from: a */
    private final FalseClick f83071a;
    @Nullable

    /* renamed from: b */
    private final List<i12> f83072b;
    @Nullable

    /* renamed from: c */
    private final so0 f83073c;

    /* renamed from: com.yandex.mobile.ads.impl.nt$a */
    /* loaded from: classes8.dex */
    public static final class C30973a {
        @Nullable

        /* renamed from: a */
        private FalseClick f83074a;
        @Nullable

        /* renamed from: b */
        private List<i12> f83075b;
        @Nullable

        /* renamed from: c */
        private so0 f83076c;

        @NotNull
        /* renamed from: a */
        public final void m31313a(@Nullable FalseClick falseClick) {
            this.f83074a = falseClick;
        }

        @NotNull
        /* renamed from: a */
        public final void m31312a(@Nullable so0 so0Var) {
            this.f83076c = so0Var;
        }

        @NotNull
        /* renamed from: a */
        public final void m31311a(@Nullable List list) {
            this.f83075b = list;
        }

        @NotNull
        /* renamed from: a */
        public final C30972nt m31314a() {
            return new C30972nt(this.f83074a, this.f83075b, this.f83076c);
        }
    }

    public C30972nt(@Nullable FalseClick falseClick, @Nullable List<i12> list, @Nullable so0 so0Var) {
        this.f83071a = falseClick;
        this.f83072b = list;
        this.f83073c = so0Var;
    }

    @Nullable
    /* renamed from: a */
    public final FalseClick m31317a() {
        return this.f83071a;
    }

    @Nullable
    /* renamed from: b */
    public final so0 m31316b() {
        return this.f83073c;
    }

    @Nullable
    /* renamed from: c */
    public final List<i12> m31315c() {
        return this.f83072b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30972nt)) {
            return false;
        }
        C30972nt c30972nt = (C30972nt) obj;
        if (Intrinsics.m17075f(this.f83071a, c30972nt.f83071a) && Intrinsics.m17075f(this.f83072b, c30972nt.f83072b) && Intrinsics.m17075f(this.f83073c, c30972nt.f83073c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        FalseClick falseClick = this.f83071a;
        int i = 0;
        if (falseClick == null) {
            hashCode = 0;
        } else {
            hashCode = falseClick.hashCode();
        }
        int i2 = hashCode * 31;
        List<i12> list = this.f83072b;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        so0 so0Var = this.f83073c;
        if (so0Var != null) {
            i = so0Var.hashCode();
        }
        return i3 + i;
    }

    @NotNull
    public final String toString() {
        FalseClick falseClick = this.f83071a;
        List<i12> list = this.f83072b;
        so0 so0Var = this.f83073c;
        return "CreativeExtensions(falseClick=" + falseClick + ", trackingEvents=" + list + ", linearCreativeInfo=" + so0Var + ")";
    }
}
