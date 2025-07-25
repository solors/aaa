package io.bidmachine.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@UnstableApi
/* loaded from: classes9.dex */
public final class AesCipherDataSource implements DataSource {
    @Nullable
    private AesFlushingCipher cipher;
    private final byte[] secretKey;
    private final DataSource upstream;

    public AesCipherDataSource(byte[] bArr, DataSource dataSource) {
        this.upstream = dataSource;
        this.secretKey = bArr;
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.upstream.addTransferListener(transferListener);
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public void close() throws IOException {
        this.cipher = null;
        this.upstream.close();
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.upstream.getResponseHeaders();
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.upstream.getUri();
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        long open = this.upstream.open(dataSpec);
        this.cipher = new AesFlushingCipher(2, this.secretKey, dataSpec.key, dataSpec.uriPositionOffset + dataSpec.position);
        return open;
    }

    @Override // io.bidmachine.media3.datasource.DataSource, io.bidmachine.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int read = this.upstream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        ((AesFlushingCipher) Util.castNonNull(this.cipher)).updateInPlace(bArr, i, read);
        return read;
    }
}
