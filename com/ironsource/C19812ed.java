package com.ironsource;

import android.content.Context;
import com.ironsource.C19577ad;
import com.ironsource.environment.ContextProvider;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.ed */
/* loaded from: classes6.dex */
public class C19812ed {

    /* renamed from: a */
    private static final String f49877a = "adunit_data";

    /* renamed from: a */
    public void m58818a(Context context) {
        C19630bd.m59339a().m59328c(context);
    }

    /* renamed from: a */
    public void m58817a(@NotNull String str, @NotNull C19577ad.EnumC19578a enumC19578a) {
        JSONObject optJSONObject;
        try {
            String name = enumC19578a.name();
            C19630bd m59339a = C19630bd.m59339a();
            JSONObject optJSONObject2 = m59339a.m59331b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f49877a);
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(name)) == null || optJSONObject.remove(str) == null) {
                return;
            }
            m59339a.m59329b(f49877a, optJSONObject2.put(name, optJSONObject));
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
        }
    }

    /* renamed from: a */
    public void m58816a(String str, Object obj) {
        C19630bd.m59339a().m59329b(str, obj);
    }

    /* renamed from: a */
    public void m58815a(@NotNull String str, @NotNull Object obj, @NotNull C19577ad.EnumC19578a enumC19578a) {
        try {
            String name = enumC19578a.name();
            C19630bd m59339a = C19630bd.m59339a();
            JSONObject optJSONObject = m59339a.m59331b(ContextProvider.getInstance().getApplicationContext()).optJSONObject(f49877a);
            if (optJSONObject == null) {
                m59339a.m59329b(f49877a, new JSONObject().put(name, new JSONObject().put(str, obj)));
                return;
            }
            JSONObject optJSONObject2 = optJSONObject.optJSONObject(name);
            if (optJSONObject2 == null) {
                m59339a.m59329b(f49877a, optJSONObject.put(name, new JSONObject().put(str, obj)));
            } else {
                m59339a.m59329b(f49877a, optJSONObject.put(name, optJSONObject2.put(str, obj)));
            }
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
        }
    }

    /* renamed from: a */
    public void m58814a(String str, JSONObject jSONObject) {
        C19630bd.m59339a().m59333a(str, jSONObject);
    }

    /* renamed from: a */
    public void m58813a(Map<String, Object> map) {
        C19630bd.m59339a().m59332a(map);
    }
}
