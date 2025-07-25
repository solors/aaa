package com.fyber.inneractive.sdk.config.global;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.AbstractC14392k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.AbstractC14361h;
import com.fyber.inneractive.sdk.config.global.features.C14355b;
import com.fyber.inneractive.sdk.config.global.features.C14356c;
import com.fyber.inneractive.sdk.config.global.features.C14357d;
import com.fyber.inneractive.sdk.config.global.features.C14358e;
import com.fyber.inneractive.sdk.config.global.features.C14359f;
import com.fyber.inneractive.sdk.config.global.features.C14360g;
import com.fyber.inneractive.sdk.config.global.features.C14362i;
import com.fyber.inneractive.sdk.config.global.features.C14363j;
import com.fyber.inneractive.sdk.config.global.features.C14364k;
import com.fyber.inneractive.sdk.config.global.features.C14365l;
import com.fyber.inneractive.sdk.config.global.features.C14366m;
import com.fyber.inneractive.sdk.config.global.features.C14367n;
import com.fyber.inneractive.sdk.config.global.features.C14368o;
import com.fyber.inneractive.sdk.config.global.features.C14371r;
import com.fyber.inneractive.sdk.config.global.features.C14372s;
import com.fyber.inneractive.sdk.config.global.features.C14376w;
import com.fyber.inneractive.sdk.config.global.features.InterfaceC14369p;
import com.fyber.inneractive.sdk.serverapi.AbstractC15395b;
import com.fyber.inneractive.sdk.util.EnumC15477v;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.InterfaceC15475u;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.r */
/* loaded from: classes4.dex */
public final class C14388r {

    /* renamed from: a */
    public String f27217a = "";

    /* renamed from: b */
    public final HashMap f27218b;

    /* renamed from: c */
    public JSONArray f27219c;

