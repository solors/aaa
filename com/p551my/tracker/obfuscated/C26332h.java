package com.p551my.tracker.obfuscated;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.ironsource.C21170w8;
import com.p551my.tracker.MyTracker;
import com.p551my.tracker.MyTrackerAttribution;
import java.net.URLDecoder;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.my.tracker.obfuscated.h */
/* loaded from: classes7.dex */
public final class C26332h {

    /* renamed from: a */
    final AtomicBoolean f68606a = new AtomicBoolean(false);

    /* renamed from: b */
    final C26290a1 f68607b;

    /* renamed from: c */
    final Context f68608c;

    C26332h(C26290a1 c26290a1, Context context) {
        this.f68607b = c26290a1;
        this.f68608c = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C26332h m42061a(C26290a1 c26290a1, Context context) {
        return new C26332h(c26290a1, context);
    }

    /* renamed from: a */
    public static /* synthetic */ void m42062a(MyTracker.AttributionListener attributionListener, MyTrackerAttribution myTrackerAttribution) {
        try {
            attributionListener.onReceiveAttribution(myTrackerAttribution);
        } catch (Throwable unused) {
            C26468z0.m41525b("AttributionHandler error: exception at AttributionListener::onReceiveAttribution()");
        }
    }

    /* renamed from: b */
    public void m42057b(String str) {
        if (m42063a()) {
            C26468z0.m41528a("AttributionHandler: attribution has already been received");
            return;
        }
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject(C21170w8.f54322c);
            if (optJSONObject == null) {
                C26468z0.m41528a("AttributionHandler: empty attribution object has been returned");
            } else if (!optJSONObject.has("error")) {
                m42059a(optJSONObject);
            } else {
                int optInt = optJSONObject.optInt("error");
                C26468z0.m41528a("AttributionHandler: attribution response returned error " + optInt);
            }
        } catch (Throwable th) {
            C26468z0.m41524b("AttributionHandler error: handling server attribution failed with error: ", th);
        }
    }

    /* renamed from: a */
    public void m42060a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "AttributionHandler: referrer is empty";
        } else if (!m42063a()) {
            try {
                String queryParameter = Uri.parse("https://my.com/?" + URLDecoder.decode(str, "UTF-8")).getQueryParameter("mt_deeplink");
                if (TextUtils.isEmpty(queryParameter)) {
                    C26468z0.m41528a("AttributionHandler: deeplink is empty");
                    return;
                } else {
                    m42059a(new JSONObject().put(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK, queryParameter));
                    return;
                }
            } catch (Throwable th) {
                C26468z0.m41524b("AttributionHandler error: handling referrer failed with error: ", th);
                return;
            }
        } else {
            str2 = "AttributionHandler: attribution has already been received";
        }
        C26468z0.m41528a(str2);
    }

    /* renamed from: a */
    void m42059a(JSONObject jSONObject) {
        String optString = jSONObject.optString(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK);
        if (TextUtils.isEmpty(optString)) {
            C26468z0.m41528a("AttributionHandler: deeplink is empty");
        } else if (!this.f68606a.compareAndSet(false, true)) {
            C26468z0.m41528a("AttributionHandler: attribution has already been received");
        } else {
            C26400r0 m41763a = C26400r0.m41763a(this.f68608c);
            if (!TextUtils.isEmpty(m41763a.m41745g())) {
                C26468z0.m41528a("AttributionHandler: attribution has already been received");
                return;
            }
            m41763a.m41740i(jSONObject.toString());
            final MyTracker.AttributionListener m42182d = this.f68607b.m42182d();
            if (m42182d == null) {
                return;
            }
            Handler m42186c = this.f68607b.m42186c();
            if (m42186c == null) {
                m42186c = C26325g.f68588a;
            }
            final MyTrackerAttribution newAttribution = MyTrackerAttribution.newAttribution(optString);
            try {
                m42186c.post(new Runnable() { // from class: com.my.tracker.obfuscated.w1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C26332h.m42062a(m42182d, newAttribution);
                    }
                });
            } catch (Throwable th) {
                C26468z0.m41524b("AttributionHandler error: exception occurred while post runnable", th);
            }
        }
    }

    /* renamed from: a */
    boolean m42063a() {
        if (this.f68606a.get()) {
            return true;
        }
        return !TextUtils.isEmpty(C26400r0.m41763a(this.f68608c).m41745g());
    }
}
