package sg.bigo.ads.controller.p946b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;
import sg.bigo.ads.api.p903a.InterfaceC43529m;
import sg.bigo.ads.common.utils.C43827j;

/* renamed from: sg.bigo.ads.controller.b.j */
/* loaded from: classes10.dex */
public final class C43978j implements InterfaceC43529m {
    @NonNull

    /* renamed from: a */
    private final JSONObject f115239a;

    public C43978j(@NonNull JSONObject jSONObject) {
        this.f115239a = jSONObject;
    }

    @Nullable
    /* renamed from: d */
    private Object m4409d(@NonNull String str) {
        String[] split = str.split("\\.");
        if (split.length == 0) {
            return null;
        }
        JSONObject jSONObject = this.f115239a;
        for (int i = 0; i < split.length - 1; i++) {
            jSONObject = jSONObject.optJSONObject(split[i]);
            if (jSONObject == null) {
                return null;
            }
        }
        return jSONObject.opt(split[split.length - 1]);
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43529m
    /* renamed from: a */
    public final int mo4413a(@NonNull String str) {
        Integer m4881a = C43827j.m4881a(m4409d(str));
        if (m4881a != null) {
            return m4881a.intValue();
        }
        return 0;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43529m
    /* renamed from: b */
    public final float mo4411b(@NonNull String str) {
        Float m4878b = C43827j.m4878b(m4409d(str));
        if (m4878b != null) {
            return m4878b.floatValue();
        }
        return 0.0f;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43529m
    /* renamed from: c */
    public final boolean mo4410c(@NonNull String str) {
        if (mo4413a(str) == 1) {
            return true;
        }
        return false;
    }

    @NonNull
    public final String toString() {
        return this.f115239a.toString();
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43529m
    /* renamed from: a */
    public final int mo4412a(@NonNull String str, int i) {
        Integer m4881a = C43827j.m4881a(m4409d(str));
        return m4881a != null ? m4881a.intValue() : i;
    }
}
