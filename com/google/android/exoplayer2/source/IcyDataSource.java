package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
final class IcyDataSource implements DataSource {

    /* renamed from: a */
    private final DataSource f34228a;

    /* renamed from: b */
    private final int f34229b;

    /* renamed from: c */
    private final Listener f34230c;

    /* renamed from: d */
    private final byte[] f34231d;

    /* renamed from: e */
    private int f34232e;

    /* loaded from: classes4.dex */
    public interface Listener {
        void onIcyMetadata(ParsableByteArray parsableByteArray);
    }

    public IcyDataSource(DataSource dataSource, int i, Listener listener) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.f34228a = dataSource;
        this.f34229b = i;
        this.f34230c = listener;
        this.f34231d = new byte[1];
        this.f34232e = i;
    }

    /* renamed from: b */
    private boolean m73821b() throws IOException {
        if (this.f34228a.read(this.f34231d, 0, 1) == -1) {
            return false;
        }
        int i = (this.f34231d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int read = this.f34228a.read(bArr, i3, i2);
            if (read == -1) {
                return false;
            }
            i3 += read;
            i2 -= read;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f34230c.onIcyMetadata(new ParsableByteArray(bArr, i));
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        this.f34228a.addTransferListener(transferListener);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public Map<String, List<String>> getResponseHeaders() {
        return this.f34228a.getResponseHeaders();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.f34228a.getUri();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f34232e == 0) {
            if (!m73821b()) {
                return -1;
            }
            this.f34232e = this.f34229b;
        }
        int read = this.f34228a.read(bArr, i, Math.min(this.f34232e, i2));
        if (read != -1) {
            this.f34232e -= read;
        }
        return read;
    }
}
