package io.bidmachine.analytics.internal;

import io.bidmachine.analytics.internal.C35582a0;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* renamed from: io.bidmachine.analytics.internal.d0 */
/* loaded from: classes9.dex */
public abstract class AbstractC35593d0 {
    /* renamed from: a */
    public static final C35591c0 m20252a(C35582a0 c35582a0) {
        byte[] bArr;
        JSONObject m20162a;
        String jSONObject;
        String m20287c = c35582a0.m20287c();
        String m20286d = c35582a0.m20286d();
        long m20284f = c35582a0.m20284f();
        String m20291a = c35582a0.m20291a();
        String jSONObject2 = m20253a(c35582a0.m20285e()).toString();
        C35620j0 m20288b = c35582a0.m20288b();
        if (m20288b == null || (m20162a = AbstractC35630k0.m20162a(m20288b)) == null || (jSONObject = m20162a.toString()) == null || (bArr = jSONObject.getBytes(Charsets.UTF_8)) == null) {
            bArr = new byte[0];
        }
        return new C35591c0(m20287c, m20286d, m20284f, m20291a, jSONObject2, bArr, c35582a0.m20283g());
    }

    /* renamed from: a */
    public static final JSONObject m20253a(C35582a0.C35583a c35583a) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tag", c35583a.m20281b());
        jSONObject.put("path", c35583a.m20282a());
        return jSONObject;
    }

    /* renamed from: a */
    public static final C35582a0 m20251a(C35591c0 c35591c0) {
        return new C35582a0(c35591c0.m20258c(), c35591c0.m20257d(), c35591c0.m20255f(), c35591c0.m20260a(), m20250a(new JSONObject(c35591c0.m20256e())), c35591c0.m20259b().length == 0 ? null : AbstractC35630k0.m20161a(new JSONObject(new String(c35591c0.m20259b(), Charsets.UTF_8))), c35591c0.m20254g());
    }

    /* renamed from: a */
    public static final C35582a0.C35583a m20250a(JSONObject jSONObject) {
        return new C35582a0.C35583a(jSONObject.optString("tag"), jSONObject.optString("path"));
    }
}
