package com.ironsource;

import android.content.Context;
import android.util.Pair;
import com.ironsource.C20630pb;
import com.ironsource.C20688qf;
import com.ironsource.C21132vf;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.yf */
/* loaded from: classes6.dex */
public class C21265yf {
    /* renamed from: a */
    public static C20630pb m53980a(JSONObject jSONObject) {
        return new C20630pb.C20631a(jSONObject.optString(C20517nb.f52192r)).m55840b().m55838b(jSONObject.optBoolean("enabled")).m55844a(new C21179wf()).m55842a(m53984a()).m55841a(false).m55846a();
    }

    /* renamed from: a */
    public static C20688qf.EnumC20693e m53981a(C20039ha c20039ha, C20688qf.EnumC20693e enumC20693e) {
        return (c20039ha == null || c20039ha.m58207g() == null || c20039ha.m58207g().get("rewarded") == null) ? enumC20693e : Boolean.parseBoolean(c20039ha.m58207g().get("rewarded")) ? C20688qf.EnumC20693e.RewardedVideo : C20688qf.EnumC20693e.Interstitial;
    }

    /* renamed from: a */
    public static C21132vf m53983a(Context context, String str, String str2, Map<String, String> map) throws Exception {
        C21132vf.C21134b c21134b = new C21132vf.C21134b();
        if (map != null && map.containsKey("sessionid")) {
            c21134b.m54453c(map.get("sessionid"));
        }
        c21134b.m54456a(context);
        return c21134b.m54452d(str).m54455a(str2).m54457a();
    }

    /* renamed from: a */
    private static ArrayList<Pair<String, String>> m53984a() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        arrayList.add(new Pair<>("Content-Type", "application/json"));
        arrayList.add(new Pair<>(C20517nb.f52166M, C20517nb.f52167N));
        return arrayList;
    }

    /* renamed from: a */
    public static boolean m53982a(C20039ha c20039ha) {
        if (c20039ha == null || c20039ha.m58207g().get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(c20039ha.m58207g().get("inAppBidding"));
    }
}
