package com.google.android.exoplayer2.upstream.cache;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.FileDataSource;
import com.google.android.exoplayer2.upstream.PlaceholderDataSource;
import com.google.android.exoplayer2.upstream.PriorityDataSource;
import com.google.android.exoplayer2.upstream.TeeDataSource;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.upstream.cache.Cache;
import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class CacheDataSource implements DataSource {
    public static final int CACHE_IGNORED_REASON_ERROR = 0;
    public static final int CACHE_IGNORED_REASON_UNSET_LENGTH = 1;
    public static final int FLAG_BLOCK_ON_CACHE = 1;
    public static final int FLAG_IGNORE_CACHE_FOR_UNSET_LENGTH_REQUESTS = 4;
    public static final int FLAG_IGNORE_CACHE_ON_ERROR = 2;

    /* renamed from: a */
    private final Cache f35937a;

    /* renamed from: b */
    private final DataSource f35938b;
    @Nullable

    /* renamed from: c */
    private final DataSource f35939c;

    /* renamed from: d */
    private final DataSource f35940d;

    /* renamed from: e */
    private final CacheKeyFactory f35941e;
    @Nullable

    /* renamed from: f */
    private final EventListener f35942f;

    /* renamed from: g */
    private final boolean f35943g;

    /* renamed from: h */
    private final boolean f35944h;

    /* renamed from: i */
    private final boolean f35945i;
    @Nullable

    /* renamed from: j */
    private Uri f35946j;
    @Nullable

    /* renamed from: k */
    private DataSpec f35947k;
    @Nullable

    /* renamed from: l */
    private DataSpec f35948l;
    @Nullable

    /* renamed from: m */
    private DataSource f35949m;

    /* renamed from: n */
    private long f35950n;

    /* renamed from: o */
    private long f35951o;

    /* renamed from: p */
    private long f35952p;
    @Nullable

    /* renamed from: q */
    private CacheSpan f35953q;

    /* renamed from: r */
    private boolean f35954r;

    /* renamed from: s */
    private boolean f35955s;

    /* renamed from: t */
    private long f35956t;

    /* renamed from: u */
    private long f35957u;

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface CacheIgnoredReason {
    }

    /* loaded from: classes4.dex */
    public interface EventListener {
        void onCacheIgnored(int i);

        void onCachedBytesRead(long j, long j2);
    }

    /* loaded from: classes4.dex */
    public static final class Factory implements DataSource.Factory {

        /* renamed from: a */
        private Cache f35958a;
        @Nullable

        /* renamed from: c */
        private DataSink.Factory f35960c;

        /* renamed from: e */
        private boolean f35962e;
        @Nullable

        /* renamed from: f */
        private DataSource.Factory f35963f;
        @Nullable

        /* renamed from: g */
        private PriorityTaskManager f35964g;

        /* renamed from: h */
        private int f35965h;

        /* renamed from: i */
        private int f35966i;
        @Nullable

        /* renamed from: j */
        private EventListener f35967j;

        /* renamed from: b */
        private DataSource.Factory f35959b = new FileDataSource.Factory();

        /* renamed from: d */
        private CacheKeyFactory f35961d = CacheKeyFactory.DEFAULT;

        /* renamed from: a */
        private CacheDataSource m72734a(@Nullable DataSource dataSource, int i, int i2) {
            DataSink dataSink;
            Cache cache = (Cache) Assertions.checkNotNull(this.f35958a);
            if (!this.f35962e && dataSource != null) {
                DataSink.Factory factory = this.f35960c;
                if (factory != null) {
                    dataSink = factory.createDataSink();
                } else {
                    dataSink = new CacheDataSink.Factory().setCache(cache).createDataSink();
                }
            } else {
                dataSink = null;
            }
            return new CacheDataSource(cache, dataSource, this.f35959b.createDataSource(), dataSink, this.f35961d, i, this.f35964g, i2, this.f35967j);
        }

        public CacheDataSource createDataSourceForDownloading() {
            DataSource dataSource;
            DataSource.Factory factory = this.f35963f;
            if (factory != null) {
                dataSource = factory.createDataSource();
            } else {
                dataSource = null;
            }
            return m72734a(dataSource, this.f35966i | 1, -1000);
        }

        public CacheDataSource createDataSourceForRemovingDownload() {
            return m72734a(null, this.f35966i | 1, -1000);
        }

        @Nullable
        public Cache getCache() {
            return this.f35958a;
        }

        public CacheKeyFactory getCacheKeyFactory() {
            return this.f35961d;
        }

        @Nullable
        public PriorityTaskManager getUpstreamPriorityTaskManager() {
            return this.f35964g;
        }

        @CanIgnoreReturnValue
        public Factory setCache(Cache cache) {
            this.f35958a = cache;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setCacheKeyFactory(CacheKeyFactory cacheKeyFactory) {
            this.f35961d = cacheKeyFactory;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setCacheReadDataSourceFactory(DataSource.Factory factory) {
            this.f35959b = factory;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setCacheWriteDataSinkFactory(@Nullable DataSink.Factory factory) {
            boolean z;
            this.f35960c = factory;
            if (factory == null) {
                z = true;
            } else {
                z = false;
            }
            this.f35962e = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setEventListener(@Nullable EventListener eventListener) {
            this.f35967j = eventListener;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setFlags(int i) {
            this.f35966i = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setUpstreamDataSourceFactory(@Nullable DataSource.Factory factory) {
            this.f35963f = factory;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setUpstreamPriority(int i) {
            this.f35965h = i;
            return this;
        }

        @CanIgnoreReturnValue
        public Factory setUpstreamPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
            this.f35964g = priorityTaskManager;
            return this;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public CacheDataSource createDataSource() {
            DataSource.Factory factory = this.f35963f;
            return m72734a(factory != null ? factory.createDataSource() : null, this.f35966i, this.f35965h);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface Flags {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.exoplayer2.upstream.cache.CacheSpan, com.google.android.exoplayer2.upstream.DataSpec, com.google.android.exoplayer2.upstream.DataSource] */
    /* renamed from: b */
    private void m72746b() throws IOException {
        DataSource dataSource = this.f35949m;
        if (dataSource == null) {
            return;
        }
        try {
            dataSource.close();
        } finally {
            this.f35948l = null;
            this.f35949m = null;
            CacheSpan cacheSpan = this.f35953q;
            if (cacheSpan != null) {
                this.f35937a.releaseHoleSpan(cacheSpan);
                this.f35953q = null;
            }
        }
    }

    /* renamed from: c */
    private static Uri m72745c(Cache cache, String str, Uri uri) {
        Uri redirectedUri = ContentMetadata.getRedirectedUri(cache.getContentMetadata(str));
        if (redirectedUri != null) {
            return redirectedUri;
        }
        return uri;
    }

    /* renamed from: d */
    private void m72744d(Throwable th) {
        if (m72742f() || (th instanceof Cache.CacheException)) {
            this.f35954r = true;
        }
    }

    /* renamed from: e */
    private boolean m72743e() {
        if (this.f35949m == this.f35940d) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private boolean m72742f() {
        if (this.f35949m == this.f35938b) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private boolean m72741g() {
        return !m72742f();
    }

    /* renamed from: h */
    private boolean m72740h() {
        if (this.f35949m == this.f35939c) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    private void m72739i() {
        EventListener eventListener = this.f35942f;
        if (eventListener != null && this.f35956t > 0) {
            eventListener.onCachedBytesRead(this.f35937a.getCacheSpace(), this.f35956t);
            this.f35956t = 0L;
        }
    }

    /* renamed from: j */
    private void m72738j(int i) {
        EventListener eventListener = this.f35942f;
        if (eventListener != null) {
            eventListener.onCacheIgnored(i);
        }
    }

    /* renamed from: k */
    private void m72737k(DataSpec dataSpec, boolean z) throws IOException {
        CacheSpan startReadWrite;
        long j;
        DataSpec build;
        DataSource dataSource;
        long j2;
        Uri uri;
        String str = (String) Util.castNonNull(dataSpec.key);
        Uri uri2 = null;
        if (this.f35955s) {
            startReadWrite = null;
        } else if (this.f35943g) {
            try {
                startReadWrite = this.f35937a.startReadWrite(str, this.f35951o, this.f35952p);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            startReadWrite = this.f35937a.startReadWriteNonBlocking(str, this.f35951o, this.f35952p);
        }
        if (startReadWrite == null) {
            dataSource = this.f35940d;
            build = dataSpec.buildUpon().setPosition(this.f35951o).setLength(this.f35952p).build();
        } else if (startReadWrite.isCached) {
            Uri fromFile = Uri.fromFile((File) Util.castNonNull(startReadWrite.file));
            long j3 = startReadWrite.position;
            long j4 = this.f35951o - j3;
            long j5 = startReadWrite.length - j4;
            long j6 = this.f35952p;
            if (j6 != -1) {
                j5 = Math.min(j5, j6);
            }
            build = dataSpec.buildUpon().setUri(fromFile).setUriPositionOffset(j3).setPosition(j4).setLength(j5).build();
            dataSource = this.f35938b;
        } else {
            if (startReadWrite.isOpenEnded()) {
                j = this.f35952p;
            } else {
                j = startReadWrite.length;
                long j7 = this.f35952p;
                if (j7 != -1) {
                    j = Math.min(j, j7);
                }
            }
            build = dataSpec.buildUpon().setPosition(this.f35951o).setLength(j).build();
            dataSource = this.f35939c;
            if (dataSource == null) {
                dataSource = this.f35940d;
                this.f35937a.releaseHoleSpan(startReadWrite);
                startReadWrite = null;
            }
        }
        if (!this.f35955s && dataSource == this.f35940d) {
            j2 = this.f35951o + 102400;
        } else {
            j2 = Long.MAX_VALUE;
        }
        this.f35957u = j2;
        if (z) {
            Assertions.checkState(m72743e());
            if (dataSource == this.f35940d) {
                return;
            }
            try {
                m72746b();
            } catch (Throwable th) {
                if (((CacheSpan) Util.castNonNull(startReadWrite)).isHoleSpan()) {
                    this.f35937a.releaseHoleSpan(startReadWrite);
                }
                throw th;
            }
        }
        if (startReadWrite != null && startReadWrite.isHoleSpan()) {
            this.f35953q = startReadWrite;
        }
        this.f35949m = dataSource;
        this.f35948l = build;
        this.f35950n = 0L;
        long open = dataSource.open(build);
        ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
        if (build.length == -1 && open != -1) {
            this.f35952p = open;
            ContentMetadataMutations.setContentLength(contentMetadataMutations, this.f35951o + open);
        }
        if (m72741g()) {
            this.f35946j = dataSource.getUri();
            if (!dataSpec.uri.equals(uri)) {
                uri2 = this.f35946j;
            }
            ContentMetadataMutations.setRedirectedUri(contentMetadataMutations, uri2);
        }
        if (m72740h()) {
            this.f35937a.applyContentMetadataMutations(str, contentMetadataMutations);
        }
    }

    /* renamed from: l */
    private void m72736l(String str) throws IOException {
        this.f35952p = 0L;
        if (m72740h()) {
            ContentMetadataMutations contentMetadataMutations = new ContentMetadataMutations();
            ContentMetadataMutations.setContentLength(contentMetadataMutations, this.f35951o);
            this.f35937a.applyContentMetadataMutations(str, contentMetadataMutations);
        }
    }

    /* renamed from: m */
    private int m72735m(DataSpec dataSpec) {
        if (this.f35944h && this.f35954r) {
            return 0;
        }
        if (this.f35945i && dataSpec.length == -1) {
            return 1;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.f35938b.addTransferListener(transferListener);
        this.f35940d.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.f35947k = null;
        this.f35946j = null;
        this.f35951o = 0L;
        m72739i();
        try {
            m72746b();
        } catch (Throwable th) {
            m72744d(th);
            throw th;
        }
    }

    public Cache getCache() {
        return this.f35937a;
    }

    public CacheKeyFactory getCacheKeyFactory() {
        return this.f35941e;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        if (m72741g()) {
            return this.f35940d.getResponseHeaders();
        }
        return Collections.emptyMap();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.f35946j;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        boolean z;
        try {
            String buildCacheKey = this.f35941e.buildCacheKey(dataSpec);
            DataSpec build = dataSpec.buildUpon().setKey(buildCacheKey).build();
            this.f35947k = build;
            this.f35946j = m72745c(this.f35937a, buildCacheKey, build.uri);
            this.f35951o = dataSpec.position;
            int m72735m = m72735m(dataSpec);
            if (m72735m != -1) {
                z = true;
            } else {
                z = false;
            }
            this.f35955s = z;
            if (z) {
                m72738j(m72735m);
            }
            if (this.f35955s) {
                this.f35952p = -1L;
            } else {
                long contentLength = ContentMetadata.getContentLength(this.f35937a.getContentMetadata(buildCacheKey));
                this.f35952p = contentLength;
                if (contentLength != -1) {
                    long j = contentLength - dataSpec.position;
                    this.f35952p = j;
                    if (j < 0) {
                        throw new DataSourceException(2008);
                    }
                }
            }
            long j2 = dataSpec.length;
            if (j2 != -1) {
                long j3 = this.f35952p;
                if (j3 != -1) {
                    j2 = Math.min(j3, j2);
                }
                this.f35952p = j2;
            }
            long j4 = this.f35952p;
            if (j4 > 0 || j4 == -1) {
                m72737k(build, false);
            }
            long j5 = dataSpec.length;
            if (j5 == -1) {
                return this.f35952p;
            }
            return j5;
        } catch (Throwable th) {
            m72744d(th);
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.f35952p == 0) {
            return -1;
        }
        DataSpec dataSpec = (DataSpec) Assertions.checkNotNull(this.f35947k);
        DataSpec dataSpec2 = (DataSpec) Assertions.checkNotNull(this.f35948l);
        try {
            if (this.f35951o >= this.f35957u) {
                m72737k(dataSpec, true);
            }
            int read = ((DataSource) Assertions.checkNotNull(this.f35949m)).read(bArr, i, i2);
            if (read != -1) {
                if (m72742f()) {
                    this.f35956t += read;
                }
                long j = read;
                this.f35951o += j;
                this.f35950n += j;
                long j2 = this.f35952p;
                if (j2 != -1) {
                    this.f35952p = j2 - j;
                }
            } else {
                if (m72741g()) {
                    long j3 = dataSpec2.length;
                    if (j3 == -1 || this.f35950n < j3) {
                        m72736l((String) Util.castNonNull(dataSpec.key));
                    }
                }
                long j4 = this.f35952p;
                if (j4 <= 0) {
                    if (j4 == -1) {
                    }
                }
                m72746b();
                m72737k(dataSpec, false);
                return read(bArr, i, i2);
            }
            return read;
        } catch (Throwable th) {
            m72744d(th);
            throw th;
        }
    }

    public CacheDataSource(Cache cache, @Nullable DataSource dataSource) {
        this(cache, dataSource, 0);
    }

    public CacheDataSource(Cache cache, @Nullable DataSource dataSource, int i) {
        this(cache, dataSource, new FileDataSource(), new CacheDataSink(cache, 5242880L), i, null);
    }

    public CacheDataSource(Cache cache, @Nullable DataSource dataSource, DataSource dataSource2, @Nullable DataSink dataSink, int i, @Nullable EventListener eventListener) {
        this(cache, dataSource, dataSource2, dataSink, i, eventListener, null);
    }

    public CacheDataSource(Cache cache, @Nullable DataSource dataSource, DataSource dataSource2, @Nullable DataSink dataSink, int i, @Nullable EventListener eventListener, @Nullable CacheKeyFactory cacheKeyFactory) {
        this(cache, dataSource, dataSource2, dataSink, cacheKeyFactory, i, null, 0, eventListener);
    }

    private CacheDataSource(Cache cache, @Nullable DataSource dataSource, DataSource dataSource2, @Nullable DataSink dataSink, @Nullable CacheKeyFactory cacheKeyFactory, int i, @Nullable PriorityTaskManager priorityTaskManager, int i2, @Nullable EventListener eventListener) {
        this.f35937a = cache;
        this.f35938b = dataSource2;
        this.f35941e = cacheKeyFactory == null ? CacheKeyFactory.DEFAULT : cacheKeyFactory;
        this.f35943g = (i & 1) != 0;
        this.f35944h = (i & 2) != 0;
        this.f35945i = (i & 4) != 0;
        if (dataSource != null) {
            dataSource = priorityTaskManager != null ? new PriorityDataSource(dataSource, priorityTaskManager, i2) : dataSource;
            this.f35940d = dataSource;
            this.f35939c = dataSink != null ? new TeeDataSource(dataSource, dataSink) : null;
        } else {
            this.f35940d = PlaceholderDataSource.INSTANCE;
            this.f35939c = null;
        }
        this.f35942f = eventListener;
    }
}
