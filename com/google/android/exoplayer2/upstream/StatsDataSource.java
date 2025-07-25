package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public final class StatsDataSource implements DataSource {

    /* renamed from: a */
    private final DataSource f35902a;

    /* renamed from: b */
    private long f35903b;

    /* renamed from: c */
    private Uri f35904c = Uri.EMPTY;

    /* renamed from: d */
    private Map<String, List<String>> f35905d = Collections.emptyMap();

    public StatsDataSource(DataSource dataSource) {
        this.f35902a = (DataSource) Assertions.checkNotNull(dataSource);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.f35902a.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.f35902a.close();
    }

    public long getBytesRead() {
        return this.f35903b;
    }

    public Uri getLastOpenedUri() {
        return this.f35904c;
    }

    public Map<String, List<String>> getLastResponseHeaders() {
        return this.f35905d;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.f35902a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.f35902a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        this.f35904c = dataSpec.uri;
        this.f35905d = Collections.emptyMap();
        long open = this.f35902a.open(dataSpec);
        this.f35904c = (Uri) Assertions.checkNotNull(getUri());
        this.f35905d = getResponseHeaders();
        return open;
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = this.f35902a.read(bArr, i, i2);
        if (read != -1) {
            this.f35903b += read;
        }
        return read;
    }

    public void resetBytesRead() {
        this.f35903b = 0L;
    }
}
