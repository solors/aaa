package io.bidmachine.analytics.internal;

import kotlin.collections.C37559r0;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: io.bidmachine.analytics.internal.P */
/* loaded from: classes9.dex */
public abstract class AbstractC35554P {
    /* renamed from: a */
    public static final C35553O m20351a(C35547M c35547m) {
        byte[] bArr;
        JSONObject m20162a;
        String jSONObject;
        byte[] bytes = c35547m.m20377a().isEmpty() ? new byte[0] : AbstractC35634l0.m20150a(c35547m.m20377a()).toString().getBytes(Charsets.UTF_8);
        String m20373c = c35547m.m20373c();
        String m20372d = c35547m.m20372d();
        String m20371e = c35547m.m20371e();
        long m20370f = c35547m.m20370f();
        C35620j0 m20374b = c35547m.m20374b();
        if (m20374b == null || (m20162a = AbstractC35630k0.m20162a(m20374b)) == null || (jSONObject = m20162a.toString()) == null || (bArr = jSONObject.getBytes(Charsets.UTF_8)) == null) {
            bArr = new byte[0];
        }
        return new C35553O(m20373c, m20372d, m20371e, m20370f, bytes, bArr);
    }

    /* renamed from: a */
    public static final C35547M m20350a(C35553O c35553o) {
        return new C35547M(c35553o.m20355c(), c35553o.m20354d(), c35553o.m20353e(), c35553o.m20352f(), c35553o.m20357a().length == 0 ? C37559r0.m17284j() : AbstractC35634l0.m20148a(new JSONObject(new String(c35553o.m20357a(), Charsets.UTF_8))), c35553o.m20356b().length == 0 ? null : AbstractC35630k0.m20161a(new JSONObject(new String(c35553o.m20356b(), Charsets.UTF_8))));
    }
}
