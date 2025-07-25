package androidx.compose.p015ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NestedScrollModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$calculateNestedScrollScope$1 */
/* loaded from: classes.dex */
public final class NestedScrollDispatcher$calculateNestedScrollScope$1 extends Lambda implements Functions<CoroutineScope> {
    final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$calculateNestedScrollScope$1(NestedScrollDispatcher nestedScrollDispatcher) {
        super(0);
        this.this$0 = nestedScrollDispatcher;
    }

    @Override // kotlin.jvm.functions.Functions
    @Nullable
    public final CoroutineScope invoke() {
        return this.this$0.getOriginNestedScrollScope$ui_release();
    }
}
