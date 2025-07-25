package com.mobilefuse.sdk.internal.repository;

import com.mobilefuse.sdk.component.AdParsingInterfaces;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.internal.repository.AdRepositoryResponse;
import com.mobilefuse.sdk.network.model.AdmMediaType;
import com.mobilefuse.sdk.telemetry.TelemetryAgent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdRepositoryDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public interface AdRepository<T extends AdRepositoryResponse> {
    @NotNull
    AdRepositoryDataModel getAdLoadingConfig();

    @NotNull
    Function1<AdmMediaType, AdParsingInterfaces> getParserFactory();

    @NotNull
    String getRepositoryType();

    @NotNull
    TelemetryAgent getTelemetryAgent();

    void loadAd(@NotNull Function1<? super BaseError, Unit> function1, @NotNull Function1<? super T, Unit> function12);
}
