package p804nd;

import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Lazy.kt */
@Metadata
/* renamed from: nd.h */
/* loaded from: classes5.dex */
public final class C38500h<T> implements InterfaceC38501j<T>, Serializable {

    /* renamed from: b */
    private final T f101864b;

    public C38500h(T t) {
        this.f101864b = t;
    }

    @Override // p804nd.InterfaceC38501j
    public T getValue() {
        return this.f101864b;
    }

    @Override // p804nd.InterfaceC38501j
    public boolean isInitialized() {
        return true;
    }

    @NotNull
    public String toString() {
        return String.valueOf(getValue());
    }
}
