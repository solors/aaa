package com.ironsource.mediationsdk.ads.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes6.dex */
public final class NativeAdLayout extends FrameLayout implements NativeAdViewBinderInterface {
    @NotNull

    /* renamed from: a */
    private final NativeAdViewHolder f51287a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51287a = new NativeAdViewHolder();
    }

    /* renamed from: a */
    private final List<View> m57063a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }

    public final void registerNativeAdViews(@NotNull LevelPlayNativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        List<View> m57063a = m57063a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        m57062a(frameLayout, m57063a);
        AdapterNativeAdViewBinder nativeAdViewBinder = nativeAd.getNativeAdViewBinder();
        if (nativeAdViewBinder != null) {
            nativeAdViewBinder.setBodyView(this.f51287a.getBodyView());
            nativeAdViewBinder.setMediaView(this.f51287a.getMediaView());
            nativeAdViewBinder.setCallToActionView(this.f51287a.getCallToActionView());
            nativeAdViewBinder.setTitleView(this.f51287a.getTitleView());
            nativeAdViewBinder.setIconView(this.f51287a.getIconView());
            nativeAdViewBinder.setAdvertiserView(this.f51287a.getAdvertiserView());
            nativeAdViewBinder.setNativeAdView(frameLayout);
            addView(nativeAdViewBinder.getNetworkNativeAdView());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(@Nullable View view) {
        this.f51287a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(@Nullable View view) {
        this.f51287a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(@Nullable View view) {
        this.f51287a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(@Nullable View view) {
        this.f51287a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(@Nullable LevelPlayMediaView levelPlayMediaView) {
        this.f51287a.setMediaView(levelPlayMediaView);
    }

    public final void setNativeAd(@NotNull LevelPlayNativeAd nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        registerNativeAdViews(nativeAd);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(@Nullable View view) {
        this.f51287a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51287a = new NativeAdViewHolder();
    }

    /* renamed from: a */
    private final void m57062a(ViewGroup viewGroup, List<? extends View> list) {
        for (View view : list) {
            viewGroup.addView(view);
        }
    }
}
