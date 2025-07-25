package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
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
/* renamed from: com.ironsource.ik */
/* loaded from: classes6.dex */
public final class C20106ik extends FrameLayout implements NativeAdViewBinderInterface {
    @NotNull

    /* renamed from: a */
    private final NativeAdViewHolder f50621a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20106ik(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50621a = new NativeAdViewHolder();
    }

    /* renamed from: a */
    private final List<View> m57976a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(@Nullable View view) {
        this.f50621a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(@Nullable View view) {
        this.f50621a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(@Nullable View view) {
        this.f50621a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(@Nullable View view) {
        this.f50621a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(@Nullable LevelPlayMediaView levelPlayMediaView) {
        this.f50621a.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(@Nullable View view) {
        this.f50621a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20106ik(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f50621a = new NativeAdViewHolder();
    }

    /* renamed from: a */
    private final void m57975a(ViewGroup viewGroup, List<? extends View> list) {
        for (View view : list) {
            viewGroup.addView(view);
        }
    }

    /* renamed from: a */
    public final void m57974a(@NotNull C19924fk nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        List<View> m57976a = m57976a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        m57975a(frameLayout, m57976a);
        AdapterNativeAdViewBinder m58546f = nativeAd.m58546f();
        if (m58546f != null) {
            m58546f.setBodyView(this.f50621a.getBodyView());
            m58546f.setMediaView(this.f50621a.getMediaView());
            m58546f.setCallToActionView(this.f50621a.getCallToActionView());
            m58546f.setTitleView(this.f50621a.getTitleView());
            m58546f.setIconView(this.f50621a.getIconView());
            m58546f.setAdvertiserView(this.f50621a.getAdvertiserView());
            m58546f.setNativeAdView(frameLayout);
            addView(m58546f.getNetworkNativeAdView());
        }
    }
}
