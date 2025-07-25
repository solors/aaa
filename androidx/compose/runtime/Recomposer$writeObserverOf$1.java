package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Recomposer.kt */
@Metadata
/* loaded from: classes.dex */
public final class Recomposer$writeObserverOf$1 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ ControlledComposition $composition;
    final /* synthetic */ IdentityArraySet<Object> $modifiedValues;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$writeObserverOf$1(ControlledComposition controlledComposition, IdentityArraySet<Object> identityArraySet) {
        super(1);
        this.$composition = controlledComposition;
        this.$modifiedValues = identityArraySet;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
        invoke2(obj);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.$composition.recordWriteOf(value);
        IdentityArraySet<Object> identityArraySet = this.$modifiedValues;
        if (identityArraySet != null) {
            identityArraySet.add(value);
        }
    }
}
