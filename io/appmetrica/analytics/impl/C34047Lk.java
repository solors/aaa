package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.Lk */
/* loaded from: classes9.dex */
public final class C34047Lk {

    /* renamed from: a */
    public final C34747na f93193a = new C34747na();

    /* renamed from: b */
    public final HashMap f93194b = new HashMap();

    /* renamed from: c */
    public C34650jl f93195c = null;

    /* renamed from: d */
    public final C33999Jk f93196d = new C33999Jk(this);

    /* renamed from: a */
    public static final C34047Lk m22462a() {
        return AbstractC34023Kk.f93159a;
    }

    /* renamed from: a */
    public final C33902Fl m22461a(Context context, C34391a5 c34391a5, C34488dl c34488dl) {
        C33902Fl c33902Fl = (C33902Fl) this.f93194b.get(c34391a5.f93912a);
        boolean z = true;
        if (c33902Fl == null) {
            synchronized (this.f93194b) {
                c33902Fl = (C33902Fl) this.f93194b.get(c34391a5.f93912a);
                if (c33902Fl == null) {
                    c33902Fl = new C33902Fl(new C33927Gl(context, c34391a5.f93912a, c34488dl, this.f93196d));
                    c33902Fl.m22598f();
                    this.f93194b.put(c34391a5.f93912a, c33902Fl);
                    z = false;
                }
            }
        }
        if (z) {
            c33902Fl.m22608a(c34488dl);
        }
        return c33902Fl;
    }

    /* renamed from: a */
    public final void m22460a(C34391a5 c34391a5, InterfaceC34262Uk interfaceC34262Uk) {
        synchronized (this.f93194b) {
            this.f93193a.m21305a(c34391a5.f93912a, interfaceC34262Uk);
            C34650jl c34650jl = this.f93195c;
            if (c34650jl != null) {
                interfaceC34262Uk.mo21631a(c34650jl);
            }
        }
    }
}
