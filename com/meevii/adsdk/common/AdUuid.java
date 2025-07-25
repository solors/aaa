package com.meevii.adsdk.common;

import android.content.Context;
import android.text.TextUtils;
import com.meevii.adsdk.common.util.LogUtil;

/* loaded from: classes6.dex */
public class AdUuid {
    private static final String TAG = "ADSDK_AdUuid";
    private static final String UUID_KEY = "adsdk_uuid";
    private String mUuid;

    /* loaded from: classes6.dex */
    private static class Holder {
        private static final AdUuid singleton = new AdUuid();

        private Holder() {
        }
    }

    public static AdUuid get() {
        return Holder.singleton;
    }

    public String getUuid(Context context) {
        if (!TextUtils.isEmpty(this.mUuid)) {
            return this.mUuid;
        }
        return SharedProxy.getAdSdkSharedProxy(context).getString(UUID_KEY, "");
    }

    public void setUuid(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.m48060i(TAG, "uuid is empty");
            return;
        }
        this.mUuid = str;
        SharedProxy.getAdSdkSharedProxy(context).setString(UUID_KEY, this.mUuid);
    }

    private AdUuid() {
    }
}
