package p704he;

import kotlin.Metadata;
import kotlin.coroutines.C37586g;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* compiled from: SafeCollector.kt */
@Metadata
/* renamed from: he.q */
/* loaded from: classes8.dex */
final class C33530q implements Continuation<Object> {
    @NotNull

    /* renamed from: b */
    public static final C33530q f91527b = new C33530q();
    @NotNull

    /* renamed from: c */
    private static final CoroutineContext f91528c = C37586g.f99289b;

    private C33530q() {
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return f91528c;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
    }
}
