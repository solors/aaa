package io.bidmachine.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSource;
import java.io.IOException;
import java.util.Map;

@UnstableApi
/* loaded from: classes9.dex */
public final class PlaceholderDataSource implements DataSource {
    public static final PlaceholderDataSource INSTANCE = new PlaceholderDataSource();
    public static final DataSource.Factory FACTORY = new DataSource.Factory() { // from class: io.bidmachine.media3.datasource.g
        @Override // io.bidmachine.media3.datasource.DataSource.Factory
        public final DataSource createDataSource() {
            return PlaceholderDataSource.m19927b();
        }
    };

    private PlaceholderDataSource() {
    }

    /* renamed from: b */
    public static /* synthetic */ PlaceholderDataSource m19927b() {
        return new PlaceholderDataSource();
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    @UnstableApi
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return null;
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // io.bidmachine.media3.datasource.DataSource, io.bidmachine.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public void close() {
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
    }
}
