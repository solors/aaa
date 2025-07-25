package sg.bigo.ads.core.p953a;

import androidx.annotation.NonNull;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p941x.C43906a;
import sg.bigo.ads.core.p953a.p955b.C44094a;

/* renamed from: sg.bigo.ads.core.a.b */
/* loaded from: classes10.dex */
public final class C44093b {

    /* renamed from: c */
    private static final C44093b f115731c = new C44093b();

    /* renamed from: a */
    public C44094a f115732a;

    /* renamed from: b */
    public final AtomicBoolean f115733b = new AtomicBoolean(false);

    private C44093b() {
    }

    /* renamed from: a */
    public static C44093b m3973a() {
        return f115731c;
    }

    /* renamed from: a */
    public final void m3972a(String str, @NonNull Map<String, Object> map) {
        if (C43906a.m4616p()) {
            return;
        }
        if (!this.f115733b.get()) {
            C43782a.m5010a(0, 3, "Callback", "please execute init first");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                jSONObject.putOpt(entry.getKey(), entry.getValue());
            }
        } catch (JSONException unused) {
        }
        this.f115732a.m3970a(str, jSONObject);
    }
}
