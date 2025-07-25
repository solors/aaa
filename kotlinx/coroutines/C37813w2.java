package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Builders.common.kt */
@Metadata
/* renamed from: kotlinx.coroutines.w2 */
/* loaded from: classes7.dex */
public class C37813w2 extends AbstractCoroutine<Unit> {
    public C37813w2(@NotNull CoroutineContext coroutineContext, boolean z) {
        super(coroutineContext, true, z);
    }

    @Override // kotlinx.coroutines.C37745j2
    /* renamed from: q0 */
    protected boolean mo16082q0(@NotNull Throwable th) {
        C37774m0.m16176a(getContext(), th);
        return true;
    }
}
