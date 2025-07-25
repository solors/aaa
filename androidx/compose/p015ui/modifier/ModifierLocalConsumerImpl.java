package androidx.compose.p015ui.modifier;

import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.platform.InspectorValueInfo;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ModifierLocalConsumer.kt */
@Stable
@Metadata
/* renamed from: androidx.compose.ui.modifier.ModifierLocalConsumerImpl */
/* loaded from: classes.dex */
final class ModifierLocalConsumerImpl extends InspectorValueInfo implements ModifierLocalConsumer {
    @NotNull
    private final Function1<ModifierLocalReadScope, Unit> consumer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModifierLocalConsumerImpl(@NotNull Function1<? super ModifierLocalReadScope, Unit> consumer, @NotNull Function1<? super InspectorInfo, Unit> debugInspectorInfo) {
        super(debugInspectorInfo);
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        Intrinsics.checkNotNullParameter(debugInspectorInfo, "debugInspectorInfo");
        this.consumer = consumer;
    }

    public boolean equals(@Nullable Object obj) {
        if ((obj instanceof ModifierLocalConsumerImpl) && Intrinsics.m17075f(((ModifierLocalConsumerImpl) obj).consumer, this.consumer)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Function1<ModifierLocalReadScope, Unit> getConsumer() {
        return this.consumer;
    }

    public int hashCode() {
        return this.consumer.hashCode();
    }

    @Override // androidx.compose.p015ui.modifier.ModifierLocalConsumer
    public void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.consumer.invoke(scope);
    }
}
