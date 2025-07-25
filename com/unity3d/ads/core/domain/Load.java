package com.unity3d.ads.core.domain;

import android.content.Context;
import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.LoadResult;
import gatewayprotocol.p687v1.AdRequestOuterClass;
import gatewayprotocol.p687v1.HeaderBiddingAdMarkupOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Load.kt */
@Metadata
/* loaded from: classes7.dex */
public interface Load {

    /* compiled from: Load.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(Load load, Context context, String str, ByteString byteString, HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, AdRequestOuterClass.BannerSize bannerSize, UnityAdsLoadOptions unityAdsLoadOptions, Continuation continuation, int i, Object obj) {
            AdRequestOuterClass.BannerSize bannerSize2;
            if (obj == null) {
                if ((i & 16) != 0) {
                    bannerSize2 = null;
                } else {
                    bannerSize2 = bannerSize;
                }
                return load.invoke(context, str, byteString, headerBiddingAdMarkup, bannerSize2, unityAdsLoadOptions, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }

    @Nullable
    Object invoke(@NotNull Context context, @NotNull String str, @NotNull ByteString byteString, @NotNull HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup headerBiddingAdMarkup, @Nullable AdRequestOuterClass.BannerSize bannerSize, @NotNull UnityAdsLoadOptions unityAdsLoadOptions, @NotNull Continuation<? super LoadResult> continuation);
}
