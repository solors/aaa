package com.mobilefuse.sdk.network.client;

import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.network.client.HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: HttpResponsePrintLogFlow.kt */
@Metadata
/* renamed from: com.mobilefuse.sdk.network.client.HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1$1$lambda$1 */
/* loaded from: classes7.dex */
final class C23639x8420010c extends Lambda implements Functions<Unit> {
    final /* synthetic */ Either $it$inlined;
    final /* synthetic */ StringBuilder $sb;
    final /* synthetic */ HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1.C236381 this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23639x8420010c(StringBuilder sb2, Either either, HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1.C236381 c236381) {
        super(0);
        this.$sb = sb2;
        this.$it$inlined = either;
        this.this$0 = c236381;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        for (Map.Entry entry : HttpResponsePrintLogFlowKt$logHttpResponse$$inlined$run$1.this.$extras$inlined.entrySet()) {
            StringBuilder sb2 = this.$sb;
            sb2.append(((String) entry.getKey()) + ": " + ((String) entry.getValue()));
            Intrinsics.checkNotNullExpressionValue(sb2, "append(value)");
            sb2.append('\n');
            Intrinsics.checkNotNullExpressionValue(sb2, "append('\\n')");
        }
    }
}
