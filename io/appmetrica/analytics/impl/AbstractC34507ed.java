package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* renamed from: io.appmetrica.analytics.impl.ed */
/* loaded from: classes9.dex */
public abstract class AbstractC34507ed implements InterfaceC34490dn, InterfaceC34658k2 {

    /* renamed from: a */
    public final String f94254a;

    /* renamed from: b */
    public final int f94255b;

    /* renamed from: c */
    public final InterfaceC34867rn f94256c;

    /* renamed from: d */
    public final AbstractC34196S2 f94257d;

    /* renamed from: e */
    public PublicLogger f94258e = PublicLogger.getAnonymousInstance();

    public AbstractC34507ed(int i, String str, InterfaceC34867rn interfaceC34867rn, AbstractC34196S2 abstractC34196S2) {
        this.f94255b = i;
        this.f94254a = str;
        this.f94256c = interfaceC34867rn;
        this.f94257d = abstractC34196S2;
    }

    @NonNull
    /* renamed from: a */
    public final C34517en m21788a() {
        C34517en c34517en = new C34517en();
        c34517en.f94287b = this.f94255b;
        c34517en.f94286a = this.f94254a.getBytes();
        c34517en.f94289d = new C34571gn();
        c34517en.f94288c = new C34544fn();
        return c34517en;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34490dn
    /* renamed from: a */
    public abstract /* synthetic */ void mo21787a(@NonNull C34463cn c34463cn);

    @NonNull
    /* renamed from: b */
    public final AbstractC34196S2 m21785b() {
        return this.f94257d;
    }

    @NonNull
    /* renamed from: c */
    public final String m21784c() {
        return this.f94254a;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: d */
    public final InterfaceC34867rn m21783d() {
        return this.f94256c;
    }

    /* renamed from: e */
    public final int m21782e() {
        return this.f94255b;
    }

    /* renamed from: f */
    public final boolean m21781f() {
        C34814pn mo20778a = this.f94256c.mo20778a(this.f94254a);
        if (mo20778a.f95187a) {
            return true;
        }
        PublicLogger publicLogger = this.f94258e;
        publicLogger.warning("Attribute " + this.f94254a + " of type " + ((String) AbstractC34097Nm.f93287a.get(this.f94255b)) + " is skipped because " + mo20778a.f95188b, new Object[0]);
        return false;
    }

    /* renamed from: a */
    public final void m21786a(@NonNull PublicLogger publicLogger) {
        this.f94258e = publicLogger;
    }
}
