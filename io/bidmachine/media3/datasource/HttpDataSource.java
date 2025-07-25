package io.bidmachine.media3.datasource;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSource;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public interface HttpDataSource extends DataSource {
    @UnstableApi
    public static final Predicate<String> REJECT_PAYWALL_TYPES = new Predicate() { // from class: io.bidmachine.media3.datasource.f
        @Override // com.google.common.base.Predicate
        public final boolean apply(Object obj) {
            return HttpDataSource.m19928a((String) obj);
        }
    };

    @UnstableApi
    /* loaded from: classes9.dex */
    public static abstract class BaseFactory implements Factory {
        private final RequestProperties defaultRequestProperties = new RequestProperties();

        protected abstract HttpDataSource createDataSourceInternal(RequestProperties requestProperties);

        @Override // io.bidmachine.media3.datasource.HttpDataSource.Factory
        @CanIgnoreReturnValue
        public final Factory setDefaultRequestProperties(Map<String, String> map) {
            this.defaultRequestProperties.clearAndSet(map);
            return this;
        }

        @Override // io.bidmachine.media3.datasource.HttpDataSource.Factory, io.bidmachine.media3.datasource.DataSource.Factory
        public final HttpDataSource createDataSource() {
            return createDataSourceInternal(this.defaultRequestProperties);
        }
    }

    /* loaded from: classes9.dex */
    public static final class CleartextNotPermittedException extends HttpDataSourceException {
        @UnstableApi
        public CleartextNotPermittedException(IOException iOException, DataSpec dataSpec) {
            super("Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted", iOException, dataSpec, 2007, 1);
        }
    }

    /* loaded from: classes9.dex */
    public interface Factory extends DataSource.Factory {
        @Override // io.bidmachine.media3.datasource.DataSource.Factory
        @UnstableApi
        HttpDataSource createDataSource();

        @UnstableApi
        Factory setDefaultRequestProperties(Map<String, String> map);
    }

    /* loaded from: classes9.dex */
    public static class HttpDataSourceException extends DataSourceException {
        public static final int TYPE_CLOSE = 3;
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_READ = 2;
        @UnstableApi
        public final DataSpec dataSpec;
        public final int type;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes9.dex */
        public @interface Type {
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(DataSpec dataSpec, int i) {
            this(dataSpec, 2000, i);
        }

        private static int assignErrorCode(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        @UnstableApi
        public static HttpDataSourceException createForIOException(IOException iOException, DataSpec dataSpec, int i) {
            int i2;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i2 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i2 = 1004;
            } else if (message != null && Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) {
                i2 = 2007;
            } else {
                i2 = 2001;
            }
            if (i2 == 2007) {
                return new CleartextNotPermittedException(iOException, dataSpec);
            }
            return new HttpDataSourceException(iOException, dataSpec, i2, i);
        }

        @UnstableApi
        public HttpDataSourceException(DataSpec dataSpec, int i, int i2) {
            super(assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(String str, DataSpec dataSpec, int i) {
            this(str, dataSpec, 2000, i);
        }

        @UnstableApi
        public HttpDataSourceException(String str, DataSpec dataSpec, int i, int i2) {
            super(str, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i) {
            this(iOException, dataSpec, 2000, i);
        }

        @UnstableApi
        public HttpDataSourceException(IOException iOException, DataSpec dataSpec, int i, int i2) {
            super(iOException, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }

        @UnstableApi
        @Deprecated
        public HttpDataSourceException(String str, IOException iOException, DataSpec dataSpec, int i) {
            this(str, iOException, dataSpec, 2000, i);
        }

        @UnstableApi
        public HttpDataSourceException(String str, @Nullable IOException iOException, DataSpec dataSpec, int i, int i2) {
            super(str, iOException, assignErrorCode(i, i2));
            this.dataSpec = dataSpec;
            this.type = i2;
        }
    }

    /* loaded from: classes9.dex */
    public static final class InvalidContentTypeException extends HttpDataSourceException {
        public final String contentType;

        @UnstableApi
        public InvalidContentTypeException(String str, DataSpec dataSpec) {
            super("Invalid content type: " + str, dataSpec, 2003, 1);
            this.contentType = str;
        }
    }

    /* loaded from: classes9.dex */
    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        @UnstableApi
        public final Map<String, List<String>> headerFields;
        public final byte[] responseBody;
        public final int responseCode;
        @Nullable
        public final String responseMessage;

        @UnstableApi
        public InvalidResponseCodeException(int i, @Nullable String str, @Nullable IOException iOException, Map<String, List<String>> map, DataSpec dataSpec, byte[] bArr) {
            super("Response code: " + i, iOException, dataSpec, 2004, 1);
            this.responseCode = i;
            this.responseMessage = str;
            this.headerFields = map;
            this.responseBody = bArr;
        }
    }

    /* renamed from: a */
    static /* synthetic */ boolean m19928a(String str) {
        return lambda$static$0(str);
    }

    static /* synthetic */ boolean lambda$static$0(String str) {
        if (str == null) {
            return false;
        }
        String lowerCase = Ascii.toLowerCase(str);
        if (TextUtils.isEmpty(lowerCase)) {
            return false;
        }
        if ((lowerCase.contains("text") && !lowerCase.contains("text/vtt")) || lowerCase.contains("html") || lowerCase.contains("xml")) {
            return false;
        }
        return true;
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    @UnstableApi
    /* synthetic */ void addTransferListener(TransferListener transferListener);

    @UnstableApi
    void clearAllRequestProperties();

    @UnstableApi
    void clearRequestProperty(String str);

    @Override // io.bidmachine.media3.datasource.DataSource
    @UnstableApi
    void close() throws HttpDataSourceException;

    @UnstableApi
    int getResponseCode();

    @Override // io.bidmachine.media3.datasource.DataSource
    @UnstableApi
    Map<String, List<String>> getResponseHeaders();

    @Override // io.bidmachine.media3.datasource.DataSource
    @Nullable
    @UnstableApi
    /* synthetic */ Uri getUri();

    @Override // io.bidmachine.media3.datasource.DataSource
    @UnstableApi
    long open(DataSpec dataSpec) throws HttpDataSourceException;

    @Override // io.bidmachine.media3.datasource.DataSource, io.bidmachine.media3.common.DataReader
    @UnstableApi
    int read(byte[] bArr, int i, int i2) throws HttpDataSourceException;

    @UnstableApi
    void setRequestProperty(String str, String str2);

    @UnstableApi
    /* loaded from: classes9.dex */
    public static final class RequestProperties {
        private final Map<String, String> requestProperties = new HashMap();
        @Nullable
        private Map<String, String> requestPropertiesSnapshot;

        public synchronized void clear() {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
        }

        public synchronized void clearAndSet(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.clear();
            this.requestProperties.putAll(map);
        }

        public synchronized Map<String, String> getSnapshot() {
            if (this.requestPropertiesSnapshot == null) {
                this.requestPropertiesSnapshot = Collections.unmodifiableMap(new HashMap(this.requestProperties));
            }
            return this.requestPropertiesSnapshot;
        }

        public synchronized void remove(String str) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.remove(str);
        }

        public synchronized void set(String str, String str2) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.put(str, str2);
        }

        public synchronized void set(Map<String, String> map) {
            this.requestPropertiesSnapshot = null;
            this.requestProperties.putAll(map);
        }
    }
}
