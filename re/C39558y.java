package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Encoding;
import org.jetbrains.annotations.NotNull;
import p851qe.AbstractC39392e;

/* compiled from: BuiltInSerializers.kt */
@Metadata
/* renamed from: re.y */
/* loaded from: classes8.dex */
public final class C39558y implements KSerializer<Duration> {
    @NotNull

    /* renamed from: a */
    public static final C39558y f103934a = new C39558y();
    @NotNull

    /* renamed from: b */
    private static final SerialDescriptor f103935b = new C39548u1("kotlin.time.Duration", AbstractC39392e.C39401i.f103615a);

    private C39558y() {
    }

    /* renamed from: a */
    public long m12279a(@NotNull Decoding decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Duration.f99494c.m16471d(decoder.mo6828p());
    }

    /* renamed from: b */
    public void m12278b(@NotNull Encoding encoder, long j) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        encoder.mo6799u(Duration.m16504I(j));
    }

    @Override // p821oe.KSerializer
    public /* bridge */ /* synthetic */ Object deserialize(Decoding decoding) {
        return Duration.m16494g(m12279a(decoding));
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f103935b;
    }

    @Override // p821oe.InterfaceC39165j
    public /* bridge */ /* synthetic */ void serialize(Encoding encoding, Object obj) {
        m12278b(encoding, ((Duration) obj).m16500M());
    }
}
