package com.bytedance.sdk.component.p256bg;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.bytedance.sdk.component.bg.Kg */
/* loaded from: classes3.dex */
public class C7576Kg {

    /* renamed from: bg */
    private InterfaceC7579PX f16509bg;

    private C7576Kg(InterfaceC7579PX interfaceC7579PX) {
        this.f16509bg = interfaceC7579PX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static C7576Kg m88499bg(InterfaceC7579PX interfaceC7579PX) {
        return new C7576Kg(interfaceC7579PX);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public <T> T m88496bg(String str, Type type) throws JSONException {
        m88497bg(str);
        if (!type.equals(JSONObject.class) && (!(type instanceof Class) || !JSONObject.class.isAssignableFrom((Class) type))) {
            return (T) this.f16509bg.mo84552bg(str, type);
        }
        return (T) new JSONObject(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public <T> String m88498bg(T t) {
        String obj;
        if (t == null) {
            return JsonUtils.EMPTY_JSON;
        }
        if (!(t instanceof JSONObject) && !(t instanceof JSONArray)) {
            obj = this.f16509bg.mo84553bg(t);
        } else {
            obj = t.toString();
        }
        m88497bg(obj);
        return obj;
    }

    /* renamed from: bg */
    private static void m88497bg(String str) {
        if (str.startsWith("{") && str.endsWith("}")) {
            return;
        }
        C7584WR.m88476bg(new IllegalArgumentException("Param is not allowed to be List or JSONArray, rawString:\n ".concat(str)));
    }
}
