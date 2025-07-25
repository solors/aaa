package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding;
import kotlinx.serialization.encoding.Encoding;
import org.jetbrains.annotations.NotNull;
import re.PluginHelperInterfaces;

/* compiled from: InlineClassDescriptor.kt */
@Metadata
/* renamed from: re.l0 */
/* loaded from: classes8.dex */
public final class C39515l0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: InlineClassDescriptor.kt */
    @Metadata
    /* renamed from: re.l0$a */
    /* loaded from: classes8.dex */
    public static final class C39516a<T> implements PluginHelperInterfaces<T> {

        /* renamed from: a */
        final /* synthetic */ KSerializer<T> f103876a;

        C39516a(KSerializer<T> kSerializer) {
            this.f103876a = kSerializer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // re.PluginHelperInterfaces
        @NotNull
        public KSerializer<?>[] childSerializers() {
            return new KSerializer[]{this.f103876a};
        }

        @Override // p821oe.KSerializer
        public T deserialize(@NotNull Decoding decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // kotlinx.serialization.KSerializer, p821oe.InterfaceC39165j, p821oe.KSerializer
        @NotNull
        public SerialDescriptor getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // p821oe.InterfaceC39165j
        public void serialize(@NotNull Encoding encoder, T t) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // re.PluginHelperInterfaces
        @NotNull
        public KSerializer<?>[] typeParametersSerializers() {
            return PluginHelperInterfaces.C39494a.m12438a(this);
        }
    }

    @NotNull
    /* renamed from: a */
    public static final <T> SerialDescriptor m12388a(@NotNull String name, @NotNull KSerializer<T> primitiveSerializer) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(primitiveSerializer, "primitiveSerializer");
        return new InlineClassDescriptor(name, new C39516a(primitiveSerializer));
    }
}
