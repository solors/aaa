package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Encoding;
import org.jetbrains.annotations.NotNull;
import p851qe.AbstractC39392e;

/* compiled from: Primitives.kt */
@Metadata
/* renamed from: re.x0 */
/* loaded from: classes8.dex */
public final class C39556x0 implements KSerializer<Long> {
    @NotNull

    /* renamed from: a */
    public static final C39556x0 f103929a = new C39556x0();
    @NotNull

    /* renamed from: b */
    private static final SerialDescriptor f103930b = new C39548u1("kotlin.Long", AbstractC39392e.C39399g.f103613a);

    private C39556x0() {
    }

    @Override // p821oe.KSerializer
    @NotNull
    /* renamed from: a */
    public Long deserialize(@NotNull Decoding decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf(decoder.mo6819h());
    }

    /* renamed from: b */
    public void m12282b(@NotNull Encoding encoder, long j) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.mo6796z(j);
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f103930b;
    }

    @Override // p821oe.InterfaceC39165j
    public /* bridge */ /* synthetic */ void serialize(Encoding encoding, Object obj) {
        m12282b(encoding, ((Number) obj).longValue());
    }
}
