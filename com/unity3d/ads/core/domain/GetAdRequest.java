package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.p687v1.AdRequestOuterClass;
import gatewayprotocol.p687v1.UniversalRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GetAdRequest.kt */
@Metadata
/* loaded from: classes7.dex */
public interface GetAdRequest {

    /* compiled from: GetAdRequest.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetAdRequest getAdRequest, String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    bannerSize = null;
                }
                return getAdRequest.invoke(str, byteString, bannerSize, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    @Nullable
    Object invoke(@NotNull String str, @NotNull ByteString byteString, @Nullable AdRequestOuterClass.BannerSize bannerSize, @NotNull Continuation<? super UniversalRequestOuterClass.UniversalRequest> continuation);
}
