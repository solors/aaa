package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.qu1;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class e90 implements qu1 {
    @NotNull

    /* renamed from: a */
    private final qu1.EnumC31236a f78485a;

    /* renamed from: b */
    private final int f78486b;

    /* renamed from: c */
    private final int f78487c;
    @NotNull

    /* renamed from: d */
    private final String f78488d;

    public e90(int i, int i2, @NotNull qu1.EnumC31236a sizeType) {
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(sizeType, "sizeType");
        this.f78485a = sizeType;
        if (i < 0 && -1 != i) {
            i3 = 0;
        } else {
            i3 = i;
        }
        this.f78486b = i3;
        if (i2 < 0 && -2 != i2) {
            i4 = 0;
        } else {
            i4 = i2;
        }
        this.f78487c = i4;
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format(Locale.US, "%dx%d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        this.f78488d = format;
    }

    @Override // com.yandex.mobile.ads.impl.qu1
    /* renamed from: a */
    public final int mo29653a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = this.f78487c;
        return -2 == i ? cc2.m35254b(context) : i;
    }

    @Override // com.yandex.mobile.ads.impl.qu1
    /* renamed from: b */
    public final int mo29652b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = this.f78487c;
        if (-2 == i) {
            int i2 = cc2.f77597b;
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getResources().getDisplayMetrics().heightPixels;
        }
        return cc2.m35261a(context, i);
    }

    @Override // com.yandex.mobile.ads.impl.qu1
    /* renamed from: c */
    public final int mo29651c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = this.f78486b;
        if (-1 == i) {
            return cc2.m35252c(context);
        }
        return i;
    }

    @Override // com.yandex.mobile.ads.impl.qu1
    /* renamed from: d */
    public final int mo29650d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = this.f78486b;
        if (-1 == i) {
            int i2 = cc2.f77597b;
            Intrinsics.checkNotNullParameter(context, "context");
            return context.getResources().getDisplayMetrics().widthPixels;
        }
        return cc2.m35261a(context, i);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.m17075f(e90.class, obj.getClass())) {
            return false;
        }
        e90 e90Var = (e90) obj;
        if (this.f78486b != e90Var.f78486b) {
            return false;
        }
        if (this.f78487c == e90Var.f78487c && this.f78485a == e90Var.f78485a) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.qu1
    public final int getHeight() {
        return this.f78487c;
    }

    @Override // com.yandex.mobile.ads.impl.qu1
    public final int getWidth() {
        return this.f78486b;
    }

    public final int hashCode() {
        return this.f78485a.hashCode() + C31014o3.m31189a(this.f78488d, ((this.f78486b * 31) + this.f78487c) * 31, 31);
    }

    @NotNull
    public final String toString() {
        return this.f78488d;
    }

    @Override // com.yandex.mobile.ads.impl.qu1
    @NotNull
    /* renamed from: a */
    public final qu1.EnumC31236a mo29654a() {
        return this.f78485a;
    }
}
