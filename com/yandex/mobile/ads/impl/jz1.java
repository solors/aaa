package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.mz1;
import java.util.logging.Logger;
import kotlin.jvm.internal.C37612s0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class jz1 {
    /* renamed from: a */
    public static final /* synthetic */ void m32694a(iz1 iz1Var, lz1 lz1Var, String str) {
        m32693b(iz1Var, lz1Var, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m32693b(iz1 iz1Var, lz1 lz1Var, String str) {
        mz1 mz1Var = mz1.f82495h;
        Logger m31725a = mz1.C30893b.m31725a();
        String m32176f = lz1Var.m32176f();
        C37612s0 c37612s0 = C37612s0.f99333a;
        String m28089a = C31714w0.m28089a(new Object[]{str}, 1, "%-22s", "format(...)");
        String m33085b = iz1Var.m33085b();
        m31725a.fine(m32176f + " " + m28089a + ": " + m33085b);
    }

    @NotNull
    /* renamed from: a */
    public static final String m32695a(long j) {
        String str;
        if (j <= -999500000) {
            str = ((j - 500000000) / 1000000000) + " s ";
        } else if (j <= -999500) {
            str = ((j - 500000) / 1000000) + " ms";
        } else if (j <= 0) {
            str = ((j - 500) / 1000) + " µs";
        } else if (j < 999500) {
            str = ((j + 500) / 1000) + " µs";
        } else if (j < 999500000) {
            str = ((j + 500000) / 1000000) + " ms";
        } else {
            str = ((j + 500000000) / 1000000000) + " s ";
        }
        C37612s0 c37612s0 = C37612s0.f99333a;
        return C31714w0.m28089a(new Object[]{str}, 1, "%6s", "format(...)");
    }
}
