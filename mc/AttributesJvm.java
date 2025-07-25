package mc;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import mc.InterfaceC38258b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: mc.c */
/* loaded from: classes9.dex */
abstract class AttributesJvm implements InterfaceC38258b {
    @Override // mc.InterfaceC38258b
    @NotNull
    /* renamed from: a */
    public final List<Attributes<?>> mo15255a() {
        List<Attributes<?>> m17553Z0;
        m17553Z0 = _Collections.m17553Z0(mo15219h().keySet());
        return m17553Z0;
    }

    @Override // mc.InterfaceC38258b
    @Nullable
    /* renamed from: b */
    public final <T> T mo15254b(@NotNull Attributes<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) mo15219h().get(key);
    }

    @Override // mc.InterfaceC38258b
    /* renamed from: d */
    public final <T> void mo15253d(@NotNull Attributes<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        mo15219h().remove(key);
    }

    @Override // mc.InterfaceC38258b
    @NotNull
    /* renamed from: e */
    public <T> T mo15252e(@NotNull Attributes<T> attributes) {
        return (T) InterfaceC38258b.C38259a.m15256a(this, attributes);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mc.InterfaceC38258b
    /* renamed from: f */
    public final <T> void mo15251f(@NotNull Attributes<T> key, @NotNull T value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        mo15219h().put(key, value);
    }

    @Override // mc.InterfaceC38258b
    /* renamed from: g */
    public final boolean mo15250g(@NotNull Attributes<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return mo15219h().containsKey(key);
    }

    @NotNull
    /* renamed from: h */
    protected abstract Map<Attributes<?>, Object> mo15219h();
}
