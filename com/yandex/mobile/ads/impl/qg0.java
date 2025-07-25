package com.yandex.mobile.ads.impl;

import android.os.Handler;
import com.yandex.mobile.ads.impl.om1;
import com.yandex.mobile.ads.impl.sg0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class qg0 implements om1.InterfaceC31053a {

    /* renamed from: a */
    final /* synthetic */ String f84353a;

    /* renamed from: b */
    final /* synthetic */ sg0 f84354b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public qg0(sg0 sg0Var, String str) {
        this.f84354b = sg0Var;
        this.f84353a = str;
    }

    @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31053a
    /* renamed from: a */
    public final void mo29243a(yc2 yc2Var) {
        Runnable runnable;
        Handler handler;
        sg0 sg0Var = this.f84354b;
        String str = this.f84353a;
        sg0.C31356a c31356a = (sg0.C31356a) sg0Var.f85234c.remove(str);
        if (c31356a != null) {
            c31356a.f85240c = yc2Var;
            sg0Var.f85235d.put(str, c31356a);
            runnable = sg0Var.f85237f;
            if (runnable == null) {
                rg0 rg0Var = new rg0(sg0Var);
                sg0Var.f85237f = rg0Var;
                handler = sg0Var.f85236e;
                handler.postDelayed(rg0Var, 100);
            }
        }
    }
}
