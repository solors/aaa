package com.yandex.mobile.ads.impl;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharJVM;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class in1 {
    @NotNull

    /* renamed from: a */
    private final DecimalFormat f80567a;

    public in1() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.f80567a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }

    @NotNull
    /* renamed from: a */
    public final String m33161a(@NotNull String value) throws i31 {
        boolean m16779b;
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < value.length(); i++) {
                char charAt = value.charAt(i);
                m16779b = CharJVM.m16779b(charAt);
                if (!m16779b) {
                    sb2.append(charAt);
                }
            }
            String sb3 = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
            String format = this.f80567a.format(Long.parseLong(sb3));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        } catch (NumberFormatException e) {
            C37612s0 c37612s0 = C37612s0.f99333a;
            Intrinsics.checkNotNullExpressionValue(String.format("Could not parse review count value. Review Count value is %s", Arrays.copyOf(new Object[]{value}, 1)), "format(...)");
            Object[] args = {e};
            int i2 = um0.f86330b;
            Intrinsics.checkNotNullParameter(args, "args");
            throw new i31("Native Ad json has not required attributes");
        }
    }
}
