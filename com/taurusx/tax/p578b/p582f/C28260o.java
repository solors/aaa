package com.taurusx.tax.p578b.p582f;

import android.graphics.Bitmap;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.api.TaurusXAdError;
import com.taurusx.tax.p606j.C28522i;

/* renamed from: com.taurusx.tax.b.f.o */
/* loaded from: classes7.dex */
public class C28260o implements C28522i.InterfaceC28525c {

    /* renamed from: a */
    public final /* synthetic */ C28262q f73420a;

    public C28260o(C28262q c28262q) {
        this.f73420a = c28262q;
    }

    /* renamed from: a */
    public void m38340a(Bitmap bitmap) {
        if (bitmap != null) {
            C28248g c28248g = this.f73420a.f73390e;
            if (c28248g != null) {
                c28248g.onAdLoaded();
                return;
            }
            c28248g.onAdLoadFailed(TaurusXAdError.internalError(C28162a.f73047a.m23824a(new byte[]{-19, -80, -16, -69, -10, -80, -27, -78, -92, -69, -10, -84, -21, -84}, new byte[]{-124, -34})));
            return;
        }
        this.f73420a.f73390e.onAdLoadFailed(TaurusXAdError.networkError(C28162a.f73047a.m23824a(new byte[]{-126, -96, -104, -78, -125, -73, -121, -27, -119, -73, -98, -86, -98}, new byte[]{-20, -59})));
    }
}
