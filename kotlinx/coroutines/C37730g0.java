package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;

/* compiled from: CompletionState.kt */
@Metadata
/* renamed from: kotlinx.coroutines.g0 */
/* loaded from: classes7.dex */
public final class C37730g0 {
    @NotNull
    /* renamed from: a */
    public static final <T> Object m16347a(@Nullable Object obj, @NotNull Continuation<? super T> continuation) {
        if (obj instanceof CompletionState) {
            Result.C38506a c38506a = Result.f101870c;
            return Result.m14549b(C38508r.m14540a(((CompletionState) obj).f99520a));
        }
        return Result.m14549b(obj);
    }

    @Nullable
    /* renamed from: b */
    public static final <T> Object m16346b(@NotNull Object obj, @Nullable Function1<? super Throwable, Unit> function1) {
        Throwable m14546e = Result.m14546e(obj);
        if (m14546e == null) {
            if (function1 != null) {
                return new C37715d0(obj, function1);
            }
            return obj;
        }
        return new CompletionState(m14546e, false, 2, null);
    }

    @Nullable
    /* renamed from: c */
    public static final <T> Object m16345c(@NotNull Object obj, @NotNull InterfaceC37780o<?> interfaceC37780o) {
        Throwable m14546e = Result.m14546e(obj);
        if (m14546e != null) {
            return new CompletionState(m14546e, false, 2, null);
        }
        return obj;
    }

    /* renamed from: d */
    public static /* synthetic */ Object m16344d(Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        return m16346b(obj, function1);
    }
}
