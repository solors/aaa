package sg.bigo.ads.core.p962d;

import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.login.LoginLogger;
import com.p552ot.pubsub.p553a.C26484a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.api.p903a.C43525i;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.p933u.AbstractC43793b;
import sg.bigo.ads.common.p933u.C43807g;
import sg.bigo.ads.common.p933u.C43808h;
import sg.bigo.ads.common.p933u.p934a.RunnableC43792e;
import sg.bigo.ads.common.p933u.p935b.C43795a;
import sg.bigo.ads.common.p933u.p935b.C43798d;
import sg.bigo.ads.common.p933u.p936c.C43800a;
import sg.bigo.ads.common.p941x.C43906a;
import sg.bigo.ads.core.p958c.C44136b;

/* renamed from: sg.bigo.ads.core.d.a */
/* loaded from: classes10.dex */
public final class C44153a {

    /* renamed from: sg.bigo.ads.core.d.a$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC44155a {
        /* renamed from: a */
        void mo3734a();

        /* renamed from: a */
        boolean mo3733a(int i);

        /* renamed from: b */
        void mo3732b();
    }

    /* renamed from: a */
    public static void m3811a(String str, String str2, String str3, int i, Map<String, String> map, InterfaceC44155a interfaceC44155a) {
        m3810a(str, str2, str3, i, false, 0, map, interfaceC44155a);
    }

    /* renamed from: b */
    public static void m3807b(String str, String str2, String str3, String str4, boolean z, int i, int i2, Map<String, String> map, int i3, String str5) {
        if (map == null) {
            map = new HashMap<>();
        }
        if (TextUtils.isEmpty(str)) {
            str = "unknown";
        }
        HashMap hashMap = new HashMap(map);
        hashMap.put("action", str);
        hashMap.put("track_url", str3);
        hashMap.put("track_name", str4);
        hashMap.put("states", str2);
        hashMap.put("src", z ? "1" : "0");
        hashMap.put("res_code", String.valueOf(i3));
        if (str5 == null) {
            str5 = "";
        }
        hashMap.put("res_msg", str5);
        hashMap.put(C26484a.f69196M, String.valueOf(i));
        hashMap.put("out_ad", String.valueOf(i2));
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1900391442:
                if (str.equals("va_cpn_cli")) {
                    c = 0;
                    break;
                }
                break;
            case -1900385638:
                if (str.equals("va_cpn_imp")) {
                    c = 1;
                    break;
                }
                break;
            case -1080320404:
                if (str.equals("impl_track")) {
                    c = 2;
                    break;
                }
                break;
            case -824217204:
                if (str.equals("va_cli")) {
                    c = 3;
                    break;
                }
                break;
            case 219543569:
                if (str.equals("va_show")) {
                    c = 4;
                    break;
                }
                break;
            case 1686229972:
                if (str.equals("click_track")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 3:
            case 5:
                C44136b.m3847b(hashMap);
                return;
            case 1:
            case 2:
            case 4:
                C44136b.m3896a(hashMap);
                return;
            default:
                C43782a.m5010a(0, 3, "TrackerRequestHelper", "reportTrack dont report action =".concat(str));
                return;
        }
    }

    /* renamed from: a */
    public static void m3810a(final String str, final String str2, final String str3, final int i, final boolean z, final int i2, final Map<String, String> map, final InterfaceC44155a interfaceC44155a) {
        if (C43906a.m4616p()) {
            return;
        }
        C43782a.m5010a(0, 3, "TrackerRequestHelper", "track url = ".concat(String.valueOf(str2)));
        if (C43525i.f114036a.mo4461m().mo5375a(9) && URLUtil.isHttpUrl(str2)) {
            m3807b(str, LoginLogger.EVENT_EXTRAS_FAILURE, str2, str3, z, i2, i, map, 901, "Invalid http url");
            return;
        }
        m3808a(str, str2, str3, z, i2, i, map);
        C43795a c43795a = new C43795a(new C43798d(str2));
        c43795a.f114617k = RunnableC43792e.m4984g();
        C43807g.m4958a(c43795a, new AbstractC43793b<C43795a, C43800a>() { // from class: sg.bigo.ads.core.d.a.1

            /* renamed from: j */
            private final List<Integer> f115878j = new ArrayList();

            /* renamed from: k */
            private int f115879k = -1;

            /* renamed from: l */
            private boolean f115880l = false;

            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ C43800a mo3801a(@NonNull C43800a c43800a) {
                return c43800a;
            }

            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            public final /* synthetic */ void mo3804a(@NonNull C43795a c43795a2, @Nullable String str4, int i3) {
                super.mo3804a(c43795a2, str4, i3);
                this.f115878j.add(Integer.valueOf(i3));
            }

            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            public final /* synthetic */ void mo3803a(@NonNull C43795a c43795a2, @NonNull C43800a c43800a) {
                C43800a c43800a2 = c43800a;
                InterfaceC44155a interfaceC44155a2 = interfaceC44155a;
                if (interfaceC44155a2 != null) {
                    interfaceC44155a2.mo3732b();
                }
                C44153a.m3807b(str, "success", str2, str3, z, i2, i, map, c43800a2.f114624a, "success");
            }

            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            public final /* synthetic */ void mo3802a(@NonNull C43795a c43795a2, @NonNull C43808h c43808h) {
                String str4;
                String str5;
                String str6;
                String str7;
                boolean z2;
                int i3;
                int i4;
                Map map2;
                int i5;
                String str8;
                C43795a c43795a3 = c43795a2;
                if (this.f115880l || m3806a(c43795a3)) {
                    InterfaceC44155a interfaceC44155a2 = interfaceC44155a;
                    if (interfaceC44155a2 != null) {
                        interfaceC44155a2.mo3732b();
                    }
                    str4 = str;
                    str5 = "success";
                    str6 = str2;
                    str7 = str3;
                    z2 = z;
                    i3 = i2;
                    i4 = i;
                    map2 = map;
                    i5 = this.f115879k;
                    str8 = "Something wrong occurs when handling the request, but it is still successful";
                } else {
                    C43782a.m5010a(0, 3, "TrackerRequestHelper", "track onError e=" + c43808h.getMessage());
                    InterfaceC44155a interfaceC44155a3 = interfaceC44155a;
                    if (interfaceC44155a3 != null) {
                        interfaceC44155a3.mo3734a();
                    }
                    str4 = str;
                    str5 = LoginLogger.EVENT_EXTRAS_FAILURE;
                    str6 = str2;
                    str7 = str3;
                    z2 = z;
                    i3 = i2;
                    i4 = i;
                    map2 = map;
                    i5 = c43808h.f114641a;
                    str8 = c43808h.getMessage();
                }
                C44153a.m3807b(str4, str5, str6, str7, z2, i3, i4, map2, i5, str8);
            }

            /* JADX WARN: Removed duplicated region for block: B:23:0x000c  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private boolean m3806a(@androidx.annotation.NonNull sg.bigo.ads.common.p933u.p935b.C43795a r4) {
                /*
                    r3 = this;
                    java.util.List<java.lang.Integer> r0 = r3.f115878j
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L2c
                    java.lang.Object r1 = r0.next()
                    java.lang.Integer r1 = (java.lang.Integer) r1
                    int r1 = r1.intValue()
                    sg.bigo.ads.core.d.a$a r2 = r1
                    if (r2 == 0) goto L20
                    boolean r2 = r2.mo3733a(r1)
                    if (r2 != 0) goto L26
                L20:
                    boolean r2 = super.mo3805a(r4, r1)
                    if (r2 == 0) goto L6
                L26:
                    r3.f115879k = r1
                    r4 = 1
                    r3.f115880l = r4
                    return r4
                L2c:
                    r4 = 0
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.p962d.C44153a.C441541.m3806a(sg.bigo.ads.common.u.b.a):boolean");
            }

            @Override // sg.bigo.ads.common.p933u.AbstractC43793b
            /* renamed from: a */
            public final /* synthetic */ boolean mo3805a(@NonNull C43795a c43795a2, int i3) {
                this.f115878j.add(Integer.valueOf(i3));
                return m3806a(c43795a2);
            }
        });
    }

    /* renamed from: a */
    private static void m3808a(String str, String str2, String str3, boolean z, int i, int i2, Map<String, String> map) {
        m3807b(str, "start", str2, str3, z, i, i2, map, 0, "");
    }
}
