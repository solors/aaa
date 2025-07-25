package io.bidmachine.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.common.base.Predicate;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.datasource.DefaultHttpDataSource;
import io.bidmachine.media3.datasource.HttpDataSource;
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

/* loaded from: classes9.dex */
public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {
    @UnstableApi
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    @UnstableApi
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final int HTTP_STATUS_PERMANENT_REDIRECT = 308;
    private static final int HTTP_STATUS_TEMPORARY_REDIRECT = 307;
    private static final long MAX_BYTES_TO_DRAIN = 2048;
    private static final int MAX_REDIRECTS = 20;
    private static final String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesToRead;
    private final int connectTimeoutMillis;
    @Nullable
    private HttpURLConnection connection;
    @Nullable
    private Predicate<String> contentTypePredicate;
    @Nullable
    private DataSpec dataSpec;
    @Nullable
    private final HttpDataSource.RequestProperties defaultRequestProperties;
    @Nullable
    private InputStream inputStream;
    private final boolean keepPostFor302Redirects;
    private boolean opened;
    private final int readTimeoutMillis;
    private final HttpDataSource.RequestProperties requestProperties;
    private int responseCode;
    @Nullable
    private final String userAgent;

    /* loaded from: classes9.dex */
    public static final class Factory implements HttpDataSource.Factory {
        private boolean allowCrossProtocolRedirects;
        @Nullable
        private Predicate<String> contentTypePredicate;
        private boolean keepPostFor302Redirects;
        @Nullable
        private TransferListener transferListener;
        @Nullable
        private String userAgent;
        private final HttpDataSource.RequestProperties defaultRequestProperties = new HttpDataSource.RequestProperties();
        private int connectTimeoutMs = 8000;
        private int readTimeoutMs = 8000;

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setAllowCrossProtocolRedirects(boolean z) {
            this.allowCrossProtocolRedirects = z;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setConnectTimeoutMs(int i) {
            this.connectTimeoutMs = i;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setContentTypePredicate(@Nullable Predicate<String> predicate) {
            this.contentTypePredicate = predicate;
            return this;
        }

        @Override // io.bidmachine.media3.datasource.HttpDataSource.Factory
        @CanIgnoreReturnValue
        @UnstableApi
        public /* bridge */ /* synthetic */ HttpDataSource.Factory setDefaultRequestProperties(Map map) {
            return setDefaultRequestProperties((Map<String, String>) map);
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setKeepPostFor302Redirects(boolean z) {
            this.keepPostFor302Redirects = z;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setReadTimeoutMs(int i) {
            this.readTimeoutMs = i;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setTransferListener(@Nullable TransferListener transferListener) {
            this.transferListener = transferListener;
            return this;
        }

        @CanIgnoreReturnValue
        @UnstableApi
        public Factory setUserAgent(@Nullable String str) {
            this.userAgent = str;
            return this;
        }

        @Override // io.bidmachine.media3.datasource.HttpDataSource.Factory
        @CanIgnoreReturnValue
        @UnstableApi
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        @Override // io.bidmachine.media3.datasource.HttpDataSource.Factory, io.bidmachine.media3.datasource.DataSource.Factory
        @UnstableApi
        public DefaultHttpDataSource createDataSource() {
            DefaultHttpDataSource defaultHttpDataSource = new DefaultHttpDataSource(this.userAgent, this.connectTimeoutMs, this.readTimeoutMs, this.allowCrossProtocolRedirects, this.defaultRequestProperties, this.contentTypePredicate, this.keepPostFor302Redirects);
            TransferListener transferListener = this.transferListener;
            if (transferListener != null) {
                defaultHttpDataSource.addTransferListener(transferListener);
            }
            return defaultHttpDataSource;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.media3.datasource.DefaultHttpDataSource$b */
    /* loaded from: classes9.dex */
    public static class C35949b extends ForwardingMap<String, List<String>> {
        private final Map<String, List<String>> headers;

        public C35949b(Map<String, List<String>> map) {
            this.headers = map;
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
            return Sets.filter(super.entrySet(), new Predicate() { // from class: io.bidmachine.media3.datasource.e
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    boolean lambda$entrySet$1;
                    lambda$entrySet$1 = DefaultHttpDataSource.C35949b.lambda$entrySet$1((Map.Entry) obj);
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
            return Sets.filter(super.keySet(), new Predicate() { // from class: io.bidmachine.media3.datasource.d
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    boolean lambda$keySet$0;
                    lambda$keySet$0 = DefaultHttpDataSource.C35949b.lambda$keySet$0((String) obj);
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
            return this.headers;
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

    private void closeConnectionQuietly() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                Log.m19948e(TAG, "Unexpected error while disconnecting", e);
            }
            this.connection = null;
        }
    }

    private URL handleRedirect(URL url, @Nullable String str, DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new HttpDataSource.HttpDataSourceException("Unsupported protocol redirect: " + protocol, dataSpec, 2001, 1);
                } else if (!this.allowCrossProtocolRedirects && !protocol.equals(url.getProtocol())) {
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

    private static boolean isCompressed(HttpURLConnection httpURLConnection) {
        return "gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"));
    }

    private HttpURLConnection makeConnection(DataSpec dataSpec) throws IOException {
        HttpURLConnection makeConnection;
        URL url = new URL(dataSpec.uri.toString());
        int i = dataSpec.httpMethod;
        byte[] bArr = dataSpec.httpBody;
        long j = dataSpec.position;
        long j2 = dataSpec.length;
        boolean isFlagSet = dataSpec.isFlagSet(1);
        if (this.allowCrossProtocolRedirects || this.keepPostFor302Redirects) {
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
                    makeConnection = makeConnection(url2, i2, bArr2, j3, j2, isFlagSet, false, dataSpec.httpRequestHeaders);
                    int responseCode = makeConnection.getResponseCode();
                    String headerField = makeConnection.getHeaderField("Location");
                    if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                        makeConnection.disconnect();
                        url2 = handleRedirect(url3, headerField, dataSpec);
                        i2 = i5;
                    } else if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                        break;
                    } else {
                        makeConnection.disconnect();
                        if (this.keepPostFor302Redirects && responseCode == 302) {
                            i2 = i5;
                        } else {
                            bArr2 = null;
                            i2 = 1;
                        }
                        url2 = handleRedirect(url3, headerField, dataSpec);
                    }
                    i3 = i4;
                    j = j4;
                    j2 = j5;
                } else {
                    throw new HttpDataSource.HttpDataSourceException(new NoRouteToHostException("Too many redirects: " + i4), dataSpec, 2001, 1);
                }
            }
            return makeConnection;
        }
        return makeConnection(url, i, bArr, j, j2, isFlagSet, true, dataSpec.httpRequestHeaders);
    }

    private static void maybeTerminateInputStream(@Nullable HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection != null && (i = Util.SDK_INT) >= 19 && i <= 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= MAX_BYTES_TO_DRAIN) {
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

    private int readInternal(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesToRead;
        if (j != -1) {
            long j2 = j - this.bytesRead;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        this.bytesRead += read;
        bytesTransferred(read);
        return read;
    }

    private void skipFully(long j, DataSpec dataSpec) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int read = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, 0, (int) Math.min(j, 4096));
            if (!Thread.currentThread().isInterrupted()) {
                if (read != -1) {
                    j -= read;
                    bytesTransferred(read);
                } else {
                    throw new HttpDataSource.HttpDataSourceException(dataSpec, 2008, 1);
                }
            } else {
                throw new HttpDataSource.HttpDataSourceException(new InterruptedIOException(), dataSpec, 2000, 1);
            }
        }
    }

    @Override // io.bidmachine.media3.datasource.HttpDataSource
    @UnstableApi
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // io.bidmachine.media3.datasource.HttpDataSource
    @UnstableApi
    public void clearRequestProperty(String str) {
        Assertions.checkNotNull(str);
        this.requestProperties.remove(str);
    }

    @Override // io.bidmachine.media3.datasource.BaseDataSource, io.bidmachine.media3.datasource.DataSource
    @UnstableApi
    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                long j = this.bytesToRead;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.bytesRead;
                }
                maybeTerminateInputStream(this.connection, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new HttpDataSource.HttpDataSourceException(e, (DataSpec) Util.castNonNull(this.dataSpec), 2000, 3);
                }
            }
        } finally {
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.opened) {
                this.opened = false;
                transferEnded();
            }
        }
    }

    @Override // io.bidmachine.media3.datasource.HttpDataSource
    @UnstableApi
    public int getResponseCode() {
        int i;
        if (this.connection == null || (i = this.responseCode) <= 0) {
            return -1;
        }
        return i;
    }

    @Override // io.bidmachine.media3.datasource.BaseDataSource, io.bidmachine.media3.datasource.DataSource
    @UnstableApi
    public Map<String, List<String>> getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection == null) {
            return ImmutableMap.m69397of();
        }
        return new C35949b(httpURLConnection.getHeaderFields());
    }

    @Override // io.bidmachine.media3.datasource.BaseDataSource, io.bidmachine.media3.datasource.DataSource
    @Nullable
    @UnstableApi
    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // io.bidmachine.media3.datasource.BaseDataSource, io.bidmachine.media3.datasource.DataSource
    @UnstableApi
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        byte[] bArr;
        DataSourceException dataSourceException;
        this.dataSpec = dataSpec;
        long j = 0;
        this.bytesRead = 0L;
        this.bytesToRead = 0L;
        transferInitializing(dataSpec);
        try {
            HttpURLConnection makeConnection = makeConnection(dataSpec);
            this.connection = makeConnection;
            this.responseCode = makeConnection.getResponseCode();
            String responseMessage = makeConnection.getResponseMessage();
            int i = this.responseCode;
            long j2 = -1;
            if (i >= 200 && i <= 299) {
                String contentType = makeConnection.getContentType();
                Predicate<String> predicate = this.contentTypePredicate;
                if (predicate != null && !predicate.apply(contentType)) {
                    closeConnectionQuietly();
                    throw new HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
                }
                if (this.responseCode == 200) {
                    long j3 = dataSpec.position;
                    if (j3 != 0) {
                        j = j3;
                    }
                }
                boolean isCompressed = isCompressed(makeConnection);
                if (!isCompressed) {
                    long j4 = dataSpec.length;
                    if (j4 != -1) {
                        this.bytesToRead = j4;
                    } else {
                        long contentLength = HttpUtil.getContentLength(makeConnection.getHeaderField("Content-Length"), makeConnection.getHeaderField("Content-Range"));
                        if (contentLength != -1) {
                            j2 = contentLength - j;
                        }
                        this.bytesToRead = j2;
                    }
                } else {
                    this.bytesToRead = dataSpec.length;
                }
                try {
                    this.inputStream = makeConnection.getInputStream();
                    if (isCompressed) {
                        this.inputStream = new GZIPInputStream(this.inputStream);
                    }
                    this.opened = true;
                    transferStarted(dataSpec);
                    try {
                        skipFully(j, dataSpec);
                        return this.bytesToRead;
                    } catch (IOException e) {
                        closeConnectionQuietly();
                        if (e instanceof HttpDataSource.HttpDataSourceException) {
                            throw ((HttpDataSource.HttpDataSourceException) e);
                        }
                        throw new HttpDataSource.HttpDataSourceException(e, dataSpec, 2000, 1);
                    }
                } catch (IOException e2) {
                    closeConnectionQuietly();
                    throw new HttpDataSource.HttpDataSourceException(e2, dataSpec, 2000, 1);
                }
            }
            Map<String, List<String>> headerFields = makeConnection.getHeaderFields();
            if (this.responseCode == 416) {
                if (dataSpec.position == HttpUtil.getDocumentSize(makeConnection.getHeaderField("Content-Range"))) {
                    this.opened = true;
                    transferStarted(dataSpec);
                    long j5 = dataSpec.length;
                    if (j5 == -1) {
                        return 0L;
                    }
                    return j5;
                }
            }
            InputStream errorStream = makeConnection.getErrorStream();
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
            closeConnectionQuietly();
            if (this.responseCode == 416) {
                dataSourceException = new DataSourceException(2008);
            } else {
                dataSourceException = null;
            }
            throw new HttpDataSource.InvalidResponseCodeException(this.responseCode, responseMessage, dataSourceException, headerFields, dataSpec, bArr2);
        } catch (IOException e3) {
            closeConnectionQuietly();
            throw HttpDataSource.HttpDataSourceException.createForIOException(e3, dataSpec, 1);
        }
    }

    @VisibleForTesting
    HttpURLConnection openConnection(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    @Override // io.bidmachine.media3.datasource.BaseDataSource, io.bidmachine.media3.datasource.DataSource, io.bidmachine.media3.common.DataReader
    @UnstableApi
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource.HttpDataSourceException {
        try {
            return readInternal(bArr, i, i2);
        } catch (IOException e) {
            throw HttpDataSource.HttpDataSourceException.createForIOException(e, (DataSpec) Util.castNonNull(this.dataSpec), 2);
        }
    }

    @UnstableApi
    @Deprecated
    public void setContentTypePredicate(@Nullable Predicate<String> predicate) {
        this.contentTypePredicate = predicate;
    }

    @Override // io.bidmachine.media3.datasource.HttpDataSource
    @UnstableApi
    public void setRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        this.requestProperties.set(str, str2);
    }

    @UnstableApi
    @Deprecated
    public DefaultHttpDataSource() {
        this(null, 8000, 8000);
    }

    @UnstableApi
    @Deprecated
    public DefaultHttpDataSource(@Nullable String str) {
        this(str, 8000, 8000);
    }

    @UnstableApi
    @Deprecated
    public DefaultHttpDataSource(@Nullable String str, int i, int i2) {
        this(str, i, i2, false, null);
    }

    @UnstableApi
    @Deprecated
    public DefaultHttpDataSource(@Nullable String str, int i, int i2, boolean z, @Nullable HttpDataSource.RequestProperties requestProperties) {
        this(str, i, i2, z, requestProperties, null, false);
    }

    private DefaultHttpDataSource(@Nullable String str, int i, int i2, boolean z, @Nullable HttpDataSource.RequestProperties requestProperties, @Nullable Predicate<String> predicate, boolean z2) {
        super(true);
        this.userAgent = str;
        this.connectTimeoutMillis = i;
        this.readTimeoutMillis = i2;
        this.allowCrossProtocolRedirects = z;
        this.defaultRequestProperties = requestProperties;
        this.contentTypePredicate = predicate;
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.keepPostFor302Redirects = z2;
    }

    private HttpURLConnection makeConnection(URL url, int i, @Nullable byte[] bArr, long j, long j2, boolean z, boolean z2, Map<String, String> map) throws IOException {
        HttpURLConnection openConnection = openConnection(url);
        openConnection.setConnectTimeout(this.connectTimeoutMillis);
        openConnection.setReadTimeout(this.readTimeoutMillis);
        HashMap hashMap = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            hashMap.putAll(requestProperties.getSnapshot());
        }
        hashMap.putAll(this.requestProperties.getSnapshot());
        hashMap.putAll(map);
        for (Map.Entry entry : hashMap.entrySet()) {
            openConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String buildRangeRequestHeader = HttpUtil.buildRangeRequestHeader(j, j2);
        if (buildRangeRequestHeader != null) {
            openConnection.setRequestProperty("Range", buildRangeRequestHeader);
        }
        String str = this.userAgent;
        if (str != null) {
            openConnection.setRequestProperty("User-Agent", str);
        }
        openConnection.setRequestProperty("Accept-Encoding", z ? "gzip" : "identity");
        openConnection.setInstanceFollowRedirects(z2);
        openConnection.setDoOutput(bArr != null);
        openConnection.setRequestMethod(DataSpec.getStringForHttpMethod(i));
        if (bArr != null) {
            openConnection.setFixedLengthStreamingMode(bArr.length);
            openConnection.connect();
            OutputStream outputStream = openConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            openConnection.connect();
        }
        return openConnection;
    }
}
