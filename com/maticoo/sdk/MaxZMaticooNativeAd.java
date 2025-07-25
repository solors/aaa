package com.maticoo.sdk;

import android.view.View;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.maticoo.sdk.p405ad.nativead.NativeAd;
import com.maticoo.sdk.p405ad.nativead.view.MediaView;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class MaxZMaticooNativeAd extends MaxNativeAd {
    private NativeAd nativeAd;

    public MaxZMaticooNativeAd(MaxNativeAd.Builder builder, NativeAd nativeAd) {
        super(builder);
        this.nativeAd = nativeAd;
    }

    @Override // com.applovin.mediation.nativeAds.MaxNativeAd
    public void prepareViewForInteraction(final MaxNativeAdView maxNativeAdView) {
        MediaView mediaView;
        maxNativeAdView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.maticoo.sdk.MaxZMaticooNativeAd.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                MaxZMaticooNativeAd.this.nativeAd.recordDisplay(view);
                maxNativeAdView.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        });
        ArrayList arrayList = new ArrayList();
        arrayList.add(maxNativeAdView.getIconImageView());
        arrayList.add(maxNativeAdView.getTitleTextView());
        arrayList.add(maxNativeAdView.getBodyTextView());
        arrayList.add(maxNativeAdView.getCallToActionButton());
        View mediaView2 = getMediaView();
        if (mediaView2 instanceof MediaView) {
            mediaView = (MediaView) mediaView2;
        } else {
            mediaView = null;
        }
        this.nativeAd.registerViewForInteraction(maxNativeAdView, mediaView, arrayList);
    }
}
