package com.bytedance.sdk.openadsdk.yDt.p365bg;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseIntArray;
import com.bytedance.sdk.component.p228IL.p229bg.C7221yDt;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.multipro.eqN.C9353eqN;
import com.bytedance.sdk.openadsdk.utils.C9519VJ;
import com.bytedance.sdk.openadsdk.yDt.C9601bX;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.yDt.bg.zx */
/* loaded from: classes3.dex */
public class C9636zx {

    /* renamed from: bg */
    public static int f21480bg = -10;

    /* renamed from: IL */
    private final int f21481IL;

    /* renamed from: Kg */
    private int f21482Kg;

    /* renamed from: VB */
    private int f21483VB;

    /* renamed from: WR */
    private boolean f21484WR;

    /* renamed from: bX */
    private String f21485bX;

    /* renamed from: eo */
    private String f21486eo;
    private long eqN;

    /* renamed from: iR */
    private int f21487iR;
    private long ldr;

    /* renamed from: zx */
    private long f21488zx;

    public C9636zx(int i) {
        this.f21481IL = i;
    }

    /* renamed from: IL */
    public C9636zx m82188IL(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.f21487iR = bytes.length;
        }
        return this;
    }

    /* renamed from: bX */
    public C9636zx m82185bX(String str) {
        byte[] bytes;
        if (!TextUtils.isEmpty(str) && (bytes = str.getBytes()) != null) {
            this.f21482Kg = bytes.length;
        }
        return this;
    }

    /* renamed from: bg */
    public C9636zx m82180bg(String str) {
        this.f21485bX = str;
        return this;
    }

    public C9636zx eqN(String str) {
        this.f21486eo = str;
        return this;
    }

    public static void eqN() {
        synchronized (C9636zx.class) {
            long m82979bg = C9353eqN.m82979bg("tt_sdk_req_monitor", "req_monitor_las_req", 0L);
            if (m82979bg <= 0) {
                C9353eqN.m82976bg("tt_sdk_req_monitor", "req_monitor_las_req", Long.valueOf(System.currentTimeMillis()));
                return;
            }
            if (System.currentTimeMillis() - m82979bg >= 86400000) {
                String m82984IL = C9353eqN.m82984IL("tt_sdk_req_monitor", "req_monitor_data", null);
                if (!TextUtils.isEmpty(m82984IL)) {
                    C9601bX.m82295bX(m82984IL);
                    C9353eqN.m82982bg("tt_sdk_req_monitor");
                    C9353eqN.m82976bg("tt_sdk_req_monitor", "req_monitor_las_req", Long.valueOf(System.currentTimeMillis()));
                }
            }
        }
    }

    /* renamed from: bg */
    public C9636zx m82182bg(C7221yDt c7221yDt) {
        byte[] bArr;
        if (c7221yDt != null) {
            if (c7221yDt.ldr == C7221yDt.EnumC7222bg.STRING_TYPE && !TextUtils.isEmpty(c7221yDt.m89561bg())) {
                this.f21487iR = c7221yDt.m89561bg().getBytes().length;
            }
            if (c7221yDt.ldr == C7221yDt.EnumC7222bg.BYTE_ARRAY_TYPE && (bArr = c7221yDt.f15578zx) != null) {
                this.f21487iR = bArr.length;
            }
        }
        return this;
    }

    /* renamed from: IL */
    public void m82190IL() {
        this.ldr = SystemClock.elapsedRealtime() - this.eqN;
    }

    /* renamed from: bX */
    public void m82187bX() {
        this.f21488zx = SystemClock.elapsedRealtime() - this.eqN;
        C9519VJ.m82581bX().execute(new Runnable() { // from class: com.bytedance.sdk.openadsdk.yDt.bg.zx.1
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                C9638bg c9638bg;
                C9638bg c9638bg2;
                synchronized (C9636zx.class) {
                    String m82984IL = C9353eqN.m82984IL("tt_sdk_req_monitor", "req_monitor_data", null);
                    try {
                        if (TextUtils.isEmpty(m82984IL)) {
                            jSONObject = new JSONObject();
                        } else {
                            jSONObject = new JSONObject(m82984IL);
                        }
                    } catch (Exception e) {
                        C7741PX.m87880IL(e.getMessage());
                    }
                    if (jSONObject.has(C9636zx.this.f21485bX)) {
                        JSONObject optJSONObject = jSONObject.optJSONObject(C9636zx.this.f21485bX);
                        if (optJSONObject != null) {
                            c9638bg2 = C9638bg.m82175bg(optJSONObject);
                            c9638bg2.m82174bg(C9636zx.this.f21484WR, C9636zx.this.f21488zx, C9636zx.this.f21487iR, C9636zx.this.f21482Kg, C9636zx.this.f21483VB);
                            jSONObject.put(C9636zx.this.f21485bX, c9638bg2.m82176bg());
                            C9353eqN.m82974bg("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                        } else {
                            c9638bg = new C9638bg(C9636zx.this.f21481IL, C9636zx.this.f21484WR, C9636zx.this.f21488zx, C9636zx.this.f21487iR, C9636zx.this.f21482Kg, C9636zx.this.f21483VB);
                        }
                    } else {
                        c9638bg = new C9638bg(C9636zx.this.f21481IL, C9636zx.this.f21484WR, C9636zx.this.f21488zx, C9636zx.this.f21487iR, C9636zx.this.f21482Kg, C9636zx.this.f21483VB);
                    }
                    c9638bg2 = c9638bg;
                    jSONObject.put(C9636zx.this.f21485bX, c9638bg2.m82176bg());
                    C9353eqN.m82974bg("tt_sdk_req_monitor", "req_monitor_data", jSONObject.toString());
                }
            }
        });
    }

    /* renamed from: com.bytedance.sdk.openadsdk.yDt.bg.zx$bg */
    /* loaded from: classes3.dex */
    private static class C9638bg {

        /* renamed from: IL */
        private int f21490IL;

        /* renamed from: Kg */
        private final SparseIntArray f21491Kg;

        /* renamed from: bX */
        private int f21492bX;

        /* renamed from: bg */
        private int f21493bg;
        private long eqN;

        /* renamed from: iR */
        private int f21494iR;
        private int ldr;

        /* renamed from: zx */
        private long f21495zx;

        public C9638bg() {
            this.f21493bg = 0;
            this.f21490IL = 0;
            this.f21492bX = 0;
            this.eqN = 0L;
            this.f21495zx = 0L;
            this.ldr = 0;
            this.f21494iR = 0;
            this.f21491Kg = new SparseIntArray();
        }

        /* renamed from: bg */
        public void m82174bg(boolean z, long j, int i, int i2, int i3) {
            if (!z) {
                this.f21491Kg.put(i3, this.f21491Kg.get(i3) + 1);
            }
            int i4 = this.f21490IL;
            int i5 = this.f21492bX;
            int i6 = i4 + i5;
            int i7 = (this.ldr * i6) + i;
            int i8 = i6 + 1;
            this.ldr = i7 / i8;
            this.f21494iR = ((this.f21494iR * i6) + i2) / i8;
            if (z) {
                int i9 = i4 + 1;
                this.f21490IL = i9;
                this.eqN = ((this.eqN * i4) + j) / i9;
                return;
            }
            int i10 = i5 + 1;
            this.f21492bX = i10;
            this.f21495zx = ((this.f21495zx * i5) + j) / i10;
        }

        /* renamed from: bg */
        public static C9638bg m82175bg(JSONObject jSONObject) {
            C9638bg c9638bg = new C9638bg();
            c9638bg.f21493bg = jSONObject.optInt("type", 0);
            c9638bg.f21490IL = jSONObject.optInt("suc_times", 0);
            c9638bg.f21492bX = jSONObject.optInt("fail_times", 0);
            c9638bg.eqN = jSONObject.optLong("suc_duration", 0L);
            c9638bg.f21495zx = jSONObject.optLong("fail_duration", 0L);
            c9638bg.ldr = jSONObject.optInt("req_size", 0);
            c9638bg.f21494iR = jSONObject.optInt("res_size", 0);
            JSONObject optJSONObject = jSONObject.optJSONObject("codes");
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    c9638bg.f21491Kg.put(Integer.parseInt(next), optJSONObject.optInt(next));
                }
            }
            return c9638bg;
        }

        public C9638bg(int i, boolean z, long j, int i2, int i3, int i4) {
            this.f21493bg = 0;
            this.f21490IL = 0;
            this.f21492bX = 0;
            this.eqN = 0L;
            this.f21495zx = 0L;
            this.ldr = 0;
            this.f21494iR = 0;
            SparseIntArray sparseIntArray = new SparseIntArray();
            this.f21491Kg = sparseIntArray;
            this.f21493bg = i;
            if (z) {
                this.f21490IL++;
                this.eqN = j;
            } else {
                this.f21492bX++;
                this.f21495zx = j;
                sparseIntArray.put(i4, 1);
            }
            this.ldr = i2;
            this.f21494iR = i3;
        }

        /* renamed from: bg */
        public JSONObject m82176bg() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", this.f21493bg);
                jSONObject.put("suc_times", this.f21490IL);
                jSONObject.put("fail_times", this.f21492bX);
                jSONObject.put("suc_duration", this.eqN);
                jSONObject.put("fail_duration", this.f21495zx);
                jSONObject.put("req_size", this.ldr);
                jSONObject.put("res_size", this.f21494iR);
                JSONObject jSONObject2 = new JSONObject();
                for (int i = 0; i < this.f21491Kg.size(); i++) {
                    jSONObject2.put(String.valueOf(this.f21491Kg.keyAt(i)), this.f21491Kg.valueAt(i));
                }
                jSONObject.put("codes", jSONObject2);
            } catch (Exception e) {
                C7741PX.m87880IL(e.getMessage());
            }
            return jSONObject;
        }
    }

    /* renamed from: bg */
    public void m82184bg() {
        this.eqN = SystemClock.elapsedRealtime();
    }

    /* renamed from: bg */
    public C9636zx m82183bg(int i) {
        this.f21483VB = i;
        return this;
    }

    /* renamed from: bg */
    public C9636zx m82179bg(boolean z) {
        this.f21484WR = z;
        return this;
    }
}
