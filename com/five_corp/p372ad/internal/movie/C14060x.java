package com.five_corp.p372ad.internal.movie;

import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import com.five_corp.p372ad.AbstractC13610e;
import com.five_corp.p372ad.internal.C14068s;
import com.five_corp.p372ad.internal.cache.C13741n;
import com.five_corp.p372ad.internal.context.C13760i;
import com.five_corp.p372ad.internal.http.movcache.C13812h;
import com.five_corp.p372ad.internal.logger.C13836a;
import com.five_corp.p372ad.internal.movie.partialcache.C13958b;
import com.five_corp.p372ad.internal.movie.partialcache.C13976h;
import com.five_corp.p372ad.internal.movie.partialcache.C14033u1;
import com.five_corp.p372ad.internal.movie.partialcache.C14045w1;
import com.five_corp.p372ad.internal.movie.partialcache.InterfaceC13973g;
import com.five_corp.p372ad.internal.movie.partialcache.audio.C13947c;
import com.five_corp.p372ad.internal.movie.partialcache.audio.C13948d;
import com.five_corp.p372ad.internal.movie.partialcache.video.C14040d;
import com.five_corp.p372ad.internal.movie.partialcache.video.C14041e;
import com.five_corp.p372ad.internal.movie.partialcache.video.InterfaceC14039c;
import com.five_corp.p372ad.internal.p373ad.C13683n;
import com.five_corp.p372ad.internal.p373ad.C13689t;
import com.five_corp.p372ad.internal.view.C14123B;
import com.five_corp.p372ad.internal.view.RunnableC14153w;
import com.five_corp.p372ad.internal.view.RunnableC14156z;

/* renamed from: com.five_corp.ad.internal.movie.x */
/* loaded from: classes4.dex */
public final class C14060x implements InterfaceC13847G, InterfaceC13973g, InterfaceC13852L, InterfaceC14039c {

    /* renamed from: a */
    public final Handler f26214a;

    /* renamed from: b */
    public final InterfaceC13846F f26215b;

    /* renamed from: c */
    public final long f26216c;

    /* renamed from: d */
    public final C13683n f26217d;

    /* renamed from: e */
    public final C14123B f26218e;

    /* renamed from: f */
    public final TextureView$SurfaceTextureListenerC13853M f26219f;

    /* renamed from: g */
    public final C14033u1 f26220g;

    /* renamed from: h */
    public final C13976h f26221h;

    /* renamed from: i */
    public final C13947c f26222i;

    /* renamed from: j */
    public final C13948d f26223j;

    /* renamed from: k */
    public final C14040d f26224k;

    /* renamed from: l */
    public final C14041e f26225l;

    /* renamed from: m */
    public final C13958b f26226m;

    /* renamed from: n */
    public final Handler f26227n;

    /* renamed from: o */
    public int f26228o;

    /* renamed from: p */
    public long f26229p;

    /* renamed from: q */
    public Object f26230q;

    public C14060x(InterfaceC13846F interfaceC13846F, C13741n c13741n, C13760i c13760i, C13812h c13812h, C14123B c14123b, TextureView textureView, Looper looper, C13836a c13836a) {
        System.identityHashCode(this);
        this.f26214a = new Handler(Looper.getMainLooper());
        this.f26228o = 1;
        this.f26230q = null;
        Handler handler = new Handler(looper);
        this.f26227n = handler;
        this.f26215b = interfaceC13846F;
        this.f26216c = m78150a(c13760i.f25591b.f25190h);
        this.f26217d = c13760i.f25591b.f25191i;
        this.f26218e = c14123b;
        c14123b.m78082a();
        TextureView$SurfaceTextureListenerC13853M textureView$SurfaceTextureListenerC13853M = new TextureView$SurfaceTextureListenerC13853M(textureView, c13836a);
        this.f26219f = textureView$SurfaceTextureListenerC13853M;
        textureView$SurfaceTextureListenerC13853M.m78265a(this, handler);
        this.f26220g = new C14033u1(c13836a, c13741n, c13760i, c13812h, this, looper);
        this.f26221h = new C13976h(this);
        C13948d c13948d = new C13948d();
        this.f26223j = c13948d;
        C14041e c14041e = new C14041e();
        this.f26225l = c14041e;
        C13958b c13958b = new C13958b(c13948d, c14041e);
        this.f26226m = c13958b;
        this.f26222i = new C13947c(handler.getLooper(), c13958b, this);
        this.f26224k = new C14040d(handler.getLooper(), c13958b, this);
    }

