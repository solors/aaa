package com.bytedance.sdk.openadsdk.core.p316PX.p317IL;

import com.bytedance.sdk.openadsdk.core.p316PX.p317IL.C8622bX;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.PX.IL.IL */
/* loaded from: classes3.dex */
public class C8619IL extends C8622bX implements Comparable<C8619IL> {

    /* renamed from: bg */
    private final float f19008bg;

    /* renamed from: com.bytedance.sdk.openadsdk.core.PX.IL.IL$bg */
    /* loaded from: classes3.dex */
    public static class C8621bg {

        /* renamed from: IL */
        private final float f19009IL;

        /* renamed from: bg */
        private final String f19011bg;

        /* renamed from: bX */
        private C8622bX.EnumC8627bX f19010bX = C8622bX.EnumC8627bX.TRACKING_URL;
        private boolean eqN = false;

        public C8621bg(String str, float f) {
            this.f19011bg = str;
            this.f19009IL = f;
        }

        /* renamed from: bg */
        public C8619IL m85525bg() {
            return new C8619IL(this.f19009IL, this.f19011bg, this.f19010bX, Boolean.valueOf(this.eqN));
        }
    }

    /* renamed from: IL */
    public JSONObject m85528IL() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("content", m85520bX());
        jSONObject.put("trackingFraction", this.f19008bg);
        return jSONObject;
    }

    /* renamed from: bg */
    public boolean m85527bg(float f) {
        return this.f19008bg <= f && !m85508zx();
    }

    @Override // com.bytedance.sdk.openadsdk.core.p316PX.p317IL.C8622bX
    /* renamed from: j_ */
    public void mo85509j_() {
        super.mo85509j_();
    }

    private C8619IL(float f, String str, C8622bX.EnumC8627bX enumC8627bX, Boolean bool) {
        super(str, enumC8627bX, bool);
        this.f19008bg = f;
    }

    @Override // java.lang.Comparable
    /* renamed from: bg */
    public int compareTo(C8619IL c8619il) {
        if (c8619il != null) {
            float f = this.f19008bg;
            float f2 = c8619il.f19008bg;
            if (f > f2) {
                return 1;
            }
            return f < f2 ? -1 : 0;
        }
        return 1;
    }
}
