package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.C20517nb;
import com.ironsource.C21114v8;
import com.mbridge.msdk.foundation.same.CommonConst;
import com.mbridge.msdk.foundation.tools.SameDiTool;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.foundation.entity.n */
/* loaded from: classes6.dex */
public final class VideoReportData {

    /* renamed from: a */
    public static int f56390a = 1;

    /* renamed from: b */
    public static int f56391b;

    /* renamed from: A */
    private String f56392A;

    /* renamed from: B */
    private String f56393B;

    /* renamed from: C */
    private String f56394C;

    /* renamed from: D */
    private String f56395D;

    /* renamed from: E */
    private int f56396E;

    /* renamed from: F */
    private String f56397F;

    /* renamed from: G */
    private String f56398G;

    /* renamed from: I */
    private String f56400I;

    /* renamed from: J */
    private String f56401J;

    /* renamed from: K */
    private String f56402K;

    /* renamed from: L */
    private int f56403L;

    /* renamed from: M */
    private long f56404M;

    /* renamed from: N */
    private String f56405N;

    /* renamed from: O */
    private int f56406O;

    /* renamed from: d */
    private String f56408d;

    /* renamed from: e */
    private int f56409e;

    /* renamed from: g */
    private int f56411g;

    /* renamed from: h */
    private String f56412h;

    /* renamed from: i */
    private String f56413i;

    /* renamed from: j */
    private String f56414j;

    /* renamed from: k */
    private String f56415k;

    /* renamed from: l */
    private String f56416l;

    /* renamed from: m */
    private String f56417m;

    /* renamed from: n */
    private String f56418n;

    /* renamed from: o */
    private String f56419o;

    /* renamed from: p */
    private String f56420p;

    /* renamed from: q */
    private String f56421q;

    /* renamed from: r */
    private int f56422r;

    /* renamed from: s */
    private String f56423s;

    /* renamed from: t */
    private String f56424t;

    /* renamed from: u */
    private String f56425u;

    /* renamed from: w */
    private int f56427w;

    /* renamed from: x */
    private String f56428x;

    /* renamed from: y */
    private String f56429y;

    /* renamed from: z */
    private String f56430z;

    /* renamed from: c */
    private Map<String, String> f56407c = null;

    /* renamed from: f */
    private int f56410f = 0;

    /* renamed from: v */
    private int f56426v = 0;

    /* renamed from: H */
    private int f56399H = 0;

    public VideoReportData(String str, int i, int i2, int i3, int i4, String str2, String str3, int i5, String str4, int i6, String str5) {
        this.f56423s = str;
        this.f56427w = i;
        this.f56428x = str5;
        this.f56422r = i2;
        this.f56406O = i3;
        this.f56403L = i4;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f56429y = URLEncoder.encode(str2, C20517nb.f52167N);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f56430z = str3;
        this.f56396E = i5;
        this.f56415k = str4;
        this.f56404M = i6;
    }

    /* renamed from: A */
    public final int m52368A() {
        return this.f56406O;
    }

    /* renamed from: B */
    public final int m52367B() {
        return this.f56426v;
    }

    /* renamed from: C */
    public final int m52366C() {
        return this.f56411g;
    }

    /* renamed from: D */
    public final String m52365D() {
        return this.f56400I;
    }

    /* renamed from: E */
    public final String m52364E() {
        return this.f56418n;
    }

    /* renamed from: F */
    public final int m52363F() {
        return this.f56399H;
    }

    /* renamed from: a */
    public final String m52362a() {
        return this.f56423s;
    }

    /* renamed from: b */
    public final String m52358b() {
        return this.f56394C;
    }

    /* renamed from: c */
    public final String m52354c() {
        return this.f56402K;
    }

    /* renamed from: d */
    public final String m52351d() {
        return this.f56408d;
    }

    /* renamed from: e */
    public final String m52348e() {
        return this.f56412h;
    }

    /* renamed from: f */
    public final String m52345f() {
        return this.f56392A;
    }

    /* renamed from: g */
    public final String m52343g() {
        return this.f56393B;
    }

    /* renamed from: h */
    public final String m52341h() {
        return TextUtils.isEmpty(this.f56430z) ? "" : this.f56430z;
    }

