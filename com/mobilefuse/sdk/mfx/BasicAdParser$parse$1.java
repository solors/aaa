package com.mobilefuse.sdk.mfx;

import com.mobilefuse.sdk.component.ParsedAdMarkup;
import com.mobilefuse.sdk.component.ParsingError;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.p543rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: BasicAdParser.kt */
@Metadata
/* loaded from: classes7.dex */
final class BasicAdParser$parse$1 extends Lambda implements Function1<FlowCollector<? super Either<? extends ParsingError, ? extends ParsedAdMarkup>>, Unit> {
    final /* synthetic */ String $adm;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicAdParser$parse$1(String str) {
        super(1);
        this.$adm = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super Either<? extends ParsingError, ? extends ParsedAdMarkup>> flowCollector) {
        invoke2(flowCollector);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FlowCollector<? super Either<? extends ParsingError, ? extends ParsedAdMarkup>> receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        receiver.emitSuccess(new SuccessResult(new BasicAdMarkup(this.$adm)));
    }
}
