package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.ironsrc.adsession.C18228a;
import com.iab.omid.library.ironsrc.internal.C18239d;
import com.iab.omid.library.ironsrc.utils.C18263f;
import java.util.Date;

/* renamed from: com.iab.omid.library.ironsrc.internal.a */
/* loaded from: classes6.dex */
public class C18236a implements C18239d.InterfaceC18240a {

    /* renamed from: f */
    private static C18236a f45821f = new C18236a(new C18239d());

    /* renamed from: a */
    protected C18263f f45822a = new C18263f();

    /* renamed from: b */
    private Date f45823b;

    /* renamed from: c */
    private boolean f45824c;

    /* renamed from: d */
    private C18239d f45825d;

    /* renamed from: e */
    private boolean f45826e;

    private C18236a(C18239d c18239d) {
        this.f45825d = c18239d;
    }

    /* renamed from: a */
    public static C18236a m63494a() {
        return f45821f;
    }

    /* renamed from: c */
    private void m63491c() {
        if (this.f45824c && this.f45823b != null) {
            for (C18228a c18228a : C18238c.m63484c().m63488a()) {
                c18228a.getAdSessionStatePublisher().m63420a(m63492b());
            }
        }
    }

    /* renamed from: b */
    public Date m63492b() {
        Date date = this.f45823b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m63490d() {
        Date m63373a = this.f45822a.m63373a();
        Date date = this.f45823b;
        if (date == null || m63373a.after(date)) {
            this.f45823b = m63373a;
            m63491c();
        }
    }

    /* renamed from: a */
    public void m63493a(@NonNull Context context) {
        if (this.f45824c) {
            return;
        }
        this.f45825d.m63480a(context);
        this.f45825d.m63479a(this);
        this.f45825d.m63473e();
        this.f45826e = this.f45825d.m63475c();
        this.f45824c = true;
    }

    @Override // com.iab.omid.library.ironsrc.internal.C18239d.InterfaceC18240a
    /* renamed from: a */
    public void mo63443a(boolean z) {
        if (!this.f45826e && z) {
            m63490d();
        }
        this.f45826e = z;
    }
}
