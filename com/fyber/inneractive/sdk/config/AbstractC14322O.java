package com.fyber.inneractive.sdk.config;

/* renamed from: com.fyber.inneractive.sdk.config.O */
/* loaded from: classes4.dex */
public abstract class AbstractC14322O {
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void m77989a(android.content.Context r7, com.fyber.inneractive.sdk.config.C14415w r8) {
        /*
            r0 = 0
            r1 = 0
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r7 = com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(r7)     // Catch: java.lang.Throwable -> L32
            boolean r2 = r7.isLimitAdTrackingEnabled()     // Catch: java.lang.Throwable -> L32
            java.lang.String r3 = "limit ad tracking: %s"
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L30
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L30
            r6[r1] = r4     // Catch: java.lang.Throwable -> L30
            com.fyber.inneractive.sdk.util.IAlog.m76525e(r3, r6)     // Catch: java.lang.Throwable -> L30
            if (r2 != 0) goto L28
            java.lang.String r0 = r7.getId()     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = "advertising id: %s"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L30
            r3[r1] = r0     // Catch: java.lang.Throwable -> L30
            com.fyber.inneractive.sdk.util.IAlog.m76525e(r7, r3)     // Catch: java.lang.Throwable -> L30
            goto L4b
        L28:
            java.lang.String r7 = "user has opt out of Ads Personalization. not accessing Advertising ID."
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L30
            com.fyber.inneractive.sdk.util.IAlog.m76525e(r7, r3)     // Catch: java.lang.Throwable -> L30
            goto L4b
        L30:
            r7 = move-exception
            goto L34
        L32:
            r7 = move-exception
            r2 = r1
        L34:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r4 = "Handled Exception:"
            com.fyber.inneractive.sdk.util.IAlog.m76525e(r4, r3)
            java.lang.String r7 = com.fyber.inneractive.sdk.util.AbstractC15471s.m76460a(r7)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.m76525e(r7, r3)
            java.lang.Object[] r7 = new java.lang.Object[r1]
            java.lang.String r3 = "Advertising ID is not available. Please add Google Play Services library to improve your ad targeting."
            com.fyber.inneractive.sdk.util.IAlog.m76527c(r3, r7)
        L4b:
            monitor-enter(r8)
            com.fyber.inneractive.sdk.config.v r7 = r8.f27285b     // Catch: java.lang.Throwable -> L56
            r7.f27281a = r0     // Catch: java.lang.Throwable -> L56
            r7.f27282b = r2     // Catch: java.lang.Throwable -> L56
            r7.f27283c = r1     // Catch: java.lang.Throwable -> L56
            monitor-exit(r8)
            return
        L56:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.config.AbstractC14322O.m77989a(android.content.Context, com.fyber.inneractive.sdk.config.w):void");
    }
}
