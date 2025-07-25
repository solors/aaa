package com.google.android.exoplayer2.upstream;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ByteArrayDataSink implements DataSink {

    /* renamed from: a */
    private ByteArrayOutputStream f35737a;

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void close() throws IOException {
        ((ByteArrayOutputStream) Util.castNonNull(this.f35737a)).close();
    }

    @Nullable
    public byte[] getData() {
        ByteArrayOutputStream byteArrayOutputStream = this.f35737a;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void open(DataSpec dataSpec) {
        boolean z;
        long j = dataSpec.length;
        if (j == -1) {
            this.f35737a = new ByteArrayOutputStream();
            return;
        }
        if (j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.f35737a = new ByteArrayOutputStream((int) dataSpec.length);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSink
    public void write(byte[] bArr, int i, int i2) {
        ((ByteArrayOutputStream) Util.castNonNull(this.f35737a)).write(bArr, i, i2);
    }
}
