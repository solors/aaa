package com.ironsource;

import com.ironsource.mediationsdk.C20404h;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.y4 */
/* loaded from: classes6.dex */
public final class C21253y4 {
    @NotNull

    /* renamed from: a */
    private final String f54554a;

    /* renamed from: b */
    private final boolean f54555b;

    /* renamed from: c */
    private boolean f54556c;
    @NotNull

    /* renamed from: d */
    private String f54557d;
    @NotNull

    /* renamed from: e */
    private Map<String, ? extends Object> f54558e;
    @Nullable

    /* renamed from: f */
    private C20404h f54559f;
    @NotNull

    /* renamed from: g */
    private Map<String, Object> f54560g;

    public C21253y4(@NotNull String name, boolean z) {
        Map<String, ? extends Object> m17284j;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f54554a = name;
        this.f54555b = z;
        this.f54557d = "";
        m17284j = C37559r0.m17284j();
        this.f54558e = m17284j;
        this.f54560g = new HashMap();
    }

    /* renamed from: a */
    public static /* synthetic */ C21253y4 m54045a(C21253y4 c21253y4, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c21253y4.f54554a;
        }
        if ((i & 2) != 0) {
            z = c21253y4.f54555b;
        }
        return c21253y4.m54043a(str, z);
    }

    /* renamed from: b */
    public final void m54039b(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f54558e = map;
    }

    @NotNull
    /* renamed from: c */
    public final Map<String, Object> m54038c() {
        return this.f54560g;
    }

    @Nullable
    /* renamed from: d */
    public final C20404h m54037d() {
        return this.f54559f;
    }

    /* renamed from: e */
    public final boolean m54036e() {
        return this.f54555b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21253y4)) {
            return false;
        }
        C21253y4 c21253y4 = (C21253y4) obj;
        if (Intrinsics.m17075f(this.f54554a, c21253y4.f54554a) && this.f54555b == c21253y4.f54555b) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final Map<String, Object> m54035f() {
        return this.f54558e;
    }

    @NotNull
    /* renamed from: g */
    public final String m54034g() {
        return this.f54554a;
    }

    @NotNull
    /* renamed from: h */
    public final String m54033h() {
        return this.f54557d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f54554a.hashCode() * 31;
        boolean z = this.f54555b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public final boolean m54032i() {
        return this.f54556c;
    }

    @NotNull
    public String toString() {
        return "AuctionRequestInstanceInfo(name=" + this.f54554a + ", bidder=" + this.f54555b + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C21253y4 m54043a(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new C21253y4(name, z);
    }

    /* renamed from: b */
    public final boolean m54040b() {
        return this.f54555b;
    }

    @NotNull
    /* renamed from: a */
    public final String m54047a() {
        return this.f54554a;
    }

    /* renamed from: a */
    public final void m54046a(@Nullable C20404h c20404h) {
        this.f54559f = c20404h;
    }

    /* renamed from: a */
    public final void m54044a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f54557d = str;
    }

    /* renamed from: a */
    public final void m54042a(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f54560g = map;
    }

    /* renamed from: a */
    public final void m54041a(boolean z) {
        this.f54556c = z;
    }
}
