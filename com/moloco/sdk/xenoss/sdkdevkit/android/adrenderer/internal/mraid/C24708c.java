package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C24770r;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.c */
/* loaded from: classes7.dex */
public final class C24708c {
    @Nullable

    /* renamed from: a */
    public final C24770r f63795a;

    public C24708c() {
        this(null, 1, null);
    }

    @NotNull
    /* renamed from: a */
    public final C24708c m45871a(@Nullable C24770r c24770r) {
        return new C24708c(c24770r);
    }

    @Nullable
    /* renamed from: b */
    public final C24770r m45870b() {
        return this.f63795a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C24708c) && Intrinsics.m17075f(this.f63795a, ((C24708c) obj).f63795a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        C24770r c24770r = this.f63795a;
        if (c24770r == null) {
            return 0;
        }
        return c24770r.hashCode();
    }

    @NotNull
    public String toString() {
        return "MraidAdData(dec=" + this.f63795a + ')';
    }

    public C24708c(@Nullable C24770r c24770r) {
        this.f63795a = c24770r;
    }

    public /* synthetic */ C24708c(C24770r c24770r, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : c24770r);
    }
}
