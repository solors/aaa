package com.pgl.ssdk;

import android.content.Context;
import com.learnings.purchase.event.EventUploader;
import com.maticoo.sdk.utils.request.network.Headers;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.util.Locale;

/* renamed from: com.pgl.ssdk.m0 */
/* loaded from: classes7.dex */
public abstract class AbstractC26647m0 {

    /* renamed from: a */
    private Context f69923a;

    /* renamed from: b */
    private String f69924b;

    /* renamed from: d */
    private int f69926d;

    /* renamed from: e */
    private int f69927e;

    /* renamed from: f */
    private byte[] f69928f;

    /* renamed from: c */
    public String f69925c = "";

    /* renamed from: g */
    private int f69929g = -1;

    /* renamed from: h */
    private byte[] f69930h = null;

    /* renamed from: i */
    private int f69931i = 10000;

    /* renamed from: j */
    private int f69932j = 2;

    /* renamed from: k */
    private int f69933k = 0;

    /* renamed from: l */
    private boolean f69934l = false;

    /* renamed from: m */
    private boolean f69935m = true;

    /* renamed from: n */
    private HttpURLConnection f69936n = null;

    /* renamed from: o */
    private Runnable f69937o = new RunnableC26648a();

    /* renamed from: com.pgl.ssdk.m0$a */
    /* loaded from: classes7.dex */
    class RunnableC26648a implements Runnable {
        RunnableC26648a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!AbstractC26647m0.this.m40828a() && AbstractC26647m0.this.f69933k < AbstractC26647m0.this.f69932j) {
                AbstractC26647m0.m40819c(AbstractC26647m0.this);
                C26652o0.m40802a(this);
            }
        }
    }

    public AbstractC26647m0(Context context, String str) {
        str = (str == null || str.length() <= 0) ? "" : "";
        this.f69923a = context;
        this.f69924b = str;
    }

    /* renamed from: c */
    static /* synthetic */ int m40819c(AbstractC26647m0 abstractC26647m0) {
        int i = abstractC26647m0.f69933k;
        abstractC26647m0.f69933k = i + 1;
        return i;
    }

    /* renamed from: a */
    public abstract boolean mo40825a(int i, byte[] bArr);

    /* renamed from: a */
    private void m40827a(int i) throws ProtocolException {
        this.f69936n.setRequestMethod(i != 1 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "GET" : "TRACE" : "HEAD" : "DELETE" : "PUT" : "POST");
    }

    /* renamed from: b */
    private void m40822b(int i) {
        String str = i != 1 ? i != 2 ? "" : Headers.VALUE_APPLICATION_STREAM : EventUploader.MEDIA_TYPE_JSON;
        if (str.length() > 0) {
            this.f69936n.addRequestProperty("Content-Type", str);
        }
        HttpURLConnection httpURLConnection = this.f69936n;
        httpURLConnection.addRequestProperty("Cookie", "sessionid=" + this.f69924b);
        try {
            String language = Locale.getDefault().getLanguage();
            if (language.equalsIgnoreCase("zh")) {
                HttpURLConnection httpURLConnection2 = this.f69936n;
                httpURLConnection2.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9");
                return;
            }
            HttpURLConnection httpURLConnection3 = this.f69936n;
            httpURLConnection3.addRequestProperty("Accept-Language", Locale.getDefault().toString() + "," + language + ";q=0.9,en-US;q=0.6,en;q=0.4");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private byte[] m40823a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr, 0, 1024);
            if (read > 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006e, code lost:
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (r1 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
        r1 = r4.f69936n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r1 == null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0080, code lost:
        if (r1 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
        r1.disconnect();
        r4.f69936n = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
        if (r2 == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x008a, code lost:
        mo40825a(r4.f69929g, r4.f69930h);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
        return r2;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean m40828a() {
        /*
            r4 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch: java.lang.Throwable -> L7d
            java.lang.String r2 = r4.f69925c     // Catch: java.lang.Throwable -> L7d
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7d
            boolean r2 = r4.f69935m     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L17
            java.net.Proxy r2 = java.net.Proxy.NO_PROXY     // Catch: java.lang.Throwable -> L7d
            java.net.URLConnection r1 = r1.openConnection(r2)     // Catch: java.lang.Throwable -> L7d
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> L7d
            r4.f69936n = r1     // Catch: java.lang.Throwable -> L7d
            goto L1f
        L17:
            java.net.URLConnection r1 = r1.openConnection()     // Catch: java.lang.Throwable -> L7d
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch: java.lang.Throwable -> L7d
            r4.f69936n = r1     // Catch: java.lang.Throwable -> L7d
        L1f:
            java.net.HttpURLConnection r1 = r4.f69936n     // Catch: java.lang.Throwable -> L7d
            int r2 = r4.f69931i     // Catch: java.lang.Throwable -> L7d
            r1.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L7d
            java.net.HttpURLConnection r1 = r4.f69936n     // Catch: java.lang.Throwable -> L7d
            int r2 = r4.f69931i     // Catch: java.lang.Throwable -> L7d
            r1.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L7d
            int r1 = r4.f69926d     // Catch: java.lang.Throwable -> L7d
            r4.m40827a(r1)     // Catch: java.lang.Throwable -> L7d
            int r1 = r4.f69927e     // Catch: java.lang.Throwable -> L7d
            r4.m40822b(r1)     // Catch: java.lang.Throwable -> L7d
            byte[] r1 = r4.f69928f     // Catch: java.lang.Throwable -> L7d
            r2 = 1
            if (r1 == 0) goto L55
            int r1 = r1.length     // Catch: java.lang.Throwable -> L7d
            if (r1 <= 0) goto L55
            java.net.HttpURLConnection r1 = r4.f69936n     // Catch: java.lang.Throwable -> L7d
            r1.setDoOutput(r2)     // Catch: java.lang.Throwable -> L7d
            java.net.HttpURLConnection r1 = r4.f69936n     // Catch: java.lang.Throwable -> L7d
            java.io.OutputStream r1 = r1.getOutputStream()     // Catch: java.lang.Throwable -> L7d
            byte[] r3 = r4.f69928f     // Catch: java.lang.Throwable -> L7d
            r1.write(r3)     // Catch: java.lang.Throwable -> L7d
            r1.flush()     // Catch: java.lang.Throwable -> L7d
            r1.close()     // Catch: java.lang.Throwable -> L7d
        L55:
            java.net.HttpURLConnection r1 = r4.f69936n     // Catch: java.lang.Throwable -> L7d
            r1.connect()     // Catch: java.lang.Throwable -> L7d
            java.net.HttpURLConnection r1 = r4.f69936n     // Catch: java.lang.Throwable -> L71
            int r1 = r1.getResponseCode()     // Catch: java.lang.Throwable -> L71
            r4.f69929g = r1     // Catch: java.lang.Throwable -> L71
            java.net.HttpURLConnection r1 = r4.f69936n     // Catch: java.lang.Throwable -> L71
            java.io.InputStream r1 = r1.getInputStream()     // Catch: java.lang.Throwable -> L71
            byte[] r3 = r4.m40823a(r1)     // Catch: java.lang.Throwable -> L72
            r4.f69930h = r3     // Catch: java.lang.Throwable -> L72
            if (r1 == 0) goto L78
            goto L75
        L71:
            r1 = r0
        L72:
            if (r1 != 0) goto L75
            goto L78
        L75:
            r1.close()     // Catch: java.lang.Throwable -> L7d
        L78:
            java.net.HttpURLConnection r1 = r4.f69936n
            if (r1 == 0) goto L88
            goto L83
        L7d:
            java.net.HttpURLConnection r1 = r4.f69936n
            r2 = 0
            if (r1 != 0) goto L83
            goto L88
        L83:
            r1.disconnect()
            r4.f69936n = r0
        L88:
            if (r2 == 0) goto L91
            int r0 = r4.f69929g
            byte[] r1 = r4.f69930h
            r4.mo40825a(r0, r1)
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.AbstractC26647m0.m40828a():boolean");
    }

    /* renamed from: b */
    private void m40821b(int i, int i2, byte[] bArr) {
        this.f69926d = i;
        this.f69927e = i2;
        this.f69928f = bArr;
    }

    /* renamed from: a */
    public void m40826a(int i, int i2, byte[] bArr) {
        m40821b(i, i2, bArr);
        C26652o0.m40802a(this.f69937o);
    }
}
