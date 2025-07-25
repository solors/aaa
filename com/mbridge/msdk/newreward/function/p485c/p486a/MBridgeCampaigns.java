package com.mbridge.msdk.newreward.function.p485c.p486a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.newreward.function.p485c.p488c.BaseCampaignResourceTemplate;
import com.mbridge.msdk.newreward.function.p485c.p488c.CampaignResourceDynamicTemplateBig;
import com.mbridge.msdk.newreward.function.p485c.p488c.CampaignResourceH5TemplateBig;
import com.mbridge.msdk.newreward.function.p485c.p488c.CampaignResourceVideo;
import com.mbridge.msdk.newreward.function.p495h.MBridgeCommonUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.newreward.function.c.a.b */
/* loaded from: classes6.dex */
public final class MBridgeCampaigns {

    /* renamed from: A */
    private String f58261A;

    /* renamed from: B */
    private int f58262B;

    /* renamed from: C */
    private int f58263C;

    /* renamed from: D */
    private List<CampaignEx> f58264D;

    /* renamed from: E */
    private int f58265E;

    /* renamed from: G */
    private long f58267G;

    /* renamed from: H */
    private Map<String, Object> f58268H;

    /* renamed from: I */
    private String f58269I;

    /* renamed from: a */
    private int f58273a;

    /* renamed from: b */
    private String f58274b;

    /* renamed from: c */
    private String f58275c;

    /* renamed from: d */
    private String f58276d;

    /* renamed from: e */
    private String f58277e;

    /* renamed from: f */
    private String f58278f;

    /* renamed from: g */
    private String f58279g;

    /* renamed from: h */
    private boolean f58280h;

    /* renamed from: j */
    private int f58282j;

    /* renamed from: k */
    private String f58283k;

    /* renamed from: l */
    private String f58284l;

    /* renamed from: m */
    private String f58285m;

    /* renamed from: n */
    private String f58286n;

    /* renamed from: o */
    private int f58287o;

    /* renamed from: p */
    private long f58288p;

    /* renamed from: q */
    private long f58289q;

    /* renamed from: r */
    private long f58290r;

    /* renamed from: s */
    private double f58291s;

    /* renamed from: t */
    private int f58292t;

    /* renamed from: u */
    private List<MBridgeCampaign> f58293u;

    /* renamed from: v */
    private JSONObject f58294v;

    /* renamed from: w */
    private BaseCampaignResourceTemplate<?> f58295w;

    /* renamed from: z */
    private Context f58298z;

    /* renamed from: i */
    private long f58281i = 30000;

    /* renamed from: x */
    private int f58296x = 60000;

    /* renamed from: y */
    private int f58297y = 60000;

    /* renamed from: F */
    private int f58266F = 0;

    /* renamed from: J */
    private boolean f58270J = false;

    /* renamed from: K */
    private int f58271K = 0;

    /* renamed from: L */
    private int f58272L = 0;

    public MBridgeCampaigns(int i, String str, String str2, String str3) {
        this.f58273a = i;
        this.f58274b = str;
        this.f58275c = str2;
        this.f58276d = str3;
    }

