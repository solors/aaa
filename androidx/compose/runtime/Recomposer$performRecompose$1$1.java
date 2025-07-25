package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Recomposer.kt */
@Metadata
/* loaded from: classes.dex */
public final class Recomposer$performRecompose$1$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ ControlledComposition $composition;
    final /* synthetic */ IdentityArraySet<Object> $modifiedValues;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$performRecompose$1$1(IdentityArraySet<Object> identityArraySet, ControlledComposition controlledComposition) {
        super(0);
        this.$modifiedValues = identityArraySet;
        this.$composition = controlledComposition;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        IdentityArraySet<Object> identityArraySet = this.$modifiedValues;
        ControlledComposition controlledComposition = this.$composition;
        for (Object obj : identityArraySet) {
            controlledComposition.recordWriteOf(obj);
        }
    }
}
