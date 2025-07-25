package p811o4;

import android.text.TextUtils;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import p993u4.C44433l;
import p993u4.HttpUtil;

/* renamed from: o4.a */
/* loaded from: classes6.dex */
public class RealRequest {

    /* renamed from: a */
    private String f102710a;

    /* renamed from: b */
    private String f102711b;

    /* renamed from: c */
    private Map<String, String> f102712c;

    /* compiled from: RealRequest.java */
    /* renamed from: o4.a$a */
    /* loaded from: classes6.dex */
    public static class C39102a {

        /* renamed from: a */
        private String f102713a;

        /* renamed from: b */
        private String f102714b;

        /* renamed from: c */
        private Map<String, String> f102715c;

        /* renamed from: d */
        private Map<String, String> f102716d;

        /* renamed from: a */
        public RealRequest m13935a() {
            if (!TextUtils.isEmpty(this.f102713a)) {
                RealRequest realRequest = new RealRequest();
                realRequest.f102710a = HttpUtil.m3001b(this.f102713a, this.f102716d);
                realRequest.f102712c = this.f102715c;
                realRequest.f102711b = this.f102714b;
                return realRequest;
            }
            throw new IllegalArgumentException("base url is empty");
        }

        /* renamed from: b */
        public C39102a m13934b(String str) {
            this.f102713a = str;
            return this;
        }

        /* renamed from: c */
        public C39102a m13933c(String str) {
            this.f102714b = str;
            return this;
        }

        /* renamed from: d */
        public C39102a m13932d(Map<String, String> map) {
            this.f102715c = map;
            return this;
        }

        /* renamed from: e */
        public C39102a m13931e(Map<String, String> map) {
            this.f102716d = map;
            return this;
        }
    }

    /* renamed from: d */
    private HttpsURLConnection m13939d(String str) throws IOException, NoSuchAlgorithmException, KeyStoreException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(str).openConnection();
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setUseCaches(false);
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        httpsURLConnection.setDoOutput(true);
        return httpsURLConnection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r4 == null) goto L8;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p811o4.RealResponse m13938e(java.net.HttpURLConnection r4) {
        /*
            r3 = this;
            o4.b r0 = new o4.b
            r0.<init>()
            int r1 = r4.getResponseCode()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r0.f102719c = r1     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            int r1 = r4.getContentLength()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r0.f102720d = r1     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            int r1 = r0.f102719c     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r2 = 400(0x190, float:5.6E-43)
            if (r1 >= r2) goto L23
            java.io.InputStream r1 = r4.getInputStream()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            java.lang.String r1 = p993u4.HttpUtil.m3002a(r1)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r0.f102717a = r1     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            goto L3b
        L23:
            java.io.InputStream r1 = r4.getErrorStream()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            java.lang.String r1 = p993u4.HttpUtil.m3002a(r1)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            r0.f102718b = r1     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L30
            goto L3b
        L2e:
            r0 = move-exception
            goto L4e
        L30:
            r1 = move-exception
            r0.f102721e = r1     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L2e
            r0.f102718b = r1     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L3e
        L3b:
            r4.disconnect()
        L3e:
            boolean r4 = p993u4.C44433l.m2994d()
            if (r4 == 0) goto L4d
            java.lang.String r4 = "RealRequest"
            java.lang.String r1 = r0.toString()
            p993u4.C44433l.m2997a(r4, r1)
        L4d:
            return r0
        L4e:
            if (r4 == 0) goto L53
            r4.disconnect()
        L53:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p811o4.RealRequest.m13938e(java.net.HttpURLConnection):o4.b");
    }

    /* renamed from: g */
    private void m13936g(HttpURLConnection httpURLConnection, Map<String, String> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                httpURLConnection.setRequestProperty(str, map.get(str));
            }
        }
    }

    /* renamed from: f */
    public RealResponse m13937f() {
        BufferedWriter bufferedWriter = null;
        try {
            try {
                HttpsURLConnection m13939d = m13939d(this.f102710a);
                Map<String, String> map = this.f102712c;
                if (map != null) {
                    m13936g(m13939d, map);
                }
                if (C44433l.m2994d()) {
                    C44433l.m2997a("RealRequest", "url:" + this.f102710a);
                    C44433l.m2997a("RealRequest", "header = " + this.f102712c);
                }
                m13939d.connect();
                if (!TextUtils.isEmpty(this.f102711b)) {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(m13939d.getOutputStream(), StandardCharsets.UTF_8));
                    try {
                        bufferedWriter2.write(this.f102711b);
                        bufferedWriter2.flush();
                        bufferedWriter = bufferedWriter2;
                    } catch (Exception e) {
                        bufferedWriter = bufferedWriter2;
                        e = e;
                        RealResponse realResponse = new RealResponse();
                        realResponse.f102721e = e;
                        realResponse.f102718b = e.getMessage();
                        e.printStackTrace();
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        return realResponse;
                    } catch (Throwable th) {
                        bufferedWriter = bufferedWriter2;
                        th = th;
                        if (bufferedWriter != null) {
                            try {
                                bufferedWriter.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                RealResponse m13938e = m13938e(m13939d);
                if (bufferedWriter != null) {
                    try {
                        bufferedWriter.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                }
                return m13938e;
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
