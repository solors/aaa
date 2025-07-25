package com.inmobi.ads.controllers;

import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C19430qb;
import com.inmobi.media.C19498v9;
import com.inmobi.media.EnumC19294h1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata
@UiThread
/* loaded from: classes6.dex */
public abstract class PublisherCallbacks {
    @NotNull
    public static final C19498v9 Companion = new C19498v9();
    public static final byte NORMAL_FLOW = 0;
    public static final byte PRELOAD_FLOW = 1;

    public abstract byte getType();

    public abstract void onAdClicked(@NotNull Map<Object, ? extends Object> map);

    public abstract void onAdDismissed();

    public abstract void onAdDisplayed(@NotNull AdMetaInfo adMetaInfo);

    public abstract void onAdFetchFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus);

    public void onAdFetchSuccessful(@NotNull AdMetaInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
    }

    public abstract void onAdLoadFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus);

    public abstract void onAdLoadSucceeded(@NotNull AdMetaInfo adMetaInfo);

    public void onAudioStatusChanged(@NotNull EnumC19294h1 audioStatusInternal) {
        Intrinsics.checkNotNullParameter(audioStatusInternal, "audioStatusInternal");
    }

    public void onImraidLog(@NotNull String log) {
        Intrinsics.checkNotNullParameter(log, "log");
    }

    public abstract void onRequestPayloadCreated(@NotNull byte[] bArr);

    public abstract void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus inMobiAdRequestStatus);

    public void onRewardsUnlocked(@NotNull Map<Object, ? extends Object> rewards) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
    }

    public abstract void onUserLeftApplication();

    public void onAdDisplayFailed() {
    }

    public void onAdImpressed() {
    }

    public void onAdWillDisplay() {
    }

    public void onVideoCompleted() {
    }

    public void onVideoSkipped() {
    }

    public void onAdImpression(@Nullable C19430qb c19430qb) {
    }

    public void onAudioStateChanged(boolean z) {
    }
}
