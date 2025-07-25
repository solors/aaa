package io.appmetrica.analytics.impl;

import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.yb */
/* loaded from: classes9.dex */
public final class C35037yb implements InterfaceC34439c {

    /* renamed from: a */
    public final InterfaceC34413b0 f95655a;

    /* renamed from: b */
    public final C33828Cm f95656b = new C33828Cm();

    public C35037yb(@NotNull InterfaceC34413b0 interfaceC34413b0) {
        this.f95655a = interfaceC34413b0;
    }

    /* renamed from: a */
    public static final void m20739a(C35037yb c35037yb, C34217T c34217t) {
        c35037yb.f95655a.mo21536a(c34217t);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34439c
    public final void onAppNotResponding() {
        StackTraceElement[] stackTraceElementArr;
        C33828Cm c33828Cm = this.f95656b;
        Thread mo20706a = c33828Cm.f92680a.mo20706a();
        try {
            stackTraceElementArr = c33828Cm.f92680a.mo20705b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = mo20706a.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        final C34217T c34217t = new C34217T((C34970vm) c33828Cm.f92681b.apply(mo20706a, stackTraceElementArr), c33828Cm.m22727a(mo20706a, null), c33828Cm.f92682c.m22156b());
        ((C35009x9) C34848r4.m21050i().f95251c.m21639a()).f95592b.post(new Runnable() { // from class: io.appmetrica.analytics.impl.pp
            {
                C35037yb.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C35037yb.m20739a(C35037yb.this, c34217t);
            }
        });
    }
}
