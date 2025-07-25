package com.fyber.inneractive.sdk.web;

import android.webkit.WebResourceRequest;
import java.net.HttpURLConnection;

/* renamed from: com.fyber.inneractive.sdk.web.c0 */
/* loaded from: classes4.dex */
public final class C15518c0 {

    /* renamed from: b */
    public static final byte[] f30734b = new byte[0];

    /* renamed from: c */
    public static final C15518c0 f30735c = new C15518c0();

    /* renamed from: a */
    public final C15514a0 f30736a = new C15514a0();

    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c9  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.fyber.inneractive.sdk.web.C15520d0 m76405a(java.net.HttpURLConnection r11, java.nio.ByteBuffer r12) {
        /*
            r11.connect()
            r0 = 0
            r1 = r0
        L5:
            r2 = 20
            r3 = 0
            if (r1 >= r2) goto Lda
            int r9 = r11.getResponseCode()
            r2 = 300(0x12c, float:4.2E-43)
            if (r9 < r2) goto L38
            r2 = 400(0x190, float:5.6E-43)
            if (r9 < r2) goto L17
            goto L38
        L17:
            java.lang.String r2 = "Location"
            java.lang.String r2 = r11.getHeaderField(r2)
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L24
            return r3
        L24:
            r11.disconnect()
            java.net.URL r11 = new java.net.URL
            r11.<init>(r2)
            java.net.URLConnection r11 = r11.openConnection()
            java.net.HttpURLConnection r11 = (java.net.HttpURLConnection) r11
            r11.connect()
            int r1 = r1 + 1
            goto L5
        L38:
            java.io.InputStream r1 = r11.getInputStream()     // Catch: java.lang.Throwable -> L50
            byte[] r12 = r12.array()     // Catch: java.lang.Throwable -> L51
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L51
            r2.<init>()     // Catch: java.lang.Throwable -> L51
        L45:
            int r4 = r1.read(r12)     // Catch: java.lang.Throwable -> L52
            r5 = -1
            if (r4 == r5) goto L52
            r2.write(r12, r0, r4)     // Catch: java.lang.Throwable -> L52
            goto L45
        L50:
            r1 = r3
        L51:
            r2 = r3
        L52:
            com.fyber.inneractive.sdk.util.AbstractC15471s.m76458b(r1)
            r11.disconnect()
            java.lang.String r12 = r11.getContentType()
            boolean r1 = android.text.TextUtils.isEmpty(r12)
            java.lang.String r4 = ""
            if (r1 != 0) goto L85
            java.lang.String r1 = ";"
            java.lang.String[] r12 = r12.split(r1)
            int r1 = r12.length
            if (r1 <= 0) goto L74
            r1 = r12[r0]
            java.lang.String r1 = r1.trim()
            goto L75
        L74:
            r1 = r4
        L75:
            int r5 = r12.length
            r6 = 1
            if (r5 <= r6) goto L82
            r12 = r12[r6]
            java.lang.String r12 = r12.trim()
            r8 = r12
            r7 = r1
            goto L87
        L82:
            r7 = r1
            r8 = r4
            goto L87
        L85:
            r7 = r4
            r8 = r7
        L87:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Map r12 = r11.getHeaderFields()
            if (r12 == 0) goto Lbe
            java.util.Set r1 = r12.keySet()
            java.util.Iterator r1 = r1.iterator()
        L9a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lbe
            java.lang.Object r4 = r1.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r12.get(r4)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L9a
            int r10 = r5.size()
            if (r10 <= 0) goto L9a
            java.lang.Object r5 = r5.get(r0)
            java.lang.String r5 = (java.lang.String) r5
            r6.put(r4, r5)
            goto L9a
        Lbe:
            java.lang.String r10 = r11.getResponseMessage()
            boolean r11 = android.text.TextUtils.isEmpty(r10)
            if (r11 == 0) goto Lc9
            return r3
        Lc9:
            com.fyber.inneractive.sdk.web.d0 r11 = new com.fyber.inneractive.sdk.web.d0
            if (r2 != 0) goto Ld0
            byte[] r12 = com.fyber.inneractive.sdk.web.C15518c0.f30734b
            goto Ld4
        Ld0:
            byte[] r12 = r2.toByteArray()
        Ld4:
            r5 = r12
            r4 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r11
        Lda:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.web.C15518c0.m76405a(java.net.HttpURLConnection, java.nio.ByteBuffer):com.fyber.inneractive.sdk.web.d0");
    }

    /* renamed from: a */
    public static void m76406a(WebResourceRequest webResourceRequest, HttpURLConnection httpURLConnection) {
        if (webResourceRequest.getRequestHeaders() == null || webResourceRequest.getRequestHeaders().size() <= 0) {
            return;
        }
        for (String str : webResourceRequest.getRequestHeaders().keySet()) {
            if (str != null && webResourceRequest.getRequestHeaders().get(str) != null) {
                httpURLConnection.setRequestProperty(str, webResourceRequest.getRequestHeaders().get(str));
            }
        }
    }
}
