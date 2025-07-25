package com.zeus.gmc.sdk.mobileads.columbus.remote.module.util;

import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.remote.module.KeyValuePair;
import java.net.URLEncoder;
import java.util.List;

/* loaded from: classes8.dex */
public class URLEncodeUtils {
    private static final String TAG = "URLEncodeUtils";

    public static String fromParamListToString(List<KeyValuePair> list) {
        StringBuffer stringBuffer = new StringBuffer();
        if (list != null) {
            for (KeyValuePair keyValuePair : list) {
                try {
                    if (keyValuePair.getValue() != null) {
                        stringBuffer.append(URLEncoder.encode(keyValuePair.getName(), "UTF-8"));
                        stringBuffer.append("=");
                        stringBuffer.append(URLEncoder.encode(keyValuePair.getValue(), "UTF-8"));
                        stringBuffer.append(C21114v8.C21123i.f54135c);
                    }
                } catch (Exception e) {
                    MLog.m25898i(TAG, "Failed to convert from param list to string: " + e.toString());
                    MLog.m25898i(TAG, "pair: " + keyValuePair.toString());
                    return null;
                }
            }
        }
        if (stringBuffer.length() > 0) {
            stringBuffer = stringBuffer.deleteCharAt(stringBuffer.length() - 1);
        }
        return stringBuffer.toString();
    }
}
