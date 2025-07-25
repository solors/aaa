package re;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.ExceptionsH;
import p821oe.C39164i;

/* compiled from: AbstractPolymorphicSerializer.kt */
@Metadata
/* renamed from: re.c */
/* loaded from: classes8.dex */
public final class C39482c {
    @NotNull
    /* renamed from: a */
    public static final Void m12496a(@Nullable String str, @NotNull KClass<?> baseClass) {
        String str2;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String str3 = "in the scope of '" + baseClass.getSimpleName() + '\'';
        if (str == null) {
            str2 = "Class discriminator was missing and no default polymorphic serializers were registered " + str3;
        } else {
            str2 = "Class '" + str + "' is not registered for polymorphic serialization " + str3 + ".\nTo be registered automatically, class '" + str + "' has to be '@Serializable', and the base class '" + baseClass.getSimpleName() + "' has to be sealed and '@Serializable'.\nAlternatively, register the serializer for '" + str + "' explicitly in a corresponding SerializersModule.";
        }
        throw new C39164i(str2);
    }

    @NotNull
    /* renamed from: b */
    public static final Void m12495b(@NotNull KClass<?> subClass, @NotNull KClass<?> baseClass) {
        Intrinsics.checkNotNullParameter(subClass, "subClass");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        String simpleName = subClass.getSimpleName();
        if (simpleName == null) {
            simpleName = String.valueOf(subClass);
        }
        m12496a(simpleName, baseClass);
        throw new ExceptionsH();
    }
}
