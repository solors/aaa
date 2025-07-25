package com.iab.omid.library.taurusx.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.taurusx.adsession.C18621a;
import com.iab.omid.library.taurusx.internal.C18632d;
import com.iab.omid.library.taurusx.utils.C18657f;
import java.util.Date;

/* renamed from: com.iab.omid.library.taurusx.internal.a */
/* loaded from: classes6.dex */
public class C18629a implements C18632d.InterfaceC18633a {

    /* renamed from: f */
    private static C18629a f46621f = new C18629a(new C18632d());

    /* renamed from: a */
    protected C18657f f46622a = new C18657f();

    /* renamed from: b */
    private Date f46623b;

    /* renamed from: c */
    private boolean f46624c;

    /* renamed from: d */
    private C18632d f46625d;

    /* renamed from: e */
    private boolean f46626e;

    private C18629a(C18632d c18632d) {
        this.f46625d = c18632d;
    }

    /* renamed from: a */
    public static C18629a m61994a() {
        return f46621f;
    }

    /* renamed from: c */
    private void m61991c() {
        if (this.f46624c && this.f46623b != null) {
            for (C18621a c18621a : C18631c.m61984c().m61988a()) {
                c18621a.getAdSessionStatePublisher().m61920a(m61992b());
            }
        }
    }

    /* renamed from: b */
    public Date m61992b() {
        Date date = this.f46623b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m61990d() {
        Date m61873a = this.f46622a.m61873a();
        Date date = this.f46623b;
        if (date == null || m61873a.after(date)) {
            this.f46623b = m61873a;
            m61991c();
        }
    }

    /* renamed from: a */
    public void m61993a(@NonNull Context context) {
        if (this.f46624c) {
            return;
        }
        this.f46625d.m61980a(context);
        this.f46625d.m61979a(this);
        this.f46625d.m61973e();
        this.f46626e = this.f46625d.m61975c();
        this.f46624c = true;
    }

    @Override // com.iab.omid.library.taurusx.internal.C18632d.InterfaceC18633a
    /* renamed from: a */
    public void mo61943a(boolean z) {
        if (!this.f46626e && z) {
            m61990d();
        }
        this.f46626e = z;
    }
}
