package androidx.activity.compose;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* compiled from: BackHandler.kt */
@Metadata
/* loaded from: classes.dex */
final class BackHandlerKt$BackHandler$1$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ BackHandlerKt$BackHandler$backCallback$1$1 $backCallback;
    final /* synthetic */ boolean $enabled;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackHandlerKt$BackHandler$1$1(BackHandlerKt$BackHandler$backCallback$1$1 backHandlerKt$BackHandler$backCallback$1$1, boolean z) {
        super(0);
        this.$backCallback = backHandlerKt$BackHandler$backCallback$1$1;
        this.$enabled = z;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        setEnabled(this.$enabled);
    }
}
