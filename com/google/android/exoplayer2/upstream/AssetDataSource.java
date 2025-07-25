package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes4.dex */
public final class AssetDataSource extends BaseDataSource {

    /* renamed from: e */
    private final AssetManager f35724e;
    @Nullable

    /* renamed from: f */
    private Uri f35725f;
    @Nullable

    /* renamed from: g */
    private InputStream f35726g;

    /* renamed from: h */
    private long f35727h;

    /* renamed from: i */
    private boolean f35728i;

    /* loaded from: classes4.dex */
    public static final class AssetDataSourceException extends DataSourceException {
        @Deprecated
        public AssetDataSourceException(IOException iOException) {
            super(iOException, 2000);
        }

        public AssetDataSourceException(@Nullable Throwable th, int i) {
            super(th, i);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f35724e = context.getAssets();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws AssetDataSourceException {
        this.f35725f = null;
        try {
            try {
                InputStream inputStream = this.f35726g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                throw new AssetDataSourceException(e, 2000);
            }
        } finally {
            this.f35726g = null;
            if (this.f35728i) {
                this.f35728i = false;
                m72805c();
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.f35725f;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws AssetDataSourceException {
        int i;
        try {
            Uri uri = dataSpec.uri;
            this.f35725f = uri;
            String str = (String) Assertions.checkNotNull(uri.getPath());
            if (str.startsWith("/android_asset/")) {
                str = str.substring(15);
            } else if (str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                str = str.substring(1);
            }
            m72804d(dataSpec);
            InputStream open = this.f35724e.open(str, 1);
            this.f35726g = open;
            if (open.skip(dataSpec.position) >= dataSpec.position) {
                long j = dataSpec.length;
                if (j != -1) {
                    this.f35727h = j;
                } else {
                    long available = this.f35726g.available();
                    this.f35727h = available;
                    if (available == 2147483647L) {
                        this.f35727h = -1L;
                    }
                }
                this.f35728i = true;
                m72803e(dataSpec);
                return this.f35727h;
            }
            throw new AssetDataSourceException(null, 2008);
        } catch (AssetDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            } else {
                i = 2000;
            }
            throw new AssetDataSourceException(e2, i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f35727h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new AssetDataSourceException(e, 2000);
            }
        }
        int read = ((InputStream) Util.castNonNull(this.f35726g)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f35727h;
        if (j2 != -1) {
            this.f35727h = j2 - read;
        }
        m72806b(read);
        return read;
    }
}
