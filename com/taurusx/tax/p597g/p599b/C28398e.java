package com.taurusx.tax.p597g.p599b;

import android.text.TextUtils;
import com.taurusx.tax.p597g.p599b.C28409l;
import com.taurusx.tax.p597g.p599b.p600r.C28417b;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.lang.Thread;
import java.net.Socket;
import java.util.Locale;

/* renamed from: com.taurusx.tax.g.b.e */
/* loaded from: classes7.dex */
public class C28398e extends C28409l {

    /* renamed from: j */
    public final C28404h f73786j;

    /* renamed from: k */
    public final C28417b f73787k;

    /* renamed from: l */
    public InterfaceC28395b f73788l;

    public C28398e(C28404h c28404h, C28417b c28417b) {
        super(c28404h, c28417b);
        this.f73787k = c28417b;
        this.f73786j = c28404h;
    }

    /* renamed from: a */
    public void m38138a(C28397d c28397d, Socket socket) throws IOException, C28411m {
        String str;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        C28404h c28404h = this.f73786j;
        synchronized (c28404h) {
            if (TextUtils.isEmpty(c28404h.f73813c.f73838c)) {
                c28404h.m38127b();
            }
            str = c28404h.f73813c.f73838c;
        }
        boolean z = !TextUtils.isEmpty(str);
        long mo38105b = this.f73787k.mo38104c() ? this.f73787k.mo38105b() : this.f73786j.mo38112a();
        boolean z2 = mo38105b >= 0;
        boolean z3 = c28397d.f73785c;
        long j = z3 ? mo38105b - c28397d.f73784b : mo38105b;
        boolean z4 = z2 && z3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c28397d.f73785c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n");
        sb2.append("Accept-Ranges: bytes\n");
        sb2.append(z2 ? String.format(Locale.US, "Content-Length: %d\n", Long.valueOf(j)) : "");
        sb2.append(z4 ? String.format(Locale.US, "Content-Range: bytes %d-%d/%d\n", Long.valueOf(c28397d.f73784b), Long.valueOf(mo38105b - 1), Long.valueOf(mo38105b)) : "");
        sb2.append(z ? String.format(Locale.US, "Content-Type: %s\n", str) : "");
        sb2.append("\n");
        bufferedOutputStream.write(sb2.toString().getBytes("UTF-8"));
        long j2 = c28397d.f73784b;
        long mo38112a = this.f73786j.mo38112a();
        if ((((mo38112a > 0L ? 1 : (mo38112a == 0L ? 0 : -1)) > 0) && c28397d.f73785c && ((float) c28397d.f73784b) > ((float) this.f73787k.mo38105b()) + (((float) mo38112a) * 0.2f)) ? false : true) {
            byte[] bArr = new byte[8192];
            while (true) {
                C28412n.m38116a(bArr, j2, 8192);
                while (!this.f73827b.mo38104c() && this.f73827b.mo38105b() < 8192 + j2 && !this.f73832g) {
                    synchronized (this) {
                        boolean z5 = (this.f73831f == null || this.f73831f.getState() == Thread.State.TERMINATED) ? false : true;
                        if (!this.f73832g && !this.f73827b.mo38104c() && !z5) {
                            this.f73831f = new Thread(new C28409l.RunnableC28410a(), "Source reader for " + this.f73826a);
                            this.f73831f.start();
                        }
                    }
                    synchronized (this.f73828c) {
                        try {
                            this.f73828c.wait(1000L);
                        } catch (InterruptedException e) {
                            throw new C28411m("Waiting source data is interrupted!", e);
                        }
                    }
                    int i = this.f73830e.get();
                    if (i >= 1) {
                        this.f73830e.set(0);
                        throw new C28411m("Error reading source " + i + " times");
                    }
                }
                int mo38106a = this.f73827b.mo38106a(bArr, j2, 8192);
                if (this.f73827b.mo38104c() && this.f73833h != 100) {
                    this.f73833h = 100;
                    mo38121a(100);
                }
                if (mo38106a != -1) {
                    bufferedOutputStream.write(bArr, 0, mo38106a);
                    j2 += mo38106a;
                } else {
                    bufferedOutputStream.flush();
                    return;
                }
            }
        } else {
            C28404h c28404h2 = new C28404h(this.f73786j);
            try {
                c28404h2.mo38111a((int) j2);
                byte[] bArr2 = new byte[8192];
                while (true) {
                    int mo38110a = c28404h2.mo38110a(bArr2);
                    if (mo38110a != -1) {
                        bufferedOutputStream.write(bArr2, 0, mo38110a);
                    } else {
                        bufferedOutputStream.flush();
                        return;
                    }
                }
            } finally {
                c28404h2.close();
            }
        }
    }

    @Override // com.taurusx.tax.p597g.p599b.C28409l
    /* renamed from: a */
    public void mo38121a(int i) {
        InterfaceC28395b interfaceC28395b = this.f73788l;
        if (interfaceC28395b != null) {
            interfaceC28395b.mo38129a(this.f73787k.f73841b, this.f73786j.f73813c.f73836a, i);
        }
    }
}
