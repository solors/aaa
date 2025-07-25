package com.iab.omid.library.vungle.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.vungle.adsession.C18737a;
import com.iab.omid.library.vungle.internal.C18748d;
import com.iab.omid.library.vungle.utils.C18776f;
import java.util.Date;

/* renamed from: com.iab.omid.library.vungle.internal.a */
/* loaded from: classes6.dex */
public class C18745a implements C18748d.InterfaceC18749a {

    /* renamed from: f */
    private static C18745a f46876f = new C18745a(new C18748d());

    /* renamed from: a */
    protected C18776f f46877a = new C18776f();

    /* renamed from: b */
    private Date f46878b;

    /* renamed from: c */
    private boolean f46879c;

    /* renamed from: d */
    private C18748d f46880d;

    /* renamed from: e */
    private boolean f46881e;

    private C18745a(C18748d c18748d) {
        this.f46880d = c18748d;
    }

    /* renamed from: a */
    public static C18745a m61528a() {
        return f46876f;
    }

    /* renamed from: c */
    private void m61525c() {
        if (this.f46879c && this.f46878b != null) {
            for (C18737a c18737a : C18747c.m61518c().m61522a()) {
                c18737a.getAdSessionStatePublisher().m61441a(m61526b());
            }
        }
    }

    /* renamed from: b */
    public Date m61526b() {
        Date date = this.f46878b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m61524d() {
        Date m61391a = this.f46877a.m61391a();
        Date date = this.f46878b;
        if (date == null || m61391a.after(date)) {
            this.f46878b = m61391a;
            m61525c();
        }
    }

    /* renamed from: a */
    public void m61527a(@NonNull Context context) {
        if (this.f46879c) {
            return;
        }
        this.f46880d.m61514a(context);
        this.f46880d.m61513a(this);
        this.f46880d.m61507e();
        this.f46881e = this.f46880d.m61509c();
        this.f46879c = true;
    }

    @Override // com.iab.omid.library.vungle.internal.C18748d.InterfaceC18749a
    /* renamed from: a */
    public void mo61470a(boolean z) {
        if (!this.f46881e && z) {
            m61524d();
        }
        this.f46881e = z;
    }
}
