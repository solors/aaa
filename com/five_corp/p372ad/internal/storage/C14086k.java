package com.five_corp.p372ad.internal.storage;

import android.os.Handler;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.movie.partialcache.C13970f;
import com.five_corp.p372ad.internal.movie.partialcache.C14027s1;
import com.five_corp.p372ad.internal.movie.partialcache.C14033u1;
import com.five_corp.p372ad.internal.util.C14118f;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.five_corp.ad.internal.storage.k */
/* loaded from: classes4.dex */
public final class C14086k {

    /* renamed from: i */
    public static final byte[] f26275i = new byte[0];

    /* renamed from: a */
    public final int f26276a;

    /* renamed from: b */
    public final String f26277b;

    /* renamed from: c */
    public final InterfaceC14077b f26278c;

    /* renamed from: d */
    public final Handler f26279d;

    /* renamed from: e */
    public final InterfaceC14085j f26280e;

    /* renamed from: f */
    public boolean f26281f = false;

    /* renamed from: g */
    public int f26282g = 0;

    /* renamed from: h */
    public InputStream f26283h = null;

    public C14086k(int i, String str, InterfaceC14077b interfaceC14077b, Handler handler, C13970f c13970f) {
        this.f26276a = i;
        this.f26277b = str;
        this.f26278c = interfaceC14077b;
        this.f26279d = handler;
        this.f26280e = c13970f;
    }

    /* renamed from: a */
    public static void m78109a(C14086k c14086k, int i) {
        C14118f c14118f;
        int i2;
        C14118f c14118f2;
        int i3;
        if (i < 0) {
            c14086k.getClass();
            C14068s c14068s = new C14068s(EnumC14106t.f26322A2, "Request length: " + i, null, null);
            C14033u1 c14033u1 = (C14033u1) ((C13970f) c14086k.f26280e).f26039d;
            c14033u1.getClass();
            c14033u1.m78170b(new C14027s1(c14033u1, c14068s));
        } else {
            InputStream inputStream = c14086k.f26283h;
            if (inputStream != null) {
                c14118f2 = new C14118f(true, null, inputStream);
            } else if (c14086k.f26281f) {
                c14118f2 = new C14118f(false, new C14068s(EnumC14106t.f26330B2, null, null, null), null);
            } else {
                InterfaceC14077b interfaceC14077b = c14086k.f26278c;
                String str = c14086k.f26277b;
                C14078c c14078c = (C14078c) interfaceC14077b;
                c14078c.getClass();
                try {
                    c14118f = new C14118f(true, null, new FileInputStream(new File(c14078c.f26258a, str)));
                } catch (FileNotFoundException e) {
                    c14118f = new C14118f(false, new C14068s(EnumC14106t.f26598k3, null, e, null), null);
                }
                if (!c14118f.f26746a) {
                    c14118f2 = new C14118f(false, c14118f.f26747b, null);
                } else {
                    c14086k.f26283h = (InputStream) c14118f.f26748c;
                    long j = 0;
                    int i4 = 0;
                    while (true) {
                        long j2 = c14086k.f26276a;
                        i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
                        if (i2 >= 0 || i4 >= 16) {
                            break;
                        }
                        try {
                            j += c14086k.f26283h.skip(j2 - j);
                            i4++;
                        } catch (IOException e2) {
                            c14118f2 = new C14118f(false, new C14068s(EnumC14106t.f26685v2, null, e2, null), null);
                        }
                    }
                    if (i2 < 0) {
                        c14118f2 = new C14118f(false, new C14068s(EnumC14106t.f26693w2, null, null, null), null);
                    } else {
                        c14118f2 = new C14118f(true, null, c14086k.f26283h);
                    }
                }
            }
            if (!c14118f2.f26746a) {
                C14068s c14068s2 = c14118f2.f26747b;
                if (c14068s2.f26240a == EnumC14106t.f26598k3 && (i3 = c14086k.f26282g) < 3) {
                    c14086k.f26282g = i3 + 1;
                    c14086k.f26279d.postDelayed(new RunnableC14083h(c14086k, i), 50 << i3);
                    return;
                }
                C14033u1 c14033u12 = (C14033u1) ((C13970f) c14086k.f26280e).f26039d;
                c14033u12.getClass();
                c14033u12.m78170b(new C14027s1(c14033u12, c14068s2));
            } else {
                byte[] bArr = new byte[i];
                try {
                    int read = ((InputStream) c14118f2.f26748c).read(bArr);
                    if (read > 0) {
                        ((C13970f) c14086k.f26280e).m78204a(c14086k, bArr, read);
                    } else {
                        ((C13970f) c14086k.f26280e).m78204a(c14086k, f26275i, 0);
                    }
                    return;
                } catch (IOException unused) {
                    C14068s c14068s3 = new C14068s(EnumC14106t.f26701x2, null, null, null);
                    C14033u1 c14033u13 = (C14033u1) ((C13970f) c14086k.f26280e).f26039d;
                    c14033u13.getClass();
                    c14033u13.m78170b(new C14027s1(c14033u13, c14068s3));
                }
            }
        }
        c14086k.m78110a();
    }

    /* renamed from: a */
    public final void m78110a() {
        if (this.f26281f) {
            return;
        }
        this.f26281f = true;
        InputStream inputStream = this.f26283h;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                InterfaceC14085j interfaceC14085j = this.f26280e;
                C14068s c14068s = new C14068s(EnumC14106t.f26717z2, "fail to close file input stream", e, null);
                C14033u1 c14033u1 = (C14033u1) ((C13970f) interfaceC14085j).f26039d;
                c14033u1.getClass();
                c14033u1.m78170b(new C14027s1(c14033u1, c14068s));
            }
            this.f26283h = null;
        }
    }
}
