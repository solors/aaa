package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.flow.C14491S;
import com.fyber.inneractive.sdk.network.AbstractC14743z;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.measurement.g */
/* loaded from: classes4.dex */
public final class C14588g {

    /* renamed from: a */
    public AdSession f27628a;

    /* renamed from: b */
    public AdEvents f27629b;

    /* renamed from: c */
    public MediaEvents f27630c;

    /* renamed from: f */
    public C14491S f27633f;

    /* renamed from: d */
    public boolean f27631d = false;

    /* renamed from: e */
    public boolean f27632e = false;

    /* renamed from: g */
    public final C14587f f27634g = new C14587f(this);

    /* renamed from: a */
    public final void m77784a(Throwable th) {
        String simpleName = th.getClass().getSimpleName();
        String str = "OpenMeasurementNativeVideoTracker - " + th.getMessage();
        C14491S c14491s = this.f27633f;
        AbstractC14743z.m77654a(simpleName, str, c14491s != null ? c14491s.f27572a : null, c14491s != null ? c14491s.f27573b : null);
    }

    /* renamed from: a */
    public final ArrayList m77783a(List list) {
        VerificationScriptResource createVerificationScriptResourceWithoutParameters;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C14590i c14590i = (C14590i) it.next();
            VerificationScriptResource verificationScriptResource = null;
            try {
                if (c14590i.f27637a != null) {
                    if (!TextUtils.isEmpty(c14590i.f27641e) && !TextUtils.isEmpty(c14590i.f27640d)) {
                        createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(c14590i.f27641e, c14590i.f27637a, c14590i.f27640d);
                    } else {
                        createVerificationScriptResourceWithoutParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(c14590i.f27637a);
                    }
                    verificationScriptResource = createVerificationScriptResourceWithoutParameters;
                }
            } catch (Throwable th) {
                m77784a(th);
            }
            if (verificationScriptResource != null) {
                arrayList.add(verificationScriptResource);
            }
        }
        return arrayList;
    }
}
