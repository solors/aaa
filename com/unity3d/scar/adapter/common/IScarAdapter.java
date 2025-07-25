package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import android.widget.RelativeLayout;
import java.util.List;
import p715i8.ScarAdMetadata;
import p715i8.UnityAdFormat;
import p741j8.ISignalCollectionListener;

/* renamed from: com.unity3d.scar.adapter.common.f */
/* loaded from: classes7.dex */
public interface IScarAdapter {
    /* renamed from: a */
    void mo37573a(Context context, boolean z, ISignalCollectionListener iSignalCollectionListener);

    /* renamed from: b */
    void mo37572b(Context context, List<UnityAdFormat> list, ISignalCollectionListener iSignalCollectionListener);

    /* renamed from: c */
    void mo37571c(Context context, String str, UnityAdFormat unityAdFormat, ISignalCollectionListener iSignalCollectionListener);

    /* renamed from: d */
    void mo37570d(Activity activity, String str, String str2);

    /* renamed from: e */
    void mo13921e(Context context, ScarAdMetadata scarAdMetadata, IScarRewardedAdListenerWrapper iScarRewardedAdListenerWrapper);

    /* renamed from: f */
    void mo13920f(Context context, RelativeLayout relativeLayout, ScarAdMetadata scarAdMetadata, int i, int i2, IScarBannerAdListenerWrapper iScarBannerAdListenerWrapper);

    /* renamed from: g */
    void mo13919g(Context context, ScarAdMetadata scarAdMetadata, IScarInterstitialAdListenerWrapper iScarInterstitialAdListenerWrapper);
}
