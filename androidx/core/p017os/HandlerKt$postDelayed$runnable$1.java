package androidx.core.p017os;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;

/* compiled from: Handler.kt */
@Metadata
/* renamed from: androidx.core.os.HandlerKt$postDelayed$runnable$1 */
/* loaded from: classes.dex */
public final class HandlerKt$postDelayed$runnable$1 implements Runnable {
    final /* synthetic */ Functions<Unit> $action;

    public HandlerKt$postDelayed$runnable$1(Functions<Unit> functions) {
        this.$action = functions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