    /* renamed from: i */
    public final String m52339i() {
        return this.f56413i;
    }

    /* renamed from: j */
    public final String m52337j() {
        return this.f56414j;
    }

    /* renamed from: k */
    public final int m52335k() {
        return this.f56427w;
    }

    /* renamed from: l */
    public final String m52333l() {
        return this.f56428x;
    }

    /* renamed from: m */
    public final int m52331m() {
        return this.f56396E;
    }

    /* renamed from: n */
    public final String m52329n() {
        return this.f56415k;
    }

    /* renamed from: o */
    public final long m52327o() {
        return this.f56404M;
    }

    /* renamed from: p */
    public final int m52325p() {
        return this.f56403L;
    }

    /* renamed from: q */
    public final String m52323q() {
        return this.f56405N;
    }

    /* renamed from: r */
    public final String m52321r() {
        return this.f56429y;
    }

    /* renamed from: s */
    public final String m52319s() {
        return this.f56417m;
    }

    /* renamed from: t */
    public final String m52317t() {
        return this.f56416l;
    }

    @NonNull
    public final String toString() {
        return "RewardReportData [key=" + this.f56423s + ", networkType=" + this.f56427w + ", isCompleteView=" + this.f56422r + ", watchedMillis=" + this.f56406O + ", videoLength=" + this.f56403L + ", offerUrl=" + this.f56429y + ", reason=" + this.f56430z + ", result=" + this.f56396E + ", duration=" + this.f56415k + ", videoSize=" + this.f56404M + C21114v8.C21123i.f54139e;
    }

    /* renamed from: u */
    public final int m52315u() {
        return this.f56409e;
    }

    /* renamed from: v */
    public final String m52313v() {
        return this.f56419o;
    }

    /* renamed from: w */
    public final String m52311w() {
        return this.f56401J;
    }

    /* renamed from: x */
    public final String m52310x() {
        return this.f56424t;
    }

    /* renamed from: y */
    public final String m52309y() {
        return this.f56421q;
    }

    /* renamed from: z */
    public final int m52308z() {
        return this.f56422r;
    }

    /* renamed from: a */
    public final void m52360a(String str) {
        this.f56423s = str;
    }

    /* renamed from: b */
    public final void m52356b(String str) {
        this.f56394C = str;
    }

    /* renamed from: c */
    public final void m52352c(String str) {
        this.f56402K = str;
    }

    /* renamed from: d */
    public final void m52349d(String str) {
        this.f56408d = str;
    }

    /* renamed from: e */
    public final void m52346e(String str) {
        this.f56412h = str;
    }

    /* renamed from: f */
    public final void m52344f(String str) {
        this.f56392A = str;
    }

    /* renamed from: g */
    public final void m52342g(String str) {
        this.f56393B = str;
    }

    /* renamed from: h */
    public final void m52340h(String str) {
        this.f56430z = str;
    }

    /* renamed from: i */
    public final void m52338i(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f56413i = URLEncoder.encode(str);
    }

    /* renamed from: j */
    public final void m52336j(String str) {
        this.f56414j = str;
    }

    /* renamed from: k */
    public final void m52334k(String str) {
        this.f56428x = str;
    }

    /* renamed from: l */
    public final void m52332l(String str) {
        this.f56415k = str;
    }

