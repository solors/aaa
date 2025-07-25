package com.five_corp.p372ad.internal.movie.partialcache.audio;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import com.five_corp.p372ad.internal.C14068s;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.audio.m */
/* loaded from: classes4.dex */
public final class C13957m {

    /* renamed from: g */
    public static final C13953i f26017g = new C13953i();

    /* renamed from: b */
    public final InterfaceC13952h f26019b;

    /* renamed from: c */
    public Handler f26020c;

    /* renamed from: d */
    public HandlerThread f26021d;

    /* renamed from: e */
    public AudioTrack f26022e;

    /* renamed from: a */
    public final String f26018a = C13957m.class.getName() + System.identityHashCode(this);

    /* renamed from: f */
    public int f26023f = 1;

    public C13957m(InterfaceC13952h interfaceC13952h) {
        this.f26019b = interfaceC13952h;
    }

    /* renamed from: a */
    public static void m78206a(C13957m c13957m, C14068s c14068s) {
        int i = c13957m.f26023f;
        if (i != 3 && i != 4) {
            c13957m.f26023f = 3;
            C13951g c13951g = (C13951g) c13957m.f26019b;
            int i2 = c13951g.f26007d;
            if (i2 != 5 && i2 != 6) {
                c13951g.f26007d = 5;
                ((C13947c) c13951g.f26005b).f25994c.m78148a(c14068s);
            }
        }
    }
}
