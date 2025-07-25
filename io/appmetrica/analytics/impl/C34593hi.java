package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionState;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.hi */
/* loaded from: classes9.dex */
public final class C34593hi {

    /* renamed from: a */
    public final Context f94548a;

    /* renamed from: b */
    public final SafePackageManager f94549b;

    public C34593hi(Context context, SafePackageManager safePackageManager) {
        this.f94548a = context;
        this.f94549b = safePackageManager;
    }

    /* renamed from: a */
    public final ArrayList m21571a() {
        ArrayList arrayList = new ArrayList();
        SafePackageManager safePackageManager = this.f94549b;
        Context context = this.f94548a;
        PackageInfo packageInfo = safePackageManager.getPackageInfo(context, context.getPackageName(), 4096);
        if (packageInfo == null) {
            return arrayList;
        }
        String[] strArr = packageInfo.requestedPermissions;
        int[] iArr = packageInfo.requestedPermissionsFlags;
        if (strArr == null) {
            return arrayList;
        }
        for (int i = 0; i < strArr.length; i++) {
            String str = strArr[i];
            if (iArr != null && iArr.length > i && (iArr[i] & 2) != 0) {
                arrayList.add(new PermissionState(str, true));
            } else {
                arrayList.add(new PermissionState(str, false));
            }
        }
        return arrayList;
    }
}
