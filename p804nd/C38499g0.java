package p804nd;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Lazy.kt */
@Metadata
/* renamed from: nd.g0 */
/* loaded from: classes5.dex */
public final class C38499g0<T> implements InterfaceC38501j<T>, Serializable {
    @Nullable

    /* renamed from: b */
    private Functions<? extends T> f101862b;
    @Nullable

    /* renamed from: c */
    private Object f101863c;

    public C38499g0(@NotNull Functions<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f101862b = initializer;
        this.f101863c = Lazy.f101852a;
    }

    private final Object writeReplace() {
        return new C38500h(getValue());
    }

    @Override // p804nd.InterfaceC38501j
    public T getValue() {
        if (this.f101863c == Lazy.f101852a) {
            Functions<? extends T> functions = this.f101862b;
            Intrinsics.m17074g(functions);
            this.f101863c = functions.invoke();
            this.f101862b = null;
        }
        return (T) this.f101863c;
    }

    @Override // p804nd.InterfaceC38501j
    public boolean isInitialized() {
        if (this.f101863c != Lazy.f101852a) {
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
}
