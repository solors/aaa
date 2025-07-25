package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;
import com.maticoo.sdk.utils.request.network.Headers;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes4.dex */
public final class ContentDataSource extends BaseDataSource {

    /* renamed from: e */
    private final ContentResolver f35748e;
    @Nullable

    /* renamed from: f */
    private Uri f35749f;
    @Nullable

    /* renamed from: g */
    private AssetFileDescriptor f35750g;
    @Nullable

    /* renamed from: h */
    private FileInputStream f35751h;

    /* renamed from: i */
    private long f35752i;

    /* renamed from: j */
    private boolean f35753j;

    /* loaded from: classes4.dex */
    public static class ContentDataSourceException extends DataSourceException {
        @Deprecated
        public ContentDataSourceException(IOException iOException) {
            this(iOException, 2000);
        }

        public ContentDataSourceException(@Nullable IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f35748e = context.getContentResolver();
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws ContentDataSourceException {
        this.f35749f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f35751h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f35751h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f35750g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new ContentDataSourceException(e, 2000);
                    }
                } finally {
                    this.f35750g = null;
                    if (this.f35753j) {
                        this.f35753j = false;
                        m72805c();
                    }
                }
            } catch (Throwable th) {
                this.f35751h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f35750g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f35750g = null;
                        if (this.f35753j) {
                            this.f35753j = false;
                            m72805c();
                        }
                        throw th;
                    } finally {
                        this.f35750g = null;
                        if (this.f35753j) {
                            this.f35753j = false;
                            m72805c();
                        }
                    }
                } catch (IOException e2) {
                    throw new ContentDataSourceException(e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new ContentDataSourceException(e3, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.f35749f;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws ContentDataSourceException {
        AssetFileDescriptor openAssetFileDescriptor;
        int i = 2000;
        try {
            Uri uri = dataSpec.uri;
            this.f35749f = uri;
            m72804d(dataSpec);
            if ("content".equals(dataSpec.uri.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f35748e.openTypedAssetFileDescriptor(uri, Headers.VALUE_ACCEPT_ALL, bundle);
            } else {
                openAssetFileDescriptor = this.f35748e.openAssetFileDescriptor(uri, "r");
            }
            this.f35750g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f35751h = fileInputStream;
                int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i2 != 0 && dataSpec.position > length) {
                    throw new ContentDataSourceException(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
                if (skip == dataSpec.position) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f35752i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f35752i = position;
                            if (position < 0) {
                                throw new ContentDataSourceException(null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f35752i = j;
                        if (j < 0) {
                            throw new ContentDataSourceException(null, 2008);
                        }
                    }
                    long j2 = dataSpec.length;
                    if (j2 != -1) {
                        long j3 = this.f35752i;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.f35752i = j2;
                    }
                    this.f35753j = true;
                    m72803e(dataSpec);
                    long j4 = dataSpec.length;
                    if (j4 == -1) {
                        return this.f35752i;
                    }
                    return j4;
                }
                throw new ContentDataSourceException(null, 2008);
            }
            throw new ContentDataSourceException(new IOException("Could not open file descriptor for: " + uri), 2000);
        } catch (ContentDataSourceException e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new ContentDataSourceException(e2, i);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f35752i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new ContentDataSourceException(e, 2000);
            }
        }
        int read = ((FileInputStream) Util.castNonNull(this.f35751h)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f35752i;
        if (j2 != -1) {
            this.f35752i = j2 - read;
        }
        m72806b(read);
        return read;
    }
}
