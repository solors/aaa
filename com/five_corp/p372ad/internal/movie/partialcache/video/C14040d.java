package com.five_corp.p372ad.internal.movie.partialcache.video;

import android.os.Handler;
import android.os.Looper;
import com.five_corp.p372ad.internal.movie.partialcache.C13958b;

/* renamed from: com.five_corp.ad.internal.movie.partialcache.video.d */
/* loaded from: classes4.dex */
public final class C14040d {

    /* renamed from: a */
    public final Handler f26175a;

    /* renamed from: b */
    public final C13958b f26176b;

    /* renamed from: c */
    public final InterfaceC14039c f26177c;

    public C14040d(Looper looper, C13958b c13958b, InterfaceC14039c interfaceC14039c) {
        System.identityHashCode(this);
        this.f26175a = new Handler(looper);
        this.f26176b = c13958b;
        this.f26177c = interfaceC14039c;
    }

    /* renamed from: a */
    public static void m78169a(C13958b c13958b) {
        C14042f c14042f = c13958b.f26028e;
        if (c14042f != null) {
            c14042f.m78163a();
        }
    }
}
