package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

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

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.d */
/* loaded from: classes7.dex */
public final class C25252d {
    @NotNull

    /* renamed from: a */
    public final InterfaceC25403a f65557a;
    @Nullable

    /* renamed from: b */
    public List<String> f65558b;
    @Nullable

    /* renamed from: c */
    public List<String> f65559c;
    @Nullable

    /* renamed from: d */
    public List<String> f65560d;
    @NotNull

    /* renamed from: e */
    public final InterfaceC24833i f65561e;
    @NotNull

    /* renamed from: f */
    public final InterfaceC25054n f65562f;

    public C25252d(@NotNull InterfaceC25403a customUserEventBuilderService, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @NotNull InterfaceC24833i buttonTracker, @NotNull InterfaceC25054n vastTracker) {
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.f65557a = customUserEventBuilderService;
        this.f65558b = list;
        this.f65559c = list2;
        this.f65560d = list3;
        this.f65561e = buttonTracker;
        this.f65562f = vastTracker;
    }

    /* renamed from: a */
    public final void m44923a() {
        List<String> list = this.f65559c;
        if (list != null) {
            InterfaceC25054n.C25055a.m45208a(this.f65562f, list, null, null, null, 14, null);
            this.f65559c = null;
        }
    }

    /* renamed from: b */
    public final void m44922b(@NotNull InterfaceC25403a.AbstractC25404a.C25407c.EnumC25408a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f65561e.mo44845a(buttonType);
    }

    /* renamed from: c */
    public final void m44921c(@NotNull InterfaceC25403a.AbstractC25404a.C25407c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f65561e.mo44844a(button);
    }

    /* renamed from: d */
    public final void m44920d(@NotNull InterfaceC25403a.AbstractC25404a.C25411f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        List<String> list = this.f65558b;
        if (list != null) {
            InterfaceC25054n.C25055a.m45207b(this.f65562f, list, null, null, null, this.f65561e.mo45630p(), this.f65557a, position, 14, null);
            this.f65558b = null;
        }
    }

    /* renamed from: e */
    public final void m44919e() {
        List<String> list = this.f65560d;
        if (list != null) {
            InterfaceC25054n.C25055a.m45208a(this.f65562f, list, null, null, null, 14, null);
            this.f65560d = null;
        }
    }

    public /* synthetic */ C25252d(InterfaceC25403a interfaceC25403a, List list, List list2, List list3, InterfaceC24833i interfaceC24833i, InterfaceC25054n interfaceC25054n, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC25403a, list, list2, list3, (i & 16) != 0 ? C24835k.m45629a() : interfaceC24833i, (i & 32) != 0 ? C25058p.m45199a() : interfaceC25054n);
    }
}
