package sg.bigo.ads.core.p958c;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.InterfaceC43665g;
import sg.bigo.ads.common.InterfaceC43707j;
import sg.bigo.ads.common.p914g.p916b.C43675b;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p941x.C43906a;
import sg.bigo.ads.common.utils.C43836q;
import sg.bigo.ads.core.p958c.p959a.C44134a;
import sg.bigo.ads.core.p958c.p960b.C44138b;

/* renamed from: sg.bigo.ads.core.c.c */
/* loaded from: classes10.dex */
public final class C44147c {

    /* renamed from: e */
    private static final C44147c f115856e = new C44147c();

    /* renamed from: a */
    public C44134a f115857a;

    /* renamed from: b */
    public C44138b f115858b;

    /* renamed from: c */
    public final AtomicBoolean f115859c = new AtomicBoolean(false);

    /* renamed from: d */
    public InterfaceC43665g f115860d;

    private C44147c() {
    }

    /* renamed from: b */
    private void m3817b(final String str, final Map<String, String> map) {
        C43727d.m5108a(3, new Runnable() { // from class: sg.bigo.ads.core.c.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    C43675b m3842a = C44138b.m3837b(str, map).m3842a(C44147c.this.f115860d, 0L);
                    HashMap hashMap = new HashMap();
                    JSONArray jSONArray = new JSONArray();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("event_id", m3842a.f114321b);
                    jSONObject.put("event_info", m3842a.f114322c);
                    jSONArray.put(jSONObject);
                    hashMap.put("sdk_events", jSONArray);
                    InterfaceC43707j interfaceC43707j = C44133a.m3917a().f115825a;
                    if (interfaceC43707j != null) {
                        interfaceC43707j.mo4195a(hashMap, null);
                    }
                } catch (JSONException unused) {
                }
            }
        });
    }

    /* renamed from: a */
    public static C44147c m3821a() {
        return f115856e;
    }

    /* renamed from: a */
    public final void m3819a(String str, Map<String, String> map) {
        String valueOf;
        String str2;
        String str3;
        if (m3820a(str)) {
            m3817b(str, map);
            return;
        }
        if (this.f115857a == null) {
            valueOf = String.valueOf(str);
            str2 = "mConfig is null, eventId =";
        } else if (C43906a.m4616p()) {
            return;
        } else {
            if (!this.f115859c.get()) {
                str3 = "please execute initStatic first";
                C43782a.m5009a(0, "Stats", str3);
            } else if (C43836q.m4837a((CharSequence) str) || map == null) {
                valueOf = String.valueOf(str);
                str2 = "eventId is empty or events is null, eventId =";
            } else if (this.f115857a.m3915a(str)) {
                C44138b c44138b = this.f115858b;
                if (c44138b != null) {
                    c44138b.m3840a(str, map);
                    return;
                }
                return;
            } else {
                valueOf = String.valueOf(str);
                str2 = "not hit report eventId=";
            }
        }
        str3 = str2.concat(valueOf);
        C43782a.m5009a(0, "Stats", str3);
    }

    /* renamed from: a */
    private static boolean m3820a(String str) {
        return "06002007".equals(str) && C43906a.m4616p();
    }
}
