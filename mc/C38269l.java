package mc;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AttributesJvm.kt */
@Metadata
/* renamed from: mc.l */
/* loaded from: classes9.dex */
final class C38269l extends AttributesJvm {
    @NotNull

    /* renamed from: a */
    private final ConcurrentHashMap<Attributes<?>, Object> f101143a = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mc.InterfaceC38258b
    @NotNull
    /* renamed from: c */
    public <T> T mo15220c(@NotNull Attributes<T> key, @NotNull Functions<? extends T> block) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(block, "block");
        T t = (T) mo15219h().get(key);
        if (t != null) {
            return t;
        }
        T invoke = block.invoke();
        Object putIfAbsent = mo15219h().putIfAbsent(key, invoke);
        if (putIfAbsent != null) {
            invoke = (T) putIfAbsent;
        }
        Intrinsics.m17073h(invoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // mc.AttributesJvm
    @NotNull
    /* renamed from: i */
    public ConcurrentHashMap<Attributes<?>, Object> mo15219h() {
        return this.f101143a;
    }
}
