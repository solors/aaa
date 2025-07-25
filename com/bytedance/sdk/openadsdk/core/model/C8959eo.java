package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.core.p313IL.AbstractView$OnClickListenerC8522bX;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.eo */
/* loaded from: classes3.dex */
public class C8959eo {

    /* renamed from: IL */
    private final int[] f19846IL;

    /* renamed from: Kg */
    private final float f19847Kg;

    /* renamed from: Lq */
    private final SparseArray<AbstractView$OnClickListenerC8522bX.C8523bg> f19848Lq;

    /* renamed from: PX */
    private final int f19849PX;

    /* renamed from: Ta */
    private final int f19850Ta;

    /* renamed from: VB */
    private final int f19851VB;
    private final String VzQ;

    /* renamed from: WR */
    private final long f19852WR;

    /* renamed from: bX */
    private final int[] f19853bX;

    /* renamed from: bg */
    private final int[] f19854bg;

    /* renamed from: eo */
    private final long f19855eo;
    private final int[] eqN;

    /* renamed from: iR */
    private final float f19856iR;
    private final float ldr;
    private final JSONObject tuV;

    /* renamed from: vb */
    private final int f19857vb;
    private final JSONObject xxp;
    private final int yDt;

    /* renamed from: zx */
    private final float f19858zx;

    /* renamed from: com.bytedance.sdk.openadsdk.core.model.eo$bg */
    /* loaded from: classes3.dex */
    public static class C8961bg {

        /* renamed from: Fy */
        private int f19859Fy;

        /* renamed from: IL */
        int f19860IL;

        /* renamed from: Kg */
        private float f19861Kg;

        /* renamed from: LZ */
        private JSONObject f19862LZ;

        /* renamed from: Lq */
        private int f19863Lq;

        /* renamed from: PX */
        private int[] f19864PX;

        /* renamed from: Ta */
        private int[] f19865Ta;

        /* renamed from: VB */
        private int[] f19866VB;
        private int VzQ;

        /* renamed from: WR */
        private float f19867WR;

        /* renamed from: bX */
        float f19868bX;

        /* renamed from: bg */
        float f19869bg;

        /* renamed from: eo */
        private int[] f19870eo;
        private long eqN;

        /* renamed from: iR */
        private float f19871iR;
        private float ldr;

        /* renamed from: tC */
        private JSONObject f19872tC;
        private String tuV;

        /* renamed from: vb */
        private int f19873vb;
        private SparseArray<AbstractView$OnClickListenerC8522bX.C8523bg> xxp;
        private int yDt;

        /* renamed from: zx */
        private long f19874zx;

        /* renamed from: IL */
        public C8961bg m84221IL(JSONObject jSONObject) {
            this.f19872tC = jSONObject;
            return this;
        }

        /* renamed from: bX */
        public C8961bg m84212bX(int i) {
            this.f19860IL = i;
            return this;
        }

        /* renamed from: bg */
        public C8961bg m84207bg(int i) {
            this.f19859Fy = i;
            return this;
        }

        public C8961bg eqN(float f) {
            this.f19871iR = f;
            return this;
        }

        public C8961bg ldr(float f) {
            this.f19867WR = f;
            return this;
        }

        /* renamed from: zx */
        public C8961bg m84197zx(float f) {
            this.f19861Kg = f;
            return this;
        }

        /* renamed from: IL */
        public C8961bg m84224IL(int i) {
            this.VzQ = i;
            return this;
        }

        /* renamed from: bX */
        public C8961bg m84213bX(float f) {
            this.ldr = f;
            return this;
        }

        /* renamed from: bg */
        public C8961bg m84202bg(JSONObject jSONObject) {
            this.f19862LZ = jSONObject;
            return this;
        }

        public C8961bg eqN(int[] iArr) {
            this.f19865Ta = iArr;
            return this;
        }

        public C8961bg ldr(int i) {
            this.f19873vb = i;
            return this;
        }

        /* renamed from: zx */
        public C8961bg m84196zx(int i) {
            this.f19863Lq = i;
            return this;
        }

        /* renamed from: IL */
        public C8961bg m84225IL(float f) {
            this.f19868bX = f;
            return this;
        }

        /* renamed from: bX */
        public C8961bg m84210bX(int[] iArr) {
            this.f19864PX = iArr;
            return this;
        }

