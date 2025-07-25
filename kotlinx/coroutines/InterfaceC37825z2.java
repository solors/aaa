package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: ThreadContextElement.kt */
@Metadata
/* renamed from: kotlinx.coroutines.z2 */
/* loaded from: classes7.dex */
public interface InterfaceC37825z2<S> extends CoroutineContext.Element {

    /* compiled from: ThreadContextElement.kt */
    @Metadata
    /* renamed from: kotlinx.coroutines.z2$a */
    /* loaded from: classes7.dex */
    public static final class C37826a {
        /* renamed from: a */
        public static <S, R> R m16058a(@NotNull InterfaceC37825z2<S> interfaceC37825z2, R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
            return (R) CoroutineContext.Element.C37573a.m17118a(interfaceC37825z2, r, function2);
        }

        @NotNull
        /* renamed from: b */
        public static <S> CoroutineContext m16057b(@NotNull InterfaceC37825z2<S> interfaceC37825z2, @NotNull CoroutineContext coroutineContext) {
            return CoroutineContext.Element.C37573a.m17115d(interfaceC37825z2, coroutineContext);
        }
    }

    void restoreThreadContext(@NotNull CoroutineContext coroutineContext, S s);

    S updateThreadContext(@NotNull CoroutineContext coroutineContext);
}
