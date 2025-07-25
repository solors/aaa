package sg.bigo.ads.core.p958c.p960b;

import androidx.annotation.NonNull;
import com.p552ot.pubsub.util.C26601v;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.InterfaceC43665g;
import sg.bigo.ads.common.InterfaceC43707j;
import sg.bigo.ads.common.p906aa.C43592c;
import sg.bigo.ads.common.p912f.C43617a;
import sg.bigo.ads.common.p914g.p916b.C43675b;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.core.p958c.p959a.C44134a;
import sg.bigo.ads.core.p958c.p961c.C44149a;

/* renamed from: sg.bigo.ads.core.c.b.b */
/* loaded from: classes10.dex */
public final class C44138b {

    /* renamed from: a */
    final C44134a f115837a;

    /* renamed from: b */
    C44149a.AbstractRunnableC44152b f115838b = null;
    @NonNull

    /* renamed from: c */
    public final C44144c f115839c;

    /* renamed from: d */
    final InterfaceC43665g f115840d;

    /* renamed from: e */
    private final InterfaceC43707j f115841e;

    public C44138b(C44134a c44134a, InterfaceC43707j interfaceC43707j, InterfaceC43665g interfaceC43665g) {
        this.f115839c = new C44144c(c44134a);
        this.f115837a = c44134a;
        this.f115841e = interfaceC43707j;
        this.f115840d = interfaceC43665g;
    }

    /* renamed from: b */
    public static C44137a m3837b(String str, Map<String, String> map) {
        return new C44137a(str, map);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3841a() {
        C44149a.m3814a(this.f115838b);
        this.f115838b = null;
        final List<C43675b> m3833a = this.f115839c.m3833a();
        if (m3833a.isEmpty()) {
            C43782a.m5007b("Stats", "sendGeneralStats but event list is empty!!");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            for (C43675b c43675b : m3833a) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("event_id", c43675b.f114321b);
                jSONObject.put("event_info", c43675b.f114322c);
                jSONArray.put(jSONObject);
            }
        } catch (JSONException unused) {
        }
        HashMap hashMap = new HashMap();
        hashMap.put("sdk_events", jSONArray);
        this.f115841e.mo4195a(hashMap, new InterfaceC43707j.InterfaceC43708a() { // from class: sg.bigo.ads.core.c.b.b.3
            @Override // sg.bigo.ads.common.InterfaceC43707j.InterfaceC43708a
            /* renamed from: a */
            public final void mo3835a() {
                C44149a.m3816a(new Runnable() { // from class: sg.bigo.ads.core.c.b.b.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C441413 c441413 = C441413.this;
                        C44138b.this.f115839c.m3832a(m3833a, true);
                        C44138b.this.f115839c.m3828d();
                        C44138b.this.m3838b();
                    }
                });
            }

            @Override // sg.bigo.ads.common.InterfaceC43707j.InterfaceC43708a
            /* renamed from: a */
            public final void mo3834a(int i, int i2, String str) {
                C44149a.m3816a(new Runnable() { // from class: sg.bigo.ads.core.c.b.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C441413 c441413 = C441413.this;
                        C44138b.this.f115839c.m3832a(m3833a, false);
                        C44138b.this.m3838b();
                    }
                });
            }
        });
    }

    /* renamed from: a */
    public final void m3840a(@NonNull final String str, @NonNull final Map<String, String> map) {
        C44149a.m3816a(new Runnable() { // from class: sg.bigo.ads.core.c.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                int i;
                C44134a c44134a = C44138b.this.f115837a;
                C44134a.C44135a c44135a = c44134a.f115828c.get(str);
                if (c44135a == null) {
                    z = true;
                } else {
                    z = c44135a.f115831c;
                }
                C44134a c44134a2 = C44138b.this.f115837a;
                C44134a.C44135a c44135a2 = c44134a2.f115828c.get(str);
                if (c44135a2 == null) {
                    i = C26601v.f69837d;
                } else {
                    i = c44135a2.f115832d;
                }
                long currentTimeMillis = i + System.currentTimeMillis();
                C44137a m3837b = C44138b.m3837b(str, map);
                C44138b c44138b = C44138b.this;
                c44138b.f115839c.m3831a(m3837b.m3842a(c44138b.f115840d, currentTimeMillis));
                if (z) {
                    C43782a.m5010a(0, 3, "Stats", "SendDefer -> eventId=" + str + ", events=" + map);
                    C44138b.m3839a(C44138b.this);
                    return;
                }
                C43782a.m5010a(0, 3, "Stats", "SendImmediately -> eventId=" + str + ", events=" + map);
                C44138b.this.m3841a();
            }
        });
    }

    /* renamed from: b */
    final void m3838b() {
        if (this.f115838b != null) {
            return;
        }
        if (this.f115839c.m3829c()) {
            C43782a.m5010a(0, 3, "Stats", "no events waitting for sending");
        } else {
            this.f115838b = C44149a.m3815a(new Runnable() { // from class: sg.bigo.ads.core.c.b.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (C43592c.m5333b(C43617a.f114190a)) {
                        C44138b.this.m3841a();
                        return;
                    }
                    C44138b c44138b = C44138b.this;
                    c44138b.f115838b = null;
                    c44138b.m3838b();
                }
            }, this.f115837a.f115827b);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m3839a(C44138b c44138b) {
        if (c44138b.f115839c.m3830b() >= c44138b.f115837a.f115826a) {
            c44138b.m3841a();
        } else {
            c44138b.m3838b();
        }
    }
}