    /* renamed from: a */
    public static void m78149a(C14060x c14060x, C13958b c13958b) {
        c14060x.getClass();
        if (c14060x.m78152a(c13958b.f26025b + c14060x.f26216c)) {
            Object obj = c14060x.f26230q;
            if (obj != null) {
                c14060x.f26227n.removeCallbacksAndMessages(obj);
                c14060x.f26230q = null;
            }
            int i = c14060x.f26228o;
            if (i == 11) {
                c14060x.f26228o = 6;
                c14060x.f26219f.m78264b();
                C14123B c14123b = c14060x.f26218e;
                c14123b.f26754e.post(new RunnableC14156z(c14123b));
                c14060x.f26214a.post(new RunnableC13857d(c14060x));
            } else if (i == 12) {
                c14060x.f26228o = 5;
                C14123B c14123b2 = c14060x.f26218e;
                c14123b2.f26754e.post(new RunnableC14156z(c14123b2));
                c14060x.f26214a.post(new RunnableC13857d(c14060x));
            }
        }
    }

    @Override // com.five_corp.p372ad.internal.movie.InterfaceC13847G
    /* renamed from: b */
    public final void mo78146b() {
        this.f26227n.post(new RunnableC13886l(this, new C14053q(this)));
    }

    @Override // com.five_corp.p372ad.internal.movie.InterfaceC13852L
    /* renamed from: c */
    public final void mo78145c() {
        int m78552a = AbstractC13610e.m78552a(this.f26228o);
        if (m78552a != 3) {
            if (m78552a == 6 || m78552a == 7 || m78552a == 8) {
                this.f26228o = 6;
                this.f26221h.m78200a();
                C14123B c14123b = this.f26218e;
                c14123b.f26754e.post(new RunnableC14153w(c14123b));
                this.f26222i.m78215a(this.f26226m);
            } else {
                return;
            }
        } else {
            this.f26228o = 3;
        }
        C14040d c14040d = this.f26224k;
        C13958b c13958b = this.f26226m;
        c14040d.getClass();
        C14040d.m78169a(c13958b);
    }

    @Override // com.five_corp.p372ad.internal.movie.InterfaceC13847G
    public final void pause() {
        this.f26227n.post(new RunnableC13886l(this, new C14055s(this)));
    }

    @Override // com.five_corp.p372ad.internal.movie.InterfaceC13847G
    public final void prepare() {
        this.f26227n.post(new RunnableC13886l(this, new C13890p(this)));
    }

    @Override // com.five_corp.p372ad.internal.movie.InterfaceC13847G
    public final void start() {
        this.f26227n.post(new RunnableC13886l(this, new C14054r(this)));
    }

    /* renamed from: a */
    public final boolean m78152a(long j) {
        boolean z;
        boolean z2;
        while (true) {
            C13948d c13948d = this.f26223j;
            if (!c13948d.f25998c || c13948d.f25999d || c13948d.f26000e >= j) {
                break;
            }
            C14045w1 m78176a = this.f26220g.m78176a();
            if (m78176a == null) {
                z = false;
                break;
            }
            this.f26223j.m78212a(m78176a);
        }
        z = true;
        while (true) {
            C14041e c14041e = this.f26225l;
            if (c14041e.f26182e || c14041e.f26183f >= j) {
                break;
            }
            C14045w1 m78171b = this.f26220g.m78171b();
            if (m78171b == null) {
                z2 = false;
                break;
            }
            this.f26225l.m78166a(m78171b);
        }
        z2 = true;
        return z && z2;
    }

    @Override // com.five_corp.p372ad.internal.movie.InterfaceC13847G
    /* renamed from: a */
    public final int mo78153a() {
        return (int) (this.f26226m.f26025b / 1000);
    }

    @Override // com.five_corp.p372ad.internal.movie.InterfaceC13847G
    public final void release() {
    }

    /* renamed from: a */
    public static long m78150a(C13689t c13689t) {
        if (c13689t == null) {
            return 2000000L;
        }
        return c13689t.f25399a * 1000;
    }

    /* renamed from: a */
    public final void m78148a(C14068s c14068s) {
        this.f26227n.postAtFrontOfQueue(new RunnableC13889o(this, new C13885k(this, c14068s)));
    }

    @Override // com.five_corp.p372ad.internal.movie.InterfaceC13852L
    /* renamed from: a */
    public final void mo78151a(Surface surface) {
        int i = this.f26228o;
        if (i == 3) {
            C14040d c14040d = this.f26224k;
            C13958b c13958b = this.f26226m;
            c14040d.getClass();
            c13958b.f26029f.m78164c();
            c13958b.f26028e.m78161a(surface, c13958b.f26025b);
            this.f26228o = 4;
        } else if (i == 6) {
            C14040d c14040d2 = this.f26224k;
            C13958b c13958b2 = this.f26226m;
            c14040d2.getClass();
            c13958b2.f26029f.m78164c();
            c13958b2.f26028e.m78161a(surface, c13958b2.f26025b);
            this.f26228o = 7;
        }
    }

    @Override // com.five_corp.p372ad.internal.movie.InterfaceC13847G
    /* renamed from: a */
    public final void mo78147a(boolean z) {
        this.f26227n.post(new RunnableC13886l(this, new C14056t(this, z)));
    }
}
