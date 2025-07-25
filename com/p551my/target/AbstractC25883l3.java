package com.p551my.target;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

/* renamed from: com.my.target.l3 */
/* loaded from: classes7.dex */
public abstract class AbstractC25883l3 {
    /* renamed from: a */
    public static boolean m43561a(String str, Context context) {
        return m43559a(str, null, null, null, context);
    }

    /* renamed from: a */
    public static boolean m43559a(String str, String str2, Intent intent, Bundle bundle, Context context) {
        if (intent == null) {
            try {
                intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            } catch (Throwable th) {
                AbstractC25846ja.m43680a("IntentUtils: Unable to open link - " + th.getMessage());
                return false;
            }
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (str2 != null) {
            intent.setPackage(str2);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        context.startActivity(intent);
        return true;
    }

    /* renamed from: a */
    public static boolean m43562a(Intent intent, Context context) {
        return m43559a(null, null, intent, null, context);
    }

    /* renamed from: a */
    public static boolean m43560a(String str, String str2, Context context) {
        return m43559a(str, str2, null, null, context);
    }

    /* renamed from: a */
    public static boolean m43558a(String str, String str2, Bundle bundle, Context context) {
        return m43559a(str, str2, null, bundle, context);
    }
}
