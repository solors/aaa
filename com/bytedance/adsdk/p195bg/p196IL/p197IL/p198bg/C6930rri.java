package com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg;

import android.text.TextUtils;
import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6956ldr;
import com.bytedance.adsdk.p195bg.p196IL.eqN.InterfaceC6957zx;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import com.ironsource.C21114v8;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.bg.IL.IL.bg.rri */
/* loaded from: classes3.dex */
public class C6930rri implements InterfaceC6913bg {

    /* renamed from: bg */
    private final String f14827bg;

    public C6930rri(String str) {
        this.f14827bg = str;
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: IL */
    public String mo90470IL() {
        return this.f14827bg;
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public Object mo90468bg(Map<String, JSONObject> map) {
        Object m90473bg;
        if (map == null || map.size() <= 0 || (m90473bg = m90473bg(this.f14827bg, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return m90473bg;
    }

    public String toString() {
        return "VariableNode [literals=" + this.f14827bg + C21114v8.C21123i.f54139e;
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg
    /* renamed from: bg */
    public InterfaceC6957zx mo90469bg() {
        return EnumC6956ldr.VARIABLE;
    }

    /* renamed from: bg */
    public Object m90473bg(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return m90472bg(str.split("\\."), 0, jSONObject);
    }

    /* renamed from: bg */
    private Object m90472bg(String[] strArr, int i, JSONObject jSONObject) {
        Object opt;
        if (strArr != null && strArr.length > 0 && i < strArr.length && jSONObject != null) {
            String str = strArr[i];
            int indexOf = str.indexOf(C21114v8.C21123i.f54137d);
            int indexOf2 = str.indexOf(C21114v8.C21123i.f54139e);
            if (indexOf >= 0 && indexOf2 >= 0 && indexOf <= indexOf2) {
                String substring = str.substring(0, indexOf);
                try {
                    int parseInt = Integer.parseInt(str.substring(indexOf + 1, indexOf2));
                    Object opt2 = jSONObject.opt(substring);
                    opt = opt2 instanceof JSONArray ? ((JSONArray) opt2).opt(parseInt) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                opt = jSONObject.opt(str);
            }
            if (i == strArr.length - 1) {
                return opt;
            }
            if (opt instanceof String) {
                try {
                    return m90472bg(strArr, i + 1, new JSONObject((String) opt));
                } catch (JSONException unused2) {
                    return opt;
                }
            } else if (opt instanceof JSONObject) {
                return m90472bg(strArr, i + 1, (JSONObject) opt);
            }
        }
        return null;
    }
}
