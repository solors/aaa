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
/* renamed from: re.j */
/* loaded from: classes8.dex */
public final class C39507j implements KSerializer<Byte> {
    @NotNull

    /* renamed from: a */
    public static final C39507j f103863a = new C39507j();
    @NotNull

    /* renamed from: b */
    private static final SerialDescriptor f103864b = new C39548u1("kotlin.Byte", AbstractC39392e.C39394b.f103608a);

    private C39507j() {
    }

    @Override // p821oe.KSerializer
    @NotNull
    /* renamed from: a */
    public Byte deserialize(@NotNull Decoding decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Byte.valueOf(decoder.mo6821G());
    }

    /* renamed from: b */
    public void m12404b(@NotNull Encoding encoder, byte b) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.mo6808e(b);
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f103864b;
    }

    @Override // p821oe.InterfaceC39165j
    public /* bridge */ /* synthetic */ void serialize(Encoding encoding, Object obj) {
        m12404b(encoding, ((Number) obj).byteValue());
    }
}
