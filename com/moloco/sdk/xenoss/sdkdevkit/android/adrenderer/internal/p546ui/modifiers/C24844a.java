package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p546ui.modifiers;

import android.annotation.SuppressLint;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.layout.LayoutCoordinates;
import androidx.compose.p015ui.layout.OnGloballyPositionedModifierKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p546ui.utils.C24907c;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25403a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.a */
/* loaded from: classes7.dex */
public final class C24844a {

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.modifiers.a$a */
    /* loaded from: classes7.dex */
    public static final class C24845a extends Lambda implements Function1<LayoutCoordinates, Unit> {

        /* renamed from: g */
        public final /* synthetic */ InterfaceC25403a.AbstractC25404a.C25407c f64185g;

        /* renamed from: h */
        public final /* synthetic */ Function1<InterfaceC25403a.AbstractC25404a.C25407c, Unit> f64186h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C24845a(InterfaceC25403a.AbstractC25404a.C25407c c25407c, Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, Unit> function1) {
            super(1);
            this.f64185g = c25407c;
            this.f64186h = function1;
        }

        /* renamed from: a */
        public final void m45614a(@NotNull LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            C24907c c24907c = C24907c.f64351a;
            InterfaceC25403a.AbstractC25404a.C25407c m45530b = c24907c.m45530b(it, this.f64185g.m44609c());
            if (c24907c.m45527e(m45530b) && !Intrinsics.m17075f(m45530b, this.f64185g)) {
                this.f64186h.invoke(m45530b);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
            m45614a(layoutCoordinates);
            return Unit.f99208a;
        }
    }

    @SuppressLint({"ModifierFactoryExtensionFunction"})
    @NotNull
    /* renamed from: a */
    public static final Modifier m45615a(@NotNull Modifier modifier, @NotNull InterfaceC25403a.AbstractC25404a.C25407c savedStateButton, @NotNull Function1<? super InterfaceC25403a.AbstractC25404a.C25407c, Unit> updateButtonState) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(savedStateButton, "savedStateButton");
        Intrinsics.checkNotNullParameter(updateButtonState, "updateButtonState");
        return OnGloballyPositionedModifierKt.onGloballyPositioned(modifier, new C24845a(savedStateButton, updateButtonState));
    }
}
