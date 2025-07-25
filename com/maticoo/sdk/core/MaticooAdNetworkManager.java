package com.maticoo.sdk.core;

import android.text.TextUtils;
import com.maticoo.sdk.core.imp.interstitial.InterstitialImp;
import com.maticoo.sdk.core.imp.splash.SplashImp;
import com.maticoo.sdk.core.imp.video.VideoAdImp;
import com.maticoo.sdk.p405ad.AdListener;
import com.maticoo.sdk.p405ad.utils.Cache;
import com.maticoo.sdk.test.TestCallBackManager;
import com.maticoo.sdk.utils.debug.MaticooDebugUtils;
import com.maticoo.sdk.utils.log.DeveloperLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class MaticooAdNetworkManager {
    private final Map<String, AbstractAdsManager> mAdsManagers;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class OmHolder {
        private static final MaticooAdNetworkManager INSTANCE = new MaticooAdNetworkManager();

        private OmHolder() {
        }
    }

    private AbstractAdsManager getAdsManager(int i, String str) {
        String str2;
        AbstractAdsManager interstitialImp;
        if (MaticooDebugUtils.testEnv) {
            str2 = TestCallBackManager.deTestPlacementId(str);
        } else {
            str2 = str;
        }
        if (!this.mAdsManagers.containsKey(str2)) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 6) {
                        return null;
                    }
                    interstitialImp = new SplashImp(str);
                } else {
                    interstitialImp = new VideoAdImp(str);
                }
            } else {
                interstitialImp = new InterstitialImp(str);
            }
            this.mAdsManagers.put(str2, interstitialImp);
            return interstitialImp;
        }
        return this.mAdsManagers.get(str2);
    }

    public static MaticooAdNetworkManager getInstance() {
        return OmHolder.INSTANCE;
    }

    public void delAdsManager(String str) {
        if (MaticooDebugUtils.testEnv) {
            str = TestCallBackManager.deTestPlacementId(str);
        }
        this.mAdsManagers.remove(str);
    }

    public void destroy(String str) {
        if (MaticooDebugUtils.testEnv) {
            str = TestCallBackManager.deTestPlacementId(str);
        }
        AbstractAdsManager abstractAdsManager = this.mAdsManagers.get(str);
        if (abstractAdsManager == null || abstractAdsManager.isFullScreenInShowing()) {
            return;
        }
        abstractAdsManager.destroy();
        delAdsManager(str);
    }

    public float getCachedAdPrice(int i, String str) {
        AbstractAdsManager adsManager = getAdsManager(i, str);
        DeveloperLog.LogD("【" + hashCode() + "] getCachedAdBean, placementId =[" + str + "] manager = " + adsManager);
        if (adsManager != null) {
            return adsManager.getAdPrice();
        }
        return 0.0f;
    }

    public void init() {
        Cache.init();
    }

    public boolean isAdReady(int i, String str) {
        AbstractAdsManager adsManager = getAdsManager(i, str);
        DeveloperLog.LogD("【" + hashCode() + "] isAdReady, placementId =[" + str + "] manager = " + adsManager);
        if (adsManager != null) {
            DeveloperLog.LogD("isAdReady, manager hashCode = " + adsManager.hashCode());
            return adsManager.isReady();
        }
        return false;
    }

    public void loadAd(int i, String str) {
        loadAd(i, str, null);
    }

    public void preLoad(int i, String str) {
        AbstractAdsManager adsManager = getAdsManager(i, str);
        DeveloperLog.LogD("【" + hashCode() + "] preLoad, placementId =[" + str + "] manager = " + adsManager);
        if (adsManager != null) {
            DeveloperLog.LogD("preLoad, manager hashCode = " + adsManager.hashCode());
            adsManager.preLoad();
        }
    }

    public void setAdListener(int i, String str, AdListener adListener) {
        AbstractAdsManager adsManager;
        if (!TextUtils.isEmpty(str) && adListener != null && (adsManager = getAdsManager(i, str)) != null) {
            adsManager.setListener(adListener);
        }
    }

    public void setLocalExtra(int i, String str, Map<String, Object> map) {
        AbstractAdsManager adsManager;
        if (!TextUtils.isEmpty(str) && map != null && (adsManager = getAdsManager(i, str)) != null) {
            adsManager.setLocalExtra(map);
        }
    }

    public void showAd(int i, String str) {
        AbstractAdsManager adsManager = getAdsManager(i, str);
        DeveloperLog.LogD("【" + hashCode() + "] showAd, placementId =[" + str + "] manager = " + adsManager);
        if (adsManager != null) {
            DeveloperLog.LogD("showAd, manager hashCode = " + adsManager.hashCode());
            adsManager.showAds();
        }
    }

    private MaticooAdNetworkManager() {
        this.mAdsManagers = new ConcurrentHashMap();
    }

    public void loadAd(int i, String str, String str2) {
        AbstractAdsManager adsManager = getAdsManager(i, str);
        DeveloperLog.LogD("【" + hashCode() + "] loadAd, placementId =[" + str + "] manager = " + adsManager);
        if (adsManager != null) {
            DeveloperLog.LogD("loadAd, manager hashCode = " + adsManager.hashCode());
            if (TextUtils.isEmpty(str2)) {
                adsManager.loadAds();
            } else {
                adsManager.loadAds(str2);
            }
        }
    }

    public void destroy() {
        for (String str : this.mAdsManagers.keySet()) {
            AbstractAdsManager abstractAdsManager = this.mAdsManagers.get(str);
            if (abstractAdsManager != null && !abstractAdsManager.isFullScreenInShowing()) {
                abstractAdsManager.destroy();
                this.mAdsManagers.remove(str);
            }
        }
    }
}
