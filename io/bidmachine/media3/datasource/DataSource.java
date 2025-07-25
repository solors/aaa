package io.bidmachine.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.DataReader;
import io.bidmachine.media3.common.util.UnstableApi;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public interface DataSource extends DataReader {

    /* loaded from: classes9.dex */
    public interface Factory {
        @UnstableApi
        DataSource createDataSource();
    }

    @UnstableApi
    void addTransferListener(TransferListener transferListener);

    @UnstableApi
    void close() throws IOException;

    @UnstableApi
    default Map<String, List<String>> getResponseHeaders() {
        return Collections.emptyMap();
    }

    @Nullable
    @UnstableApi
    Uri getUri();

    @UnstableApi
    long open(DataSpec dataSpec) throws IOException;

    @Override // io.bidmachine.media3.common.DataReader
    /* synthetic */ int read(byte[] bArr, int i, int i2) throws IOException;
}
