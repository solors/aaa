package com.ironsource;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.NoWhenBranchMatchedException;

@Metadata
/* renamed from: com.ironsource.c8 */
/* loaded from: classes6.dex */
public final class C19687c8 {

    @Metadata
    /* renamed from: com.ironsource.c8$a */
    /* loaded from: classes6.dex */
    public /* synthetic */ class C19688a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f49422a;

        static {
            int[] iArr = new int[EnumC20037h8.values().length];
            try {
                iArr[EnumC20037h8.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC20037h8.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC20037h8.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f49422a = iArr;
        }
    }

    /* renamed from: a */
    public final int m59176a(@NotNull EnumC20037h8 cappingType) {
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        int i = C19688a.f49422a[cappingType.ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                return 3001;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 3000;
    }
}
