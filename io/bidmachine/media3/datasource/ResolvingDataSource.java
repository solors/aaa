package io.bidmachine.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSource;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@UnstableApi
/* loaded from: classes9.dex */
public final class ResolvingDataSource implements DataSource {
    private final Resolver resolver;
    private final DataSource upstreamDataSource;
    private boolean upstreamOpened;

    /* loaded from: classes9.dex */
    public static final class Factory implements DataSource.Factory {
        private final Resolver resolver;
        private final DataSource.Factory upstreamFactory;

        public Factory(DataSource.Factory factory, Resolver resolver) {
            this.upstreamFactory = factory;
            this.resolver = resolver;
        }

        @Override // io.bidmachine.media3.datasource.DataSource.Factory
        public ResolvingDataSource createDataSource() {
            return new ResolvingDataSource(this.upstreamFactory.createDataSource(), this.resolver);
        }
    }

    public ResolvingDataSource(DataSource dataSource, Resolver resolver) {
        this.upstreamDataSource = dataSource;
        this.resolver = resolver;
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.upstreamDataSource.addTransferListener(transferListener);
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public void close() throws IOException {
        if (this.upstreamOpened) {
            this.upstreamOpened = false;
            this.upstreamDataSource.close();
        }
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.upstreamDataSource.getResponseHeaders();
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        Uri uri = this.upstreamDataSource.getUri();
        if (uri == null) {
            return null;
        }
        return this.resolver.resolveReportedUri(uri);
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        DataSpec resolveDataSpec = this.resolver.resolveDataSpec(dataSpec);
        this.upstreamOpened = true;
        return this.upstreamDataSource.open(resolveDataSpec);
    }

    @Override // io.bidmachine.media3.datasource.DataSource, io.bidmachine.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.upstreamDataSource.read(bArr, i, i2);
    }

    /* loaded from: classes9.dex */
    public interface Resolver {
        DataSpec resolveDataSpec(DataSpec dataSpec) throws IOException;

        default Uri resolveReportedUri(Uri uri) {
            return uri;
        }
    }
}
