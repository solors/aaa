package com.unity3d.player;

import android.app.Activity;
import android.content.Context;

/* loaded from: classes7.dex */
class PlayAssetDeliveryUnityWrapper {

    /* renamed from: b */
    private static PlayAssetDeliveryUnityWrapper f74598b;

    /* renamed from: a */
    private InterfaceC28797t f74599a;

    private PlayAssetDeliveryUnityWrapper(Context context) {
        if (f74598b == null) {
            try {
                Class.forName("com.google.android.play.core.assetpacks.AssetPackManager");
                this.f74599a = m37712a(context);
                return;
            } catch (ClassNotFoundException unused) {
                this.f74599a = null;
                return;
            }
        }
        throw new RuntimeException("PlayAssetDeliveryUnityWrapper should be created only once. Use getInstance() instead.");
    }

    /* renamed from: a */
    private InterfaceC28797t m37712a(Context context) {
        return C28786i.m37637a(context);
    }

    public static synchronized PlayAssetDeliveryUnityWrapper getInstance() {
        PlayAssetDeliveryUnityWrapper playAssetDeliveryUnityWrapper;
        synchronized (PlayAssetDeliveryUnityWrapper.class) {
            while (true) {
                playAssetDeliveryUnityWrapper = f74598b;
                if (playAssetDeliveryUnityWrapper == null) {
                    try {
                        PlayAssetDeliveryUnityWrapper.class.wait(3000L);
                    } catch (InterruptedException e) {
                        AbstractC28798u.Log(6, e.getMessage());
                    }
                }
            }
        }
        return playAssetDeliveryUnityWrapper;
    }

    public static synchronized PlayAssetDeliveryUnityWrapper init(Context context) {
        PlayAssetDeliveryUnityWrapper playAssetDeliveryUnityWrapper;
        synchronized (PlayAssetDeliveryUnityWrapper.class) {
            if (f74598b == null) {
                f74598b = new PlayAssetDeliveryUnityWrapper(context);
                PlayAssetDeliveryUnityWrapper.class.notifyAll();
                playAssetDeliveryUnityWrapper = f74598b;
            } else {
                throw new RuntimeException("PlayAssetDeliveryUnityWrapper.init() should be called only once. Use getInstance() instead.");
            }
        }
        return playAssetDeliveryUnityWrapper;
    }

    public void cancelAssetPackDownload(String str) {
        cancelAssetPackDownloads(new String[]{str});
    }

    public void cancelAssetPackDownloads(String[] strArr) {
        m37713a();
        ((C28786i) this.f74599a).m37631a(strArr);
    }

    public void downloadAssetPack(String str, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        downloadAssetPacks(new String[]{str}, iAssetPackManagerDownloadStatusCallback);
    }

    public void downloadAssetPacks(String[] strArr, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        m37713a();
        ((C28786i) this.f74599a).m37630a(strArr, iAssetPackManagerDownloadStatusCallback);
    }

    public String getAssetPackPath(String str) {
        m37713a();
        return ((C28786i) this.f74599a).m37633a(str);
    }

    public void getAssetPackState(String str, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        getAssetPackStates(new String[]{str}, iAssetPackManagerStatusQueryCallback);
    }

    public void getAssetPackStates(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        m37713a();
        ((C28786i) this.f74599a).m37629a(strArr, iAssetPackManagerStatusQueryCallback);
    }

    public boolean playCoreApiMissing() {
        if (this.f74599a == null) {
            return true;
        }
        return false;
    }

    public Object registerDownloadStatusListener(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        m37713a();
        return ((C28786i) this.f74599a).m37636a(iAssetPackManagerDownloadStatusCallback);
    }

    public void removeAssetPack(String str) {
        m37713a();
        ((C28786i) this.f74599a).m37627b(str);
    }

    public void requestToUseMobileData(Activity activity, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        m37713a();
        ((C28786i) this.f74599a).m37638a(activity, iAssetPackManagerMobileDataConfirmationCallback);
    }

    public void unregisterDownloadStatusListener(Object obj) {
        m37713a();
        ((C28786i) this.f74599a).m37634a(obj);
    }

    /* renamed from: a */
    private void m37713a() {
        if (playCoreApiMissing()) {
            throw new RuntimeException("AssetPackManager API is not available! Make sure your gradle project includes 'com.google.android.play:asset-delivery' dependency.");
        }
    }
}
