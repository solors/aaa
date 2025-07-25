package com.p551my.target;

import android.app.UiModeManager;
import android.content.Context;
import com.p551my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.m0 */
/* loaded from: classes7.dex */
public class C25903m0 extends AbstractC26021q1 {
    /* renamed from: a */
    public Map m43492a(MyTargetConfig myTargetConfig, Context context) {
        HashMap hashMap = new HashMap();
        if (m43493a(context)) {
            hashMap.put("isc", "1");
        }
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m43493a(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getCurrentModeType() == 3;
    }
}
