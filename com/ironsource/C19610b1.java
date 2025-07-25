package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.model.Placement;
import com.unity3d.mediation.LevelPlay;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: com.ironsource.b1 */
/* loaded from: classes6.dex */
public class C19610b1 {
    @NotNull

    /* renamed from: a */
    private final IronSource.AD_UNIT f49208a;
    @NotNull

    /* renamed from: b */
    private final String f49209b;
    @Nullable

    /* renamed from: c */
    private Placement f49210c;
    @Nullable

    /* renamed from: d */
    private final C21046ts f49211d;
    @NotNull

    /* renamed from: e */
    private final C21183wj f49212e;

    @Metadata
    /* renamed from: com.ironsource.b1$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C19611a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49213a;

        static {
            int[] iArr = new int[IronSource.AD_UNIT.values().length];
            try {
                iArr[IronSource.AD_UNIT.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.AD_UNIT.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.AD_UNIT.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.AD_UNIT.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f49213a = iArr;
        }
    }

    public C19610b1(@NotNull IronSource.AD_UNIT adFormat, @NotNull String adUnitId, @Nullable Placement placement, @Nullable C21046ts c21046ts) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f49208a = adFormat;
        this.f49209b = adUnitId;
        this.f49210c = placement;
        this.f49211d = c21046ts;
        this.f49212e = new C21183wj();
    }

    @NotNull
    /* renamed from: a */
    public final IronSource.AD_UNIT m59389a() {
        return this.f49208a;
    }

    @NotNull
    /* renamed from: b */
    public final String m59387b() {
        return this.f49209b;
    }

    @NotNull
    /* renamed from: c */
    public final LevelPlay.AdFormat m59386c() {
        int i = C19611a.f49213a[this.f49208a.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return LevelPlay.AdFormat.NATIVE_AD;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return LevelPlay.AdFormat.BANNER;
            }
            return LevelPlay.AdFormat.INTERSTITIAL;
        }
        return LevelPlay.AdFormat.REWARDED;
    }

    @NotNull
    /* renamed from: d */
    public final C21183wj m59385d() {
        return this.f49212e;
    }

    @Nullable
    /* renamed from: e */
    public final Placement m59384e() {
        return this.f49210c;
    }

    @Nullable
    /* renamed from: f */
    public final C21046ts m59383f() {
        return this.f49211d;
    }

    public /* synthetic */ C19610b1(IronSource.AD_UNIT ad_unit, String str, Placement placement, C21046ts c21046ts, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(ad_unit, str, (i & 4) != 0 ? null : placement, (i & 8) != 0 ? null : c21046ts);
    }

    /* renamed from: a */
    public final void m59388a(@Nullable Placement placement) {
        this.f49210c = placement;
    }
}
