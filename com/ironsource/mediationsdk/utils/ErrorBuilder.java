package com.ironsource.mediationsdk.utils;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.newreward.function.common.MBridgeError;

/* loaded from: classes6.dex */
public class ErrorBuilder {
    /* renamed from: a */
    private static IronSourceError m56465a() {
        return buildGenericError("Mediation - wrong configuration");
    }

    public static IronSourceError adContainerIsNull(String str) {
        return new IronSourceError(617, str + " banner container is null");
    }

    public static IronSourceError buildCappedPerPlacementError(String str) {
        return new IronSourceError(IronSourceError.ERROR_PLACEMENT_CAPPED, str);
    }

    public static IronSourceError buildCappedPerSessionError(String str) {
        return new IronSourceError(IronSourceError.ERROR_CAPPED_PER_SESSION, str + " Show Fail - Networks have reached their cap per session");
    }

    public static IronSourceError buildGenericError(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "An error occurred";
        }
        return new IronSourceError(510, str);
    }

    public static IronSourceError buildInitFailedError(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Init failed - ");
        if (TextUtils.isEmpty(str)) {
            str = MBridgeError.ERROR_MESSAGE_UN_KNOWN;
        }
        sb2.append(str);
        return new IronSourceError(508, sb2.toString());
    }

    public static IronSourceError buildInvalidConfigurationError(String str) {
        return new IronSourceError(501, "" + str + " Init Fail - Configurations from the server are not valid");
    }

    public static IronSourceError buildInvalidCredentialsError(String str, String str2, String str3) {
        String str4;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Init Fail - ");
        sb2.append(str);
        sb2.append(" value ");
        sb2.append(str2);
        sb2.append(" is not valid");
        if (!TextUtils.isEmpty(str3)) {
            str4 = " - " + str3;
        } else {
            str4 = "";
        }
        sb2.append(str4);
        return new IronSourceError(506, sb2.toString());
    }

    public static IronSourceError buildInvalidKeyValueError(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            return m56465a();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Mediation - ");
        sb2.append(str);
        sb2.append(" value is not valid ");
        if (!TextUtils.isEmpty(str2)) {
            str3 = " - " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        return new IronSourceError(506, sb2.toString());
    }

    public static IronSourceError buildKeyNotSetError(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return new IronSourceError(505, str3 + " Mediation - " + str + " is not set for " + str2);
        }
        return m56465a();
    }

    public static IronSourceError buildLoadFailedError(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Load failed due to an unknown error";
        } else {
            str2 = "Load failed - " + str;
        }
        return new IronSourceError(510, str2);
    }

    public static IronSourceError buildNoAdsToShowError(String str) {
        return new IronSourceError(509, str + " Show Fail - No ads to show");
    }

    public static IronSourceError buildNoConfigurationAvailableError(String str) {
        return new IronSourceError(501, "" + str + " Init Fail - Unable to retrieve configurations from the server");
    }

    public static IronSourceError buildNoInternetConnectionInitFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, "" + str + " Init Fail - No Internet connection");
    }

    public static IronSourceError buildNoInternetConnectionLoadFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, "" + str + " Load Fail - No Internet connection");
    }

    public static IronSourceError buildNoInternetConnectionShowFailError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NO_INTERNET_CONNECTION, "" + str + " Show Fail - No Internet connection");
    }

    public static IronSourceError buildNonExistentInstanceError(String str) {
        return new IronSourceError(IronSourceError.ERROR_NON_EXISTENT_INSTANCE, str + " The requested instance does not exist");
    }

    public static IronSourceError buildShowFailedError(String str, String str2) {
        return new IronSourceError(509, str + " Show Fail - " + str2);
    }

    public static IronSourceError buildUsingCachedConfigurationError(String str, String str2) {
        return new IronSourceError(502, "Mediation - Unable to retrieve configurations from IronSource server, using cached configurations with appKey:" + str + " and userId:" + str2);
    }

    public static IronSourceError unsupportedBannerSize(String str) {
        return new IronSourceError(616, str + " unsupported banner size");
    }

    public static IronSourceError buildInitFailedError(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = str2 + " init failed due to an unknown error";
        } else {
            str3 = str2 + " - " + str;
        }
        return new IronSourceError(508, str3);
    }

    public static IronSourceError buildLoadFailedError(String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder();
        String str4 = "";
        sb2.append("");
        sb2.append(str);
        sb2.append(" Load Fail");
        if (!TextUtils.isEmpty(str2)) {
            str4 = " " + str2;
        }
        sb2.append(str4);
        sb2.append(" - ");
        String sb3 = sb2.toString();
        if (TextUtils.isEmpty(str3)) {
            str3 = MBridgeError.ERROR_MESSAGE_UN_KNOWN;
        }
        return new IronSourceError(510, sb3 + str3);
    }
}
