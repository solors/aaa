package com.moloco.sdk.internal;

import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.InterfaceC24576c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.q */
/* loaded from: classes7.dex */
public final class C24229q {
    @NotNull

    /* renamed from: a */
    public final MolocoAdError f62736a;
    @NotNull

    /* renamed from: b */
    public final InterfaceC24576c f62737b;

    public C24229q(@NotNull MolocoAdError molocoAdError, @NotNull InterfaceC24576c subErrorType) {
        Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
        Intrinsics.checkNotNullParameter(subErrorType, "subErrorType");
        this.f62736a = molocoAdError;
        this.f62737b = subErrorType;
    }

    @NotNull
    /* renamed from: a */
    public final MolocoAdError m46752a() {
        return this.f62736a;
    }

    @NotNull
    /* renamed from: b */
    public final InterfaceC24576c m46751b() {
        return this.f62737b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24229q)) {
            return false;
        }
        C24229q c24229q = (C24229q) obj;
        if (Intrinsics.m17075f(this.f62736a, c24229q.f62736a) && Intrinsics.m17075f(this.f62737b, c24229q.f62737b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f62736a.hashCode() * 31) + this.f62737b.hashCode();
    }

    @NotNull
    public String toString() {
        return "MolocoInternalAdError(molocoAdError=" + this.f62736a + ", subErrorType=" + this.f62737b + ')';
    }
}
