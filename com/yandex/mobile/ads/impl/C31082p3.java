package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.p3 */
/* loaded from: classes8.dex */
public final class C31082p3 {

    /* renamed from: a */
    private final int f83699a;
    @NotNull

    /* renamed from: b */
    private final String f83700b;
    @NotNull

    /* renamed from: c */
    private final String f83701c;
    @Nullable

    /* renamed from: d */
    private final String f83702d;

    public C31082p3(int i, @NotNull String description, @NotNull String displayMessage, @Nullable String str) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(displayMessage, "displayMessage");
        this.f83699a = i;
        this.f83700b = description;
        this.f83701c = displayMessage;
        this.f83702d = str;
    }

    @Nullable
    /* renamed from: a */
    public final String m30851a() {
        return this.f83702d;
    }

    /* renamed from: b */
    public final int m30850b() {
        return this.f83699a;
    }

    @NotNull
    /* renamed from: c */
    public final String m30849c() {
        return this.f83700b;
    }

    @NotNull
    /* renamed from: d */
    public final String m30848d() {
        return this.f83701c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31082p3)) {
            return false;
        }
        C31082p3 c31082p3 = (C31082p3) obj;
        if (this.f83699a == c31082p3.f83699a && Intrinsics.m17075f(this.f83700b, c31082p3.f83700b) && Intrinsics.m17075f(this.f83701c, c31082p3.f83701c) && Intrinsics.m17075f(this.f83702d, c31082p3.f83702d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int m31189a = C31014o3.m31189a(this.f83701c, C31014o3.m31189a(this.f83700b, Integer.hashCode(this.f83699a) * 31, 31), 31);
        String str = this.f83702d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return m31189a + hashCode;
    }

    @NotNull
    public final String toString() {
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s, adUnitId: %s, display_message: %s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.f83699a), this.f83700b, this.f83702d, this.f83701c}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
