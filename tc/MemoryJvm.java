package tc;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: tc.c */
/* loaded from: classes9.dex */
public final class MemoryJvm {
    @NotNull

    /* renamed from: a */
    public static final C44399a f116542a = new C44399a(null);
    @NotNull

    /* renamed from: b */
    private static final ByteBuffer f116543b;

    /* compiled from: MemoryJvm.kt */
    @Metadata
    /* renamed from: tc.c$a */
    /* loaded from: classes9.dex */
    public static final class C44399a {
        private C44399a() {
        }

        public /* synthetic */ C44399a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final ByteBuffer m3118a() {
            return MemoryJvm.f116543b;
        }
    }

    static {
        ByteBuffer order = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        Intrinsics.checkNotNullExpressionValue(order, "allocate(0).order(ByteOrder.BIG_ENDIAN)");
        f116543b = m3121b(order);
    }

    @NotNull
    /* renamed from: b */
    public static ByteBuffer m3121b(@NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        return buffer;
    }

    /* renamed from: c */
    public static final void m3120c(ByteBuffer byteBuffer, @NotNull ByteBuffer destination, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (byteBuffer.hasArray() && destination.hasArray() && !byteBuffer.isReadOnly() && !destination.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i, destination.array(), destination.arrayOffset() + i3, i2);
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i);
        duplicate.limit(i + i2);
        ByteBuffer duplicate2 = destination.duplicate();
        duplicate2.position(i3);
        duplicate2.put(duplicate);
    }

    @NotNull
    /* renamed from: d */
    public static final ByteBuffer m3119d(ByteBuffer byteBuffer, int i, int i2) {
        return m3121b(C44400d.m3114d(byteBuffer, i, i2));
    }
}
