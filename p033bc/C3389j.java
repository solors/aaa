package p033bc;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata
/* renamed from: bc.j */
/* loaded from: classes9.dex */
public final class C3389j implements CoroutineContext.Element {
    @NotNull

    /* renamed from: c */
    public static final C3390a f1695c = new C3390a(null);
    @NotNull

    /* renamed from: b */
    private final CoroutineContext f1696b;

    /* compiled from: Utils.kt */
    @Metadata
    /* renamed from: bc.j$a */
    /* loaded from: classes9.dex */
    public static final class C3390a implements CoroutineContext.InterfaceC37576b<C3389j> {
        private C3390a() {
        }

        public /* synthetic */ C3390a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C3389j(@NotNull CoroutineContext callContext) {
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        this.f1696b = callContext;
    }

    @NotNull
    /* renamed from: c */
    public final CoroutineContext m103813c() {
        return this.f1696b;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.C37573a.m17118a(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC37576b<E> interfaceC37576b) {
        return (E) CoroutineContext.Element.C37573a.m17117b(this, interfaceC37576b);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.InterfaceC37576b<?> getKey() {
        return f1695c;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC37576b<?> interfaceC37576b) {
        return CoroutineContext.Element.C37573a.m17116c(this, interfaceC37576b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.C37573a.m17115d(this, coroutineContext);
    }
}
