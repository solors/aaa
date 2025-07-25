package com.smaato.sdk.interstitial;

import androidx.annotation.Nullable;
import com.smaato.sdk.core.p568ad.KeyValuePairs;
import java.util.Map;

/* loaded from: classes7.dex */
public class InterstitialBase {
    @Nullable
    protected static KeyValuePairs keyValuePairs;
    @Nullable
    protected static String mediationAdapterVersion;
    @Nullable
    protected static String mediationNetworkName;
    @Nullable
    protected static String mediationNetworkSDKVersion;
    @Nullable
    protected static Map<String, Object> objectExtras;

    @Nullable
    public static KeyValuePairs getKeyValuePairs() {
        return keyValuePairs;
    }

    public static void setKeyValuePairs(@Nullable KeyValuePairs keyValuePairs2) {
        keyValuePairs = keyValuePairs2;
    }

    public static void setMediationAdapterVersion(@Nullable String str) {
        mediationAdapterVersion = str;
    }

    public static void setMediationNetworkName(@Nullable String str) {
        mediationNetworkName = str;
    }

    public static void setMediationNetworkSDKVersion(@Nullable String str) {
        mediationNetworkSDKVersion = str;
    }

    public static void setObjectExtras(@Nullable Map<String, Object> map) {
        objectExtras = map;
    }
}
