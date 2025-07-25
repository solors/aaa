package p005a4;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.facebook.FacebookSdk;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import p027b4.AnalyzeLog;
import p1007v3.BaseAnalyze;
import p1020w3.C44574a;
import p992u3.LogLevel;

/* renamed from: a4.d */
/* loaded from: classes6.dex */
public class FacebookAnalyze extends BaseAnalyze {

    /* renamed from: d */
    private static final String[] f60d = {"sdk_version", "grt_sdk_version", "analytics_event_num", "ses_id", "user_ip"};

    /* renamed from: c */
    private final AppEventsLogger f61c;

    public FacebookAnalyze(Context context) {
        this.f61c = AppEventsLogger.newLogger(context);
    }

    /* renamed from: k */
    private Bundle m105873k(Bundle bundle) {
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle();
            bundle2.putAll(bundle);
            for (String str : f60d) {
                bundle2.remove(str);
            }
            return bundle2;
        }
        return bundle;
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    /* renamed from: b */
    public void mo2691b(@NonNull C44574a c44574a) {
        if (!mo2697j(c44574a)) {
            return;
        }
        try {
            if (c44574a.m2370i() != null) {
                this.f61c.logEvent(c44574a.m2371g(), c44574a.m2370i().doubleValue(), m105873k(c44574a.m2372f()));
            } else {
                this.f61c.logEvent(c44574a.m2371g(), m105873k(c44574a.m2372f()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (AnalyzeLog.m103943g()) {
            AnalyzeLog.m103946d(LogLevel.INFO, mo2684i(), c44574a);
        }
        super.mo2691b(c44574a);
    }

    @Override // p1007v3.IAnalyze
    @NonNull
    /* renamed from: i */
    public String mo2684i() {
        return AnalyzePlatform.f52d.m105878a();
    }

    @Override // p1007v3.BaseAnalyze, p1007v3.IAnalyze
    public void init() {
        FacebookSdk.setIsDebugEnabled(AnalyzeLog.m103943g());
        if (AnalyzeLog.m103943g()) {
            FacebookSdk.addLoggingBehavior(LoggingBehavior.APP_EVENTS);
        }
        super.init();
    }
}
