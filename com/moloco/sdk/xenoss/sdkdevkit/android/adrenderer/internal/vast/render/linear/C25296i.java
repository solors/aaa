package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.AbstractC25045t;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.InterfaceC25243d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.PrimitiveRanges;
import kotlin.ranges._Ranges;
import kotlinx.coroutines.InterfaceC37708b2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;
import p804nd.UnsignedUtils;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.i */
/* loaded from: classes7.dex */
public final class C25296i {
    @NotNull
    /* renamed from: d */
    public static final InterfaceC25292g m44817d(@Nullable Boolean bool, int i, @Nullable AbstractC25045t abstractC25045t) {
        if (Intrinsics.m17075f(bool, Boolean.FALSE)) {
            abstractC25045t = null;
        } else if (Intrinsics.m17075f(bool, Boolean.TRUE)) {
            abstractC25045t = new AbstractC25045t.C25047b(i * 1000);
        } else if (bool != null) {
            throw new NoWhenBranchMatchedException();
        }
        return new C25293h(abstractC25045t);
    }

    /* renamed from: f */
    public static final int m44815f(PrimitiveRanges primitiveRanges, int i) {
        int m16917e;
        double m16919c;
        m16917e = _Ranges.m16917e(primitiveRanges.m16952d() - primitiveRanges.m16953c(), 0);
        m16919c = _Ranges.m16919c(((m16917e * i) / 100.0d) / 1000, 0.0d);
        return UnsignedUtils.m14564a(m16919c);
    }

    /* renamed from: g */
    public static final long m44814g(long j) {
        return j / 1000;
    }

    /* renamed from: h */
    public static final InterfaceC25243d.AbstractC25244a m44813h(int i) {
        if (i == 0) {
            return InterfaceC25243d.AbstractC25244a.C25245a.f65536a;
        }
        return new InterfaceC25243d.AbstractC25244a.C25246b(i, null);
    }

    /* renamed from: i */
    public static final boolean m44812i(InterfaceC37708b2 interfaceC37708b2) {
        if (interfaceC37708b2 != null && !interfaceC37708b2.isCancelled() && !interfaceC37708b2.isCompleted()) {
            return false;
        }
        return true;
    }
}
