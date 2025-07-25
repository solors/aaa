package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.ri */
/* loaded from: classes6.dex */
public final class C20761ri {
    @NotNull

    /* renamed from: a */
    private final String f52773a;
    @NotNull

    /* renamed from: b */
    private final String f52774b;

    public C20761ri(@NotNull String advId, @NotNull String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        this.f52773a = advId;
        this.f52774b = advIdType;
    }

    /* renamed from: a */
    public static /* synthetic */ C20761ri m55479a(C20761ri c20761ri, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c20761ri.f52773a;
        }
        if ((i & 2) != 0) {
            str2 = c20761ri.f52774b;
        }
        return c20761ri.m55478a(str, str2);
    }

    @NotNull
    /* renamed from: b */
    public final String m55477b() {
        return this.f52774b;
    }

    @NotNull
    /* renamed from: c */
    public final String m55476c() {
        return this.f52773a;
    }

    @NotNull
    /* renamed from: d */
    public final String m55475d() {
        return this.f52774b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20761ri)) {
            return false;
        }
        C20761ri c20761ri = (C20761ri) obj;
        if (Intrinsics.m17075f(this.f52773a, c20761ri.f52773a) && Intrinsics.m17075f(this.f52774b, c20761ri.f52774b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f52773a.hashCode() * 31) + this.f52774b.hashCode();
    }

    @NotNull
    public String toString() {
        return "IronSourceAdvId(advId=" + this.f52773a + ", advIdType=" + this.f52774b + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C20761ri m55478a(@NotNull String advId, @NotNull String advIdType) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        Intrinsics.checkNotNullParameter(advIdType, "advIdType");
        return new C20761ri(advId, advIdType);
    }

    @NotNull
    /* renamed from: a */
    public final String m55480a() {
        return this.f52773a;
    }
}
