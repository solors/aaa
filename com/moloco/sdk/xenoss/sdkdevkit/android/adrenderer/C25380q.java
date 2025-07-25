package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.C25184k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p547ad.InterfaceC25096i;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q */
/* loaded from: classes7.dex */
public final class C25380q {

    /* renamed from: a */
    public final boolean f65923a;
    @Nullable

    /* renamed from: b */
    public final Boolean f65924b;

    /* renamed from: c */
    public final int f65925c;

    /* renamed from: d */
    public final int f65926d;

    /* renamed from: e */
    public final int f65927e;

    /* renamed from: f */
    public final boolean f65928f;

    /* renamed from: g */
    public final boolean f65929g;
    @NotNull

    /* renamed from: h */
    public final Function2<Context, InterfaceC25096i, View> f65930h;

    public C25380q() {
        this(false, null, 0, 0, 0, false, false, null, 255, null);
    }

    /* renamed from: a */
    public final boolean m44651a() {
        return this.f65929g;
    }

    /* renamed from: b */
    public final boolean m44650b() {
        return this.f65928f;
    }

    /* renamed from: c */
    public final int m44649c() {
        return this.f65926d;
    }

    /* renamed from: d */
    public final int m44648d() {
        return this.f65927e;
    }

    @Nullable
    /* renamed from: e */
    public final Boolean m44647e() {
        return this.f65924b;
    }

    /* renamed from: f */
    public final int m44646f() {
        return this.f65925c;
    }

    /* renamed from: g */
    public final boolean m44645g() {
        return this.f65923a;
    }

    @NotNull
    /* renamed from: h */
    public final Function2<Context, InterfaceC25096i, View> m44644h() {
        return this.f65930h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C25380q(boolean z, @Nullable Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, @NotNull Function2<? super Context, ? super InterfaceC25096i, ? extends View> VastRenderer) {
        Intrinsics.checkNotNullParameter(VastRenderer, "VastRenderer");
        this.f65923a = z;
        this.f65924b = bool;
        this.f65925c = i;
        this.f65926d = i2;
        this.f65927e = i3;
        this.f65928f = z2;
        this.f65929g = z3;
        this.f65930h = VastRenderer;
    }

    public /* synthetic */ C25380q(boolean z, Boolean bool, int i, int i2, int i3, boolean z2, boolean z3, Function2 function2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? true : z, (i4 & 2) != 0 ? null : bool, (i4 & 4) != 0 ? 5 : i, (i4 & 8) != 0 ? 5 : i2, (i4 & 16) == 0 ? i3 : 5, (i4 & 32) != 0 ? false : z2, (i4 & 64) == 0 ? z3 : false, (i4 & 128) != 0 ? C25184k.m45011c(0L, null, null, null, null, null, null, null, null, null, 1023, null) : function2);
    }
}
