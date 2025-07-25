package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.p546ui.utils;

import android.content.res.Resources;
import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.layout.LayoutCoordinates;
import androidx.compose.p015ui.layout.LayoutCoordinatesKt;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.InterfaceC25403a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c */
/* loaded from: classes7.dex */
public final class C24907c {
    @NotNull

    /* renamed from: a */
    public static final C24907c f64351a = new C24907c();

    /* renamed from: a */
    public final float m45531a(int i) {
        return i / Resources.getSystem().getDisplayMetrics().density;
    }

    @NotNull
    /* renamed from: b */
    public final InterfaceC25403a.AbstractC25404a.C25407c m45530b(@NotNull LayoutCoordinates layoutCoordinates, @NotNull InterfaceC25403a.AbstractC25404a.C25407c.EnumC25408a buttonType) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        return new InterfaceC25403a.AbstractC25404a.C25407c(buttonType, m45528d(layoutCoordinates), m45526f(layoutCoordinates));
    }

    @NotNull
    /* renamed from: c */
    public final InterfaceC25403a.AbstractC25404a.C25411f m45529c(long j) {
        return new InterfaceC25403a.AbstractC25404a.C25411f(m45531a((int) Offset.m107291getXimpl(j)), m45531a((int) Offset.m107292getYimpl(j)));
    }

    @NotNull
    /* renamed from: d */
    public final InterfaceC25403a.AbstractC25404a.C25411f m45528d(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return new InterfaceC25403a.AbstractC25404a.C25411f(m45531a((int) Offset.m107291getXimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates))), m45531a((int) Offset.m107292getYimpl(LayoutCoordinatesKt.positionInRoot(layoutCoordinates))));
    }

    /* renamed from: e */
    public final boolean m45527e(@NotNull InterfaceC25403a.AbstractC25404a.C25407c c25407c) {
        Intrinsics.checkNotNullParameter(c25407c, "<this>");
        if (c25407c.m44607e().m44599a() > 0.0f && c25407c.m44607e().m44598b() > 0.0f) {
            return true;
        }
        return false;
    }

    @NotNull
    /* renamed from: f */
    public final InterfaceC25403a.AbstractC25404a.C25412g m45526f(@NotNull LayoutCoordinates layoutCoordinates) {
        Intrinsics.checkNotNullParameter(layoutCoordinates, "<this>");
        return new InterfaceC25403a.AbstractC25404a.C25412g(m45531a(IntSize.m109894getWidthimpl(layoutCoordinates.mo109022getSizeYbymL2g())), m45531a(IntSize.m109893getHeightimpl(layoutCoordinates.mo109022getSizeYbymL2g())));
    }
}
