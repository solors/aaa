package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.mbridge.msdk.foundation.tools.e */
/* loaded from: classes6.dex */
public class BaseDomainSameTool {
    /* renamed from: a */
    public static boolean m51662a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Resources resources = context.getResources();
            if (resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            SameLogTool.m51823b("DomainSameTool", th.getMessage(), th);
            return false;
        }
    }
}
