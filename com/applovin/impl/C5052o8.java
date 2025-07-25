package com.applovin.impl;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.applovin.impl.o8 */
/* loaded from: classes2.dex */
public final class C5052o8 extends AbstractC3982a2 {

    /* renamed from: e */
    private RandomAccessFile f8740e;

    /* renamed from: f */
    private Uri f8741f;

    /* renamed from: g */
    private long f8742g;

    /* renamed from: h */
    private boolean f8743h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.impl.o8$a */
    /* loaded from: classes2.dex */
    public static final class C5053a {
        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public static boolean m96858b(Throwable th) {
            if ((th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.applovin.impl.o8$b */
    /* loaded from: classes2.dex */
    public static class C5054b extends C4567i5 {
        public C5054b(String str, Throwable th, int i) {
            super(str, th, i);
        }

        public C5054b(Throwable th, int i) {
            super(th, i);
        }
    }

    public C5052o8() {
        super(false);
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: a */
    public long mo94273a(C4698k5 c4698k5) {
        Uri uri = c4698k5.f7366a;
        this.f8741f = uri;
        m101076b(c4698k5);
        RandomAccessFile m96860a = m96860a(uri);
        this.f8740e = m96860a;
        try {
            m96860a.seek(c4698k5.f7372g);
            long j = c4698k5.f7373h;
            if (j == -1) {
                j = this.f8740e.length() - c4698k5.f7372g;
            }
            this.f8742g = j;
            if (j >= 0) {
                this.f8743h = true;
                m101075c(c4698k5);
                return this.f8742g;
            }
            throw new C5054b(null, null, 2008);
        } catch (IOException e) {
            throw new C5054b(e, 2000);
        }
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: c */
    public Uri mo94270c() {
        return this.f8741f;
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    public void close() {
        this.f8741f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f8740e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C5054b(e, 2000);
            }
        } finally {
            this.f8740e = null;
            if (this.f8743h) {
                this.f8743h = false;
                m101073g();
            }
        }
    }

    @Override // com.applovin.impl.InterfaceC4379f5
    /* renamed from: a */
    public int mo94271a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.f8742g == 0) {
            return -1;
        }
        try {
            int read = ((RandomAccessFile) AbstractC5863xp.m93017a((Object) this.f8740e)).read(bArr, i, (int) Math.min(this.f8742g, i2));
            if (read > 0) {
                this.f8742g -= read;
                m101074d(read);
            }
            return read;
        } catch (IOException e) {
            throw new C5054b(e, 2000);
        }
    }

    /* renamed from: a */
    private static RandomAccessFile m96860a(Uri uri) {
        int i = 2006;
        try {
            return new RandomAccessFile((String) AbstractC4100b1.m100583a((Object) uri.getPath()), "r");
        } catch (FileNotFoundException e) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C5054b(e, (AbstractC5863xp.f12151a < 21 || !C5053a.m96858b(e.getCause())) ? 2005 : 2005);
            }
            throw new C5054b(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
        } catch (SecurityException e2) {
            throw new C5054b(e2, 2006);
        } catch (RuntimeException e3) {
            throw new C5054b(e3, 2000);
        }
    }
}
