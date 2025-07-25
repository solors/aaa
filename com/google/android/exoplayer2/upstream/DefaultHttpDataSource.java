package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Predicate;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
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
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* loaded from: classes4.dex */
public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;

    /* renamed from: e */
    private final boolean f35819e;

    /* renamed from: f */
    private final int f35820f;

    /* renamed from: g */
    private final int f35821g;
    @Nullable

    /* renamed from: h */
    private final String f35822h;
    @Nullable

    /* renamed from: i */
    private final HttpDataSource.RequestProperties f35823i;

    /* renamed from: j */
    private final HttpDataSource.RequestProperties f35824j;

    /* renamed from: k */
    private final boolean f35825k;
    @Nullable

    /* renamed from: l */
    private Predicate<String> f35826l;
    @Nullable

    /* renamed from: m */
    private DataSpec f35827m;
    @Nullable

    /* renamed from: n */
    private HttpURLConnection f35828n;
    @Nullable

    /* renamed from: o */
    private InputStream f35829o;

    /* renamed from: p */
    private boolean f35830p;

    /* renamed from: q */
    private int f35831q;

    /* renamed from: r */
    private long f35832r;

    /* renamed from: s */
    private long f35833s;

    /* loaded from: classes4.dex */
    public static final class Factory implements HttpDataSource.Factory {
        @Nullable

        /* renamed from: b */
        private TransferListener f35835b;
        @Nullable

        /* renamed from: c */
        private Predicate<String> f35836c;
        @Nullable

        /* renamed from: d */
        private String f35837d;

        /* renamed from: g */
        private boolean f35840g;

        /* renamed from: h */
        private boolean f35841h;

        /* renamed from: a */
        private final HttpDataSource.RequestProperties f35834a = new HttpDataSource.RequestProperties();

        /* renamed from: e */
        private int f35838e = 8000;

        /* renamed from: f */
        private int f35839f = 8000;

        @CanIgnoreReturnValue
        public Factory setAllowCrossProtocolRedirects(boolean z) {
            this.f35840g = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setConnectTimeoutMs(int i) {
            this.f35838e = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setContentTypePredicate(@Nullable Predicate<String> predicate) {
            this.f35836c = predicate;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        @CanIgnoreReturnValue
        public /* bridge */ /* synthetic */ HttpDataSource.Factory setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }

        @CanIgnoreReturnValue
        public Factory setKeepPostFor302Redirects(boolean z) {
            this.f35841h = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setReadTimeoutMs(int i) {
            this.f35839f = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setTransferListener(@Nullable TransferListener transferListener) {
            this.f35835b = transferListener;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setUserAgent(@Nullable String str) {
            this.f35837d = str;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory
        @CanIgnoreReturnValue
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.f35834a.clearAndSet(map);
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public DefaultHttpDataSource createDataSource() {
            DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource(this.f35837d, this.f35838e, this.f35839f, this.f35840g, this.f35834a, this.f35836c, this.f35841h);
            TransferListener transferListener = this.f35835b;
            if (transferListener != null) {
                defaultHttpDataSource.addTransferListener(transferListener);
            }
            return defaultHttpDataSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class NullFilteringHeadersMap extends ForwardingMap<String, List<String>> {

        /* renamed from: b */
        private final Map<String, List<String>> f35842b;

        public NullFilteringHeadersMap(Map<String, List<String>> map) {
            this.f35842b = map;
        }

        public static /* synthetic */ boolean lambda$entrySet$1(Map.Entry entry) {
            if (entry.getKey() != null) {
                return true;
            }
            return false;
        }

        public static /* synthetic */ boolean lambda$keySet$0(String str) {
            if (str != null) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean containsKey(@Nullable Object obj) {
            if (obj != null && super.containsKey(obj)) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean containsValue(@Nullable Object obj) {
            return super.standardContainsValue(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<Map.Entry<String, List<String>>> entrySet() {
            return Sets.filter(super.entrySet(), new Predicate() { // from class: com.google.android.exoplayer2.upstream.d
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    boolean lambda$entrySet$1;
                    lambda$entrySet$1 = DefaultHttpDataSource.NullFilteringHeadersMap.lambda$entrySet$1((Map.Entry) obj);
                    return lambda$entrySet$1;
                }
            });
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean equals(@Nullable Object obj) {
            if (obj != null && super.standardEquals(obj)) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public int hashCode() {
            return super.standardHashCode();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public boolean isEmpty() {
            if (super.isEmpty()) {
                return true;
            }
            if (super.size() == 1 && super.containsKey(null)) {
                return true;
            }
            return false;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<String> keySet() {
            return Sets.filter(super.keySet(), new Predicate() { // from class: com.google.android.exoplayer2.upstream.c
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    boolean lambda$keySet$0;
                    lambda$keySet$0 = DefaultHttpDataSource.NullFilteringHeadersMap.lambda$keySet$0((String) obj);
                    return lambda$keySet$0;
                }
            });
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public Map<String, List<String>> delegate() {
            return this.f35842b;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        @Nullable
        public List<String> get(@Nullable Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }
    }

    /* renamed from: f */
    private void m72782f() {
        HttpURLConnection httpURLConnection = this.f35828n;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.m72605e("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.f35828n = null;
        }
    }

    /* renamed from: g */
    private URL m72781g(URL url, @Nullable String str, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new HttpDataSource.HttpDataSourceException("Unsupported protocol redirect: " + protocol, dataSpec, 2001, 1);
                } else if (!this.f35819e && !protocol.equals(url.getProtocol())) {
                    throw new HttpDataSource.HttpDataSourceException("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", dataSpec, 2001, 1);
                } else {
                    return url2;
                }
            } catch (MalformedURLException e) {
                throw new HttpDataSource.HttpDataSourceException(e, dataSpec, 2001, 1);
            }
        }
        throw new HttpDataSource.HttpDataSourceException("Null location redirect", dataSpec, 2001, 1);
    }

    /* renamed from: h */
    private static boolean m72780h(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    /* renamed from: i */
    private HttpURLConnection m72779i(DataSpec dataSpec) throws IOException {
        HttpURLConnection m72778j;
        boolean z;
        URL url = new URL(dataSpec.uri.toString());
        int i = dataSpec.httpMethod;
        byte[] bArr = dataSpec.httpBody;
        long j = dataSpec.position;
        long j2 = dataSpec.length;
        boolean isFlagSet = dataSpec.isFlagSet(1);
        if (!this.f35819e && !this.f35825k) {
            return m72778j(url, i, bArr, j, j2, isFlagSet, true, dataSpec.httpRequestHeaders);
        }
        URL url2 = url;
        int i2 = i;
        byte[] bArr2 = bArr;
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                long j3 = j;
                long j4 = j;
                int i5 = i2;
                URL url3 = url2;
                long j5 = j2;
                m72778j = m72778j(url2, i2, bArr2, j3, j2, isFlagSet, false, dataSpec.httpRequestHeaders);
                int responseCode = m72778j.getResponseCode();
                String headerField = m72778j.getHeaderField("Location");
                if ((i5 != 1 && i5 != 3) || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308)) {
                    if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    }
                    m72778j.disconnect();
                    if (this.f35825k && responseCode == 302) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        bArr2 = null;
                        i2 = 1;
                    } else {
                        i2 = i5;
                    }
                    url2 = m72781g(url3, headerField, dataSpec);
                } else {
                    m72778j.disconnect();
                    url2 = m72781g(url3, headerField, dataSpec);
                    i2 = i5;
                }
                i3 = i4;
                j = j4;
                j2 = j5;
            } else {
                throw new HttpDataSource.HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i4), dataSpec, 2001, 1);
            }
        }
        return m72778j;
    }

    /* renamed from: j */
    private HttpURLConnection m72778j(URL url, int i, @Nullable byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        String str;
        boolean z3;
        HttpURLConnection m72776l = m72776l(url);
        m72776l.setConnectTimeout(this.f35820f);
        m72776l.setReadTimeout(this.f35821g);
        HashMap hashMap = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.f35823i;
        if (requestProperties != null) {
            hashMap.putAll(requestProperties.getSnapshot());
        }
        hashMap.putAll(this.f35824j.getSnapshot());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            m72776l.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String buildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(j, j2);
        if (buildRangeRequestHeader != null) {
            m72776l.setRequestProperty("Range", buildRangeRequestHeader);
        }
        String str2 = this.f35822h;
        if (str2 != null) {
            m72776l.setRequestProperty("User-Agent", str2);
        }
        if (z) {
            str = "gzip";
        } else {
            str = "identity";
        }
        m72776l.setRequestProperty("Accept-Encoding", str);
        m72776l.setInstanceFollowRedirects(z2);
        if (bArr != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        m72776l.setDoOutput(z3);
        m72776l.setRequestMethod(DataSpec.getStringForHttpMethod(i));
        if (bArr != null) {
            m72776l.setFixedLengthStreamingMode(bArr.length);
            m72776l.connect();
            OutputStream outputStream = m72776l.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            m72776l.connect();
        }
        return m72776l;
    }

    /* renamed from: k */
    private static void m72777k(@Nullable HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = Util.SDK_INT) >= 19 && i <= 20) {
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
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = ((Class) Assertions.checkNotNull(inputStream.getClass().getSuperclass())).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: m */
    private int m72775m(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f35832r;
        if (j != -1) {
            long j2 = j - this.f35833s;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) Util.castNonNull(this.f35829o)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.f35833s += read;
        m72806b(read);
        return read;
    }

    /* renamed from: n */
    private void m72774n(long j, DataSpec dataSpec) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int read = ((InputStream) Util.castNonNull(this.f35829o)).read(bArr, 0, (int) Math.min(j, 4096));
            if (!Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j -= read;
                    m72806b(read);
                } else {
                    throw new HttpDataSource.HttpDataSourceException(dataSpec, 2008, 1);
                }
            } else {
                throw new HttpDataSource.HttpDataSourceException(new InterruptedIOException(), dataSpec, 2000, 1);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearAllRequestProperties() {
        this.f35824j.clear();
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void clearRequestProperty(String str) {
        Assertions.checkNotNull(str);
        this.f35824j.remove(str);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            InputStream inputStream = this.f35829o;
            if (inputStream != null) {
                long j = this.f35832r;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f35833s;
                }
                m72777k(this.f35828n, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new HttpDataSource.HttpDataSourceException(e, (DataSpec) Util.castNonNull(this.f35827m), 2000, 3);
                }
            }
        } finally {
            this.f35829o = null;
            m72782f();
            if (this.f35830p) {
                this.f35830p = false;
                m72805c();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public int getResponseCode() {
        int i;
        if (this.f35828n == null || (i = this.f35831q) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f35828n;
        if (httpURLConnection == null) {
            return ImmutableMap.m69397of();
        }
        return new NullFilteringHeadersMap(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.f35828n;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @VisibleForTesting
    /* renamed from: l */
    HttpURLConnection m72776l(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        byte[] bArr;
        DataSourceException dataSourceException;
        this.f35827m = dataSpec;
        long j = 0;
        this.f35833s = 0L;
        this.f35832r = 0L;
        m72804d(dataSpec);
        try {
            HttpURLConnection m72779i = m72779i(dataSpec);
            this.f35828n = m72779i;
            this.f35831q = m72779i.getResponseCode();
            String responseMessage = m72779i.getResponseMessage();
            int i = this.f35831q;
            long j2 = -1;
            if (i >= 200 && i <= 299) {
                String contentType = m72779i.getContentType();
                Predicate<String> predicate = this.f35826l;
                if (predicate != null && !predicate.apply(contentType)) {
                    m72782f();
                    throw new HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
                }
                if (this.f35831q == 200) {
                    long j3 = dataSpec.position;
                    if (j3 != 0) {
                        j = j3;
                    }
                }
                boolean m72780h = m72780h(m72779i);
                if (!m72780h) {
                    long j4 = dataSpec.length;
                    if (j4 != -1) {
                        this.f35832r = j4;
                    } else {
                        long contentLength = HttpUtil.getContentLength(m72779i.getHeaderField("Content-Length"), m72779i.getHeaderField("Content-Range"));
                        if (contentLength != -1) {
                            j2 = contentLength - j;
                        }
                        this.f35832r = j2;
                    }
                } else {
                    this.f35832r = dataSpec.length;
                }
                try {
                    this.f35829o = m72779i.getInputStream();
                    if (m72780h) {
                        this.f35829o = new GZIPInputStream(this.f35829o);
                    }
                    this.f35830p = true;
                    m72803e(dataSpec);
                    try {
                        m72774n(j, dataSpec);
                        return this.f35832r;
                    } catch (IOException e) {
                        m72782f();
                        if (e instanceof HttpDataSource.HttpDataSourceException) {
                            throw ((HttpDataSource.HttpDataSourceException) e);
                        }
                        throw new HttpDataSource.HttpDataSourceException(e, dataSpec, 2000, 1);
                    }
                } catch (IOException e2) {
                    m72782f();
                    throw new HttpDataSource.HttpDataSourceException(e2, dataSpec, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = m72779i.getHeaderFields();
            if (this.f35831q == 416) {
                if (dataSpec.position == HttpUtil.getDocumentSize(m72779i.getHeaderField("Content-Range"))) {
                    this.f35830p = true;
                    m72803e(dataSpec);
                    long j5 = dataSpec.length;
                    if (j5 == -1) {
                        return 0L;
                    }
                    return j5;
                }
            }
            InputStream errorStream = m72779i.getErrorStream();
            try {
                if (errorStream != null) {
                    bArr = Util.toByteArray(errorStream);
                } else {
                    bArr = Util.EMPTY_BYTE_ARRAY;
                }
            } catch (IOException unused) {
                bArr = Util.EMPTY_BYTE_ARRAY;
            }
            byte[] bArr2 = bArr;
            m72782f();
            if (this.f35831q == 416) {
                dataSourceException = new DataSourceException(2008);
            } else {
                dataSourceException = null;
            }
            throw new HttpDataSource.InvalidResponseCodeException(this.f35831q, responseMessage, dataSourceException, headerFields, dataSpec, bArr2);
        } catch (IOException e3) {
            m72782f();
            throw HttpDataSource.HttpDataSourceException.createForIOException(e3, dataSpec, 1);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource.HttpDataSourceException {
        try {
            return m72775m(bArr, i, i2);
        } catch (IOException e) {
            throw HttpDataSource.HttpDataSourceException.createForIOException(e, (DataSpec) Util.castNonNull(this.f35827m), 2);
        }
    }

    @Deprecated
    public void setContentTypePredicate(@Nullable Predicate<String> predicate) {
        this.f35826l = predicate;
    }

    @Override // com.google.android.exoplayer2.upstream.HttpDataSource
    public void setRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        this.f35824j.set(str, str2);
    }

    @Deprecated
    public DefaultHttpDataSource() {
        this(null, 8000, 8000);
    }

    @Deprecated
    public DefaultHttpDataSource(@Nullable String str) {
        this(str, 8000, 8000);
    }

    @Deprecated
    public DefaultHttpDataSource(@Nullable String str, int i, int i2) {
        this(str, i, i2, false, null);
    }

    @Deprecated
    public DefaultHttpDataSource(@Nullable String str, int i, int i2, boolean z, @Nullable HttpDataSource.RequestProperties requestProperties) {
        this(str, i, i2, z, requestProperties, null, false);
    }

    private DefaultHttpDataSource(@Nullable String str, int i, int i2, boolean z, @Nullable HttpDataSource.RequestProperties requestProperties, @Nullable Predicate<String> predicate, boolean z2) {
        super(true);
        this.f35822h = str;
        this.f35820f = i;
        this.f35821g = i2;
        this.f35819e = z;
        this.f35823i = requestProperties;
        this.f35826l = predicate;
        this.f35824j = new HttpDataSource.RequestProperties();
        this.f35825k = z2;
    }
}
