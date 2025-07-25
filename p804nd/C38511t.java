package p804nd;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
@Metadata
/* renamed from: nd.t */
/* loaded from: classes5.dex */
public final class C38511t<T> implements InterfaceC38501j<T>, Serializable {
    @Nullable

    /* renamed from: b */
    private Functions<? extends T> f101878b;
    @Nullable

    /* renamed from: c */
    private volatile Object f101879c;
    @NotNull

    /* renamed from: d */
    private final Object f101880d;

    public C38511t(@NotNull Functions<? extends T> initializer, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f101878b = initializer;
        this.f101879c = Lazy.f101852a;
        this.f101880d = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new C38500h(getValue());
    }

    @Override // p804nd.InterfaceC38501j
    public T getValue() {
        T t;
        T t2 = (T) this.f101879c;
        Lazy lazy = Lazy.f101852a;
        if (t2 != lazy) {
            return t2;
        }
        synchronized (this.f101880d) {
            t = (T) this.f101879c;
            if (t == lazy) {
                Functions<? extends T> functions = this.f101878b;
                Intrinsics.m17074g(functions);
                t = functions.invoke();
                this.f101879c = t;
                this.f101878b = null;
            }
        }
        return t;
    }

    @Override // p804nd.InterfaceC38501j
    public boolean isInitialized() {
        if (this.f101879c != Lazy.f101852a) {
            return true;
        }
        return false;
    }

    @NotNull
    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }

    public /* synthetic */ C38511t(Functions functions, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(functions, (i & 2) != 0 ? null : obj);
    }
}
