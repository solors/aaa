package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.dr */
/* loaded from: classes8.dex */
public abstract class AbstractView$OnClickListenerC30188dr implements View.OnClickListener {
    @NotNull

    /* renamed from: a */
    private final d01 f78230a;
    @Nullable

    /* renamed from: b */
    private final zz0 f78231b;

    /* renamed from: com.yandex.mobile.ads.impl.dr$a */
    /* loaded from: classes8.dex */
    public static final class C30189a extends AbstractView$OnClickListenerC30188dr {
        @NotNull

        /* renamed from: c */
        private final k01 f78232c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30189a(@NotNull k01 multiBannerSwiper, @NotNull d01 multiBannerEventTracker, @Nullable zz0 zz0Var) {
            super(multiBannerEventTracker, zz0Var, 0);
            Intrinsics.checkNotNullParameter(multiBannerSwiper, "multiBannerSwiper");
            Intrinsics.checkNotNullParameter(multiBannerEventTracker, "multiBannerEventTracker");
            this.f78232c = multiBannerSwiper;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractView$OnClickListenerC30188dr, android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            this.f78232c.m32690b();
            super.onClick(view);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dr$b */
    /* loaded from: classes8.dex */
    public static final class C30190b extends AbstractView$OnClickListenerC30188dr {
        @NotNull

        /* renamed from: c */
        private final k01 f78233c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C30190b(@NotNull k01 multiBannerSwiper, @NotNull d01 multiBannerEventTracker, @Nullable zz0 zz0Var) {
            super(multiBannerEventTracker, zz0Var, 0);
            Intrinsics.checkNotNullParameter(multiBannerSwiper, "multiBannerSwiper");
            Intrinsics.checkNotNullParameter(multiBannerEventTracker, "multiBannerEventTracker");
            this.f78233c = multiBannerSwiper;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractView$OnClickListenerC30188dr, android.view.View.OnClickListener
        public final void onClick(@Nullable View view) {
            this.f78233c.m32691a();
            super.onClick(view);
        }
    }

    private AbstractView$OnClickListenerC30188dr(d01 d01Var, zz0 zz0Var) {
        this.f78230a = d01Var;
        this.f78231b = zz0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@Nullable View view) {
        zz0 zz0Var = this.f78231b;
        if (zz0Var != null) {
            zz0Var.m25946a();
        }
        this.f78230a.m35125b();
    }

    public /* synthetic */ AbstractView$OnClickListenerC30188dr(d01 d01Var, zz0 zz0Var, int i) {
        this(d01Var, zz0Var);
    }
}
