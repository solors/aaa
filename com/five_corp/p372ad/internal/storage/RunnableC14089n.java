package com.five_corp.p372ad.internal.storage;

import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: com.five_corp.ad.internal.storage.n */
/* loaded from: classes4.dex */
public final class RunnableC14089n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C14092q f26289a;

    public RunnableC14089n(C14092q c14092q) {
        this.f26289a = c14092q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FileOutputStream fileOutputStream;
        C14092q c14092q = this.f26289a;
        if (!c14092q.f26297g && (fileOutputStream = c14092q.f26298h) != null) {
            try {
                fileOutputStream.flush();
                c14092q.f26298h.getFD().sync();
            } catch (IOException e) {
                c14092q.f26296f.m78269a(e);
            }
        }
    }
}
