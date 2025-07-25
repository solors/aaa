package com.google.android.play.core.review.model;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public final class zza {

    /* renamed from: a */
    private static final Map f39257a;

    /* renamed from: b */
    private static final Map f39258b;

    static {
        HashMap hashMap = new HashMap();
        f39257a = hashMap;
        HashMap hashMap2 = new HashMap();
        f39258b = hashMap2;
        hashMap.put(-1, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-2, "INVALID_REQUEST");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }

    public static String zza(int i) {
        Map map = f39257a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return "";
        }
        return ((String) map.get(valueOf)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) f39258b.get(valueOf)) + ")";
    }
}
