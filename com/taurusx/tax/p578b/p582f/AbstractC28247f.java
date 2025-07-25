package com.taurusx.tax.p578b.p582f;

import android.text.TextUtils;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.api.TaurusXAdError;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.p579c.C28210c;
import com.taurusx.tax.p578b.p581e.C28236i;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.b.f.f */
/* loaded from: classes7.dex */
public abstract class AbstractC28247f {

    /* renamed from: a */
    public C28236i f73386a;

    /* renamed from: b */
    public C28210c.C28211a f73387b;

    /* renamed from: c */
    public String f73388c;

    /* renamed from: d */
    public C28210c f73389d;

    /* renamed from: e */
    public C28248g f73390e;

    static {
        C28162a.f73047a.m23824a(new byte[]{27, -78, 55, -111, 46, -96, 42, -102, 34, -93}, new byte[]{79, -45});
    }

    public AbstractC28247f(String str, C28210c c28210c) {
        this.f73389d = c28210c;
        this.f73388c = str;
    }

    /* renamed from: a */
    public void m38348a() {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        LogUtil.m37905d(stringFogImpl.m23824a(new byte[]{-80, -20, -79, -1, -79, -2, -68}, new byte[]{-60, -115}), stringFogImpl.m23824a(new byte[]{56, -48, 53, -37, 21, -37}, new byte[]{84, -65}));
        try {
            if (this.f73390e == null) {
                this.f73390e = new C28248g();
            }
            this.f73386a = C28236i.m38370a(this.f73389d);
            C28210c.C28211a c28211a = this.f73389d.f73227c;
            this.f73387b = c28211a;
            if (c28211a != null && !TextUtils.isEmpty(c28211a.f73230a)) {
                mo38338b();
                return;
            }
            this.f73390e.onAdLoadFailed(TaurusXAdError.parseError(stringFogImpl.m23824a(new byte[]{96, -126, 108, -58, 104, -107, 33, -120, 116, -118, 109}, new byte[]{1, -26})));
        } catch (Exception unused) {
            this.f73390e.onAdLoadFailed(TaurusXAdError.parseError(C28162a.f73047a.m23824a(new byte[]{47, -41, 45, -59, 58, -106, 58, -60, 45, -39, 45}, new byte[]{95, -74})));
        }
    }

    /* renamed from: b */
    public abstract void mo38338b();
}
