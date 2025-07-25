package p005a4;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Map;
import p027b4.AnalyzeLog;
import p1007v3.BaseAnalyze;
import p1007v3.UUIDManager;
import p1020w3.C44574a;
import p992u3.LogLevel;

/* renamed from: a4.e */
/* loaded from: classes6.dex */
public class FirebaseAnalyze extends BaseAnalyze {

    /* renamed from: c */
    private final FirebaseAnalytics f62c;

    /* renamed from: d */
    private final Context f63d;

    public FirebaseAnalyze(Context context) {
        this.f63d = context;
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        this.f62c = firebaseAnalytics;
        firebaseAnalytics.setAnalyticsCollectionEnabled(true);
    }

    /* renamed from: k */
    private void m105872k(String str, String str2) {
        this.f62c.setUserProperty(str, str2);
        LogLevel logLevel = LogLevel.INFO;
        AnalyzeLog.m103949a(logLevel, "platform = " + mo2684i() + " setUserProperty. key = " + str + " value = " + str2);
    }

    /* renamed from: l */
    private void m105871l(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            m105872k(str, "|||");
            m105872k(str + "Plus", "|||");
        } else if (str2.length() > 36) {
            String substring = str2.substring(0, 36);
            String substring2 = str2.substring(36);
            m105872k(str, substring);
            m105872k(str + "Plus", substring2);
        } else {
            m105872k(str, str2);
            m105872k(str + "Plus", "|||");
        }
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: a */
    public void mo2692a(@NonNull String str) {
        this.f62c.setUserId(str);
        LogLevel logLevel = LogLevel.INFO;
        AnalyzeLog.m103949a(logLevel, "platform = " + mo2684i() + " setLuid = " + str);
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: b */
    public void mo2691b(@NonNull C44574a c44574a) {
        if (!mo2697j(c44574a)) {
            return;
        }
        Bundle m2372f = c44574a.m2372f();
        Bundle bundle = new Bundle();
        if (m2372f != null) {
            bundle.putAll(m2372f);
        }
        try {
            this.f62c.logEvent(c44574a.m2371g(), bundle);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (AnalyzeLog.m103943g()) {
            AnalyzeLog.m103948b(LogLevel.INFO, mo2684i(), c44574a.m2371g(), bundle);
        }
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: d */
    public void mo2689d(@NonNull String str) {
        if (AnalyzeLog.m103943g()) {
            LogLevel logLevel = LogLevel.INFO;
            AnalyzeLog.m103949a(logLevel, "platform = " + mo2684i() + " setAccountId = " + str);
        }
        mo2686g("learnings_account_id", str);
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: e */
    public void mo2688e(Map<String, String> map) {
        super.mo2688e(map);
        if (map == null) {
            return;
        }
        for (String str : map.keySet()) {
            String str2 = map.get(str);
            if (!"campaign_id".equals(str) && TextUtils.isEmpty(str2)) {
                str2 = "unknown";
            }
            mo2686g(str, str2);
        }
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: f */
    public void mo2687f(String str, String str2) {
        mo2686g(str, str2);
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: g */
    public void mo2686g(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            AnalyzeLog.m103949a(LogLevel.WARN, "key is empty when set firebase user property.");
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        if (!"abTestTag".equals(str) && !"abTestAllTag".equals(str) && !"adAbTestTag".equals(str)) {
            m105872k(str, str2);
        } else {
            m105871l(str, str2);
        }
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: h */
    public void mo2685h(String str) {
        mo2686g("learnings_id", str);
    }

    @Override // p1007v3.IAnalyze
    @NonNull
    /* renamed from: i */
    public String mo2684i() {
        return AnalyzePlatform.f50b.m105878a();
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    public void init() {
        mo2686g("client_uuid", UUIDManager.m2681a().m2680b(this.f63d));
        super.init();
    }
}
