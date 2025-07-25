package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.TokenCounters;
import gatewayprotocol.p687v1.InitializationResponseOuterClass;
import gatewayprotocol.p687v1.NativeConfigurationOuterClass;
import gatewayprotocol.p687v1.SessionCountersOuterClass;
import ge.InterfaceC33327h;
import ge.SharedFlow;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SessionRepository.kt */
@Metadata
/* loaded from: classes7.dex */
public interface SessionRepository {
    @NotNull
    NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    @Nullable
    String getGameId();

    @Nullable
    Object getGatewayCache(@NotNull Continuation<? super ByteString> continuation);

    @NotNull
    ByteString getGatewayState();

    @NotNull
    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    @NotNull
    InitializationState getInitializationState();

    @NotNull
    NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    @NotNull
    InterfaceC33327h<InitializationState> getObserveInitializationState();

    @NotNull
    SharedFlow<SessionChange> getOnChange();

    @Nullable
    Object getPrivacy(@NotNull Continuation<? super ByteString> continuation);

    @Nullable
    Object getPrivacyFsm(@NotNull Continuation<? super ByteString> continuation);

    @NotNull
    List<InitializationResponseOuterClass.AdFormat> getScarEligibleFormats();

    @NotNull
    SessionCountersOuterClass.SessionCounters getSessionCounters();

    @NotNull
    ByteString getSessionId();

    @NotNull
    ByteString getSessionToken();

    boolean getShouldInitialize();

    @NotNull
    TokenCounters getTokenCounters();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isFirstInitAttempt();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    @Nullable
    Object persistNativeConfiguration(@NotNull Continuation<? super Unit> continuation);

    void resetTokenCounters();

    void setGameId(@Nullable String str);

    @Nullable
    Object setGatewayCache(@NotNull ByteString byteString, @NotNull Continuation<? super Unit> continuation);

    void setGatewayState(@NotNull ByteString byteString);

    void setGatewayUrl(@NotNull String str);

    void setInitializationState(@NotNull InitializationState initializationState);

    void setNativeConfiguration(@NotNull NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    @Nullable
    Object setPrivacy(@NotNull ByteString byteString, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object setPrivacyFsm(@NotNull ByteString byteString, @NotNull Continuation<? super Unit> continuation);

    void setSessionCounters(@NotNull SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(@NotNull ByteString byteString);

    void setShouldInitialize(boolean z);

    void setTokenCounters(@NotNull TokenCounters tokenCounters);
}
