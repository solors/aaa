package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC14979m;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.p */
/* loaded from: classes4.dex */
public final class C15097p implements InterfaceC15089h {

    /* renamed from: o */
    public static final Pattern f29731o = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* renamed from: p */
    public static final AtomicReference f29732p = new AtomicReference();

    /* renamed from: a */
    public final boolean f29733a;

    /* renamed from: b */
    public final int f29734b;

    /* renamed from: c */
    public final int f29735c;

    /* renamed from: d */
    public final String f29736d;

    /* renamed from: e */
    public final C15104w f29737e;

    /* renamed from: f */
    public final C15104w f29738f;

    /* renamed from: g */
    public final C15094m f29739g;

    /* renamed from: h */
    public HttpURLConnection f29740h;

    /* renamed from: i */
    public InputStream f29741i;

    /* renamed from: j */
    public boolean f29742j;

    /* renamed from: k */
    public long f29743k;

    /* renamed from: l */
    public long f29744l;

    /* renamed from: m */
    public long f29745m;

    /* renamed from: n */
    public long f29746n;

    public C15097p(String str, C15094m c15094m, int i, int i2, boolean z, C15104w c15104w) {
        if (!TextUtils.isEmpty(str)) {
            this.f29736d = str;
            this.f29739g = c15094m;
            this.f29738f = new C15104w();
            this.f29734b = i;
            this.f29735c = i2;
            this.f29733a = z;
            this.f29737e = c15104w;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    public final Uri mo77235a() {
        HttpURLConnection httpURLConnection = this.f29740h;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* renamed from: b */
    public final HttpURLConnection m77237b(C15092k c15092k) {
        byte[] bArr = null;
        URL url = new URL(c15092k.f29706a.toString());
        long j = c15092k.f29708c;
        long j2 = c15092k.f29709d;
        int i = 0;
        boolean z = (c15092k.f29711f & 1) == 1;
        if (!this.f29733a) {
            return m77240a(url, null, j, j2, z, true);
        }
        URL url2 = url;
        while (true) {
            int i2 = i + 1;
            if (i <= 20) {
                long j3 = j;
                URL url3 = url2;
                HttpURLConnection m77240a = m77240a(url2, bArr, j, j2, z, false);
                int responseCode = m77240a.getResponseCode();
                if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                    return m77240a;
                }
                String headerField = m77240a.getHeaderField("Location");
                m77240a.disconnect();
                if (headerField != null) {
                    url2 = new URL(url3, headerField);
                    String protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: " + protocol);
                    }
                    i = i2;
                    j = j3;
                    bArr = null;
                } else {
                    throw new ProtocolException("Null location redirect");
                }
            } else {
                throw new NoRouteToHostException(AbstractC14979m.m77354a("Too many redirects: ", i2));
            }
        }
    }

    /* renamed from: c */
    public final void m77236c() {
        if (this.f29745m == this.f29743k) {
            return;
        }
        byte[] bArr = (byte[]) f29732p.getAndSet(null);
        if (bArr == null) {
            bArr = new byte[4096];
        }
        while (true) {
            long j = this.f29745m;
            long j2 = this.f29743k;
            if (j != j2) {
                int read = this.f29741i.read(bArr, 0, (int) Math.min(j2 - j, bArr.length));
                if (!Thread.interrupted()) {
                    if (read != -1) {
                        long j3 = read;
                        this.f29745m += j3;
                        C15094m c15094m = this.f29739g;
                        if (c15094m != null) {
                            synchronized (c15094m) {
                                c15094m.f29720d += j3;
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                } else {
                    throw new InterruptedIOException();
                }
            } else {
                f29732p.set(bArr);
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final void close() {
        try {
            if (this.f29741i != null) {
                HttpURLConnection httpURLConnection = this.f29740h;
                long j = this.f29744l;
                if (j != -1) {
                    j -= this.f29746n;
                }
                m77241a(httpURLConnection, j);
                try {
                    this.f29741i.close();
                } catch (IOException e) {
                    throw new C15102u(e);
                }
            }
        } finally {
            this.f29741i = null;
            m77238b();
            if (this.f29742j) {
                this.f29742j = false;
                C15094m c15094m = this.f29739g;
                if (c15094m != null) {
                    c15094m.m77242a();
                }
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    public final int read(byte[] bArr, int i, int i2) {
        try {
            m77236c();
            return m77239a(bArr, i, i2);
        } catch (IOException e) {
            throw new C15102u(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r2 != 0) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC15089h
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo77234a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15092k r15) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.C15097p.mo77234a(com.fyber.inneractive.sdk.player.exoplayer2.upstream.k):long");
    }

    /* renamed from: b */
    public final void m77238b() {
        HttpURLConnection httpURLConnection = this.f29740h;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f29740h = null;
        }
    }

    /* renamed from: a */
    public final HttpURLConnection m77240a(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) {
        Map map;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f29734b);
        httpURLConnection.setReadTimeout(this.f29735c);
        C15104w c15104w = this.f29737e;
        if (c15104w != null) {
            synchronized (c15104w) {
                if (c15104w.f29760b == null) {
                    c15104w.f29760b = Collections.unmodifiableMap(new HashMap(c15104w.f29759a));
                }
                map = c15104w.f29760b;
            }
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Map.Entry entry2 : this.f29738f.m77232a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f29736d);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpURLConnection.connect();
            } else {
                httpURLConnection.setFixedLengthStreamingMode(bArr.length);
                httpURLConnection.connect();
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.close();
            }
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    /* renamed from: a */
    public final int m77239a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f29744l;
        if (j != -1) {
            long j2 = j - this.f29746n;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = this.f29741i.read(bArr, i, i2);
        if (read == -1) {
            if (this.f29744l == -1) {
                return -1;
            }
            throw new EOFException();
        }
        long j3 = read;
        this.f29746n += j3;
        C15094m c15094m = this.f29739g;
        if (c15094m != null) {
            synchronized (c15094m) {
                c15094m.f29720d += j3;
            }
        }
        return read;
    }

    /* renamed from: a */
    public static void m77241a(HttpURLConnection httpURLConnection, long j) {
        int i = AbstractC15133z.f29832a;
        if (i == 19 || i == 20) {
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
                if (name.equals("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream") || name.equals("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream")) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }
}
