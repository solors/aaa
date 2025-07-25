package com.bytedance.sdk.openadsdk.p291VB.p292bg;

import com.bytedance.sdk.component.p256bg.AbstractC7606zx;
import com.bytedance.sdk.component.p256bg.C7583VzQ;
import com.bytedance.sdk.component.p256bg.C7596ldr;
import com.bytedance.sdk.openadsdk.core.p314Kg.p315bg.C8566IL;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.VB.bg.eqN */
/* loaded from: classes3.dex */
public class C7929eqN extends AbstractC7606zx<JSONObject, JSONObject> {

    /* renamed from: bg */
    private JSONObject f17268bg;

    public C7929eqN(JSONObject jSONObject) {
        this.f17268bg = jSONObject;
    }

    /* renamed from: bg */
    public static void m87411bg(C7583VzQ c7583VzQ, JSONObject jSONObject) {
        c7583VzQ.m88479bg("getData", new C7929eqN(jSONObject));
    }

    @Override // com.bytedance.sdk.component.p256bg.AbstractC7606zx
    /* renamed from: bg  reason: avoid collision after fix types in other method */
    public JSONObject mo82753bg(JSONObject jSONObject, C7596ldr c7596ldr) throws Exception {
        return C8566IL.m85717bg(this.f17268bg, jSONObject);
    }
}
