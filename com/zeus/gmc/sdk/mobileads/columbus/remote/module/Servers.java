package com.zeus.gmc.sdk.mobileads.columbus.remote.module;

import com.amazon.device.ads.DtbConstants;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.maticoo.sdk.utils.log.p406bi.Constants;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.ConstantsUtil;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.util.RemoteSdkConfig;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public class Servers {
    private static final String SDK_CONFIG_SERVER = "https://api.ad.intl.xiaomi.com/config/getcolconfig";
    private static final String SDK_CONFIG_TEST_SERVER;
    private static final String SDK_HTTPS_HOST = "api.ad.intl.xiaomi.com";
    private static final String SDK_SERVICE = "https://api.ad.intl.xiaomi.com/";
    private static final String SDK_SERVICE_BID_SERVER = "https://api.ad.intl.xiaomi.com/colbidding/getadm";
    private static final String SDK_SERVICE_BID_TEST_SERVER;
    private static final String SDK_SERVICE_SERVER = "https://api.ad.intl.xiaomi.com/post/csv3";
    private static final String SDK_SERVICE_TEST;
    private static final String SDK_SERVICE_TEST_SERVER;
    private static final String TEST_SDK_HOST;

    static {
        String safeString = ConstantsUtil.getSafeString(Constants.KEY_TEST, ".ad.intl", ".xi", "a", "om", "i.com");
        TEST_SDK_HOST = safeString;
        String str = DtbConstants.HTTPS + safeString + RemoteSettings.FORWARD_SLASH_STRING;
        SDK_SERVICE_TEST = str;
        SDK_SERVICE_TEST_SERVER = str + "post/csv3";
        SDK_CONFIG_TEST_SERVER = str + "config/getcolconfig";
        SDK_SERVICE_BID_TEST_SERVER = str + "colbidding/getadm";
    }

    private Servers() {
    }

    public static String getBidAdServer() {
        if (RemoteSdkConfig.USE_STAGING) {
            return SDK_SERVICE_BID_TEST_SERVER;
        }
        return SDK_SERVICE_BID_SERVER;
    }

    public static List<String> getDomainList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(TEST_SDK_HOST);
        arrayList.add(SDK_HTTPS_HOST);
        return arrayList;
    }

    public static String getGlobalBannerAdServer() {
        if (RemoteSdkConfig.USE_STAGING) {
            return SDK_SERVICE_TEST_SERVER;
        }
        return SDK_SERVICE_SERVER;
    }

    public static String getGlobalInterstitialAdServer() {
        if (RemoteSdkConfig.USE_STAGING) {
            return SDK_SERVICE_TEST_SERVER;
        }
        return SDK_SERVICE_SERVER;
    }

    public static String getGlobalNativeAdServer() {
        if (RemoteSdkConfig.USE_STAGING) {
            return SDK_SERVICE_TEST_SERVER;
        }
        return SDK_SERVICE_SERVER;
    }

    public static String getSdkConfigServer() {
        if (RemoteSdkConfig.USE_STAGING) {
            return SDK_CONFIG_TEST_SERVER;
        }
        return SDK_CONFIG_SERVER;
    }
}