    /* renamed from: m */
    public final void m52330m(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f56405N = URLEncoder.encode(str, C20517nb.f52167N);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: n */
    public final void m52328n(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f56417m = URLEncoder.encode(str, C20517nb.f52167N);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: o */
    public final void m52326o(String str) {
        this.f56416l = str;
    }

    /* renamed from: p */
    public final void m52324p(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f56421q = URLEncoder.encode(str, C20517nb.f52167N);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: q */
    public final void m52322q(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f56400I = URLEncoder.encode(str, C20517nb.f52167N);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: r */
    public final void m52320r(String str) {
        this.f56418n = str;
    }

    /* renamed from: s */
    public final void m52318s(String str) {
        this.f56425u = str;
    }

    /* renamed from: t */
    public final void m52316t(String str) {
        this.f56395D = str;
    }

    /* renamed from: u */
    public final void m52314u(String str) {
        this.f56397F = str;
    }

    /* renamed from: v */
    public final void m52312v(String str) {
        this.f56398G = str;
    }

    /* renamed from: a */
    public final void m52361a(int i) {
        this.f56427w = i;
    }

    /* renamed from: b */
    public final void m52357b(int i) {
        this.f56396E = i;
    }

    /* renamed from: c */
    public final void m52353c(int i) {
        this.f56409e = i;
    }

    /* renamed from: d */
    public final void m52350d(int i) {
        this.f56426v = i;
    }

    /* renamed from: e */
    public final void m52347e(int i) {
        this.f56399H = i;
    }

    /* renamed from: a */
    public final void m52359a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f56407c == null) {
            this.f56407c = new HashMap();
        }
        try {
            this.f56407c.put(str, str2);
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    public final String m52355b(String str, String str2) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || (map = this.f56407c) == null) {
            return str2;
        }
        try {
            String str3 = map.get(str);
            return TextUtils.isEmpty(str3) ? str2 : str3;
        } catch (Exception unused) {
            return str2;
        }
    }

    public VideoReportData() {
    }

    public VideoReportData(String str, int i, String str2, String str3, String str4) {
        this.f56423s = str;
        this.f56428x = str4;
        this.f56427w = i;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f56429y = URLEncoder.encode(str2, C20517nb.f52167N);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        this.f56430z = str3;
    }

    public VideoReportData(String str, int i, int i2, String str2, int i3, String str3, int i4, String str4) {
        this.f56423s = str;
        this.f56427w = i;
        this.f56428x = str4;
        this.f56403L = i2;
        if (!TextUtils.isEmpty(str2)) {
            try {
                this.f56429y = URLEncoder.encode(str2, C20517nb.f52167N);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        this.f56396E = i3;
        this.f56415k = str3;
        this.f56404M = i4;
    }

    public VideoReportData(Context context, CampaignEx campaignEx, int i, String str, long j, int i2) {
        if (i2 == 1 || i2 == 287 || i2 == 94) {
            this.f56423s = "m_download_end";
        } else if (i2 == 95) {
            this.f56423s = "2000025";
        }
        int m51876m = SameDiTool.m51876m(context);
        this.f56427w = m51876m;
        this.f56428x = SameDiTool.m51901a(context, m51876m);
        this.f56403L = campaignEx.getVideoLength();
        this.f56392A = campaignEx.getRequestId();
        this.f56393B = campaignEx.getRequestIdNotice();
        if (!TextUtils.isEmpty(this.f56429y)) {
            try {
                this.f56429y = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), C20517nb.f52167N);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        this.f56396E = i;
        this.f56415k = str;
        this.f56404M = j == 0 ? campaignEx.getVideoSize() : j;
    }

    public VideoReportData(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        this.f56423s = str;
        this.f56419o = str2;
        this.f56401J = str3;
        this.f56424t = str4;
        this.f56402K = str5;
        this.f56412h = str6;
        this.f56427w = i;
        this.f56428x = str7;
    }

    public VideoReportData(String str) {
        this.f56420p = str;
    }

    public VideoReportData(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f56423s = str;
        this.f56396E = i;
        this.f56415k = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f56417m = URLEncoder.encode(str3, C20517nb.f52167N);
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f56412h = str4;
        this.f56402K = str5;
        this.f56430z = str6;
        this.f56416l = str7;
        if (Integer.valueOf(str2).intValue() > CommonConst.f56443L) {
            this.f56396E = 2;
        }
    }

    public VideoReportData(String str, String str2, String str3, String str4, String str5, int i) {
        this.f56423s = str;
        this.f56412h = str2;
        this.f56392A = str3;
        this.f56393B = str4;
        this.f56402K = str5;
        this.f56427w = i;
    }

    public VideoReportData(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        this.f56423s = str;
        this.f56412h = str2;
        this.f56392A = str3;
        this.f56393B = str4;
        this.f56402K = str5;
        this.f56427w = i;
        this.f56430z = str6;
        this.f56411g = i2;
    }
}
