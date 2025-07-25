package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.mmadbridge.adsession.C18286a;
import com.iab.omid.library.mmadbridge.internal.C18297d;
import com.iab.omid.library.mmadbridge.utils.C18325f;
import java.util.Date;

/* renamed from: com.iab.omid.library.mmadbridge.internal.a */
/* loaded from: classes6.dex */
public class C18294a implements C18297d.InterfaceC18298a {

    /* renamed from: f */
    private static C18294a f45945f = new C18294a(new C18297d());

    /* renamed from: a */
    protected C18325f f45946a = new C18325f();

    /* renamed from: b */
    private Date f45947b;

    /* renamed from: c */
    private boolean f45948c;

    /* renamed from: d */
    private C18297d f45949d;

    /* renamed from: e */
    private boolean f45950e;

    private C18294a(C18297d c18297d) {
        this.f45949d = c18297d;
    }

    /* renamed from: a */
    public static C18294a m63262a() {
        return f45945f;
    }

    /* renamed from: c */
    private void m63259c() {
        if (this.f45948c && this.f45947b != null) {
            for (C18286a c18286a : C18296c.m63252c().m63256a()) {
                c18286a.getAdSessionStatePublisher().m63175a(m63260b());
            }
        }
    }

    /* renamed from: b */
    public Date m63260b() {
        Date date = this.f45947b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m63258d() {
        Date m63125a = this.f45946a.m63125a();
        Date date = this.f45947b;
        if (date == null || m63125a.after(date)) {
            this.f45947b = m63125a;
            m63259c();
        }
    }

    /* renamed from: a */
    public void m63261a(@NonNull Context context) {
        if (this.f45948c) {
            return;
        }
        this.f45949d.m63248a(context);
        this.f45949d.m63247a(this);
        this.f45949d.m63241e();
        this.f45950e = this.f45949d.m63243c();
        this.f45948c = true;
    }

    @Override // com.iab.omid.library.mmadbridge.internal.C18297d.InterfaceC18298a
    /* renamed from: a */
    public void mo63204a(boolean z) {
        if (!this.f45950e && z) {
            m63258d();
        }
        this.f45950e = z;
    }
}
