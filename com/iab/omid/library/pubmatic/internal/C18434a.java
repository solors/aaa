package com.iab.omid.library.pubmatic.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.pubmatic.adsession.C18426a;
import com.iab.omid.library.pubmatic.internal.C18437d;
import com.iab.omid.library.pubmatic.utils.C18465f;
import java.util.Date;

/* renamed from: com.iab.omid.library.pubmatic.internal.a */
/* loaded from: classes6.dex */
public class C18434a implements C18437d.InterfaceC18438a {

    /* renamed from: f */
    private static C18434a f46215f = new C18434a(new C18437d());

    /* renamed from: a */
    protected C18465f f46216a = new C18465f();

    /* renamed from: b */
    private Date f46217b;

    /* renamed from: c */
    private boolean f46218c;

    /* renamed from: d */
    private C18437d f46219d;

    /* renamed from: e */
    private boolean f46220e;

    private C18434a(C18437d c18437d) {
        this.f46219d = c18437d;
    }

    /* renamed from: a */
    public static C18434a m62756a() {
        return f46215f;
    }

    /* renamed from: c */
    private void m62753c() {
        if (this.f46218c && this.f46217b != null) {
            for (C18426a c18426a : C18436c.m62746c().m62750a()) {
                c18426a.getAdSessionStatePublisher().m62669a(m62754b());
            }
        }
    }

    /* renamed from: b */
    public Date m62754b() {
        Date date = this.f46217b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m62752d() {
        Date m62619a = this.f46216a.m62619a();
        Date date = this.f46217b;
        if (date == null || m62619a.after(date)) {
            this.f46217b = m62619a;
            m62753c();
        }
    }

    /* renamed from: a */
    public void m62755a(@NonNull Context context) {
        if (this.f46218c) {
            return;
        }
        this.f46219d.m62742a(context);
        this.f46219d.m62741a(this);
        this.f46219d.m62735e();
        this.f46220e = this.f46219d.m62737c();
        this.f46218c = true;
    }

    @Override // com.iab.omid.library.pubmatic.internal.C18437d.InterfaceC18438a
    /* renamed from: a */
    public void mo62698a(boolean z) {
        if (!this.f46220e && z) {
            m62752d();
        }
        this.f46220e = z;
    }
}
