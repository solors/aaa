package com.bytedance.sdk.openadsdk.core.p326VB.eqN;

import com.bytedance.adsdk.ugeno.core.InterfaceC7064Lq;
import com.bytedance.sdk.component.adexpress.p241IL.C7282Ta;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.VB.eqN.bg */
/* loaded from: classes3.dex */
public class C8826bg extends C7282Ta {

    /* renamed from: IL */
    private InterfaceC7064Lq f19483IL;

    /* renamed from: bX */
    private float f19484bX;

    /* renamed from: bg */
    private JSONObject f19485bg;
    private float eqN;

    /* renamed from: com.bytedance.sdk.openadsdk.core.VB.eqN.bg$bg */
    /* loaded from: classes3.dex */
    public static class C8827bg extends C7282Ta.C7283bg {

        /* renamed from: IL */
        private InterfaceC7064Lq f19486IL;

        /* renamed from: bX */
        private float f19487bX;

        /* renamed from: bg */
        private JSONObject f19488bg;
        private float eqN;

        /* renamed from: IL */
        public C8827bg m84815IL(float f) {
            this.eqN = f;
            return this;
        }

        @Override // com.bytedance.sdk.component.adexpress.p241IL.C7282Ta.C7283bg
        /* renamed from: IL */
        public C8826bg mo84812bg() {
            return new C8826bg(this);
        }

        /* renamed from: bg */
        public C8827bg m84808bg(JSONObject jSONObject) {
            this.f19488bg = jSONObject;
            return this;
        }

        /* renamed from: bg */
        public C8827bg m84810bg(InterfaceC7064Lq interfaceC7064Lq) {
            this.f19486IL = interfaceC7064Lq;
            return this;
        }

        /* renamed from: bg */
        public C8827bg m84811bg(float f) {
            this.f19487bX = f;
            return this;
        }
    }

    public C8826bg(C8827bg c8827bg) {
        super(c8827bg);
        this.f19485bg = c8827bg.f19488bg;
        this.f19483IL = c8827bg.f19486IL;
        this.f19484bX = c8827bg.f19487bX;
        this.eqN = c8827bg.eqN;
    }

    public JSONObject DDQ() {
        return this.f19485bg;
    }

    /* renamed from: Ja */
    public float m84819Ja() {
        return this.f19484bX;
    }

    /* renamed from: Uq */
    public InterfaceC7064Lq m84818Uq() {
        return this.f19483IL;
    }

    /* renamed from: Uw */
    public float m84817Uw() {
        return this.eqN;
    }
}
