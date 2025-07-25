package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ProduceState.kt */
@Metadata
/* loaded from: classes.dex */
public final class ProduceStateScopeImpl<T> implements ProduceState<T>, SnapshotState<T> {
    private final /* synthetic */ SnapshotState<T> $$delegate_0;
    @NotNull
    private final CoroutineContext coroutineContext;

    public ProduceStateScopeImpl(@NotNull SnapshotState<T> state, @NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        this.coroutineContext = coroutineContext;
        this.$$delegate_0 = state;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    @Override // androidx.compose.runtime.ProduceState
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object awaitDispose(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Functions<kotlin.Unit> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = (androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1 r0 = new androidx.compose.runtime.ProduceStateScopeImpl$awaitDispose$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            java.lang.Object r5 = r0.L$0
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Functions) r5
            p804nd.C38508r.m14539b(r6)     // Catch: java.lang.Throwable -> L5e
            goto L58
        L35:
            p804nd.C38508r.m14539b(r6)
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L5e
            r0.label = r3     // Catch: java.lang.Throwable -> L5e
            kotlinx.coroutines.p r6 = new kotlinx.coroutines.p     // Catch: java.lang.Throwable -> L5e
            kotlin.coroutines.d r2 = sd.C42683b.m6966c(r0)     // Catch: java.lang.Throwable -> L5e
            r6.<init>(r2, r3)     // Catch: java.lang.Throwable -> L5e
            r6.m16132y()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r6 = r6.m16135u()     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r2 = sd.C42683b.m6964e()     // Catch: java.lang.Throwable -> L5e
            if (r6 != r2) goto L55
            kotlin.coroutines.jvm.internal.C37591h.m17084c(r0)     // Catch: java.lang.Throwable -> L5e
        L55:
            if (r6 != r1) goto L58
            return r1
        L58:
            nd.i r6 = new nd.i     // Catch: java.lang.Throwable -> L5e
            r6.<init>()     // Catch: java.lang.Throwable -> L5e
            throw r6     // Catch: java.lang.Throwable -> L5e
        L5e:
            r6 = move-exception
            r5.invoke()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProduceStateScopeImpl.awaitDispose(kotlin.jvm.functions.Function0, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.runtime.SnapshotState
    public T component1() {
        return this.$$delegate_0.component1();
    }

    @Override // androidx.compose.runtime.SnapshotState
    @NotNull
    public Function1<T, Unit> component2() {
        return this.$$delegate_0.component2();
    }

    @Override // androidx.compose.runtime.ProduceState, kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.compose.runtime.SnapshotState, androidx.compose.runtime.State
    public T getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // androidx.compose.runtime.SnapshotState
    public void setValue(T t) {
        this.$$delegate_0.setValue(t);
    }
}
