package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes4.dex */
public final class RawResourceDataSource extends BaseDataSource {
    public static final String RAW_RESOURCE_SCHEME = "rawresource";

    /* renamed from: e */
    private final Resources f35881e;

    /* renamed from: f */
    private final String f35882f;
    @Nullable

    /* renamed from: g */
    private Uri f35883g;
    @Nullable

    /* renamed from: h */
    private AssetFileDescriptor f35884h;
    @Nullable

    /* renamed from: i */
    private InputStream f35885i;

    /* renamed from: j */
    private long f35886j;

    /* renamed from: k */
    private boolean f35887k;

    /* loaded from: classes4.dex */
    public static class RawResourceDataSourceException extends DataSourceException {
        @Deprecated
        public RawResourceDataSourceException(String str) {
            super(str, null, 2000);
        }

        @Deprecated
        public RawResourceDataSourceException(Throwable th) {
            super(th, 2000);
        }

        public RawResourceDataSourceException(@Nullable String str, @Nullable Throwable th, int i) {
            super(str, th, i);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f35881e = context.getResources();
        this.f35882f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public void close() throws RawResourceDataSourceException {
        this.f35883g = null;
        try {
            try {
                InputStream inputStream = this.f35885i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f35885i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f35884h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new RawResourceDataSourceException(null, e, 2000);
                    }
                } finally {
                    this.f35884h = null;
                    if (this.f35887k) {
                        this.f35887k = false;
                        m72805c();
                    }
                }
            } catch (Throwable th) {
                this.f35885i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f35884h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f35884h = null;
                        if (this.f35887k) {
                            this.f35887k = false;
                            m72805c();
                        }
                        throw th;
                    } finally {
                        this.f35884h = null;
                        if (this.f35887k) {
                            this.f35887k = false;
                            m72805c();
                        }
                    }
                } catch (IOException e2) {
                    throw new RawResourceDataSourceException(null, e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new RawResourceDataSourceException(null, e3, 2000);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    @Nullable
    public Uri getUri() {
        return this.f35883g;
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws RawResourceDataSourceException {
        int parseInt;
        String str;
        Uri uri = dataSpec.uri;
        this.f35883g = uri;
        if (!TextUtils.equals("rawresource", uri.getScheme()) && (!TextUtils.equals("android.resource", uri.getScheme()) || uri.getPathSegments().size() != 1 || !((String) Assertions.checkNotNull(uri.getLastPathSegment())).matches("\\d+"))) {
            if (TextUtils.equals("android.resource", uri.getScheme())) {
                String str2 = (String) Assertions.checkNotNull(uri.getPath());
                if (str2.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                    str2 = str2.substring(1);
                }
                String host = uri.getHost();
                StringBuilder sb2 = new StringBuilder();
                if (TextUtils.isEmpty(host)) {
                    str = "";
                } else {
                    str = host + ":";
                }
                sb2.append(str);
                sb2.append(str2);
                parseInt = this.f35881e.getIdentifier(sb2.toString(), "raw", this.f35882f);
                if (parseInt == 0) {
                    throw new RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            } else {
                throw new RawResourceDataSourceException("URI must either use scheme rawresource or android.resource", null, 1004);
            }
        } else {
            try {
                parseInt = Integer.parseInt((String) Assertions.checkNotNull(uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        }
        m72804d(dataSpec);
        try {
            AssetFileDescriptor openRawResourceFd = this.f35881e.openRawResourceFd(parseInt);
            this.f35884h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f35885i = fileInputStream;
                int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i != 0) {
                    try {
                        if (dataSpec.position > length) {
                            throw new RawResourceDataSourceException(null, null, 2008);
                        }
                    } catch (RawResourceDataSourceException e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new RawResourceDataSourceException(null, e2, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(dataSpec.position + startOffset) - startOffset;
                if (skip == dataSpec.position) {
                    if (i == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f35886j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f35886j = size;
                            if (size < 0) {
                                throw new RawResourceDataSourceException(null, null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f35886j = j;
                        if (j < 0) {
                            throw new DataSourceException(2008);
                        }
                    }
                    long j2 = dataSpec.length;
                    if (j2 != -1) {
                        long j3 = this.f35886j;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.f35886j = j2;
                    }
                    this.f35887k = true;
                    m72803e(dataSpec);
                    long j4 = dataSpec.length;
                    if (j4 == -1) {
                        return this.f35886j;
                    }
                    return j4;
                }
                throw new RawResourceDataSourceException(null, null, 2008);
            }
            throw new RawResourceDataSourceException("Resource is compressed: " + uri, null, 2000);
        } catch (Resources.NotFoundException e3) {
            throw new RawResourceDataSourceException(null, e3, 2005);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f35886j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException(null, e, 2000);
            }
        }
        int read = ((InputStream) Util.castNonNull(this.f35885i)).read(bArr, i, i2);
        if (read == -1) {
            if (this.f35886j == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.f35886j;
        if (j2 != -1) {
            this.f35886j = j2 - read;
        }
        m72806b(read);
        return read;
    }
}
