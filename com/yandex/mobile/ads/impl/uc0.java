package com.yandex.mobile.ads.impl;

import com.mbridge.msdk.thrid.okhttp.internal.http2.Header;
import kotlin.jvm.internal.Intrinsics;
import okio.C39208h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class uc0 {
    @NotNull

    /* renamed from: d */
    public static final C39208h f86199d;
    @NotNull

    /* renamed from: e */
    public static final C39208h f86200e;
    @NotNull

    /* renamed from: f */
    public static final C39208h f86201f;
    @NotNull

    /* renamed from: g */
    public static final C39208h f86202g;
    @NotNull

    /* renamed from: h */
    public static final C39208h f86203h;
    @NotNull

    /* renamed from: i */
    public static final C39208h f86204i;
    @NotNull

    /* renamed from: a */
    public final C39208h f86205a;
    @NotNull

    /* renamed from: b */
    public final C39208h f86206b;

    /* renamed from: c */
    public final int f86207c;

    static {
        C39208h.C39209a c39209a = C39208h.f102952f;
        f86199d = c39209a.m13547d(":");
        f86200e = c39209a.m13547d(Header.RESPONSE_STATUS_UTF8);
        f86201f = c39209a.m13547d(Header.TARGET_METHOD_UTF8);
        f86202g = c39209a.m13547d(Header.TARGET_PATH_UTF8);
        f86203h = c39209a.m13547d(Header.TARGET_SCHEME_UTF8);
        f86204i = c39209a.m13547d(Header.TARGET_AUTHORITY_UTF8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public uc0(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.h$a r0 = okio.C39208h.f102952f
            okio.h r2 = r0.m13547d(r2)
            okio.h r3 = r0.m13547d(r3)
            r1.<init>(r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.uc0.<init>(java.lang.String, java.lang.String):void");
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0)) {
            return false;
        }
        uc0 uc0Var = (uc0) obj;
        if (Intrinsics.m17075f(this.f86205a, uc0Var.f86205a) && Intrinsics.m17075f(this.f86206b, uc0Var.f86206b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f86206b.hashCode() + (this.f86205a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        String m13566H = this.f86205a.m13566H();
        String m13566H2 = this.f86206b.m13566H();
        return m13566H + ": " + m13566H2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uc0(@NotNull C39208h name, @NotNull String value) {
        this(name, C39208h.f102952f.m13547d(value));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
    }

    public uc0(@NotNull C39208h name, @NotNull C39208h value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f86205a = name;
        this.f86206b = value;
        this.f86207c = value.m13569C() + name.m13569C() + 32;
    }
}
