package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Encoding;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: re.h1 */
/* loaded from: classes8.dex */
public final class NullableSerializer<T> implements KSerializer<T> {
    @NotNull

    /* renamed from: a */
    private final KSerializer<T> f103849a;
    @NotNull

    /* renamed from: b */
    private final SerialDescriptor f103850b;

    public NullableSerializer(@NotNull KSerializer<T> serializer) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f103849a = serializer;
        this.f103850b = new C39557x1(serializer.getDescriptor());
    }

    @Override // p821oe.KSerializer
    @Nullable
    public T deserialize(@NotNull Decoding decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        if (decoder.mo6679D()) {
            return (T) decoder.mo6830n(this.f103849a);
        }
        return (T) decoder.mo6832g();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && NullableSerializer.class == obj.getClass() && Intrinsics.m17075f(this.f103849a, ((NullableSerializer) obj).f103849a)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.f103850b;
    }

    public int hashCode() {
        return this.f103849a.hashCode();
    }

    @Override // p821oe.InterfaceC39165j
    public void serialize(@NotNull Encoding encoder, @Nullable T t) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (t != null) {
            encoder.mo6881E();
            encoder.mo6797x(this.f103849a, t);
            return;
        }
        encoder.mo6816A();
    }
}
