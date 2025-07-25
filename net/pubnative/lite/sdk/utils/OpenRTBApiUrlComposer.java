package net.pubnative.lite.sdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import net.pubnative.lite.sdk.models.request.OpenRTBAdRequest;

/* loaded from: classes10.dex */
public final class OpenRTBApiUrlComposer {
    public static String buildUrl(String str, OpenRTBAdRequest openRTBAdRequest) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendPath("bid");
        buildUpon.appendPath("v1");
        buildUpon.appendPath("request");
        if (!TextUtils.isEmpty(openRTBAdRequest.appToken)) {
            buildUpon.appendQueryParameter("apptoken", openRTBAdRequest.appToken);
        }
        if (!TextUtils.isEmpty(openRTBAdRequest.zoneId)) {
            buildUpon.appendQueryParameter("zoneid", openRTBAdRequest.zoneId);
        }
        return buildUpon.build().toString();
    }
}
