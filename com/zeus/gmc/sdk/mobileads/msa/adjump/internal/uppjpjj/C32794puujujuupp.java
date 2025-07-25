package com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj;

import com.zeus.gmc.sdk.mobileads.msa.adjump.common.MLog;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.puujujuupp */
/* loaded from: classes8.dex */
public class C32794puujujuupp {
    private static final String jujujpjjp = "JumpControlInfo";
    private String jjppjjupu;
    private int jjuuju;
    private int jpjjjjp;
    private int jupppjuju;
    private int puujujuupp;
    private String ujjuupp;
    private int uppjpjj;

    private C32794puujujuupp() {
    }

    public static C32794puujujuupp jujujpjjp(JSONObject jSONObject) {
        try {
            C32794puujujuupp c32794puujujuupp = new C32794puujujuupp();
            c32794puujujuupp.ujjuupp = jSONObject.optString("callee");
            c32794puujujuupp.uppjpjj = jSONObject.optInt("mode");
            c32794puujujuupp.jjuuju = jSONObject.optInt("targetType");
            c32794puujujuupp.puujujuupp = jSONObject.optInt("autoLaunch");
            c32794puujujuupp.jupppjuju = jSONObject.optInt("sendLog");
            c32794puujujuupp.jpjjjjp = jSONObject.optInt("jumpMode");
            c32794puujujuupp.jjppjjupu = jSONObject.optString("clickTrackUrl");
            return c32794puujujuupp;
        } catch (Exception e) {
            MLog.m25878e(jujujpjjp, "Parse JumpControlInfo error ", e);
            return null;
        }
    }

    public void jjuuju(int i) {
        this.jjuuju = i;
    }

    public int jpjjjjp() {
        return this.jupppjuju;
    }

    public int jupppjuju() {
        return this.uppjpjj;
    }

    public int puujujuupp() {
        return this.jpjjjjp;
    }

    public int ujjuupp() {
        return this.jjuuju;
    }

    public void uppjpjj(int i) {
        this.uppjpjj = i;
    }

    public String jjuuju() {
        return this.jjppjjupu;
    }

    public String uppjpjj() {
        return this.ujjuupp;
    }

    public static JSONObject jujujpjjp(C32794puujujuupp c32794puujujuupp) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("callee", c32794puujujuupp.uppjpjj());
            jSONObject.put("mode", c32794puujujuupp.jupppjuju());
            jSONObject.put("targetType", c32794puujujuupp.ujjuupp());
            jSONObject.put("autoLaunch", c32794puujujuupp.jujujpjjp());
            jSONObject.put("sendLog", c32794puujujuupp.jpjjjjp());
            jSONObject.put("jumpMode", c32794puujujuupp.puujujuupp());
            jSONObject.put("clickTrackUrl", c32794puujujuupp.jjuuju());
            return jSONObject;
        } catch (Exception e) {
            MLog.m25878e(jujujpjjp, "toJson e : ", e);
            return null;
        }
    }

    public void jujujpjjp(String str) {
        this.ujjuupp = str;
    }

    public void jujujpjjp(int i) {
        this.puujujuupp = i;
    }

    public int jujujpjjp() {
        return this.puujujuupp;
    }
}
