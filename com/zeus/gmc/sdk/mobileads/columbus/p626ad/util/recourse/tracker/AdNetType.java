package com.zeus.gmc.sdk.mobileads.columbus.p626ad.util.recourse.tracker;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.util.recourse.tracker.AdNetType */
/* loaded from: classes8.dex */
public enum AdNetType {
    NETWORK_WIFI(1),
    NETWORK_2G(2),
    NETWORK_3G(4),
    NETWORK_4G(8),
    NETWORK_5G(16),
    NETWORK_MOBILE(-2),
    NETWORK_ALL(-1);
    
    private int mValue;

    AdNetType(int i) {
        this.mValue = i;
    }

    public static boolean is2GAllowed(int i) {
        if ((i & NETWORK_2G.value()) != 0) {
            return true;
        }
        return false;
    }

    public static boolean is3GAllowed(int i) {
        if ((i & NETWORK_3G.value()) != 0) {
            return true;
        }
        return false;
    }

    public static boolean is4GAllowed(int i) {
        if ((i & NETWORK_4G.value()) != 0) {
            return true;
        }
        return false;
    }

    public static boolean is5GAllowed(int i) {
        if ((i & NETWORK_5G.value()) != 0) {
            return true;
        }
        return false;
    }

    public static boolean isMobileAllowed(int i) {
        if ((i & NETWORK_MOBILE.value()) != 0) {
            return true;
        }
        return false;
    }

    public static boolean isWifiAllowed(int i) {
        if ((i & NETWORK_WIFI.value()) != 0) {
            return true;
        }
        return false;
    }

    public int value() {
        return this.mValue;
    }

    public static AdNetType valueOf(int i) {
        if (i != -1) {
            if (i != 4) {
                if (i != 8) {
                    if (i != 16) {
                        if (i != 1) {
                            if (i != 2) {
                                return NETWORK_MOBILE;
                            }
                            return NETWORK_2G;
                        }
                        return NETWORK_WIFI;
                    }
                    return NETWORK_5G;
                }
                return NETWORK_4G;
            }
            return NETWORK_3G;
        }
        return NETWORK_ALL;
    }
}
