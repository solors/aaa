package com.meevii.adsdk.common;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.meevii.adsdk.common.Adapter;
import com.meevii.adsdk.common.util.AdError;
import com.meevii.adsdk.common.util.LogUtil;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class MediationAdapter extends Adapter {
    private static final String TAG = "ADSDK_MediationAdapter";
    public boolean isInit;
    private final LinkedHashMap<String, AdLoadCacheTask> mCacheMap = new LinkedHashMap<>();
    protected final Map<String, Adapter.IAdLoadListener> mAdLoadListenerMap = new HashMap();
    protected final Map<String, Adapter.IAdShowListener> mAdShowListenerMap = new HashMap();
    protected final Map<String, String> mAdRequestIdMap = new HashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public void onInitCallback(boolean z, AdError adError) {
        this.isInit = true;
        if (this.mCacheMap.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, AdLoadCacheTask>> it = this.mCacheMap.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().run(z, adError);
            it.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void cacheLoad(String str, AdLoadCacheTask adLoadCacheTask) {
        if (this.mCacheMap.containsKey(str)) {
            LogUtil.m48060i(TAG, "has cached adLoadTask，adUnitId = " + str + " , just return");
            return;
        }
        LogUtil.m48060i(TAG, "sdk not init,add adLoadTask cache，adUnitId = " + str);
        this.mCacheMap.put(str, adLoadCacheTask);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getAdRequestId(String str) {
        return this.mAdRequestIdMap.containsKey(str) ? this.mAdRequestIdMap.get(str) : "1";
    }

    public abstract HashSet<String> getAdShowActivitySet();

    public Context getApplicationCtx() {
        return AppStatus.getInstance().getApplication();
    }

    public Activity getHomeActivity() {
        return AppStatus.getInstance().getHomeActivity();
    }

    @Override // com.meevii.adsdk.common.Adapter
    public void init(Application application, String str, Map<String, Object> map, final IInitListener iInitListener) {
        super.init(application, str, map, iInitListener);
        AppStatus.getInstance().setApplication(application);
        AppStatus.getInstance().addAppStatusListener(this);
        AppStatus.getInstance().addExternalActivity(getAdShowActivitySet());
        initSdk(application, str, map, new IInitListener() { // from class: com.meevii.adsdk.common.MediationAdapter.1
            @Override // com.meevii.adsdk.common.IInitListener
            public void onError(AdError adError) {
                iInitListener.onError(adError);
                MediationAdapter.this.onInitCallback(false, adError);
            }

            @Override // com.meevii.adsdk.common.IInitListener
            public void onSuccess() {
                iInitListener.onSuccess();
                MediationAdapter.this.onInitCallback(true, null);
            }
        });
    }

    public abstract void initSdk(Application application, String str, Map<String, Object> map, IInitListener iInitListener);

    public void notifyADAction(int i, String str, String str2, Bundle bundle) {
        if (this.mAdShowListenerMap.containsKey(str)) {
            this.mAdShowListenerMap.get(str).onADAction(i, str, str2, bundle);
        }
    }

    public void notifyAdClick(String str, String str2, Bundle bundle) {
        if (this.mAdShowListenerMap.containsKey(str)) {
            this.mAdShowListenerMap.get(str).onADClick(str, str2, bundle);
        }
    }

    public void notifyAdClose(String str, String str2, Bundle bundle) {
        if (this.mAdShowListenerMap.containsKey(str)) {
            this.mAdShowListenerMap.get(str).onADClose(str, str2, bundle);
        }
    }

    public void notifyAdShowReceived(String str, String str2, boolean z, Bundle bundle) {
        if (this.mAdShowListenerMap.containsKey(str)) {
            this.mAdShowListenerMap.get(str).onADShowReceived(str, str2, z, bundle);
        }
    }

    public void notifyCallAdShow(String str, String str2, boolean z) {
        if (this.mAdShowListenerMap.containsKey(str)) {
            this.mAdShowListenerMap.get(str).onADShow(str, str2, z);
        }
    }

    public void notifyLoadError(String str, String str2, AdError adError) {
        if (this.mAdLoadListenerMap.containsKey(str)) {
            this.mAdLoadListenerMap.get(str).onLoadError(str, str2, adError);
        }
    }

    public void notifyLoadSuccess(String str, String str2, Bundle bundle) {
        if (this.mAdLoadListenerMap.containsKey(str)) {
            this.mAdLoadListenerMap.get(str).onLoadSuccess(str, str2, bundle);
        }
    }

    public void notifyNetworkRequest(String str, String str2) {
        if (this.mAdLoadListenerMap.containsKey(str)) {
            this.mAdLoadListenerMap.get(str).onNetworkRequest(str, str2);
        }
    }

    public void notifyRewardedVideoCompleted(String str, String str2, Bundle bundle) {
        if (this.mAdShowListenerMap.containsKey(str)) {
            this.mAdShowListenerMap.get(str).onRewardedVideoCompleted(str, str2, bundle);
        }
    }

    public void notifyShowError(String str, String str2, AdError adError, Bundle bundle) {
        if (this.mAdShowListenerMap.containsKey(str)) {
            this.mAdShowListenerMap.get(str).onShowError(str, str2, adError, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void updateAdRequestId(String str, String str2) {
        this.mAdRequestIdMap.put(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getAdRequestId(RequestAd requestAd) {
        return requestAd == null ? "1" : requestAd.getAdRequestId();
    }

    public void notifyShowError(String str, AdError adError) {
        notifyShowError(str, null, adError, null);
    }
}
