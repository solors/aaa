package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.qu1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class sb1 implements qu1 {
    @NotNull

    /* renamed from: a */
    private final Context f85167a;
    @NotNull

    /* renamed from: b */
    private final qu1 f85168b;
    @NotNull

    /* renamed from: c */
    private final qu1 f85169c;

    public sb1(@NotNull Context appContext, @NotNull e90 portraitSizeInfo, @NotNull e90 landscapeSizeInfo) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(portraitSizeInfo, "portraitSizeInfo");
        Intrinsics.checkNotNullParameter(landscapeSizeInfo, "landscapeSizeInfo");
        this.f85167a = appContext;
        this.f85168b = portraitSizeInfo;
        this.f85169c = landscapeSizeInfo;
    }

    @Override // com.yandex.mobile.ads.impl.qu1
    /* renamed from: a */
    public final int mo29653a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (C30114cr.m35177a(context) == nb1.f82658c) {
            return this.f85169c.mo29653a(context);
        }
        return this.f85168b.mo29653a(context);
    }

    @Override // com.yandex.mobile.ads.impl.qu1
    /* renamed from: b */
    public final int mo29652b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (C30114cr.m35177a(context) == nb1.f82658c) {
            return this.f85169c.mo29652b(context);
        }
        return this.f85168b.mo29652b(context);
    }

    @Override // com.yandex.mobile.ads.impl.qu1
    /* renamed from: c */
    public final int mo29651c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (C30114cr.m35177a(context) == nb1.f82658c) {
            return this.f85169c.mo29651c(context);
        }
        return this.f85168b.mo29651c(context);
    }

    @Override // com.yandex.mobile.ads.impl.qu1
    /* renamed from: d */
    public final int mo29650d(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (C30114cr.m35177a(context) == nb1.f82658c) {
            return this.f85169c.mo29650d(context);
        }
        return this.f85168b.mo29650d(context);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb1)) {
            return false;
        }
        sb1 sb1Var = (sb1) obj;
        if (Intrinsics.m17075f(this.f85167a, sb1Var.f85167a) && Intrinsics.m17075f(this.f85168b, sb1Var.f85168b) && Intrinsics.m17075f(this.f85169c, sb1Var.f85169c)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.qu1
    public final int getHeight() {
        if (C30114cr.m35177a(this.f85167a) == nb1.f82658c) {
            return this.f85169c.getHeight();
        }
        return this.f85168b.getHeight();
    }

    @Override // com.yandex.mobile.ads.impl.qu1
    public final int getWidth() {
        if (C30114cr.m35177a(this.f85167a) == nb1.f82658c) {
            return this.f85169c.getWidth();
        }
        return this.f85168b.getWidth();
    }

    public final int hashCode() {
        int hashCode = this.f85168b.hashCode();
        return this.f85169c.hashCode() + ((hashCode + (this.f85167a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        if (C30114cr.m35177a(this.f85167a) == nb1.f82658c) {
            return this.f85169c.toString();
        }
        return this.f85168b.toString();
    }

    @Override // com.yandex.mobile.ads.impl.qu1
    @NotNull
    /* renamed from: a */
    public final qu1.EnumC31236a mo29654a() {
        if (C30114cr.m35177a(this.f85167a) == nb1.f82658c) {
            return this.f85169c.mo29654a();
        }
        return this.f85168b.mo29654a();
    }
}
