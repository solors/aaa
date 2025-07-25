package com.mbridge.msdk.newreward.function.p482a;

import com.mbridge.msdk.newreward.function.p485c.p486a.MBridgeCampaigns;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CandidateResult.java */
/* renamed from: com.mbridge.msdk.newreward.function.a.b */
/* loaded from: classes6.dex */
public final class C22344b {

    /* renamed from: a */
    public static int f58232a = 1;

    /* renamed from: b */
    public static int f58233b = 0;

    /* renamed from: c */
    public static int f58234c = 3;

    /* renamed from: d */
    public static int f58235d = 2;

    /* renamed from: e */
    public static int f58236e = 4;

    /* renamed from: f */
    private MBridgeCampaigns f58237f;

    /* renamed from: g */
    private String f58238g;

    /* renamed from: h */
    private int f58239h = 21;

    /* renamed from: i */
    private int f58240i = f58233b;

    /* renamed from: j */
    private ArrayList<String> f58241j = new ArrayList<>();

    /* renamed from: k */
    private List<String> f58242k = new ArrayList();

    /* renamed from: l */
    private List<String> f58243l = new ArrayList();

    /* renamed from: m */
    private List<String> f58244m = new ArrayList();

    /* renamed from: a */
    public final MBridgeCampaigns m50658a() {
        return this.f58237f;
    }

    /* renamed from: b */
    public final String m50654b() {
        return this.f58238g;
    }

    /* renamed from: c */
    public final String m50652c() {
        ArrayList<String> arrayList = this.f58241j;
        return arrayList == null ? "" : arrayList.toString();
    }

    /* renamed from: d */
    public final String m50650d() {
        List<String> list = this.f58242k;
        return list == null ? "" : list.toString();
    }

    /* renamed from: e */
    public final String m50648e() {
        List<String> list = this.f58243l;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    /* renamed from: f */
    public final String m50647f() {
        List<String> list = this.f58244m;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    /* renamed from: g */
    public final int m50646g() {
        return this.f58239h;
    }

    /* renamed from: h */
    public final int m50645h() {
        return this.f58240i;
    }

    /* renamed from: a */
    public final void m50656a(MBridgeCampaigns mBridgeCampaigns) {
        this.f58237f = mBridgeCampaigns;
    }

    /* renamed from: b */
    public final void m50653b(String str) {
        try {
            List<String> list = this.f58242k;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m50655a(String str) {
        try {
            ArrayList<String> arrayList = this.f58241j;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public final void m50651c(String str) {
        try {
            List<String> list = this.f58243l;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public final void m50649d(String str) {
        this.f58238g = str;
    }

    /* renamed from: a */
    public final void m50657a(int i) {
        this.f58240i = i;
    }
}
