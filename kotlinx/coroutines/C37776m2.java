package kotlinx.coroutines;

import je.Cancellable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import sd.IntrinsicsJvm;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
@Metadata
/* renamed from: kotlinx.coroutines.m2 */
/* loaded from: classes7.dex */
public final class C37776m2 extends C37813w2 {
    @NotNull

    /* renamed from: f */
    private final Continuation<Unit> f99619f;

    public C37776m2(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        super(coroutineContext, false);
        Continuation<Unit> m6963a;
        m6963a = IntrinsicsJvm.m6963a(function2, this, this);
        this.f99619f = m6963a;
    }

    @Override // kotlinx.coroutines.C37745j2
    /* renamed from: I0 */
    protected void mo16173I0() {
        Cancellable.m18369b(this.f99619f, this);
    }
}
