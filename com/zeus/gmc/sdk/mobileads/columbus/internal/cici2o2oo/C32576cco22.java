package com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.cco22 */
/* loaded from: classes8.dex */
public class C32576cco22 {
    private C32576cco22() {
    }

    public static boolean coo2iico(int i, int i2) {
        return (i & i2) != 0;
    }

    public static Map<String, String> coo2iico(@NonNull Uri uri) {
        C32584coiic.coo2iico(uri);
        HashMap hashMap = new HashMap();
        for (String str : uri.getQueryParameterNames()) {
            hashMap.put(str, TextUtils.join(",", uri.getQueryParameters(str)));
        }
        return hashMap;
    }
}
