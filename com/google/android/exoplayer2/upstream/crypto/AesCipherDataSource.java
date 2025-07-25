package com.google.android.exoplayer2.upstream.crypto;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class AesCipherDataSource implements DataSource {

    /* renamed from: a */
    private final DataSource f36032a;

    /* renamed from: b */
    private final byte[] f36033b;
    @Nullable

    /* renamed from: c */
    private AesFlushingCipher f36034c;

    public AesCipherDataSource(byte[] bArr, DataSource dataSource) {
        this.f36032a = dataSource;
        this.f36033b = bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.f36032a.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.f36034c = null;
        this.f36032a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.f36032a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.f36032a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        long open = this.f36032a.open(dataSpec);
        this.f36034c = new AesFlushingCipher(2, this.f36033b, dataSpec.key, dataSpec.uriPositionOffset + dataSpec.position);
        return open;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        int read = this.f36032a.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        ((AesFlushingCipher) Util.castNonNull(this.f36034c)).updateInPlace(bArr, i, read);
        return read;
    }
}
