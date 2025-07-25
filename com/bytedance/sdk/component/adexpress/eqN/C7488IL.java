package com.bytedance.sdk.component.adexpress.eqN;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.adexpress.eqN.IL */
/* loaded from: classes3.dex */
public class C7488IL {
    /* renamed from: bg */
    public static boolean m88682bg(Context context) {
        boolean z;
        if (context == null) {
            return false;
        }
        if (TextUtils.getLayoutDirectionFromLocale(context.getResources().getConfiguration().locale) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (context.getApplicationInfo().flags & 4194304) != 4194304) {
            return false;
        }
        return true;
    }
}
