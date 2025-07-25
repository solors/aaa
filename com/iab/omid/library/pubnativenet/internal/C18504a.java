package com.iab.omid.library.pubnativenet.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.pubnativenet.adsession.C18496a;
import com.iab.omid.library.pubnativenet.internal.C18507d;
import com.iab.omid.library.pubnativenet.utils.C18535f;
import java.util.Date;

/* renamed from: com.iab.omid.library.pubnativenet.internal.a */
/* loaded from: classes6.dex */
public class C18504a implements C18507d.InterfaceC18508a {

    /* renamed from: f */
    private static C18504a f46350f = new C18504a(new C18507d());

    /* renamed from: a */
    protected C18535f f46351a = new C18535f();

    /* renamed from: b */
    private Date f46352b;

    /* renamed from: c */
    private boolean f46353c;

    /* renamed from: d */
    private C18507d f46354d;

    /* renamed from: e */
    private boolean f46355e;

    private C18504a(C18507d c18507d) {
        this.f46354d = c18507d;
    }

    /* renamed from: a */
    public static C18504a m62503a() {
        return f46350f;
    }

    /* renamed from: c */
    private void m62500c() {
        if (this.f46353c && this.f46352b != null) {
            for (C18496a c18496a : C18506c.m62493c().m62497a()) {
                c18496a.getAdSessionStatePublisher().m62416a(m62501b());
            }
        }
    }

    /* renamed from: b */
    public Date m62501b() {
        Date date = this.f46352b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m62499d() {
        Date m62366a = this.f46351a.m62366a();
        Date date = this.f46352b;
        if (date == null || m62366a.after(date)) {
            this.f46352b = m62366a;
            m62500c();
        }
    }

    /* renamed from: a */
    public void m62502a(@NonNull Context context) {
        if (this.f46353c) {
            return;
        }
        this.f46354d.m62489a(context);
        this.f46354d.m62488a(this);
        this.f46354d.m62482e();
        this.f46355e = this.f46354d.m62484c();
        this.f46353c = true;
    }

    @Override // com.iab.omid.library.pubnativenet.internal.C18507d.InterfaceC18508a
    /* renamed from: a */
    public void mo62445a(boolean z) {
        if (!this.f46355e && z) {
            m62499d();
        }
        this.f46355e = z;
    }
}
