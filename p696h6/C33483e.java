package p696h6;

import android.app.Application;
import android.os.Bundle;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.ironsource.C21114v8;
import com.learnings.abcenter.util.AbCenterUtil;
import com.meevii.adsdk.common.util.LogUtil;
import java.lang.reflect.Method;
import org.json.JSONObject;
import p1007v3.AnalyzeManager;
import p1038x5.AdUnit;
import p1038x5.DataRepository;
import p1038x5.PlacementAdUnit;
import p1038x5.StatsIdStore;
import p1054y5.AdLifecycleManager;

/* compiled from: FirebaseCrashUtils.java */
/* renamed from: h6.e */
/* loaded from: classes6.dex */
public class C33483e {

    /* renamed from: a */
    private static Object f91351a;

    /* renamed from: b */
    private static Method f91352b;

    /* renamed from: a */
    public static void m23671a(String str, Bundle bundle) {
        try {
            AdUnit m1977c = DataRepository.m1979a().m1977c(str);
            if (m1977c != null && bundle != null) {
                Application m1066f = AdLifecycleManager.m1067e().m1066f();
                String string = bundle.getString("secondary_ad_unit_id", "");
                m23670b("ad_unit_id", string);
                String string2 = bundle.getString("secondary_network", "");
                m23670b("ad_network", string2);
                String name = m1977c.m2005a().getName();
                m23670b("ad_type", name);
                m23670b("ad_creative_id", bundle.getString("creative_id", ""));
                String country = AbCenterUtil.getCountry(m1066f);
                m23670b("country", country);
                String m1998h = m1977c.m1998h();
                PlacementAdUnit m1968l = DataRepository.m1979a().m1968l(m1998h);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("learnings_id", AnalyzeManager.m2733h(m1066f));
                jSONObject.put("country", country);
                jSONObject.put("strategy_id", m1968l.m1953i());
                jSONObject.put("plan_id", m1968l.m1955g());
                jSONObject.put(C21114v8.C21122h.f54038L, StatsIdStore.m1916a().m1915b(m1998h));
                jSONObject.put("primary_network", m1977c.m1996j().getName());
                jSONObject.put("config_ad_unit_id", m1977c.m2004b());
                jSONObject.put("secondary_network", string2);
                jSONObject.put("secondary_ad_unit_id", string);
                jSONObject.put("ad_type", name);
                jSONObject.put("abtest_tag", DataRepository.m1979a().m1978b());
                jSONObject.put("adsdk_version", "5.4.1.0");
                m23670b("ad_show_info", jSONObject.toString());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: b */
    private static void m23670b(String str, String str2) {
        try {
            if (f91351a == null) {
                f91351a = FirebaseCrashlytics.class.getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                f91352b = FirebaseCrashlytics.class.getMethod("setCustomKey", String.class, String.class);
            }
            f91352b.invoke(f91351a, str, str2);
        } catch (Throwable unused) {
            LogUtil.m48062e("ADSDK.FirebaseCrashUtils", "no FirebaseCrashlytics");
        }
    }
}
