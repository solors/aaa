package com.unity3d.ads.adplayer;

import androidx.annotation.CallSuper;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import ge.C33323f0;
import ge.InterfaceC33327h;
import ge.InterfaceC33420y;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37785p0;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Standard;

/* compiled from: AdPlayer.kt */
@Metadata
/* loaded from: classes7.dex */
public interface AdPlayer {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int SCAR_EVENT_QUEUE_SIZE = 10;

    /* compiled from: AdPlayer.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        public static final int SCAR_EVENT_QUEUE_SIZE = 10;
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final InterfaceC33420y<String> broadcastEventChannel = C33323f0.m24127b(0, 0, null, 7, null);

        private Companion() {
        }

        @NotNull
        public final InterfaceC33420y<String> getBroadcastEventChannel() {
            return broadcastEventChannel;
        }
    }

    /* compiled from: AdPlayer.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        @CallSuper
        @Nullable
        public static Object destroy(@NotNull AdPlayer adPlayer, @NotNull Continuation<? super Unit> continuation) {
            C37785p0.m16126f(adPlayer.getScope(), null, 1, null);
            return Unit.f99208a;
        }

        public static void show(@NotNull AdPlayer adPlayer, @NotNull ShowOptions showOptions) {
            Intrinsics.checkNotNullParameter(showOptions, "showOptions");
            throw new Standard(null, 1, null);
        }
    }

    @CallSuper
    @Nullable
    Object destroy(@NotNull Continuation<? super Unit> continuation);

    void dispatchShowCompleted();

    @NotNull
    InterfaceC33327h<LoadEvent> getOnLoadEvent();

    @NotNull
    InterfaceC33327h<ScarEvent> getOnScarEvent();

    @NotNull
    InterfaceC33327h<ShowEvent> getOnShowEvent();

    @NotNull
    CoroutineScope getScope();

    @NotNull
    InterfaceC33327h<Tuples<byte[], Integer>> getUpdateCampaignState();

    @NotNull
    WebViewContainer getWebViewContainer();

    @Nullable
    Object onAllowedPiiChange(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object onBroadcastEvent(@NotNull String str, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object requestShow(@Nullable Map<String, ? extends Object> map, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object sendActivityDestroyed(@NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object sendFocusChange(boolean z, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object sendGmaEvent(@NotNull GMAEvent gMAEvent, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object sendMuteChange(boolean z, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object sendPrivacyFsmChange(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object sendScarBannerEvent(@NotNull BannerBridge.BannerEvent bannerEvent, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object sendUserConsentChange(@NotNull byte[] bArr, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object sendVisibilityChange(boolean z, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object sendVolumeChange(double d, @NotNull Continuation<? super Unit> continuation);

    void show(@NotNull ShowOptions showOptions);
}
