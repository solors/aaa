package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Encoding;
import org.jetbrains.annotations.NotNull;
import p851qe.AbstractC39392e;

@Metadata
/* renamed from: re.b2 */
/* loaded from: classes8.dex */
public final class Primitives implements KSerializer<Short> {
    @NotNull

    /* renamed from: a */
    public static final Primitives f103813a = new Primitives();
    @NotNull

    /* renamed from: b */
    private static final SerialDescriptor f103814b = new C39548u1("kotlin.Short", AbstractC39392e.C39400h.f103614a);

    private Primitives() {
    }

    @Override // p821oe.KSerializer
    @NotNull
    /* renamed from: a */
    public Short deserialize(@NotNull Decoding decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Short.valueOf(decoder.mo6818l());
    }

    /* renamed from: b */
    public void m12497b(@NotNull Encoding encoder, short s) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.mo6805j(s);
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f103814b;
    }

    @Override // p821oe.InterfaceC39165j
    public /* bridge */ /* synthetic */ void serialize(Encoding encoding, Object obj) {
        m12497b(encoding, ((Number) obj).shortValue());
    }
}
