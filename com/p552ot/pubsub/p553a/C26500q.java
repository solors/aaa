package com.p552ot.pubsub.p553a;

import android.content.Context;
import android.text.TextUtils;
import com.p552ot.pubsub.Configuration;
import com.p552ot.pubsub.PubSubTrack;
import com.p552ot.pubsub.p554b.C26502a;
import com.p552ot.pubsub.p554b.C26508e;
import com.p552ot.pubsub.p554b.C26511h;
import com.p552ot.pubsub.p557e.C26532a;
import com.p552ot.pubsub.p558f.C26534b;
import com.p552ot.pubsub.p559g.C26538c;
import com.p552ot.pubsub.p559g.C26546i;
import com.p552ot.pubsub.p559g.C26549l;
import com.p552ot.pubsub.util.C26577b;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26590l;
import com.p552ot.pubsub.util.C26596q;
import com.p552ot.pubsub.util.C26598s;
import com.p552ot.pubsub.util.DeviceUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.a.q */
/* loaded from: classes7.dex */
public class C26500q implements InterfaceC26486c {

    /* renamed from: a */
    private static final String f69286a = "PubSubTrackLocalImp";

    /* renamed from: b */
    private static final int f69287b = 102400;

    /* renamed from: c */
    private static final int f69288c = 2;

    /* renamed from: d */
    private Configuration f69289d;

    /* renamed from: e */
    private C26596q f69290e;

    public C26500q(Context context, Configuration configuration, C26596q c26596q) {
        this.f69289d = configuration;
        this.f69290e = c26596q;
    }

