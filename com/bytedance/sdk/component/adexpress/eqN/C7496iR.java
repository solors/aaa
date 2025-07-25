package com.bytedance.sdk.component.adexpress.eqN;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.C7487eqN;

/* renamed from: com.bytedance.sdk.component.adexpress.eqN.iR */
/* loaded from: classes3.dex */
public class C7496iR {
    /* renamed from: IL */
    public static boolean m88663IL(String str) {
        if (C7487eqN.m88685IL() && m88662bg(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    public static boolean m88662bg(String str) {
        if (!TextUtils.equals(str, "fullscreen_interstitial_ad") && !TextUtils.equals(str, "rewarded_video")) {
            return false;
        }
        return true;
    }
}
