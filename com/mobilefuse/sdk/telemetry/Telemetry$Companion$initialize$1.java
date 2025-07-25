package com.mobilefuse.sdk.telemetry;

import com.mobilefuse.sdk.telemetry.Telemetry;
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
public final /* synthetic */ class Telemetry$Companion$initialize$1 extends FunctionReferenceImpl implements Function2<Object, Throwable, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public Telemetry$Companion$initialize$1(Telemetry.Companion companion) {
        super(2, companion, Telemetry.Companion.class, "logException", "logException(Ljava/lang/Object;Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(Object obj, Throwable th) {
        invoke2(obj, th);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Object p1, @NotNull Throwable p2) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        Intrinsics.checkNotNullParameter(p2, "p2");
        ((Telemetry.Companion) this.receiver).logException(p1, p2);
    }
}
