package com.pubmatic.sdk.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class POBError {
    public static final int AD_ALREADY_SHOWN = 2001;
    public static final int AD_EXPIRED = 1011;
    public static final int AD_NOT_READY = 2002;
    public static final int AD_REQUEST_NOT_ALLOWED = 1012;
    public static final int CLIENT_SIDE_AUCTION_LOST = 3001;
    public static final int INTERNAL_ERROR = 1006;
    public static final int INVALID_CONFIG = 1013;
    public static final int INVALID_REQUEST = 1001;
    public static final int INVALID_RESPONSE = 1007;
    public static final int INVALID_REWARD_SELECTED = 5001;
    public static final int NETWORK_ERROR = 1003;
    public static final int NO_ADS_AVAILABLE = 1002;
    public static final int OPENWRAP_SIGNALING_ERROR = 1010;
    public static final int RENDER_ERROR = 1009;
    public static final int REQUEST_CANCELLED = 1008;
    public static final int REWARD_NOT_SELECTED = 5002;
    public static final int SERVER_ERROR = 1004;
    public static final int TIMEOUT_ERROR = 1005;

    /* renamed from: a */
    private int f70010a;
    @NonNull

    /* renamed from: b */
    private String f70011b;
    @Nullable

    /* renamed from: c */
    private Map<String, Object> f70012c;

    public POBError(int i, @NonNull String str) {
        this.f70010a = i;
        if (i != 2001) {
            if (i != 2002) {
                if (i != 3001) {
                    if (i != 5001) {
                        if (i != 5002) {
                            switch (i) {
                                case 1001:
                                    this.f70011b = "INVALID_REQUEST: " + str;
                                    return;
                                case 1002:
                                    this.f70011b = "NO_ADS_AVAILABLE: " + str;
                                    return;
                                case 1003:
                                    this.f70011b = "NETWORK_ERROR: " + str;
                                    return;
                                case 1004:
                                    this.f70011b = "SERVER_ERROR: " + str;
                                    return;
                                case 1005:
                                    this.f70011b = "TIMEOUT_ERROR: " + str;
                                    return;
                                case 1006:
                                    this.f70011b = "INTERNAL_ERROR: " + str;
                                    return;
                                case 1007:
                                    this.f70011b = "INVALID_RESPONSE: " + str;
                                    return;
                                case 1008:
                                    this.f70011b = "REQUEST_CANCELLED: " + str;
                                    return;
                                case 1009:
                                    this.f70011b = "RENDER_ERROR: " + str;
                                    return;
                                case 1010:
                                    this.f70011b = "OPENWRAP_SIGNALING_ERROR: " + str;
                                    return;
                                case 1011:
                                    this.f70011b = "AD_EXPIRED: " + str;
                                    return;
                                case 1012:
                                    this.f70011b = "AD_REQUEST_NOT_ALLOWED: " + str;
                                    return;
                                default:
                                    this.f70011b = str;
                                    return;
                            }
                        }
                        this.f70011b = "REWARD_NOT_SELECTED: " + str;
                        return;
                    }
                    this.f70011b = "INVALID_REWARD_SELECTED: " + str;
                    return;
                }
                this.f70011b = "CLIENT_SIDE_AUCTION_LOST: " + str;
                return;
            }
            this.f70011b = "NOT_READY: " + str;
            return;
        }
        this.f70011b = "ALREADY_SHOWN: " + str;
    }

    public void addExtraInfo(String str, Object obj) {
        if (this.f70012c == null) {
            this.f70012c = new HashMap();
        }
        this.f70012c.put(str, obj);
    }

    public int getErrorCode() {
        return this.f70010a;
    }

    @NonNull
    public String getErrorMessage() {
        return this.f70011b;
    }

    @Nullable
    public Map<String, Object> getExtraInfo() {
        return this.f70012c;
    }

    @Deprecated
    public void setErrorCode(int i) {
        this.f70010a = i;
    }

    @Deprecated
    public void setErrorMessage(@NonNull String str) {
        this.f70011b = str;
    }

    public void setExtraInfo(@Nullable Map<String, Object> map) {
        this.f70012c = map;
    }

    @NonNull
    public String toString() {
        return "POBError{errorCode=" + this.f70010a + ", errorMessage='" + this.f70011b + "'}";
    }

    @Nullable
    public Object getExtraInfo(@Nullable String str) {
        Map<String, Object> map = this.f70012c;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
