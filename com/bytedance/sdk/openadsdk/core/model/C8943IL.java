package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.yDt.C9601bX;
import com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL;
import com.bytedance.sdk.openadsdk.yDt.p365bg.C9635eqN;
import com.bytedance.sdk.openadsdk.yDt.p365bg.InterfaceC9632bX;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.model.IL */
/* loaded from: classes3.dex */
public class C8943IL {

    /* renamed from: IL */
    public int f19774IL;

    /* renamed from: bX */
    public int f19775bX = 1;

    /* renamed from: bg */
    public String f19776bg;
    public ArrayList<Integer> eqN;

    /* renamed from: zx */
    public AdSlot f19777zx;

    /* renamed from: IL */
    public int m84340IL() {
        return this.f19774IL;
    }

    /* renamed from: bX */
    public int m84338bX() {
        return this.f19775bX;
    }

    /* renamed from: bg */
    public String m84337bg() {
        return this.f19776bg;
    }

    public AdSlot eqN() {
        return this.f19777zx;
    }

    /* renamed from: zx */
    public ArrayList<Integer> m84331zx() {
        return this.eqN;
    }

    /* renamed from: IL */
    public void m84339IL(int i) {
        this.f19775bX = i;
    }

    /* renamed from: bg */
    public void m84333bg(String str) {
        this.f19776bg = str;
    }

    /* renamed from: bg */
    public void m84336bg(int i) {
        this.f19774IL = i;
    }

    /* renamed from: bg */
    public void m84335bg(AdSlot adSlot) {
        this.f19777zx = adSlot;
    }

    /* renamed from: bg */
    public void m84332bg(ArrayList<Integer> arrayList) {
        this.eqN = arrayList;
    }

    /* renamed from: bg */
    public static void m84334bg(C8943IL c8943il) {
        int m84340IL;
        if (c8943il == null || c8943il.eqN() == null || (m84340IL = c8943il.m84340IL()) >= 0 || m84340IL == -8) {
            return;
        }
        C9601bX.m82293bg();
        C9601bX.m82278bg("rd_client_custom_error", false, new InterfaceC9598IL() { // from class: com.bytedance.sdk.openadsdk.core.model.IL.1
            @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
            public InterfaceC9632bX getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(Constants.MessagePayloadKeys.FROM, C8943IL.this.m84338bX());
                jSONObject.put("err_code", C8943IL.this.m84340IL());
                jSONObject.put("server_res_str", C8943IL.this.m84337bg());
                if (C8943IL.this.m84331zx() != null && C8943IL.this.m84331zx().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) C8943IL.this.m84331zx()).toString());
                }
                return C9635eqN.m82211IL().m82197bg("rd_client_custom_error").m82198bg(C8943IL.this.eqN().getDurationSlotType()).m82209IL(jSONObject.toString());
            }
        });
    }
}
