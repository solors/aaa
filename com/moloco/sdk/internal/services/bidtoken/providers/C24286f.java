package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.services.EnumC24330e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.f */
/* loaded from: classes7.dex */
public final class C24286f {
    @NotNull

    /* renamed from: a */
    public final EnumC24330e0 f62889a;

    /* renamed from: b */
    public final int f62890b;

    public C24286f(@NotNull EnumC24330e0 muteSwitchState, int i) {
        Intrinsics.checkNotNullParameter(muteSwitchState, "muteSwitchState");
        this.f62889a = muteSwitchState;
        this.f62890b = i;
    }

    /* renamed from: a */
    public final int m46668a() {
        return this.f62890b;
    }

    @NotNull
    /* renamed from: b */
    public final EnumC24330e0 m46667b() {
        return this.f62889a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24286f)) {
            return false;
        }
        C24286f c24286f = (C24286f) obj;
        if (this.f62889a == c24286f.f62889a && this.f62890b == c24286f.f62890b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f62889a.hashCode() * 31) + Integer.hashCode(this.f62890b);
    }

    @NotNull
    public String toString() {
        return "AudioSignal(muteSwitchState=" + this.f62889a + ", mediaVolume=" + this.f62890b + ')';
    }
}
