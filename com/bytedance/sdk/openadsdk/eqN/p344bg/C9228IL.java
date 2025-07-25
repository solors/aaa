package com.bytedance.sdk.openadsdk.eqN.p344bg;

import com.amazon.p047a.p048a.p059h.Metric;
import com.ironsource.C21114v8;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.bg.IL */
/* loaded from: classes3.dex */
public class C9228IL {
    public int eqN;

    /* renamed from: bg */
    public AtomicInteger f20633bg = new AtomicInteger(0);

    /* renamed from: IL */
    public AtomicInteger f20631IL = new AtomicInteger(0);

    /* renamed from: bX */
    public AtomicLong f20632bX = new AtomicLong(0);

    /* renamed from: zx */
    public AtomicInteger f20635zx = new AtomicInteger(0);
    public Map<Integer, Integer> ldr = new HashMap();

    /* renamed from: iR */
    public AtomicBoolean f20634iR = new AtomicBoolean(false);

    public C9228IL(int i) {
        this.eqN = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public JSONObject m83378IL() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.f20633bg.get());
            jSONObject.put(C21114v8.C21120f.f53958e, this.f20631IL.get());
            jSONObject.put("type", this.eqN);
            jSONObject.put(Metric.f2405b, this.f20635zx.get());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public JSONObject m83377bg() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.f20633bg.get());
            jSONObject.put(C21114v8.C21120f.f53958e, this.f20631IL.get());
            jSONObject.put("type", this.eqN);
            jSONObject.put("duration", this.f20632bX.get() / this.f20633bg.get());
            JSONObject jSONObject2 = new JSONObject();
            if (this.ldr.size() > 0) {
                for (Map.Entry<Integer, Integer> entry : this.ldr.entrySet()) {
                    jSONObject2.put(String.valueOf(entry.getKey()), entry.getValue());
                }
            }
            jSONObject.put("fail_error_code", jSONObject2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
