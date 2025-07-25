package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.bytedance.adsdk.ugeno.p205IL.AbstractView$OnTouchListenerC6981bX;
import com.bytedance.adsdk.ugeno.p213bX.C7033IL;
import com.bytedance.adsdk.ugeno.p222iR.C7113IL;
import com.bytedance.adsdk.ugeno.p222iR.C7114Kg;
import com.bytedance.adsdk.ugeno.p222iR.C7117bX;
import com.bytedance.adsdk.ugeno.p222iR.C7118bg;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.adsdk.ugeno.core.bg */
/* loaded from: classes3.dex */
public class C7072bg {

    /* renamed from: IL */
    private float f15194IL;

    /* renamed from: bX */
    private List<C7073bg> f15195bX;

    /* renamed from: bg */
    private String f15196bg;
    private long eqN;
    private String ldr;

    /* renamed from: zx */
    private long f15197zx;

    /* renamed from: com.bytedance.adsdk.ugeno.core.bg$bg */
    /* loaded from: classes3.dex */
    public static class C7073bg {

        /* renamed from: IL */
        private float f15198IL;

        /* renamed from: Kg */
        private float[] f15199Kg;

        /* renamed from: WR */
        private String f15200WR;

        /* renamed from: bX */
        private String f15201bX;

        /* renamed from: bg */
        private long f15202bg;

        /* renamed from: eo */
        private String f15203eo;
        private long eqN;

        /* renamed from: iR */
        private float f15204iR;
        private float ldr;

        /* renamed from: zx */
        private String f15205zx;

        /* renamed from: IL */
        public float m90129IL() {
            return this.f15198IL;
        }

        /* renamed from: Kg */
        public float[] m90122Kg() {
            return this.f15199Kg;
        }

        /* renamed from: WR */
        public String m90121WR() {
            return this.f15200WR;
        }

        /* renamed from: bX */
        public String m90120bX() {
            return this.f15201bX;
        }

        /* renamed from: bg */
        public long m90116bg() {
            return this.f15202bg;
        }

        /* renamed from: eo */
        public String m90107eo() {
            return this.f15203eo;
        }

        public long eqN() {
            return this.eqN;
        }

        /* renamed from: iR */
        public float m90106iR() {
            return this.f15204iR;
        }

        public float ldr() {
            return this.ldr;
        }

        /* renamed from: zx */
        public String m90105zx() {
            return this.f15205zx;
        }

        /* renamed from: IL */
        public void m90126IL(long j) {
            this.eqN = j;
        }

        /* renamed from: bX */
        public void m90119bX(float f) {
            this.f15204iR = f;
        }

        /* renamed from: bg */
        public void m90113bg(long j) {
            this.f15202bg = j;
        }

        public void eqN(String str) {
            this.f15200WR = str;
        }

        /* renamed from: IL */
        public void m90124IL(String str) {
            this.f15205zx = str;
        }

        /* renamed from: bX */
        public void m90117bX(String str) {
            this.f15203eo = str;
        }

        /* renamed from: bg */
        public void m90114bg(float f) {
            this.f15198IL = f;
        }

        /* renamed from: IL */
        public void m90127IL(float f) {
            this.ldr = f;
        }

        /* renamed from: bg */
        public void m90112bg(String str) {
            this.f15201bX = str;
        }

        /* renamed from: bg */
        public void m90108bg(float[] fArr) {
            this.f15199Kg = fArr;
        }

