package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.C30680jy;
import com.yandex.mobile.ads.impl.InterfaceC30672ju;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* renamed from: com.yandex.mobile.ads.impl.jy */
/* loaded from: classes8.dex */
public class C30680jy extends AbstractC30731kj {

    /* renamed from: e */
    private final boolean f81194e;

    /* renamed from: f */
    private final int f81195f;

    /* renamed from: g */
    private final int f81196g;
    @Nullable

    /* renamed from: h */
    private final String f81197h;
    @Nullable

    /* renamed from: i */
    private final cf0 f81198i;

    /* renamed from: j */
    private final cf0 f81199j;

    /* renamed from: k */
    private final boolean f81200k;
    @Nullable

    /* renamed from: l */
    private vf1<String> f81201l;
    @Nullable

    /* renamed from: m */
    private HttpURLConnection f81202m;
    @Nullable

    /* renamed from: n */
    private InputStream f81203n;

    /* renamed from: o */
    private boolean f81204o;

    /* renamed from: p */
    private int f81205p;

    /* renamed from: q */
    private long f81206q;

    /* renamed from: r */
    private long f81207r;

    /* renamed from: com.yandex.mobile.ads.impl.jy$a */
    /* loaded from: classes8.dex */
    public static final class C30681a implements InterfaceC30672ju.InterfaceC30673a {
        @Nullable

        /* renamed from: b */
        private String f81209b;

        /* renamed from: a */
        private final cf0 f81208a = new cf0();

        /* renamed from: c */
        private int f81210c = 8000;

        /* renamed from: d */
        private int f81211d = 8000;

        @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju.InterfaceC30673a
        /* renamed from: a */
        public final InterfaceC30672ju mo28285a() {
            return new C30680jy(this.f81209b, this.f81210c, this.f81211d, this.f81208a);
        }

