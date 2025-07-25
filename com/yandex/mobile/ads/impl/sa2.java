package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import td.C44401b;

/* loaded from: classes8.dex */
public interface sa2 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.yandex.mobile.ads.impl.sa2$a */
    /* loaded from: classes8.dex */
    public static final class EnumC31344a {

        /* renamed from: b */
        public static final EnumC31344a f85162b;

        /* renamed from: c */
        public static final EnumC31344a f85163c;

        /* renamed from: d */
        public static final EnumC31344a f85164d;

        /* renamed from: e */
        private static final /* synthetic */ EnumC31344a[] f85165e;

        static {
            EnumC31344a enumC31344a = new EnumC31344a(0, "FIRST_QUARTILE");
            f85162b = enumC31344a;
            EnumC31344a enumC31344a2 = new EnumC31344a(1, "MIDPOINT");
            f85163c = enumC31344a2;
            EnumC31344a enumC31344a3 = new EnumC31344a(2, "THIRD_QUARTILE");
            f85164d = enumC31344a3;
            EnumC31344a[] enumC31344aArr = {enumC31344a, enumC31344a2, enumC31344a3};
            f85165e = enumC31344aArr;
            C44401b.m3113a(enumC31344aArr);
        }

        private EnumC31344a(int i, String str) {
        }

        public static EnumC31344a valueOf(String str) {
            return (EnumC31344a) Enum.valueOf(EnumC31344a.class, str);
        }

        public static EnumC31344a[] values() {
            return (EnumC31344a[]) f85165e.clone();
        }
    }

    /* renamed from: a */
    void mo29047a();

    /* renamed from: a */
    void mo29046a(float f);

    /* renamed from: a */
    void mo29045a(float f, long j);

    /* renamed from: a */
    void mo29044a(@NotNull View view, @NotNull List<k62> list);

    /* renamed from: a */
    void mo29043a(@NotNull g72 g72Var);

    /* renamed from: a */
    void mo29042a(@NotNull EnumC31344a enumC31344a);

    /* renamed from: a */
    void mo29041a(@NotNull String str);

    /* renamed from: b */
    void mo29040b();

    /* renamed from: c */
    void mo29039c();

    /* renamed from: d */
    void mo29038d();

    /* renamed from: e */
    void mo29037e();

    /* renamed from: f */
    void mo29036f();

    /* renamed from: g */
    void mo29035g();

    /* renamed from: h */
    void mo29034h();

    /* renamed from: i */
    void mo29033i();

    /* renamed from: j */
    void mo29032j();

    /* renamed from: k */
    void mo29031k();

    /* renamed from: l */
    void mo29030l();

    /* renamed from: m */
    void mo29029m();

    /* renamed from: n */
    void mo29028n();
}
