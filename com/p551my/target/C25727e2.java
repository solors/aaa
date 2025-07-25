package com.p551my.target;

/* renamed from: com.my.target.e2 */
/* loaded from: classes7.dex */
public final class C25727e2 extends AbstractC25653b2 {
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d1  */
    @Override // com.p551my.target.AbstractC25653b2
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.p551my.target.C25674c2 mo42271a(java.lang.String r5, java.lang.String r6, java.util.Map r7, android.content.Context r8) {
        /*
            r4 = this;
            com.my.target.c2 r6 = new com.my.target.c2
            r6.<init>()
            com.my.target.m1 r7 = com.p551my.target.C25904m1.m43479b(r8)
            r8 = 0
            if (r7 == 0) goto Ld5
            java.lang.String r0 = r7.m43476b(r5)
            r6.f66681d = r0
            r1 = 1
            if (r0 == 0) goto L18
            r6.f66679b = r1
            return r6
        L18:
            r0 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            r2.<init>()     // Catch: java.lang.Throwable -> Laf
            java.lang.String r3 = "HttpVideoRequest: Send video request - "
            r2.append(r3)     // Catch: java.lang.Throwable -> Laf
            r2.append(r5)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Laf
            com.p551my.target.AbstractC25846ja.m43680a(r2)     // Catch: java.lang.Throwable -> Laf
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> Laf
            r2.<init>(r5)     // Catch: java.lang.Throwable -> Laf
            java.net.URLConnection r2 = r2.openConnection()     // Catch: java.lang.Throwable -> Laf
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch: java.lang.Throwable -> Laf
            r0 = 10000(0x2710, float:1.4013E-41)
            r2.setReadTimeout(r0)     // Catch: java.lang.Throwable -> Lac
            r2.setConnectTimeout(r0)     // Catch: java.lang.Throwable -> Lac
            r2.setInstanceFollowRedirects(r1)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r0 = "connection"
            java.lang.String r1 = "close"
            r2.setRequestProperty(r0, r1)     // Catch: java.lang.Throwable -> Lac
            com.p551my.target.AbstractC25881l1.m43564a(r2)     // Catch: java.lang.Throwable -> Lac
            r2.connect()     // Catch: java.lang.Throwable -> Lac
            int r0 = r2.getResponseCode()     // Catch: java.lang.Throwable -> Lac
            r6.f66680c = r0     // Catch: java.lang.Throwable -> Lac
            r1 = 200(0xc8, float:2.8E-43)
            java.lang.String r3 = "HttpVideoRequest: "
            if (r0 != r1) goto L85
            java.io.InputStream r0 = r2.getInputStream()     // Catch: java.lang.Throwable -> Lac
            java.io.File r5 = r7.m43477b(r0, r5)     // Catch: java.lang.Throwable -> Lac
            if (r5 == 0) goto L6d
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: java.lang.Throwable -> Lac
            r6.f66681d = r5     // Catch: java.lang.Throwable -> Lac
            goto Lcf
        L6d:
            r6.f66678a = r8     // Catch: java.lang.Throwable -> Lac
            java.lang.String r5 = "Video request error - can't save video to disk cache"
            r6.f66682e = r5     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r5.<init>()     // Catch: java.lang.Throwable -> Lac
            r5.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r7 = r6.f66682e     // Catch: java.lang.Throwable -> Lac
            r5.append(r7)     // Catch: java.lang.Throwable -> Lac
        L80:
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lac
            goto La8
        L85:
            r6.f66678a = r8     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r5.<init>()     // Catch: java.lang.Throwable -> Lac
            java.lang.String r7 = "Video request error - response code "
            r5.append(r7)     // Catch: java.lang.Throwable -> Lac
            r5.append(r0)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> Lac
            r6.f66682e = r5     // Catch: java.lang.Throwable -> Lac
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lac
            r5.<init>()     // Catch: java.lang.Throwable -> Lac
            r5.append(r3)     // Catch: java.lang.Throwable -> Lac
            java.lang.String r7 = r6.f66682e     // Catch: java.lang.Throwable -> Lac
            r5.append(r7)     // Catch: java.lang.Throwable -> Lac
            goto L80
        La8:
            com.p551my.target.AbstractC25846ja.m43680a(r5)     // Catch: java.lang.Throwable -> Lac
            goto Lcf
        Lac:
            r5 = move-exception
            r0 = r2
            goto Lb0
        Laf:
            r5 = move-exception
        Lb0:
            r6.f66678a = r8
            java.lang.String r5 = r5.getMessage()
            r6.f66682e = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "HttpVideoRequest: Video request error - "
            r5.append(r7)
            java.lang.String r7 = r6.f66682e
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            com.p551my.target.AbstractC25846ja.m43680a(r5)
            r2 = r0
        Lcf:
            if (r2 == 0) goto Ld4
            r2.disconnect()
        Ld4:
            return r6
        Ld5:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "HttpVideoRequest: Unable to open disk cache and load/save video "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            com.p551my.target.AbstractC25846ja.m43680a(r5)
            r6.f66678a = r8
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.C25727e2.mo42271a(java.lang.String, java.lang.String, java.util.Map, android.content.Context):com.my.target.c2");
    }

    /* renamed from: a */
    public static C25727e2 m43981a() {
        return new C25727e2();
    }
}
