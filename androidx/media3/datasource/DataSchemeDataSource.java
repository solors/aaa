package androidx.media3.datasource;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.base.Charsets;
import java.io.IOException;
import java.net.URLDecoder;

@UnstableApi
/* loaded from: classes2.dex */
public final class DataSchemeDataSource extends BaseDataSource {
    public static final String SCHEME_DATA = "data";
    private int bytesRemaining;
    @Nullable
    private byte[] data;
    @Nullable
    private DataSpec dataSpec;
    private int readPosition;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // androidx.media3.datasource.DataSource
    public void close() {
        if (this.data != null) {
            this.data = null;
            transferEnded();
        }
        this.dataSpec = null;
    }

    @Override // androidx.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // androidx.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        transferInitializing(dataSpec);
        this.dataSpec = dataSpec;
        Uri normalizeScheme = dataSpec.uri.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        boolean equals = "data".equals(scheme);
        Assertions.checkArgument(equals, "Unsupported scheme: " + scheme);
        String[] split = Util.split(normalizeScheme.getSchemeSpecificPart(), ",");
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.data = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e);
                }
            } else {
                this.data = Util.getUtf8Bytes(URLDecoder.decode(str, Charsets.US_ASCII.name()));
            }
            long j = dataSpec.position;
            byte[] bArr = this.data;
            if (j <= bArr.length) {
                int i = (int) j;
                this.readPosition = i;
                int length = bArr.length - i;
                this.bytesRemaining = length;
                long j2 = dataSpec.length;
                if (j2 != -1) {
                    this.bytesRemaining = (int) Math.min(length, j2);
                }
                transferStarted(dataSpec);
                long j3 = dataSpec.length;
                if (j3 == -1) {
                    return this.bytesRemaining;
                }
                return j3;
            }
            this.data = null;
            throw new DataSourceException(2008);
        }
        throw ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + normalizeScheme, null);
    }

    @Override // androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.bytesRemaining;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(Util.castNonNull(this.data), this.readPosition, bArr, i, min);
        this.readPosition += min;
        this.bytesRemaining -= min;
        bytesTransferred(min);
        return min;
    }
}
