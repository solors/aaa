package com.inmobi.media;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.j */
/* loaded from: classes6.dex */
public final class C19320j {

    /* renamed from: m */
    public static final /* synthetic */ int f48370m = 0;

    /* renamed from: a */
    public final int f48371a;

    /* renamed from: b */
    public final String f48372b;

    /* renamed from: c */
    public final String f48373c;

    /* renamed from: d */
    public int f48374d;

    /* renamed from: e */
    public long f48375e;

    /* renamed from: f */
    public final long f48376f;

    /* renamed from: g */
    public final long f48377g;

    /* renamed from: h */
    public final long f48378h;

    /* renamed from: i */
    public boolean f48379i;

    /* renamed from: j */
    public String f48380j;

    /* renamed from: k */
    public long f48381k;

    /* renamed from: l */
    public byte f48382l;

    public C19320j(int i, String url, String str, int i2, long j, long j2, long j3, long j4) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f48371a = i;
        this.f48372b = url;
        this.f48373c = str;
        this.f48374d = i2;
        this.f48375e = j;
        this.f48376f = j2;
        this.f48377g = j3;
        this.f48378h = j4;
    }

    /* renamed from: a */
    public final void m60219a(byte b) {
        this.f48382l = b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19320j)) {
            return false;
        }
        return Intrinsics.m17075f(this.f48372b, ((C19320j) obj).f48372b);
    }

    public final int hashCode() {
        return this.f48372b.hashCode();
    }

    public final String toString() {
        return "AdAsset{url='" + this.f48372b + "'}";
    }

    /* renamed from: a */
    public final boolean m60220a() {
        return AbstractC19225c2.m60400a(this.f48373c) && new File(this.f48373c).exists();
    }
}