        /* renamed from: bg */
        public C8961bg m84205bg(SparseArray<AbstractView$OnClickListenerC8522bX.C8523bg> sparseArray) {
            this.xxp = sparseArray;
            return this;
        }

        public C8961bg eqN(int i) {
            this.yDt = i;
            return this;
        }

        /* renamed from: IL */
        public C8961bg m84223IL(long j) {
            this.f19874zx = j;
            return this;
        }

        /* renamed from: bg */
        public C8961bg m84208bg(float f) {
            this.f19869bg = f;
            return this;
        }

        /* renamed from: IL */
        public C8961bg m84220IL(int[] iArr) {
            this.f19866VB = iArr;
            return this;
        }

        /* renamed from: bg */
        public C8961bg m84206bg(long j) {
            this.eqN = j;
            return this;
        }

        /* renamed from: bg */
        public C8961bg m84201bg(int[] iArr) {
            this.f19870eo = iArr;
            return this;
        }

        /* renamed from: bg */
        public C8961bg m84203bg(String str) {
            this.tuV = str;
            return this;
        }

        /* renamed from: bg */
        public C8959eo m84209bg() {
            return new C8959eo(this);
        }
    }

    /* renamed from: bg */
    public JSONObject m84227bg() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.tuV;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.putOpt(next, this.tuV.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.f19854bg;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.f19854bg[1]));
            }
            int[] iArr2 = this.f19846IL;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.f19846IL[1]));
            }
            int[] iArr3 = this.f19853bX;
            if (iArr3 != null && iArr3.length == 2) {
                jSONObject.putOpt("button_x", Integer.valueOf(iArr3[0])).putOpt("button_y", Integer.valueOf(this.f19853bX[1]));
            }
            int[] iArr4 = this.eqN;
            if (iArr4 != null && iArr4.length == 2) {
                jSONObject.putOpt("button_width", Integer.valueOf(iArr4[0])).putOpt("button_height", Integer.valueOf(this.eqN[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.f19858zx)).putOpt("down_y", Float.toString(this.ldr)).putOpt("up_x", Float.toString(this.f19856iR)).putOpt("up_y", Float.toString(this.f19847Kg)).putOpt("down_time", Long.valueOf(this.f19852WR)).putOpt("up_time", Long.valueOf(this.f19855eo)).putOpt("toolType", Integer.valueOf(this.f19851VB)).putOpt("deviceId", Integer.valueOf(this.f19849PX)).putOpt("source", Integer.valueOf(this.f19850Ta)).putOpt("ft", m84226bg(this.f19848Lq, this.yDt)).putOpt("click_area_type", this.VzQ);
            int i = this.f19857vb;
            if (i > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i));
            }
            JSONObject jSONObject3 = this.xxp;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    private C8959eo(@NonNull C8961bg c8961bg) {
        this.f19854bg = c8961bg.f19866VB;
        this.f19846IL = c8961bg.f19864PX;
        this.eqN = c8961bg.f19865Ta;
        this.f19853bX = c8961bg.f19870eo;
        this.f19858zx = c8961bg.f19867WR;
        this.ldr = c8961bg.f19861Kg;
        this.f19856iR = c8961bg.f19871iR;
        this.f19847Kg = c8961bg.ldr;
        this.f19852WR = c8961bg.f19874zx;
        this.f19855eo = c8961bg.eqN;
        this.f19851VB = c8961bg.yDt;
        this.f19849PX = c8961bg.f19863Lq;
        this.f19850Ta = c8961bg.f19873vb;
        this.yDt = c8961bg.VzQ;
        this.f19848Lq = c8961bg.xxp;
        this.VzQ = c8961bg.tuV;
        this.f19857vb = c8961bg.f19859Fy;
        this.xxp = c8961bg.f19862LZ;
        this.tuV = c8961bg.f19872tC;
    }

    /* renamed from: bg */
    public static JSONObject m84226bg(SparseArray<AbstractView$OnClickListenerC8522bX.C8523bg> sparseArray, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    AbstractView$OnClickListenerC8522bX.C8523bg valueAt = sparseArray.valueAt(i2);
                    if (valueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(valueAt.f18753bX)).putOpt("mr", Double.valueOf(valueAt.f18752IL)).putOpt("phase", Integer.valueOf(valueAt.f18754bg)).putOpt("ts", Long.valueOf(valueAt.eqN));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
