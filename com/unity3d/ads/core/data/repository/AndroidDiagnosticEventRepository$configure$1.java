package com.unity3d.ads.core.data.repository;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: AndroidDiagnosticEventRepository.kt */
@Metadata
/* loaded from: classes7.dex */
final class AndroidDiagnosticEventRepository$configure$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ AndroidDiagnosticEventRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidDiagnosticEventRepository$configure$1(AndroidDiagnosticEventRepository androidDiagnosticEventRepository) {
        super(0);
        this.this$0 = androidDiagnosticEventRepository;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.flush();
    }
}
