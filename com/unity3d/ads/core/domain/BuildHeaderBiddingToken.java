package com.unity3d.ads.core.domain;

import gatewayprotocol.p687v1.HeaderBiddingTokenOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BuildHeaderBiddingToken.kt */
@Metadata
/* loaded from: classes7.dex */
public interface BuildHeaderBiddingToken {

    /* compiled from: BuildHeaderBiddingToken.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(BuildHeaderBiddingToken buildHeaderBiddingToken, boolean z, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return buildHeaderBiddingToken.invoke(z, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    @Nullable
    Object invoke(boolean z, @NotNull Continuation<? super HeaderBiddingTokenOuterClass.HeaderBiddingToken> continuation);
}
