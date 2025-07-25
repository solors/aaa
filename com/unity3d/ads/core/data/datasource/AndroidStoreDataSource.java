package com.unity3d.ads.core.data.datasource;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidStoreDataSource.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidStoreDataSource implements StoreDataSource {
    @NotNull
    private final Context context;

    public AndroidStoreDataSource(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x003d A[SYNTHETIC] */
    @Override // com.unity3d.ads.core.data.datasource.StoreDataSource
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<java.lang.String> fetchStores(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r8) {
        /*
            r7 = this;
            java.lang.String r0 = "additionalStores"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.unity3d.ads.core.data.datasource.AndroidKnownStore[] r0 = com.unity3d.ads.core.data.datasource.AndroidKnownStore.values()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.length
            r1.<init>(r2)
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r2) goto L20
            r5 = r0[r4]
            java.lang.String r5 = r5.getPackageName()
            r1.add(r5)
            int r4 = r4 + 1
            goto L12
        L20:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = kotlin.collections.C37561t.m17251J0(r1, r8)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r8 = kotlin.collections.C37561t.m17210h0(r8)
            android.content.Context r0 = r7.context
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L3d:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r8.next()
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            r6 = 33
            if (r5 < r6) goto L5b
            r5 = 0
            android.content.pm.PackageManager$PackageInfoFlags r5 = android.content.pm.PackageManager.PackageInfoFlags.of(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
            goto L5f
        L5b:
            android.content.pm.PackageInfo r4 = r0.getPackageInfo(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L63
        L5f:
            if (r4 == 0) goto L63
            r4 = 1
            goto L64
        L63:
            r4 = r3
        L64:
            if (r4 == 0) goto L3d
            r1.add(r2)
            goto L3d
        L6a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStoreDataSource.fetchStores(java.util.List):java.util.List");
    }
}
