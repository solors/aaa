package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.vungle.ads.a1 */
/* loaded from: classes7.dex */
public final class VungleError extends AbstractC29537l2 {
    public VungleError() {
        this(0, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ VungleError(int i, Sdk$SDKError.EnumC29425b enumC29425b, String str, String str2, String str3, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AbstractC29537l2.INVALID_AD_STATE : i, (i2 & 2) != 0 ? null : enumC29425b, (i2 & 4) != 0 ? "Ad state is invalid" : str, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3, (i2 & 32) == 0 ? str4 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleError(int i, @Nullable Sdk$SDKError.EnumC29425b enumC29425b, @NotNull String errorMessage, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        super(Integer.valueOf(i), enumC29425b, errorMessage, str, str2, str3, null);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
