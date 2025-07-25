package sg.bigo.ads.controller.p951g;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;
import sg.bigo.ads.api.AbstractC43532b;
import sg.bigo.ads.common.InterfaceC43665g;

/* renamed from: sg.bigo.ads.controller.g.d */
/* loaded from: classes10.dex */
public final class C44050d {
    @Nullable
    /* renamed from: a */
    public static String m4085a(@Nullable AbstractC43532b abstractC43532b, @NonNull InterfaceC43665g interfaceC43665g) {
        int i;
        long j;
        int i2;
        if (abstractC43532b != null) {
            i = abstractC43532b.f114040d;
            i2 = abstractC43532b.f114041e;
            j = abstractC43532b.f114042f;
        } else {
            i = 0;
            j = 0;
            i2 = 0;
        }
        if (i <= 0) {
            i = interfaceC43665g.mo4141f();
        }
        if (i2 <= 0) {
            i2 = interfaceC43665g.mo4140g();
        }
        if (j <= 0) {
            j = interfaceC43665g.mo4139h();
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("ad_a", Integer.valueOf(i));
            jSONObject.putOpt("ad_g", Integer.valueOf(i2));
            jSONObject.putOpt("ad_channel", interfaceC43665g.mo4142e());
            jSONObject.putOpt("ad_active", Long.valueOf(j));
            jSONObject.putOpt("ad_ins", Long.valueOf(interfaceC43665g.mo4152aa()));
            jSONObject.putOpt("ad_upd", Long.valueOf(interfaceC43665g.mo4151ab()));
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
