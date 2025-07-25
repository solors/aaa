package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ByteArrayDataSource extends BaseDataSource {

    /* renamed from: e */
    private final byte[] f35738e;
    @Nullable

    /* renamed from: f */
    private Uri f35739f;

    /* renamed from: g */
    private int f35740g;

    /* renamed from: h */
    private int f35741h;

    /* renamed from: i */
    private boolean f35742i;

    public ByteArrayDataSource(byte[] bArr) {
        super(false);
        Assertions.checkNotNull(bArr);
        Assertions.checkArgument(bArr.length > 0);
        this.f35738e = bArr;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.f35742i) {
            this.f35742i = false;
            m72805c();
        }
        this.f35739f = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.f35739f;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        this.f35739f = dataSpec.uri;
        m72804d(dataSpec);
        long j = dataSpec.position;
        byte[] bArr = this.f35738e;
        if (j <= bArr.length) {
            this.f35740g = (int) j;
            int length = bArr.length - ((int) j);
            this.f35741h = length;
            long j2 = dataSpec.length;
            if (j2 != -1) {
                this.f35741h = (int) Math.min(length, j2);
            }
            this.f35742i = true;
            m72803e(dataSpec);
            long j3 = dataSpec.length;
            if (j3 == -1) {
                return this.f35741h;
            }
            return j3;
        }
        throw new DataSourceException(2008);
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f35741h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(this.f35738e, this.f35740g, bArr, i, min);
        this.f35740g += min;
        this.f35741h -= min;
        m72806b(min);
        return min;
    }
}
