package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.xv */
/* loaded from: classes8.dex */
public final class C31845xv {

    /* renamed from: a */
    private final boolean f87850a;

    public C31845xv(boolean z) {
        this.f87850a = z;
    }

    /* renamed from: a */
    public final boolean m27211a() {
        return this.f87850a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C31845xv) && this.f87850a == ((C31845xv) obj).f87850a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f87850a);
    }

    @NotNull
    public final String toString() {
        boolean z = this.f87850a;
        return "DebugPanelErrorIndicatorData(isEnabled=" + z + ")";
    }
}
