package androidx.work;

import androidx.work.Operation;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C37784p;
import sd.C42688d;
import sd.IntrinsicsJvm;

/* compiled from: Operation.kt */
@Metadata
/* loaded from: classes2.dex */
public final class OperationKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Type inference failed for: r5v8 */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object await(@org.jetbrains.annotations.NotNull androidx.work.Operation r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.work.Operation.State.SUCCESS> r5) {
        /*
            boolean r0 = r5 instanceof androidx.work.OperationKt$await$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.work.OperationKt$await$1 r0 = (androidx.work.OperationKt$await$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.work.OperationKt$await$1 r0 = new androidx.work.OperationKt$await$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = sd.C42683b.m6964e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.L$0
            com.google.common.util.concurrent.ListenableFuture r4 = (com.google.common.util.concurrent.ListenableFuture) r4
            p804nd.C38508r.m14539b(r5)
            goto L88
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            p804nd.C38508r.m14539b(r5)
            com.google.common.util.concurrent.ListenableFuture r4 = r4.getResult()
            java.lang.String r5 = "result"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            boolean r5 = r4.isDone()
            if (r5 == 0) goto L56
            java.lang.Object r4 = r4.get()     // Catch: java.util.concurrent.ExecutionException -> L4c
            goto L89
        L4c:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 != 0) goto L54
            goto L55
        L54:
            r4 = r5
        L55:
            throw r4
        L56:
            r0.L$0 = r4
            r0.label = r3
            kotlinx.coroutines.p r5 = new kotlinx.coroutines.p
            kotlin.coroutines.d r2 = sd.C42683b.m6966c(r0)
            r5.<init>(r2, r3)
            r5.m16132y()
            androidx.work.ListenableFutureKt$await$2$1 r2 = new androidx.work.ListenableFutureKt$await$2$1
            r2.<init>(r5, r4)
            androidx.work.DirectExecutor r3 = androidx.work.DirectExecutor.INSTANCE
            r4.addListener(r2, r3)
            androidx.work.ListenableFutureKt$await$2$2 r2 = new androidx.work.ListenableFutureKt$await$2$2
            r2.<init>(r4)
            r5.mo15160z(r2)
            java.lang.Object r5 = r5.m16135u()
            java.lang.Object r4 = sd.C42683b.m6964e()
            if (r5 != r4) goto L85
            kotlin.coroutines.jvm.internal.C37591h.m17084c(r0)
        L85:
            if (r5 != r1) goto L88
            return r1
        L88:
            r4 = r5
        L89:
            java.lang.String r5 = "result.await()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.OperationKt.await(androidx.work.Operation, kotlin.coroutines.d):java.lang.Object");
    }

    private static final Object await$$forInline(Operation operation, Continuation<? super Operation.State.SUCCESS> continuation) {
        Object obj;
        Continuation m6961c;
        Object m6959e;
        ListenableFuture<Operation.State.SUCCESS> result = operation.getResult();
        Intrinsics.checkNotNullExpressionValue(result, "result");
        if (result.isDone()) {
            try {
                obj = result.get();
            } catch (ExecutionException e) {
                Throwable cause = e.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw e;
            }
        } else {
            InlineMarker.m17016c(0);
            m6961c = IntrinsicsJvm.m6961c(continuation);
            C37784p c37784p = new C37784p(m6961c, 1);
            c37784p.m16132y();
            result.addListener(new ListenableFutureKt$await$2$1(c37784p, result), DirectExecutor.INSTANCE);
            c37784p.mo15160z(new ListenableFutureKt$await$2$2(result));
            Unit unit = Unit.f99208a;
            obj = c37784p.m16135u();
            m6959e = C42688d.m6959e();
            if (obj == m6959e) {
                C37591h.m17084c(continuation);
            }
            InlineMarker.m17016c(1);
        }
        Intrinsics.checkNotNullExpressionValue(obj, "result.await()");
        return obj;
    }
}
