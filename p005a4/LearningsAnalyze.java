package p005a4;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import p027b4.AnalyzeLog;
import p1007v3.BaseAnalyze;
import p1007v3.UUIDManager;
import p1020w3.C44574a;
import p770l4.LearningsAnalytics;
import p992u3.LogLevel;

/* renamed from: a4.f */
/* loaded from: classes6.dex */
public class LearningsAnalyze extends BaseAnalyze {

    /* renamed from: c */
    private final Context f64c;

    /* renamed from: d */
    private final String f65d;

    /* renamed from: e */
    private final String f66e;

    /* renamed from: f */
    private final String f67f;

    /* renamed from: g */
    private final boolean f68g;

    /* renamed from: h */
    private final String f69h;

    /* renamed from: i */
    private final LogLevel f70i;

    public LearningsAnalyze(Context context, String str, String str2, String str3, String str4, boolean z, LogLevel logLevel) {
        this.f64c = context;
        this.f65d = str;
        this.f66e = str2;
        this.f67f = str3;
        this.f68g = z;
        this.f69h = str4;
        this.f70i = logLevel;
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: a */
    public void mo2692a(@NonNull String str) {
        super.mo2692a(str);
        if (AnalyzeLog.m103943g()) {
            LogLevel logLevel = LogLevel.INFO;
            AnalyzeLog.m103949a(logLevel, "platform = " + mo2684i() + " setLuid = " + str);
        }
        LearningsAnalytics.m15694i().m15678y(str);
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: b */
    public void mo2691b(@NonNull C44574a c44574a) {
        if (!mo2697j(c44574a)) {
            return;
        }
        Bundle m2372f = c44574a.m2372f();
        LearningsAnalytics.m15694i().m15682u(c44574a.m2371g(), m2372f);
        if (AnalyzeLog.m103943g()) {
            AnalyzeLog.m103948b(LogLevel.INFO, mo2684i(), c44574a.m2371g(), m2372f);
        }
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: c */
    public void mo2690c(String str) {
        if (AnalyzeLog.m103943g()) {
            LogLevel logLevel = LogLevel.INFO;
            AnalyzeLog.m103949a(logLevel, "platform = " + mo2684i() + " setPseudoId = " + str);
        }
        LearningsAnalytics.m15694i().m15677z(str);
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: d */
    public void mo2689d(@NonNull String str) {
        if (AnalyzeLog.m103943g()) {
            LogLevel logLevel = LogLevel.INFO;
            AnalyzeLog.m103949a(logLevel, "platform = " + mo2684i() + " setAccountId = " + str);
        }
        LearningsAnalytics.m15694i().m15703A("learnings_account_id", str);
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: e */
    public void mo2688e(Map<String, String> map) {
        super.mo2688e(map);
        if (map == null) {
            return;
        }
        LearningsAnalytics.m15694i().m15681v(map);
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: f */
    public void mo2687f(@NonNull String str, @Nullable String str2) {
        super.mo2687f(str, str2);
        if (AnalyzeLog.m103943g()) {
            LogLevel logLevel = LogLevel.INFO;
            AnalyzeLog.m103949a(logLevel, "platform = " + mo2684i() + " setEventProperty. key = " + str + " value = " + str2);
        }
        LearningsAnalytics.m15694i().m15680w(str, str2);
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: g */
    public void mo2686g(@NonNull String str, @Nullable String str2) {
        super.mo2686g(str, str2);
        if (AnalyzeLog.m103943g()) {
            LogLevel logLevel = LogLevel.INFO;
            AnalyzeLog.m103949a(logLevel, "platform = " + mo2684i() + " setUserProperty. key = " + str + " value = " + str2);
        }
        LearningsAnalytics.m15694i().m15703A(str, str2);
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: h */
    public void mo2685h(String str) {
        if (AnalyzeLog.m103943g()) {
            LogLevel logLevel = LogLevel.INFO;
            AnalyzeLog.m103949a(logLevel, "platform = " + mo2684i() + " setLearningsId = " + str);
        }
        LearningsAnalytics.m15694i().m15679x(str);
    }

    @Override // p1007v3.IAnalyze
    @NonNull
    /* renamed from: i */
    public String mo2684i() {
        return AnalyzePlatform.f53e.m105878a();
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    public void init() {
        LearningsAnalytics.m15694i().m15689n(this.f64c, this.f65d, this.f66e, this.f67f, this.f69h, "2.5.5.0", UUIDManager.m2681a().m2680b(this.f64c), this.f68g, this.f70i);
        super.init();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p1007v3.BaseAnalyze
    /* renamed from: j */
    public boolean mo2697j(@NonNull C44574a c44574a) {
        return super.mo2697j(c44574a);
    }
}
