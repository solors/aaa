package com.moloco.sdk.internal.services.bidtoken.providers;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.internal.services.bidtoken.providers.h */
/* loaded from: classes7.dex */
public final class C24289h {

    /* renamed from: a */
    public final int f62894a;

    /* renamed from: b */
    public final int f62895b;

    /* renamed from: c */
    public final boolean f62896c;

    public C24289h(int i, int i2, boolean z) {
        this.f62894a = i;
        this.f62895b = i2;
        this.f62896c = z;
    }

    /* renamed from: a */
    public final int m46664a() {
        return this.f62895b;
    }

    /* renamed from: b */
    public final int m46663b() {
        return this.f62894a;
    }

    /* renamed from: c */
    public final boolean m46662c() {
        return this.f62896c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24289h)) {
            return false;
        }
        C24289h c24289h = (C24289h) obj;
        if (this.f62894a == c24289h.f62894a && this.f62895b == c24289h.f62895b && this.f62896c == c24289h.f62896c) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f62894a) * 31) + Integer.hashCode(this.f62895b)) * 31;
        boolean z = this.f62896c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public String toString() {
        return "BatteryInfoSignal(maxBatteryLevel=" + this.f62894a + ", batteryStatus=" + this.f62895b + ", isPowerSaveMode=" + this.f62896c + ')';
    }
}
