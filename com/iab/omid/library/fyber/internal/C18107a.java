package com.iab.omid.library.fyber.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.fyber.adsession.C18099a;
import com.iab.omid.library.fyber.internal.C18110d;
import com.iab.omid.library.fyber.utils.C18138f;
import java.util.Date;

/* renamed from: com.iab.omid.library.fyber.internal.a */
/* loaded from: classes6.dex */
public class C18107a implements C18110d.InterfaceC18111a {

    /* renamed from: f */
    private static C18107a f45556f = new C18107a(new C18110d());

    /* renamed from: a */
    protected C18138f f45557a = new C18138f();

    /* renamed from: b */
    private Date f45558b;

    /* renamed from: c */
    private boolean f45559c;

    /* renamed from: d */
    private C18110d f45560d;

    /* renamed from: e */
    private boolean f45561e;

    private C18107a(C18110d c18110d) {
        this.f45560d = c18110d;
    }

    /* renamed from: a */
    public static C18107a m63991a() {
        return f45556f;
    }

    /* renamed from: c */
    private void m63988c() {
        if (this.f45559c && this.f45558b != null) {
            for (C18099a c18099a : C18109c.m63981c().m63985a()) {
                c18099a.getAdSessionStatePublisher().m63904a(m63989b());
            }
        }
    }

    /* renamed from: b */
    public Date m63989b() {
        Date date = this.f45558b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m63987d() {
        Date m63854a = this.f45557a.m63854a();
        Date date = this.f45558b;
        if (date == null || m63854a.after(date)) {
            this.f45558b = m63854a;
            m63988c();
        }
    }

    /* renamed from: a */
    public void m63990a(@NonNull Context context) {
        if (this.f45559c) {
            return;
        }
        this.f45560d.m63977a(context);
        this.f45560d.m63976a(this);
        this.f45560d.m63970e();
        this.f45561e = this.f45560d.m63972c();
        this.f45559c = true;
    }

    @Override // com.iab.omid.library.fyber.internal.C18110d.InterfaceC18111a
    /* renamed from: a */
    public void mo63933a(boolean z) {
        if (!this.f45561e && z) {
            m63987d();
        }
        this.f45561e = z;
    }
}
