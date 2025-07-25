package sg.bigo.ads.controller.p944a.p945a;

import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.C43722n;
import sg.bigo.ads.common.InterfaceC43615f;
import sg.bigo.ads.common.utils.C43828k;
import sg.bigo.ads.controller.p944a.C43957i;
import sg.bigo.ads.controller.p944a.C43959k;

/* renamed from: sg.bigo.ads.controller.a.a.f */
/* loaded from: classes10.dex */
public final class C43929f extends AbstractC43936g implements InterfaceC43615f {

    /* renamed from: a */
    public static final long f115042a = TimeUnit.HOURS.toMillis(2);

    /* renamed from: e */
    private long f115045e;

    /* renamed from: d */
    private List<C43934a> f115044d = m4543c();

    /* renamed from: b */
    private long f115043b = f115042a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: sg.bigo.ads.controller.a.a.f$a */
    /* loaded from: classes10.dex */
    public static class C43934a extends C43916a {

        /* renamed from: e */
        private static final InterfaceC43615f.InterfaceC43616a<C43934a> f115052e = new InterfaceC43615f.InterfaceC43616a<C43934a>() { // from class: sg.bigo.ads.controller.a.a.f.a.1
            @Override // sg.bigo.ads.common.InterfaceC43615f.InterfaceC43616a
            /* renamed from: a */
            public final /* synthetic */ C43934a mo4414a() {
                return new C43934a();
            }
        };

        /* renamed from: f */
        private String f115053f;

        public C43934a() {
        }

        public C43934a(String str, String str2, boolean z, String str3) {
            super(str, str2, z);
            this.f115053f = str3;
        }

        @Override // sg.bigo.ads.controller.p944a.C43959k, sg.bigo.ads.common.InterfaceC43615f
        /* renamed from: b */
        public final void mo4437b(@NonNull Parcel parcel) {
            super.mo4437b(parcel);
            this.f115053f = C43722n.m5124a(parcel, "");
        }

        @Override // sg.bigo.ads.controller.p944a.C43959k, sg.bigo.ads.common.InterfaceC43615f
        /* renamed from: a */
        public final void mo4441a(@NonNull Parcel parcel) {
            super.mo4441a(parcel);
            parcel.writeString(this.f115053f);
        }
    }

    @Nullable
    /* renamed from: b */
    private C43959k m4544b(final String str) {
        synchronized (this) {
            if (C43828k.m4877a((Collection) this.f115044d)) {
                return null;
            }
            C43934a c43934a = (C43934a) AbstractC43936g.m4539a(C43828k.m4876a(this.f115044d, new Comparable<C43934a>() { // from class: sg.bigo.ads.controller.a.a.f.1
                @Override // java.lang.Comparable
                public final /* synthetic */ int compareTo(C43934a c43934a2) {
                    C43934a c43934a3 = c43934a2;
                    if (c43934a3 != null && c43934a3.f115002d && !c43934a3.f115126b && TextUtils.equals(c43934a3.f115053f, str)) {
                        return 1;
                    }
                    return 0;
                }
            }));
            if (c43934a != null) {
                return c43934a;
            }
            List m4876a = C43828k.m4876a(this.f115044d, new Comparable<C43934a>() { // from class: sg.bigo.ads.controller.a.a.f.2
                @Override // java.lang.Comparable
                public final /* synthetic */ int compareTo(C43934a c43934a2) {
                    C43934a c43934a3 = c43934a2;
                    if (c43934a3 != null && c43934a3.f115002d && c43934a3.f115126b && TextUtils.equals(c43934a3.f115053f, str)) {
                        return 1;
                    }
                    return 0;
                }
            });
            if (!C43828k.m4877a((Collection) m4876a)) {
                return AbstractC43936g.m4539a(m4876a);
            }
            List m4876a2 = C43828k.m4876a(this.f115044d, new Comparable<C43934a>() { // from class: sg.bigo.ads.controller.a.a.f.3
                @Override // java.lang.Comparable
                public final /* bridge */ /* synthetic */ int compareTo(C43934a c43934a2) {
                    C43934a c43934a3 = c43934a2;
                    if (c43934a3 != null && c43934a3.f115002d && !c43934a3.f115126b) {
                        return 1;
                    }
                    return 0;
                }
            });
            if (!C43828k.m4877a((Collection) m4876a2)) {
                return AbstractC43936g.m4539a(m4876a2);
            }
            C43934a c43934a2 = (C43934a) AbstractC43936g.m4539a(C43828k.m4876a(this.f115044d, new Comparable<C43934a>() { // from class: sg.bigo.ads.controller.a.a.f.4
                @Override // java.lang.Comparable
                public final /* bridge */ /* synthetic */ int compareTo(C43934a c43934a3) {
                    C43934a c43934a4 = c43934a3;
                    if (c43934a4 != null && c43934a4.f115002d && c43934a4.f115126b) {
                        return 1;
                    }
                    return 0;
                }
            }));
            if (c43934a2 != null) {
                return c43934a2;
            }
            return null;
        }
    }

