package com.fyber.inneractive.sdk.click;

import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.click.k */
/* loaded from: classes4.dex */
public final class C14300k implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ActivityInfo activityInfo;
        String str;
        ResolveInfo resolveInfo = (ResolveInfo) obj2;
        ActivityInfo activityInfo2 = ((ResolveInfo) obj).activityInfo;
        if (activityInfo2 != null && (activityInfo = resolveInfo.activityInfo) != null && (str = activityInfo2.packageName) != null) {
            return str.compareTo(activityInfo.packageName);
        }
        return 1;
    }
}
