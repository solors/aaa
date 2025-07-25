package com.bytedance.sdk.openadsdk.eqN.p344bg;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.ldr.p261bg.ldr.C7721eqN;
import com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL;
import com.bytedance.sdk.openadsdk.yDt.p365bg.C9635eqN;
import com.bytedance.sdk.openadsdk.yDt.p365bg.InterfaceC9632bX;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.eqN.bg.Ta */
/* loaded from: classes3.dex */
public class C9232Ta implements InterfaceC9598IL {

    /* renamed from: IL */
    private final boolean f20642IL;

    /* renamed from: bg */
    private final C7721eqN f20643bg;

    public C9232Ta(boolean z, C7721eqN c7721eqN) {
        this.f20643bg = c7721eqN;
        this.f20642IL = z;
    }

    @Override // com.bytedance.sdk.openadsdk.yDt.InterfaceC9598IL
    @Nullable
    public InterfaceC9632bX getLogStats() throws Exception {
        int i;
        if (this.f20643bg == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.f20642IL);
        jSONObject.put("url", this.f20643bg.m87955IL());
        int eqN = this.f20643bg.eqN();
        if (eqN <= 0) {
            eqN = 0;
        }
        jSONObject.put("retry_times", eqN);
        jSONObject.put("ad_id", this.f20643bg.ldr());
        jSONObject.put("track_type", this.f20643bg.m87940zx());
        if (this.f20642IL) {
            if (this.f20643bg.m87942eo()) {
                i = 3;
            } else if (this.f20643bg.eqN() <= 0) {
                i = 1;
            } else {
                i = 2;
            }
        } else {
            i = 4;
        }
        jSONObject.put("upload_scene", i);
        String m87941iR = this.f20643bg.m87941iR();
        if (!TextUtils.isEmpty(m87941iR)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : m87941iR.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String m87950WR = this.f20643bg.m87950WR();
        if (!TextUtils.isEmpty(m87950WR)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : m87950WR.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return C9635eqN.m82211IL().m82197bg("track_link_result").m82209IL(jSONObject.toString());
    }
}
