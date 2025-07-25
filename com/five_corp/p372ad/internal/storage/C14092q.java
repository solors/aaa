package com.five_corp.p372ad.internal.storage;

import android.os.Handler;
import com.five_corp.p372ad.internal.logger.C13836a;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.five_corp.ad.internal.storage.q */
/* loaded from: classes4.dex */
public final class C14092q {

    /* renamed from: a */
    public final int f26291a;

    /* renamed from: b */
    public final String f26292b;

    /* renamed from: c */
    public final InterfaceC14077b f26293c;

    /* renamed from: d */
    public final Handler f26294d;

    /* renamed from: e */
    public final InterfaceC14091p f26295e;

    /* renamed from: f */
    public final C13836a f26296f;

    /* renamed from: g */
    public boolean f26297g = false;

    /* renamed from: h */
    public FileOutputStream f26298h = null;

    public C14092q(int i, String str, InterfaceC14077b interfaceC14077b, Handler handler, InterfaceC14091p interfaceC14091p, C13836a c13836a) {
        this.f26291a = i;
        this.f26292b = str;
        this.f26293c = interfaceC14077b;
        this.f26294d = handler;
        this.f26295e = interfaceC14091p;
        this.f26296f = c13836a;
    }

    /* renamed from: a */
    public final void m78107a() {
        if (this.f26297g) {
            return;
        }
        this.f26297g = true;
        FileOutputStream fileOutputStream = this.f26298h;
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                this.f26296f.m78269a(e);
            }
            this.f26298h = null;
        }
    }
}
