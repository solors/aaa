package ie;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.InterfaceC37825z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: ie.l0 */
/* loaded from: classes8.dex */
public final class ThreadContext {
    @NotNull

    /* renamed from: a */
    public static final Symbol f92106a = new Symbol("NO_THREAD_ELEMENTS");
    @NotNull

    /* renamed from: b */
    private static final Function2<Object, CoroutineContext.Element, Object> f92107b = C33641a.f92110g;
    @NotNull

    /* renamed from: c */
    private static final Function2<InterfaceC37825z2<?>, CoroutineContext.Element, InterfaceC37825z2<?>> f92108c = C33642b.f92111g;
    @NotNull

    /* renamed from: d */
    private static final Function2<C33652r0, CoroutineContext.Element, C33652r0> f92109d = C33643c.f92112g;

    /* compiled from: ThreadContext.kt */
    @Metadata
    /* renamed from: ie.l0$a */
    /* loaded from: classes8.dex */
    static final class C33641a extends Lambda implements Function2<Object, CoroutineContext.Element, Object> {

        /* renamed from: g */
        public static final C33641a f92110g = new C33641a();

        C33641a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a */
        public final Object mo105910invoke(@Nullable Object obj, @NotNull CoroutineContext.Element element) {
            Integer num;
            int i;
            if (element instanceof InterfaceC37825z2) {
                if (obj instanceof Integer) {
                    num = (Integer) obj;
                } else {
                    num = null;
                }
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 1;
                }
                if (i != 0) {
                    return Integer.valueOf(i + 1);
                }
                return element;
            }
            return obj;
        }
    }

    /* compiled from: ThreadContext.kt */
    @Metadata
    /* renamed from: ie.l0$b */
    /* loaded from: classes8.dex */
    static final class C33642b extends Lambda implements Function2<InterfaceC37825z2<?>, CoroutineContext.Element, InterfaceC37825z2<?>> {

        /* renamed from: g */
        public static final C33642b f92111g = new C33642b();

        C33642b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* renamed from: a */
        public final InterfaceC37825z2<?> mo105910invoke(@Nullable InterfaceC37825z2<?> interfaceC37825z2, @NotNull CoroutineContext.Element element) {
            if (interfaceC37825z2 != null) {
                return interfaceC37825z2;
            }
            if (element instanceof InterfaceC37825z2) {
                return (InterfaceC37825z2) element;
            }
            return null;
        }
    }

    /* compiled from: ThreadContext.kt */
    @Metadata
    /* renamed from: ie.l0$c */
    /* loaded from: classes8.dex */
    static final class C33643c extends Lambda implements Function2<C33652r0, CoroutineContext.Element, C33652r0> {

        /* renamed from: g */
        public static final C33643c f92112g = new C33643c();

        C33643c() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        @NotNull
        /* renamed from: a */
        public final C33652r0 mo105910invoke(@NotNull C33652r0 c33652r0, @NotNull CoroutineContext.Element element) {
            if (element instanceof InterfaceC37825z2) {
                InterfaceC37825z2<?> interfaceC37825z2 = (InterfaceC37825z2) element;
                c33652r0.m22915a(interfaceC37825z2, interfaceC37825z2.updateThreadContext(c33652r0.f92129a));
            }
            return c33652r0;
        }
    }

    /* renamed from: a */
    public static final void m22946a(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == f92106a) {
            return;
        }
        if (obj instanceof C33652r0) {
            ((C33652r0) obj).m22914b(coroutineContext);
            return;
        }
        Object fold = coroutineContext.fold(null, f92108c);
        Intrinsics.m17073h(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((InterfaceC37825z2) fold).restoreThreadContext(coroutineContext, obj);
    }

    @NotNull
    /* renamed from: b */
    public static final Object m22945b(@NotNull CoroutineContext coroutineContext) {
        Object fold = coroutineContext.fold(0, f92107b);
        Intrinsics.m17074g(fold);
        return fold;
    }

    @Nullable
    /* renamed from: c */
    public static final Object m22944c(@NotNull CoroutineContext coroutineContext, @Nullable Object obj) {
        if (obj == null) {
            obj = m22945b(coroutineContext);
        }
        if (obj == 0) {
            return f92106a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new C33652r0(coroutineContext, ((Number) obj).intValue()), f92109d);
        }
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((InterfaceC37825z2) obj).updateThreadContext(coroutineContext);
    }
}
