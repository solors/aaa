package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C24770r;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a */
/* loaded from: classes7.dex */
public final class C25060a {
    @NotNull

    /* renamed from: a */
    public final C25255f f65035a;
    @Nullable

    /* renamed from: b */
    public final C25109c f65036b;
    @NotNull

    /* renamed from: c */
    public final List<String> f65037c;
    @NotNull

    /* renamed from: d */
    public final List<String> f65038d;
    @Nullable

    /* renamed from: e */
    public final C24770r f65039e;

    public C25060a(@NotNull C25255f linear, @Nullable C25109c c25109c, @NotNull List<String> impressionTracking, @NotNull List<String> errorTracking, @Nullable C24770r c24770r) {
        Intrinsics.checkNotNullParameter(linear, "linear");
        Intrinsics.checkNotNullParameter(impressionTracking, "impressionTracking");
        Intrinsics.checkNotNullParameter(errorTracking, "errorTracking");
        this.f65035a = linear;
        this.f65036b = c25109c;
        this.f65037c = impressionTracking;
        this.f65038d = errorTracking;
        this.f65039e = c24770r;
    }

    /* renamed from: a */
    public static /* synthetic */ C25060a m45188a(C25060a c25060a, C25255f c25255f, C25109c c25109c, List list, List list2, C24770r c24770r, int i, Object obj) {
        if ((i & 1) != 0) {
            c25255f = c25060a.f65035a;
        }
        if ((i & 2) != 0) {
            c25109c = c25060a.f65036b;
        }
        C25109c c25109c2 = c25109c;
        List<String> list3 = list;
        if ((i & 4) != 0) {
            list3 = c25060a.f65037c;
        }
        List list4 = list3;
        List<String> list5 = list2;
        if ((i & 8) != 0) {
            list5 = c25060a.f65038d;
        }
        List list6 = list5;
        if ((i & 16) != 0) {
            c24770r = c25060a.f65039e;
        }
        return c25060a.m45187b(c25255f, c25109c2, list4, list6, c24770r);
    }

    @NotNull
    /* renamed from: b */
    public final C25060a m45187b(@NotNull C25255f linear, @Nullable C25109c c25109c, @NotNull List<String> impressionTracking, @NotNull List<String> errorTracking, @Nullable C24770r c24770r) {
        Intrinsics.checkNotNullParameter(linear, "linear");
        Intrinsics.checkNotNullParameter(impressionTracking, "impressionTracking");
        Intrinsics.checkNotNullParameter(errorTracking, "errorTracking");
        return new C25060a(linear, c25109c, impressionTracking, errorTracking, c24770r);
    }

    @Nullable
    /* renamed from: c */
    public final C25109c m45186c() {
        return this.f65036b;
    }

    @Nullable
    /* renamed from: d */
    public final C24770r m45185d() {
        return this.f65039e;
    }

    @NotNull
    /* renamed from: e */
    public final List<String> m45184e() {
        return this.f65038d;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25060a)) {
            return false;
        }
        C25060a c25060a = (C25060a) obj;
        if (Intrinsics.m17075f(this.f65035a, c25060a.f65035a) && Intrinsics.m17075f(this.f65036b, c25060a.f65036b) && Intrinsics.m17075f(this.f65037c, c25060a.f65037c) && Intrinsics.m17075f(this.f65038d, c25060a.f65038d) && Intrinsics.m17075f(this.f65039e, c25060a.f65039e)) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final List<String> m45183f() {
        return this.f65037c;
    }

    @NotNull
    /* renamed from: g */
    public final C25255f m45182g() {
        return this.f65035a;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f65035a.hashCode() * 31;
        C25109c c25109c = this.f65036b;
        int i = 0;
        if (c25109c == null) {
            hashCode = 0;
        } else {
            hashCode = c25109c.hashCode();
        }
        int hashCode3 = (((((hashCode2 + hashCode) * 31) + this.f65037c.hashCode()) * 31) + this.f65038d.hashCode()) * 31;
        C24770r c24770r = this.f65039e;
        if (c24770r != null) {
            i = c24770r.hashCode();
        }
        return hashCode3 + i;
    }

    @NotNull
    public String toString() {
        return "Ad(linear=" + this.f65035a + ", companion=" + this.f65036b + ", impressionTracking=" + this.f65037c + ", errorTracking=" + this.f65038d + ", dec=" + this.f65039e + ')';
    }

    public /* synthetic */ C25060a(C25255f c25255f, C25109c c25109c, List list, List list2, C24770r c24770r, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c25255f, c25109c, list, list2, (i & 16) != 0 ? null : c24770r);
    }
}
