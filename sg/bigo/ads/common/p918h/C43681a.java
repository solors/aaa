package sg.bigo.ads.common.p918h;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43823f;

/* renamed from: sg.bigo.ads.common.h.a */
/* loaded from: classes10.dex */
public class C43681a {

    /* renamed from: a */
    public final String f114335a;

    /* renamed from: b */
    public String f114336b;

    /* renamed from: c */
    public String f114337c;

    /* renamed from: d */
    public String f114338d;

    /* renamed from: e */
    public int f114339e;

    /* renamed from: f */
    public long f114340f;

    /* renamed from: g */
    public long f114341g;

    /* renamed from: h */
    public long f114342h;

    /* renamed from: l */
    long f114346l;

    /* renamed from: o */
    public String f114349o;

    /* renamed from: p */
    public final boolean f114350p;

    /* renamed from: r */
    private C43701c f114352r;

    /* renamed from: i */
    public int f114343i = 0;

    /* renamed from: j */
    public int f114344j = 0;

    /* renamed from: k */
    public long f114345k = 0;

    /* renamed from: m */
    public boolean f114347m = false;

    /* renamed from: n */
    public boolean f114348n = false;

    /* renamed from: q */
    private C43682a f114351q = new C43682a();

    /* renamed from: sg.bigo.ads.common.h.a$a */
    /* loaded from: classes10.dex */
    public static class C43682a {

        /* renamed from: a */
        int f114353a = -1;

        /* renamed from: b */
        public boolean f114354b = false;

        /* renamed from: a */
        final String m5211a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("support_pd_flag", Integer.valueOf(this.f114353a));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        }
    }

    public C43681a(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z, boolean z2, @Nullable C43701c c43701c) {
        this.f114336b = str;
        this.f114337c = str2;
        this.f114338d = str3;
        this.f114339e = z ? 1 : 0;
        this.f114350p = z2;
        String m5220a = m5220a();
        long m4897a = C43823f.m4897a(m5220a, 1);
        this.f114340f = m4897a <= 0 ? C43823f.m4897a(C43823f.m4889d(m5220a), 1) : m4897a;
        String valueOf = String.valueOf(str.hashCode());
        this.f114335a = valueOf;
        this.f114352r = c43701c;
        C43782a.m5010a(0, 3, "DownloadInfo", "newInstance mId = " + valueOf + ", savedSize = " + this.f114340f + ", mIsSupportFillTime = " + m5218c());
    }

    /* renamed from: a */
    public final String m5220a() {
        return this.f114337c + File.separator + this.f114338d;
    }

    /* renamed from: b */
    public final boolean m5219b() {
        if (this.f114343i == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m5218c() {
        C43701c c43701c = this.f114352r;
        if (c43701c != null && c43701c.f114399a) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m5217d() {
        C43701c c43701c = this.f114352r;
        if (c43701c != null && c43701c.f114400b) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final int m5216e() {
        C43701c c43701c = this.f114352r;
        if (c43701c != null) {
            return c43701c.f114401c;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != C43681a.class) {
            return false;
        }
        C43681a c43681a = (C43681a) obj;
        if (!this.f114336b.equals(c43681a.f114336b) || !this.f114338d.equals(c43681a.f114338d) || !this.f114337c.equals(c43681a.f114337c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int m5215f() {
        C43701c c43701c = this.f114352r;
        if (c43701c != null) {
            return c43701c.f114402d;
        }
        return 5;
    }

    /* renamed from: g */
    public final int m5214g() {
        C43701c c43701c = this.f114352r;
        if (c43701c != null) {
            return c43701c.f114403e;
        }
        return 20;
    }

    /* renamed from: h */
    public final boolean m5213h() {
        if (this.f114336b.endsWith(".mp4") && this.f114351q.f114353a == -1) {
            if (C43823f.m4898a(C43823f.m4889d(m5220a()))) {
                this.f114351q.f114353a = 1;
            } else {
                this.f114351q.f114353a = 0;
            }
        }
        if (this.f114351q.f114353a != 1) {
            return false;
        }
        return true;
    }

    @NonNull
    public String toString() {
        return " url = " + this.f114336b + ", fileName = " + this.f114338d + ", filePath = " + this.f114337c + ", downloadCount = " + this.f114344j + ", totalSize = " + this.f114342h + ", loadedSize = " + this.f114340f + ", mState = " + this.f114343i + ", mLastDownloadEndTime = " + this.f114345k + ", mExt = " + this.f114351q.m5211a() + ", contentType = " + this.f114349o + " isSupportFillTime = " + m5218c() + " adFillTime = " + m5216e() + " adCheckProcessTime = " + m5215f() + " adCheckMinProcess = " + m5214g();
    }
}
