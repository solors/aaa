package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* loaded from: classes8.dex */
public final class a01 extends AbstractRunnableC31828xm {

    /* renamed from: g */
    static final /* synthetic */ KProperty<Object>[] f76644g = {C30452ha.m33588a(a01.class, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0)};
    @NotNull

    /* renamed from: c */
    private final k01 f76645c;
    @NotNull

    /* renamed from: d */
    private final d01 f76646d;
    @NotNull

    /* renamed from: e */
    private final xj1 f76647e;
    @NotNull

    /* renamed from: f */
    private EnumC29911a f76648f;

    /* renamed from: com.yandex.mobile.ads.impl.a01$a */
    /* loaded from: classes8.dex */
    public static final class EnumC29911a {

        /* renamed from: b */
        public static final EnumC29911a f76649b;

        /* renamed from: c */
        public static final EnumC29911a f76650c;

        /* renamed from: d */
        private static final /* synthetic */ EnumC29911a[] f76651d;

        static {
            EnumC29911a enumC29911a = new EnumC29911a(0, "LEFT");
            f76649b = enumC29911a;
            EnumC29911a enumC29911a2 = new EnumC29911a(1, "RIGHT");
            f76650c = enumC29911a2;
            EnumC29911a[] enumC29911aArr = {enumC29911a, enumC29911a2};
            f76651d = enumC29911aArr;
            C44401b.m3113a(enumC29911aArr);
        }

        private EnumC29911a(int i, String str) {
            super(str, i);
        }

        public static EnumC29911a valueOf(String str) {
            return (EnumC29911a) Enum.valueOf(EnumC29911a.class, str);
        }

        public static EnumC29911a[] values() {
            return (EnumC29911a[]) f76651d.clone();
        }
    }

    public a01(@NotNull ViewPager2 viewPager, @NotNull k01 multiBannerSwiper, @NotNull d01 multiBannerEventTracker) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        Intrinsics.checkNotNullParameter(multiBannerSwiper, "multiBannerSwiper");
        Intrinsics.checkNotNullParameter(multiBannerEventTracker, "multiBannerEventTracker");
        this.f76645c = multiBannerSwiper;
        this.f76646d = multiBannerEventTracker;
        this.f76647e = yj1.m26872a(viewPager);
        this.f76648f = EnumC29911a.f76649b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Unit unit;
        int i = 0;
        ViewPager2 viewPager2 = (ViewPager2) this.f76647e.getValue(this, f76644g[0]);
        if (viewPager2 != null) {
            if (cc2.m35253b(viewPager2) > 0) {
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                if (adapter != null) {
                    i = adapter.getItemCount();
                }
                if (i != 0) {
                    int currentItem = viewPager2.getCurrentItem();
                    if (currentItem == 0) {
                        this.f76648f = EnumC29911a.f76649b;
                    } else if (currentItem == i - 1) {
                        this.f76648f = EnumC29911a.f76650c;
                    }
                } else {
                    m27458a();
                }
                int ordinal = this.f76648f.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        this.f76645c.m32690b();
                    }
                } else {
                    this.f76645c.m32691a();
                }
                this.f76646d.m35127a();
            }
            unit = Unit.f99208a;
        } else {
            unit = null;
        }
        if (unit == null) {
            m27458a();
        }
    }
}
