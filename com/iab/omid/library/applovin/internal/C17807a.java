package com.iab.omid.library.applovin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.applovin.adsession.C17799a;
import com.iab.omid.library.applovin.internal.C17810d;
import com.iab.omid.library.applovin.utils.C17836f;
import java.util.Date;

/* renamed from: com.iab.omid.library.applovin.internal.a */
/* loaded from: classes6.dex */
public class C17807a implements C17810d.InterfaceC17811a {

    /* renamed from: f */
    private static C17807a f44928f = new C17807a(new C17810d());

    /* renamed from: a */
    protected C17836f f44929a = new C17836f();

    /* renamed from: b */
    private Date f44930b;

    /* renamed from: c */
    private boolean f44931c;

    /* renamed from: d */
    private C17810d f44932d;

    /* renamed from: e */
    private boolean f44933e;

    private C17807a(C17810d c17810d) {
        this.f44932d = c17810d;
    }

    /* renamed from: a */
    public static C17807a m65149a() {
        return f44928f;
    }

    /* renamed from: c */
    private void m65146c() {
        if (this.f44931c && this.f44930b != null) {
            for (C17799a c17799a : C17809c.m65139c().m65143a()) {
                c17799a.getAdSessionStatePublisher().m65069a(m65147b());
            }
        }
    }

    /* renamed from: b */
    public Date m65147b() {
        Date date = this.f44930b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m65145d() {
        Date m65021a = this.f44929a.m65021a();
        Date date = this.f44930b;
        if (date == null || m65021a.after(date)) {
            this.f44930b = m65021a;
            m65146c();
        }
    }

    /* renamed from: a */
    public void m65148a(@NonNull Context context) {
        if (this.f44931c) {
            return;
        }
        this.f44932d.m65135a(context);
        this.f44932d.m65134a(this);
        this.f44932d.m65128e();
        this.f44933e = this.f44932d.m65130c();
        this.f44931c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.C17810d.InterfaceC17811a
    /* renamed from: a */
    public void mo65092a(boolean z) {
        if (!this.f44933e && z) {
            m65145d();
        }
        this.f44933e = z;
    }
}
