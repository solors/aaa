package com.applovin.impl;

import android.net.Uri;
import com.applovin.exoplayer2.common.base.Predicate;
import com.applovin.impl.InterfaceC5110pa;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* renamed from: com.applovin.impl.c6 */
/* loaded from: classes2.dex */
public class C4165c6 extends AbstractC3982a2 implements InterfaceC5110pa {

    /* renamed from: e */
    private final boolean f5197e;

    /* renamed from: f */
    private final int f5198f;

    /* renamed from: g */
    private final int f5199g;

    /* renamed from: h */
    private final String f5200h;

    /* renamed from: i */
    private final InterfaceC5110pa.C5116f f5201i;

    /* renamed from: j */
    private final InterfaceC5110pa.C5116f f5202j;

    /* renamed from: k */
    private final boolean f5203k;

    /* renamed from: l */
    private Predicate f5204l;

    /* renamed from: m */
    private C4698k5 f5205m;

    /* renamed from: n */
    private HttpURLConnection f5206n;

    /* renamed from: o */
    private InputStream f5207o;

    /* renamed from: p */
    private boolean f5208p;

    /* renamed from: q */
    private int f5209q;

    /* renamed from: r */
    private long f5210r;

    /* renamed from: s */
    private long f5211s;

    private C4165c6(String str, int i, int i2, boolean z, InterfaceC5110pa.C5116f c5116f, Predicate predicate, boolean z2) {
        super(true);
        this.f5200h = str;
        this.f5198f = i;
        this.f5199g = i2;
        this.f5197e = z;
        this.f5201i = c5116f;
        this.f5204l = predicate;
        this.f5202j = new InterfaceC5110pa.C5116f();
        this.f5203k = z2;
    }

