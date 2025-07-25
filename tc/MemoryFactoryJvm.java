package tc;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: tc.b */
/* loaded from: classes9.dex */
public final class MemoryFactoryJvm implements MemoryFactory {
    @NotNull

    /* renamed from: a */
    public static final MemoryFactoryJvm f116541a = new MemoryFactoryJvm();

    private MemoryFactoryJvm() {
    }

    @Override // tc.MemoryFactory
    /* renamed from: a */
    public void mo3124a(@NotNull ByteBuffer instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // tc.MemoryFactory
    @NotNull
    /* renamed from: b */
    public ByteBuffer mo3123b(int i) {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        Intrinsics.checkNotNullExpressionValue(allocate, "allocate(size)");
        return MemoryJvm.m3121b(allocate);
    }
}
