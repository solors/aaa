package com.mbridge.msdk.foundation.p430b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameBase64Tool;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.foundation.b.b */
/* loaded from: classes6.dex */
public final class CandidateEntity {

    /* renamed from: a */
    private CopyOnWriteArrayList<CampaignEx> f56048a;

    /* renamed from: b */
    private double f56049b;

    /* renamed from: c */
    private String f56050c;

    /* renamed from: d */
    private String f56051d;

    /* renamed from: e */
    private int f56052e;

    /* renamed from: f */
    private long f56053f;

    /* renamed from: g */
    private int f56054g;

    /* renamed from: h */
    private long f56055h;

    /* renamed from: i */
    private String f56056i;

    /* renamed from: j */
    private long f56057j;

    /* renamed from: a */
    public final long m52868a() {
        return this.f56057j;
    }

    /* renamed from: b */
    public final CopyOnWriteArrayList<CampaignEx> m52863b() {
        return this.f56048a;
    }

    /* renamed from: c */
    public final double m52859c() {
        return this.f56049b;
    }

    /* renamed from: d */
    public final String m52856d() {
        return this.f56050c;
    }

    /* renamed from: e */
    public final String m52854e() {
        return this.f56051d;
    }

    /* renamed from: f */
    public final int m52853f() {
        return this.f56052e;
    }

    /* renamed from: g */
    public final int m52852g() {
        return this.f56054g;
    }

    /* renamed from: h */
    public final long m52851h() {
        return this.f56055h;
    }

    /* renamed from: a */
    public final void m52866a(long j) {
        this.f56057j = j;
    }

    /* renamed from: b */
    public final void m52860b(String str) {
        this.f56050c = str;
    }

    /* renamed from: c */
    public final void m52857c(String str) {
        this.f56051d = str;
    }

    /* renamed from: d */
    public final void m52855d(String str) {
        this.f56056i = str;
    }

    /* renamed from: a */
    public final void m52864a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f56048a = copyOnWriteArrayList;
    }

    /* renamed from: b */
    public final void m52862b(int i) {
        this.f56054g = i;
    }

    /* renamed from: c */
    public final void m52858c(long j) {
        this.f56053f = j;
    }

    /* renamed from: a */
    public final void m52865a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String m51603a = SameBase64Tool.m51603a(str);
        if (TextUtils.isEmpty(m51603a)) {
            return;
        }
        try {
            double parseDouble = Double.parseDouble(m51603a);
            if (parseDouble <= 0.0d) {
                return;
            }
            this.f56049b = parseDouble;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void m52861b(long j) {
        this.f56055h = j;
    }

    /* renamed from: a */
    public final void m52867a(int i) {
        this.f56052e = i;
    }
}
