package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import com.yandex.mobile.ads.impl.om1;
import com.yandex.mobile.ads.impl.sg0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes8.dex */
public final class pg0 implements om1.InterfaceC31054b<Bitmap> {

    /* renamed from: a */
    final /* synthetic */ String f83949a;

    /* renamed from: b */
    final /* synthetic */ sg0 f83950b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public pg0(sg0 sg0Var, String str) {
        this.f83950b = sg0Var;
        this.f83949a = str;
    }

    @Override // com.yandex.mobile.ads.impl.om1.InterfaceC31054b
    /* renamed from: a */
    public final void mo28555a(Bitmap bitmap) {
        sg0.InterfaceC31357b interfaceC31357b;
        Runnable runnable;
        Handler handler;
        Bitmap bitmap2 = bitmap;
        sg0 sg0Var = this.f83950b;
        String str = this.f83949a;
        interfaceC31357b = sg0Var.f85233b;
        interfaceC31357b.mo29611a(str, bitmap2);
        sg0.C31356a c31356a = (sg0.C31356a) sg0Var.f85234c.remove(str);
        if (c31356a != null) {
            c31356a.f85239b = bitmap2;
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
