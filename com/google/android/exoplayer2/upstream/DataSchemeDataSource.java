package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.common.base.Charsets;
import java.io.IOException;
import java.net.URLDecoder;

/* loaded from: classes4.dex */
public final class DataSchemeDataSource extends BaseDataSource {
    public static final String SCHEME_DATA = "data";
    @Nullable

    /* renamed from: e */
    private DataSpec f35754e;
    @Nullable

    /* renamed from: f */
    private byte[] f35755f;

    /* renamed from: g */
    private int f35756g;

    /* renamed from: h */
    private int f35757h;

    public DataSchemeDataSource() {
        super(false);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() {
        if (this.f35755f != null) {
            this.f35755f = null;
            m72805c();
        }
        this.f35754e = null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        DataSpec dataSpec = this.f35754e;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        m72804d(dataSpec);
        this.f35754e = dataSpec;
        Uri uri = dataSpec.uri;
        String scheme = uri.getScheme();
        boolean equals = "data".equals(scheme);
        Assertions.checkArgument(equals, "Unsupported scheme: " + scheme);
        String[] split = Util.split(uri.getSchemeSpecificPart(), ",");
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f35755f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e) {
                    throw ParserException.createForMalformedDataOfUnknownType("Error while parsing Base64 encoded string: " + str, e);
                }
            } else {
                this.f35755f = Util.getUtf8Bytes(URLDecoder.decode(str, Charsets.US_ASCII.name()));
            }
            long j = dataSpec.position;
            byte[] bArr = this.f35755f;
            if (j <= bArr.length) {
                int i = (int) j;
                this.f35756g = i;
                int length = bArr.length - i;
                this.f35757h = length;
                long j2 = dataSpec.length;
                if (j2 != -1) {
                    this.f35757h = (int) Math.min(length, j2);
                }
                m72803e(dataSpec);
                long j3 = dataSpec.length;
                if (j3 == -1) {
                    return this.f35757h;
                }
                return j3;
            }
            this.f35755f = null;
            throw new DataSourceException(2008);
        }
        throw ParserException.createForMalformedDataOfUnknownType("Unexpected URI format: " + uri, null);
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.f35757h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        System.arraycopy(Util.castNonNull(this.f35755f), this.f35756g, bArr, i, min);
        this.f35756g += min;
        this.f35757h -= min;
        m72806b(min);
        return min;
    }
}
