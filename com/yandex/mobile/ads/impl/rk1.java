package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;

/* loaded from: classes8.dex */
public final class rk1 {

    /* renamed from: b */
    public static final rk1 f84815b = new rk1(false);

    /* renamed from: a */
    public final boolean f84816a;

    public rk1(boolean z) {
        this.f84816a = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && rk1.class == obj.getClass() && this.f84816a == ((rk1) obj).f84816a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return !this.f84816a ? 1 : 0;
    }
}
