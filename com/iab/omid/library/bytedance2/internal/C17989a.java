package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.bytedance2.adsession.C17981a;
import com.iab.omid.library.bytedance2.internal.C17992d;
import com.iab.omid.library.bytedance2.utils.C18018f;
import java.util.Date;

/* renamed from: com.iab.omid.library.bytedance2.internal.a */
/* loaded from: classes6.dex */
public class C17989a implements C17992d.InterfaceC17993a {

    /* renamed from: f */
    private static C17989a f45313f = new C17989a(new C17992d());

    /* renamed from: a */
    protected C18018f f45314a = new C18018f();

    /* renamed from: b */
    private Date f45315b;

    /* renamed from: c */
    private boolean f45316c;

    /* renamed from: d */
    private C17992d f45317d;

    /* renamed from: e */
    private boolean f45318e;

    private C17989a(C17992d c17992d) {
        this.f45317d = c17992d;
    }

    /* renamed from: a */
    public static C17989a m64441a() {
        return f45313f;
    }

    /* renamed from: c */
    private void m64438c() {
        if (this.f45316c && this.f45315b != null) {
            for (C17981a c17981a : C17991c.m64431c().m64435a()) {
                c17981a.getAdSessionStatePublisher().m64361a(m64439b());
            }
        }
    }

    /* renamed from: b */
    public Date m64439b() {
        Date date = this.f45315b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m64437d() {
        Date m64313a = this.f45314a.m64313a();
        Date date = this.f45315b;
        if (date == null || m64313a.after(date)) {
            this.f45315b = m64313a;
            m64438c();
        }
    }

    /* renamed from: a */
    public void m64440a(@NonNull Context context) {
        if (this.f45316c) {
            return;
        }
        this.f45317d.m64427a(context);
        this.f45317d.m64426a(this);
        this.f45317d.m64420e();
        this.f45318e = this.f45317d.m64422c();
        this.f45316c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.C17992d.InterfaceC17993a
    /* renamed from: a */
    public void mo64384a(boolean z) {
        if (!this.f45318e && z) {
            m64437d();
        }
        this.f45318e = z;
    }
}
