package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.inmobi.adsession.C18169a;
import com.iab.omid.library.inmobi.internal.C18180d;
import com.iab.omid.library.inmobi.utils.C18206f;
import java.util.Date;

/* renamed from: com.iab.omid.library.inmobi.internal.a */
/* loaded from: classes6.dex */
public class C18177a implements C18180d.InterfaceC18181a {

    /* renamed from: f */
    private static C18177a f45691f = new C18177a(new C18180d());

    /* renamed from: a */
    protected C18206f f45692a = new C18206f();

    /* renamed from: b */
    private Date f45693b;

    /* renamed from: c */
    private boolean f45694c;

    /* renamed from: d */
    private C18180d f45695d;

    /* renamed from: e */
    private boolean f45696e;

    private C18177a(C18180d c18180d) {
        this.f45695d = c18180d;
    }

    /* renamed from: a */
    public static C18177a m63738a() {
        return f45691f;
    }

    /* renamed from: c */
    private void m63735c() {
        if (this.f45694c && this.f45693b != null) {
            for (C18169a c18169a : C18179c.m63728c().m63732a()) {
                c18169a.getAdSessionStatePublisher().m63658a(m63736b());
            }
        }
    }

    /* renamed from: b */
    public Date m63736b() {
        Date date = this.f45693b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m63734d() {
        Date m63610a = this.f45692a.m63610a();
        Date date = this.f45693b;
        if (date == null || m63610a.after(date)) {
            this.f45693b = m63610a;
            m63735c();
        }
    }

    /* renamed from: a */
    public void m63737a(@NonNull Context context) {
        if (this.f45694c) {
            return;
        }
        this.f45695d.m63724a(context);
        this.f45695d.m63723a(this);
        this.f45695d.m63717e();
        this.f45696e = this.f45695d.m63719c();
        this.f45694c = true;
    }

    @Override // com.iab.omid.library.inmobi.internal.C18180d.InterfaceC18181a
    /* renamed from: a */
    public void mo63681a(boolean z) {
        if (!this.f45696e && z) {
            m63734d();
        }
        this.f45696e = z;
    }
}
