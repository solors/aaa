package net.pubnative.lite.sdk.vpaid.helpers;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.network.PNHttpClient;
import net.pubnative.lite.sdk.utils.Logger;
import net.pubnative.lite.sdk.vpaid.enums.VastError;

/* loaded from: classes10.dex */
public class ErrorLog {
    private static final String ERROR_CODE = "[ERRORCODE]";
    private static final String LOG_TAG = "ErrorLog";
    private static List<String> sErrorLogUrls;

    private ErrorLog() {
    }

    public static void initErrorLog(String str) {
        List<String> list = sErrorLogUrls;
        if (list == null) {
            sErrorLogUrls = new ArrayList();
        } else {
            list.clear();
        }
        sErrorLogUrls.add(str);
    }

    public static synchronized void postError(Context context, VastError vastError) {
        synchronized (ErrorLog.class) {
            List<String> list = sErrorLogUrls;
            if (list != null && !list.isEmpty()) {
                for (String str : sErrorLogUrls) {
                    if (!TextUtils.isEmpty(str)) {
                        if (str.contains(ERROR_CODE)) {
                            str = str.replace(ERROR_CODE, vastError.getValue());
                        }
                        Logger.m14229d(LOG_TAG, str);
                        PNHttpClient.makeRequest(context, str, null, null, new PNHttpClient.Listener() { // from class: net.pubnative.lite.sdk.vpaid.helpers.ErrorLog.1
                            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                            public void onFailure(Throwable th) {
                            }

                            @Override // net.pubnative.lite.sdk.network.PNHttpClient.Listener
                            public void onSuccess(String str2, Map<String, List<String>> map) {
                            }
                        });
                    }
                }
            }
        }
    }

    public static void initErrorLog(List<String> list) {
        List<String> list2 = sErrorLogUrls;
        if (list2 == null) {
            sErrorLogUrls = new ArrayList();
        } else {
            list2.clear();
        }
        sErrorLogUrls.addAll(list);
    }
}
