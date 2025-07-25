package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.C25058p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.InterfaceC25054n;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b */
/* loaded from: classes7.dex */
public final class C25277b {
    @Nullable

    /* renamed from: a */
    public List<String> f65633a;
    @Nullable

    /* renamed from: b */
    public List<String> f65634b;
    @NotNull

    /* renamed from: c */
    public final InterfaceC25054n f65635c;

    public C25277b(@Nullable List<String> list, @Nullable List<String> list2, @NotNull InterfaceC25054n vastTracker) {
        Intrinsics.checkNotNullParameter(vastTracker, "vastTracker");
        this.f65633a = list;
        this.f65634b = list2;
        this.f65635c = vastTracker;
    }

    /* renamed from: a */
    public final void m44860a(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.f65633a;
        if (list != null) {
            this.f65635c.mo45206a(list, null, num, str);
            this.f65633a = null;
        }
    }

    /* renamed from: b */
    public final void m44859b(@Nullable Integer num, @Nullable String str) {
        List<String> list = this.f65634b;
        if (list != null) {
            this.f65635c.mo45206a(list, null, num, str);
            this.f65634b = null;
        }
    }

    public /* synthetic */ C25277b(List list, List list2, InterfaceC25054n interfaceC25054n, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, list2, (i & 4) != 0 ? C25058p.m45199a() : interfaceC25054n);
    }
}
