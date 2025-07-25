package com.bytedance.sdk.component.p256bg;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.p256bg.C7592iR;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.bg.bg */
/* loaded from: classes3.dex */
public abstract class AbstractC7586bg {

    /* renamed from: IL */
    protected InterfaceC7580Ta f16521IL;

    /* renamed from: bX */
    protected C7576Kg f16523bX;

    /* renamed from: bg */
    protected Context f16524bg;

    /* renamed from: iR */
    C7592iR f16525iR;

    /* renamed from: zx */
    protected String f16526zx;
    protected Handler eqN = new Handler(Looper.getMainLooper());
    protected volatile boolean ldr = false;

    /* renamed from: Kg */
    private final Map<String, C7592iR> f16522Kg = new HashMap();

    /* renamed from: IL */
    public void mo88475IL() {
        this.f16525iR.m88447bg();
        for (C7592iR c7592iR : this.f16522Kg.values()) {
            c7592iR.m88447bg();
        }
        this.eqN.removeCallbacksAndMessages(null);
        this.ldr = true;
    }

    /* renamed from: IL */
    protected abstract void mo88474IL(C7588eo c7588eo);

    /* renamed from: bg */
    protected abstract Context mo88469bg(C7588eo c7588eo);

    /* renamed from: bg */
    protected abstract String mo88471bg();

    /* renamed from: bg */
    protected abstract void mo88466bg(String str);

    public void invokeMethod(final String str) {
        if (this.ldr) {
            return;
        }
        this.eqN.post(new Runnable() { // from class: com.bytedance.sdk.component.bg.bg.1
            {
                AbstractC7586bg.this = this;
            }

            @Override // java.lang.Runnable
            public void run() {
                C7602xxp c7602xxp;
                if (!AbstractC7586bg.this.ldr) {
                    try {
                        c7602xxp = AbstractC7586bg.this.m88464bg(new JSONObject(str));
                    } catch (Exception unused) {
                        c7602xxp = null;
                    }
                    if (C7602xxp.m88434bg(c7602xxp)) {
                        Objects.toString(c7602xxp);
                        if (c7602xxp != null) {
                            AbstractC7586bg.this.m88472IL(JAA.m88502bg(new C7601tuV(c7602xxp.f16570bg, "Failed to parse invocation.")), c7602xxp);
                            return;
                        }
                        return;
                    }
                    AbstractC7586bg.this.m88467bg(c7602xxp);
                }
            }
        });
    }

    /* renamed from: bg */
    public void mo88465bg(String str, C7602xxp c7602xxp) {
        mo88466bg(str);
    }

    /* renamed from: bg */
    protected final void m88467bg(C7602xxp c7602xxp) {
        String mo88471bg;
        if (this.ldr || (mo88471bg = mo88471bg()) == null) {
            return;
        }
        C7592iR m88473IL = m88473IL(c7602xxp.f16571iR);
        if (m88473IL == null) {
            c7602xxp.toString();
            if (this.f16521IL != null) {
                mo88471bg();
            }
            m88472IL(JAA.m88502bg(new C7601tuV(-4, "Namespace " + c7602xxp.f16571iR + " unknown.")), c7602xxp);
            return;
        }
        C7596ldr c7596ldr = new C7596ldr();
        c7596ldr.f16563IL = mo88471bg;
        c7596ldr.f16565bg = this.f16524bg;
        c7596ldr.f16564bX = m88473IL;
        try {
            C7592iR.C7595bg m88443bg = m88473IL.m88443bg(c7602xxp, c7596ldr);
            if (m88443bg == null) {
                c7602xxp.toString();
                if (this.f16521IL != null) {
                    mo88471bg();
                }
                m88472IL(JAA.m88502bg(new C7601tuV(-2, "Function " + c7602xxp.eqN + " is not registered.")), c7602xxp);
                return;
            }
            if (m88443bg.f16559bg) {
                m88472IL(m88443bg.f16558IL, c7602xxp);
            }
            if (this.f16521IL != null) {
                mo88471bg();
            }
        } catch (Exception e) {
            c7602xxp.toString();
            m88472IL(JAA.m88502bg(e), c7602xxp);
        }
    }

    /* renamed from: IL */
    public final void m88472IL(String str, C7602xxp c7602xxp) {
        JSONObject jSONObject;
        if (this.ldr || TextUtils.isEmpty(c7602xxp.ldr)) {
            return;
        }
        if (!str.startsWith("{") || !str.endsWith("}")) {
            C7584WR.m88476bg(new IllegalArgumentException("Illegal callback data: ".concat(str)));
        }
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        mo88465bg(C7578Lq.m88487bg().m88486bg("__msg_type", "callback").m88486bg("__callback_id", c7602xxp.ldr).m88486bg("__params", jSONObject).m88488IL(), c7602xxp);
    }

    /* renamed from: IL */
    private C7592iR m88473IL(String str) {
        if (!TextUtils.equals(str, this.f16526zx) && !TextUtils.isEmpty(str)) {
            return this.f16522Kg.get(str);
        }
        return this.f16525iR;
    }

    /* renamed from: bg */
    public final void m88468bg(C7588eo c7588eo, C7599tC c7599tC) {
        this.f16524bg = mo88469bg(c7588eo);
        this.f16523bX = c7588eo.eqN;
        this.f16521IL = c7588eo.f16535WR;
        this.f16525iR = new C7592iR(c7588eo, this, c7599tC);
        this.f16526zx = c7588eo.f16534VB;
        mo88474IL(c7588eo);
    }

    /* renamed from: bg */
    public C7602xxp m88464bg(JSONObject jSONObject) {
        String str;
        if (this.ldr) {
            return null;
        }
        String optString = jSONObject.optString("__callback_id");
        String optString2 = jSONObject.optString("func");
        if (mo88471bg() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String str2 = "";
            Object opt = jSONObject.opt("params");
            if (opt != null) {
                if (opt instanceof JSONObject) {
                    str = String.valueOf((JSONObject) opt);
                    String string2 = jSONObject.getString("JSSDK");
                    String optString3 = jSONObject.optString("namespace");
                    return C7602xxp.m88435bg().m88426bg(string2).m88431IL(string).m88429bX(optString2).eqN(str).m88422zx(optString).ldr(optString3).m88424iR(jSONObject.optString("__iframe_url")).m88428bg();
                } else if (opt instanceof String) {
                    str2 = (String) opt;
                } else {
                    str2 = String.valueOf(opt);
                }
            }
            str = str2;
            String string22 = jSONObject.getString("JSSDK");
            String optString32 = jSONObject.optString("namespace");
            return C7602xxp.m88435bg().m88426bg(string22).m88431IL(string).m88429bX(optString2).eqN(str).m88422zx(optString).ldr(optString32).m88424iR(jSONObject.optString("__iframe_url")).m88428bg();
        } catch (JSONException unused) {
            return C7602xxp.m88433bg(optString, -1);
        }
    }
}
