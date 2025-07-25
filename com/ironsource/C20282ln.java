package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.ln */
/* loaded from: classes6.dex */
public final class C20282ln {
    @NotNull

    /* renamed from: a */
    private final String f51033a;
    @Nullable

    /* renamed from: b */
    private final String f51034b;

    public C20282ln(@NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f51033a = url;
        this.f51034b = str;
    }

    /* renamed from: a */
    public static /* synthetic */ C20282ln m57377a(C20282ln c20282ln, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c20282ln.f51033a;
        }
        if ((i & 2) != 0) {
            str2 = c20282ln.f51034b;
        }
        return c20282ln.m57376a(str, str2);
    }

    @Nullable
    /* renamed from: b */
    public final String m57375b() {
        return this.f51034b;
    }

    @Nullable
    /* renamed from: c */
    public final String m57374c() {
        return this.f51034b;
    }

    @NotNull
    /* renamed from: d */
    public final String m57373d() {
        return this.f51033a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20282ln)) {
            return false;
        }
        C20282ln c20282ln = (C20282ln) obj;
        if (Intrinsics.m17075f(this.f51033a, c20282ln.f51033a) && Intrinsics.m17075f(this.f51034b, c20282ln.f51034b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f51033a.hashCode() * 31;
        String str = this.f51034b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @NotNull
    public String toString() {
        return "OpenUrl(url=" + this.f51033a + ", packageName=" + this.f51034b + ')';
    }

    public /* synthetic */ C20282ln(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    @NotNull
    /* renamed from: a */
    public final C20282ln m57376a(@NotNull String url, @Nullable String str) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new C20282ln(url, str);
    }

    @NotNull
    /* renamed from: a */
    public final String m57378a() {
        return this.f51033a;
    }
}
