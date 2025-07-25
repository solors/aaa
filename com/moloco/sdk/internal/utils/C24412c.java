package com.moloco.sdk.internal.utils;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.internal.utils.c */
/* loaded from: classes7.dex */
public final class C24412c {
    @NotNull
    /* renamed from: a */
    public static final String m46482a(@NotNull String substituteCountDownTimeLeftMacro, int i) {
        String m16628I;
        Intrinsics.checkNotNullParameter(substituteCountDownTimeLeftMacro, "$this$substituteCountDownTimeLeftMacro");
        m16628I = StringsJVM.m16628I(substituteCountDownTimeLeftMacro, "[SECONDS_LEFT]", C24410a.m46484a(i), false, 4, null);
        return m16628I;
    }

    @NotNull
    /* renamed from: b */
    public static final String m46481b(@NotNull String str, long j) {
        String m16628I;
        Intrinsics.checkNotNullParameter(str, "<this>");
        m16628I = StringsJVM.m16628I(str, "[HAPPENED_AT_TS]", String.valueOf(j), false, 4, null);
        return m16628I;
    }

    @NotNull
    /* renamed from: c */
    public static final String m46480c(@NotNull String str, @NotNull String errorCode) {
        String m16628I;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        m16628I = StringsJVM.m16628I(str, "[ERROR_CODE]", errorCode, false, 4, null);
        return m16628I;
    }

    @NotNull
    /* renamed from: d */
    public static final String m46479d(@NotNull String str, @NotNull String errorCode, long j) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        return m46481b(m46480c(str, errorCode), j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0007, code lost:
        r8 = kotlin.text.StringsJVM.m16628I(r7, "[MTID]", r8, false, 4, null);
     */
    @org.jetbrains.annotations.NotNull
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String m46478e(@org.jetbrains.annotations.NotNull java.lang.String r7, @org.jetbrains.annotations.Nullable java.lang.String r8) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            if (r8 == 0) goto L16
            java.lang.String r2 = "[MTID]"
            r4 = 0
            r5 = 4
            r6 = 0
            r1 = r7
            r3 = r8
            java.lang.String r8 = kotlin.text.C37686h.m16718I(r1, r2, r3, r4, r5, r6)
            if (r8 != 0) goto L15
            goto L16
        L15:
            r7 = r8
        L16:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.utils.C24412c.m46478e(java.lang.String, java.lang.String):java.lang.String");
    }
}
