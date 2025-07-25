package sg.bigo.ads.controller.p946b;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.p903a.InterfaceC43513a;
import sg.bigo.ads.api.p903a.InterfaceC43527k;
import sg.bigo.ads.api.p903a.InterfaceC43528l;
import sg.bigo.ads.api.p903a.InterfaceC43529m;
import sg.bigo.ads.common.C43722n;
import sg.bigo.ads.common.InterfaceC43615f;

/* renamed from: sg.bigo.ads.controller.b.i */
/* loaded from: classes10.dex */
class C43976i implements InterfaceC43528l, InterfaceC43615f {

    /* renamed from: a */
    private final C43973g f115215a = new C43973g();

    /* renamed from: b */
    protected String f115216b;

    /* renamed from: c */
    protected int f115217c;

    /* renamed from: d */
    protected int f115218d;

    /* renamed from: e */
    protected int f115219e;

    /* renamed from: f */
    protected int f115220f;

    /* renamed from: g */
    protected int f115221g;

    /* renamed from: h */
    protected int f115222h;

    /* renamed from: i */
    protected boolean f115223i;

    /* renamed from: j */
    protected boolean f115224j;

    /* renamed from: k */
    protected boolean f115225k;

    /* renamed from: l */
    protected int f115226l;

    /* renamed from: m */
    protected String f115227m;

    /* renamed from: n */
    protected boolean f115228n;

    /* renamed from: o */
    protected String f115229o;

    /* renamed from: p */
    protected List<InterfaceC43513a> f115230p;

    /* renamed from: q */
    protected String f115231q;

    /* renamed from: r */
    protected String f115232r;

    /* renamed from: s */
    protected InterfaceC43529m f115233s;

    /* renamed from: t */
    protected int f115234t;

    /* renamed from: u */
    protected int f115235u;

    /* renamed from: v */
    protected boolean f115236v;

