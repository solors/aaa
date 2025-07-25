package mc;

import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AttributesJvm.kt */
@Metadata
/* renamed from: mc.p */
/* loaded from: classes9.dex */
final class C38273p extends AttributesJvm {
    @NotNull

    /* renamed from: a */
    private final Map<Attributes<?>, Object> f101152a = new HashMap();

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
        Object put = mo15219h().put(key, invoke);
        if (put != null) {
            invoke = (T) put;
        }
        Intrinsics.m17073h(invoke, "null cannot be cast to non-null type T of io.ktor.util.HashMapAttributes.computeIfAbsent");
        return invoke;
    }

    @Override // mc.AttributesJvm
    @NotNull
    /* renamed from: h */
    protected Map<Attributes<?>, Object> mo15219h() {
        return this.f101152a;
    }
}