    /* renamed from: A */
    public final boolean m50620A() {
        if (this.f58288p > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final String m50619B() {
        return this.f58261A;
    }

    /* renamed from: C */
    public final int m50618C() {
        return this.f58263C;
    }

    /* renamed from: D */
    public final int m50617D() {
        return this.f58262B;
    }

    /* renamed from: E */
    public final List<CampaignEx> m50616E() {
        return this.f58264D;
    }

    /* renamed from: F */
    public final int m50615F() {
        int i = this.f58265E;
        if (i <= 0) {
            return 1;
        }
        return i;
    }

    /* renamed from: G */
    public final int m50614G() {
        return this.f58266F;
    }

    /* renamed from: H */
    public final Map<String, Object> m50613H() {
        if (this.f58268H == null) {
            this.f58268H = new HashMap();
        }
        return this.f58268H;
    }

    /* renamed from: I */
    public final long m50612I() {
        return this.f58267G;
    }

    /* renamed from: J */
    public final String m50611J() {
        return this.f58269I;
    }

    /* renamed from: K */
    public final boolean m50610K() {
        return this.f58270J;
    }

    /* renamed from: a */
    public final int m50609a() {
        return this.f58271K;
    }

    /* renamed from: b */
    public final int m50601b() {
        return this.f58272L;
    }

    /* renamed from: c */
    public final int m50595c() {
        return this.f58273a;
    }

    /* renamed from: d */
    public final String m50591d() {
        return this.f58275c;
    }

    /* renamed from: e */
    public final String m50587e() {
        return this.f58276d;
    }

    /* renamed from: f */
    public final String m50583f() {
        return this.f58277e;
    }

    /* renamed from: g */
    public final String m50580g() {
        return this.f58278f;
    }

    /* renamed from: h */
    public final String m50577h() {
        return this.f58279g;
    }

    /* renamed from: i */
    public final boolean m50574i() {
        return this.f58280h;
    }

    /* renamed from: j */
    public final int m50571j() {
        return this.f58282j;
    }

    /* renamed from: k */
    public final String m50569k() {
        return this.f58283k;
    }

    /* renamed from: l */
    public final String m50567l() {
        return this.f58284l;
    }

    /* renamed from: m */
    public final String m50566m() {
        return this.f58285m;
    }

    /* renamed from: n */
    public final String m50565n() {
        return this.f58286n;
    }

    /* renamed from: o */
    public final int m50564o() {
        return this.f58287o;
    }

    /* renamed from: p */
    public final long m50563p() {
        return this.f58288p;
    }

    /* renamed from: q */
    public final long m50562q() {
        return this.f58289q;
    }

    /* renamed from: r */
    public final long m50561r() {
        return this.f58290r;
    }

    /* renamed from: s */
    public final double m50560s() {
        return this.f58291s;
    }

    /* renamed from: t */
    public final int m50559t() {
        return this.f58292t;
    }

    /* renamed from: u */
    public final List<MBridgeCampaign> m50558u() {
        return this.f58293u;
    }

    /* renamed from: v */
    public final JSONObject m50557v() {
        return this.f58294v;
    }

    /* renamed from: w */
    public final BaseCampaignResourceTemplate<?> m50556w() {
        BaseCampaignResourceTemplate<?> baseCampaignResourceTemplate = this.f58295w;
        if (baseCampaignResourceTemplate != null) {
            return baseCampaignResourceTemplate;
        }
        String str = this.f58261A;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.f58295w == null) {
            if (MBridgeCommonUtils.m50255b(str)) {
                this.f58295w = new CampaignResourceDynamicTemplateBig(this, null);
            } else {
                this.f58295w = new CampaignResourceH5TemplateBig(this, null);
            }
        }
        return this.f58295w;
    }

    /* renamed from: x */
    public final Context m50555x() {
        return this.f58298z;
    }

    /* renamed from: y */
    public final boolean m50554y() {
        boolean z;
        List<MBridgeCampaign> list;
        boolean z2;
        boolean z3;
        boolean z4;
        BaseCampaignResourceTemplate<?> baseCampaignResourceTemplate = this.f58295w;
        if (baseCampaignResourceTemplate != null && !baseCampaignResourceTemplate.mo50509d()) {
            z = false;
        } else {
            z = true;
        }
        if (!z || (list = this.f58293u) == null || list.isEmpty()) {
            return false;
        }
        int size = this.f58293u.size();
        int i = 0;
        for (MBridgeCampaign mBridgeCampaign : this.f58293u) {
            CampaignResourceVideo m50629d = mBridgeCampaign.m50629d();
            if (m50629d != null && !m50629d.mo50509d()) {
                z2 = false;
            } else {
                z2 = true;
            }
            BaseCampaignResourceTemplate<?> m50627f = mBridgeCampaign.m50627f();
            if (m50627f != null && !m50627f.mo50509d()) {
                z3 = false;
            } else {
                z3 = true;
            }
            BaseCampaignResourceTemplate<?> m50631c = mBridgeCampaign.m50631c();
            if (m50631c != null && !m50631c.mo50509d()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z2 && z3 && z4) {
                i++;
            }
        }
        if (i == size) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b3 A[ADDED_TO_REGION] */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m50553z() {
        /*
            r10 = this;
            boolean r0 = r10.m50620A()
            boolean r1 = r10.m50554y()
            com.mbridge.msdk.newreward.function.c.c.d<?> r2 = r10.f58295w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L17
            boolean r2 = r2.mo50509d()
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = r4
            goto L18
        L17:
            r2 = r3
        L18:
            if (r2 != 0) goto L1c
            goto L7e
        L1c:
            java.util.List<com.mbridge.msdk.newreward.function.c.a.a> r2 = r10.f58293u
            if (r2 == 0) goto L7e
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L28
            goto L7e
        L28:
            java.util.List<com.mbridge.msdk.newreward.function.c.a.a> r2 = r10.f58293u
            int r2 = r2.size()
            java.util.List<com.mbridge.msdk.newreward.function.c.a.a> r5 = r10.f58293u
            java.util.Iterator r5 = r5.iterator()
            r6 = r4
        L35:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L7a
            java.lang.Object r7 = r5.next()
            com.mbridge.msdk.newreward.function.c.a.a r7 = (com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaign) r7
            com.mbridge.msdk.newreward.function.c.c.n r8 = r7.m50629d()
            if (r8 == 0) goto L50
            boolean r8 = r8.mo50508e()
            if (r8 == 0) goto L4e
            goto L50
        L4e:
            r8 = r4
            goto L51
        L50:
            r8 = r3
        L51:
            com.mbridge.msdk.newreward.function.c.c.d r9 = r7.m50627f()
            if (r9 == 0) goto L60
            boolean r9 = r9.mo50508e()
            if (r9 == 0) goto L5e
            goto L60
        L5e:
            r9 = r4
            goto L61
        L60:
            r9 = r3
        L61:
            com.mbridge.msdk.newreward.function.c.c.d r7 = r7.m50631c()
            if (r7 == 0) goto L70
            boolean r7 = r7.mo50508e()
            if (r7 == 0) goto L6e
            goto L70
        L6e:
            r7 = r4
            goto L71
        L70:
            r7 = r3
        L71:
            if (r8 == 0) goto L35
            if (r9 == 0) goto L35
            if (r7 == 0) goto L35
            int r6 = r6 + 1
            goto L35
        L7a:
            if (r6 != r2) goto L7e
            r2 = r3
            goto L7f
        L7e:
            r2 = r4
        L7f:
            java.util.List<com.mbridge.msdk.newreward.function.c.a.a> r5 = r10.f58293u
            if (r5 == 0) goto Lb0
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L8a
            goto Lb0
        L8a:
            java.util.List<com.mbridge.msdk.newreward.function.c.a.a> r5 = r10.f58293u
            int r5 = r5.size()
            java.util.List<com.mbridge.msdk.newreward.function.c.a.a> r6 = r10.f58293u
            java.util.Iterator r6 = r6.iterator()
            r7 = r4
        L97:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto Lac
            java.lang.Object r8 = r6.next()
            com.mbridge.msdk.newreward.function.c.a.a r8 = (com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaign) r8
            boolean r8 = r8.m50621l()
            if (r8 != 0) goto L97
            int r7 = r7 + 1
            goto L97
        Lac:
            if (r7 != r5) goto Lb0
            r5 = r3
            goto Lb1
        Lb0:
            r5 = r4
        Lb1:
            if (r0 == 0) goto Lba
            if (r1 == 0) goto Lba
            if (r2 == 0) goto Lba
            if (r5 == 0) goto Lba
            goto Lbb
        Lba:
            r3 = r4
        Lbb:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaigns.m50553z():boolean");
    }

    /* renamed from: a */
    public final void m50607a(int i) {
        this.f58271K = i;
    }

    /* renamed from: b */
    public final void m50600b(int i) {
        this.f58272L = i;
    }

    /* renamed from: c */
    public final void m50592c(String str) {
        this.f58279g = str;
    }

    /* renamed from: d */
    public final void m50588d(String str) {
        this.f58283k = str;
    }

    /* renamed from: e */
    public final void m50584e(String str) {
        this.f58284l = str;
    }

    /* renamed from: f */
    public final void m50581f(String str) {
        this.f58285m = str;
    }

    /* renamed from: g */
    public final void m50578g(String str) {
        this.f58286n = str;
    }

    /* renamed from: h */
    public final void m50575h(String str) {
        this.f58261A = str;
    }

    /* renamed from: i */
    public final void m50573i(int i) {
        this.f58262B = i;
    }

    /* renamed from: j */
    public final void m50570j(int i) {
        this.f58265E = i;
    }

    /* renamed from: k */
    public final void m50568k(int i) {
        this.f58266F = i;
    }

    /* renamed from: a */
    public final void m50605a(String str) {
        this.f58277e = str;
    }

    /* renamed from: b */
    public final void m50598b(String str) {
        this.f58278f = str;
    }

    /* renamed from: c */
    public final void m50594c(int i) {
        this.f58282j = i;
    }

    /* renamed from: d */
    public final void m50590d(int i) {
        this.f58287o = i;
    }

    /* renamed from: e */
    public final void m50586e(int i) {
        this.f58292t = i;
    }

    /* renamed from: f */
    public final void m50582f(int i) {
        this.f58296x = i;
    }

    /* renamed from: g */
    public final void m50579g(int i) {
        this.f58297y = i;
    }

    /* renamed from: h */
    public final void m50576h(int i) {
        this.f58263C = i;
    }

    /* renamed from: i */
    public final void m50572i(String str) {
        this.f58269I = str;
    }

    /* renamed from: a */
    public final void m50602a(boolean z) {
        this.f58280h = z;
    }

    /* renamed from: b */
    public final void m50599b(long j) {
        this.f58288p = j;
    }

    /* renamed from: c */
    public final void m50593c(long j) {
        this.f58289q = j;
    }

    /* renamed from: d */
    public final void m50589d(long j) {
        this.f58290r = j;
    }

    /* renamed from: e */
    public final void m50585e(long j) {
        this.f58267G = j;
    }

    /* renamed from: a */
    public final void m50606a(long j) {
        this.f58281i = j;
    }

    /* renamed from: b */
    public final void m50597b(List<CampaignEx> list) {
        this.f58264D = list;
    }

    /* renamed from: a */
    public final void m50608a(double d) {
        this.f58291s = d;
    }

    /* renamed from: b */
    public final void m50596b(boolean z) {
        this.f58270J = z;
    }

    /* renamed from: a */
    public final void m50604a(List<MBridgeCampaign> list) {
        this.f58293u = list;
    }

    /* renamed from: a */
    public final void m50603a(JSONObject jSONObject) {
        this.f58294v = jSONObject;
    }
}
