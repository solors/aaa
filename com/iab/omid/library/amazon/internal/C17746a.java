package com.iab.omid.library.amazon.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iab.omid.library.amazon.adsession.C17738a;
import com.iab.omid.library.amazon.internal.C17749d;
import com.iab.omid.library.amazon.utils.C17775f;
import java.util.Date;

/* renamed from: com.iab.omid.library.amazon.internal.a */
/* loaded from: classes6.dex */
public class C17746a implements C17749d.InterfaceC17750a {

    /* renamed from: f */
    private static C17746a f44799f = new C17746a(new C17749d());

    /* renamed from: a */
    protected C17775f f44800a = new C17775f();

    /* renamed from: b */
    private Date f44801b;

    /* renamed from: c */
    private boolean f44802c;

    /* renamed from: d */
    private C17749d f44803d;

    /* renamed from: e */
    private boolean f44804e;

    private C17746a(C17749d c17749d) {
        this.f44803d = c17749d;
    }

    /* renamed from: a */
    public static C17746a m65390a() {
        return f44799f;
    }

    /* renamed from: c */
    private void m65387c() {
        if (this.f44802c && this.f44801b != null) {
            for (C17738a c17738a : C17748c.m65380c().m65384a()) {
                c17738a.getAdSessionStatePublisher().m65310a(m65388b());
            }
        }
    }

    /* renamed from: b */
    public Date m65388b() {
        Date date = this.f44801b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    /* renamed from: d */
    public void m65386d() {
        Date m65262a = this.f44800a.m65262a();
        Date date = this.f44801b;
        if (date == null || m65262a.after(date)) {
            this.f44801b = m65262a;
            m65387c();
        }
    }

    /* renamed from: a */
    public void m65389a(@NonNull Context context) {
        if (this.f44802c) {
            return;
        }
        this.f44803d.m65376a(context);
        this.f44803d.m65375a(this);
        this.f44803d.m65369e();
        this.f44804e = this.f44803d.m65371c();
        this.f44802c = true;
    }

    @Override // com.iab.omid.library.amazon.internal.C17749d.InterfaceC17750a
    /* renamed from: a */
    public void mo65333a(boolean z) {
        if (!this.f44804e && z) {
            m65386d();
        }
        this.f44804e = z;
    }
}
