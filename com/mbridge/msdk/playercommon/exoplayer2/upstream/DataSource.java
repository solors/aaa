package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes6.dex */
public interface DataSource {

    /* loaded from: classes6.dex */
    public interface Factory {
        DataSource createDataSource();
    }

    void close() throws IOException;

    @Nullable
    Uri getUri();

    long open(DataSpec dataSpec) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;
}
