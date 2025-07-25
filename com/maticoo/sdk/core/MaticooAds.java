package com.maticoo.sdk.core;

import android.app.Activity;
import android.text.TextUtils;
import com.maticoo.sdk.InitConfiguration;
import com.maticoo.sdk.p405ad.utils.Encrypter;
import com.maticoo.sdk.utils.IdentifierGetter;
import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.debug.MaticooDebugUtils;
import com.maticoo.sdk.utils.log.AdLog;
import com.maticoo.sdk.utils.log.AdLogInfo;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.model.Configurations;
import com.maticoo.sdk.utils.prefs.Preference;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class MaticooAds {
    public static final String INFO_AGE = "age";
    public static final String INFO_GENDER = "gender";
    public static final String INFO_INTEREST = "interest";

    public static String getBiddingToken(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Configurations value = Preference.CONFIGURATION.getValue();
        if (value == null) {
            CrashUtil.getSingleton().reportSDKException("configurations is null", "MaticooAds-getBiddingToken");
            return null;
        } else if (TextUtils.isEmpty(value.getBiddingTokenPrefix())) {
            return null;
        } else {
            String format = String.format("%1$s_%2$s_%3$s", value.getBiddingTokenPrefix(), str, String.valueOf(j));
            DeveloperLog.LogD("getBiddingToken, token = " + format);
            String md5 = Encrypter.md5(format);
            DeveloperLog.LogD("getBiddingToken, md5 token = " + md5);
            return md5;
        }
    }

    public static String getSDKName() {
        return "zMaticoo";
    }

    public static String getSDKVersion() {
        return MaticooManager.getInstance().getSDKVersion();
    }

    public static void init(InitConfiguration initConfiguration, InitCallback initCallback) {
        init(null, initConfiguration, initCallback);
    }

    public static boolean isDoNotTrackStatus() {
        return MaticooManager.getInstance().isDoNotTrackStatus();
    }

    public static boolean isGDPRConsent() {
        return MaticooManager.getInstance().isGDPRConsent();
    }

    public static boolean isInit() {
        return MaticooManager.getInstance().isInit();
    }

    public static void onPause(Activity activity) {
        MaticooManager.getInstance().onPause(activity);
    }

    public static void onResume(Activity activity) {
        MaticooManager.getInstance().onResume(activity);
    }

    public static void setCustomData(Map<String, Object> map) {
        try {
            MaticooManager.getInstance().setCustomData(map);
        } catch (Exception unused) {
        }
    }

    public static void setDoNotTrackStatus(boolean z) {
        MaticooManager.getInstance().setDoNotTrackStatus(z);
        DeveloperLog.LogD("setDoNotTrackStatus, status = " + z);
    }

    public static void setGDPRConsent(boolean z) {
        MaticooManager.getInstance().setGDPRConsent(z);
        DeveloperLog.LogD("setGDPRConsent, consent = " + z);
    }

    public static void setStrResMode(boolean z) {
        IdentifierGetter.setIsDynamicRes(z);
    }

    public static void init(Activity activity, InitConfiguration initConfiguration, InitCallback initCallback) {
        if (initConfiguration != null) {
            AdLog.getSingleton().isDebug(initConfiguration.isLogEnable());
            if (initConfiguration.isDynamicRes()) {
                IdentifierGetter.setIsDynamicRes(true);
            }
        }
        DeveloperLog.enableDebug(MaticooDebugUtils.debugMode);
        AdLog.getSingleton().LogD(AdLogInfo.EVENT_INIT_START);
        MaticooManager.getInstance().init(activity, initConfiguration, initCallback);
    }
}
