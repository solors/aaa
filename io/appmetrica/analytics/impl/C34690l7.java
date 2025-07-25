package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.l7 */
/* loaded from: classes9.dex */
public final class C34690l7 implements Converter {

    /* renamed from: a */
    public final C33944Hd f94817a;

    public C34690l7() {
        this(null, 1, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C34798p7 fromModel(@NotNull C34663k7 c34663k7) {
        C34798p7 c34798p7 = new C34798p7();
        Boolean bool = c34663k7.f94766a;
        if (bool != null) {
            c34798p7.f95154a = this.f94817a.fromModel(Boolean.valueOf(bool.booleanValue())).intValue();
        }
        Double d = c34663k7.f94768c;
        if (d != null) {
            c34798p7.f95156c = d.doubleValue();
        }
        Double d2 = c34663k7.f94767b;
        if (d2 != null) {
            c34798p7.f95155b = d2.doubleValue();
        }
        Long l = c34663k7.f94773h;
        if (l != null) {
            c34798p7.f95161h = l.longValue();
        }
        Integer num = c34663k7.f94771f;
        if (num != null) {
            c34798p7.f95159f = num.intValue();
        }
        Integer num2 = c34663k7.f94770e;
        if (num2 != null) {
            c34798p7.f95158e = num2.intValue();
        }
        Integer num3 = c34663k7.f94772g;
        if (num3 != null) {
            c34798p7.f95160g = num3.intValue();
        }
        Integer num4 = c34663k7.f94769d;
        if (num4 != null) {
            c34798p7.f95157d = num4.intValue();
        }
        String str = c34663k7.f94774i;
        if (str != null) {
            c34798p7.f95162i = str;
        }
        String str2 = c34663k7.f94775j;
        if (str2 != null) {
            c34798p7.f95163j = str2;
        }
        return c34798p7;
    }

    public C34690l7(@NotNull C33944Hd c33944Hd) {
        this.f94817a = c33944Hd;
    }

    public /* synthetic */ C34690l7(C33944Hd c33944Hd, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C33944Hd() : c33944Hd);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C34663k7 toModel(@Nullable C34798p7 c34798p7) {
        if (c34798p7 == null) {
            return new C34663k7(null, null, null, null, null, null, null, null, null, null);
        }
        C34798p7 c34798p72 = new C34798p7();
        Boolean m22565a = this.f94817a.m22565a(c34798p7.f95154a);
        Double valueOf = Double.valueOf(c34798p7.f95156c);
        if (!(!(valueOf.doubleValue() == c34798p72.f95156c))) {
            valueOf = null;
        }
        Double valueOf2 = Double.valueOf(c34798p7.f95155b);
        if (!(!(valueOf2.doubleValue() == c34798p72.f95155b))) {
            valueOf2 = null;
        }
        Long valueOf3 = Long.valueOf(c34798p7.f95161h);
        Long l = valueOf3.longValue() != c34798p72.f95161h ? valueOf3 : null;
        Integer valueOf4 = Integer.valueOf(c34798p7.f95159f);
        Integer num = valueOf4.intValue() != c34798p72.f95159f ? valueOf4 : null;
        Integer valueOf5 = Integer.valueOf(c34798p7.f95158e);
        Integer num2 = valueOf5.intValue() != c34798p72.f95158e ? valueOf5 : null;
        Integer valueOf6 = Integer.valueOf(c34798p7.f95160g);
        Integer num3 = valueOf6.intValue() != c34798p72.f95160g ? valueOf6 : null;
        Integer valueOf7 = Integer.valueOf(c34798p7.f95157d);
        Integer num4 = valueOf7.intValue() != c34798p72.f95157d ? valueOf7 : null;
        String str = c34798p7.f95162i;
        String str2 = Intrinsics.m17075f(str, c34798p72.f95162i) ^ true ? str : null;
        String str3 = c34798p7.f95163j;
        return new C34663k7(m22565a, valueOf2, valueOf, num4, num2, num, num3, l, str2, Intrinsics.m17075f(str3, c34798p72.f95163j) ^ true ? str3 : null);
    }
}
