package com.mobilefuse.sdk.telemetry;

import com.mobilefuse.sdk.telemetry.ExceptionHandler;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Telemetry.kt */
@Metadata
/* loaded from: classes7.dex */
public final /* synthetic */ class Telemetry$Companion$initialize$2 extends FunctionReferenceImpl implements Function2<String, String, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Telemetry$Companion$initialize$2(ExceptionHandler.Companion companion) {
        super(2, companion, ExceptionHandler.Companion.class, "registerVariable", "registerVariable(Ljava/lang/String;Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull String p1, @NotNull String p2) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((ExceptionHandler.Companion) this.receiver).registerVariable(p1, p2);
    }
}
