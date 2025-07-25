package com.ironsource;

import android.content.Context;
import com.ironsource.C19577ad;
import com.ironsource.environment.ContextProvider;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.cd */
/* loaded from: classes6.dex */
public class C19696cd {

    /* renamed from: a */
    private static final String f49427a = "adunit_data";

    /* renamed from: a */
    private JSONObject m59169a(Context context, @NotNull C19577ad.EnumC19578a enumC19578a) throws JSONException {
        String name = enumC19578a.name();
        JSONObject m59331b = C19630bd.m59339a().m59331b(context);
        JSONObject optJSONObject = m59331b.optJSONObject(f49427a);
        JSONObject m59164a = m59164a(m59331b);
        if (optJSONObject != null && optJSONObject.optJSONObject(name) != null) {
            JSONObject jSONObject = optJSONObject.getJSONObject(name);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                m59164a.putOpt(next, jSONObject.opt(next));
            }
        }
        return m59164a;
    }

    /* renamed from: a */
    private JSONObject m59168a(Context context, List<String> list) throws JSONException {
        return m59163a(m59164a(C19630bd.m59339a().m59331b(context)), (String[]) list.toArray(new String[list.size()]));
    }

    /* renamed from: a */
    public JSONObject m59167a(Context context, String[] strArr) throws JSONException {
        return m59163a(m59164a(C19630bd.m59339a().m59331b(context)), strArr);
    }

    /* renamed from: a */
    public JSONObject m59166a(List<String> list) throws JSONException {
        return m59168a(ContextProvider.getInstance().getApplicationContext(), list);
    }

    /* renamed from: a */
    public JSONObject m59165a(List<String> list, C19577ad.EnumC19578a enumC19578a) throws JSONException {
        return m59163a(m59169a(ContextProvider.getInstance().getApplicationContext(), enumC19578a), (String[]) list.toArray(new String[list.size()]));
    }

    /* renamed from: a */
    private JSONObject m59164a(JSONObject jSONObject) {
        jSONObject.remove(f49427a);
        return jSONObject;
    }

    /* renamed from: a */
    private JSONObject m59163a(JSONObject jSONObject, String[] strArr) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        for (String str : strArr) {
            if (jSONObject.has(str)) {
                jSONObject2.put(str, jSONObject.opt(str));
            }
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public JSONObject m59162a(String[] strArr) throws JSONException {
        return m59163a(m59164a(C19630bd.m59339a().m59331b(ContextProvider.getInstance().getApplicationContext())), strArr);
    }
}
