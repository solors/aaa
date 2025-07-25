package androidx.media3.exoplayer.hls;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;

@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultHlsDataSourceFactory implements HlsDataSourceFactory {
    private final DataSource.Factory dataSourceFactory;

    public DefaultHlsDataSourceFactory(DataSource.Factory factory) {
        this.dataSourceFactory = factory;
    }

    @Override // androidx.media3.exoplayer.hls.HlsDataSourceFactory
    public DataSource createDataSource(int i) {
        return this.dataSourceFactory.createDataSource();
    }
}
