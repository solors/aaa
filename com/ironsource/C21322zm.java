package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.iab.omid.library.ironsrc.Omid;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSession;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.CreativeType;
import com.iab.omid.library.ironsrc.adsession.ImpressionType;
import com.iab.omid.library.ironsrc.adsession.Owner;
import com.iab.omid.library.ironsrc.adsession.Partner;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONObject;

/* renamed from: com.ironsource.zm */
/* loaded from: classes6.dex */
public class C21322zm {

    /* renamed from: d */
    public static final String f54774d = "Ironsrc";

    /* renamed from: e */
    public static final String f54775e = "7";

    /* renamed from: f */
    public static final String f54776f = Omid.getVersion();

    /* renamed from: g */
    public static final String f54777g = "omidVersion";

    /* renamed from: h */
    public static final String f54778h = "omidPartnerName";

    /* renamed from: i */
    public static final String f54779i = "omidPartnerVersion";

    /* renamed from: j */
    public static final String f54780j = "omidActiveAdSessions";

    /* renamed from: k */
    private static final String f54781k = "Invalid OMID impressionOwner";

    /* renamed from: l */
    private static final String f54782l = "Invalid OMID videoEventsOwner";

    /* renamed from: m */
    private static final String f54783m = "Missing OMID impressionOwner";

    /* renamed from: n */
    private static final String f54784n = "Missing OMID videoEventsOwner";

    /* renamed from: o */
    private static final String f54785o = "OMID has not been activated";

    /* renamed from: p */
    private static final String f54786p = "Missing OMID creativeType";

    /* renamed from: q */
    private static final String f54787q = "Missing adview id in OMID params";

    /* renamed from: r */
    private static final String f54788r = "No adview found with the provided adViewId";

    /* renamed from: s */
    private static final String f54789s = "OMID Session has already started";

    /* renamed from: t */
    private static final String f54790t = "OMID Session has not started";

    /* renamed from: a */
    private final Partner f54791a = Partner.createPartner(f54774d, "7");

    /* renamed from: c */
    private boolean f54793c = false;

    /* renamed from: b */
    private final HashMap<String, AdSession> f54792b = new HashMap<>();

    /* renamed from: com.ironsource.zm$a */
    /* loaded from: classes6.dex */
    public static class C21323a {

        /* renamed from: i */
        private static final String f54794i = "isolateVerificationScripts";

        /* renamed from: j */
        private static final String f54795j = "impressionOwner";

        /* renamed from: k */
        private static final String f54796k = "videoEventsOwner";

        /* renamed from: l */
        private static final String f54797l = "customReferenceData";

        /* renamed from: m */
        private static final String f54798m = "creativeType";

        /* renamed from: n */
        private static final String f54799n = "impressionType";

        /* renamed from: o */
        public static final String f54800o = "adViewId";

        /* renamed from: a */
        public boolean f54801a;

        /* renamed from: b */
        public Owner f54802b;

        /* renamed from: c */
        public Owner f54803c;

        /* renamed from: d */
        public String f54804d;

        /* renamed from: e */
        public ImpressionType f54805e;

        /* renamed from: f */
        public CreativeType f54806f;

        /* renamed from: g */
        public String f54807g;

        /* renamed from: h */
        public Owner f54808h;

        /* renamed from: a */
        public static C21323a m53781a(JSONObject jSONObject) throws IllegalArgumentException {
            C21323a c21323a = new C21323a();
            c21323a.f54801a = jSONObject.optBoolean("isolateVerificationScripts", false);
            String optString = jSONObject.optString("impressionOwner", "");
            if (!TextUtils.isEmpty(optString)) {
                try {
                    c21323a.f54802b = Owner.valueOf(optString.toUpperCase(Locale.getDefault()));
                    String optString2 = jSONObject.optString("videoEventsOwner", "");
                    if (!TextUtils.isEmpty(optString)) {
                        try {
                            c21323a.f54803c = Owner.valueOf(optString2.toUpperCase(Locale.getDefault()));
                            c21323a.f54804d = jSONObject.optString("customReferenceData", "");
                            c21323a.f54806f = m53780b(jSONObject);
                            c21323a.f54805e = m53779c(jSONObject);
                            c21323a.f54807g = m53777e(jSONObject);
                            c21323a.f54808h = m53778d(jSONObject);
                            return c21323a;
                        } catch (IllegalArgumentException e) {
                            C20086i9.m57997d().m58003a(e);
                            throw new IllegalArgumentException("Invalid OMID videoEventsOwner " + optString2);
                        }
                    }
                    throw new IllegalArgumentException(C21322zm.f54784n);
                } catch (IllegalArgumentException e2) {
                    C20086i9.m57997d().m58003a(e2);
                    throw new IllegalArgumentException("Invalid OMID impressionOwner " + optString);
                }
            }
            throw new IllegalArgumentException(C21322zm.f54783m);
        }

        /* renamed from: b */
        private static CreativeType m53780b(JSONObject jSONObject) throws IllegalArgumentException {
            CreativeType[] values;
            String optString = jSONObject.optString("creativeType", "");
            if (!TextUtils.isEmpty(optString)) {
                for (CreativeType creativeType : CreativeType.values()) {
                    if (optString.equalsIgnoreCase(creativeType.toString())) {
                        return creativeType;
                    }
                }
                throw new IllegalArgumentException(C21322zm.f54786p + optString);
            }
            throw new IllegalArgumentException(C21322zm.f54786p + optString);
        }

