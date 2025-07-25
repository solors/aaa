package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.x */
/* loaded from: classes7.dex */
public final class C25360x {
    @NotNull

    /* renamed from: a */
    public static final C25360x f65894a = new C25360x();
    @NotNull

    /* renamed from: b */
    public static final Map<Integer, C24567d> f65895b = new LinkedHashMap();

    /* renamed from: c */
    public static final int f65896c = 8;

    /* renamed from: a */
    public final int m44680a(@NotNull C24567d wv) {
        Intrinsics.checkNotNullParameter(wv, "wv");
        int hashCode = wv.hashCode();
        f65895b.put(Integer.valueOf(hashCode), wv);
        return hashCode;
    }

    /* renamed from: c */
    public final void m44678c(int i) {
        f65895b.remove(Integer.valueOf(i));
    }
}