        /* renamed from: b */
        public final C30681a m32705b() {
            this.f81209b = null;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.jy$b */
    /* loaded from: classes8.dex */
    public static class C30682b extends y90<String, List<String>> {

        /* renamed from: b */
        private final Map<String, List<String>> f81212b;

        public C30682b(Map<String, List<String>> map) {
            this.f81212b = map;
        }

        /* renamed from: a */
        public static /* synthetic */ boolean m32704a(String str) {
            return str != null;
        }

        @Override // com.yandex.mobile.ads.impl.y90
        /* renamed from: b */
        protected final Map<String, List<String>> mo26979b() {
            return this.f81212b;
        }

        @Override // com.yandex.mobile.ads.impl.y90, java.util.Map
        public final boolean containsKey(@Nullable Object obj) {
            if (obj != null && super.containsKey(obj)) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map
        public final boolean containsValue(@Nullable Object obj) {
            Iterator it = (Iterator) uf1.m28793a(entrySet().iterator());
            if (obj == null) {
                while (it.hasNext()) {
                    if (((Map.Entry) it.next()).getValue() == null) {
                        return true;
                    }
                }
                return false;
            }
            while (it.hasNext()) {
                if (obj.equals(((Map.Entry) it.next()).getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.y90, java.util.Map
        public final Set<Map.Entry<String, List<String>>> entrySet() {
            return gt1.m33775a(super.entrySet(), new vf1() { // from class: com.yandex.mobile.ads.impl.pr2
                @Override // com.yandex.mobile.ads.impl.vf1
                public final boolean apply(Object obj) {
                    boolean m32703a;
                    m32703a = C30680jy.C30682b.m32703a((Map.Entry) obj);
                    return m32703a;
                }
            });
        }

        @Override // java.util.Map
        public final boolean equals(@Nullable Object obj) {
            if (obj != null && m26980a(obj)) {
                return true;
            }
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.y90, java.util.Map
        @Nullable
        public final Object get(@Nullable Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // java.util.Map
        public final int hashCode() {
            return m26978c();
        }

        @Override // com.yandex.mobile.ads.impl.y90, java.util.Map
        public final boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            if (super.size() == 1 && super.containsKey(null)) {
                return true;
            }
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.y90, java.util.Map
        public final Set<String> keySet() {
            return gt1.m33775a(super.keySet(), new vf1() { // from class: com.yandex.mobile.ads.impl.qr2
                @Override // com.yandex.mobile.ads.impl.vf1
                public final boolean apply(Object obj) {
                    boolean m32704a;
                    m32704a = C30680jy.C30682b.m32704a((String) obj);
                    return m32704a;
                }
            });
        }

        @Override // com.yandex.mobile.ads.impl.y90, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // com.yandex.mobile.ads.impl.z90
        /* renamed from: a */
        protected final Map mo26295a() {
            return this.f81212b;
        }

        /* renamed from: a */
        public static /* synthetic */ boolean m32703a(Map.Entry entry) {
            return entry.getKey() != null;
        }
    }

    public C30680jy(@Nullable String str, int i, int i2, @Nullable cf0 cf0Var) {
        super(true);
        this.f81197h = str;
        this.f81195f = i;
        this.f81196g = i2;
        this.f81194e = false;
        this.f81198i = cf0Var;
        this.f81201l = null;
        this.f81199j = new cf0();
        this.f81200k = false;
    }

    /* renamed from: a */
    private URL m32708a(URL url, @Nullable String str) throws ze0 {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new ze0("Unsupported protocol redirect: " + protocol, 2001);
                } else if (this.f81194e || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    throw new ze0("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
                }
            } catch (MalformedURLException e) {
                throw new ze0(e, 2001, 1);
            }
        }
        throw new ze0("Null location redirect", 2001);
    }

    /* renamed from: d */
    private HttpURLConnection m32707d(C30976nu c30976nu) throws IOException {
        boolean z;
        HttpURLConnection m32709a;
        C30976nu c30976nu2 = c30976nu;
        URL url = new URL(c30976nu2.f83111a.toString());
        int i = c30976nu2.f83113c;
        byte[] bArr = c30976nu2.f83114d;
        long j = c30976nu2.f83116f;
        long j2 = c30976nu2.f83117g;
        int i2 = 0;
        if ((c30976nu2.f83119i & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f81194e && !this.f81200k) {
            return m32709a(url, i, bArr, j, j2, z, true, c30976nu2.f83115e);
        }
        URL url2 = url;
        int i3 = i;
        byte[] bArr2 = bArr;
        while (true) {
            int i4 = i2 + 1;
            if (i2 <= 20) {
                Map<String, String> map = c30976nu2.f83115e;
                int i5 = i3;
                URL url3 = url2;
                long j3 = j2;
                m32709a = m32709a(url2, i3, bArr2, j, j2, z, false, map);
                int responseCode = m32709a.getResponseCode();
                String headerField = m32709a.getHeaderField("Location");
                if ((i5 != 1 && i5 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    m32709a.disconnect();
                    if (this.f81200k && responseCode == 302) {
                        i3 = i5;
                    } else {
                        bArr2 = null;
                        i3 = 1;
                    }
                    url2 = m32708a(url3, headerField);
                    c30976nu2 = c30976nu;
                    i2 = i4;
                    j2 = j3;
                } else {
                    m32709a.disconnect();
                    url2 = m32708a(url3, headerField);
                    i3 = i5;
                    i2 = i4;
                    j2 = j3;
                    c30976nu2 = c30976nu;
                }
            } else {
                throw new ze0(new NoRouteToHostException(C31736wd.m27978a("Too many redirects: ", i4)), 2001, 1);
            }
        }
        return m32709a;
    }

    /* renamed from: f */
    private void m32706f() {
        HttpURLConnection httpURLConnection = this.f81202m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                gq0.m33797a("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f81202m = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final void close() throws ze0 {
        try {
            InputStream inputStream = this.f81203n;
            if (inputStream != null) {
                long j = this.f81206q;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f81207r;
                }
                m32710a(this.f81202m, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = y32.f88010a;
                    throw new ze0(e, 2000, 3);
                }
            }
        } finally {
            this.f81203n = null;
            m32706f();
            if (this.f81204o) {
                this.f81204o = false;
                m32534e();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f81202m;
        if (httpURLConnection == null) {
            return ph0.m30663g();
        }
        return new C30682b(httpURLConnection.getHeaderFields());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    @Nullable
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f81202m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30417gu
    public final int read(byte[] bArr, int i, int i2) throws ze0 {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.f81206q;
            if (j != -1) {
                long j2 = j - this.f81207r;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min(i2, j2);
            }
            InputStream inputStream = this.f81203n;
            int i3 = y32.f88010a;
            int read = inputStream.read(bArr, i, i2);
            if (read != -1) {
                this.f81207r += read;
                m32536c(read);
                return read;
            }
            return -1;
        } catch (IOException e) {
            int i4 = y32.f88010a;
            throw ze0.m26250a(e, 2);
        }
    }

    /* renamed from: a */
    private HttpURLConnection m32709a(URL url, int i, @Nullable byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        String sb2;
        HttpURLConnection mo30941a = mo30941a(url);
        mo30941a.setConnectTimeout(this.f81195f);
        mo30941a.setReadTimeout(this.f81196g);
        HashMap hashMap = new HashMap();
        cf0 cf0Var = this.f81198i;
        if (cf0Var != null) {
            hashMap.putAll(cf0Var.m35237a());
        }
        hashMap.putAll(this.f81199j.m35237a());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            mo30941a.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        int i2 = of0.f83477c;
        if (j == 0 && j2 == -1) {
            sb2 = null;
        } else {
            StringBuilder sb3 = new StringBuilder("bytes=");
            sb3.append(j);
            sb3.append("-");
            if (j2 != -1) {
                sb3.append((j + j2) - 1);
            }
            sb2 = sb3.toString();
        }
        if (sb2 != null) {
            mo30941a.setRequestProperty("Range", sb2);
        }
        String str = this.f81197h;
        if (str != null) {
            mo30941a.setRequestProperty("User-Agent", str);
        }
        mo30941a.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        mo30941a.setInstanceFollowRedirects(z2);
        mo30941a.setDoOutput(bArr != null);
        mo30941a.setRequestMethod(C30976nu.m31293a(i));
        if (bArr != null) {
            mo30941a.setFixedLengthStreamingMode(bArr.length);
            mo30941a.connect();
            OutputStream outputStream = mo30941a.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            mo30941a.connect();
        }
        return mo30941a;
    }

    /* renamed from: a */
    private static void m32710a(@Nullable HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = y32.f88010a) >= 19 && i <= 20) {
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
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    public final long mo27541a(C30976nu c30976nu) throws ze0 {
        long j = 0;
        this.f81207r = 0L;
        this.f81206q = 0L;
        m32537b(c30976nu);
        try {
            HttpURLConnection m32707d = m32707d(c30976nu);
            this.f81202m = m32707d;
            this.f81205p = m32707d.getResponseCode();
            m32707d.getResponseMessage();
            int i = this.f81205p;
            if (i >= 200 && i <= 299) {
                String contentType = m32707d.getContentType();
                vf1<String> vf1Var = this.f81201l;
                if (vf1Var != null && !vf1Var.apply(contentType)) {
                    m32706f();
                    throw new af0(contentType);
                }
                if (this.f81205p == 200) {
                    long j2 = c30976nu.f83116f;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                boolean equalsIgnoreCase = "gzip".equalsIgnoreCase(m32707d.getHeaderField("Content-Encoding"));
                if (!equalsIgnoreCase) {
                    long j3 = c30976nu.f83117g;
                    if (j3 != -1) {
                        this.f81206q = j3;
                    } else {
                        long m31037a = of0.m31037a(m32707d.getHeaderField("Content-Length"), m32707d.getHeaderField("Content-Range"));
                        this.f81206q = m31037a != -1 ? m31037a - j : -1L;
                    }
                } else {
                    this.f81206q = c30976nu.f83117g;
                }
                try {
                    this.f81203n = m32707d.getInputStream();
                    if (equalsIgnoreCase) {
                        this.f81203n = new GZIPInputStream(this.f81203n);
                    }
                    this.f81204o = true;
                    m32535c(c30976nu);
                    try {
                        m32711a(j);
                        return this.f81206q;
                    } catch (IOException e) {
                        m32706f();
                        if (e instanceof ze0) {
                            throw ((ze0) e);
                        }
                        throw new ze0(e, 2000, 1);
                    }
                } catch (IOException e2) {
                    m32706f();
                    throw new ze0(e2, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = m32707d.getHeaderFields();
            if (this.f81205p == 416) {
                if (c30976nu.f83116f == of0.m31038a(m32707d.getHeaderField("Content-Range"))) {
                    this.f81204o = true;
                    m32535c(c30976nu);
                    long j4 = c30976nu.f83117g;
                    if (j4 != -1) {
                        return j4;
                    }
                    return 0L;
                }
            }
            InputStream errorStream = m32707d.getErrorStream();
            try {
                if (errorStream != null) {
                    int i2 = y32.f88010a;
                    byte[] bArr = new byte[4096];
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        int read = errorStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    byteArrayOutputStream.toByteArray();
                } else {
                    int i3 = y32.f88010a;
                }
            } catch (IOException unused) {
                int i4 = y32.f88010a;
            }
            m32706f();
            throw new bf0(this.f81205p, this.f81205p == 416 ? new C30748ku(2008) : null, headerFields);
        } catch (IOException e3) {
            m32706f();
            throw ze0.m26250a(e3, 1);
        }
    }

    @VisibleForTesting
    /* renamed from: a */
    public HttpURLConnection mo30941a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    /* renamed from: a */
    private void m32711a(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            InputStream inputStream = this.f81203n;
            int i = y32.f88010a;
            int read = inputStream.read(bArr, 0, (int) Math.min(j, 4096));
            if (Thread.currentThread().isInterrupted()) {
                throw new ze0(new InterruptedIOException(), 2000, 1);
            }
            if (read != -1) {
                j -= read;
                m32536c(read);
            } else {
                throw new ze0(2008);
            }
        }
    }
}
