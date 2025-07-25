package com.five_corp.p372ad.internal.soundstate;

import com.five_corp.p372ad.internal.cache.C13750w;
import com.five_corp.p372ad.internal.cache.InterfaceC13751x;
import com.five_corp.p372ad.internal.media_config.C13838a;

/* renamed from: com.five_corp.ad.internal.soundstate.e */
/* loaded from: classes4.dex */
public final class C14073e implements InterfaceC13751x {

    /* renamed from: a */
    public final Object f26253a = new Object();

    /* renamed from: b */
    public C14072d f26254b;

    public C14073e(int i) {
        this.f26254b = new C14072d(i, m78128a((C13838a) null));
    }

    /* renamed from: a */
    public final C14072d m78130a() {
        C14072d c14072d;
        synchronized (this.f26253a) {
            c14072d = this.f26254b;
        }
        return c14072d;
    }

    /* renamed from: a */
    public static int m78128a(C13838a c13838a) {
        if (c13838a == null) {
            return 1;
        }
        return c13838a.f25844c ? 2 : 3;
    }

    @Override // com.five_corp.p372ad.internal.cache.InterfaceC13751x
    /* renamed from: a */
    public final void mo78129a(C13750w c13750w) {
        int m78128a = m78128a(c13750w.f25563b);
        synchronized (this.f26253a) {
            this.f26254b = new C14072d(this.f26254b.f26251a, m78128a);
        }
    }
}
