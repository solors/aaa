package com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL;

import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.eqN.p345zx.p346IL.InterfaceC9280bX;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.zx.IL.bg */
/* loaded from: classes3.dex */
public class C9281bg<T extends InterfaceC9280bX> {

    /* renamed from: IL */
    private String f20730IL;

    /* renamed from: bX */
    private JSONObject f20731bX;

    /* renamed from: bg */
    private AbstractC8967tuV f20732bg;
    private T eqN;

    /* renamed from: zx */
    private boolean f20733zx = false;

    public C9281bg(AbstractC8967tuV abstractC8967tuV, String str, JSONObject jSONObject, T t) {
        this.f20732bg = abstractC8967tuV;
        this.f20730IL = str;
        this.f20731bX = jSONObject;
        this.eqN = t;
    }

    /* renamed from: IL */
    public String m83197IL() {
        return this.f20730IL;
    }

    /* renamed from: bX */
    public JSONObject m83196bX() {
        if (this.f20731bX == null) {
            this.f20731bX = new JSONObject();
        }
        return this.f20731bX;
    }

    /* renamed from: bg */
    public AbstractC8967tuV m83195bg() {
        return this.f20732bg;
    }

    public T eqN() {
        return this.eqN;
    }

    /* renamed from: zx */
    public boolean m83193zx() {
        return this.f20733zx;
    }

    /* renamed from: bg */
    public void m83194bg(boolean z) {
        this.f20733zx = z;
    }
}