    /* renamed from: c */
    private static List<C43934a> m4543c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C43934a("AWS", "https://ad-host-backup-asia.s3.ap-southeast-1.amazonaws.com/uni/v2/au.pj", true, "asia"));
        arrayList.add(new C43934a("AWS", "https://ad-host-backup-europe.s3.eu-central-1.amazonaws.com/uni/v2/au.pj", true, "europe"));
        arrayList.add(new C43934a("AWS", "https://ad-host-backup-america.s3.us-west-1.amazonaws.com/uni/v2/au.pj", true, "america"));
        return arrayList;
    }

    @Override // sg.bigo.ads.controller.p944a.p945a.AbstractC43936g
    @Nullable
    /* renamed from: a */
    public final C43959k mo4540a(String str) {
        if (C43828k.m4877a((Collection) this.f115044d)) {
            return null;
        }
        return m4544b(C43957i.m4512a(str));
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.f115043b);
            C43722n.m5123a(parcel, this.f115044d);
            parcel.writeLong(this.f115045e);
        }
    }

    /* renamed from: b */
    public final void m4545b() {
        this.f115045e = System.currentTimeMillis();
        synchronized (this) {
            if (C43828k.m4877a((Collection) this.f115044d)) {
                return;
            }
            for (C43934a c43934a : this.f115044d) {
                c43934a.f115002d = true;
            }
        }
    }

    /* renamed from: a */
    public final void m4546a(@NonNull JSONObject jSONObject) {
        synchronized (this) {
            long max = Math.max(jSONObject.optLong("interval", f115042a / 1000) * 1000, AbstractC43936g.f115054c);
            List<C43934a> m4543c = m4543c();
            JSONArray optJSONArray = jSONObject.optJSONArray("urls");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject.optString("name", "");
                    String optString2 = optJSONObject.optString("url", "");
                    String optString3 = optJSONObject.optString("region", "");
                    if (URLUtil.isNetworkUrl(optString2)) {
                        m4543c.add(new C43934a(optString, optString2, false, optString3));
                    }
                }
            }
            this.f115043b = max;
            this.f115044d = m4543c;
        }
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        synchronized (this) {
            this.f115043b = C43722n.m5125a(parcel, f115042a);
            List<C43934a> m5121a = C43722n.m5121a(parcel, C43934a.f115052e);
            this.f115044d = m5121a;
            if (C43828k.m4877a((Collection) m5121a)) {
                this.f115044d = m4543c();
            }
            this.f115045e = C43722n.m5125a(parcel, 0L);
        }
    }

    /* renamed from: a */
    public final boolean m4547a() {
        return Math.abs(System.currentTimeMillis() - this.f115045e) > this.f115043b;
    }
}
