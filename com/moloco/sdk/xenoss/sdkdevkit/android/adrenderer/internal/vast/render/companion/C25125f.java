package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.InterfaceC25243d;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f */
/* loaded from: classes7.dex */
public final class C25125f {
    @NotNull
    /* renamed from: a */
    public static final InterfaceC25120d m45105a(int i, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        return new C25121e(i, scope, null);
    }

    /* renamed from: c */
    public static final InterfaceC25243d.AbstractC25244a m45103c(int i) {
        if (i == 0) {
            return InterfaceC25243d.AbstractC25244a.C25245a.f65536a;
        }
        return new InterfaceC25243d.AbstractC25244a.C25246b(i, null);
    }
}
