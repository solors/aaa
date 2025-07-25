package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class f41 {

    /* renamed from: f */
    static final /* synthetic */ KProperty<Object>[] f78959f = {C30452ha.m33588a(f41.class, "nativeAdView", "getNativeAdView()Landroid/view/View;", 0), C30452ha.m33588a(f41.class, "imageView", "getImageView()Landroid/widget/ImageView;", 0), C30452ha.m33588a(f41.class, "muteButtonView", "getMuteButtonView()Landroid/widget/CheckBox;", 0), C30452ha.m33588a(f41.class, "videoProgressView", "getVideoProgressView()Landroid/widget/ProgressBar;", 0)};
    @NotNull

    /* renamed from: a */
    private final xj1 f78960a;
    @NotNull

    /* renamed from: b */
    private final xj1 f78961b;
    @NotNull

    /* renamed from: c */
    private final xj1 f78962c;
    @NotNull

    /* renamed from: d */
    private final xj1 f78963d;
    @NotNull

    /* renamed from: e */
    private final LinkedHashMap f78964e;

    /* renamed from: com.yandex.mobile.ads.impl.f41$a */
    /* loaded from: classes8.dex */
    public static final class C30292a {
        @NotNull

        /* renamed from: a */
        private final View f78965a;
        @Nullable

        /* renamed from: b */
        private CheckBox f78966b;
        @Nullable

        /* renamed from: c */
        private ProgressBar f78967c;
        @NotNull

        /* renamed from: d */
        private final Map<String, View> f78968d;
        @Nullable

        /* renamed from: e */
        private ImageView f78969e;

        public C30292a(@NotNull View nativeAdView, @NotNull Map<String, ? extends View> initialAssetViews) {
            Map<String, View> m17285D;
            Intrinsics.checkNotNullParameter(nativeAdView, "nativeAdView");
            Intrinsics.checkNotNullParameter(initialAssetViews, "initialAssetViews");
            this.f78965a = nativeAdView;
            m17285D = C37559r0.m17285D(initialAssetViews);
            this.f78968d = m17285D;
        }

        @NotNull
        /* renamed from: a */
        public final Map<String, View> m34230a() {
            return this.f78968d;
        }

        @Nullable
        /* renamed from: b */
        public final ImageView m34226b() {
            return this.f78969e;
        }

        @Nullable
        /* renamed from: c */
        public final CheckBox m34225c() {
            return this.f78966b;
        }

        @NotNull
        /* renamed from: d */
        public final View m34224d() {
            return this.f78965a;
        }

        @Nullable
        /* renamed from: e */
        public final ProgressBar m34223e() {
            return this.f78967c;
        }

        @NotNull
        /* renamed from: a */
        public final C30292a m34228a(@Nullable ImageView imageView) {
            this.f78969e = imageView;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30292a m34229a(@Nullable CheckBox checkBox) {
            this.f78966b = checkBox;
            return this;
        }

        @NotNull
        /* renamed from: a */
        public final C30292a m34227a(@Nullable ProgressBar progressBar) {
            this.f78967c = progressBar;
            return this;
        }
    }

    private f41(C30292a c30292a) {
        this.f78960a = yj1.m26872a(c30292a.m34224d());
        this.f78961b = yj1.m26872a(c30292a.m34226b());
        this.f78962c = yj1.m26872a(c30292a.m34225c());
        this.f78963d = yj1.m26872a(c30292a.m34223e());
        this.f78964e = dr0.m34864a(c30292a.m34230a());
    }

    @Nullable
    /* renamed from: a */
    public final View m34235a(@NotNull String assetName) {
        Intrinsics.checkNotNullParameter(assetName, "assetName");
        WeakReference weakReference = (WeakReference) this.f78964e.get(assetName);
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public final ImageView m34234b() {
        return (ImageView) this.f78961b.getValue(this, f78959f[1]);
    }

    @Nullable
    /* renamed from: c */
    public final CheckBox m34233c() {
        return (CheckBox) this.f78962c.getValue(this, f78959f[2]);
    }

    @Nullable
    /* renamed from: d */
    public final View m34232d() {
        return (View) this.f78960a.getValue(this, f78959f[0]);
    }

    @Nullable
    /* renamed from: e */
    public final ProgressBar m34231e() {
        return (ProgressBar) this.f78963d.getValue(this, f78959f[3]);
    }

    @NotNull
    /* renamed from: a */
    public final LinkedHashMap m34236a() {
        return this.f78964e;
    }

    public /* synthetic */ f41(C30292a c30292a, int i) {
        this(c30292a);
    }
}
