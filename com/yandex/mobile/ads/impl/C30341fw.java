package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.fw */
/* loaded from: classes8.dex */
public final class C30341fw {
    @NotNull

    /* renamed from: a */
    private final String f79334a;
    @NotNull

    /* renamed from: b */
    private final String f79335b;

    public C30341fw(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f79334a = name;
        this.f79335b = value;
    }

    @NotNull
    /* renamed from: a */
    public final String m34066a() {
        return this.f79334a;
    }

    @NotNull
    /* renamed from: b */
    public final String m34065b() {
        return this.f79335b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30341fw)) {
            return false;
        }
        C30341fw c30341fw = (C30341fw) obj;
        if (Intrinsics.m17075f(this.f79334a, c30341fw.f79334a) && Intrinsics.m17075f(this.f79335b, c30341fw.f79335b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f79335b.hashCode() + (this.f79334a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f79334a;
        String str2 = this.f79335b;
        return "DebugPanelMediationAdapterParameterData(name=" + str + ", value=" + str2 + ")";
    }
}
