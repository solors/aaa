package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.unity3d.adsession.C18678a;
import com.iab.omid.library.unity3d.internal.C18689d;
import com.iab.omid.library.unity3d.utils.C18714f;
import java.util.Date;

/* renamed from: com.iab.omid.library.unity3d.internal.a */
/* loaded from: classes6.dex */
public class C18686a implements C18689d.InterfaceC18690a {

    /* renamed from: f */
    private static C18686a f46749f = new C18686a(new C18689d());

    /* renamed from: a */
    protected C18714f f46750a = new C18714f();

    /* renamed from: b */
    private Date f46751b;

    /* renamed from: c */
    private boolean f46752c;

    /* renamed from: d */
    private C18689d f46753d;

    /* renamed from: e */
    private boolean f46754e;

    private C18686a(C18689d c18689d) {
        this.f46753d = c18689d;
    }

    /* renamed from: a */
    public static C18686a m61759a() {
        return f46749f;
    }

    /* renamed from: c */
    private void m61756c() {
        if (this.f46752c && this.f46751b != null) {
            for (C18678a c18678a : C18688c.m61749c().m61753a()) {
                c18678a.getAdSessionStatePublisher().m61686a(m61757b());
            }
        }
    }

    /* renamed from: b */
    public Date m61757b() {
        Date date = this.f46751b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m61755d() {
        Date m61639a = this.f46750a.m61639a();
        Date date = this.f46751b;
        if (date == null || m61639a.after(date)) {
            this.f46751b = m61639a;
            m61756c();
        }
    }

    /* renamed from: a */
    public void m61758a(@NonNull Context context) {
        if (this.f46752c) {
            return;
        }
        this.f46753d.m61745a(context);
        this.f46753d.m61744a(this);
        this.f46753d.m61738e();
        this.f46754e = this.f46753d.m61740c();
        this.f46752c = true;
    }

    @Override // com.iab.omid.library.unity3d.internal.C18689d.InterfaceC18690a
    /* renamed from: a */
    public void mo61709a(boolean z) {
        if (!this.f46754e && z) {
            m61755d();
        }
        this.f46754e = z;
    }
}
