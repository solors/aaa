package com.unity3d.ironsourceads.banner;

import android.content.Context;
import android.widget.FrameLayout;
import com.ironsource.C20081i6;
import com.ironsource.InterfaceC20137j6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes7.dex */
public final class BannerAdView extends FrameLayout implements InterfaceC20137j6 {

    /* renamed from: a */
    private C20081i6 f74447a;
    @Nullable

    /* renamed from: b */
    private BannerAdViewListener f74448b;

    private BannerAdView(Context context) {
        super(context);
    }

    @NotNull
    public final BannerAdInfo getAdInfo() {
        C20081i6 c20081i6 = this.f74447a;
        if (c20081i6 == null) {
            Intrinsics.m17056y("bannerAdViewInternal");
            c20081i6 = null;
        }
        return c20081i6.m58018c();
    }

    @Nullable
    public final BannerAdViewListener getListener() {
        return this.f74448b;
    }

    @Override // com.ironsource.InterfaceC20137j6
    public void onBannerAdClicked() {
        BannerAdViewListener bannerAdViewListener = this.f74448b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdClicked(this);
        }
    }

    @Override // com.ironsource.InterfaceC20137j6
    public void onBannerAdShown() {
        BannerAdViewListener bannerAdViewListener = this.f74448b;
        if (bannerAdViewListener != null) {
            bannerAdViewListener.onBannerAdShown(this);
        }
    }

    public final void setListener(@Nullable BannerAdViewListener bannerAdViewListener) {
        this.f74448b = bannerAdViewListener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BannerAdView(@org.jetbrains.annotations.NotNull com.ironsource.C20081i6 r3) {
        /*
            r2 = this;
            java.lang.String r0 = "bannerAdViewInternal"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            com.ironsource.jf r0 = r3.m58016d()
            android.content.Context r0 = r0.getContext()
            java.lang.String r1 = "bannerAdViewInternal.container.context"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r2.<init>(r0)
            r2.f74447a = r3
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r3.m58022a(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r3.m58019b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ironsourceads.banner.BannerAdView.<init>(com.ironsource.i6):void");
    }
}
