package com.google.android.exoplayer2.upstream.crypto;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.upstream.DataSink;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class AesCipherDataSink implements DataSink {

    /* renamed from: a */
    private final DataSink f36028a;

    /* renamed from: b */
    private final byte[] f36029b;
    @Nullable

    /* renamed from: c */
    private final byte[] f36030c;
    @Nullable

    /* renamed from: d */
    private AesFlushingCipher f36031d;

    public AesCipherDataSink(byte[] bArr, DataSink dataSink) {
        this(bArr, dataSink, null);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws IOException {
        this.f36031d = null;
        this.f36028a.close();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(DataSpec dataSpec) throws IOException {
        this.f36028a.open(dataSpec);
        this.f36031d = new AesFlushingCipher(1, this.f36029b, dataSpec.key, dataSpec.uriPositionOffset + dataSpec.position);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.f36030c == null) {
            ((AesFlushingCipher) Util.castNonNull(this.f36031d)).updateInPlace(bArr, i, i2);
            this.f36028a.write(bArr, i, i2);
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            int min = Math.min(i2 - i3, this.f36030c.length);
            ((AesFlushingCipher) Util.castNonNull(this.f36031d)).update(bArr, i + i3, min, this.f36030c, 0);
            this.f36028a.write(this.f36030c, 0, min);
            i3 += min;
        }
    }

    public AesCipherDataSink(byte[] bArr, DataSink dataSink, @Nullable byte[] bArr2) {
        this.f36028a = dataSink;
        this.f36029b = bArr;
        this.f36030c = bArr2;
    }
}
