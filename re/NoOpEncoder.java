package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.AbstractEncoder;
import org.jetbrains.annotations.NotNull;
import p987te.AbstractC44407c;
import p987te.SerializersModuleBuilders;

@Metadata
/* renamed from: re.e1 */
/* loaded from: classes8.dex */
public final class NoOpEncoder extends AbstractEncoder {
    @NotNull

    /* renamed from: a */
    public static final NoOpEncoder f103829a = new NoOpEncoder();
    @NotNull

    /* renamed from: b */
    private static final AbstractC44407c f103830b = SerializersModuleBuilders.m3100a();

    private NoOpEncoder() {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder
    /* renamed from: J */
    public void mo12464J(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // kotlinx.serialization.encoding.Encoding
    @NotNull
    /* renamed from: a */
    public AbstractC44407c mo6812a() {
        return f103830b;
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoding
    /* renamed from: f */
    public void mo6807f(@NotNull SerialDescriptor enumDescriptor, int i) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoding
    /* renamed from: u */
    public void mo6799u(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoding
    /* renamed from: A */
    public void mo6816A() {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoding
    /* renamed from: D */
    public void mo6815D(char c) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoding
    /* renamed from: e */
    public void mo6808e(byte b) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoding
    /* renamed from: j */
    public void mo6805j(short s) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoding
    /* renamed from: k */
    public void mo6804k(boolean z) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoding
    /* renamed from: l */
    public void mo6803l(float f) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoding
    /* renamed from: r */
    public void mo6800r(int i) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoding
    /* renamed from: w */
    public void mo6798w(double d) {
    }

    @Override // kotlinx.serialization.encoding.AbstractEncoder, kotlinx.serialization.encoding.Encoding
    /* renamed from: z */
    public void mo6796z(long j) {
    }
}
