package com.applovin.impl;

import android.content.Context;
import android.os.Bundle;

/* renamed from: com.applovin.impl.t0 */
/* loaded from: classes2.dex */
public class C5535t0 {

    /* renamed from: e */
    private static C5535t0 f10780e;

    /* renamed from: f */
    private static final Object f10781f = new Object();

    /* renamed from: a */
    private final Bundle f10782a;

    /* renamed from: b */
    private final int f10783b;

    /* renamed from: c */
    private final boolean f10784c;

    /* renamed from: d */
    private final String f10785d;

    /* JADX WARN: Removed duplicated region for block: B:49:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private C5535t0(android.content.Context r10) {
        /*
            r9 = this;
            java.lang.String r0 = "AndroidManifest"
            r9.<init>()
            r1 = 0
            android.content.pm.PackageManager r2 = r10.getPackageManager()     // Catch: java.lang.Throwable -> L1f android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r3 = r10.getPackageName()     // Catch: java.lang.Throwable -> L1f android.content.pm.PackageManager.NameNotFoundException -> L23
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r2.getApplicationInfo(r3, r4)     // Catch: java.lang.Throwable -> L1f android.content.pm.PackageManager.NameNotFoundException -> L23
            android.os.Bundle r3 = r2.metaData     // Catch: java.lang.Throwable -> L1f android.content.pm.PackageManager.NameNotFoundException -> L23
            java.lang.String r1 = r2.processName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1d java.lang.Throwable -> La7
            r9.f10782a = r3
            r9.f10785d = r1
            goto L2e
        L1d:
            r2 = move-exception
            goto L25
        L1f:
            r10 = move-exception
            r3 = r1
            goto La8
        L23:
            r2 = move-exception
            r3 = r1
        L25:
            java.lang.String r4 = "Failed to get meta data."
            com.applovin.impl.sdk.C5434n.m94904c(r0, r4, r2)     // Catch: java.lang.Throwable -> La7
            r9.f10782a = r3
            r9.f10785d = r1
        L2e:
            r1 = 0
            android.content.res.AssetManager r10 = r10.getAssets()     // Catch: java.lang.Throwable -> L95
            java.lang.String r2 = "AndroidManifest.xml"
            android.content.res.XmlResourceParser r10 = r10.openXmlResourceParser(r2)     // Catch: java.lang.Throwable -> L95
            int r2 = r10.getEventType()     // Catch: java.lang.Throwable -> L95
            r3 = r1
            r4 = r3
        L3f:
            r5 = 2
            r6 = 1
            if (r5 != r2) goto L87
            java.lang.String r2 = r10.getName()     // Catch: java.lang.Throwable -> L92
            java.lang.String r5 = "application"
            boolean r2 = r2.equals(r5)     // Catch: java.lang.Throwable -> L92
            if (r2 == 0) goto L87
            r2 = r1
        L50:
            int r5 = r10.getAttributeCount()     // Catch: java.lang.Throwable -> L92
            if (r2 >= r5) goto L87
            java.lang.String r5 = r10.getAttributeName(r2)     // Catch: java.lang.Throwable -> L92
            java.lang.String r7 = r10.getAttributeValue(r2)     // Catch: java.lang.Throwable -> L92
            java.lang.String r8 = "networkSecurityConfig"
            boolean r8 = r5.equals(r8)     // Catch: java.lang.Throwable -> L92
            if (r8 == 0) goto L73
            java.lang.String r5 = r7.substring(r6)     // Catch: java.lang.Throwable -> L92
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L92
            int r3 = r5.intValue()     // Catch: java.lang.Throwable -> L92
            goto L84
        L73:
            java.lang.String r8 = "usesCleartextTraffic"
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L92
            if (r5 == 0) goto L84
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L92
            boolean r4 = r5.booleanValue()     // Catch: java.lang.Throwable -> L92
        L84:
            int r2 = r2 + 1
            goto L50
        L87:
            int r2 = r10.next()     // Catch: java.lang.Throwable -> L92
            if (r2 != r6) goto L3f
            r9.f10783b = r3
            r9.f10784c = r4
            goto La0
        L92:
            r10 = move-exception
            r1 = r4
            goto L97
        L95:
            r10 = move-exception
            r3 = r1
        L97:
            java.lang.String r2 = "Failed to parse AndroidManifest.xml."
            com.applovin.impl.sdk.C5434n.m94904c(r0, r2, r10)     // Catch: java.lang.Throwable -> La1
            r9.f10783b = r3
            r9.f10784c = r1
        La0:
            return
        La1:
            r10 = move-exception
            r9.f10783b = r3
            r9.f10784c = r1
            throw r10
        La7:
            r10 = move-exception
        La8:
            r9.f10782a = r3
            r9.f10785d = r1
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C5535t0.<init>(android.content.Context):void");
    }

    /* renamed from: a */
    public boolean m94568a(String str, boolean z) {
        Bundle bundle = this.f10782a;
        return bundle != null ? bundle.getBoolean(str, z) : z;
    }

    /* renamed from: a */
    public String m94569a(String str, String str2) {
        Bundle bundle = this.f10782a;
        return bundle != null ? bundle.getString(str, str2) : str2;
    }

    /* renamed from: a */
    public String m94572a() {
        return this.f10785d;
    }

    /* renamed from: a */
    public boolean m94570a(String str) {
        Bundle bundle = this.f10782a;
        if (bundle != null) {
            return bundle.containsKey(str);
        }
        return false;
    }

    /* renamed from: a */
    public static C5535t0 m94571a(Context context) {
        C5535t0 c5535t0;
        synchronized (f10781f) {
            if (f10780e == null) {
                f10780e = new C5535t0(context);
            }
            c5535t0 = f10780e;
        }
        return c5535t0;
    }
}
