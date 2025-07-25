package com.inmobi.media;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ga */
/* loaded from: classes6.dex */
public final class C19289ga {

    /* renamed from: a */
    public final String f48262a;

    /* renamed from: b */
    public final EnumC19247da f48263b;

    /* renamed from: c */
    public final Map f48264c;

    /* renamed from: d */
    public final Map f48265d;

    /* renamed from: e */
    public final String f48266e;

    /* renamed from: f */
    public final EnumC19261ea f48267f;

    /* renamed from: g */
    public final boolean f48268g;

    /* renamed from: h */
    public final C19275fa f48269h;

    /* renamed from: i */
    public final int f48270i;

    /* renamed from: j */
    public final int f48271j;

    /* renamed from: k */
    public final boolean f48272k;

    /* renamed from: l */
    public C18924F8 f48273l;

    /* renamed from: m */
    public int f48274m;

    public C19289ga(C19233ca c19233ca) {
        boolean z;
        int i;
        boolean z2;
        Intrinsics.checkNotNullExpressionValue(C19289ga.class.getSimpleName(), "getSimpleName(...)");
        this.f48262a = c19233ca.f48136a;
        this.f48263b = c19233ca.f48137b;
        this.f48264c = c19233ca.f48138c;
        this.f48265d = c19233ca.f48139d;
        String str = c19233ca.f48140e;
        this.f48266e = str == null ? "" : str;
        this.f48267f = EnumC19261ea.f48181a;
        Boolean bool = c19233ca.f48141f;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        this.f48268g = z;
        this.f48269h = c19233ca.f48142g;
        Integer num = c19233ca.f48143h;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 60000;
        }
        this.f48270i = i;
        Integer num2 = c19233ca.f48144i;
        this.f48271j = num2 != null ? num2.intValue() : 60000;
        Boolean bool2 = c19233ca.f48145j;
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        this.f48272k = z2;
    }

    public final String toString() {
        return "URL:" + AbstractC18910E8.m61134a(this.f48262a, this.f48265d) + " | TAG:null | METHOD:" + this.f48263b + " | PAYLOAD:" + this.f48266e + " | HEADERS:" + this.f48264c + " | RETRY_POLICY:" + this.f48269h;
    }
}
