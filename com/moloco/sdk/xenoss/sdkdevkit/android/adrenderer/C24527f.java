package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f */
/* loaded from: classes7.dex */
public final class C24527f {
    @NotNull

    /* renamed from: a */
    public final C25380q f63277a;
    @NotNull

    /* renamed from: b */
    public final C24524d f63278b;
    @NotNull

    /* renamed from: c */
    public final C24524d f63279c;

    public C24527f(@NotNull C25380q vastOptions, @NotNull C24524d mraidOptions, @NotNull C24524d staticOptions) {
        Intrinsics.checkNotNullParameter(vastOptions, "vastOptions");
        Intrinsics.checkNotNullParameter(mraidOptions, "mraidOptions");
        Intrinsics.checkNotNullParameter(staticOptions, "staticOptions");
        this.f63277a = vastOptions;
        this.f63278b = mraidOptions;
        this.f63279c = staticOptions;
    }

    @NotNull
    /* renamed from: a */
    public final C24524d m46198a() {
        return this.f63278b;
    }

    @NotNull
    /* renamed from: b */
    public final C24524d m46197b() {
        return this.f63279c;
    }

    @NotNull
    /* renamed from: c */
    public final C25380q m46196c() {
        return this.f63277a;
    }
}
