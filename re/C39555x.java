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
/* renamed from: re.x */
/* loaded from: classes8.dex */
public final class C39555x implements KSerializer<Double> {
    @NotNull

    /* renamed from: a */
    public static final C39555x f103927a = new C39555x();
    @NotNull

    /* renamed from: b */
    private static final SerialDescriptor f103928b = new C39548u1("kotlin.Double", AbstractC39392e.C39396d.f103610a);

    private C39555x() {
    }

    @Override // p821oe.KSerializer
    @NotNull
    /* renamed from: a */
    public Double deserialize(@NotNull Decoding decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Double.valueOf(decoder.mo6831m());
    }

    /* renamed from: b */
    public void m12284b(@NotNull Encoding encoder, double d) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.mo6798w(d);
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f103928b;
    }

    @Override // p821oe.InterfaceC39165j
    public /* bridge */ /* synthetic */ void serialize(Encoding encoding, Object obj) {
        m12284b(encoding, ((Number) obj).doubleValue());
    }
}
