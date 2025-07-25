package androidx.compose.p015ui.node;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModifierLocalConsumerEntity.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.ModifierLocalConsumerEntity$Companion$onReadValuesChanged$1 */
/* loaded from: classes.dex */
final class ModifierLocalConsumerEntity$Companion$onReadValuesChanged$1 extends Lambda implements Function1<ModifierLocalConsumerEntity, Unit> {
    public static final ModifierLocalConsumerEntity$Companion$onReadValuesChanged$1 INSTANCE = new ModifierLocalConsumerEntity$Companion$onReadValuesChanged$1();

    ModifierLocalConsumerEntity$Companion$onReadValuesChanged$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ModifierLocalConsumerEntity modifierLocalConsumerEntity) {
        invoke2(modifierLocalConsumerEntity);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull ModifierLocalConsumerEntity node) {
        Intrinsics.checkNotNullParameter(node, "node");
        node.notifyConsumerOfChanges();
    }
}
