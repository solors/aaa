package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.ApplicationMediaCapabilities;
import android.net.Uri;
import android.os.Bundle;
import com.maticoo.sdk.utils.request.network.Headers;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* renamed from: com.applovin.impl.r4 */
/* loaded from: classes2.dex */
public final class C5236r4 extends AbstractC3982a2 {

    /* renamed from: e */
    private final ContentResolver f9307e;

    /* renamed from: f */
    private Uri f9308f;

    /* renamed from: g */
    private AssetFileDescriptor f9309g;

    /* renamed from: h */
    private FileInputStream f9310h;

    /* renamed from: i */
    private long f9311i;

    /* renamed from: j */
    private boolean f9312j;

    /* renamed from: com.applovin.impl.r4$a */
    /* loaded from: classes2.dex */
    private static final class C5237a {
        /* renamed from: a */
        public static void m96029a(Bundle bundle) {
            ApplicationMediaCapabilities.Builder addSupportedVideoMimeType;
            ApplicationMediaCapabilities.Builder addSupportedHdrType;
            ApplicationMediaCapabilities.Builder addSupportedHdrType2;
            ApplicationMediaCapabilities.Builder addSupportedHdrType3;
            ApplicationMediaCapabilities.Builder addSupportedHdrType4;
            ApplicationMediaCapabilities build;
            addSupportedVideoMimeType = new ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType("video/hevc");
            addSupportedHdrType = addSupportedVideoMimeType.addSupportedHdrType("android.media.feature.hdr.dolby_vision");
            addSupportedHdrType2 = addSupportedHdrType.addSupportedHdrType("android.media.feature.hdr.hdr10");
            addSupportedHdrType3 = addSupportedHdrType2.addSupportedHdrType("android.media.feature.hdr.hdr10_plus");
            addSupportedHdrType4 = addSupportedHdrType3.addSupportedHdrType("android.media.feature.hdr.hlg");
            build = addSupportedHdrType4.build();
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", build);
        }
    }

    /* renamed from: com.applovin.impl.r4$b */
    /* loaded from: classes2.dex */
    public static class C5238b extends C4567i5 {
        public C5238b(IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public C5236r4(Context context) {
        super(false);
        this.f9307e = context.getContentResolver();
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: a */
    public long mo94273a(C4698k5 c4698k5) {
        AssetFileDescriptor openAssetFileDescriptor;
        try {
            Uri uri = c4698k5.f7366a;
            this.f9308f = uri;
            m101076b(c4698k5);
            if ("content".equals(c4698k5.f7366a.getScheme())) {
                Bundle bundle = new Bundle();
                if (AbstractC5863xp.f12151a >= 31) {
                    C5237a.m96029a(bundle);
                }
                openAssetFileDescriptor = this.f9307e.openTypedAssetFileDescriptor(uri, Headers.VALUE_ACCEPT_ALL, bundle);
            } else {
                openAssetFileDescriptor = this.f9307e.openAssetFileDescriptor(uri, "r");
            }
            this.f9309g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f9310h = fileInputStream;
                int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i != 0 && c4698k5.f7372g > length) {
                    throw new C5238b(null, 2008);
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(c4698k5.f7372g + startOffset) - startOffset;
                if (skip == c4698k5.f7372g) {
                    if (i == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f9311i = -1L;
                        } else {
                            long position = size - channel.position();
                            this.f9311i = position;
                            if (position < 0) {
                                throw new C5238b(null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f9311i = j;
                        if (j < 0) {
                            throw new C5238b(null, 2008);
                        }
                    }
                    long j2 = c4698k5.f7373h;
                    if (j2 != -1) {
                        long j3 = this.f9311i;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.f9311i = j2;
                    }
                    this.f9312j = true;
                    m101075c(c4698k5);
                    long j4 = c4698k5.f7373h;
                    return j4 != -1 ? j4 : this.f9311i;
                }
                throw new C5238b(null, 2008);
            }
            throw new C5238b(new IOException("Could not open file descriptor for: " + uri), 2000);
        } catch (C5238b e) {
            throw e;
        } catch (IOException e2) {
            throw new C5238b(e2, e2 instanceof FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: c */
    public Uri mo94270c() {
        return this.f9308f;
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    public void close() {
        this.f9308f = null;
        try {
            try {
                FileInputStream fileInputStream = this.f9310h;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f9310h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f9309g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C5238b(e, 2000);
                    }
                } finally {
                    this.f9309g = null;
                    if (this.f9312j) {
                        this.f9312j = false;
                        m101073g();
                    }
                }
            } catch (Throwable th) {
                this.f9310h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f9309g;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f9309g = null;
                        if (this.f9312j) {
                            this.f9312j = false;
                            m101073g();
                        }
                        throw th;
                    } finally {
                        this.f9309g = null;
                        if (this.f9312j) {
                            this.f9312j = false;
                            m101073g();
                        }
                    }
                } catch (IOException e2) {
                    throw new C5238b(e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new C5238b(e3, 2000);
        }
    }

    @Override // com.applovin.impl.InterfaceC4379f5
    /* renamed from: a */
    public int mo94271a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f9311i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C5238b(e, 2000);
            }
        }
        int read = ((FileInputStream) AbstractC5863xp.m93017a((Object) this.f9310h)).read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f9311i;
        if (j2 != -1) {
            this.f9311i = j2 - read;
        }
        m101074d(read);
        return read;
    }
}
