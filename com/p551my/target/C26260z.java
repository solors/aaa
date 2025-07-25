package com.p551my.target;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ironsource.C19577ad;
import com.p551my.target.common.MyTargetConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.my.target.z */
/* loaded from: classes7.dex */
public final class C26260z extends AbstractC26021q1 {

    /* renamed from: a */
    public volatile Map f68394a;

    /* renamed from: a */
    public synchronized Map m42280a(MyTargetConfig myTargetConfig, Context context) {
        if (AbstractC25671c0.m44128a()) {
            AbstractC25846ja.m43680a("AppSetIdDataProvider: You must not call collectData method from main thread");
            return new HashMap();
        } else if (this.f68394a != null) {
            return new HashMap(this.f68394a);
        } else {
            this.f68394a = new HashMap();
            final C25634a8 m44224a = C25634a8.m44224a(context);
            final String m44226a = m44224a.m44226a();
            final int m44220b = m44224a.m44220b();
            if (!TextUtils.isEmpty(m44226a)) {
                this.f68394a.put(C19577ad.f49143u0, m44226a);
            }
            if (m44220b != -1) {
                this.f68394a.put("asis", String.valueOf(m44220b));
            }
            AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(AbstractC25671c0.f66671b, new OnSuccessListener() { // from class: com.my.target.xf
                {
                    C26260z.this = this;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    C26260z.this.m42281a(m44220b, m44224a, m44226a, (AppSetIdInfo) obj);
                }
            });
            return new HashMap(this.f68394a);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void m42281a(int i, C25634a8 c25634a8, String str, AppSetIdInfo appSetIdInfo) {
        int scope = appSetIdInfo.getScope();
        if (scope != i) {
            c25634a8.m44225a(scope);
            synchronized (this) {
                this.f68394a.put("asis", String.valueOf(scope));
            }
            AbstractC25846ja.m43680a("AppSetIdDataProvider: new scope value has been received: " + scope);
        }
        String id2 = appSetIdInfo.getId();
        if (id2.equals(str)) {
            return;
        }
        c25634a8.m44216c(id2);
        synchronized (this) {
            this.f68394a.put(C19577ad.f49143u0, id2);
        }
        AbstractC25846ja.m43680a("AppSetIdDataProvider: new id value has been received: " + id2);
    }
}
