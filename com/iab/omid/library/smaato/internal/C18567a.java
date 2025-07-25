package com.iab.omid.library.smaato.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.smaato.adsession.C18559a;
import com.iab.omid.library.smaato.internal.C18570d;
import com.iab.omid.library.smaato.utils.C18598f;
import java.util.Date;

/* renamed from: com.iab.omid.library.smaato.internal.a */
/* loaded from: classes6.dex */
public class C18567a implements C18570d.InterfaceC18571a {

    /* renamed from: f */
    private static C18567a f46485f = new C18567a(new C18570d());

    /* renamed from: a */
    protected C18598f f46486a = new C18598f();

    /* renamed from: b */
    private Date f46487b;

    /* renamed from: c */
    private boolean f46488c;

    /* renamed from: d */
    private C18570d f46489d;

    /* renamed from: e */
    private boolean f46490e;

    private C18567a(C18570d c18570d) {
        this.f46489d = c18570d;
    }

    /* renamed from: a */
    public static C18567a m62250a() {
        return f46485f;
    }

    /* renamed from: c */
    private void m62247c() {
        if (this.f46488c && this.f46487b != null) {
            for (C18559a c18559a : C18569c.m62240c().m62244a()) {
                c18559a.getAdSessionStatePublisher().m62163a(m62248b());
            }
        }
    }

    /* renamed from: b */
    public Date m62248b() {
        Date date = this.f46487b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m62246d() {
        Date m62113a = this.f46486a.m62113a();
        Date date = this.f46487b;
        if (date == null || m62113a.after(date)) {
            this.f46487b = m62113a;
            m62247c();
        }
    }

    /* renamed from: a */
    public void m62249a(@NonNull Context context) {
        if (this.f46488c) {
            return;
        }
        this.f46489d.m62236a(context);
        this.f46489d.m62235a(this);
        this.f46489d.m62229e();
        this.f46490e = this.f46489d.m62231c();
        this.f46488c = true;
    }

    @Override // com.iab.omid.library.smaato.internal.C18570d.InterfaceC18571a
    /* renamed from: a */
    public void mo62192a(boolean z) {
        if (!this.f46490e && z) {
            m62246d();
        }
        this.f46490e = z;
    }
}
