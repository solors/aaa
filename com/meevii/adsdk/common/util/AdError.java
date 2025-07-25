package com.meevii.adsdk.common.util;

import android.os.Bundle;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Locale;
import net.pubnative.lite.sdk.analytics.Reporting;

/* loaded from: classes6.dex */
public class AdError {
    private static final String VOID_STR = "void";
    private int code;
    private Bundle extraBundle;
    private String msg;
    public static AdError NetwrokError = new AdError(260, "network");
    public static AdError Timeout = new AdError(270, "timeout");
    public static AdError AdsdkInitFail = new AdError(1001, "adsdkInitFail");
    public static AdError AdapterInitFail = new AdError(1002, "adapterInitFail");
    public static AdError NoFill = new AdError(1200, "noFill");
    public static AdError AppInBackground = new AdError(1305, "AppInBackground");
    public static AdError AdLoadFail = new AdError(IronSourceError.ERROR_OLD_INIT_API_APP_KEY_IS_NULL, Reporting.EventType.LOAD_FAIL);
    public static AdError AdShowFail = new AdError(2110, "show_fail");

    AdError(int i, String str) {
        this.code = i;
        this.msg = str;
    }

    public AdError createExtraBundleError(Bundle bundle) {
        return new AdError(this.code, this.msg, bundle);
    }

    public AdError createExtraMsgError(String str) {
        int i = this.code;
        return new AdError(i, this.msg + ":" + str);
    }

    public boolean equals(Object obj) {
        if ((obj instanceof AdError) && this.code == ((AdError) obj).code) {
            return true;
        }
        return false;
    }

    public int getCode() {
        return this.code;
    }

    public String getErrorMessage() {
        return String.format(Locale.US, "%d_%s", Integer.valueOf(this.code), this.msg);
    }

    public Bundle getExtraBundle() {
        return this.extraBundle;
    }

    public String getExtraBundleValue(String str) {
        Bundle bundle = this.extraBundle;
        if (bundle != null && bundle.get(str) != null) {
            return this.extraBundle.getString(str);
        }
        return VOID_STR;
    }

    public String getMsg() {
        return this.msg;
    }

    public String toString() {
        if (this.extraBundle == null) {
            return String.format(Locale.US, "errorCode=%d:msg=%s", Integer.valueOf(this.code), this.msg);
        }
        return String.format(Locale.US, "errorCode=%d:msg=%s:detail=%s", Integer.valueOf(this.code), this.msg, this.extraBundle.toString());
    }

    AdError(int i, String str, Bundle bundle) {
        this.code = i;
        this.msg = str;
        this.extraBundle = bundle;
    }
}
