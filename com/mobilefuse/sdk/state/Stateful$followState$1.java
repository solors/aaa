package com.mobilefuse.sdk.state;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: Stateful.kt */
@Metadata
/* loaded from: classes7.dex */
final class Stateful$followState$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ Stateful $other;
    final /* synthetic */ Stateful this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stateful$followState$1(Stateful stateful, Stateful stateful2) {
        super(0);
        this.this$0 = stateful;
        this.$other = stateful2;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.setState(this.$other.getState());
    }
}
