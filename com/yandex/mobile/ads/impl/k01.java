package com.yandex.mobile.ads.impl;

import androidx.viewpager2.widget.ViewPager2;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class k01 {
    @NotNull

    /* renamed from: a */
    private final WeakReference<ViewPager2> f81223a;

    public k01(@NotNull ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        this.f81223a = new WeakReference<>(viewPager);
    }

    /* renamed from: a */
    public final void m32691a() {
        ViewPager2 viewPager2 = this.f81223a.get();
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1, true);
        }
    }

    /* renamed from: b */
    public final void m32690b() {
        ViewPager2 viewPager2 = this.f81223a.get();
        if (viewPager2 != null) {
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() - 1, true);
        }
    }
}
