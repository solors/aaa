package com.bytedance.sdk.openadsdk.core.p316PX.p317IL;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.p257iR.C7608IL;
import com.bytedance.sdk.component.p257iR.p258IL.AbstractC7611bX;
import com.bytedance.sdk.component.p257iR.p258IL.C7609IL;
import com.bytedance.sdk.component.p257iR.p260bg.AbstractC7632bg;
import com.bytedance.sdk.component.utils.C7759rri;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.core.p316PX.p317IL.C8619IL;
import com.bytedance.sdk.openadsdk.core.p316PX.p317IL.C8629bg;
import com.bytedance.sdk.openadsdk.core.p316PX.p318bX.C8636bX;
import com.bytedance.sdk.openadsdk.core.p316PX.p319bg.EnumC8646bg;
import com.bytedance.sdk.openadsdk.eqN.C9165bX;
import com.bytedance.sdk.openadsdk.utils.ayS;
import com.bytedance.sdk.openadsdk.xxp.C9585bX;
import com.p552ot.pubsub.p553a.C26484a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.IL.bX */
/* loaded from: classes3.dex */
public class C8622bX {

    /* renamed from: IL */
    private EnumC8627bX f19013IL;

    /* renamed from: bX */
    private boolean f19014bX;

    /* renamed from: bg */
    private final String f19015bg;
    private boolean eqN;

    /* renamed from: zx */
    private static final Map<String, C8626IL> f19012zx = new ConcurrentHashMap();
    private static final AtomicBoolean ldr = new AtomicBoolean(false);

    /* renamed from: com.bytedance.sdk.openadsdk.core.PX.IL.bX$IL */
    /* loaded from: classes3.dex */
    public static class C8626IL {

        /* renamed from: IL */
        AbstractC8967tuV f19023IL;

        /* renamed from: bX */
        float f19024bX;

        /* renamed from: bg */
        String f19025bg;

        public C8626IL(String str, AbstractC8967tuV abstractC8967tuV) {
            this(str, abstractC8967tuV, -1.0f);
        }

        public C8626IL(String str, AbstractC8967tuV abstractC8967tuV, float f) {
            this.f19025bg = str;
            this.f19023IL = abstractC8967tuV;
            this.f19024bX = f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.openadsdk.core.PX.IL.bX$bX */
    /* loaded from: classes3.dex */
    public enum EnumC8627bX {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.PX.IL.bX$bg */
    /* loaded from: classes3.dex */
    public static class C8628bg {

        /* renamed from: IL */
        private EnumC8627bX f19029IL = EnumC8627bX.TRACKING_URL;

        /* renamed from: bX */
        private boolean f19030bX = false;

        /* renamed from: bg */
        private final String f19031bg;

        public C8628bg(String str) {
            this.f19031bg = str;
        }

        /* renamed from: bg */
        public C8628bg m85506bg(boolean z) {
            this.f19030bX = z;
            return this;
        }

        /* renamed from: bg */
        public C8622bX m85507bg() {
            return new C8622bX(this.f19031bg, this.f19029IL, Boolean.valueOf(this.f19030bX));
        }
    }

    static {
        C7759rri.m87804bg(new C7759rri.InterfaceC7762bg() { // from class: com.bytedance.sdk.openadsdk.core.PX.IL.bX.1
            @Override // com.bytedance.sdk.component.utils.C7759rri.InterfaceC7762bg
            /* renamed from: bg */
            public void mo84888bg(Context context, Intent intent, boolean z, int i) {
                if (i != 0 && C8622bX.f19012zx.size() > 0) {
                    C8622bX.m85524IL();
                }
            }
        }, C8838VzQ.m84740bg());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public C8622bX(String str, EnumC8627bX enumC8627bX, Boolean bool) {
        this.f19015bg = str;
        this.f19013IL = enumC8627bX;
        this.f19014bX = bool.booleanValue();
    }

    /* renamed from: IL */
    public static void m85523IL(@NonNull List<C8622bX> list, @Nullable EnumC8646bg enumC8646bg, @Nullable long j, @Nullable String str) {
        m85514bg(list, enumC8646bg, j, str, null);
    }

    /* renamed from: bX */
    public String m85520bX() {
        return this.f19015bg;
    }

    public boolean eqN() {
        return this.f19014bX;
    }

    /* renamed from: j_ */
    public void mo85509j_() {
        this.eqN = true;
    }

    /* renamed from: zx */
    public boolean m85508zx() {
        return this.eqN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public static void m85524IL() {
        if (ldr.compareAndSet(false, true)) {
            Map<String, C8626IL> map = f19012zx;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    m85518bg((String) entry.getKey(), (C8626IL) entry.getValue(), true);
                }
            }
            ldr.set(false);
        }
    }

    /* renamed from: bX */
    public static List<C8629bg> m85519bX(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new C8629bg.C8630bg(optJSONObject.optString("content"), optJSONObject.optLong("trackingMilliseconds", 0L)).m85501bg());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: bg */
    public static List<String> m85515bg(@NonNull List<C8622bX> list, @Nullable EnumC8646bg enumC8646bg, @Nullable long j, @Nullable String str) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (C8622bX c8622bX : list) {
            if (c8622bX != null && (!c8622bX.m85508zx() || c8622bX.eqN())) {
                arrayList.add(c8622bX.m85520bX());
                c8622bX.mo85509j_();
            }
        }
        return new C8636bX(arrayList).m85481bg(enumC8646bg).m85482bg(j).m85480bg(str).m85483bg();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: IL */
    public static void m85521IL(final boolean z, final String str, final String str2, final C8626IL c8626il, final String str3, final boolean z2) {
        C9165bX.m83428bg(new AbstractRunnableC7227Kg("dsp_track_link_result") { // from class: com.bytedance.sdk.openadsdk.core.PX.IL.bX.3
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", c8626il.f19025bg);
                    jSONObject.put("success", z);
                    if (!TextUtils.isEmpty(str)) {
                        jSONObject.put("description", str);
                    }
                    jSONObject.put("url", str3);
                    float f = c8626il.f19024bX;
                    if (f >= 0.0f) {
                        jSONObject.put("progress", Math.round(f * 100.0f) / 100.0d);
                    }
                    if (z2) {
                        jSONObject.put(C26484a.f69196M, true);
                    }
                } catch (Throwable unused) {
                }
                C9165bX.m83442IL(c8626il.f19023IL, str2, "dsp_track_link_result", jSONObject);
            }
        });
    }