    /* renamed from: w */
    protected int f115237w;

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: a */
    public String mo4442a() {
        return this.f115216b;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: b */
    public int mo4438b() {
        return this.f115217c;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: c */
    public int mo4436c() {
        return this.f115218d;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: d */
    public int mo4435d() {
        return this.f115219e;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: e */
    public int mo4434e() {
        return this.f115220f;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: f */
    public int mo4433f() {
        return this.f115221g;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: g */
    public int mo4432g() {
        return this.f115222h;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: h */
    public boolean mo4431h() {
        return this.f115223i;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: i */
    public boolean mo4430i() {
        return this.f115224j;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: j */
    public boolean mo4429j() {
        return this.f115225k;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: k */
    public int mo4428k() {
        return this.f115226l;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: l */
    public String mo4427l() {
        return this.f115227m;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: m */
    public boolean mo4426m() {
        return this.f115228n;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: n */
    public String mo4425n() {
        return this.f115229o;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: o */
    public String mo4424o() {
        return this.f115231q;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: p */
    public String mo4423p() {
        return this.f115232r;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    @NonNull
    /* renamed from: q */
    public InterfaceC43529m mo4422q() {
        if (this.f115233s == null) {
            this.f115233s = new C43978j(new JSONObject());
        }
        return this.f115233s;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: r */
    public int mo4421r() {
        return this.f115234t;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: s */
    public boolean mo4420s() {
        if (this.f115234t == 1) {
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: t */
    public boolean mo4419t() {
        if (this.f115235u == 1) {
            return true;
        }
        return false;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        List<InterfaceC43513a> list = this.f115230p;
        if (list != null) {
            for (InterfaceC43513a interfaceC43513a : list) {
                if (sb2.length() > 0) {
                    sb2.append(",");
                }
                sb2.append(interfaceC43513a);
            }
        }
        return "{strategyId=" + this.f115216b + ", adType=" + this.f115217c + ", countdown=" + this.f115218d + ", reqTimeout=" + this.f115219e + ", mediaStrategy=" + this.f115220f + ", webViewEnforceDuration=" + this.f115221g + ", videoDirection=" + this.f115222h + ", videoReplay=" + this.f115223i + ", videoMute=" + this.f115224j + ", bannerAutoRefresh=" + this.f115225k + ", bannerRefreshInterval=" + this.f115226l + ", slotId='" + this.f115227m + "', state=" + this.f115228n + ", placementId='" + this.f115229o + "', express=[" + sb2.toString() + "], styleId=" + this.f115232r + ", playable=" + this.f115234t + ", isCompanionRenderSupport=" + this.f115235u + ", aucMode=" + this.f115237w + ", nativeAdClickConfig=" + this.f115215a + '}';
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: u */
    public boolean mo4418u() {
        return this.f115236v;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: v */
    public int mo4417v() {
        return this.f115237w;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    /* renamed from: w */
    public boolean mo4416w() {
        if (this.f115237w == 3) {
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.api.p903a.InterfaceC43528l
    @NonNull
    /* renamed from: x */
    public InterfaceC43527k mo4415x() {
        return this.f115215a;
    }

    /* renamed from: a */
    public void mo4441a(@NonNull Parcel parcel) {
        parcel.writeString(this.f115216b);
        parcel.writeInt(this.f115217c);
        parcel.writeInt(this.f115218d);
        parcel.writeInt(this.f115219e);
        parcel.writeInt(this.f115220f);
        parcel.writeInt(this.f115221g);
        parcel.writeInt(this.f115222h);
        parcel.writeInt(this.f115223i ? 1 : 0);
        parcel.writeInt(this.f115224j ? 1 : 0);
        parcel.writeInt(this.f115225k ? 1 : 0);
        parcel.writeInt(this.f115226l);
        parcel.writeString(this.f115227m);
        parcel.writeInt(this.f115228n ? 1 : 0);
        parcel.writeString(this.f115229o);
        C43722n.m5123a(parcel, this.f115230p);
        parcel.writeInt(this.f115234t);
        parcel.writeString(this.f115232r);
        InterfaceC43529m interfaceC43529m = this.f115233s;
        parcel.writeString(interfaceC43529m == null ? null : interfaceC43529m.toString());
        parcel.writeInt(this.f115236v ? 1 : 0);
        parcel.writeInt(this.f115235u);
        parcel.writeInt(this.f115237w);
        C43722n.m5118a(parcel, this.f115215a);
    }

    /* renamed from: b */
    public void mo4437b(@NonNull Parcel parcel) {
        this.f115216b = parcel.readString();
        this.f115217c = parcel.readInt();
        this.f115218d = parcel.readInt();
        this.f115219e = parcel.readInt();
        this.f115220f = parcel.readInt();
        this.f115221g = parcel.readInt();
        this.f115222h = parcel.readInt();
        this.f115223i = parcel.readInt() != 0;
        this.f115224j = parcel.readInt() != 0;
        this.f115225k = parcel.readInt() != 0;
        this.f115226l = parcel.readInt();
        this.f115227m = parcel.readString();
        this.f115228n = parcel.readInt() != 0;
        this.f115229o = parcel.readString();
        this.f115230p = C43722n.m5121a(parcel, new InterfaceC43615f.InterfaceC43616a<InterfaceC43513a>() { // from class: sg.bigo.ads.controller.b.i.1
            @Override // sg.bigo.ads.common.InterfaceC43615f.InterfaceC43616a
            /* renamed from: a */
            public final /* synthetic */ InterfaceC43513a mo4414a() {
                return new C43961a();
            }
        });
        this.f115234t = C43722n.m5126a(parcel, 0);
        this.f115232r = C43722n.m5124a(parcel, "");
        m4440a(C43722n.m5124a(parcel, ""));
        this.f115236v = C43722n.m5112b(parcel, true);
        this.f115235u = C43722n.m5126a(parcel, 0);
        this.f115237w = C43722n.m5126a(parcel, 0);
        C43722n.m5113b(parcel, this.f115215a);
    }

    /* renamed from: a */
    private void m4440a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.f115217c == 4 && !jSONObject.has("interstitial_video_style")) {
                jSONObject = new JSONObject().put("interstitial_video_style", jSONObject);
            }
            this.f115233s = new C43978j(jSONObject);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0145 A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo4439a(org.json.JSONObject r14) {
        /*
            Method dump skipped, instructions count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.p946b.C43976i.mo4439a(org.json.JSONObject):boolean");
    }
}
