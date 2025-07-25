package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.yandex.mobile.ads.impl.InterfaceC30672ju;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes8.dex */
public final class u80 extends AbstractC30731kj {
    @Nullable

    /* renamed from: e */
    private RandomAccessFile f86151e;
    @Nullable

    /* renamed from: f */
    private Uri f86152f;

    /* renamed from: g */
    private long f86153g;

    /* renamed from: h */
    private boolean f86154h;

    @RequiresApi(21)
    /* renamed from: com.yandex.mobile.ads.impl.u80$a */
    /* loaded from: classes8.dex */
    private static final class C31559a {
        /* JADX INFO: Access modifiers changed from: private */
        @DoNotInline
        /* renamed from: a */
        public static boolean m28854a(@Nullable Throwable th) {
            if ((th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.u80$b */
    /* loaded from: classes8.dex */
    public static final class C31560b implements InterfaceC30672ju.InterfaceC30673a {
        @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju.InterfaceC30673a
        /* renamed from: a */
        public final InterfaceC30672ju mo28285a() {
            return new u80();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.u80$c */
    /* loaded from: classes8.dex */
    public static class C31561c extends C30748ku {
        public C31561c(int i, @Nullable String str, @Nullable FileNotFoundException fileNotFoundException) {
            super(i, str, fileNotFoundException);
        }

        public C31561c(Exception exc, int i) {
            super(exc, i);
        }
    }

    public u80() {
        super(false);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    public final long mo27541a(C30976nu c30976nu) throws C31561c {
        Uri uri = c30976nu.f83111a;
        this.f86152f = uri;
        m32537b(c30976nu);
        int i = 2006;
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.f86151e = randomAccessFile;
            try {
                randomAccessFile.seek(c30976nu.f83116f);
                long j = c30976nu.f83117g;
                if (j == -1) {
                    j = this.f86151e.length() - c30976nu.f83116f;
                }
                this.f86153g = j;
                if (j >= 0) {
                    this.f86154h = true;
                    m32535c(c30976nu);
                    return this.f86153g;
                }
                throw new C31561c(2008, null, null);
            } catch (IOException e) {
                throw new C31561c(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new C31561c(e2, (y32.f88010a < 21 || !C31559a.m28854a(e2.getCause())) ? 2005 : 2005);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            throw new C31561c(1004, "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=" + path2 + ",query=" + query + ",fragment=" + fragment, e2);
        } catch (SecurityException e3) {
            throw new C31561c(e3, 2006);
        } catch (RuntimeException e4) {
            throw new C31561c(e4, 2000);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final void close() throws C31561c {
        this.f86152f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f86151e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e) {
                throw new C31561c(e, 2000);
            }
        } finally {
            this.f86151e = null;
            if (this.f86154h) {
                this.f86154h = false;
                m32534e();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    @Nullable
    public final Uri getUri() {
        return this.f86152f;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30417gu
    public final int read(byte[] bArr, int i, int i2) throws C31561c {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f86153g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f86151e;
            int i3 = y32.f88010a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.f86153g -= read;
                m32536c(read);
            }
            return read;
        } catch (IOException e) {
            throw new C31561c(e, 2000);
        }
    }
}
