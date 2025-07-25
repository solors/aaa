package com.mobilefuse.sdk.nativeads;

import com.mobilefuse.sdk.p543rx.FlowCollector;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: NativeAdParser.kt */
@Metadata
/* loaded from: classes7.dex */
final class NativeAdParser$parse$1 extends Lambda implements Function1<FlowCollector<? super String>, Unit> {
    final /* synthetic */ String $adm;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAdParser$parse$1(String str) {
        super(1);
        this.$adm = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super String> flowCollector) {
        invoke2(flowCollector);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull FlowCollector<? super String> receiver) {
        Intrinsics.checkNotNullParameter(receiver, "$receiver");
        receiver.emitSuccess(this.$adm);
    }
}
