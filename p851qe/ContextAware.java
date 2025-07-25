package p851qe;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p987te.AbstractC44407c;
import re.C39557x1;

@Metadata
/* renamed from: qe.b */
/* loaded from: classes8.dex */
public final class ContextAware {
    @Nullable
    /* renamed from: a */
    public static final KClass<?> m12761a(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof C39389c) {
            return ((C39389c) serialDescriptor).f103603b;
        }
        if (serialDescriptor instanceof C39557x1) {
            return m12761a(((C39557x1) serialDescriptor).m12280j());
        }
        return null;
    }

    @Nullable
    /* renamed from: b */
    public static final SerialDescriptor m12760b(@NotNull AbstractC44407c abstractC44407c, @NotNull SerialDescriptor descriptor) {
        KSerializer m3103c;
        Intrinsics.checkNotNullParameter(abstractC44407c, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        KClass<?> m12761a = m12761a(descriptor);
        if (m12761a == null || (m3103c = AbstractC44407c.m3103c(abstractC44407c, m12761a, null, 2, null)) == null) {
            return null;
        }
        return m3103c.getDescriptor();
    }

    @NotNull
    /* renamed from: c */
    public static final SerialDescriptor m12759c(@NotNull SerialDescriptor serialDescriptor, @NotNull KClass<?> context) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new C39389c(serialDescriptor, context);
    }
}
