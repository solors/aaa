package com.iab.omid.library.mobilefuse.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.mobilefuse.adsession.C18356a;
import com.iab.omid.library.mobilefuse.internal.C18367d;
import com.iab.omid.library.mobilefuse.utils.C18395f;
import java.util.Date;

/* renamed from: com.iab.omid.library.mobilefuse.internal.a */
/* loaded from: classes6.dex */
public class C18364a implements C18367d.InterfaceC18368a {

    /* renamed from: f */
    private static C18364a f46080f = new C18364a(new C18367d());

    /* renamed from: a */
    protected C18395f f46081a = new C18395f();

    /* renamed from: b */
    private Date f46082b;

    /* renamed from: c */
    private boolean f46083c;

    /* renamed from: d */
    private C18367d f46084d;

    /* renamed from: e */
    private boolean f46085e;

    private C18364a(C18367d c18367d) {
        this.f46084d = c18367d;
    }

    /* renamed from: a */
    public static C18364a m63009a() {
        return f46080f;
    }

    /* renamed from: c */
    private void m63006c() {
        if (this.f46083c && this.f46082b != null) {
            for (C18356a c18356a : C18366c.m62999c().m63003a()) {
                c18356a.getAdSessionStatePublisher().m62922a(m63007b());
            }
        }
    }

    /* renamed from: b */
    public Date m63007b() {
        Date date = this.f46082b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m63005d() {
        Date m62872a = this.f46081a.m62872a();
        Date date = this.f46082b;
        if (date == null || m62872a.after(date)) {
            this.f46082b = m62872a;
            m63006c();
        }
    }

    /* renamed from: a */
    public void m63008a(@NonNull Context context) {
        if (this.f46083c) {
            return;
        }
        this.f46084d.m62995a(context);
        this.f46084d.m62994a(this);
        this.f46084d.m62988e();
        this.f46085e = this.f46084d.m62990c();
        this.f46083c = true;
    }

    @Override // com.iab.omid.library.mobilefuse.internal.C18367d.InterfaceC18368a
    /* renamed from: a */
    public void mo62951a(boolean z) {
        if (!this.f46085e && z) {
            m63005d();
        }
        this.f46085e = z;
    }
}