    public C14388r() {
        HashMap hashMap = new HashMap();
        hashMap.put(C14376w.class, new C14376w());
        hashMap.put(C14357d.class, new C14357d());
        hashMap.put(C14366m.class, new C14366m());
        hashMap.put(C14359f.class, new C14359f());
        hashMap.put(C14365l.class, new C14365l());
        hashMap.put(C14358e.class, new C14358e());
        hashMap.put(C14372s.class, new C14372s());
        hashMap.put(C14362i.class, new C14362i());
        hashMap.put(C14363j.class, new C14363j());
        hashMap.put(C14371r.class, new C14371r());
        hashMap.put(C14368o.class, new C14368o());
        hashMap.put(C14356c.class, new C14356c());
        hashMap.put(C14367n.class, new C14367n());
        hashMap.put(C14355b.class, new C14355b());
        hashMap.put(C14360g.class, new C14360g());
        hashMap.put(C14364k.class, new C14364k());
        this.f27218b = hashMap;
        this.f27219c = null;
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            hashMap2.put((Class) entry.getKey(), ((AbstractC14361h) entry.getValue()).mo77947c());
        }
        this.f27218b = hashMap2;
        IAlog.m76529a("%s: created. Supported features: %s", "SupportedFeaturesProvider", hashMap2);
    }

    /* renamed from: a */
    public static C14388r m77929a() {
        int i = AbstractC14392k.f27223a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.featuresConfig");
        boolean z = false;
        if (!TextUtils.isEmpty(property)) {
            try {
                IAConfigManager.f27060O.f27102z.f27183a = C14382l.m77942a(new JSONObject(property));
                z = true;
            } catch (Exception unused) {
                IAlog.m76529a("failed parsing local features json", new Object[0]);
            }
        }
        C14388r c14388r = new C14388r();
        if (z) {
            IAConfigManager iAConfigManager = IAConfigManager.f27060O;
            iAConfigManager.f27075M.m77926a(true, "");
            iAConfigManager.f27067E.m77801a(iAConfigManager.f27075M);
        }
        return c14388r;
    }

    /* renamed from: b */
    public final JSONArray m77925b() {
        JSONArray jSONArray = this.f27219c;
        if (jSONArray == null || jSONArray.length() == 0) {
            JSONArray m77944a = AbstractC14377g.m77944a(this.f27218b, false);
            this.f27219c = m77944a;
            IAlog.m76529a("%s: active experiments json set = %s", "SupportedFeaturesProvider", m77944a);
        }
        return this.f27219c;
    }

    /* renamed from: a */
    public final void m77928a(C14352e c14352e) {
        for (AbstractC14361h abstractC14361h : this.f27218b.values()) {
            abstractC14361h.getClass();
            ArrayList arrayList = new ArrayList(abstractC14361h.f27199c.values());
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C14349b c14349b = (C14349b) arrayList.get(size);
                ArrayList arrayList2 = c14349b.f27188d;
                if (arrayList2 != null) {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        InterfaceC14351d interfaceC14351d = (InterfaceC14351d) it.next();
                        if (interfaceC14351d.mo77943a(c14352e)) {
                            abstractC14361h.f27199c.remove(c14349b.f27185a);
                            abstractC14361h.f27200d.remove(c14349b.f27185a);
                            this.f27219c = null;
                            IAlog.m76529a("%s: Experiment %s filtered! after response %s", "SupportedFeaturesProvider", c14349b.f27185a, interfaceC14351d);
                            break;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final AbstractC14361h m77927a(Class cls) {
        if (this.f27218b.containsKey(cls)) {
            AbstractC14361h abstractC14361h = (AbstractC14361h) this.f27218b.get(cls);
            if (cls.isInstance(abstractC14361h)) {
                return abstractC14361h;
            }
        }
        try {
            return (AbstractC14361h) cls.getConstructor(null).newInstance(null);
        } catch (Exception e) {
            IAlog.m76530a("Couldn't create a feature for %s", e, cls.getName());
            return null;
        }
    }

    /* renamed from: a */
    public final void m77926a(boolean z, String str) {
        int i;
        int i2;
        int i3;
        C14352e c14352e;
        char c;
        C14381k c14381k;
        this.f27217a = str;
        C14348a c14348a = IAConfigManager.f27060O.f27102z;
        c14348a.f27184b = this;
        for (AbstractC14361h abstractC14361h : this.f27218b.values()) {
            boolean z2 = abstractC14361h instanceof InterfaceC14369p;
            if ((z2 && z) || (!z2 && !z)) {
                C14382l c14382l = c14348a.f27183a;
                if (abstractC14361h != null && c14382l != null) {
                    C14387q c14387q = (C14387q) c14382l.f27212a.get(abstractC14361h.f27198b);
                    int i4 = 2;
                    int i5 = 1;
                    if (c14387q != null) {
                        abstractC14361h.f27214a = c14387q.f27214a;
                        IAlog.m76529a("%s: Feature before variant merge: %s", "a", abstractC14361h);
                        HashMap hashMap = c14387q.f27216c;
                        for (String str2 : hashMap.keySet()) {
                            C14349b c14349b = (C14349b) hashMap.get(str2);
                            if (c14349b != null) {
                                int nextInt = new Random().nextInt(100) + i5;
                                if (c14349b.f27186b < nextInt) {
                                    String str3 = c14349b.f27185a;
                                    Integer valueOf = Integer.valueOf(nextInt);
                                    Integer valueOf2 = Integer.valueOf(c14349b.f27186b);
                                    Object[] objArr = new Object[4];
                                    objArr[0] = "a";
                                    objArr[i5] = str3;
                                    objArr[i4] = valueOf;
                                    objArr[3] = valueOf2;
                                    IAlog.m76529a("%s: Experiment '%s' filtered! rand: %d, with perc: %d", objArr);
                                    i = i5;
                                    i2 = i;
                                } else {
                                    ArrayList arrayList = c14349b.f27188d;
                                    if (arrayList != null) {
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            InterfaceC14351d interfaceC14351d = (InterfaceC14351d) it.next();
                                            try {
                                                Long valueOf3 = Long.valueOf(IAConfigManager.f27060O.f27080d);
                                                c14352e = new C14352e();
                                                c14352e.f27192b = valueOf3;
                                                c14352e.f27193c = AbstractC15395b.m76567a(c14348a.f27184b.f27217a);
                                            } catch (NumberFormatException unused) {
                                                i3 = i5;
                                            }
                                            if (interfaceC14351d.mo77943a(c14352e)) {
                                                try {
                                                    IAlog.m76529a("%s: Experiment '%s' filtered! with %s", "a", c14349b.f27185a, interfaceC14351d);
                                                    break;
                                                } catch (NumberFormatException unused2) {
                                                    i3 = 1;
                                                    Object[] objArr2 = new Object[i3];
                                                    objArr2[0] = "a";
                                                    IAlog.m76529a("%s: invalid publisherId", objArr2);
                                                    i5 = 1;
                                                }
                                            }
                                        }
                                    }
                                    if (abstractC14361h instanceof C14376w) {
                                        Iterator it2 = c14349b.f27187c.iterator();
                                        while (it2.hasNext()) {
                                            C14381k c14381k2 = (C14381k) it2.next();
                                            InterfaceC14384n interfaceC14384n = c14381k2.f27214a;
                                            if (interfaceC14384n != null && interfaceC14384n.mo77932b() != null && c14381k2.f27214a.mo77932b().containsKey("use_fmp_cache_mechanism")) {
                                                InterfaceC15475u interfaceC15475u = (InterfaceC15475u) IAConfigManager.f27060O.f27072J.get(EnumC15477v.Video);
                                                if (!(interfaceC15475u != null ? interfaceC15475u.mo76443a() : false)) {
                                                    i = 1;
                                                    i2 = 1;
                                                }
                                            }
                                        }
                                    }
                                    i = 1;
                                    IAlog.m76529a("%s: Experiment '%s' NOT filtered! rand: %d, with perc: %d", "a", c14349b.f27185a, Integer.valueOf(nextInt), Integer.valueOf(c14349b.f27186b));
                                    i2 = 0;
                                }
                                if (i2 == 0) {
                                    ArrayList arrayList2 = c14349b.f27187c;
                                    int nextInt2 = new Random().nextInt(100) + i;
                                    String str4 = c14349b.f27185a;
                                    Integer valueOf4 = Integer.valueOf(nextInt2);
                                    Object[] objArr3 = new Object[3];
                                    objArr3[0] = "a";
                                    objArr3[i] = str4;
                                    int i6 = 2;
                                    objArr3[2] = valueOf4;
                                    IAlog.m76529a("%s: selectVariant for experiment '%s' generated random number: %d", objArr3);
                                    Iterator it3 = arrayList2.iterator();
                                    int i7 = 0;
                                    while (true) {
                                        if (!it3.hasNext()) {
                                            c = 1;
                                            c14381k = null;
                                            break;
                                        }
                                        c14381k = (C14381k) it3.next();
                                        i7 += c14381k.f27211c;
                                        Object[] objArr4 = new Object[i6];
                                        objArr4[0] = "a";
                                        c = 1;
                                        objArr4[1] = c14381k;
                                        IAlog.m76529a("%s: selectVariant variant found: %s", objArr4);
                                        if (i7 >= nextInt2) {
                                            break;
                                        }
                                        String str5 = c14381k.f27210b;
                                        Object[] objArr5 = new Object[i6];
                                        objArr5[0] = "a";
                                        objArr5[1] = str5;
                                        IAlog.m76529a("%s: selectVariant variant '%s' percentage outside selected range", objArr5);
                                        i6 = 2;
                                    }
                                    if (c14381k != null) {
                                        String str6 = c14349b.f27185a;
                                        Object[] objArr6 = new Object[3];
                                        objArr6[0] = "a";
                                        objArr6[c] = str6;
                                        objArr6[2] = c14381k;
                                        IAlog.m76529a("%s: experiment '%s' variant selected! %s", objArr6);
                                    } else {
                                        String str7 = c14349b.f27185a;
                                        Object[] objArr7 = new Object[2];
                                        objArr7[0] = "a";
                                        objArr7[c] = str7;
                                        IAlog.m76529a("%s: experiment '%s' no variant was selected! using control group", objArr7);
                                    }
                                    abstractC14361h.f27199c.put(c14349b.f27185a, c14349b);
                                    if (c14381k != null) {
                                        abstractC14361h.f27200d.put(c14349b.f27185a, c14381k);
                                    }
                                    i4 = 2;
                                    i5 = 1;
                                } else {
                                    i5 = i;
                                    i4 = 2;
                                }
                            }
                        }
                    }
                    Object[] objArr8 = new Object[i4];
                    objArr8[0] = "a";
                    objArr8[1] = abstractC14361h;
                    IAlog.m76529a("%s: Feature after variant merge: %s", objArr8);
                }
            }
        }
    }
}