        /* renamed from: bg */
        public static C7073bg m90110bg(JSONObject jSONObject, AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX) {
            if (jSONObject == null) {
                return null;
            }
            C7073bg c7073bg = new C7073bg();
            c7073bg.m90113bg(jSONObject.optLong("duration"));
            String optString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", optString)) {
                c7073bg.m90114bg(-1.0f);
            } else {
                try {
                    c7073bg.m90114bg(Float.parseFloat(optString));
                } catch (NumberFormatException unused) {
                    c7073bg.m90114bg(0.0f);
                }
            }
            c7073bg.m90112bg(jSONObject.optString("loopMode"));
            c7073bg.m90124IL(jSONObject.optString("type"));
            if (TextUtils.equals(c7073bg.m90105zx(), "ripple")) {
                c7073bg.m90117bX(jSONObject.optString("rippleColor"));
            }
            View m90372WR = abstractView$OnTouchListenerC6981bX.m90372WR();
            Context context = m90372WR != null ? m90372WR.getContext() : null;
            if (TextUtils.equals(c7073bg.m90105zx(), "backgroundColor")) {
                String m90221bg = C7033IL.m90221bg(jSONObject.optString("valueTo"), abstractView$OnTouchListenerC6981bX.m90352eo());
                int m89995bg = C7118bg.m89995bg(jSONObject.optString("valueFrom"));
                int m89995bg2 = C7118bg.m89995bg(m90221bg);
                c7073bg.m90127IL(m89995bg);
                c7073bg.m90119bX(m89995bg2);
            } else if ((TextUtils.equals(c7073bg.m90105zx(), "translateX") || TextUtils.equals(c7073bg.m90105zx(), "translateY")) && context != null) {
                try {
                    float m90009bg = C7114Kg.m90009bg(context, (float) jSONObject.optDouble("valueFrom"));
                    float m90009bg2 = C7114Kg.m90009bg(context, (float) jSONObject.optDouble("valueTo"));
                    c7073bg.m90127IL(m90009bg);
                    c7073bg.m90119bX(m90009bg2);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c7073bg.m90127IL((float) jSONObject.optDouble("valueFrom"));
                c7073bg.m90119bX((float) jSONObject.optDouble("valueTo"));
            }
            c7073bg.eqN(jSONObject.optString("interpolator"));
            String m90221bg2 = C7033IL.m90221bg(jSONObject.optString("startDelay"), abstractView$OnTouchListenerC6981bX.m90352eo());
            Log.d("TAG", "createAnimationModel: ");
            c7073bg.m90126IL(C7117bX.m90000bg(m90221bg2, 0L));
            JSONArray optJSONArray = jSONObject.optJSONArray("values");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                float[] fArr = new float[optJSONArray.length()];
                int i = 0;
                if ((TextUtils.equals(c7073bg.m90105zx(), "translateX") || TextUtils.equals(c7073bg.m90105zx(), "translateY")) && context != null) {
                    while (i < optJSONArray.length()) {
                        fArr[i] = C7114Kg.m90009bg(context, (float) C7072bg.m90136bg(optJSONArray.optString(i), abstractView$OnTouchListenerC6981bX.m90352eo()));
                        i++;
                    }
                } else {
                    while (i < optJSONArray.length()) {
                        fArr[i] = (float) C7072bg.m90136bg(optJSONArray.optString(i), abstractView$OnTouchListenerC6981bX.m90352eo());
                        i++;
                    }
                }
                c7073bg.m90108bg(fArr);
            }
            return c7073bg;
        }
    }

    /* renamed from: IL */
    public float m90143IL() {
        return this.f15194IL;
    }

    /* renamed from: bX */
    public List<C7073bg> m90140bX() {
        return this.f15195bX;
    }

    /* renamed from: bg */
    public String m90139bg() {
        return this.f15196bg;
    }

    public long eqN() {
        return this.eqN;
    }

    public String ldr() {
        return this.ldr;
    }

    /* renamed from: zx */
    public long m90130zx() {
        return this.f15197zx;
    }

    /* renamed from: IL */
    public void m90142IL(long j) {
        this.f15197zx = j;
    }

    /* renamed from: bg */
    public void m90135bg(String str) {
        this.f15196bg = str;
    }

    /* renamed from: IL */
    public void m90141IL(String str) {
        this.ldr = str;
    }

    /* renamed from: bg */
    public void m90138bg(float f) {
        this.f15194IL = f;
    }

    /* renamed from: bg */
    public void m90133bg(List<C7073bg> list) {
        this.f15195bX = list;
    }

    /* renamed from: bg */
    public void m90137bg(long j) {
        this.eqN = j;
    }

    /* renamed from: bg */
    public static C7072bg m90134bg(String str, AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return m90132bg(new JSONObject(str), abstractView$OnTouchListenerC6981bX);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: bg */
    public static C7072bg m90132bg(JSONObject jSONObject, AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX) {
        return m90131bg(jSONObject, null, abstractView$OnTouchListenerC6981bX);
    }

    /* renamed from: bg */
    public static C7072bg m90131bg(JSONObject jSONObject, JSONObject jSONObject2, AbstractView$OnTouchListenerC6981bX abstractView$OnTouchListenerC6981bX) {
        if (jSONObject == null) {
            return null;
        }
        C7072bg c7072bg = new C7072bg();
        c7072bg.m90135bg(jSONObject.optString("ordering"));
        String optString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", optString)) {
            c7072bg.m90138bg(-1.0f);
        } else {
            try {
                c7072bg.m90138bg(Float.parseFloat(optString));
            } catch (NumberFormatException unused) {
                c7072bg.m90138bg(0.0f);
            }
        }
        c7072bg.m90137bg(jSONObject.optLong("duration", 0L));
        c7072bg.m90142IL(C7117bX.m90000bg(C7033IL.m90221bg(jSONObject.optString("startDelay"), abstractView$OnTouchListenerC6981bX.m90352eo()), 0L));
        c7072bg.m90141IL(jSONObject.optString("loopMode"));
        JSONArray optJSONArray = jSONObject.optJSONArray("animators");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (jSONObject2 != null) {
                    C7113IL.m90012bg(jSONObject2, optJSONObject);
                }
                arrayList.add(C7073bg.m90110bg(optJSONObject, abstractView$OnTouchListenerC6981bX));
            }
            c7072bg.m90133bg(arrayList);
        }
        return c7072bg;
    }

    /* renamed from: bg */
    public static double m90136bg(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return C7117bX.m90003bg(C7033IL.m90221bg((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
