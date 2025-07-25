package com.ironsource;

import com.ironsource.C19577ad;
import com.ironsource.mediationsdk.IronSource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: com.ironsource.q2 */
/* loaded from: classes6.dex */
public final class C20670q2 {
    @NotNull

    /* renamed from: a */
    public static final C20670q2 f52504a = new C20670q2();

    @Metadata
    /* renamed from: com.ironsource.q2$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C20671a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52505a;

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
            f52505a = iArr;
        }
    }

    private C20670q2() {
    }

    @NotNull
    /* renamed from: a */
    public static final C19577ad.EnumC19578a m55692a(@NotNull IronSource.AD_UNIT adUnit) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        int i = C20671a.f52505a[adUnit.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return C19577ad.EnumC19578a.NATIVE_AD;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return C19577ad.EnumC19578a.BANNER;
            }
            return C19577ad.EnumC19578a.INTERSTITIAL;
        }
        return C19577ad.EnumC19578a.REWARDED_VIDEO;
    }
}
