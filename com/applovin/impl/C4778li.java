package com.applovin.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* renamed from: com.applovin.impl.li */
/* loaded from: classes2.dex */
public final class C4778li extends AbstractC3982a2 {

    /* renamed from: e */
    private final Resources f7766e;

    /* renamed from: f */
    private final String f7767f;

    /* renamed from: g */
    private Uri f7768g;

    /* renamed from: h */
    private AssetFileDescriptor f7769h;

    /* renamed from: i */
    private InputStream f7770i;

    /* renamed from: j */
    private long f7771j;

    /* renamed from: k */
    private boolean f7772k;

    /* renamed from: com.applovin.impl.li$a */
    /* loaded from: classes2.dex */
    public static class C4779a extends C4567i5 {
        public C4779a(String str, Throwable th, int i) {
            super(str, th, i);
        }
    }

    public C4778li(Context context) {
        super(false);
        this.f7766e = context.getResources();
        this.f7767f = context.getPackageName();
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: a */
    public long mo94273a(C4698k5 c4698k5) {
        int parseInt;
        String str;
        Uri uri = c4698k5.f7366a;
        this.f7768g = uri;
        if (!TextUtils.equals("rawresource", uri.getScheme()) && (!TextUtils.equals("android.resource", uri.getScheme()) || uri.getPathSegments().size() != 1 || !((String) AbstractC4100b1.m100583a((Object) uri.getLastPathSegment())).matches("\\d+"))) {
            if (TextUtils.equals("android.resource", uri.getScheme())) {
                String str2 = (String) AbstractC4100b1.m100583a((Object) uri.getPath());
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
                parseInt = this.f7766e.getIdentifier(sb2.toString(), "raw", this.f7767f);
                if (parseInt == 0) {
                    throw new C4779a("Resource not found.", null, 2005);
                }
            } else {
                throw new C4779a("URI must either use scheme rawresource or android.resource", null, 1004);
            }
        } else {
            try {
                parseInt = Integer.parseInt((String) AbstractC4100b1.m100583a((Object) uri.getLastPathSegment()));
            } catch (NumberFormatException unused) {
                throw new C4779a("Resource identifier must be an integer.", null, 1004);
            }
        }
        m101076b(c4698k5);
        try {
            AssetFileDescriptor openRawResourceFd = this.f7766e.openRawResourceFd(parseInt);
            this.f7769h = openRawResourceFd;
            if (openRawResourceFd != null) {
                long length = openRawResourceFd.getLength();
                FileInputStream fileInputStream = new FileInputStream(openRawResourceFd.getFileDescriptor());
                this.f7770i = fileInputStream;
                int i = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
                if (i != 0) {
                    try {
                        if (c4698k5.f7372g > length) {
                            throw new C4779a(null, null, 2008);
                        }
                    } catch (C4779a e) {
                        throw e;
                    } catch (IOException e2) {
                        throw new C4779a(null, e2, 2000);
                    }
                }
                long startOffset = openRawResourceFd.getStartOffset();
                long skip = fileInputStream.skip(c4698k5.f7372g + startOffset) - startOffset;
                if (skip == c4698k5.f7372g) {
                    if (i == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.f7771j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.f7771j = size;
                            if (size < 0) {
                                throw new C4779a(null, null, 2008);
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f7771j = j;
                        if (j < 0) {
                            throw new C4567i5(2008);
                        }
                    }
                    long j2 = c4698k5.f7373h;
                    if (j2 != -1) {
                        long j3 = this.f7771j;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.f7771j = j2;
                    }
                    this.f7772k = true;
                    m101075c(c4698k5);
                    long j4 = c4698k5.f7373h;
                    return j4 != -1 ? j4 : this.f7771j;
                }
                throw new C4779a(null, null, 2008);
            }
            throw new C4779a("Resource is compressed: " + uri, null, 2000);
        } catch (Resources.NotFoundException e3) {
            throw new C4779a(null, e3, 2005);
        }
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: c */
    public Uri mo94270c() {
        return this.f7768g;
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    public void close() {
        this.f7768g = null;
        try {
            try {
                InputStream inputStream = this.f7770i;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f7770i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f7769h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C4779a(null, e, 2000);
                    }
                } finally {
                    this.f7769h = null;
                    if (this.f7772k) {
                        this.f7772k = false;
                        m101073g();
                    }
                }
            } catch (Throwable th) {
                this.f7770i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f7769h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f7769h = null;
                        if (this.f7772k) {
                            this.f7772k = false;
                            m101073g();
                        }
                        throw th;
                    } finally {
                        this.f7769h = null;
                        if (this.f7772k) {
                            this.f7772k = false;
                            m101073g();
                        }
                    }
                } catch (IOException e2) {
                    throw new C4779a(null, e2, 2000);
                }
            }
        } catch (IOException e3) {
            throw new C4779a(null, e3, 2000);
        }
    }

    @Override // com.applovin.impl.InterfaceC4379f5
    /* renamed from: a */
    public int mo94271a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f7771j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C4779a(null, e, 2000);
            }
        }
        int read = ((InputStream) AbstractC5863xp.m93017a((Object) this.f7770i)).read(bArr, i, i2);
        if (read == -1) {
            if (this.f7771j == -1) {
                return -1;
            }
            throw new C4779a("End of stream reached having not read sufficient data.", new EOFException(), 2000);
        }
        long j2 = this.f7771j;
        if (j2 != -1) {
            this.f7771j = j2 - read;
        }
        m101074d(read);
        return read;
    }
}
