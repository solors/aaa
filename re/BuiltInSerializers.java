package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Encoding;
import org.jetbrains.annotations.NotNull;
import p821oe.C39164i;

@Metadata
/* renamed from: re.g1 */
/* loaded from: classes8.dex */
public final class BuiltInSerializers implements KSerializer {
    @NotNull

    /* renamed from: a */
    public static final BuiltInSerializers f103843a = new BuiltInSerializers();
    @NotNull

    /* renamed from: b */
    private static final SerialDescriptor f103844b = NothingSerialDescriptor.f103833a;

    private BuiltInSerializers() {
    }

    @Override // p821oe.KSerializer
    @NotNull
    /* renamed from: a */
    public Void deserialize(@NotNull Decoding decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        throw new C39164i("'kotlin.Nothing' does not have instances");
    }

    @Override // p821oe.InterfaceC39165j
    /* renamed from: b */
    public void serialize(@NotNull Encoding encoder, @NotNull Void value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new C39164i("'kotlin.Nothing' cannot be serialized");
    }

    @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
    @NotNull
    public SerialDescriptor getDescriptor() {
        return f103844b;
    }
}
