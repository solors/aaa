package com.yandex.mobile.ads.impl;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public final class xh2 extends AbstractC31183q8 {

    /* renamed from: k */
    private static final Pattern f87696k = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: a */
    private final C31338s8 f87697a;

    /* renamed from: b */
    private final C31266r8 f87698b;

    /* renamed from: d */
    private bi2 f87700d;

    /* renamed from: e */
    private AbstractC31638v8 f87701e;

    /* renamed from: i */
    private boolean f87705i;

    /* renamed from: j */
    private boolean f87706j;

    /* renamed from: c */
    private final ArrayList f87699c = new ArrayList();

    /* renamed from: f */
    private boolean f87702f = false;

    /* renamed from: g */
    private boolean f87703g = false;

    /* renamed from: h */
    private final String f87704h = UUID.randomUUID().toString();

    /* JADX INFO: Access modifiers changed from: package-private */
    public xh2(C31266r8 c31266r8, C31338s8 c31338s8) {
        AbstractC31638v8 ci2Var;
        this.f87698b = c31266r8;
        this.f87697a = c31338s8;
        m27487d();
        if (c31338s8.m29827a() != EnumC31430t8.f85545c && c31338s8.m29827a() != EnumC31430t8.f85547e) {
            ci2Var = new gi2(c31338s8.m29822e(), c31338s8.m29823d());
        } else {
            ci2Var = new ci2(c31338s8.m29819h());
        }
        this.f87701e = ci2Var;
        this.f87701e.mo28510a();
        yh2.m26905a().m26904a(this);
        this.f87701e.m28505a(c31266r8);
    }

    /* renamed from: d */
    private void m27487d() {
        this.f87700d = new bi2(null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m27490a(@NonNull JSONObject jSONObject) {
        if (!this.f87706j) {
            this.f87701e.m28499a(jSONObject);
            this.f87706j = true;
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31183q8
    /* renamed from: b */
    public final void mo27489b() {
        if (this.f87702f) {
            return;
        }
        this.f87702f = true;
        yh2.m26905a().m26902b(this);
        this.f87701e.m28509a(ej2.m34515a().m34510d());
        this.f87701e.mo28504a(this, this.f87697a);
    }

    /* renamed from: c */
    public final ArrayList m27488c() {
        return this.f87699c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public final void m27486e() {
        if (!this.f87705i) {
            this.f87701e.m28492f();
            this.f87705i = true;
            return;
        }
        throw new IllegalStateException("Impression event can only be sent once");
    }

    /* renamed from: f */
    public final View m27485f() {
        return this.f87700d.get();
    }

    /* renamed from: g */
    public final boolean m27484g() {
        if (this.f87702f && !this.f87703g) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m27483h() {
        return this.f87702f;
    }

    /* renamed from: i */
    public final String m27482i() {
        return this.f87704h;
    }

    /* renamed from: j */
    public final AbstractC31638v8 m27481j() {
        return this.f87701e;
    }

    /* renamed from: k */
    public final boolean m27480k() {
        return this.f87703g;
    }

    /* renamed from: l */
    public final boolean m27479l() {
        return this.f87698b.m30122b();
    }

    /* renamed from: m */
    public final boolean m27478m() {
        return this.f87698b.m30121c();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31183q8
    /* renamed from: a */
    public final void mo27491a(View view, fa0 fa0Var, @Nullable String str) {
        pi2 pi2Var;
        if (this.f87703g) {
            return;
        }
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!f87696k.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it = this.f87699c.iterator();
        while (true) {
            if (!it.hasNext()) {
                pi2Var = null;
                break;
            }
            pi2Var = (pi2) it.next();
            if (pi2Var.m30650a().get() == view) {
                break;
            }
        }
        if (pi2Var == null) {
            this.f87699c.add(new pi2(view, fa0Var, str));
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31183q8
    /* renamed from: a */
    public final void mo27493a() {
        if (this.f87703g) {
            return;
        }
        this.f87700d.clear();
        if (!this.f87703g) {
            this.f87699c.clear();
        }
        this.f87703g = true;
        this.f87701e.m28493e();
        yh2.m26905a().m26900c(this);
        this.f87701e.mo28497b();
        this.f87701e = null;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31183q8
    /* renamed from: a */
    public final void mo27492a(View view) {
        if (this.f87703g || this.f87700d.get() == view) {
            return;
        }
        this.f87700d = new bi2(view);
        this.f87701e.m28491g();
        Collection<xh2> m26903b = yh2.m26905a().m26903b();
        if (m26903b == null || m26903b.isEmpty()) {
            return;
        }
        for (xh2 xh2Var : m26903b) {
            if (xh2Var != this && xh2Var.f87700d.get() == view) {
                xh2Var.f87700d.clear();
            }
        }
    }
}
