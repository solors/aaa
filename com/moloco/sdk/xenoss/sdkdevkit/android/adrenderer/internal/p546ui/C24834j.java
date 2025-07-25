package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p546ui;

import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25403a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Tuples;
import kotlin.collections.C37566w;
import kotlin.collections._Maps;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.j */
/* loaded from: classes7.dex */
public final class C24834j implements InterfaceC24833i {
    @NotNull

    /* renamed from: b */
    public final Map<InterfaceC25403a.AbstractC25404a.C25407c.EnumC25408a, InterfaceC25403a.AbstractC25404a.C25407c> f64155b = new LinkedHashMap();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p546ui.InterfaceC24832h
    /* renamed from: a */
    public void mo44844a(@NotNull InterfaceC25403a.AbstractC25404a.C25407c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f64155b.put(button.m44609c(), button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p546ui.InterfaceC24833i
    @NotNull
    /* renamed from: p */
    public List<InterfaceC25403a.AbstractC25404a.C25407c> mo45630p() {
        List<Tuples> m17180F;
        int m17154x;
        m17180F = _Maps.m17180F(this.f64155b);
        m17154x = C37566w.m17154x(m17180F, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (Tuples tuples : m17180F) {
            arrayList.add((InterfaceC25403a.AbstractC25404a.C25407c) tuples.m17629d());
        }
        return arrayList;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p546ui.InterfaceC24832h
    /* renamed from: a */
    public void mo44845a(@NotNull InterfaceC25403a.AbstractC25404a.C25407c.EnumC25408a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f64155b.remove(buttonType);
    }
}
