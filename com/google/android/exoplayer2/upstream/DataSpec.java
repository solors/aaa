package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.util.Assertions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C21114v8;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class DataSpec {
    public static final int FLAG_ALLOW_CACHE_FRAGMENTATION = 4;
    public static final int FLAG_ALLOW_GZIP = 1;
    public static final int FLAG_DONT_CACHE_IF_LENGTH_UNKNOWN = 2;
    public static final int FLAG_MIGHT_NOT_USE_FULL_NETWORK_SPEED = 8;
    public static final int HTTP_METHOD_GET = 1;
    public static final int HTTP_METHOD_HEAD = 3;
    public static final int HTTP_METHOD_POST = 2;
    @Deprecated
    public final long absoluteStreamPosition;
    @Nullable
    public final Object customData;
    public final int flags;
    @Nullable
    public final byte[] httpBody;
    public final int httpMethod;
    public final Map<String, String> httpRequestHeaders;
    @Nullable
    public final String key;
    public final long length;
    public final long position;
    public final Uri uri;
    public final long uriPositionOffset;

    /* loaded from: classes4.dex */
    public static final class Builder {
        @Nullable

        /* renamed from: a */
        private Uri f35764a;

        /* renamed from: b */
        private long f35765b;

        /* renamed from: c */
        private int f35766c;
        @Nullable

        /* renamed from: d */
        private byte[] f35767d;

        /* renamed from: e */
        private Map<String, String> f35768e;

        /* renamed from: f */
        private long f35769f;

        /* renamed from: g */
        private long f35770g;
        @Nullable

        /* renamed from: h */
        private String f35771h;

        /* renamed from: i */
        private int f35772i;
        @Nullable

        /* renamed from: j */
        private Object f35773j;

        public DataSpec build() {
            Assertions.checkStateNotNull(this.f35764a, "The uri must be set.");
            return new DataSpec(this.f35764a, this.f35765b, this.f35766c, this.f35767d, this.f35768e, this.f35769f, this.f35770g, this.f35771h, this.f35772i, this.f35773j);
        }

        @CanIgnoreReturnValue
        public Builder setCustomData(@Nullable Object obj) {
            this.f35773j = obj;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setFlags(int i) {
            this.f35772i = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpBody(@Nullable byte[] bArr) {
            this.f35767d = bArr;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpMethod(int i) {
            this.f35766c = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setHttpRequestHeaders(Map<String, String> map) {
            this.f35768e = map;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setKey(@Nullable String str) {
            this.f35771h = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setLength(long j) {
            this.f35770g = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setPosition(long j) {
            this.f35769f = j;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUri(String str) {
            this.f35764a = Uri.parse(str);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setUriPositionOffset(long j) {
            this.f35765b = j;
            return this;
        }

        public Builder() {
            this.f35766c = 1;
            this.f35768e = Collections.emptyMap();
            this.f35770g = -1L;
        }

        @CanIgnoreReturnValue
        public Builder setUri(Uri uri) {
            this.f35764a = uri;
            return this;
        }

        private Builder(DataSpec dataSpec) {
            this.f35764a = dataSpec.uri;
            this.f35765b = dataSpec.uriPositionOffset;
            this.f35766c = dataSpec.httpMethod;
            this.f35767d = dataSpec.httpBody;
            this.f35768e = dataSpec.httpRequestHeaders;
            this.f35769f = dataSpec.position;
            this.f35770g = dataSpec.length;
            this.f35771h = dataSpec.key;
            this.f35772i = dataSpec.flags;
            this.f35773j = dataSpec.customData;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Flags {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface HttpMethod {
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.datasource");
    }

    public static String getStringForHttpMethod(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return "HEAD";
                }
                throw new IllegalStateException();
            }
            return "POST";
        }
        return "GET";
    }

    public Builder buildUpon() {
        return new Builder();
    }

    public final String getHttpMethodString() {
        return getStringForHttpMethod(this.httpMethod);
    }

    public boolean isFlagSet(int i) {
        if ((this.flags & i) == i) {
            return true;
        }
        return false;
    }

    public DataSpec subrange(long j) {
        long j2 = this.length;
        return subrange(j, j2 != -1 ? j2 - j : -1L);
    }

    public String toString() {
        return "DataSpec[" + getHttpMethodString() + " " + this.uri + ", " + this.position + ", " + this.length + ", " + this.key + ", " + this.flags + C21114v8.C21123i.f54139e;
    }

    public DataSpec withAdditionalHeaders(Map<String, String> map) {
        HashMap hashMap = new HashMap(this.httpRequestHeaders);
        hashMap.putAll(map);
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, hashMap, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withRequestHeaders(Map<String, String> map) {
        return new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, map, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec withUri(Uri uri) {
        return new DataSpec(uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position, this.length, this.key, this.flags, this.customData);
    }

    public DataSpec(Uri uri) {
        this(uri, 0L, -1L);
    }

    public DataSpec subrange(long j, long j2) {
        return (j == 0 && this.length == j2) ? this : new DataSpec(this.uri, this.uriPositionOffset, this.httpMethod, this.httpBody, this.httpRequestHeaders, this.position + j, j2, this.key, this.flags, this.customData);
    }

    public DataSpec(Uri uri, long j, long j2) {
        this(uri, 0L, 1, null, Collections.emptyMap(), j, j2, null, 0, null);
    }

    @Deprecated
    public DataSpec(Uri uri, int i) {
        this(uri, 0L, -1L, null, i);
    }

    @Deprecated
    public DataSpec(Uri uri, long j, long j2, @Nullable String str) {
        this(uri, j, j, j2, str, 0);
    }

    @Deprecated
    public DataSpec(Uri uri, long j, long j2, @Nullable String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    @Deprecated
    public DataSpec(Uri uri, long j, long j2, @Nullable String str, int i, Map<String, String> map) {
        this(uri, 1, null, j, j, j2, str, i, map);
    }

    @Deprecated
    public DataSpec(Uri uri, long j, long j2, long j3, @Nullable String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    @Deprecated
    public DataSpec(Uri uri, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i) {
        this(uri, bArr != null ? 2 : 1, bArr, j, j2, j3, str, i);
    }

    @Deprecated
    public DataSpec(Uri uri, int i, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i2) {
        this(uri, i, bArr, j, j2, j3, str, i2, Collections.emptyMap());
    }

    @Deprecated
    public DataSpec(Uri uri, int i, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i2, Map<String, String> map) {
        this(uri, j - j2, i, bArr, map, j2, j3, str, i2, null);
    }

    private DataSpec(Uri uri, long j, int i, @Nullable byte[] bArr, Map<String, String> map, long j2, long j3, @Nullable String str, int i2, @Nullable Object obj) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = true;
        Assertions.checkArgument(j4 >= 0);
        Assertions.checkArgument(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        Assertions.checkArgument(z);
        this.uri = uri;
        this.uriPositionOffset = j;
        this.httpMethod = i;
        this.httpBody = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.httpRequestHeaders = Collections.unmodifiableMap(new HashMap(map));
        this.position = j2;
        this.absoluteStreamPosition = j4;
        this.length = j3;
        this.key = str;
        this.flags = i2;
        this.customData = obj;
    }
}
