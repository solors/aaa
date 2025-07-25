package com.iab.omid.library.appodeal.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.appodeal.adsession.C17867a;
import com.iab.omid.library.appodeal.internal.C17878d;
import com.iab.omid.library.appodeal.utils.C17906f;
import java.util.Date;

/* renamed from: com.iab.omid.library.appodeal.internal.a */
/* loaded from: classes6.dex */
public class C17875a implements C17878d.InterfaceC17879a {

    /* renamed from: f */
    private static C17875a f45057f = new C17875a(new C17878d());

    /* renamed from: a */
    protected C17906f f45058a = new C17906f();

    /* renamed from: b */
    private Date f45059b;

    /* renamed from: c */
    private boolean f45060c;

    /* renamed from: d */
    private C17878d f45061d;

    /* renamed from: e */
    private boolean f45062e;

    private C17875a(C17878d c17878d) {
        this.f45061d = c17878d;
    }

    /* renamed from: a */
    public static C17875a m64908a() {
        return f45057f;
    }

    /* renamed from: c */
    private void m64905c() {
        if (this.f45060c && this.f45059b != null) {
            for (C17867a c17867a : C17877c.m64898c().m64902a()) {
                c17867a.getAdSessionStatePublisher().m64821a(m64906b());
            }
        }
    }

    /* renamed from: b */
    public Date m64906b() {
        Date date = this.f45059b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m64904d() {
        Date m64771a = this.f45058a.m64771a();
        Date date = this.f45059b;
        if (date == null || m64771a.after(date)) {
            this.f45059b = m64771a;
            m64905c();
        }
    }

    /* renamed from: a */
    public void m64907a(@NonNull Context context) {
        if (this.f45060c) {
            return;
        }
        this.f45061d.m64894a(context);
        this.f45061d.m64893a(this);
        this.f45061d.m64887e();
        this.f45062e = this.f45061d.m64889c();
        this.f45060c = true;
    }

    @Override // com.iab.omid.library.appodeal.internal.C17878d.InterfaceC17879a
    /* renamed from: a */
    public void mo64850a(boolean z) {
        if (!this.f45062e && z) {
            m64904d();
        }
        this.f45062e = z;
    }
}
