package p804nd;

import androidx.concurrent.futures.C1074a;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
@Metadata
/* renamed from: nd.s */
/* loaded from: classes5.dex */
public final class C38509s<T> implements InterfaceC38501j<T>, Serializable {
    @NotNull

    /* renamed from: f */
    public static final C38510a f101873f = new C38510a(null);

    /* renamed from: g */
    private static final AtomicReferenceFieldUpdater<C38509s<?>, Object> f101874g = AtomicReferenceFieldUpdater.newUpdater(C38509s.class, Object.class, ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM);
    @Nullable

    /* renamed from: b */
    private volatile Functions<? extends T> f101875b;
    @Nullable

    /* renamed from: c */
    private volatile Object f101876c;
    @NotNull

    /* renamed from: d */
    private final Object f101877d;

    /* compiled from: LazyJVM.kt */
    @Metadata
    /* renamed from: nd.s$a */
    /* loaded from: classes5.dex */
    public static final class C38510a {
        private C38510a() {
        }

        public /* synthetic */ C38510a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C38509s(@NotNull Functions<? extends T> initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f101875b = initializer;
        Lazy lazy = Lazy.f101852a;
        this.f101876c = lazy;
        this.f101877d = lazy;
    }

    private final Object writeReplace() {
        return new C38500h(getValue());
    }

    @Override // p804nd.InterfaceC38501j
    public T getValue() {
        T t = (T) this.f101876c;
        Lazy lazy = Lazy.f101852a;
        if (t != lazy) {
            return t;
        }
        Functions<? extends T> functions = this.f101875b;
        if (functions != null) {
            T invoke = functions.invoke();
            if (C1074a.m105283a(f101874g, this, lazy, invoke)) {
                this.f101875b = null;
                return invoke;
            }
        }
        return (T) this.f101876c;
    }

    @Override // p804nd.InterfaceC38501j
    public boolean isInitialized() {
        if (this.f101876c != Lazy.f101852a) {
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
