package com.yandex.mobile.ads.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.maticoo.sdk.utils.request.network.Headers;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: com.yandex.mobile.ads.impl.vq */
/* loaded from: classes8.dex */
public final class C31675vq extends AbstractC30731kj {

    /* renamed from: e */
    private final ContentResolver f86847e;
    @Nullable

    /* renamed from: f */
    private Uri f86848f;
    @Nullable

    /* renamed from: g */
    private AssetFileDescriptor f86849g;
    @Nullable

    /* renamed from: h */
    private FileInputStream f86850h;

    /* renamed from: i */
    private long f86851i;

    /* renamed from: j */
    private boolean f86852j;

    /* renamed from: com.yandex.mobile.ads.impl.vq$a */
    /* loaded from: classes8.dex */
    public static class C31676a extends C30748ku {
        public C31676a(@Nullable IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public C31675vq(Context context) {
        super(false);
        this.f86847e = context.getContentResolver();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    public final long mo27541a(C30976nu c30976nu) throws C31676a {
        AssetFileDescriptor openAssetFileDescriptor;
        int i = 2000;
        try {
            Uri uri = c30976nu.f83111a;
            this.f86848f = uri;
            m32537b(c30976nu);
            if ("content".equals(c30976nu.f83111a.getScheme())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                openAssetFileDescriptor = this.f86847e.openTypedAssetFileDescriptor(uri, Headers.VALUE_ACCEPT_ALL, bundle);
            } else {
                openAssetFileDescriptor = this.f86847e.openAssetFileDescriptor(uri, "r");
            }
            this.f86849g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f86850h = fileInputStream;
                int i2 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i2 != 0 && c30976nu.f83116f > length) {
                    throw new C31676a(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(c30976nu.f83116f + startOffset) - startOffset;
                if (skip == c30976nu.f83116f) {
                    if (i2 == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f86851i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f86851i = position;
                            if (position < 0) {
                                throw new C31676a(null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f86851i = j;
                        if (j < 0) {
                            throw new C31676a(null, 2008);
                        }
                    }
                    long j2 = c30976nu.f83117g;
                    if (j2 != -1) {
                        long j3 = this.f86851i;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.f86851i = j2;
                    }
                    this.f86852j = true;
                    m32535c(c30976nu);
                    long j4 = c30976nu.f83117g;
                    if (j4 == -1) {
                        return this.f86851i;
                    }
                    return j4;
                }
                throw new C31676a(null, 2008);
            }
            throw new C31676a(new IOException("Could not open file descriptor for: " + uri), 2000);
        } catch (C31676a e) {
            throw e;
        } catch (IOException e2) {
            if (e2 instanceof FileNotFoundException) {
                i = 2005;
            }
            throw new C31676a(e2, i);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final void close() throws C31676a {
        this.f86848f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f86850h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f86850h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f86849g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C31676a(e, 2000);
                    }
                } finally {
                    this.f86849g = null;
                    if (this.f86852j) {
                        this.f86852j = false;
                        m32534e();
                    }
                }
            } catch (Throwable th) {
                this.f86850h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f86849g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f86849g = null;
                        if (this.f86852j) {
                            this.f86852j = false;
                            m32534e();
                        }
                        throw th;
                    } finally {
                        this.f86849g = null;
                        if (this.f86852j) {
                            this.f86852j = false;
                            m32534e();
                        }
                    }
                } catch (IOException e2) {
                    throw new C31676a(e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new C31676a(e3, 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    @Nullable
    public final Uri getUri() {
        return this.f86848f;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30417gu
    public final int read(byte[] bArr, int i, int i2) throws C31676a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f86851i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C31676a(e, 2000);
            }
        }
        FileInputStream fileInputStream = this.f86850h;
        int i3 = y32.f88010a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f86851i;
        if (j2 != -1) {
            this.f86851i = j2 - read;
        }
        m32536c(read);
        return read;
    }
}
