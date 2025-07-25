package sg.bigo.ads.core.p953a.p955b;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.List;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.InterfaceC43665g;
import sg.bigo.ads.common.InterfaceC43707j;
import sg.bigo.ads.common.p906aa.C43592c;
import sg.bigo.ads.common.p912f.C43617a;
import sg.bigo.ads.common.p914g.p916b.C43674a;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.core.p953a.p954a.C44092a;
import sg.bigo.ads.core.p953a.p956c.C44104b;

/* renamed from: sg.bigo.ads.core.a.b.a */
/* loaded from: classes10.dex */
public final class C44094a {

    /* renamed from: a */
    C44104b.AbstractRunnableC44107b f115734a = null;
    @NonNull

    /* renamed from: b */
    public final C44100b f115735b;

    /* renamed from: c */
    final InterfaceC43665g f115736c;

    /* renamed from: d */
    private final C44092a f115737d;

    /* renamed from: e */
    private final InterfaceC43707j f115738e;

    public C44094a(C44092a c44092a, InterfaceC43707j interfaceC43707j, InterfaceC43665g interfaceC43665g) {
        this.f115735b = new C44100b(c44092a);
        this.f115737d = c44092a;
        this.f115738e = interfaceC43707j;
        this.f115736c = interfaceC43665g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3971a() {
        C44104b.m3951a(this.f115734a);
        this.f115734a = null;
        final List<C43674a> m3963b = this.f115735b.m3963b();
        if (m3963b.isEmpty()) {
            C43782a.m5007b("Callback", "sendGeneralStats but event list is empty!!");
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (C43674a c43674a : m3963b) {
            try {
                jSONArray.put(new JSONObject(c43674a.f114315c));
            } catch (JSONException unused) {
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("events", jSONArray);
        this.f115738e.mo4195a(hashMap, new InterfaceC43707j.InterfaceC43708a() { // from class: sg.bigo.ads.core.a.b.a.3
            @Override // sg.bigo.ads.common.InterfaceC43707j.InterfaceC43708a
            /* renamed from: a */
            public final void mo3835a() {
                C44104b.m3953a(new Runnable() { // from class: sg.bigo.ads.core.a.b.a.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        C440973 c440973 = C440973.this;
                        C44094a.this.f115735b.m3965a(m3963b, true);
                        C44094a.this.f115735b.m3960e();
                        if (!C44094a.this.f115735b.m3961d()) {
                            C44094a.this.m3968b();
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.common.InterfaceC43707j.InterfaceC43708a
            /* renamed from: a */
            public final void mo3834a(int i, int i2, String str) {
                C44104b.m3953a(new Runnable() { // from class: sg.bigo.ads.core.a.b.a.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        C440973 c440973 = C440973.this;
                        C44094a.this.f115735b.m3965a(m3963b, false);
                        C44094a.this.m3968b();
                    }
                });
            }
        });
    }

    /* renamed from: b */
    final void m3968b() {
        if (this.f115734a != null) {
            return;
        }
        this.f115734a = C44104b.m3952a(new Runnable() { // from class: sg.bigo.ads.core.a.b.a.2
            @Override // java.lang.Runnable
            public final void run() {
                if (C43592c.m5333b(C43617a.f114190a)) {
                    C44094a.this.m3971a();
                    return;
                }
                C44094a c44094a = C44094a.this;
                c44094a.f115734a = null;
                c44094a.m3968b();
            }
        }, this.f115737d.f115729b);
    }

    /* renamed from: a */
    public final void m3970a(@NonNull final String str, @NonNull final JSONObject jSONObject) {
        C44104b.m3953a(new Runnable() { // from class: sg.bigo.ads.core.a.b.a.1
            @Override // java.lang.Runnable
            public final void run() {
                C43674a c43674a;
                boolean z;
                C44094a.this.f115735b.m3964a(new C43674a(str, jSONObject.toString()));
                if (TextUtils.isEmpty(C44094a.this.f115736c.mo4162R())) {
                    return;
                }
                if (!"impression".equals(str) && !Reporting.EventType.VIDEO_AD_CLICKED.equals(str)) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C43782a.m5010a(0, 3, "Callback", "SendDefer -> action=" + str + ", eventInfo=" + c43674a.toString());
                    C44094a.m3969a(C44094a.this);
                    return;
                }
                C43782a.m5010a(0, 3, "Callback", "SendImmediately -> action=" + str + ", eventInfo=" + c43674a.toString());
                C44094a.this.m3971a();
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ void m3969a(C44094a c44094a) {
        if (c44094a.f115735b.m3962c() >= c44094a.f115737d.f115728a) {
            c44094a.m3971a();
        } else if (c44094a.f115735b.m3961d()) {
        } else {
            c44094a.m3968b();
        }
    }
}
