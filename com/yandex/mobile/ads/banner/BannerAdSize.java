package com.yandex.mobile.ads.banner;

import android.content.Context;
import com.yandex.mobile.ads.impl.C31309rr;
import com.yandex.mobile.ads.impl.ch1;
import com.yandex.mobile.ads.impl.e90;
import com.yandex.mobile.ads.impl.qu1;
import com.yandex.mobile.ads.impl.wx1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes8.dex */
public final class BannerAdSize extends ch1 {
    @NotNull

    /* renamed from: a */
    public static final C29889a f76512a = new C29889a(null);
    @NotNull

    /* renamed from: b */
    private final qu1 f76513b;

    @Metadata
    /* renamed from: com.yandex.mobile.ads.banner.BannerAdSize$a */
    /* loaded from: classes8.dex */
    public static final class C29889a {
        public /* synthetic */ C29889a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final BannerAdSize fixedSize(@NotNull Context context, int i, int i2) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new BannerAdSize(new e90(i, i2, qu1.EnumC31236a.f84540c));
        }

        @NotNull
        public final BannerAdSize inlineSize(@NotNull Context context, int i, int i2) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new BannerAdSize(new e90(i, i2, qu1.EnumC31236a.f84541d));
        }

        @NotNull
        public final BannerAdSize stickySize(@NotNull Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            C31309rr coreBannerAdSize = wx1.m27727a(context, i);
            Intrinsics.checkNotNullParameter(coreBannerAdSize, "coreBannerAdSize");
            return new BannerAdSize(coreBannerAdSize.m33827a());
        }

        private C29889a() {
        }
    }

    public BannerAdSize(@NotNull qu1 sizeInfo) {
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        this.f76513b = sizeInfo;
    }

    @NotNull
    public static final BannerAdSize fixedSize(@NotNull Context context, int i, int i2) {
        return f76512a.fixedSize(context, i, i2);
    }

    @NotNull
    public static final BannerAdSize inlineSize(@NotNull Context context, int i, int i2) {
        return f76512a.inlineSize(context, i, i2);
    }

    @NotNull
    public static final BannerAdSize stickySize(@NotNull Context context, int i) {
        return f76512a.stickySize(context, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @NotNull
    /* renamed from: a */
    public final qu1 m36052a() {
        return this.f76513b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Intrinsics.m17075f(BannerAdSize.class, obj.getClass())) {
            return Intrinsics.m17075f(this.f76513b, ((BannerAdSize) obj).f76513b);
        }
        return false;
    }

    public final int getHeight() {
        return this.f76513b.getHeight();
    }

    public final int getHeightInPixels(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f76513b.mo29652b(context);
    }

    public final int getWidth() {
        return this.f76513b.getWidth();
    }

    public final int getWidthInPixels(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f76513b.mo29650d(context);
    }

    public int hashCode() {
        return this.f76513b.hashCode();
    }

    @NotNull
    public String toString() {
        return this.f76513b.toString();
    }

    public final int getHeight(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f76513b.mo29653a(context);
    }

    public final int getWidth(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.f76513b.mo29651c(context);
    }
}
