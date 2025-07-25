package sc;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1062yd.JvmClassMapping;

@Metadata
/* renamed from: sc.b */
/* loaded from: classes9.dex */
public final class TypeInfoJvm {
    /* renamed from: a */
    public static final boolean m6970a(@NotNull Object obj, @NotNull KClass<?> type) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return JvmClassMapping.m913a(type).isInstance(obj);
    }

    @NotNull
    /* renamed from: b */
    public static final Type m6969b(@NotNull Type reifiedType, @NotNull KClass<?> kClass, @Nullable KType kType) {
        Intrinsics.checkNotNullParameter(reifiedType, "reifiedType");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        return new Type(kClass, reifiedType, kType);
    }
}
