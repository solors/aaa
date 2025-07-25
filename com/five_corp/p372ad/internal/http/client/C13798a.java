package com.five_corp.p372ad.internal.http.client;

import android.os.Handler;
import android.os.HandlerThread;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.http.client.C13798a;
import com.five_corp.p372ad.internal.http.connection.AbstractC13803c;
import com.five_corp.p372ad.internal.http.connection.C13801a;
import com.five_corp.p372ad.internal.p373ad.C13691u;
import com.five_corp.p372ad.internal.util.C14118f;
import java.io.InputStream;
import java.util.regex.Pattern;

/* renamed from: com.five_corp.ad.internal.http.client.a */
/* loaded from: classes4.dex */
public final class C13798a {

    /* renamed from: a */
    public final C13691u f25713a;

    /* renamed from: b */
    public final InterfaceC13799b f25714b;

    /* renamed from: c */
    public HandlerThread f25715c;

    /* renamed from: d */
    public final Handler f25716d;

    /* renamed from: e */
    public final AbstractC13803c f25717e;

    /* renamed from: f */
    public C13801a f25718f;

    public C13798a(C13691u c13691u, InterfaceC13799b interfaceC13799b, AbstractC13803c abstractC13803c) {
        this.f25713a = c13691u;
        this.f25714b = interfaceC13799b;
        this.f25717e = abstractC13803c;
        HandlerThread handlerThread = new HandlerThread("HttpDownloadClient for " + c13691u.f25401a);
        this.f25715c = handlerThread;
        handlerThread.start();
        this.f25716d = new Handler(this.f25715c.getLooper());
    }

    /* renamed from: a */
    public final void m78359a() {
        this.f25716d.postAtFrontOfQueue(new Runnable() { // from class: c2.b
            {
                C13798a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C13798a.this.m78357b();
            }
        });
    }

    /* renamed from: b */
    public final void m78357b() {
        this.f25714b.mo78328a();
        m78353e();
    }

    /* renamed from: c */
    public final void m78355c() {
        this.f25716d.post(new Runnable() { // from class: c2.d
            {
                C13798a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C13798a.this.m78354d();
            }
        });
    }

    /* renamed from: d */
    public final void m78354d() {
        byte[] bArr = new byte[8192];
        C14118f m78347a = this.f25718f.m78347a(bArr);
        if (!m78347a.f26746a) {
            this.f25714b.mo78321c(m78347a.f26747b);
            m78353e();
            return;
        }
        int intValue = ((Integer) m78347a.f26748c).intValue();
        if (intValue < 0) {
            this.f25714b.mo78322c();
            m78353e();
            return;
        }
        this.f25714b.mo78324a(bArr, intValue);
        m78355c();
    }

    /* renamed from: e */
    public final void m78353e() {
        C13801a c13801a = this.f25718f;
        if (c13801a != null) {
            InputStream inputStream = c13801a.f25722b;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
                c13801a.f25722b = null;
            }
            InputStream errorStream = c13801a.f25721a.getErrorStream();
            if (errorStream != null) {
                try {
                    errorStream.close();
                } catch (Exception unused2) {
                }
            }
            c13801a.f25721a = null;
            this.f25718f = null;
        }
        HandlerThread handlerThread = this.f25715c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f25715c = null;
        }
    }

    /* renamed from: f */
    public final void m78352f() {
        this.f25716d.post(new Runnable() { // from class: c2.a
            {
                C13798a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C13798a.this.m78351g();
            }
        });
    }

    /* renamed from: g */
    public final void m78351g() {
        C14068s c14068s;
        C14068s c14068s2;
        C14118f m78346b = this.f25718f.m78346b();
        if (!m78346b.f26746a) {
            this.f25714b.mo78321c(m78346b.f26747b);
            m78353e();
            return;
        }
        int intValue = ((Integer) m78346b.f26748c).intValue();
        if (intValue == 206) {
            String headerField = this.f25718f.f25721a.getHeaderField("Content-Range");
            Pattern pattern = AbstractC13800c.f25719a;
            int m78350a = AbstractC13800c.m78350a(headerField, pattern, 1);
            if (m78350a < 0) {
                c14068s2 = new C14068s(EnumC14106t.f26621n2, null, null, null);
            } else {
                int m78350a2 = AbstractC13800c.m78350a(headerField, pattern, 2);
                if (m78350a2 < 0) {
                    c14068s2 = new C14068s(EnumC14106t.f26629o2, null, null, null);
                } else {
                    int m78350a3 = AbstractC13800c.m78350a(headerField, AbstractC13800c.f25720b, 1);
                    if (m78350a3 < 0) {
                        c14068s2 = new C14068s(EnumC14106t.f26637p2, null, null, null);
                    } else {
                        this.f25714b.mo78326a(m78350a, m78350a2, m78350a3);
                        m78355c();
                        return;
                    }
                }
            }
            this.f25714b.mo78321c(c14068s2);
            m78353e();
        } else if (intValue == 416) {
            int m78350a4 = AbstractC13800c.m78350a(this.f25718f.f25721a.getHeaderField("Content-Range"), AbstractC13800c.f25720b, 1);
            if (m78350a4 < 0) {
                this.f25714b.mo78321c(new C14068s(EnumC14106t.f26613m2, null, null, null));
                m78353e();
                return;
            }
            this.f25714b.mo78327a(m78350a4);
            this.f25714b.mo78322c();
            m78353e();
        } else {
            int i = intValue / 100;
            if (i == 2) {
                this.f25714b.mo78320d();
                m78355c();
                return;
            }
            if (i == 3) {
                c14068s = new C14068s(EnumC14106t.f26645q2, null, null, null);
            } else if (i == 4) {
                c14068s = new C14068s(EnumC14106t.f26653r2, null, null, null);
            } else if (i == 5) {
                c14068s = new C14068s(EnumC14106t.f26661s2, null, null, null);
            } else {
                c14068s = new C14068s(EnumC14106t.f26669t2, null, null, null);
            }
            this.f25714b.mo78321c(c14068s);
            m78353e();
        }
    }

    /* renamed from: a */
    public final void m78358a(int i, int i2) {
        Pattern pattern = AbstractC13800c.f25719a;
        C14118f mo78344a = this.f25717e.mo78344a(this.f25713a.f25401a, "GET", null, (i <= 0 || i2 != 0) ? i2 > 0 ? String.format("bytes=%d-%d", Integer.valueOf(i), Integer.valueOf((i + i2) - 1)) : null : String.format("bytes=%d-", Integer.valueOf(i)), null, null, 60000, 60000);
        if (mo78344a.f26746a) {
            C13801a c13801a = (C13801a) mo78344a.f26748c;
            this.f25718f = c13801a;
            mo78344a = c13801a.m78349a();
            if (mo78344a.f26746a) {
                m78352f();
                return;
            }
        }
        this.f25714b.mo78321c(mo78344a.f26747b);
        m78353e();
    }

    /* renamed from: b */
    public final void m78356b(final int i, final int i2) {
        this.f25716d.post(new Runnable() { // from class: c2.c
            {
                C13798a.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C13798a.this.m78358a(i, i2);
            }
        });
    }
}
