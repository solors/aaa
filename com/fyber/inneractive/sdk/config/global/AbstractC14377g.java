package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.global.features.AbstractC14361h;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.g */
/* loaded from: classes4.dex */
public abstract class AbstractC14377g {
    /* renamed from: a */
    public static JSONArray m77944a(Map map, boolean z) {
        String str;
        InterfaceC14351d interfaceC14351d;
        JSONArray jSONArray = new JSONArray();
        try {
            for (AbstractC14361h abstractC14361h : map.values()) {
                abstractC14361h.getClass();
                ArrayList arrayList = new ArrayList(abstractC14361h.f27199c.values());
                HashMap hashMap = abstractC14361h.f27200d;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C14349b c14349b = (C14349b) it.next();
                    JSONObject jSONObject = new JSONObject();
                    if (c14349b != null) {
                        str = c14349b.f27185a;
                    } else {
                        str = null;
                    }
                    if (!TextUtils.isEmpty(str)) {
                        C14381k c14381k = (C14381k) hashMap.get(str);
                        jSONObject.put("id", str);
                        if (c14381k != null) {
                            jSONObject.put("v", c14381k.f27210b);
                        } else {
                            jSONObject.put("v", "control");
                        }
                        if (z) {
                            Iterator it2 = c14349b.f27188d.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    interfaceC14351d = (InterfaceC14351d) it2.next();
                                    if (C14350c.class.equals(interfaceC14351d.getClass())) {
                                        break;
                                    }
                                } else {
                                    interfaceC14351d = null;
                                    break;
                                }
                            }
                            if (interfaceC14351d != null && ((C14350c) interfaceC14351d).f27190b) {
                                HashSet hashSet = ((C14350c) interfaceC14351d).f27189a;
                                JSONArray jSONArray2 = new JSONArray();
                                Iterator it3 = hashSet.iterator();
                                while (it3.hasNext()) {
                                    jSONArray2.put((Long) it3.next());
                                }
                                if (jSONArray2.length() > 0) {
                                    jSONObject.put("d", jSONArray2);
                                }
                            }
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            IAlog.m76529a("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.f30554a <= 3) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
