package com.mobilefuse.sdk.p543rx;

import com.mobilefuse.sdk.component.AdParsingInterfaces;
import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.internal.repository.ParsedAdMarkupResponse;
import com.mobilefuse.sdk.network.model.MfxBidResponse;
import kotlin.Metadata;
import kotlin.Tuples;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AdParserFlow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.rx.AdParserFlowKt$parse$3 */
/* loaded from: classes7.dex */
final class AdParserFlowKt$parse$3 extends Lambda implements Function2<Tuples<? extends MfxBidResponse, ? extends AdParsingInterfaces>, ParsedAdMarkup, ParsedAdMarkupResponse> {
    public static final AdParserFlowKt$parse$3 INSTANCE = new AdParserFlowKt$parse$3();

    AdParserFlowKt$parse$3() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ ParsedAdMarkupResponse mo105910invoke(Tuples<? extends MfxBidResponse, ? extends AdParsingInterfaces> tuples, ParsedAdMarkup parsedAdMarkup) {
        return invoke2((Tuples<MfxBidResponse, ? extends AdParsingInterfaces>) tuples, parsedAdMarkup);
    }

    @NotNull
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final ParsedAdMarkupResponse invoke2(@NotNull Tuples<MfxBidResponse, ? extends AdParsingInterfaces> a, @NotNull ParsedAdMarkup b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        return new ParsedAdMarkupResponse(a.m17630c(), b);
    }
}
