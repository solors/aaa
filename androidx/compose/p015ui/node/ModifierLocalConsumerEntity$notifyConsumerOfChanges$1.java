package androidx.compose.p015ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ModifierLocalConsumerEntity.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.ModifierLocalConsumerEntity$notifyConsumerOfChanges$1 */
/* loaded from: classes.dex */
public final class ModifierLocalConsumerEntity$notifyConsumerOfChanges$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ ModifierLocalConsumerEntity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModifierLocalConsumerEntity$notifyConsumerOfChanges$1(ModifierLocalConsumerEntity modifierLocalConsumerEntity) {
        super(0);
        this.this$0 = modifierLocalConsumerEntity;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.this$0.getModifier().onModifierLocalsUpdated(this.this$0);
    }
}
