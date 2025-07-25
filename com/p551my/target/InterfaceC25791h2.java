package com.p551my.target;

import android.content.Context;
import android.view.View;
import com.p551my.target.nativeads.NativeAd;
import com.p551my.target.nativeads.banners.NativePromoBanner;
import com.p551my.target.nativeads.views.MediaAdView;
import java.util.List;

/* renamed from: com.my.target.h2 */
/* loaded from: classes7.dex */
public interface InterfaceC25791h2 {
    /* renamed from: a */
    void mo43257a(View view, List list, int i, MediaAdView mediaAdView);

    /* renamed from: a */
    void mo43253a(NativeAd.NativeAdMediaListener nativeAdMediaListener);

    /* renamed from: b */
    String mo43250b();

    /* renamed from: c */
    float mo43249c();

    /* renamed from: e */
    NativePromoBanner mo43247e();

    void handleAdChoicesClick(Context context);

    void unregisterView();
}
