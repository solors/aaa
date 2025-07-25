package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p547ad;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C25058p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.InterfaceC25054n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.EnumC25053z;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.h */
/* loaded from: classes7.dex */
public final class C25095h {
    @Nullable

    /* renamed from: a */
    public List<String> f65104a;
    @Nullable

    /* renamed from: b */
    public List<String> f65105b;
    @Nullable

    /* renamed from: c */
    public final List<String> f65106c;
    @NotNull

    /* renamed from: d */
    public final InterfaceC25054n f65107d;

    public C25095h(@Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @NotNull InterfaceC25054n vastTracker) {
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.f65104a = list;
        this.f65105b = list2;
        this.f65106c = list3;
        this.f65107d = vastTracker;
    }

    /* renamed from: a */
    public final void m45146a() {
        List<String> list = this.f65105b;
        if (list != null) {
            InterfaceC25054n.C25055a.m45208a(this.f65107d, list, null, null, null, 14, null);
            this.f65105b = null;
        }
    }

    /* renamed from: b */
    public final void m45145b(@Nullable EnumC25053z enumC25053z) {
        List<String> list = this.f65106c;
        if (list != null) {
            InterfaceC25054n.C25055a.m45208a(this.f65107d, list, enumC25053z, null, null, 12, null);
        }
    }

    /* renamed from: c */
    public final boolean m45144c() {
        List<String> list = this.f65104a;
        if (list != null) {
            InterfaceC25054n.C25055a.m45208a(this.f65107d, list, null, null, null, 14, null);
            this.f65104a = null;
            return true;
        }
        return false;
    }

    public /* synthetic */ C25095h(List list, List list2, List list3, InterfaceC25054n interfaceC25054n, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, list3, (i & 8) != 0 ? C25058p.m45199a() : interfaceC25054n);
    }
}
