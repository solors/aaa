package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import gatewayprotocol.p687v1.InitializationResponseOuterClass;
import ge.InterfaceC33327h;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p715i8.ScarAdMetadata;

/* compiled from: ScarManager.kt */
@Metadata
/* loaded from: classes7.dex */
public interface ScarManager {
    @Nullable
    Object getSignals(@Nullable List<? extends InitializationResponseOuterClass.AdFormat> list, @NotNull Continuation<? super BiddingSignals> continuation);

    @Nullable
    Object getVersion(@NotNull Continuation<? super String> continuation);

    @Nullable
    Object loadAd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, int i, @NotNull Continuation<? super Unit> continuation);

    @NotNull
    InterfaceC33327h<GmaEventData> loadBannerAd(@NotNull Context context, @NotNull BannerView bannerView, @NotNull ScarAdMetadata scarAdMetadata, @NotNull UnityBannerSize unityBannerSize, @NotNull String str);

    @NotNull
    InterfaceC33327h<GmaEventData> show(@NotNull String str, @NotNull String str2);
}
