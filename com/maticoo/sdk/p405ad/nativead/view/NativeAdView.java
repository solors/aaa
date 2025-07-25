package com.maticoo.sdk.p405ad.nativead.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.maticoo.sdk.core.imp.nativead.NativeAdImpl;
import com.maticoo.sdk.p405ad.nativead.NativeAd;

/* renamed from: com.maticoo.sdk.ad.nativead.view.NativeAdView */
/* loaded from: classes6.dex */
public class NativeAdView extends FrameLayout {
    protected NativeAdImpl mNativeAd;

    public NativeAdView(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NativeAdImpl nativeAdImpl = this.mNativeAd;
        if (nativeAdImpl != null) {
            nativeAdImpl.recordDisplay(this);
        }
    }

    public void setNativeAd(NativeAd nativeAd) {
        NativeAdImpl nativeAdImpl;
        if (nativeAd instanceof NativeAdImpl) {
            this.mNativeAd = (NativeAdImpl) nativeAd;
            if (isAttachedToWindow() && (nativeAdImpl = this.mNativeAd) != null) {
                nativeAdImpl.recordDisplay(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("nativeAd is type error");
    }

    public NativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NativeAdView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
