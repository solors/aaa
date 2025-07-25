package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import kotlin.Tuples;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges._Ranges;
import org.jetbrains.annotations.NotNull;
import p804nd.C38513v;
import td.C44401b;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.yandex.mobile.ads.impl.x7 */
/* loaded from: classes8.dex */
public final class EnumC31799x7 {
    @NotNull

    /* renamed from: b */
    public static final C31800a f87570b;
    @NotNull

    /* renamed from: c */
    private static final Map<String, Integer> f87571c;

    /* renamed from: d */
    public static final EnumC31799x7 f87572d;

    /* renamed from: e */
    public static final EnumC31799x7 f87573e;

    /* renamed from: f */
    public static final EnumC31799x7 f87574f;

    /* renamed from: g */
    private static final /* synthetic */ EnumC31799x7[] f87575g;

    /* renamed from: com.yandex.mobile.ads.impl.x7$a */
    /* loaded from: classes8.dex */
    public static final class C31800a {
        private C31800a() {
        }

        @NotNull
        /* renamed from: a */
        public static String m27644a(@NotNull String template, @NotNull String resource) {
            Intrinsics.checkNotNullParameter(template, "template");
            Intrinsics.checkNotNullParameter(resource, "resource");
            C37612s0 c37612s0 = C37612s0.f99333a;
            String format = String.format(Locale.US, template, Arrays.copyOf(new Object[]{resource}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }

        public /* synthetic */ C31800a(int i) {
            this();
        }
    }

    static {
        Map<String, Integer> m17279o;
        EnumC31799x7 enumC31799x7 = new EnumC31799x7(0, "BROWSER_CONTROL_PANEL_HEIGHT");
        f87572d = enumC31799x7;
        EnumC31799x7 enumC31799x72 = new EnumC31799x7(1, "BROWSER_CONTROL_PANEL_BUTTON_PADDING");
        f87573e = enumC31799x72;
        EnumC31799x7 enumC31799x73 = new EnumC31799x7(2, "BROWSER_CONTROL_PANEL_TITLE_TEXT_SIZE");
        f87574f = enumC31799x73;
        EnumC31799x7[] enumC31799x7Arr = {enumC31799x7, enumC31799x72, enumC31799x73};
        f87575g = enumC31799x7Arr;
        C44401b.m3113a(enumC31799x7Arr);
        f87570b = new C31800a(0);
        Intrinsics.checkNotNullParameter("values_dimen_%s", "template");
        Tuples m14532a = C38513v.m14532a(C31800a.m27644a("values_dimen_%s", enumC31799x7.name()), 48);
        Intrinsics.checkNotNullParameter("values_dimen_%s_sw600dp", "template");
        Tuples m14532a2 = C38513v.m14532a(C31800a.m27644a("values_dimen_%s_sw600dp", enumC31799x7.name()), 56);
        Intrinsics.checkNotNullParameter("values_dimen_%s", "template");
        Tuples m14532a3 = C38513v.m14532a(C31800a.m27644a("values_dimen_%s", enumC31799x72.name()), 15);
        Intrinsics.checkNotNullParameter("values_dimen_%s_sw600dp", "template");
        Tuples m14532a4 = C38513v.m14532a(C31800a.m27644a("values_dimen_%s_sw600dp", enumC31799x72.name()), 17);
        Intrinsics.checkNotNullParameter("values_dimen_%s", "template");
        Tuples m14532a5 = C38513v.m14532a(C31800a.m27644a("values_dimen_%s", enumC31799x73.name()), 19);
        Intrinsics.checkNotNullParameter("values_dimen_%s_sw600dp", "template");
        m17279o = C37559r0.m17279o(m14532a, m14532a2, m14532a3, m14532a4, m14532a5, C38513v.m14532a(C31800a.m27644a("values_dimen_%s_sw600dp", enumC31799x73.name()), 23));
        f87571c = m17279o;
    }

    private EnumC31799x7(int i, String str) {
    }

    public static EnumC31799x7 valueOf(String str) {
        return (EnumC31799x7) Enum.valueOf(EnumC31799x7.class, str);
    }

    public static EnumC31799x7[] values() {
        return (EnumC31799x7[]) f87575g.clone();
    }

    /* renamed from: a */
    public final int m27646a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            C31800a c31800a = f87570b;
            String resourceId = m27645b(context);
            c31800a.getClass();
            Intrinsics.checkNotNullParameter(resourceId, "resourceId");
            Integer num = f87571c.get(C31800a.m27644a("values_dimen_%s", resourceId));
            if (num != null) {
                return num.intValue();
            }
        } catch (Exception unused) {
        }
        try {
            C31800a c31800a2 = f87570b;
            String resourceId2 = name();
            c31800a2.getClass();
            Intrinsics.checkNotNullParameter(resourceId2, "resourceId");
            Integer num2 = f87571c.get(C31800a.m27644a("values_dimen_%s", resourceId2));
            if (num2 != null) {
                return num2.intValue();
            }
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    @NotNull
    /* renamed from: b */
    public final String m27645b(@NotNull Context context) {
        int m16912j;
        Intrinsics.checkNotNullParameter(context, "context");
        StringBuilder sb2 = new StringBuilder(name());
        int i = cc2.f77597b;
        Intrinsics.checkNotNullParameter(context, "context");
        m16912j = _Ranges.m16912j(cc2.m35252c(context), cc2.m35254b(context));
        if (m16912j >= 600) {
            sb2.append("_sw600dp");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    @Override // java.lang.Enum
    @NotNull
    public final String toString() {
        return name();
    }
}
