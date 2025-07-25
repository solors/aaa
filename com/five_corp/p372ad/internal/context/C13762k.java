package com.five_corp.p372ad.internal.context;

import com.five_corp.p372ad.internal.system.C14097d;
import com.five_corp.p372ad.internal.tracking_data.C14107a;
import com.five_corp.p372ad.internal.tracking_data.C14108b;
import com.five_corp.p372ad.internal.tracking_data.SharedPreferences$OnSharedPreferenceChangeListenerC14111e;

/* renamed from: com.five_corp.ad.internal.context.k */
/* loaded from: classes4.dex */
public final class C13762k {

    /* renamed from: a */
    public final C14108b f25610a;

    /* renamed from: b */
    public final C14097d f25611b;

    /* renamed from: c */
    public final SharedPreferences$OnSharedPreferenceChangeListenerC14111e f25612c;

    public C13762k(C14108b c14108b, C14097d c14097d, SharedPreferences$OnSharedPreferenceChangeListenerC14111e sharedPreferences$OnSharedPreferenceChangeListenerC14111e) {
        this.f25610a = c14108b;
        this.f25611b = c14097d;
        this.f25612c = sharedPreferences$OnSharedPreferenceChangeListenerC14111e;
    }

    /* renamed from: a */
    public final C13763l m78394a() {
        C14107a m78097a = this.f25610a.m78097a();
        boolean m78103a = this.f25611b.m78103a();
        synchronized (this.f25612c.f26728a) {
        }
        return new C13763l(m78097a, m78103a);
    }
}
