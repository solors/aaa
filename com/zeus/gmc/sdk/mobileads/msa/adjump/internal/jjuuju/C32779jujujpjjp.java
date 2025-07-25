package com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jjuuju;

import android.content.Context;
import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cioii2c22c2.InterfaceC32663coo2iico;
import com.zeus.gmc.sdk.mobileads.msa.adjump.common.MLog;
import com.zeus.gmc.sdk.mobileads.msa.adjump.internal.uppjpjj.C32793jujujpjjp;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.msa.adjump.internal.jjuuju.jujujpjjp */
/* loaded from: classes8.dex */
public class C32779jujujpjjp {
    private static final String jujujpjjp = "AnalyticsInfo";
    public String jjppjjupu;
    public String jjuuju;
    public String jpjjjjp;
    public String jupppjuju;
    public int juupuj;
    public String pppjujup;
    public String puujujuupp;
    public String ujjuupp;
    public Map<String, String> ujpupujju;
    public List<String> uppjpjj;
    public String uppj = InterfaceC32663coo2iico.cco22;
    public String upupjjppj = "";
    public long uujpuuupj = -1;
    public int puuuuj = -1;
    private Map<String, String> jjuj = new ConcurrentHashMap();

    private void jujujpjjp(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.jjuj.put(str, str2);
    }

    public String jujujpjjp(Context context) {
        try {
            jujujpjjp("mediaappversion", String.valueOf(C32793jujujpjjp.jujujpjjp(context)));
            jujujpjjp("cosdkversion", this.upupjjppj);
            jujujpjjp("errorinfo", this.ujjuupp);
            jujujpjjp("creativeType", this.pppjujup);
            jujujpjjp("netWork", C32778jjuuju.uppjpjj(context));
            jujujpjjp(C32781uppjpjj.uppj, this.uujpuuupj);
            jujujpjjp(C32781uppjpjj.jjppjjupu, this.puuuuj);
            jujujpjjp(this.ujpupujju);
            JSONObject jSONObject = new JSONObject();
            if (this.jjuj.isEmpty()) {
                return null;
            }
            for (Map.Entry<String, String> entry : this.jjuj.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            MLog.m25878e(jujujpjjp, "error", e);
            return null;
        }
    }

    private void jujujpjjp(Map<String, String> map) {
        if (this.jjuj == null || map == null || map.isEmpty()) {
            return;
        }
        this.jjuj.putAll(new HashMap(map));
    }

    private void jujujpjjp(String str, int i) {
        if (TextUtils.isEmpty(str) || i == -1) {
            return;
        }
        jujujpjjp(str, String.valueOf(i));
    }

    private void jujujpjjp(String str, long j) {
        if (TextUtils.isEmpty(str) || j == -1) {
            return;
        }
        jujujpjjp(str, String.valueOf(j));
    }
}