    /* renamed from: IL */
    public static List<C8619IL> m85522IL(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new C8619IL.C8621bg(optJSONObject.optString("content"), (float) optJSONObject.optDouble("trackingFraction", 0.0d)).m85525bg());
                }
            }
        }
        return arrayList;
    }

    /* renamed from: bg */
    public static void m85514bg(@NonNull List<C8622bX> list, @Nullable EnumC8646bg enumC8646bg, @Nullable long j, @Nullable String str, C8626IL c8626il) {
        m85516bg(m85515bg(list, enumC8646bg, j, str), c8626il);
    }

    /* renamed from: bg */
    public static void m85516bg(List<String> list, C8626IL c8626il) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                m85518bg(str, c8626il, false);
            }
        }
    }

    /* renamed from: bg */
    private static void m85518bg(final String str, final C8626IL c8626il, final boolean z) {
        C7609IL m88316bX = C9585bX.m82322bg().m82324IL().m88316bX();
        if (m88316bX == null) {
            return;
        }
        m88316bX.m88403bg(true);
        m88316bX.m88402IL(str);
        m88316bX.m88405bg(new AbstractC7632bg() { // from class: com.bytedance.sdk.openadsdk.core.PX.IL.bX.2
            @Override // com.bytedance.sdk.component.p257iR.p260bg.AbstractC7632bg
            /* renamed from: bg */
            public void mo83462bg(AbstractC7611bX abstractC7611bX, C7608IL c7608il) {
                boolean z2;
                C8626IL c8626il2 = C8626IL.this;
                if (c8626il2 == null || c8626il2.f19023IL == null) {
                    return;
                }
                String str2 = null;
                if (c7608il == null || !c7608il.ldr()) {
                    z2 = false;
                    if (c7608il != null) {
                        str2 = c7608il.m88412bg() + ":" + c7608il.m88414IL();
                        if (!z && (c7608il.m88412bg() <= 300 || c7608il.m88412bg() >= 400)) {
                            C8622bX.f19012zx.put(str, C8626IL.this);
                        }
                    }
                } else {
                    z2 = true;
                }
                C8622bX.m85521IL(z2, str2, ayS.m82475bX(C8626IL.this.f19023IL.mo84135Fx()), C8626IL.this, str, z);
                if (c7608il == null || c7608il.m88412bg() != 200 || C8622bX.f19012zx.size() <= 0) {
                    return;
                }
                C8622bX.m85524IL();
            }

            @Override // com.bytedance.sdk.component.p257iR.p260bg.AbstractC7632bg
            /* renamed from: bg */
            public void mo83461bg(AbstractC7611bX abstractC7611bX, IOException iOException) {
                AbstractC8967tuV abstractC8967tuV;
                C8626IL c8626il2 = C8626IL.this;
                if (c8626il2 != null && (abstractC8967tuV = c8626il2.f19023IL) != null) {
                    C8622bX.m85521IL(false, iOException != null ? iOException.getMessage() : null, ayS.m82475bX(abstractC8967tuV.mo84135Fx()), C8626IL.this, str, z);
                }
                if (z || C8626IL.this == null) {
                    return;
                }
                C8622bX.f19012zx.put(str, C8626IL.this);
            }
        });
    }

    /* renamed from: bg */
    public static JSONArray m85517bg(List<C8622bX> list) {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < list.size(); i++) {
            jSONArray.put(list.get(i).m85520bX());
        }
        return jSONArray;
    }

    /* renamed from: bg */
    public static List<C8622bX> m85513bg(JSONArray jSONArray) {
        return m85512bg(jSONArray, false);
    }

    /* renamed from: bg */
    public static List<C8622bX> m85512bg(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new C8628bg(optString).m85506bg(z).m85507bg());
                }
            }
        }
        return arrayList;
    }
}
