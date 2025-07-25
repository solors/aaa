package com.mbridge.msdk.click.p414a;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* renamed from: com.mbridge.msdk.click.a.b */
/* loaded from: classes6.dex */
public final class RetryUrlRecordData {

    /* renamed from: a */
    public static int f55336a = 0;

    /* renamed from: b */
    public static int f55337b = 1;

    /* renamed from: c */
    private String f55338c;

    /* renamed from: d */
    private int f55339d;

    /* renamed from: e */
    private HashSet<String> f55340e = new HashSet<>();

    /* renamed from: f */
    private long f55341f = System.currentTimeMillis();

    /* renamed from: g */
    private CampaignEx f55342g;

    /* renamed from: h */
    private String f55343h;

    /* renamed from: i */
    private int f55344i;

    /* renamed from: j */
    private boolean f55345j;

    /* renamed from: k */
    private boolean f55346k;

    /* renamed from: l */
    private int f55347l;

    public RetryUrlRecordData(String str, String str2) {
        this.f55338c = str;
        m53190b(str2);
    }

    /* renamed from: a */
    public final boolean m53197a() {
        return this.f55345j;
    }

    /* renamed from: b */
    public final boolean m53192b() {
        return this.f55346k;
    }

    /* renamed from: c */
    public final int m53188c() {
        return this.f55347l;
    }

    /* renamed from: d */
    public final int m53187d() {
        return this.f55344i;
    }

    /* renamed from: e */
    public final String m53186e() {
        return this.f55343h;
    }

    /* renamed from: f */
    public final CampaignEx m53185f() {
        return this.f55342g;
    }

    /* renamed from: g */
    public final String m53184g() {
        return this.f55338c;
    }

    /* renamed from: h */
    public final int m53183h() {
        return this.f55339d;
    }

    /* renamed from: i */
    public final HashSet<String> m53182i() {
        return this.f55340e;
    }

    /* renamed from: j */
    public final long m53181j() {
        return this.f55341f;
    }

    /* renamed from: a */
    public final void m53193a(boolean z) {
        this.f55345j = z;
    }

    /* renamed from: b */
    public final void m53189b(boolean z) {
        this.f55346k = z;
    }

    /* renamed from: a */
    public final void m53196a(int i) {
        this.f55347l = i;
    }

    /* renamed from: b */
    public final void m53191b(int i) {
        this.f55344i = i;
    }

    /* renamed from: a */
    public final void m53194a(String str) {
        this.f55343h = str;
    }

    /* renamed from: b */
    public final void m53190b(String str) {
        this.f55339d++;
        this.f55340e.add(str);
    }

    /* renamed from: a */
    public final void m53195a(CampaignEx campaignEx) {
        this.f55342g = campaignEx;
    }
}
