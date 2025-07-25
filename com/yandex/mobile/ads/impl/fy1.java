package com.yandex.mobile.ads.impl;

import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.om1;
import java.io.UnsupportedEncodingException;

/* loaded from: classes8.dex */
public final class fy1 extends ml1<String> {

    /* renamed from: s */
    private final Object f79357s;
    @Nullable
    @GuardedBy("mLock")

    /* renamed from: t */
    private om1.InterfaceC31054b<String> f79358t;

    public fy1(String str, om1.InterfaceC31054b interfaceC31054b, @Nullable om1.InterfaceC31053a interfaceC31053a) {
        super(0, str, interfaceC31053a);
        this.f79357s = new Object();
        this.f79358t = interfaceC31054b;
    }

    @Override // com.yandex.mobile.ads.impl.ml1
    /* renamed from: a */
    public final void mo27508a() {
        super.mo27508a();
        synchronized (this.f79357s) {
            this.f79358t = null;
        }
    }

    @Override // com.yandex.mobile.ads.impl.ml1
    /* renamed from: a */
    public final void mo27505a(String str) {
        om1.InterfaceC31054b<String> interfaceC31054b;
        String str2 = str;
        synchronized (this.f79357s) {
            interfaceC31054b = this.f79358t;
        }
        if (interfaceC31054b != null) {
            interfaceC31054b.mo28555a(str2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ml1
    /* renamed from: a */
    public final om1<String> mo27506a(c91 c91Var) {
        String str;
        try {
            str = new String(c91Var.f77557b, ef0.m34598a(c91Var.f77558c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(c91Var.f77557b);
        }
        return om1.m30956a(str, ef0.m34601a(c91Var));
    }
}
