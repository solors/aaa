package com.mobilefuse.sdk.internal.mute;

import com.mobilefuse.sdk.config.ObservableConfigKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MutableAdController.kt */
@Metadata
/* loaded from: classes7.dex */
public final /* synthetic */ class MutableAdController$init$1$1 extends FunctionReferenceImpl implements Function2<ObservableConfigKey, Object, Unit> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public MutableAdController$init$1$1(MutableAdController mutableAdController) {
        super(2, mutableAdController, MutableAdController.class, "onConfigPropertyChanged", "onConfigPropertyChanged(Lcom/mobilefuse/sdk/config/ObservableConfigKey;Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(ObservableConfigKey observableConfigKey, Object obj) {
        invoke2(observableConfigKey, obj);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ObservableConfigKey p1, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((MutableAdController) this.receiver).onConfigPropertyChanged(p1, obj);
    }
}
