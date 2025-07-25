package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.my.target.w7 */
/* loaded from: classes7.dex */
public class C26193w7 {

    /* renamed from: a */
    public boolean f68145a;

    /* renamed from: b */
    public C26060r7 f68146b;

    /* renamed from: c */
    public Set f68147c;

    /* renamed from: d */
    public C25711da f68148d;

    /* renamed from: e */
    public Context f68149e;

    /* renamed from: f */
    public String f68150f;

    /* renamed from: g */
    public InterfaceC26194a f68151g;

    /* renamed from: h */
    public float f68152h;

    /* renamed from: i */
    public boolean f68153i;

    /* renamed from: com.my.target.w7$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC26194a {
        /* renamed from: a */
        void mo42563a();
    }

    public C26193w7(C25704d5 c25704d5, C26060r7 c26060r7, Context context) {
        this.f68153i = true;
        this.f68146b = c26060r7;
        if (context != null) {
            this.f68149e = context.getApplicationContext();
        }
        if (c25704d5 == null) {
            return;
        }
        this.f68148d = c25704d5.getStatHolder();
        this.f68147c = c25704d5.getStatHolder().m44009a();
        this.f68150f = c25704d5.getId();
        this.f68152h = c25704d5.getDuration();
        this.f68153i = c25704d5.isLogErrors();
    }

    /* renamed from: b */
    public static C26193w7 m42574b() {
        return new C26193w7(null, null, null);
    }

    /* renamed from: a */
    public final boolean m42582a() {
        return this.f68149e == null || this.f68148d == null || this.f68147c == null;
    }

    /* renamed from: c */
    public void m42571c() {
        if (m42582a()) {
            return;
        }
        this.f68147c = this.f68148d.m44009a();
        this.f68145a = false;
    }

    /* renamed from: d */
    public void m42570d() {
        if (m42582a()) {
            return;
        }
        C25735ea.m43958a(this.f68148d.m43997b("closedByUser"), this.f68149e);
    }

    /* renamed from: e */
    public void m42569e() {
        if (m42582a()) {
            return;
        }
        C25735ea.m43958a(this.f68148d.m43997b("playbackCompleted"), this.f68149e);
    }

    /* renamed from: f */
    public void m42568f() {
        if (m42582a()) {
            return;
        }
        C25735ea.m43958a(this.f68148d.m43997b("playbackPaused"), this.f68149e);
        C26060r7 c26060r7 = this.f68146b;
        if (c26060r7 != null) {
            c26060r7.m43059a(0);
        }
    }

    /* renamed from: g */
    public void m42567g() {
        if (m42582a()) {
            return;
        }
        C25735ea.m43958a(this.f68148d.m43997b("error"), this.f68149e);
        C25735ea.m43958a(this.f68148d.m43997b("playbackError"), this.f68149e);
        C26060r7 c26060r7 = this.f68146b;
        if (c26060r7 != null) {
            c26060r7.m43059a(3);
        }
    }

    /* renamed from: h */
    public void m42566h() {
        if (m42582a()) {
            return;
        }
        C25735ea.m43958a(this.f68148d.m43997b("playbackTimeout"), this.f68149e);
    }

    /* renamed from: i */
    public void m42565i() {
        if (m42582a()) {
            return;
        }
        C25735ea.m43958a(this.f68148d.m43997b("playbackResumed"), this.f68149e);
        C26060r7 c26060r7 = this.f68146b;
        if (c26060r7 != null) {
            c26060r7.m43059a(1);
        }
    }

    /* renamed from: j */
    public void m42564j() {
        if (m42582a()) {
            return;
        }
        C25735ea.m43958a(this.f68148d.m43997b("playbackStopped"), this.f68149e);
    }

    /* renamed from: a */
    public static C26193w7 m42578a(C25704d5 c25704d5, C26060r7 c26060r7, Context context) {
        return new C26193w7(c25704d5, c26060r7, context);
    }

    /* renamed from: b */
    public void m42573b(float f, float f2) {
        C25711da c25711da;
        String str;
        if (AbstractC26075s1.m42940a(f, f2) == 0) {
            return;
        }
        if (!m42582a()) {
            if (AbstractC26075s1.m42940a(0.0f, f) == 0) {
                c25711da = this.f68148d;
                str = "volumeOn";
            } else if (AbstractC26075s1.m42940a(0.0f, f2) == 0) {
                c25711da = this.f68148d;
                str = "volumeOff";
            }
            C25735ea.m43958a(c25711da.m43997b(str), this.f68149e);
        }
        C26060r7 c26060r7 = this.f68146b;
        if (c26060r7 != null) {
            c26060r7.m43061a(f2);
        }
    }

    /* renamed from: a */
    public void m42580a(Context context) {
        this.f68149e = context;
    }

    /* renamed from: b */
    public void m42572b(boolean z) {
        if (m42582a()) {
            return;
        }
        C25735ea.m43958a(this.f68148d.m43997b(z ? "volumeOn" : "volumeOff"), this.f68149e);
        C26060r7 c26060r7 = this.f68146b;
        if (c26060r7 != null) {
            c26060r7.m43061a(z ? 1.0f : 0.0f);
        }
    }

    /* renamed from: a */
    public void m42579a(C25704d5 c25704d5) {
        if (c25704d5 != null) {
            if (c25704d5.getStatHolder() != this.f68148d) {
                this.f68145a = false;
            }
            this.f68148d = c25704d5.getStatHolder();
            this.f68147c = c25704d5.getStatHolder().m44009a();
            this.f68153i = c25704d5.isLogErrors();
        } else {
            this.f68148d = null;
            this.f68147c = null;
        }
        this.f68150f = null;
        this.f68152h = 0.0f;
    }

    /* renamed from: a */
    public void m42577a(C26060r7 c26060r7) {
        this.f68146b = c26060r7;
    }

    /* renamed from: a */
    public void m42576a(InterfaceC26194a interfaceC26194a) {
        this.f68151g = interfaceC26194a;
    }

    /* renamed from: a */
    public void m42575a(boolean z) {
        if (m42582a()) {
            return;
        }
        C25735ea.m43958a(this.f68148d.m43997b(z ? "fullscreenOn" : "fullscreenOff"), this.f68149e);
        C26060r7 c26060r7 = this.f68146b;
        if (c26060r7 != null) {
            c26060r7.m43047a(z);
        }
    }

    /* renamed from: a */
    public void m42581a(float f, float f2) {
        if (m42582a()) {
            return;
        }
        if (!this.f68145a) {
            C25735ea.m43958a(this.f68148d.m43997b("playbackStarted"), this.f68149e);
            InterfaceC26194a interfaceC26194a = this.f68151g;
            if (interfaceC26194a != null) {
                interfaceC26194a.mo42563a();
            }
            this.f68145a = true;
        }
        if (!this.f68147c.isEmpty()) {
            Iterator it = this.f68147c.iterator();
            while (it.hasNext()) {
                C25659b8 c25659b8 = (C25659b8) it.next();
                if (AbstractC26075s1.m42940a(c25659b8.m44156e(), f) != 1) {
                    C25735ea.m43964a(c25659b8, this.f68149e);
                    it.remove();
                }
            }
        }
        C26060r7 c26060r7 = this.f68146b;
        if (c26060r7 != null) {
            c26060r7.m43044b(f, f2);
        }
        if (this.f68152h <= 0.0f || f2 <= 0.0f || TextUtils.isEmpty(this.f68150f) || !this.f68153i || Math.abs(f2 - this.f68152h) <= 1.5f) {
            return;
        }
        C25656b5 m44178a = C25656b5.m44178a("Bad value");
        m44178a.m44173e("Media duration error: expected " + this.f68152h + ", but was " + f2).m44175c(this.f68150f).m44177b(this.f68149e);
        this.f68153i = false;
    }
}
