package com.unity3d.services.core.p621di;

import com.unity3d.ads.core.data.repository.DiagnosticEventRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: UnityAdsModule.kt */
@Metadata
/* renamed from: com.unity3d.services.core.di.UnityAdsModule$publicApiJob$1$1 */
/* loaded from: classes7.dex */
public final class UnityAdsModule$publicApiJob$1$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ DiagnosticEventRepository $diagnosticEventRepository;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsModule$publicApiJob$1$1(DiagnosticEventRepository diagnosticEventRepository) {
        super(1);
        this.$diagnosticEventRepository = diagnosticEventRepository;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        this.$diagnosticEventRepository.flush();
    }
}
