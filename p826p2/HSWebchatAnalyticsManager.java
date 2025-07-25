package p826p2;

import java.util.HashMap;
import java.util.Map;
import p648e3.InterfaceC32918a;
import p693h3.HSPersistentStorage;
import p752k3.C37383m;

/* renamed from: p2.b */
/* loaded from: classes5.dex */
public class HSWebchatAnalyticsManager {

    /* renamed from: a */
    private final HSPersistentStorage f103115a;

    /* renamed from: b */
    private final InterfaceC32918a f103116b;

    /* renamed from: c */
    private final Map<String, String> f103117c = new HashMap();

    /* renamed from: d */
    private final Map<String, String> f103118d = new HashMap();

    public HSWebchatAnalyticsManager(HSPersistentStorage hSPersistentStorage, InterfaceC32918a interfaceC32918a) {
        this.f103115a = hSPersistentStorage;
        this.f103116b = interfaceC32918a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m13318d(java.util.Map<java.lang.String, java.lang.Object> r4) {
        /*
            r3 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.f103118d
            e3.a r1 = r3.f103116b
            java.lang.String r1 = r1.mo2784d()
            java.lang.String r2 = "v"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.f103118d
            e3.a r1 = r3.f103116b
            java.lang.String r1 = r1.getDeviceModel()
            java.lang.String r2 = "dm"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.f103118d
            e3.a r1 = r3.f103116b
            java.lang.String r1 = r1.mo2781g()
            java.lang.String r2 = "av"
            r0.put(r2, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.f103118d
            e3.a r1 = r3.f103116b
            java.lang.String r1 = r1.mo2783e()
            java.lang.String r2 = "os"
            r0.put(r2, r1)
            java.lang.String r0 = "sdkType"
            java.lang.Object r0 = r4.get(r0)
            boolean r1 = r0 instanceof java.lang.String
            java.lang.String r2 = "s"
            if (r1 == 0) goto L4e
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = p752k3.C37383m.m18233g(r0)
            if (r1 == 0) goto L4e
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.f103118d
            r1.put(r2, r0)
            goto L55
        L4e:
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.f103118d
            java.lang.String r1 = "androidx"
            r0.put(r2, r1)
        L55:
            java.lang.String r0 = "pluginVersion"
            java.lang.Object r0 = r4.get(r0)
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L6e
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = p752k3.C37383m.m18233g(r0)
            if (r1 == 0) goto L6e
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.f103118d
            java.lang.String r2 = "pv"
            r1.put(r2, r0)
        L6e:
            java.lang.String r0 = "runtimeVersion"
            java.lang.Object r4 = r4.get(r0)
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L87
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = p752k3.C37383m.m18233g(r4)
            if (r0 == 0) goto L87
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.f103118d
            java.lang.String r1 = "rv"
            r0.put(r1, r4)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p826p2.HSWebchatAnalyticsManager.m13318d(java.util.Map):void");
    }

    /* renamed from: e */
    private void m13317e(Map<String, String> map) {
        map.put("ln", this.f103116b.getLanguage());
        String m23749q = this.f103115a.m23749q();
        if (C37383m.m18233g(m23749q)) {
            map.put("dln", m23749q);
        }
    }

    /* renamed from: a */
    public Map<String, String> m13321a() {
        m13317e(this.f103117c);
        return this.f103117c;
    }

    /* renamed from: b */
    public Map<String, String> m13320b() {
        m13317e(this.f103118d);
        return this.f103118d;
    }

    /* renamed from: c */
    public void m13319c(Map<String, Object> map) {
        m13318d(map);
        this.f103117c.putAll(this.f103118d);
        this.f103117c.put("rs", this.f103116b.mo2785c());
        String countryCode = this.f103116b.getCountryCode();
        if (C37383m.m18233g(countryCode)) {
            this.f103117c.put("cc", countryCode);
        }
    }
}
