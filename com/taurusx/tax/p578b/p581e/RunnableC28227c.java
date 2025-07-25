package com.taurusx.tax.p578b.p581e;

import com.taurusx.tax.p578b.p581e.C28220b;
import java.io.File;

/* renamed from: com.taurusx.tax.b.e.c */
/* loaded from: classes7.dex */
public class RunnableC28227c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28220b.C28226d f73314a;

    /* renamed from: b */
    public final /* synthetic */ C28220b f73315b;

    public RunnableC28227c(C28220b c28220b, C28220b.C28226d c28226d) {
        this.f73315b = c28220b;
        this.f73314a = c28226d;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            File file = new File(this.f73315b.f73294b, this.f73314a.f73312a);
            if (file.exists()) {
                file.delete();
            }
        } catch (Error | Exception e) {
            e.printStackTrace();
        }
    }
}
