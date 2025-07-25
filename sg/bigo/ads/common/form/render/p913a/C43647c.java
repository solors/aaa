package sg.bigo.ads.common.form.render.p913a;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.p903a.InterfaceC43518e;
import sg.bigo.ads.common.form.render.C43656c;
import sg.bigo.ads.common.form.render.p913a.AbstractC43642a;
import sg.bigo.ads.common.view.PrivacyCheckBox;

/* renamed from: sg.bigo.ads.common.form.render.a.c */
/* loaded from: classes10.dex */
public final class C43647c implements AbstractC43642a.InterfaceC43643a {
    @NonNull

    /* renamed from: a */
    public Context f114253a;
    @Nullable

    /* renamed from: b */
    public Map<String, Object> f114254b;

    /* renamed from: c */
    public InterfaceC43518e f114255c;

    /* renamed from: d */
    public InterfaceC43518e.C43521c[] f114256d;

    /* renamed from: e */
    public View f114257e;

    /* renamed from: f */
    public PrivacyCheckBox f114258f;

    /* renamed from: h */
    public C43656c.InterfaceC43664a f114260h;
    @NonNull

    /* renamed from: i */
    private Map<String, String> f114261i = new ConcurrentHashMap();

    /* renamed from: g */
    public List<AbstractC43642a> f114259g = new ArrayList();

    public C43647c(@NonNull InterfaceC43518e interfaceC43518e, @Nullable Map<String, Object> map, @NonNull Context context, C43656c.InterfaceC43664a interfaceC43664a) {
        this.f114253a = context;
        this.f114255c = interfaceC43518e;
        this.f114254b = map;
        this.f114256d = interfaceC43518e.mo5384m();
        this.f114260h = interfaceC43664a;
    }

    /* renamed from: a */
    public final JSONObject m5269a() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.f114261i.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    jSONObject.putOpt(entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: b */
    public final boolean m5267b() {
        PrivacyCheckBox privacyCheckBox = this.f114258f;
        if (privacyCheckBox != null && privacyCheckBox.f114756a) {
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.common.form.render.p913a.AbstractC43642a.InterfaceC43643a
    /* renamed from: a */
    public final void mo5268a(String str, String str2) {
        this.f114261i.put(str, str2);
        C43656c.InterfaceC43664a interfaceC43664a = this.f114260h;
        if (interfaceC43664a != null) {
            interfaceC43664a.mo5254a();
        }
    }
}
