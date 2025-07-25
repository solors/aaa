package sg.bigo.ads.controller.p944a.p945a;

import android.os.Parcel;
import android.webkit.URLUtil;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.common.C43722n;
import sg.bigo.ads.common.InterfaceC43615f;
import sg.bigo.ads.common.utils.C43828k;
import sg.bigo.ads.controller.p944a.C43959k;

/* renamed from: sg.bigo.ads.controller.a.a.e */
/* loaded from: classes10.dex */
public final class C43926e extends AbstractC43936g implements InterfaceC43615f {

    /* renamed from: a */
    public static final long f115033a = TimeUnit.DAYS.toMillis(1);

    /* renamed from: b */
    public static final long f115034b = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: g */
    private long f115038g;

    /* renamed from: h */
    private long f115039h;

    /* renamed from: f */
    private List<C43916a> f115037f = m4548c();

    /* renamed from: d */
    private long f115035d = f115033a;

    /* renamed from: e */
    private long f115036e = f115034b;

    /* renamed from: c */
    private static List<C43916a> m4548c() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C43916a(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, "https://drive.google.com/uc?export=download&id=1ms4F7Cn_aInE9oFMMaZEiwMIuMKt1DZc", true));
        return arrayList;
    }

    @Override // sg.bigo.ads.controller.p944a.p945a.AbstractC43936g
    @Nullable
    /* renamed from: a */
    public final C43959k mo4540a(String str) {
        synchronized (this) {
            if (C43828k.m4877a((Collection) this.f115037f)) {
                return null;
            }
            C43916a m4539a = AbstractC43936g.m4539a(C43828k.m4876a(this.f115037f, new Comparable<C43916a>() { // from class: sg.bigo.ads.controller.a.a.e.1
                @Override // java.lang.Comparable
                public final /* bridge */ /* synthetic */ int compareTo(C43916a c43916a) {
                    C43916a c43916a2 = c43916a;
                    if (c43916a2 != null && c43916a2.f115002d && !c43916a2.f115126b) {
                        return 1;
                    }
                    return 0;
                }
            }));
            if (m4539a != null) {
                return m4539a;
            }
            C43916a m4539a2 = AbstractC43936g.m4539a(C43828k.m4876a(this.f115037f, new Comparable<C43916a>() { // from class: sg.bigo.ads.controller.a.a.e.2
                @Override // java.lang.Comparable
                public final /* bridge */ /* synthetic */ int compareTo(C43916a c43916a) {
                    C43916a c43916a2 = c43916a;
                    if (c43916a2 != null && c43916a2.f115002d && c43916a2.f115126b) {
                        return 1;
                    }
                    return 0;
                }
            }));
            if (m4539a2 != null) {
                return m4539a2;
            }
            return null;
        }
    }

    /* renamed from: b */
    public final void m4549b() {
        this.f115038g = System.currentTimeMillis();
        synchronized (this) {
            if (C43828k.m4877a((Collection) this.f115037f)) {
                return;
            }
            for (C43916a c43916a : this.f115037f) {
                c43916a.f115002d = true;
            }
        }
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: a */
    public final void mo4441a(@NonNull Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.f115035d);
            parcel.writeLong(this.f115036e);
            C43722n.m5123a(parcel, this.f115037f);
            parcel.writeLong(this.f115038g);
            parcel.writeLong(this.f115039h);
        }
    }

    @Override // sg.bigo.ads.common.InterfaceC43615f
    /* renamed from: b */
    public final void mo4437b(@NonNull Parcel parcel) {
        synchronized (this) {
            this.f115035d = C43722n.m5125a(parcel, f115033a);
            this.f115036e = C43722n.m5125a(parcel, f115034b);
            List<C43916a> m5121a = C43722n.m5121a(parcel, C43916a.f115001c);
            this.f115037f = m5121a;
            if (C43828k.m4877a((Collection) m5121a)) {
                this.f115037f = m4548c();
            }
            this.f115038g = C43722n.m5125a(parcel, 0L);
            this.f115039h = C43722n.m5125a(parcel, 0L);
        }
    }

    /* renamed from: a */
    public final void m4550a(@NonNull JSONObject jSONObject) {
        synchronized (this) {
            long j = AbstractC43936g.f115054c;
            long max = Math.max(jSONObject.optLong("suc_interval", f115033a / 1000) * 1000, j);
            long max2 = Math.max(jSONObject.optLong("fail_interval", f115034b / 1000) * 1000, j);
            List<C43916a> m4548c = m4548c();
            JSONArray optJSONArray = jSONObject.optJSONArray("urls");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject.optString("name", "");
                    String optString2 = optJSONObject.optString("url", "");
                    if (URLUtil.isNetworkUrl(optString2)) {
                        m4548c.add(new C43916a(optString, optString2, false));
                    }
                }
            }
            this.f115035d = max;
            this.f115036e = max2;
            this.f115037f = m4548c;
        }
    }

    @Override // sg.bigo.ads.controller.p944a.p945a.AbstractC43936g
    /* renamed from: a */
    public final void mo4538a(boolean z) {
        super.mo4538a(z);
        if (z) {
            this.f115039h = System.currentTimeMillis();
        }
    }

    /* renamed from: a */
    public final boolean m4551a() {
        long j = this.f115038g;
        long j2 = this.f115039h;
        if (j == j2) {
            return true;
        }
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        long currentTimeMillis = System.currentTimeMillis();
        return i > 0 ? Math.abs(currentTimeMillis - this.f115038g) > this.f115036e : Math.abs(currentTimeMillis - this.f115039h) > this.f115035d;
    }
}
