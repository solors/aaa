package je;

import ie.C33639k;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;
import sd.IntrinsicsJvm;

@Metadata
/* renamed from: je.a */
/* loaded from: classes8.dex */
public final class Cancellable {
    /* renamed from: a */
    private static final void m18370a(Continuation<?> continuation, Throwable th) {
        Result.C38506a c38506a = Result.f101870c;
        continuation.resumeWith(Result.m14549b(C38508r.m14540a(th)));
        throw th;
    }

    /* renamed from: b */
    public static final void m18369b(@NotNull Continuation<? super Unit> continuation, @NotNull Continuation<?> continuation2) {
        Continuation m6961c;
        try {
            m6961c = IntrinsicsJvm.m6961c(continuation);
            Result.C38506a c38506a = Result.f101870c;
            C33639k.m22960c(m6961c, Result.m14549b(Unit.f99208a), null, 2, null);
        } catch (Throwable th) {
            m18370a(continuation2, th);
        }
    }

    /* renamed from: c */
    public static final <R, T> void m18368c(@NotNull Function2<? super R, ? super Continuation<? super T>, ? extends Object> function2, R r, @NotNull Continuation<? super T> continuation, @Nullable Function1<? super Throwable, Unit> function1) {
        Continuation m6963a;
        Continuation m6961c;
        try {
            m6963a = IntrinsicsJvm.m6963a(function2, r, continuation);
            m6961c = IntrinsicsJvm.m6961c(m6963a);
            Result.C38506a c38506a = Result.f101870c;
            C33639k.m22961b(m6961c, Result.m14549b(Unit.f99208a), function1);
        } catch (Throwable th) {
            m18370a(continuation, th);
        }
    }

    /* renamed from: d */
    public static /* synthetic */ void m18367d(Function2 function2, Object obj, Continuation continuation, Function1 function1, int i, Object obj2) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        m18368c(function2, obj, continuation, function1);
    }
}
