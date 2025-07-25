package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.sg0;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class rg0 implements Runnable {

    /* renamed from: b */
    final /* synthetic */ sg0 f84749b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public rg0(sg0 sg0Var) {
        this.f84749b = sg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sg0.InterfaceC31359d interfaceC31359d;
        yc2 yc2Var;
        Bitmap bitmap;
        for (sg0.C31356a c31356a : this.f84749b.f85235d.values()) {
            Iterator it = c31356a.f85241d.iterator();
            while (it.hasNext()) {
                sg0.C31358c c31358c = (sg0.C31358c) it.next();
                interfaceC31359d = c31358c.f85243b;
                if (interfaceC31359d != null) {
                    yc2Var = c31356a.f85240c;
                    if (yc2Var == null) {
                        bitmap = c31356a.f85239b;
                        c31358c.f85242a = bitmap;
                        interfaceC31359d.mo29321a(c31358c, false);
                    } else {
                        interfaceC31359d.mo29243a(yc2Var);
                    }
                }
            }
        }
        this.f84749b.f85235d.clear();
        this.f84749b.f85237f = null;
    }
}
