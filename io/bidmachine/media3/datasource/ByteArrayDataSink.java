package io.bidmachine.media3.datasource;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@UnstableApi
/* loaded from: classes9.dex */
public final class ByteArrayDataSink implements DataSink {
    private ByteArrayOutputStream stream;

    @Override // io.bidmachine.media3.datasource.DataSink
    public void close() throws IOException {
        ((ByteArrayOutputStream) Util.castNonNull(this.stream)).close();
    }

    @Nullable
    public byte[] getData() {
        ByteArrayOutputStream byteArrayOutputStream = this.stream;
        if (byteArrayOutputStream == null) {
            return null;
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // io.bidmachine.media3.datasource.DataSink
    public void open(DataSpec dataSpec) {
        boolean z;
        long j = dataSpec.length;
        if (j == -1) {
            this.stream = new ByteArrayOutputStream();
            return;
        }
        if (j <= 2147483647L) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.stream = new ByteArrayOutputStream((int) dataSpec.length);
    }

    @Override // io.bidmachine.media3.datasource.DataSink
    public void write(byte[] bArr, int i, int i2) {
        ((ByteArrayOutputStream) Util.castNonNull(this.stream)).write(bArr, i, i2);
    }
}
