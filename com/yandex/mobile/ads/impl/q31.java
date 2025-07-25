package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class q31 {
    @NotNull

    /* renamed from: a */
    private final a21 f84222a;

    public /* synthetic */ q31() {
        this(new a21());
    }

    @NotNull
    /* renamed from: b */
    public static ArrayList m30479b(@NotNull n31 responseBody) {
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        List<z01> m31672e = responseBody.m31672e();
        if (m31672e == null) {
            m31672e = new ArrayList<>();
        }
        ArrayList arrayList = new ArrayList();
        for (z01 z01Var : m31672e) {
            String m26494a = z01Var.m26494a();
            if (m26494a != null) {
                arrayList.add(m26494a);
            }
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: c */
    public static ArrayList m30478c(@NotNull n31 responseBody) {
        int m17154x;
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        List<z01> m31672e = responseBody.m31672e();
        if (m31672e == null) {
            m31672e = new ArrayList<>();
        }
        m17154x = C37566w.m17154x(m31672e, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (z01 z01Var : m31672e) {
            arrayList.add(z01Var.m26487g().m27455a());
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: a */
    public final List<String> m30480a(@NotNull n31 responseBody) {
        int m17154x;
        List<String> m17152z;
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        List<z01> m31672e = responseBody.m31672e();
        if (m31672e == null) {
            m31672e = new ArrayList<>();
        }
        m17154x = C37566w.m17154x(m31672e, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (z01 z01Var : m31672e) {
            arrayList.add(this.f84222a.m36009a(z01Var));
        }
        m17152z = C37566w.m17152z(arrayList);
        return m17152z;
    }

    public q31(@NotNull a21 nativeAdDataExtractor) {
        Intrinsics.checkNotNullParameter(nativeAdDataExtractor, "nativeAdDataExtractor");
        this.f84222a = nativeAdDataExtractor;
    }
}
