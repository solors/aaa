package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p715i8.IScarFullScreenAd;
import p715i8.UnityAdFormat;
import p741j8.ISignalCollectionListener;
import p741j8.ISignalsCollector;

/* renamed from: com.unity3d.scar.adapter.common.k */
/* loaded from: classes7.dex */
public abstract class ScarAdapterBase implements IScarAdapter {

    /* renamed from: a */
    protected ISignalsCollector f74942a;

    /* renamed from: b */
    protected Map<String, IScarFullScreenAd> f74943b = new ConcurrentHashMap();

    /* renamed from: c */
    protected IScarFullScreenAd f74944c;

    /* renamed from: d */
    protected IAdsErrorHandler<WebViewAdsError> f74945d;

    /* compiled from: ScarAdapterBase.java */
    /* renamed from: com.unity3d.scar.adapter.common.k$a */
    /* loaded from: classes7.dex */
    class RunnableC28804a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Activity f74946b;

        RunnableC28804a(Activity activity) {
            this.f74946b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            ScarAdapterBase.this.f74944c.show(this.f74946b);
        }
    }

    public ScarAdapterBase(IAdsErrorHandler<WebViewAdsError> iAdsErrorHandler) {
        this.f74945d = iAdsErrorHandler;
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    /* renamed from: a */
    public void mo37573a(Context context, boolean z, ISignalCollectionListener iSignalCollectionListener) {
        this.f74942a.mo18520a(context, z, iSignalCollectionListener);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    /* renamed from: b */
    public void mo37572b(Context context, List<UnityAdFormat> list, ISignalCollectionListener iSignalCollectionListener) {
        this.f74942a.mo18519b(context, list, iSignalCollectionListener);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    /* renamed from: c */
    public void mo37571c(Context context, String str, UnityAdFormat unityAdFormat, ISignalCollectionListener iSignalCollectionListener) {
        this.f74942a.mo18518c(context, str, unityAdFormat, iSignalCollectionListener);
    }

    @Override // com.unity3d.scar.adapter.common.IScarAdapter
    /* renamed from: d */
    public void mo37570d(Activity activity, String str, String str2) {
        IScarFullScreenAd iScarFullScreenAd = this.f74943b.get(str2);
        if (iScarFullScreenAd == null) {
            IAdsErrorHandler<WebViewAdsError> iAdsErrorHandler = this.f74945d;
            iAdsErrorHandler.handleError(GMAAdsError.m37575f(str2, str, "Could not find ad for placement '" + str2 + "'."));
            return;
        }
        this.f74944c = iScarFullScreenAd;
        C28805l.m37569a(new RunnableC28804a(activity));
    }
}
