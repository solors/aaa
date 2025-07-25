package com.bytedance.sdk.openadsdk.p291VB.p292bg;

import com.bytedance.sdk.component.p238WR.C7268eqN;
import com.bytedance.sdk.component.p256bg.AbstractC7606zx;
import com.bytedance.sdk.component.p256bg.C7583VzQ;
import com.bytedance.sdk.component.p256bg.C7596ldr;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.VB.bg.WR */
/* loaded from: classes3.dex */
public class C7922WR extends AbstractC7606zx<JSONObject, JSONObject> {

    /* renamed from: bg */
    private WeakReference<C7268eqN> f17261bg;

    public C7922WR(C7268eqN c7268eqN) {
        this.f17261bg = new WeakReference<>(c7268eqN);
    }

    /* renamed from: bg */
    public static void m87423bg(C7583VzQ c7583VzQ, C7268eqN c7268eqN) {
        c7583VzQ.m88479bg("preventTouchEvent", new C7922WR(c7268eqN));
    }

    @Override // com.bytedance.sdk.component.p256bg.AbstractC7606zx
    /* renamed from: bg  reason: avoid collision after fix types in other method */
    public JSONObject mo82753bg(JSONObject jSONObject, C7596ldr c7596ldr) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean optBoolean = jSONObject.optBoolean("isPrevent", false);
            C7268eqN c7268eqN = this.f17261bg.get();
            if (c7268eqN != null) {
                c7268eqN.setIsPreventTouchEvent(optBoolean);
                jSONObject2.put("success", true);
            } else {
                jSONObject2.put("success", false);
            }
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
        }
        return jSONObject2;
    }
}
