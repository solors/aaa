package com.ironsource;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: com.ironsource.h5 */
/* loaded from: classes6.dex */
public class C20028h5 {

    /* renamed from: a */
    private boolean f50352a;

    /* renamed from: b */
    private String f50353b;

    /* renamed from: c */
    private String f50354c;

    /* renamed from: d */
    private String f50355d;

    /* renamed from: e */
    private int f50356e;

    /* renamed from: f */
    private int f50357f;

    /* renamed from: g */
    private int f50358g;

    /* renamed from: h */
    private long f50359h;

    /* renamed from: i */
    private long f50360i;

    /* renamed from: j */
    private long f50361j;

    /* renamed from: k */
    private long f50362k;

    /* renamed from: l */
    private long f50363l;

    /* renamed from: m */
    private boolean f50364m;

    /* renamed from: n */
    private ArrayList<String> f50365n;

    /* renamed from: o */
    private boolean f50366o;

    /* renamed from: p */
    private boolean f50367p;

    /* renamed from: q */
    private int f50368q;

    /* renamed from: r */
    private boolean f50369r;

    public C20028h5() {
        this.f50353b = "";
        this.f50354c = "";
        this.f50355d = "";
        this.f50360i = 0L;
        this.f50361j = 0L;
        this.f50362k = 0L;
        this.f50363l = 0L;
        this.f50364m = true;
        this.f50365n = new ArrayList<>();
        this.f50358g = 0;
        this.f50366o = false;
        this.f50367p = false;
        this.f50368q = 1;
    }

    /* renamed from: a */
    public String m58300a() {
        return this.f50353b;
    }

    /* renamed from: b */
    public long m58297b() {
        return this.f50361j;
    }

    /* renamed from: c */
    public int m58296c() {
        return this.f50357f;
    }

    /* renamed from: d */
    public int m58295d() {
        return this.f50368q;
    }

    /* renamed from: e */
    public boolean m58294e() {
        return this.f50364m;
    }

    /* renamed from: f */
    public ArrayList<String> m58293f() {
        return this.f50365n;
    }

    /* renamed from: g */
    public int m58292g() {
        return this.f50356e;
    }

    /* renamed from: h */
    public boolean m58291h() {
        return this.f50352a;
    }

    /* renamed from: i */
    public int m58290i() {
        return this.f50358g;
    }

    /* renamed from: j */
    public long m58289j() {
        return this.f50362k;
    }

    /* renamed from: k */
    public long m58288k() {
        return this.f50360i;
    }

    /* renamed from: l */
    public long m58287l() {
        return this.f50363l;
    }

    /* renamed from: m */
    public long m58286m() {
        return this.f50359h;
    }

    /* renamed from: n */
    public boolean m58285n() {
        return this.f50366o;
    }

    /* renamed from: o */
    public boolean m58284o() {
        return this.f50367p;
    }

    /* renamed from: p */
    public boolean m58283p() {
        return this.f50369r;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C20028h5(String str, String str2, String str3, int i, int i2, long j, long j2, long j3, long j4, long j5, boolean z, int i3, boolean z2, boolean z3, boolean z4, int i4, boolean z5) {
        this.f50353b = str;
        this.f50354c = str2;
        this.f50355d = str3;
        this.f50356e = i;
        this.f50357f = i2;
        this.f50359h = j;
        this.f50352a = z4;
        this.f50360i = j2;
        this.f50361j = j3;
        this.f50362k = j4;
        this.f50363l = j5;
        this.f50364m = z;
        this.f50358g = i3;
        this.f50365n = new ArrayList<>();
        this.f50366o = z2;
        this.f50367p = z3;
        this.f50368q = i4;
        this.f50369r = z5;
    }

    /* renamed from: a */
    public String m58298a(boolean z) {
        return z ? this.f50355d : this.f50354c;
    }

    /* renamed from: a */
    public void m58299a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f50365n.add(str);
    }
}
