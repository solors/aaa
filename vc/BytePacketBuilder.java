package vc;

import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1029wc.ChunkBuffer;
import p1061yc.InterfaceC45101f;

@Metadata
/* renamed from: vc.i */
/* loaded from: classes9.dex */
public final class BytePacketBuilder extends Output {
    public BytePacketBuilder() {
        this(null, 1, null);
    }

    @Override // vc.Output
    @NotNull
    /* renamed from: R */
    public BytePacketBuilder mo2406e(char c) {
        Output append = super.append(c);
        Intrinsics.m17073h(append, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (BytePacketBuilder) append;
    }

    @Override // vc.Output
    @NotNull
    /* renamed from: S */
    public BytePacketBuilder mo2405f(@Nullable CharSequence charSequence) {
        Output append = super.append(charSequence);
        Intrinsics.m17073h(append, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (BytePacketBuilder) append;
    }

    @Override // vc.Output
    @NotNull
    /* renamed from: T */
    public BytePacketBuilder mo2404h(@Nullable CharSequence charSequence, int i, int i2) {
        Output append = super.append(charSequence, i, i2);
        Intrinsics.m17073h(append, "null cannot be cast to non-null type io.ktor.utils.io.core.BytePacketBuilder");
        return (BytePacketBuilder) append;
    }

    @NotNull
    /* renamed from: U */
    public final ByteReadPacket m2472U() {
        int m2471V = m2471V();
        ChunkBuffer m2414K = m2414K();
        if (m2414K == null) {
            return ByteReadPacket.f116952k.m2468a();
        }
        return new ByteReadPacket(m2414K, m2471V, m2394v());
    }

    /* renamed from: V */
    public final int m2471V() {
        return m2391y();
    }

    /* renamed from: W */
    public final boolean m2470W() {
        if (m2391y() == 0) {
            return true;
        }
        return false;
    }

    @Override // vc.Output
    /* renamed from: s */
    protected final void mo2397s(@NotNull ByteBuffer source, int i, int i2) {
        Intrinsics.checkNotNullParameter(source, "source");
    }

    @NotNull
    public String toString() {
        return "BytePacketBuilder[0x" + hashCode() + ']';
    }

    public /* synthetic */ BytePacketBuilder(InterfaceC45101f<ChunkBuffer> interfaceC45101f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ChunkBuffer.f117160j.m2140c() : interfaceC45101f);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BytePacketBuilder(@NotNull InterfaceC45101f<ChunkBuffer> pool) {
        super(pool);
        Intrinsics.checkNotNullParameter(pool, "pool");
    }

    @Override // vc.Output
    /* renamed from: r */
    protected final void mo2398r() {
    }
}
