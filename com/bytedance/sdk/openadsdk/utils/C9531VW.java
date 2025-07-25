package com.bytedance.sdk.openadsdk.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.C8840WR;
import com.ironsource.C21018tj;

/* renamed from: com.bytedance.sdk.openadsdk.utils.VW */
/* loaded from: classes3.dex */
public class C9531VW {

    /* renamed from: bg */
    private static String f21262bg;

    /* renamed from: IL */
    public static String m82563IL() {
        if (TextUtils.isEmpty(f21262bg)) {
            f21262bg = new String(Base64.decode("ZGV2aWNlX2lk", 0));
        }
        return f21262bg;
    }

    /* renamed from: bX */
    public static boolean m82562bX() {
        return false;
    }

    /* renamed from: bg */
    public static boolean m82561bg() {
        return C7741PX.eqN() && C8840WR.m84734IL().xxp() && C8840WR.m84734IL().VzQ();
    }

    /* renamed from: bg */
    public static String m82560bg(String str) {
        try {
            if (m82561bg()) {
                String tuV = C8840WR.m84734IL().tuV();
                if (TextUtils.isEmpty(tuV)) {
                    return str;
                }
                Log.d("TestHelperUtils", "AnyDoorId=".concat(String.valueOf(tuV)));
                return Uri.parse(str).buildUpon().appendQueryParameter(m82563IL(), tuV).appendQueryParameter(C21018tj.f53565b, "5001121").toString();
            }
            return str;
        } catch (Throwable unused) {
            return str;
        }
    }
}
