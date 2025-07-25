package com.maticoo.sdk.utils.request;

import com.maticoo.sdk.utils.model.Configurations;
import com.maticoo.sdk.utils.prefs.Preference;
import com.maticoo.sdk.utils.request.network.Headers;

/* loaded from: classes6.dex */
public final class HeaderUtils {
    public static Headers getBaseHeaders() {
        Headers headers = new Headers();
        headers.set("User-Agent", Preference.USER_AGENT.getValue());
        headers.set("Content-Type", "application/json");
        Configurations value = Preference.CONFIGURATION.getValue();
        if (value != null && value.getGzip() == 1) {
            headers.set("Accept-Encoding", "gzip");
        }
        return headers;
    }

    public static Headers getBiHeaders() {
        Headers headers = new Headers();
        headers.set("TA-Integration-Type", "Android");
        headers.set("TA-Integration-Version", "2.7.6");
        headers.set("TA-Integration-Count", "1");
        headers.set("TA-Integration-Extra", "Android");
        return headers;
    }
}
