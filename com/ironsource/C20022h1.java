package com.ironsource;

import android.content.Context;
import be.MathJVM;
import com.ironsource.C20220ks;
import com.ironsource.mediationsdk.C20410l;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.ISContainerParams;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: com.ironsource.h1 */
/* loaded from: classes6.dex */
public final class C20022h1 extends C20593ok {
    @NotNull

    /* renamed from: b */
    private final C20220ks.C20222b f50332b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC20097ig f50333c;

    public C20022h1() {
        C20220ks.C20222b m57614a = C20220ks.m57614a(IronSource.AD_UNIT.BANNER);
        Intrinsics.checkNotNullExpressionValue(m57614a, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.f50332b = m57614a;
        this.f50333c = C19821el.f49880p.m58785d().mo57089r();
    }

    /* renamed from: c */
    private final float m58313c() {
        C19588ak mo57983a = this.f50333c.mo57983a();
        if (mo57983a != null) {
            return mo57983a.m59427j();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    /* renamed from: a */
    public final int m58320a(int i) {
        return C20410l.m56797a(i);
    }

    /* renamed from: b */
    public final int m58315b(@NotNull Context context) {
        int m103791d;
        Intrinsics.checkNotNullParameter(context, "context");
        m103791d = MathJVM.m103791d(m58313c() * C20516na.f52153a.m56170a(context));
        return m103791d;
    }

    /* renamed from: d */
    public final boolean m58311d() {
        return C19821el.f49880p.m58785d().mo57089r().mo57981c();
    }

    /* renamed from: a */
    private final ISBannerSize m58318a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize m58314b = m58314b(fallbackAdSize$mediationsdk_release);
        m58314b.setAdaptive(true);
        m58314b.containerParams = new ISContainerParams(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        return m58314b;
    }

    /* renamed from: c */
    private final ISBannerSize m58312c(LevelPlayAdSize levelPlayAdSize) {
        return Intrinsics.m17075f(levelPlayAdSize, LevelPlayAdSize.LARGE) ? new ISBannerSize(C20410l.f51630b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : Intrinsics.m17075f(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE) ? new ISBannerSize(C20410l.f51631c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : Intrinsics.m17075f(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD) ? new ISBannerSize(C20410l.f51633e, 0, 0) : Intrinsics.m17075f(levelPlayAdSize, LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight())) ? new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : new ISBannerSize(C20410l.f51629a, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    @NotNull
    /* renamed from: b */
    public final ISBannerSize m58314b(@NotNull LevelPlayAdSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        boolean isAdaptive = size.isAdaptive();
        if (isAdaptive) {
            return m58318a(size);
        }
        if (isAdaptive) {
            throw new NoWhenBranchMatchedException();
        }
        return m58312c(size);
    }

    /* renamed from: a */
    public static /* synthetic */ String m58319a(C20022h1 c20022h1, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c20022h1.m58317a(str, str2);
    }

    @NotNull
    /* renamed from: b */
    public final List<LevelPlayAdSize> m58316b() {
        C19588ak mo57983a = this.f50333c.mo57983a();
        if (mo57983a != null) {
            return mo57983a.m59429h();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    @NotNull
    /* renamed from: a */
    public final String m58317a(@Nullable String str, @Nullable String str2) {
        String m57605a = this.f50332b.m57605a(str, str2);
        Intrinsics.checkNotNullExpressionValue(m57605a, "logFactory.createLogMessage(message, suffix)");
        return m57605a;
    }
}
