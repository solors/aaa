package com.bytedance.sdk.component.adexpress.p243bg.p245bX;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C21114v8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.bg.bX.bg */
/* loaded from: classes3.dex */
public class C7318bg {

    /* renamed from: IL */
    private String f15837IL;

    /* renamed from: bX */
    private String f15838bX;

    /* renamed from: bg */
    private String f15839bg;
    private List<C7320bg> eqN;
    private Map<String, C7318bg> ldr = new ConcurrentHashMap();

    /* renamed from: zx */
    private C7319IL f15840zx;

    /* renamed from: com.bytedance.sdk.component.adexpress.bg.bX.bg$IL */
    /* loaded from: classes3.dex */
    public static class C7319IL {

        /* renamed from: IL */
        private String f15841IL;

        /* renamed from: bX */
        private List<Pair<String, String>> f15842bX;

        /* renamed from: bg */
        private String f15843bg;

        /* renamed from: IL */
        public void m89136IL(String str) {
            this.f15841IL = str;
        }

        /* renamed from: bg */
        public String m89135bg() {
            return this.f15843bg;
        }

        /* renamed from: IL */
        public List<Pair<String, String>> m89138IL() {
            return this.f15842bX;
        }

        /* renamed from: bg */
        public void m89133bg(String str) {
            this.f15843bg = str;
        }

        /* renamed from: bg */
        public void m89132bg(List<Pair<String, String>> list) {
            this.f15842bX = list;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.bg.bX.bg$bg */
    /* loaded from: classes3.dex */
    public static class C7320bg {

        /* renamed from: IL */
        private String f15844IL;

        /* renamed from: bX */
        private int f15845bX;

        /* renamed from: bg */
        private String f15846bg;

        /* renamed from: IL */
        public String m89131IL() {
            return this.f15844IL;
        }

        /* renamed from: bX */
        public int m89129bX() {
            return this.f15845bX;
        }

        /* renamed from: bg */
        public String m89128bg() {
            return this.f15846bg;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C7320bg) {
                String str2 = this.f15846bg;
                if (str2 != null) {
                    C7320bg c7320bg = (C7320bg) obj;
                    if (str2.equals(c7320bg.m89128bg()) && (str = this.f15844IL) != null && str.equals(c7320bg.m89131IL())) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }

        /* renamed from: IL */
        public void m89130IL(String str) {
            this.f15844IL = str;
        }

        /* renamed from: bg */
        public void m89126bg(String str) {
            this.f15846bg = str;
        }

        /* renamed from: bg */
        public void m89127bg(int i) {
            this.f15845bX = i;
        }
    }

    /* renamed from: IL */
    public String m89151IL() {
        return this.f15839bg;
    }

    /* renamed from: Kg */
    public JSONObject m89149Kg() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", m89151IL());
            jSONObject.putOpt("version", m89147bX());
            jSONObject.putOpt(C21114v8.C21122h.f54053Z, eqN());
            JSONArray jSONArray = new JSONArray();
            if (ldr() != null) {
                for (C7320bg c7320bg : ldr()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c7320bg.m89128bg());
                    jSONObject2.putOpt("md5", c7320bg.m89131IL());
                    jSONObject2.putOpt("level", Integer.valueOf(c7320bg.m89129bX()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.ldr.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z = false;
                for (String str : this.ldr.keySet()) {
                    C7318bg c7318bg = this.ldr.get(str);
                    if (c7318bg != null) {
                        jSONObject3.put(str, c7318bg.m89149Kg());
                        z = true;
                    }
                }
                if (z) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            C7319IL m89139zx = m89139zx();
            if (m89139zx != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", m89139zx.f15843bg);
                jSONObject4.put("md5", m89139zx.f15841IL);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> m89138IL = m89139zx.m89138IL();
                if (m89138IL != null) {
                    for (Pair<String, String> pair : m89138IL) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: WR */
    public String m89148WR() {
        JSONObject m89149Kg;
        if (m89140iR() && (m89149Kg = m89149Kg()) != null) {
            return m89149Kg.toString();
        }
        return null;
    }

    /* renamed from: bX */
    public String m89147bX() {
        return this.f15837IL;
    }

    /* renamed from: bg */
    public Map<String, C7318bg> m89145bg() {
        return this.ldr;
    }

    public String eqN() {
        return this.f15838bX;
    }

    /* renamed from: iR */
    public boolean m89140iR() {
        if (!TextUtils.isEmpty(eqN()) && !TextUtils.isEmpty(m89147bX()) && !TextUtils.isEmpty(m89151IL())) {
            return true;
        }
        return false;
    }

    public List<C7320bg> ldr() {
        if (this.eqN == null) {
            this.eqN = new ArrayList();
        }
        return this.eqN;
    }

    /* renamed from: zx */
    public C7319IL m89139zx() {
        return this.f15840zx;
    }

    public static C7318bg eqN(String str) {
        if (str == null) {
            return null;
        }
        try {
            return m89141bg(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: IL */
    public void m89150IL(String str) {
        this.f15837IL = str;
    }

    /* renamed from: bX */
    public void m89146bX(String str) {
        this.f15838bX = str;
    }

    /* renamed from: bg */
    public void m89143bg(String str) {
        this.f15839bg = str;
    }

    /* renamed from: bg */
    public void m89144bg(C7319IL c7319il) {
        this.f15840zx = c7319il;
    }

    /* renamed from: bg */
    public void m89142bg(List<C7320bg> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.eqN = list;
    }

    /* renamed from: bg */
    public static C7318bg m89141bg(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null) {
            return null;
        }
        C7318bg c7318bg = new C7318bg();
        c7318bg.m89143bg(jSONObject.optString("name"));
        c7318bg.m89150IL(jSONObject.optString("version"));
        c7318bg.m89146bX(jSONObject.optString(C21114v8.C21122h.f54053Z));
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                C7320bg c7320bg = new C7320bg();
                c7320bg.m89126bg(optJSONObject2.optString("url"));
                c7320bg.m89130IL(optJSONObject2.optString("md5"));
                c7320bg.m89127bg(optJSONObject2.optInt("level"));
                arrayList.add(c7320bg);
            }
        }
        c7318bg.m89142bg(arrayList);
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("engines");
            if (optJSONObject3 != null) {
                Iterator<String> keys = optJSONObject3.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    C7318bg m89141bg = m89141bg(optJSONObject3.optJSONObject(next));
                    if (m89141bg != null) {
                        c7318bg.m89145bg().put(next, m89141bg);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if (jSONObject.has("resources_archive") && (optJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            C7319IL c7319il = new C7319IL();
            c7319il.m89133bg(optJSONObject.optString("url"));
            c7319il.m89136IL(optJSONObject.optString("md5"));
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("map");
            if (optJSONObject4 != null) {
                Iterator<String> keys2 = optJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    arrayList2.add(new Pair<>(next2, optJSONObject4.optString(next2)));
                }
                c7319il.m89132bg(arrayList2);
            }
            c7318bg.m89144bg(c7319il);
        }
        if (c7318bg.m89140iR()) {
            return c7318bg;
        }
        return null;
    }
}
