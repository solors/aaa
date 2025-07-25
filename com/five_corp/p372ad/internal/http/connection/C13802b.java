package com.five_corp.p372ad.internal.http.connection;

import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.five_corp.ad.internal.http.connection.b */
/* loaded from: classes4.dex */
public final class C13802b extends AbstractC13803c {
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c A[Catch: NullPointerException -> 0x007b, SecurityException -> 0x008b, IllegalArgumentException -> 0x009b, IllegalStateException -> 0x00ab, IOException -> 0x00bb, ProtocolException -> 0x00cb, MalformedURLException -> 0x00db, TryCatch #5 {IllegalArgumentException -> 0x009b, IllegalStateException -> 0x00ab, SecurityException -> 0x008b, MalformedURLException -> 0x00db, ProtocolException -> 0x00cb, IOException -> 0x00bb, NullPointerException -> 0x007b, blocks: (B:3:0x0002, B:5:0x0008, B:7:0x0015, B:9:0x0023, B:11:0x002a, B:13:0x0031, B:16:0x0039, B:19:0x0049, B:34:0x006c, B:35:0x006f, B:31:0x0066), top: B:64:0x0002 }] */
    @Override // com.five_corp.p372ad.internal.http.connection.AbstractC13803c
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.five_corp.p372ad.internal.util.C14118f mo78344a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.five_corp.p372ad.internal.http.connection.C13802b.mo78344a(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int):com.five_corp.ad.internal.util.f");
    }

    /* renamed from: a */
    public static HttpURLConnection m78345a(String str) {
        return (HttpURLConnection) new URL(str).openConnection();
    }
}
