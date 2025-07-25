package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ParsingLoadable<T> implements Loader.Loadable {

    /* renamed from: a */
    private final StatsDataSource f35869a;

    /* renamed from: b */
    private final Parser<? extends T> f35870b;
    @Nullable

    /* renamed from: c */
    private volatile T f35871c;
    public final DataSpec dataSpec;
    public final long loadTaskId;
    public final int type;

    /* loaded from: classes4.dex */
    public interface Parser<T> {
        T parse(Uri uri, InputStream inputStream) throws IOException;
    }

    public ParsingLoadable(DataSource dataSource, Uri uri, int i, Parser<? extends T> parser) {
        this(dataSource, new DataSpec.Builder().setUri(uri).setFlags(1).build(), i, parser);
    }

    public static <T> T load(DataSource dataSource, Parser<? extends T> parser, Uri uri, int i) throws IOException {
        ParsingLoadable parsingLoadable = new ParsingLoadable(dataSource, uri, i, parser);
        parsingLoadable.load();
        return (T) Assertions.checkNotNull(parsingLoadable.getResult());
    }

    public long bytesLoaded() {
        return this.f35869a.getBytesRead();
    }

    public Map<String, List<String>> getResponseHeaders() {
        return this.f35869a.getLastResponseHeaders();
    }

    @Nullable
    public final T getResult() {
        return this.f35871c;
    }

    public Uri getUri() {
        return this.f35869a.getLastOpenedUri();
    }

    public ParsingLoadable(DataSource dataSource, DataSpec dataSpec, int i, Parser<? extends T> parser) {
        this.f35869a = new StatsDataSource(dataSource);
        this.dataSpec = dataSpec;
        this.type = i;
        this.f35870b = parser;
        this.loadTaskId = LoadEventInfo.getNewId();
    }

    public static <T> T load(DataSource dataSource, Parser<? extends T> parser, DataSpec dataSpec, int i) throws IOException {
        ParsingLoadable parsingLoadable = new ParsingLoadable(dataSource, dataSpec, i, parser);
        parsingLoadable.load();
        return (T) Assertions.checkNotNull(parsingLoadable.getResult());
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void load() throws IOException {
        this.f35869a.resetBytesRead();
        DataSourceInputStream dataSourceInputStream = new DataSourceInputStream(this.f35869a, this.dataSpec);
        try {
            dataSourceInputStream.open();
            this.f35871c = this.f35870b.parse((Uri) Assertions.checkNotNull(this.f35869a.getUri()), dataSourceInputStream);
        } finally {
            Util.closeQuietly(dataSourceInputStream);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.Loadable
    public final void cancelLoad() {
    }
}
