package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.uk */
/* loaded from: classes6.dex */
public final class C21082uk {
    @NotNull

    /* renamed from: a */
    private final EnumC19990gh f53793a;
    @NotNull

    /* renamed from: b */
    private final String f53794b;

    /* renamed from: c */
    private final long f53795c;

    /* renamed from: d */
    private final boolean f53796d;

    /* renamed from: e */
    private final boolean f53797e;

    public C21082uk(@NotNull EnumC19990gh instanceType, @NotNull String adSourceNameForEvents, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        this.f53793a = instanceType;
        this.f53794b = adSourceNameForEvents;
        this.f53795c = j;
        this.f53796d = z;
        this.f53797e = z2;
    }

    @NotNull
    /* renamed from: a */
    public final EnumC19990gh m54626a() {
        return this.f53793a;
    }

    @NotNull
    /* renamed from: b */
    public final String m54623b() {
        return this.f53794b;
    }

    /* renamed from: c */
    public final long m54622c() {
        return this.f53795c;
    }

    /* renamed from: d */
    public final boolean m54621d() {
        return this.f53796d;
    }

    /* renamed from: e */
    public final boolean m54620e() {
        return this.f53797e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21082uk)) {
            return false;
        }
        C21082uk c21082uk = (C21082uk) obj;
        if (this.f53793a == c21082uk.f53793a && Intrinsics.m17075f(this.f53794b, c21082uk.f53794b) && this.f53795c == c21082uk.f53795c && this.f53796d == c21082uk.f53796d && this.f53797e == c21082uk.f53797e) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final String m54619f() {
        return this.f53794b;
    }

    @NotNull
    /* renamed from: g */
    public final EnumC19990gh m54618g() {
        return this.f53793a;
    }

    /* renamed from: h */
    public final long m54617h() {
        return this.f53795c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f53793a.hashCode() * 31) + this.f53794b.hashCode()) * 31) + Long.hashCode(this.f53795c)) * 31;
        boolean z = this.f53796d;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        boolean z2 = this.f53797e;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i3 + i;
    }

    /* renamed from: i */
    public final boolean m54616i() {
        return this.f53797e;
    }

    /* renamed from: j */
    public final boolean m54615j() {
        return this.f53796d;
    }

    @NotNull
    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.f53793a + ", adSourceNameForEvents=" + this.f53794b + ", loadTimeoutInMills=" + this.f53795c + ", isOneFlow=" + this.f53796d + ", isMultipleAdObjects=" + this.f53797e + ')';
    }

    public /* synthetic */ C21082uk(EnumC19990gh enumC19990gh, String str, long j, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC19990gh, str, j, z, (i & 16) != 0 ? true : z2);
    }

    @NotNull
    /* renamed from: a */
    public final C21082uk m54625a(@NotNull EnumC19990gh instanceType, @NotNull String adSourceNameForEvents, long j, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(instanceType, "instanceType");
        Intrinsics.checkNotNullParameter(adSourceNameForEvents, "adSourceNameForEvents");
        return new C21082uk(instanceType, adSourceNameForEvents, j, z, z2);
    }

    /* renamed from: a */
    public static /* synthetic */ C21082uk m54624a(C21082uk c21082uk, EnumC19990gh enumC19990gh, String str, long j, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC19990gh = c21082uk.f53793a;
        }
        if ((i & 2) != 0) {
            str = c21082uk.f53794b;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j = c21082uk.f53795c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            z = c21082uk.f53796d;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = c21082uk.f53797e;
        }
        return c21082uk.m54625a(enumC19990gh, str2, j2, z3, z2);
    }
}
