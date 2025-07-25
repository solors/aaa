package com.ironsource;

import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ironsource.nn */
/* loaded from: classes6.dex */
class C20533nn extends AbstractC19795e {

    /* renamed from: i */
    private final String f52230i = C19652bo.f49319a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20533nn(int i) {
        this.f49845g = i;
    }

    @Override // com.ironsource.AbstractC19795e
    /* renamed from: a */
    public String mo56110a() {
        return C19652bo.f49319a;
    }

    @Override // com.ironsource.AbstractC19795e
    /* renamed from: c */
    public String mo56108c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC19795e
    /* renamed from: a */
    public String mo56109a(ArrayList<C20200kb> arrayList, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        this.f49844f = jSONObject;
        JSONArray jSONArray = new JSONArray();
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C20200kb> it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject m58841a = m58841a(it.next());
                if (m58841a != null) {
                    jSONArray.put(m58841a);
                }
            }
        }
        return m58839a(jSONArray);
    }
}