        /* renamed from: c */
        private static ImpressionType m53779c(JSONObject jSONObject) throws IllegalArgumentException {
            ImpressionType[] values;
            String optString = jSONObject.optString("impressionType", "");
            if (!TextUtils.isEmpty(optString)) {
                for (ImpressionType impressionType : ImpressionType.values()) {
                    if (optString.equalsIgnoreCase(impressionType.toString())) {
                        return impressionType;
                    }
                }
                throw new IllegalArgumentException(C21322zm.f54786p + optString);
            }
            throw new IllegalArgumentException(C21322zm.f54786p + optString);
        }

        /* renamed from: d */
        private static Owner m53778d(JSONObject jSONObject) throws IllegalArgumentException {
            String optString = jSONObject.optString("videoEventsOwner", "");
            Owner owner = Owner.NONE;
            try {
                return Owner.valueOf(optString.toUpperCase(Locale.getDefault()));
            } catch (IllegalArgumentException e) {
                C20086i9.m57997d().m58003a(e);
                return owner;
            }
        }

        /* renamed from: e */
        private static String m53777e(JSONObject jSONObject) throws IllegalArgumentException {
            String optString = jSONObject.optString("adViewId", "");
            if (!TextUtils.isEmpty(optString)) {
                return optString;
            }
            throw new IllegalArgumentException(C21322zm.f54787q + optString);
        }
    }

    /* renamed from: a */
    private AdSession m53786a(C21323a c21323a, InterfaceC20048hg interfaceC20048hg) throws IllegalArgumentException {
        AdSession createAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(c21323a.f54806f, c21323a.f54805e, c21323a.f54802b, c21323a.f54803c, c21323a.f54801a), AdSessionContext.createHtmlAdSessionContext(this.f54791a, interfaceC20048hg.getPresentingView(), null, c21323a.f54804d));
        createAdSession.registerAdView(interfaceC20048hg.getPresentingView());
        return createAdSession;
    }

    /* renamed from: b */
    public void m53784b(JSONObject jSONObject) throws IllegalStateException {
        m53785a(jSONObject);
        String optString = jSONObject.optString("adViewId");
        AdSession adSession = this.f54792b.get(optString);
        if (adSession != null) {
            adSession.finish();
            this.f54792b.remove(optString);
            return;
        }
        throw new IllegalStateException(f54790t);
    }

    /* renamed from: c */
    public void m53783c(JSONObject jSONObject) throws IllegalArgumentException, IllegalStateException {
        m53785a(jSONObject);
        AdSession adSession = this.f54792b.get(jSONObject.optString("adViewId"));
        if (adSession != null) {
            AdEvents createAdEvents = AdEvents.createAdEvents(adSession);
            if (jSONObject.optBoolean("signalLoaded")) {
                createAdEvents.loaded();
            }
            createAdEvents.impressionOccurred();
            return;
        }
        throw new IllegalStateException(f54790t);
    }

    /* renamed from: d */
    public void m53782d(JSONObject jSONObject) throws IllegalStateException, IllegalArgumentException {
        m53787a(C21323a.m53781a(jSONObject));
    }

    /* renamed from: a */
    public C21189wp m53789a() {
        C21189wp c21189wp = new C21189wp();
        c21189wp.m54311b(f54777g, SDKUtils.encodeString(f54776f));
        c21189wp.m54311b("omidPartnerName", SDKUtils.encodeString(f54774d));
        c21189wp.m54311b("omidPartnerVersion", SDKUtils.encodeString("7"));
        c21189wp.m54311b(f54780j, SDKUtils.encodeString(Arrays.toString(this.f54792b.keySet().toArray())));
        return c21189wp;
    }

    /* renamed from: a */
    public void m53788a(Context context) throws IllegalArgumentException {
        if (this.f54793c) {
            return;
        }
        Omid.activate(context);
        this.f54793c = true;
    }

    /* renamed from: a */
    public void m53787a(C21323a c21323a) throws IllegalStateException, IllegalArgumentException {
        if (!this.f54793c) {
            throw new IllegalStateException(f54785o);
        }
        if (TextUtils.isEmpty(c21323a.f54807g)) {
            throw new IllegalStateException(f54787q);
        }
        String str = c21323a.f54807g;
        if (this.f54792b.containsKey(str)) {
            throw new IllegalStateException(f54789s);
        }
        InterfaceC20048hg mo54697a = C20635pf.m55832a().mo54697a(str);
        if (mo54697a == null) {
            throw new IllegalStateException(f54788r);
        }
        AdSession m53786a = m53786a(c21323a, mo54697a);
        m53786a.start();
        this.f54792b.put(str, m53786a);
    }

    /* renamed from: a */
    private void m53785a(JSONObject jSONObject) throws IllegalStateException {
        if (!this.f54793c) {
            throw new IllegalStateException(f54785o);
        }
        if (jSONObject == null) {
            throw new IllegalStateException(f54790t);
        }
    }
}
