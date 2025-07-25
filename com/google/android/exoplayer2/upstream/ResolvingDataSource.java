package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ResolvingDataSource implements DataSource {

    /* renamed from: a */
    private final DataSource f35888a;

    /* renamed from: b */
    private final Resolver f35889b;

    /* renamed from: c */
    private boolean f35890c;

    /* loaded from: classes4.dex */
    public static final class Factory implements DataSource.Factory {

        /* renamed from: a */
        private final DataSource.Factory f35891a;

        /* renamed from: b */
        private final Resolver f35892b;

        public Factory(DataSource.Factory factory, Resolver resolver) {
            this.f35891a = factory;
            this.f35892b = resolver;
        }

        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        public ResolvingDataSource createDataSource() {
            return new ResolvingDataSource(this.f35891a.createDataSource(), this.f35892b);
        }
    }

    public ResolvingDataSource(DataSource dataSource, Resolver resolver) {
        this.f35888a = dataSource;
        this.f35889b = resolver;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.f35888a.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        if (this.f35890c) {
            this.f35890c = false;
            this.f35888a.close();
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.f35888a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        Uri uri = this.f35888a.getUri();
        if (uri == null) {
            return null;
        }
        return this.f35889b.resolveReportedUri(uri);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        DataSpec resolveDataSpec = this.f35889b.resolveDataSpec(dataSpec);
        this.f35890c = true;
        return this.f35888a.open(resolveDataSpec);
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f35888a.read(bArr, i, i2);
    }

    /* loaded from: classes4.dex */
    public interface Resolver {
        DataSpec resolveDataSpec(DataSpec dataSpec) throws IOException;

        default Uri resolveReportedUri(Uri uri) {
            return uri;
        }
    }
}
