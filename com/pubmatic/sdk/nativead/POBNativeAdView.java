package com.pubmatic.sdk.nativead;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public class POBNativeAdView extends FrameLayout implements View.OnClickListener {
    @NonNull

    /* renamed from: a */
    private final POBNativeAdViewHandler f70442a;

    public POBNativeAdView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f70442a.onAdViewAttachedToWindow();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.f70442a.onClick(view);
    }

    public void setListener(@Nullable POBNativeAdViewListener pOBNativeAdViewListener) {
        this.f70442a.setListener(pOBNativeAdViewListener);
    }

    public POBNativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public POBNativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        POBNativeAdViewHandler pOBNativeAdViewHandler = new POBNativeAdViewHandler();
        this.f70442a = pOBNativeAdViewHandler;
        pOBNativeAdViewHandler.setAdView(this);
    }
}
