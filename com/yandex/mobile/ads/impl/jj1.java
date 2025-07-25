package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class jj1 extends AbstractC30731kj {

    /* renamed from: e */
    private final Resources f80934e;

    /* renamed from: f */
    private final String f80935f;
    @Nullable

    /* renamed from: g */
    private Uri f80936g;
    @Nullable

    /* renamed from: h */
    private AssetFileDescriptor f80937h;
    @Nullable

    /* renamed from: i */
    private FileInputStream f80938i;

    /* renamed from: j */
    private long f80939j;

    /* renamed from: k */
    private boolean f80940k;

    /* renamed from: com.yandex.mobile.ads.impl.jj1$a */
    /* loaded from: classes8.dex */
    public static class C30629a extends C30748ku {
        public C30629a(int i, @Nullable String str, @Nullable Exception exc) {
            super(i, str, exc);
        }
    }

    public jj1(Context context) {
        super(false);
        this.f80934e = context.getResources();
        this.f80935f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
        if (r3.matches("\\d+") != false) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0161  */
    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long mo27541a(com.yandex.mobile.ads.impl.C30976nu r16) throws com.yandex.mobile.ads.impl.jj1.C30629a {
        /*
            Method dump skipped, instructions count: 391
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.jj1.mo27541a(com.yandex.mobile.ads.impl.nu):long");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final void close() throws C30629a {
        this.f80936g = null;
        try {
            try {
                FileInputStream fileInputStream = this.f80938i;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.f80938i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.f80937h;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } catch (IOException e) {
                        throw new C30629a(2000, null, e);
                    }
                } finally {
                    this.f80937h = null;
                    if (this.f80940k) {
                        this.f80940k = false;
                        m32534e();
                    }
                }
            } catch (Throwable th) {
                this.f80938i = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor2 = this.f80937h;
                        if (assetFileDescriptor2 != null) {
                            assetFileDescriptor2.close();
                        }
                        this.f80937h = null;
                        if (this.f80940k) {
                            this.f80940k = false;
                            m32534e();
                        }
                        throw th;
                    } finally {
                        this.f80937h = null;
                        if (this.f80940k) {
                            this.f80940k = false;
                            m32534e();
                        }
                    }
                } catch (IOException e2) {
                    throw new C30629a(2000, null, e2);
                }
            }
        } catch (IOException e3) {
            throw new C30629a(2000, null, e3);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    @Nullable
    public final Uri getUri() {
        return this.f80936g;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30417gu
    public final int read(byte[] bArr, int i, int i2) throws C30629a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f80939j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C30629a(2000, null, e);
            }
        }
        FileInputStream fileInputStream = this.f80938i;
        int i3 = y32.f88010a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.f80939j == -1) {
                return -1;
            }
            throw new C30629a(2000, "End of stream reached having not read sufficient data.", new EOFException());
        }
        long j2 = this.f80939j;
        if (j2 != -1) {
            this.f80939j = j2 - read;
        }
        m32536c(read);
        return read;
    }
}
