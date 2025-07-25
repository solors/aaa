package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk$SDKError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: VungleError.kt */
@Metadata
/* renamed from: com.vungle.ads.i2 */
/* loaded from: classes7.dex */
public final class C29150i2 extends AbstractC29537l2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29150i2(@NotNull String errorMessage) {
        super(Integer.valueOf((int) AbstractC29537l2.UNKNOWN_EXCEPTION_CODE), Sdk$SDKError.EnumC29425b.UNKNOWN_ERROR, errorMessage, null, null, null, 56, null);
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
    }
}
