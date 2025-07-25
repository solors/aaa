package kotlin.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.Result;
import sd.C42688d;
import sd.IntrinsicsJvm;

/* compiled from: Continuation.kt */
@Metadata
/* renamed from: kotlin.coroutines.f */
/* loaded from: classes7.dex */
public final class C37585f {
    @NotNull
    /* renamed from: a */
    public static final <R, T> Continuation<Unit> m17103a(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, @NotNull Continuation<? super T> completion) {
        Continuation m6963a;
        Continuation m6961c;
        Object m6959e;
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        m6963a = IntrinsicsJvm.m6963a(function2, r, completion);
        m6961c = IntrinsicsJvm.m6961c(m6963a);
        m6959e = C42688d.m6959e();
        return new SafeContinuationJvm(m6961c, m6959e);
    }

    /* renamed from: b */
    public static final <R, T> void m17102b(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, @NotNull Continuation<? super T> completion) {
        Continuation m6963a;
        Continuation m6961c;
        Intrinsics.checkNotNullParameter(function2, "<this>");
        Intrinsics.checkNotNullParameter(completion, "completion");
        m6963a = IntrinsicsJvm.m6963a(function2, r, completion);
        m6961c = IntrinsicsJvm.m6961c(m6963a);
        Result.C38506a c38506a = Result.f101870c;
        m6961c.resumeWith(Result.m14549b(Unit.f99208a));
    }
}
