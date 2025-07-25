package com.mobilefuse.sdk.internal.repository;

import com.mobilefuse.sdk.component.AdParsingInterfaces;
import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.component.ParsingError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import com.mobilefuse.sdk.p543rx.Flow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.mobilefuse.sdk.internal.repository.ParseAdmFromBidResponseKt */
/* loaded from: classes7.dex */
public final class ParseAdmFromBidResponse {
    @NotNull
    public static final Flow<Either<ParsingError, ParsedAdMarkup>> parseFromBidResponse(@NotNull AdParsingInterfaces parseFromBidResponse, @NotNull MfxBidResponse bidResponse) {
        Intrinsics.checkNotNullParameter(parseFromBidResponse, "$this$parseFromBidResponse");
        Intrinsics.checkNotNullParameter(bidResponse, "bidResponse");
        return parseFromBidResponse.parse(bidResponse.getAdm());
    }
}
