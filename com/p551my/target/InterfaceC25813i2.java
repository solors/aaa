package com.p551my.target;

import android.content.Context;
import android.view.View;
import com.p551my.target.nativeads.NativeBannerAd;
import com.p551my.target.nativeads.banners.NativeBanner;
import java.util.List;

/* renamed from: com.my.target.i2 */
/* loaded from: classes7.dex */
public interface InterfaceC25813i2 {
    /* renamed from: a */
    void mo43399a(NativeBannerAd.NativeBannerAdMediaListener nativeBannerAdMediaListener);

    /* renamed from: b */
    String mo43767b();

    /* renamed from: c */
    float mo43766c();

    /* renamed from: d */
    NativeBanner mo43395d();

    void handleAdChoicesClick(Context context);

    void registerView(View view, List list, int i);

    void unregisterView();
}
