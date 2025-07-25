package net.pubnative.lite.sdk.utils;

import com.ironsource.C20517nb;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import net.pubnative.lite.sdk.HyBid;

/* loaded from: classes10.dex */
public class EncodingUtils {
    private static final String TAG = "EncodingUtils";

    public static String urlEncode(String str) {
        try {
            return URLEncoder.encode(str, C20517nb.f52167N);
        } catch (UnsupportedEncodingException e) {
            HyBid.reportException((Exception) e);
            Logger.m14226e(TAG, "Error url encoding string: ", e);
            return "";
        }
    }
}
