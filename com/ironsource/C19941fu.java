package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: com.ironsource.fu */
/* loaded from: classes6.dex */
public final class C19941fu {

    /* renamed from: a */
    private final boolean f50151a;

    /* renamed from: b */
    private final boolean f50152b;

    /* renamed from: c */
    private final boolean f50153c;

    public C19941fu(boolean z, boolean z2, boolean z3) {
        this.f50151a = z;
        this.f50152b = z2;
        this.f50153c = z3;
    }

    /* renamed from: a */
    public static /* synthetic */ C19941fu m58496a(C19941fu c19941fu, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = c19941fu.f50151a;
        }
        if ((i & 2) != 0) {
            z2 = c19941fu.f50152b;
        }
        if ((i & 4) != 0) {
            z3 = c19941fu.f50153c;
        }
        return c19941fu.m58495a(z, z2, z3);
    }

    /* renamed from: b */
    public final boolean m58494b() {
        return this.f50152b;
    }

    /* renamed from: c */
    public final boolean m58493c() {
        return this.f50153c;
    }

    /* renamed from: d */
    public final boolean m58492d() {
        return this.f50153c;
    }

    /* renamed from: e */
    public final boolean m58491e() {
        return this.f50151a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19941fu)) {
            return false;
        }
        C19941fu c19941fu = (C19941fu) obj;
        if (this.f50151a == c19941fu.f50151a && this.f50152b == c19941fu.f50152b && this.f50153c == c19941fu.f50153c) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean m58490f() {
        return this.f50152b;
    }

    @NotNull
    /* renamed from: g */
    public final JSONObject m58489g() {
        JSONObject put = new JSONObject().put(C20096if.f50580k, this.f50151a).put(C20096if.f50581l, this.f50152b).put(C20096if.f50582m, this.f50153c);
        Intrinsics.checkNotNullExpressionValue(put, "JSONObject()\n        .pu…ts.IS_SHOWN_KEY, isShown)");
        return put;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        boolean z = this.f50151a;
        int i = 1;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i2 = r0 * 31;
        ?? r2 = this.f50152b;
        int i3 = r2;
        if (r2 != 0) {
            i3 = 1;
        }
        int i4 = (i2 + i3) * 31;
        boolean z2 = this.f50153c;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        return i4 + i;
    }

    @NotNull
    public String toString() {
        return "ViewVisibilityParams(isVisible=" + this.f50151a + ", isWindowVisible=" + this.f50152b + ", isShown=" + this.f50153c + ')';
    }

    @NotNull
    /* renamed from: a */
    public final C19941fu m58495a(boolean z, boolean z2, boolean z3) {
        return new C19941fu(z, z2, z3);
    }

    /* renamed from: a */
    public final boolean m58497a() {
        return this.f50151a;
    }
}
