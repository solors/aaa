package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class TeeDataSource implements DataSource {

    /* renamed from: a */
    private final DataSource f35906a;

    /* renamed from: b */
    private final DataSink f35907b;

    /* renamed from: c */
    private boolean f35908c;

    /* renamed from: d */
    private long f35909d;

    public TeeDataSource(DataSource dataSource, DataSink dataSink) {
        this.f35906a = (DataSource) Assertions.checkNotNull(dataSource);
        this.f35907b = (DataSink) Assertions.checkNotNull(dataSink);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.f35906a.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        try {
            this.f35906a.close();
        } finally {
            if (this.f35908c) {
                this.f35908c = false;
                this.f35907b.close();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.f35906a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.f35906a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        long open = this.f35906a.open(dataSpec);
        this.f35909d = open;
        if (open == 0) {
            return 0L;
        }
        if (dataSpec.length == -1 && open != -1) {
            dataSpec = dataSpec.subrange(0L, open);
        }
        this.f35908c = true;
        this.f35907b.open(dataSpec);
        return this.f35909d;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f35909d == 0) {
            return -1;
        }
        int read = this.f35906a.read(bArr, i, i2);
        if (read > 0) {
            this.f35907b.write(bArr, i, read);
            long j = this.f35909d;
            if (j != -1) {
                this.f35909d = j - read;
            }
        }
        return read;
    }
}
