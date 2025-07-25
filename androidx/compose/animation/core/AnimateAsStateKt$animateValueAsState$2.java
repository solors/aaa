package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import p674fe.Channel;

/* compiled from: AnimateAsState.kt */
@Metadata
/* loaded from: classes.dex */
final class AnimateAsStateKt$animateValueAsState$2 extends Lambda implements Functions<Unit> {
    final /* synthetic */ Channel<T> $channel;
    final /* synthetic */ T $targetValue;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimateAsStateKt$animateValueAsState$2(Channel<T> channel, T t) {
        super(0);
        this.$channel = channel;
        this.$targetValue = t;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$channel.mo24641p(this.$targetValue);
    }
}
