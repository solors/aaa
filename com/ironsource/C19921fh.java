package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.fh */
/* loaded from: classes6.dex */
public final class C19921fh {
    @NotNull

    /* renamed from: a */
    private final String f50106a;

    /* renamed from: b */
    private final int f50107b;
    @Nullable

    /* renamed from: c */
    private final String f50108c;

    public C19921fh() {
        this(null, 0, null, 7, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C19921fh m58564a(C19921fh c19921fh, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = c19921fh.f50106a;
        }
        if ((i2 & 2) != 0) {
            i = c19921fh.f50107b;
        }
        if ((i2 & 4) != 0) {
            str2 = c19921fh.f50108c;
        }
        return c19921fh.m58563a(str, i, str2);
    }

    /* renamed from: b */
    public final int m58562b() {
        return this.f50107b;
    }

    @Nullable
    /* renamed from: c */
    public final String m58561c() {
        return this.f50108c;
    }

    @Nullable
    /* renamed from: d */
    public final String m58560d() {
        return this.f50108c;
    }

    @NotNull
    /* renamed from: e */
    public final String m58559e() {
        return this.f50106a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19921fh)) {
            return false;
        }
        C19921fh c19921fh = (C19921fh) obj;
        if (Intrinsics.m17075f(this.f50106a, c19921fh.f50106a) && this.f50107b == c19921fh.f50107b && Intrinsics.m17075f(this.f50108c, c19921fh.f50108c)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m58558f() {
        return this.f50107b;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f50106a.hashCode() * 31) + Integer.hashCode(this.f50107b)) * 31;
        String str = this.f50108c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        return "InstanceInformation(instanceId=" + this.f50106a + ", instanceType=" + this.f50107b + ", dynamicDemandSourceId=" + this.f50108c + ')';
    }

    public C19921fh(@NotNull String instanceId, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        this.f50106a = instanceId;
        this.f50107b = i;
        this.f50108c = str;
    }

    @NotNull
    /* renamed from: a */
    public final C19921fh m58563a(@NotNull String instanceId, int i, @Nullable String str) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        return new C19921fh(instanceId, i, str);
    }

    public /* synthetic */ C19921fh(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? "" : str2);
    }

    @NotNull
    /* renamed from: a */
    public final String m58565a() {
        return this.f50106a;
    }
}