    /* renamed from: b */
    private void m41446b(String str, String str2, String str3, String str4, Map<String, String> map) {
        String str5 = "";
        if (m41452a(this.f69289d.getAppId())) {
            C26586j.m41080a(f69286a, "This app disabled tracking data, skip it.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str4);
            JSONObject optJSONObject = jSONObject.optJSONObject(C26485b.f69245b);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(C26485b.f69244a);
            String m41400a = C26511h.m41408a().m41400a(this.f69289d.getAppId(), str3, C26502a.f69300f, "");
            String optString = optJSONObject2 == null ? "" : optJSONObject2.optString(C26484a.f69213ac);
            C26586j.m41080a(f69286a, "tip: " + optString + ", needIds: " + m41400a);
            if (m41447b(optString, m41400a)) {
                if (m41445c(this.f69289d.getAppId(), str3)) {
                    C26586j.m41080a(f69286a, " This event disabled tracking data , skip it.");
                    return;
                } else if (m41444d(this.f69289d.getAppId(), str3)) {
                    C26586j.m41080a(f69286a, " This event should not upload by sampling , skip it.");
                    return;
                } else {
                    str5 = C26511h.m41408a().m41400a(this.f69289d.getAppId(), str3, C26502a.f69301g, "");
                }
            }
            String m41392c = C26511h.m41408a().m41392c(this.f69289d.getAppId());
            C26586j.m41080a(f69286a, "bannedParamsForApp: " + m41392c + ", bannedParamsForEvent: " + str5);
            Set<String> m41002a = C26598s.m41002a(m41392c, str5, ",");
            m41448a(optJSONObject, m41002a);
            m41448a(optJSONObject2, m41002a);
            C26534b.m41290a(str, str2, this.f69289d.getAppId(), C26577b.m41111e(), str3, jSONObject.toString(), map);
        } catch (JSONException e) {
            C26586j.m41074b(f69286a, "checkCloudControl error：" + e.toString());
        }
    }

    /* renamed from: c */
    private boolean m41445c(String str, String str2) {
        try {
            return C26511h.m41408a().m41399a(str, str2, C26502a.f69295a, false);
        } catch (Exception e) {
            C26586j.m41074b(f69286a, "isDisableTrackForEvent error: " + e.toString());
            return false;
        }
    }

    /* renamed from: d */
    private boolean m41444d(String str, String str2) {
        boolean z;
        long m41395b = C26511h.m41408a().m41395b(str, str2);
        long abs = Math.abs(DeviceUtil.m41131a(C26577b.m41116b()).hashCode()) % 100;
        if (m41395b > abs) {
            z = true;
        } else {
            z = false;
        }
        C26586j.m41080a(f69286a, "shouldUploadBySampling " + str2 + ",  shouldUpload=" + z + ", sample=" + m41395b + ", val=" + abs);
        return !z;
    }

    @Override // com.p552ot.pubsub.p553a.InterfaceC26486c
    /* renamed from: a */
    public void mo41450a(String str, String str2, String str3, String str4, Map<String, String> map) {
        C26596q c26596q = this.f69290e;
        if (c26596q != null && !c26596q.m41012a(str3)) {
            C26586j.m41080a(f69286a, "The privacy policy is not permitted, and the event is not basic or recommend event or custom dau event, skip it.");
        } else if (m41451a(str3, str4)) {
            if (!C26546i.m41248a()) {
                C26586j.m41080a(f69286a, "track network is unaccessable, cta");
                C26546i.m41246a(str, str2, str3, str4, map, true);
                return;
            }
            C26546i.m41247a(this);
            if (C26586j.f69734a) {
                C26586j.m41080a(f69286a, "track pb ot data:" + str4);
            }
            C26508e.m41415a();
            C26502a.m41443a().m41429b(this.f69289d.getAppId());
            m41446b(str, str2, str3, str4, map);
        }
    }

    @Override // com.p552ot.pubsub.p553a.InterfaceC26486c
    /* renamed from: a */
    public void mo41449a(String str, String str2, String str3, Map<String, String> map, boolean z) {
        if (!C26546i.m41248a()) {
            C26586j.m41080a(f69286a, "network is unaccessable, cta");
            C26546i.m41246a(str, str2, "", str3, map, z);
            return;
        }
        C26546i.m41247a(this);
        if (C26586j.f69734a) {
            C26586j.m41080a(f69286a, "track pb data:" + str3);
        }
        C26538c.m41280a().m41276a(str, str2, str3, map, z);
    }

    @Override // com.p552ot.pubsub.p553a.InterfaceC26486c
    /* renamed from: a */
    public void mo41453a(int i) {
        if (i == 2) {
            C26532a.m41292a(new RunnableC26501r(this));
        }
    }

    /* renamed from: a */
    public boolean m41451a(String str, String str2) {
        if (PubSubTrack.isDisable()) {
            C26586j.m41080a(f69286a, "Tracking data is disabled or onetrack use system net traffic only, skip it.");
            return false;
        } else if (m41454a()) {
            if ((str != null && str.equals(C26484a.f69223f)) || str2 == null || str2.length() * 2 <= f69287b) {
                return true;
            }
            C26586j.m41080a(f69286a, "Event size exceed limitation!");
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    private boolean m41447b(String str, String str2) {
        List<String> m41003a;
        if (TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String[] split = str.split("\\.");
            if (split != null && split.length >= 5 && (m41003a = C26598s.m41003a(str2, ",")) != null) {
                if (m41003a.contains(split[4])) {
                    return true;
                }
            }
        } catch (Exception e) {
            C26586j.m41074b(f69286a, "isMatchId error：" + e.toString());
        }
        return false;
    }

    /* renamed from: a */
    private boolean m41454a() {
        String m41038i = C26590l.m41038i();
        if (!TextUtils.isEmpty(m41038i) && TextUtils.equals(m41038i.toUpperCase(), C26549l.f69548b)) {
            C26586j.m41080a(f69286a, "region is RU,Not allowed pubsub");
            return false;
        } else if (TextUtils.isEmpty(m41038i) || !TextUtils.equals(m41038i.toUpperCase(), C26549l.f69547a)) {
            return true;
        } else {
            C26586j.m41080a(f69286a, "region is CN,Not allowed pubsub");
            return false;
        }
    }

    /* renamed from: a */
    private void m41448a(JSONObject jSONObject, Set<String> set) {
        if (jSONObject != null && set != null && set.size() != 0) {
            C26586j.m41080a(f69286a, "jsonObject: " + jSONObject.toString() + ", bannedParams: " + set.toString());
            try {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    if (set.contains(keys.next())) {
                        keys.remove();
                    }
                }
                return;
            } catch (Exception e) {
                C26586j.m41074b(f69286a, "filterParams error：" + e.toString());
                return;
            }
        }
        C26586j.m41080a(f69286a, "jsonObject is null or bannedParams is empty");
    }

    /* renamed from: a */
    private boolean m41452a(String str) {
        try {
            return C26511h.m41408a().m41404a(str, C26502a.f69295a);
        } catch (Exception e) {
            C26586j.m41074b(f69286a, "isDisableTrackForApp error: " + e.toString());
            return false;
        }
    }
}
