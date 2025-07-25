package com.meevii.adsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.meevii.adsdk.common.util.LogUtil;
import com.meevii.adsdk.common.util.ThreadUtils;

/* loaded from: classes6.dex */
public class AdGaid {
    static final String GAID_KEY = "adsdk_gaid";
    static final String TAG = "ADSDK_AdGaid";
    private static AdGaid instance;
    private volatile String mGaid = "";

    /* renamed from: a */
    public static /* synthetic */ void m48063a(AdGaid adGaid, Context context) {
        adGaid.lambda$requestGaid$0(context);
    }

    public static AdGaid getInstance() {
        if (instance == null) {
            synchronized (AdGaid.class) {
                if (instance == null) {
                    instance = new AdGaid();
                }
            }
        }
        return instance;
    }

    public /* synthetic */ void lambda$requestGaid$0(Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            if (TextUtils.isEmpty(this.mGaid)) {
                this.mGaid = advertisingIdInfo.getId();
                LogUtil.m48060i(TAG, "requestGaid() update sp = " + this.mGaid);
                SharedProxy.getAdSdkSharedProxy(context).setString(GAID_KEY, this.mGaid);
            }
        } catch (Exception e) {
            e.printStackTrace();
            LogUtil.m48060i(TAG, "getGaid()   excepion = " + e.toString());
        }
    }

    private void requestGaid(final Context context) {
        ThreadUtils.runOnSingleThread(new Runnable() { // from class: com.meevii.adsdk.common.a
            @Override // java.lang.Runnable
            public final void run() {
                AdGaid.m48063a(AdGaid.this, context);
            }
        });
    }

    public String getGaid(Context context) {
        if (context == null) {
            return "";
        }
        if (!TextUtils.isEmpty(this.mGaid)) {
            return this.mGaid;
        }
        String string = SharedProxy.getAdSdkSharedProxy(context).getString(GAID_KEY, "");
        if (!TextUtils.isEmpty(string)) {
            this.mGaid = string;
            LogUtil.m48060i(TAG, "getGaid() from sp  GAID = " + this.mGaid);
            return this.mGaid;
        }
        requestGaid(context);
        return this.mGaid;
    }
}
