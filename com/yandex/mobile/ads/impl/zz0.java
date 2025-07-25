package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class zz0 {

    /* renamed from: g */
    static final /* synthetic */ KProperty<Object>[] f89164g = {C30452ha.m33588a(zz0.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    @NotNull

    /* renamed from: a */
    private final k01 f89165a;
    @NotNull

    /* renamed from: b */
    private final d01 f89166b;
    @NotNull

    /* renamed from: c */
    private final mq0 f89167c;
    @NotNull

    /* renamed from: d */
    private final xj1 f89168d;
    @Nullable

    /* renamed from: e */
    private lq0 f89169e;

    /* renamed from: f */
    private boolean f89170f;

    public zz0(@NotNull ViewPager2 viewPager, @NotNull k01 multiBannerSwiper, @NotNull d01 multiBannerEventTracker, @NotNull mq0 jobSchedulerFactory) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(multiBannerSwiper, "multiBannerSwiper");
        Intrinsics.checkNotNullParameter(multiBannerEventTracker, "multiBannerEventTracker");
        Intrinsics.checkNotNullParameter(jobSchedulerFactory, "jobSchedulerFactory");
        this.f89165a = multiBannerSwiper;
        this.f89166b = multiBannerEventTracker;
        this.f89167c = jobSchedulerFactory;
        this.f89168d = yj1.m26872a(viewPager);
        this.f89170f = true;
    }

    /* renamed from: a */
    public final void m25946a() {
        m25944b();
        this.f89170f = false;
    }

    /* renamed from: b */
    public final void m25944b() {
        lq0 lq0Var = this.f89169e;
        if (lq0Var != null) {
            lq0Var.m32215a();
        }
        this.f89169e = null;
    }

    /* renamed from: a */
    public final void m25945a(long j) {
        Unit unit;
        if (j <= 0 || !this.f89170f) {
            return;
        }
        m25944b();
        ViewPager2 viewPager2 = (ViewPager2) this.f89168d.getValue(this, f89164g[0]);
        if (viewPager2 != null) {
            a01 a01Var = new a01(viewPager2, this.f89165a, this.f89166b);
            this.f89167c.getClass();
            lq0 lq0Var = new lq0(new Handler(Looper.getMainLooper()));
            this.f89169e = lq0Var;
            lq0Var.m32214a(j, a01Var);
            unit = Unit.f99208a;
        } else {
            unit = null;
        }
        if (unit == null) {
            m25944b();
            this.f89170f = false;
        }
    }
}