    /* renamed from: a */
    private URL m100247a(URL url, String str, C4698k5 c4698k5) {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new InterfaceC5110pa.C5113c("Unsupported protocol redirect: " + protocol, c4698k5, 2001, 1);
                } else if (this.f5197e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    throw new InterfaceC5110pa.C5113c("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", c4698k5, 2001, 1);
                }
            } catch (MalformedURLException e) {
                throw new InterfaceC5110pa.C5113c(e, c4698k5, 2001, 1);
            }
        }
        throw new InterfaceC5110pa.C5113c("Null location redirect", c4698k5, 2001, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
        return r0;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.net.HttpURLConnection m100246d(com.applovin.impl.C4698k5 r26) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.C4165c6.m100246d(com.applovin.impl.k5):java.net.HttpURLConnection");
    }

    /* renamed from: h */
    private void m100244h() {
        HttpURLConnection httpURLConnection = this.f5206n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AbstractC5063oc.m96808a("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f5206n = null;
        }
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: c */
    public Uri mo94270c() {
        HttpURLConnection httpURLConnection = this.f5206n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    public void close() {
        try {
            InputStream inputStream = this.f5207o;
            if (inputStream != null) {
                long j = this.f5210r;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f5211s;
                }
                m100250a(this.f5206n, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new InterfaceC5110pa.C5113c(e, (C4698k5) AbstractC5863xp.m93017a(this.f5205m), 2000, 3);
                }
            }
        } finally {
            this.f5207o = null;
            m100244h();
            if (this.f5208p) {
                this.f5208p = false;
                m101073g();
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: e */
    public Map mo94269e() {
        HttpURLConnection httpURLConnection = this.f5206n;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    /* renamed from: com.applovin.impl.c6$b */
    /* loaded from: classes2.dex */
    public static final class C4167b implements InterfaceC5110pa.InterfaceC5112b {

        /* renamed from: b */
        private InterfaceC5862xo f5213b;

        /* renamed from: c */
        private Predicate f5214c;

        /* renamed from: d */
        private String f5215d;

        /* renamed from: g */
        private boolean f5218g;

        /* renamed from: h */
        private boolean f5219h;

        /* renamed from: a */
        private final InterfaceC5110pa.C5116f f5212a = new InterfaceC5110pa.C5116f();

        /* renamed from: e */
        private int f5216e = 8000;

        /* renamed from: f */
        private int f5217f = 8000;

        @Override // com.applovin.impl.InterfaceC5110pa.InterfaceC5112b, com.applovin.impl.InterfaceC4509h5.InterfaceC4510a
        /* renamed from: b */
        public C4165c6 mo93968a() {
            C4165c6 c4165c6 = new C4165c6(this.f5215d, this.f5216e, this.f5217f, this.f5218g, this.f5212a, this.f5214c, this.f5219h);
            InterfaceC5862xo interfaceC5862xo = this.f5213b;
            if (interfaceC5862xo != null) {
                c4165c6.mo94272a(interfaceC5862xo);
            }
            return c4165c6;
        }

        /* renamed from: a */
        public C4167b m100243a(String str) {
            this.f5215d = str;
            return this;
        }
    }

    /* renamed from: e */
    private int m100245e(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f5210r;
        if (j != -1) {
            long j2 = j - this.f5211s;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) AbstractC5863xp.m93017a((Object) this.f5207o)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f5211s += read;
        m101074d(read);
        return read;
    }

    /* renamed from: a */
    private static boolean m100251a(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* renamed from: a */
    private HttpURLConnection m100248a(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) {
        HttpURLConnection m100249a = m100249a(url);
        m100249a.setConnectTimeout(this.f5198f);
        m100249a.setReadTimeout(this.f5199g);
        HashMap hashMap = new HashMap();
        InterfaceC5110pa.C5116f c5116f = this.f5201i;
        if (c5116f != null) {
            hashMap.putAll(c5116f.m96572a());
        }
        hashMap.putAll(this.f5202j.m96572a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            m100249a.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String m95916a = AbstractC5258ra.m95916a(j, j2);
        if (m95916a != null) {
            m100249a.setRequestProperty("Range", m95916a);
        }
        String str = this.f5200h;
        if (str != null) {
            m100249a.setRequestProperty("User-Agent", str);
        }
        m100249a.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        m100249a.setInstanceFollowRedirects(z2);
        m100249a.setDoOutput(bArr != null);
        m100249a.setRequestMethod(C4698k5.m98023a(i));
        if (bArr != null) {
            m100249a.setFixedLengthStreamingMode(bArr.length);
            m100249a.connect();
            OutputStream outputStream = m100249a.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            m100249a.connect();
        }
        return m100249a;
    }

    /* renamed from: a */
    private static void m100250a(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = AbstractC5863xp.f12151a) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if (!"com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) && !"com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    return;
                }
                Method declaredMethod = ((Class) AbstractC4100b1.m100583a(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: a */
    public long mo94273a(C4698k5 c4698k5) {
        byte[] bArr;
        this.f5205m = c4698k5;
        long j = 0;
        this.f5211s = 0L;
        this.f5210r = 0L;
        m101076b(c4698k5);
        try {
            HttpURLConnection m100246d = m100246d(c4698k5);
            this.f5206n = m100246d;
            this.f5209q = m100246d.getResponseCode();
            String responseMessage = m100246d.getResponseMessage();
            int i = this.f5209q;
            if (i >= 200 && i <= 299) {
                String contentType = m100246d.getContentType();
                Predicate predicate = this.f5204l;
                if (predicate != null && !predicate.apply(contentType)) {
                    m100244h();
                    throw new InterfaceC5110pa.C5114d(contentType, c4698k5);
                }
                if (this.f5209q == 200) {
                    long j2 = c4698k5.f7372g;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                boolean m100251a = m100251a(m100246d);
                if (!m100251a) {
                    long j3 = c4698k5.f7373h;
                    if (j3 != -1) {
                        this.f5210r = j3;
                    } else {
                        long m95914a = AbstractC5258ra.m95914a(m100246d.getHeaderField("Content-Length"), m100246d.getHeaderField("Content-Range"));
                        this.f5210r = m95914a != -1 ? m95914a - j : -1L;
                    }
                } else {
                    this.f5210r = c4698k5.f7373h;
                }
                try {
                    this.f5207o = m100246d.getInputStream();
                    if (m100251a) {
                        this.f5207o = new GZIPInputStream(this.f5207o);
                    }
                    this.f5208p = true;
                    m101075c(c4698k5);
                    try {
                        m100252a(j, c4698k5);
                        return this.f5210r;
                    } catch (IOException e) {
                        m100244h();
                        if (e instanceof InterfaceC5110pa.C5113c) {
                            throw ((InterfaceC5110pa.C5113c) e);
                        }
                        throw new InterfaceC5110pa.C5113c(e, c4698k5, 2000, 1);
                    }
                } catch (IOException e2) {
                    m100244h();
                    throw new InterfaceC5110pa.C5113c(e2, c4698k5, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = m100246d.getHeaderFields();
            if (this.f5209q == 416) {
                if (c4698k5.f7372g == AbstractC5258ra.m95915a(m100246d.getHeaderField("Content-Range"))) {
                    this.f5208p = true;
                    m101075c(c4698k5);
                    long j4 = c4698k5.f7373h;
                    if (j4 != -1) {
                        return j4;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = m100246d.getErrorStream();
            try {
                if (errorStream != null) {
                    bArr = AbstractC5863xp.m93019a(errorStream);
                } else {
                    bArr = AbstractC5863xp.f12156f;
                }
            } catch (IOException unused) {
                bArr = AbstractC5863xp.f12156f;
            }
            byte[] bArr2 = bArr;
            m100244h();
            throw new InterfaceC5110pa.C5115e(this.f5209q, responseMessage, this.f5209q == 416 ? new C4567i5(2008) : null, headerFields, c4698k5, bArr2);
        } catch (IOException e3) {
            m100244h();
            throw InterfaceC5110pa.C5113c.m96573a(e3, c4698k5, 1);
        }
    }

    /* renamed from: a */
    HttpURLConnection m100249a(URL url) {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.applovin.impl.InterfaceC4379f5
    /* renamed from: a */
    public int mo94271a(byte[] bArr, int i, int i2) {
        try {
            return m100245e(bArr, i, i2);
        } catch (IOException e) {
            throw InterfaceC5110pa.C5113c.m96573a(e, (C4698k5) AbstractC5863xp.m93017a(this.f5205m), 2);
        }
    }

    /* renamed from: a */
    private void m100252a(long j, C4698k5 c4698k5) {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int read = ((InputStream) AbstractC5863xp.m93017a((Object) this.f5207o)).read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterfaceC5110pa.C5113c(new InterruptedIOException(), c4698k5, 2000, 1);
            }
            if (read != -1) {
                j -= read;
                m101074d(read);
            } else {
                throw new InterfaceC5110pa.C5113c(c4698k5, 2008, 1);
            }
        }
    }
}
