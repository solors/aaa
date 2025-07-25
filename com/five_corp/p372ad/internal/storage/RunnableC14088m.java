package com.five_corp.p372ad.internal.storage;

import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;
import com.five_corp.p372ad.internal.util.C14118f;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.five_corp.ad.internal.storage.m */
/* loaded from: classes4.dex */
public final class RunnableC14088m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ byte[] f26285a;

    /* renamed from: b */
    public final /* synthetic */ int f26286b;

    /* renamed from: c */
    public final /* synthetic */ int f26287c;

    /* renamed from: d */
    public final /* synthetic */ C14092q f26288d;

    public RunnableC14088m(C14092q c14092q, byte[] bArr, int i, int i2) {
        this.f26288d = c14092q;
        this.f26285a = bArr;
        this.f26286b = i;
        this.f26287c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C14118f c14118f;
        C14118f c14118f2;
        C14118f c14118f3;
        C14092q c14092q = this.f26288d;
        FileOutputStream fileOutputStream = c14092q.f26298h;
        if (fileOutputStream != null) {
            c14118f2 = new C14118f(true, null, fileOutputStream);
        } else {
            if (c14092q.f26297g) {
                c14118f3 = new C14118f(false, new C14068s(EnumC14106t.f26378H2, null, null, null), null);
            } else {
                InterfaceC14077b interfaceC14077b = c14092q.f26293c;
                String str = c14092q.f26292b;
                C14078c c14078c = (C14078c) interfaceC14077b;
                c14078c.getClass();
                try {
                    c14118f = new C14118f(true, null, new FileOutputStream(new File(c14078c.f26258a, str), true));
                } catch (FileNotFoundException e) {
                    c14118f = new C14118f(false, new C14068s(EnumC14106t.f26606l3, null, e, null), null);
                }
                if (!c14118f.f26746a) {
                    c14118f3 = new C14118f(false, c14118f.f26747b, null);
                } else {
                    FileOutputStream fileOutputStream2 = (FileOutputStream) c14118f.f26748c;
                    c14092q.f26298h = fileOutputStream2;
                    try {
                        fileOutputStream2.getChannel().truncate(c14092q.f26291a);
                        c14118f3 = new C14118f(true, null, c14092q.f26298h);
                    } catch (IOException e2) {
                        c14118f2 = new C14118f(false, new C14068s(EnumC14106t.f26354E2, null, e2, null), null);
                    }
                }
            }
            c14118f2 = c14118f3;
        }
        if (!c14118f2.f26746a) {
            C14092q c14092q2 = this.f26288d;
            c14092q2.f26295e.mo78108b(c14118f2.f26747b);
            c14092q2.m78107a();
            return;
        }
        try {
            ((FileOutputStream) c14118f2.f26748c).write(this.f26285a, this.f26286b, this.f26287c);
            this.f26288d.f26295e.getClass();
        } catch (IOException unused) {
            C14092q c14092q3 = this.f26288d;
            c14092q3.f26295e.mo78108b(new C14068s(EnumC14106t.f26362F2, null, null, null));
            c14092q3.m78107a();
        }
    }
}
