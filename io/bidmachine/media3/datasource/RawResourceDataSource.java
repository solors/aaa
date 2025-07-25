package io.bidmachine.media3.datasource;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.Map;

@UnstableApi
/* loaded from: classes9.dex */
public final class RawResourceDataSource extends BaseDataSource {
    public static final String RAW_RESOURCE_SCHEME = "rawresource";
    @Nullable
    private AssetFileDescriptor assetFileDescriptor;
    private long bytesRemaining;
    @Nullable
    private InputStream inputStream;
    private boolean opened;
    private final String packageName;
    private final Resources resources;
    @Nullable
    private Uri uri;

    /* loaded from: classes9.dex */
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
        this.resources = context.getResources();
        this.packageName = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // io.bidmachine.media3.datasource.BaseDataSource, io.bidmachine.media3.datasource.DataSource
    public void close() throws RawResourceDataSourceException {
        this.uri = null;
        try {
            try {
                InputStream inputStream = this.inputStream;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.inputStream = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.assetFileDescriptor;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new RawResourceDataSourceException(null, e, 2000);
                    }
                } finally {
                    this.assetFileDescriptor = null;
                    if (this.opened) {
                        this.opened = false;
                        transferEnded();
                    }
                }
            } catch (Throwable th) {
                this.inputStream = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.assetFileDescriptor;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.assetFileDescriptor = null;
                        if (this.opened) {
                            this.opened = false;
                            transferEnded();
                        }
                        throw th;
                    } finally {
                        this.assetFileDescriptor = null;
                        if (this.opened) {
                            this.opened = false;
                            transferEnded();
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

    @Override // io.bidmachine.media3.datasource.BaseDataSource, io.bidmachine.media3.datasource.DataSource
    @UnstableApi
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // io.bidmachine.media3.datasource.BaseDataSource, io.bidmachine.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return this.uri;
    }

    @Override // io.bidmachine.media3.datasource.BaseDataSource, io.bidmachine.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws RawResourceDataSourceException {
        int parseInt;
        String str;
        Uri normalizeScheme = dataSpec.uri.normalizeScheme();
        this.uri = normalizeScheme;
        if (!TextUtils.equals("rawresource", normalizeScheme.getScheme()) && (!TextUtils.equals("android.resource", normalizeScheme.getScheme()) || normalizeScheme.getPathSegments().size() != 1 || !((String) Assertions.checkNotNull(normalizeScheme.getLastPathSegment())).matches("\\d+"))) {
            if (TextUtils.equals("android.resource", normalizeScheme.getScheme())) {
                String str2 = (String) Assertions.checkNotNull(normalizeScheme.getPath());
                if (str2.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                    str2 = str2.substring(1);
                }
                String host = normalizeScheme.getHost();
                StringBuilder sb2 = new StringBuilder();
                if (TextUtils.isEmpty(host)) {
                    str = "";
                } else {
                    str = host + ":";
                }
                sb2.append(str);
                sb2.append(str2);
                parseInt = this.resources.getIdentifier(sb2.toString(), "raw", this.packageName);
                if (parseInt == 0) {
                    throw new RawResourceDataSourceException("Resource not found.", null, 2005);
                }
            } else {
                throw new RawResourceDataSourceException("Unsupported URI scheme (" + normalizeScheme.getScheme() + "). Only rawresource and android.resource are supported.", null, 1004);
            }
        } else {
            try {
                parseInt = Integer.parseInt((String) Assertions.checkNotNull(normalizeScheme.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new RawResourceDataSourceException("Resource identifier must be an integer.", null, 1004);
            }
        }
        transferInitializing(dataSpec);
        try {
            AssetFileDescriptor openRawResourceFd = this.resources.openRawResourceFd(parseInt);
            this.assetFileDescriptor = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.inputStream = fileInputStream;
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
                            this.bytesRemaining = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.bytesRemaining = size;
                            if (size < 0) {
                                throw new RawResourceDataSourceException(null, null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.bytesRemaining = j;
                        if (j < 0) {
                            throw new DataSourceException(2008);
                        }
                    }
                    long j2 = dataSpec.length;
                    if (j2 != -1) {
                        long j3 = this.bytesRemaining;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.bytesRemaining = j2;
                    }
                    this.opened = true;
                    transferStarted(dataSpec);
                    long j4 = dataSpec.length;
                    if (j4 == -1) {
                        return this.bytesRemaining;
                    }
                    return j4;
                }
                throw new RawResourceDataSourceException(null, null, 2008);
            }
            throw new RawResourceDataSourceException("Resource is compressed: " + normalizeScheme, null, 2000);
        } catch (Resources.NotFoundException e3) {
            throw new RawResourceDataSourceException(null, e3, 2005);
        }
    }

    @Override // io.bidmachine.media3.datasource.BaseDataSource, io.bidmachine.media3.datasource.DataSource, io.bidmachine.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesRemaining;
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
        int read = ((InputStream) Util.castNonNull(this.inputStream)).read(bArr, i, i2);
        if (read == -1) {
            if (this.bytesRemaining == -1) {
                return -1;
            }
            throw new RawResourceDataSourceException("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.bytesRemaining;
        if (j2 != -1) {
            this.bytesRemaining = j2 - read;
        }
        bytesTransferred(read);
        return read;
    }
}
