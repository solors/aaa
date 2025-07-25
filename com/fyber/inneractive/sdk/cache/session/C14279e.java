package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.EnumC14282c;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.session.e */
/* loaded from: classes4.dex */
public final class C14279e {

    /* renamed from: a */
    public C14286i f26987a = new C14286i();

    /* renamed from: c */
    public final Object f26989c = new Object();

    /* renamed from: d */
    public final Object f26990d = new Object();

    /* renamed from: b */
    public final C14275a f26988b = new C14275a();

    /* renamed from: a */
    public static JSONObject m78015a(C14279e c14279e) {
        c14279e.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("currentSession", c14279e.f26987a.m78008a());
            for (Map.Entry entry : c14279e.f26988b.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                EnumC14282c enumC14282c = (EnumC14282c) entry.getKey();
                Iterator it = ((PriorityQueue) entry.getValue()).iterator();
                while (it.hasNext()) {
                    jSONArray.put(((C14284g) it.next()).m78009a(true, true));
                }
                jSONObject.put(enumC14282c.name(), jSONArray);
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final void m78014a(EnumC14282c enumC14282c, C14284g c14284g) {
        synchronized (this.f26990d) {
            C14288k c14288k = (C14288k) this.f26988b.get(enumC14282c);
            if (c14288k != null) {
                c14288k.add(c14284g);
            }
        }
    }
}
