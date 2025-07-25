package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.lz */
/* loaded from: classes8.dex */
public final class C30815lz {
    @NotNull

    /* renamed from: a */
    private final String f81971a;
    @NotNull

    /* renamed from: b */
    private final String f81972b;
    @NotNull

    /* renamed from: c */
    private final String f81973c;
    @Nullable

    /* renamed from: d */
    private final List<bh0> f81974d;

    public C30815lz(@NotNull String type, @NotNull String target, @NotNull String layout, @Nullable ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f81971a = type;
        this.f81972b = target;
        this.f81973c = layout;
        this.f81974d = arrayList;
    }

    @Nullable
    /* renamed from: a */
    public final List<bh0> m32191a() {
        return this.f81974d;
    }

    @NotNull
    /* renamed from: b */
    public final String m32190b() {
        return this.f81973c;
    }

    @NotNull
    /* renamed from: c */
    public final String m32189c() {
        return this.f81972b;
    }

    @NotNull
    /* renamed from: d */
    public final String m32188d() {
        return this.f81971a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30815lz)) {
            return false;
        }
        C30815lz c30815lz = (C30815lz) obj;
        if (Intrinsics.m17075f(this.f81971a, c30815lz.f81971a) && Intrinsics.m17075f(this.f81972b, c30815lz.f81972b) && Intrinsics.m17075f(this.f81973c, c30815lz.f81973c) && Intrinsics.m17075f(this.f81974d, c30815lz.f81974d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m31189a = C31014o3.m31189a(this.f81973c, C31014o3.m31189a(this.f81972b, this.f81971a.hashCode() * 31, 31), 31);
        List<bh0> list = this.f81974d;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return m31189a + hashCode;
    }

    @NotNull
    public final String toString() {
        String str = this.f81971a;
        String str2 = this.f81972b;
        String str3 = this.f81973c;
        List<bh0> list = this.f81974d;
        return "Design(type=" + str + ", target=" + str2 + ", layout=" + str3 + ", images=" + list + ")";
    }
}
