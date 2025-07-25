package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p546ui.C24835k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p546ui.InterfaceC24833i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C25058p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.InterfaceC25054n;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25403a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.g */
/* loaded from: classes7.dex */
public final class C25126g {
    @NotNull

    /* renamed from: a */
    public final InterfaceC25403a f65160a;
    @Nullable

    /* renamed from: b */
    public List<String> f65161b;
    @Nullable

    /* renamed from: c */
    public List<String> f65162c;
    @NotNull

    /* renamed from: d */
    public final InterfaceC24833i f65163d;
    @NotNull

    /* renamed from: e */
    public final InterfaceC25054n f65164e;

    public C25126g(@NotNull InterfaceC25403a customUserEventBuilderService, @Nullable List<String> list, @Nullable List<String> list2, @NotNull InterfaceC24833i buttonTracker, @NotNull InterfaceC25054n vastTracker) {
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.f65160a = customUserEventBuilderService;
        this.f65161b = list;
        this.f65162c = list2;
        this.f65163d = buttonTracker;
        this.f65164e = vastTracker;
    }

    /* renamed from: a */
    public final void m45102a() {
        List<String> list = this.f65162c;
        if (list != null) {
            InterfaceC25054n.C25055a.m45208a(this.f65164e, list, null, null, null, 14, null);
            this.f65162c = null;
        }
    }

    /* renamed from: b */
    public final void m45101b(@NotNull InterfaceC25403a.AbstractC25404a.C25407c.EnumC25408a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f65163d.mo44845a(buttonType);
    }

    /* renamed from: c */
    public final void m45100c(@NotNull InterfaceC25403a.AbstractC25404a.C25407c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f65163d.mo44844a(button);
    }

    /* renamed from: d */
    public final void m45099d(@NotNull InterfaceC25403a.AbstractC25404a.C25411f lastClickPosition) {
        Intrinsics.checkNotNullParameter(lastClickPosition, "lastClickPosition");
        List<String> list = this.f65161b;
        if (list != null) {
            InterfaceC25054n.C25055a.m45207b(this.f65164e, list, null, null, null, this.f65163d.mo45630p(), this.f65160a, lastClickPosition, 14, null);
            this.f65161b = null;
        }
    }

    public /* synthetic */ C25126g(InterfaceC25403a interfaceC25403a, List list, List list2, InterfaceC24833i interfaceC24833i, InterfaceC25054n interfaceC25054n, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC25403a, list, list2, (i & 8) != 0 ? C24835k.m45629a() : interfaceC24833i, (i & 16) != 0 ? C25058p.m45199a() : interfaceC25054n);
    }
}
