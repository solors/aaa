package com.inmobi.media;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import androidx.browser.customtabs.CustomTabsService;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.O2 */
/* loaded from: classes6.dex */
public abstract class AbstractC19042O2 {

    /* renamed from: a */
    public static String f47577a;

    /* renamed from: a */
    public static final String m60833a(Context context) {
        boolean m17544g0;
        if (context != null && f47577a == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.google.com"));
                ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
                String str = resolveActivity != null ? resolveActivity.activityInfo.packageName : null;
                List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
                Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
                ArrayList arrayList = new ArrayList();
                for (ResolveInfo resolveInfo : queryIntentActivities) {
                    Intent intent2 = new Intent();
                    intent2.setAction(CustomTabsService.ACTION_CUSTOM_TABS_CONNECTION);
                    intent2.setPackage(resolveInfo.activityInfo.packageName);
                    if (packageManager.resolveService(intent2, 0) != null) {
                        String packageName = resolveInfo.activityInfo.packageName;
                        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                        arrayList.add(packageName);
                    }
                }
                if (arrayList.isEmpty()) {
                    f47577a = null;
                } else if (arrayList.size() == 1) {
                    f47577a = (String) arrayList.get(0);
                } else {
                    if (!TextUtils.isEmpty(str) && !m60832a(context, intent)) {
                        m17544g0 = _Collections.m17544g0(arrayList, str);
                        if (m17544g0) {
                            f47577a = str;
                        }
                    }
                    if (arrayList.contains("com.android.chrome")) {
                        f47577a = "com.android.chrome";
                    } else if (arrayList.contains("com.chrome.beta")) {
                        f47577a = "com.chrome.beta";
                    } else if (arrayList.contains("com.chrome.dev")) {
                        f47577a = "com.chrome.dev";
                    } else if (arrayList.contains("com.google.android.apps.chrome")) {
                        f47577a = "com.google.android.apps.chrome";
                    }
                }
            } catch (Exception unused) {
            }
            return f47577a;
        }
        return f47577a;
    }

    /* renamed from: a */
    public static boolean m60832a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 64);
            Intrinsics.checkNotNullExpressionValue(queryIntentActivities, "queryIntentActivities(...)");
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                IntentFilter intentFilter = resolveInfo.filter;
                if (intentFilter != null) {
                    Intrinsics.m17074g(intentFilter);
                    if (intentFilter.countDataAuthorities() != 0 && intentFilter.countDataPaths() != 0 && resolveInfo.activityInfo != null) {
                        return true;
                    }
                }
            }
            return false;
        } catch (RuntimeException unused) {
            Log.e("O2", "Runtime exception while getting specialized handlers");
            return false;
        }
    }
}
