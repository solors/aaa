package com.mobilefuse.sdk.p543rx;

import com.mobilefuse.sdk.component.AdParsingInterfaces;
import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.exception.BaseError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.internal.repository.ParseAdmFromBidResponse;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdParserFlow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.rx.AdParserFlowKt$parse$2 */
/* loaded from: classes7.dex */
final class AdParserFlowKt$parse$2 extends Lambda implements Function1<Tuples<? extends MfxBidResponse, ? extends AdParsingInterfaces>, Flow<? extends Either<? extends BaseError, ? extends ParsedAdMarkup>>> {
    public static final AdParserFlowKt$parse$2 INSTANCE = new AdParserFlowKt$parse$2();

    AdParserFlowKt$parse$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Flow<? extends Either<? extends BaseError, ? extends ParsedAdMarkup>> invoke(Tuples<? extends MfxBidResponse, ? extends AdParsingInterfaces> tuples) {
        return invoke2((Tuples<MfxBidResponse, ? extends AdParsingInterfaces>) tuples);
    }

    @NotNull
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Flow<Either<BaseError, ParsedAdMarkup>> invoke2(@NotNull Tuples<MfxBidResponse, ? extends AdParsingInterfaces> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return ParseAdmFromBidResponse.parseFromBidResponse(it.m17629d(), it.m17630c());
    }
}
