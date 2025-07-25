package com.bytedance.sdk.component.p257iR.p259bX;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.p257iR.eqN.C7640eqN;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.iR.bX.zx */
/* loaded from: classes3.dex */
public class C7627zx {
    private static final Object eqN = new Object();

    /* renamed from: IL */
    private C7623eqN f16654IL = new C7623eqN();

    /* renamed from: bX */
    private boolean f16655bX;

    /* renamed from: bg */
    private Context f16656bg;

    /* renamed from: zx */
    private int f16657zx;

    public C7627zx(Context context, boolean z, int i) {
        this.f16656bg = context;
        this.f16655bX = z;
        this.f16657zx = i;
    }

    /* renamed from: IL */
    public void m88322IL() {
        try {
            String m88298bg = C7640eqN.m88298bg(this.f16656bg, 1, this.f16657zx);
            if (TextUtils.isEmpty(m88298bg)) {
                return;
            }
            C7623eqN m88321IL = m88321IL(new JSONObject(m88298bg));
            if (m88321IL != null) {
                m88321IL.toString();
            }
            if (m88321IL != null) {
                this.f16654IL = m88321IL;
            }
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    /* renamed from: bX */
    public C7623eqN m88320bX() {
        return this.f16654IL;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00af A[Catch: all -> 0x0133, TryCatch #1 {all -> 0x0133, blocks: (B:6:0x0016, B:10:0x0021, B:14:0x003b, B:15:0x0041, B:17:0x0047, B:19:0x0063, B:20:0x006c, B:21:0x006f, B:23:0x0075, B:24:0x007e, B:26:0x0084, B:27:0x008e, B:29:0x0094, B:31:0x00a3, B:38:0x00c1, B:51:0x00fd, B:41:0x00c8, B:35:0x00af, B:37:0x00bc), top: B:80:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c8 A[Catch: all -> 0x0133, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:6:0x0016, B:10:0x0021, B:14:0x003b, B:15:0x0041, B:17:0x0047, B:19:0x0063, B:20:0x006c, B:21:0x006f, B:23:0x0075, B:24:0x007e, B:26:0x0084, B:27:0x008e, B:29:0x0094, B:31:0x00a3, B:38:0x00c1, B:51:0x00fd, B:41:0x00c8, B:35:0x00af, B:37:0x00bc), top: B:80:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fd A[Catch: all -> 0x0133, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0133, blocks: (B:6:0x0016, B:10:0x0021, B:14:0x003b, B:15:0x0041, B:17:0x0047, B:19:0x0063, B:20:0x006c, B:21:0x006f, B:23:0x0075, B:24:0x007e, B:26:0x0084, B:27:0x008e, B:29:0x0094, B:31:0x00a3, B:38:0x00c1, B:51:0x00fd, B:41:0x00c8, B:35:0x00af, B:37:0x00bc), top: B:80:0x0016 }] */
    /* renamed from: bg */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m88318bg(org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p257iR.p259bX.C7627zx.m88318bg(org.json.JSONObject):void");
    }

    /* renamed from: IL */
    private C7623eqN m88321IL(JSONObject jSONObject) {
        try {
            C7623eqN c7623eqN = new C7623eqN();
            if (jSONObject.has("local_enable")) {
                c7623eqN.f16635bg = jSONObject.getInt("local_enable") != 0;
            }
            if (jSONObject.has("probe_enable")) {
                c7623eqN.f16627IL = jSONObject.getInt("probe_enable") != 0;
            }
            if (jSONObject.has("local_host_filter")) {
                JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, 0);
                        }
                    }
                }
                c7623eqN.f16634bX = hashMap;
            } else {
                c7623eqN.f16634bX = null;
            }
            if (jSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("host_replace_map");
                HashMap hashMap2 = new HashMap();
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next) && !TextUtils.isEmpty(string2)) {
                            hashMap2.put(next, string2);
                        }
                    }
                }
                c7623eqN.eqN = hashMap2;
            } else {
                c7623eqN.eqN = null;
            }
            c7623eqN.f16638zx = jSONObject.optInt("req_to_cnt", c7623eqN.f16638zx);
            c7623eqN.ldr = jSONObject.optInt("req_to_api_cnt", c7623eqN.ldr);
            c7623eqN.f16637iR = jSONObject.optInt("req_to_ip_cnt", c7623eqN.f16637iR);
            c7623eqN.f16628Kg = jSONObject.optInt("req_err_cnt", c7623eqN.f16628Kg);
            c7623eqN.f16633WR = jSONObject.optInt("req_err_api_cnt", c7623eqN.f16633WR);
            c7623eqN.f16636eo = jSONObject.optInt("req_err_ip_cnt", c7623eqN.f16636eo);
            c7623eqN.f16632VB = jSONObject.optInt("update_interval", c7623eqN.f16632VB);
            c7623eqN.f16630PX = jSONObject.optInt("update_random_range", c7623eqN.f16630PX);
            c7623eqN.f16631Ta = jSONObject.optString("http_code_black", c7623eqN.f16631Ta);
            return c7623eqN;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: bg */
    public void m88319bg() {
        if (this.f16655bX) {
            String string = this.f16656bg.getSharedPreferences(C7617Kg.m88372bg().m88371bg(this.f16657zx).m88337bg(), 0).getString("tnc_config_str", null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            try {
                C7623eqN m88321IL = m88321IL(new JSONObject(string));
                if (m88321IL != null) {
                    this.f16654IL = m88321IL;
                }
                if (m88321IL == null) {
                    return;
                }
                m88321IL.toString();
            } catch (Throwable th) {
                th.getMessage();
            }
        }
    }
}
