package se;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import p821oe.InterfaceC39165j;
import p821oe.KSerializer;
import p851qe.AbstractC39392e;
import p851qe.AbstractC39408h;
import p851qe.AbstractC39411i;
import p851qe.SerialKinds;
import p987te.SerializersModuleCollector;

@Metadata
/* renamed from: se.b1 */
/* loaded from: classes8.dex */
public final class PolymorphismValidator implements SerializersModuleCollector {

    /* renamed from: a */
    private final boolean f111796a;
    @NotNull

    /* renamed from: b */
    private final String f111797b;

    public PolymorphismValidator(boolean z, @NotNull String discriminator) {
        Intrinsics.checkNotNullParameter(discriminator, "discriminator");
        this.f111796a = z;
        this.f111797b = discriminator;
    }

    /* renamed from: f */
    private final void m6918f(SerialDescriptor serialDescriptor, KClass<?> kClass) {
        int mo12262e = serialDescriptor.mo12262e();
        for (int i = 0; i < mo12262e; i++) {
            String mo12261f = serialDescriptor.mo12261f(i);
            if (Intrinsics.m17075f(mo12261f, this.f111797b)) {
                throw new IllegalArgumentException("Polymorphic serializer for " + kClass + " has property '" + mo12261f + "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
            }
        }
    }

    /* renamed from: g */
    private final void m6917g(SerialDescriptor serialDescriptor, KClass<?> kClass) {
        AbstractC39408h kind = serialDescriptor.getKind();
        if (!(kind instanceof SerialKinds) && !Intrinsics.m17075f(kind, AbstractC39408h.C39409a.f103623a)) {
            if (this.f111796a) {
                return;
            }
            if (!Intrinsics.m17075f(kind, AbstractC39411i.C39413b.f103626a) && !Intrinsics.m17075f(kind, AbstractC39411i.C39414c.f103627a) && !(kind instanceof AbstractC39392e) && !(kind instanceof AbstractC39408h.C39410b)) {
                return;
            }
            throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " of kind " + kind + " cannot be serialized polymorphically with class discriminator.");
        }
        throw new IllegalArgumentException("Serializer for " + kClass.getSimpleName() + " can't be registered as a subclass for polymorphic serialization because its kind " + kind + " is not concrete. To work with multiple hierarchies, register it as a base class.");
    }

    @Override // p987te.SerializersModuleCollector
    /* renamed from: a */
    public <Base> void mo3099a(@NotNull KClass<Base> baseClass, @NotNull Function1<? super String, ? extends KSerializer<? extends Base>> defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
    }

    @Override // p987te.SerializersModuleCollector
    /* renamed from: b */
    public <Base> void mo3098b(@NotNull KClass<Base> baseClass, @NotNull Function1<? super Base, ? extends InterfaceC39165j<? super Base>> defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
    }

    @Override // p987te.SerializersModuleCollector
    /* renamed from: c */
    public <Base, Sub extends Base> void mo3097c(@NotNull KClass<Base> baseClass, @NotNull KClass<Sub> actualClass, @NotNull kotlinx.serialization.KSerializer<Sub> actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        SerialDescriptor descriptor = actualSerializer.getDescriptor();
        m6917g(descriptor, actualClass);
        if (!this.f111796a) {
            m6918f(descriptor, actualClass);
        }
    }

    @Override // p987te.SerializersModuleCollector
    /* renamed from: d */
    public <T> void mo3096d(@NotNull KClass<T> kClass, @NotNull kotlinx.serialization.KSerializer<T> kSerializer) {
        SerializersModuleCollector.C44408a.m3094a(this, kClass, kSerializer);
    }

    @Override // p987te.SerializersModuleCollector
    /* renamed from: e */
    public <T> void mo3095e(@NotNull KClass<T> kClass, @NotNull Function1<? super List<? extends kotlinx.serialization.KSerializer<?>>, ? extends kotlinx.serialization.KSerializer<?>> provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
    }
}
