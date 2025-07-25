package com.mbridge.msdk.foundation.p430b;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.foundation.b.c */
/* loaded from: classes6.dex */
public final class CandidateResult {

    /* renamed from: a */
    public static int f56058a = 1;

    /* renamed from: b */
    public static int f56059b = 0;

    /* renamed from: c */
    public static int f56060c = 3;

    /* renamed from: d */
    public static int f56061d = 2;

    /* renamed from: e */
    public static int f56062e = 4;

    /* renamed from: f */
    private CopyOnWriteArrayList<CampaignEx> f56063f;

    /* renamed from: g */
    private String f56064g;

    /* renamed from: h */
    private int f56065h = 21;

    /* renamed from: i */
    private int f56066i = f56059b;

    /* renamed from: j */
    private ArrayList<String> f56067j = new ArrayList<>();

    /* renamed from: k */
    private List<String> f56068k = new ArrayList();

    /* renamed from: l */
    private List<String> f56069l = new ArrayList();

    /* renamed from: m */
    private List<String> f56070m = new ArrayList();

    /* renamed from: a */
    public final CopyOnWriteArrayList<CampaignEx> m52850a() {
        return this.f56063f;
    }

    /* renamed from: b */
    public final String m52846b() {
        return this.f56064g;
    }

    /* renamed from: c */
    public final String m52844c() {
        ArrayList<String> arrayList = this.f56067j;
        return arrayList == null ? "" : arrayList.toString();
    }

    /* renamed from: d */
    public final String m52842d() {
        List<String> list = this.f56068k;
        return list == null ? "" : list.toString();
    }

    /* renamed from: e */
    public final String m52840e() {
        List<String> list = this.f56069l;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    /* renamed from: f */
    public final String m52839f() {
        List<String> list = this.f56070m;
        if (list == null) {
            return "";
        }
        return list.toString();
    }

    /* renamed from: g */
    public final int m52838g() {
        return this.f56066i;
    }

    /* renamed from: a */
    public final void m52847a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f56063f = copyOnWriteArrayList;
    }

    /* renamed from: b */
    public final void m52845b(String str) {
        try {
            List<String> list = this.f56068k;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m52848a(String str) {
        try {
            ArrayList<String> arrayList = this.f56067j;
            if (arrayList != null) {
                arrayList.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: c */
    public final void m52843c(String str) {
        try {
            List<String> list = this.f56069l;
            if (list != null) {
                list.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public final void m52841d(String str) {
        this.f56064g = str;
    }

    /* renamed from: a */
    public final void m52849a(int i) {
        this.f56066i = i;
    }
}
