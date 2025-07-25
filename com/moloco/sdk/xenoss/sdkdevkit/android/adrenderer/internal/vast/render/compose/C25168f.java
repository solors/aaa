package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.f */
/* loaded from: classes7.dex */
public final class C25168f {
    @Nullable

    /* renamed from: a */
    public final Functions<Unit> f65245a;
    @Nullable

    /* renamed from: b */
    public final Functions<Unit> f65246b;
    @Nullable

    /* renamed from: c */
    public final Functions<Unit> f65247c;

    public C25168f() {
        this(null, null, null, 7, null);
    }

    @Nullable
    /* renamed from: a */
    public final Functions<Unit> m45037a() {
        return this.f65246b;
    }

    @Nullable
    /* renamed from: b */
    public final Functions<Unit> m45036b() {
        return this.f65247c;
    }

    @Nullable
    /* renamed from: c */
    public final Functions<Unit> m45035c() {
        return this.f65245a;
    }

    public C25168f(@Nullable Functions<Unit> functions, @Nullable Functions<Unit> functions2, @Nullable Functions<Unit> functions3) {
        this.f65245a = functions;
        this.f65246b = functions2;
        this.f65247c = functions3;
    }

    public /* synthetic */ C25168f(Functions functions, Functions functions2, Functions functions3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : functions, (i & 2) != 0 ? null : functions2, (i & 4) != 0 ? null : functions3);
    }
}
