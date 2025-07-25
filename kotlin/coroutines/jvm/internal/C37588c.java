package kotlin.coroutines.jvm.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;

/* compiled from: ContinuationImpl.kt */
@Metadata
/* renamed from: kotlin.coroutines.jvm.internal.c */
/* loaded from: classes7.dex */
public final class C37588c implements Continuation<Object> {
    @NotNull

    /* renamed from: b */
    public static final C37588c f99293b = new C37588c();

    private C37588c() {
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        throw new IllegalStateException("This continuation is already complete".toString());
    }

    @NotNull
    public String toString() {
        return "This continuation is already complete";
    }
}
