package com.taurusx.tax.p583c.p584a;

import android.util.Log;
import com.taurusx.tax.C28162a;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.a.b */
/* loaded from: classes7.dex */
public class RunnableC28269b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f73440a;

    /* renamed from: b */
    public final /* synthetic */ C28265a f73441b;

    public RunnableC28269b(C28265a c28265a, String str) {
        this.f73441b = c28265a;
        this.f73440a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            C28265a c28265a = this.f73441b;
            StringBuilder sb2 = new StringBuilder();
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{-94, 13, -94, 4, -92, 41, -73, 9, -81, 24, -5, 76}, new byte[]{-63, 108}));
            sb2.append(this.f73440a);
            Log.d(c28265a.f73430a, sb2.toString());
            this.f73441b.f73433d.m38335a(this.f73440a);
            C28265a c28265a2 = this.f73441b;
            Log.d(c28265a2.f73430a, stringFogImpl.m23824a(new byte[]{15, -7, 47, -16, 41, -72, 9, -18, 41, -10, 56, -72, 15, -9, 57, -10, 56, -94, 108}, new byte[]{76, -104}) + this.f73441b.f73432c.incrementAndGet());
        } catch (Error | Exception e) {
            e.printStackTrace();
        }
    }
}
