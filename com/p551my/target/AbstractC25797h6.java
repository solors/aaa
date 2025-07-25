package com.p551my.target;

import android.app.Application;
import android.content.Context;
import com.p551my.tracker.MyTracker;

/* renamed from: com.my.target.h6 */
/* loaded from: classes7.dex */
public abstract class AbstractC25797h6 {

    /* renamed from: a */
    public static boolean f66928a;

    /* renamed from: a */
    public static void m43792a(Context context) {
        if (f66928a) {
            return;
        }
        try {
            String str = (String) context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.get("com.my.target.myTrackerSdkKey");
            if (str != null) {
                MyTracker.initTracker(str, (Application) context.getApplicationContext());
            } else {
                AbstractC25846ja.m43680a("MyTrackerUtils: myTracker SDK key is not provided");
            }
        } catch (Throwable th) {
            AbstractC25846ja.m43680a("MyTrackerUtils: Unable to initialize myTracker - " + th.getMessage());
        }
        f66928a = true;
    }
}
