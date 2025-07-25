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
/* renamed from: com.ironsource.r4 */
/* loaded from: classes6.dex */
public final class C20739r4 {
    @NotNull

    /* renamed from: a */
    private final String f52703a;

    /* renamed from: b */
    private final boolean f52704b;

    /* renamed from: c */
    private boolean f52705c;
    @NotNull

    /* renamed from: d */
    private String f52706d;
    @NotNull

    /* renamed from: e */
    private Map<String, ? extends Object> f52707e;
    @Nullable

    /* renamed from: f */
    private C20404h f52708f;
    @NotNull

    /* renamed from: g */
    private Map<String, Object> f52709g;

    public C20739r4(@NotNull String name, boolean z) {
        Map<String, ? extends Object> m17284j;
        Intrinsics.checkNotNullParameter(name, "name");
        this.f52703a = name;
        this.f52704b = z;
        this.f52706d = "";
        m17284j = C37559r0.m17284j();
        this.f52707e = m17284j;
        this.f52709g = new HashMap();
    }

    /* renamed from: a */
    public static /* synthetic */ C20739r4 m55560a(C20739r4 c20739r4, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c20739r4.f52703a;
        }
        if ((i & 2) != 0) {
            z = c20739r4.f52704b;
        }
        return c20739r4.m55558a(str, z);
    }

    /* renamed from: b */
    public final void m55554b(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f52707e = map;
    }

    @NotNull
    /* renamed from: c */
    public final Map<String, Object> m55553c() {
        return this.f52709g;
    }

    @Nullable
    /* renamed from: d */
    public final C20404h m55552d() {
        return this.f52708f;
    }

    /* renamed from: e */
    public final boolean m55551e() {
        return this.f52704b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20739r4)) {
            return false;
        }
        C20739r4 c20739r4 = (C20739r4) obj;
        if (Intrinsics.m17075f(this.f52703a, c20739r4.f52703a) && this.f52704b == c20739r4.f52704b) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final Map<String, Object> m55550f() {
        return this.f52707e;
    }

    @NotNull
    /* renamed from: g */
    public final String m55549g() {
        return this.f52703a;
    }

    @NotNull
    /* renamed from: h */
    public final String m55548h() {
        return this.f52706d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f52703a.hashCode() * 31;
        boolean z = this.f52704b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    /* renamed from: i */
    public final boolean m55547i() {
        return this.f52705c;
    }

    @NotNull
    public String toString() {
        return "AuctionInstanceInfo(name=" + this.f52703a + ", bidder=" + this.f52704b + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C20739r4 m55558a(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new C20739r4(name, z);
    }

    /* renamed from: b */
    public final boolean m55555b() {
        return this.f52704b;
    }

    @NotNull
    /* renamed from: a */
    public final String m55562a() {
        return this.f52703a;
    }

    /* renamed from: a */
    public final void m55561a(@Nullable C20404h c20404h) {
        this.f52708f = c20404h;
    }

    /* renamed from: a */
    public final void m55559a(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f52706d = str;
    }

    /* renamed from: a */
    public final void m55557a(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.f52709g = map;
    }

    /* renamed from: a */
    public final void m55556a(boolean z) {
        this.f52705c = z;
    }
}
