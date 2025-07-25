package p1059ya;

import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.InterfaceC37618e;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata
/* renamed from: ya.t */
/* loaded from: classes8.dex */
final class C45082t<T> implements InterfaceC37618e<Object, T> {
    @Nullable

    /* renamed from: a */
    private WeakReference<T> f118568a;

    public C45082t(@Nullable T t) {
        WeakReference<T> weakReference;
        if (t != null) {
            weakReference = new WeakReference<>(t);
        } else {
            weakReference = null;
        }
        this.f118568a = weakReference;
    }

    @Override // kotlin.properties.InterfaceC37618e, kotlin.properties.Interfaces
    @Nullable
    public T getValue(@Nullable Object obj, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        WeakReference<T> weakReference = this.f118568a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // kotlin.properties.InterfaceC37618e
    public void setValue(@Nullable Object obj, @NotNull KProperty<?> property, @Nullable T t) {
        WeakReference<T> weakReference;
        Intrinsics.checkNotNullParameter(property, "property");
        if (t != null) {
            weakReference = new WeakReference<>(t);
        } else {
            weakReference = null;
        }
        this.f118568a = weakReference;
    }
}
