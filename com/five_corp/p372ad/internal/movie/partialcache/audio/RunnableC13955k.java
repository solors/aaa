package com.five_corp.p372ad.internal.movie.partialcache.audio;

import android.media.AudioTrack;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.EnumC14106t;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.audio.k */
/* loaded from: classes4.dex */
public final class RunnableC13955k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ byte[] f26014a;

    /* renamed from: b */
    public final /* synthetic */ C13957m f26015b;

    public RunnableC13955k(C13957m c13957m, byte[] bArr) {
        this.f26015b = c13957m;
        this.f26014a = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudioTrack audioTrack;
        C13957m c13957m;
        C14068s c14068s;
        C13957m c13957m2 = this.f26015b;
        if (c13957m2.f26023f == 2 && (audioTrack = c13957m2.f26022e) != null) {
            byte[] bArr = this.f26014a;
            int write = audioTrack.write(bArr, 0, bArr.length);
            if (write != -6) {
                if (write != -3) {
                    if (write != -2) {
                        if (write == -1) {
                            c13957m = this.f26015b;
                            c14068s = new C14068s(EnumC14106t.f26592j5, null, null, null);
                        } else {
                            return;
                        }
                    } else {
                        c13957m = this.f26015b;
                        c14068s = new C14068s(EnumC14106t.f26584i5, null, null, null);
                    }
                } else {
                    c13957m = this.f26015b;
                    c14068s = new C14068s(EnumC14106t.f26568g5, null, null, null);
                }
            } else {
                c13957m = this.f26015b;
                c14068s = new C14068s(EnumC14106t.f26576h5, null, null, null);
            }
            C13957m.m78206a(c13957m, c14068s);
        }
    }
}
