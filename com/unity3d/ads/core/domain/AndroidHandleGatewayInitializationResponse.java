package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.manager.TransactionEventManager;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.p687v1.InitializationResponseOuterClass;
import gatewayprotocol.p687v1.NativeConfigurationOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37756k;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidHandleGatewayInitializationResponse.kt */
@Metadata
/* loaded from: classes7.dex */
public final class AndroidHandleGatewayInitializationResponse implements HandleGatewayInitializationResponse {
    @NotNull
    private final CoroutineScope sdkScope;
    @NotNull
    private final SessionRepository sessionRepository;
    @NotNull
    private final TransactionEventManager transactionEventManager;
    @NotNull
    private final TriggerInitializationCompletedRequest triggerInitializationCompletedRequest;

    public AndroidHandleGatewayInitializationResponse(@NotNull TransactionEventManager transactionEventManager, @NotNull TriggerInitializationCompletedRequest triggerInitializationCompletedRequest, @NotNull SessionRepository sessionRepository, @NotNull CoroutineScope sdkScope) {
        Intrinsics.checkNotNullParameter(transactionEventManager, "transactionEventManager");
        Intrinsics.checkNotNullParameter(triggerInitializationCompletedRequest, "triggerInitializationCompletedRequest");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(sdkScope, "sdkScope");
        this.transactionEventManager = transactionEventManager;
        this.triggerInitializationCompletedRequest = triggerInitializationCompletedRequest;
        this.sessionRepository = sessionRepository;
        this.sdkScope = sdkScope;
    }

    @Override // com.unity3d.ads.core.domain.HandleGatewayInitializationResponse
    @Nullable
    public Object invoke(@NotNull InitializationResponseOuterClass.InitializationResponse initializationResponse, @NotNull Continuation<? super Unit> continuation) {
        boolean z;
        if (!initializationResponse.hasError()) {
            SessionRepository sessionRepository = this.sessionRepository;
            NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration = initializationResponse.getNativeConfiguration();
            Intrinsics.checkNotNullExpressionValue(nativeConfiguration, "response.nativeConfiguration");
            sessionRepository.setNativeConfiguration(nativeConfiguration);
            if (initializationResponse.hasUniversalRequestUrl()) {
                String universalRequestUrl = initializationResponse.getUniversalRequestUrl();
                if (universalRequestUrl != null && universalRequestUrl.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    SessionRepository sessionRepository2 = this.sessionRepository;
                    String universalRequestUrl2 = initializationResponse.getUniversalRequestUrl();
                    Intrinsics.checkNotNullExpressionValue(universalRequestUrl2, "response.universalRequestUrl");
                    sessionRepository2.setGatewayUrl(universalRequestUrl2);
                }
            }
            List<InitializationResponseOuterClass.AdFormat> scarEligibleFormats = this.sessionRepository.getScarEligibleFormats();
            List<InitializationResponseOuterClass.AdFormat> scarEligibleFormatsList = initializationResponse.getScarEligibleFormatsList();
            Intrinsics.checkNotNullExpressionValue(scarEligibleFormatsList, "response.scarEligibleFormatsList");
            scarEligibleFormats.addAll(scarEligibleFormatsList);
            if (initializationResponse.getTriggerInitializationCompletedRequest()) {
                C37756k.m16221d(this.sdkScope, null, null, new AndroidHandleGatewayInitializationResponse$invoke$2(this, null), 3, null);
            }
            if (initializationResponse.getNativeConfiguration().getEnableIapEvent()) {
                this.transactionEventManager.invoke();
            }
            return Unit.f99208a;
        }
        String errorText = initializationResponse.getError().getErrorText();
        Intrinsics.checkNotNullExpressionValue(errorText, "response.error.errorText");
        throw new GatewayException(errorText, new IllegalStateException(initializationResponse.getError().getErrorText()), "gateway_initialization", initializationResponse.getError().getErrorText());
    }
}
