package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlinx.coroutines.i */
/* loaded from: classes7.dex */
public final class C37734i {
    @NotNull
    /* renamed from: a */
    public static final <T> Deferred<T> m16323a(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return C37756k.m16224a(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    /* renamed from: b */
    public static /* synthetic */ Deferred m16322b(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        return C37756k.m16223b(coroutineScope, coroutineContext, coroutineStart, function2, i, obj);
    }

    @NotNull
    /* renamed from: c */
    public static final InterfaceC37708b2 m16321c(@NotNull CoroutineScope coroutineScope, @NotNull CoroutineContext coroutineContext, @NotNull CoroutineStart coroutineStart, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return C37756k.m16222c(coroutineScope, coroutineContext, coroutineStart, function2);
    }

    /* renamed from: d */
    public static /* synthetic */ InterfaceC37708b2 m16320d(CoroutineScope coroutineScope, CoroutineContext coroutineContext, CoroutineStart coroutineStart, Function2 function2, int i, Object obj) {
        return C37756k.m16221d(coroutineScope, coroutineContext, coroutineStart, function2, i, obj);
    }

    /* renamed from: e */
    public static final <T> T m16319e(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) throws InterruptedException {
        return (T) C37739j.m16313a(coroutineContext, function2);
    }

    /* renamed from: f */
    public static /* synthetic */ Object m16318f(CoroutineContext coroutineContext, Function2 function2, int i, Object obj) throws InterruptedException {
        return C37739j.m16312b(coroutineContext, function2, i, obj);
    }

    @Nullable
    /* renamed from: g */
    public static final <T> Object m16317g(@NotNull CoroutineContext coroutineContext, @NotNull Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
        return C37756k.m16220e(coroutineContext, function2, continuation);
    }
}
