package re;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p821oe.C39164i;

/* compiled from: Platform.common.kt */
@Metadata
/* renamed from: re.n1 */
/* loaded from: classes8.dex */
public final class C39525n1 {
    @NotNull

    /* renamed from: a */
    private static final SerialDescriptor[] f103888a = new SerialDescriptor[0];

    @NotNull
    /* renamed from: a */
    public static final Set<String> m12362a(@NotNull SerialDescriptor serialDescriptor) {
        Intrinsics.checkNotNullParameter(serialDescriptor, "<this>");
        if (serialDescriptor instanceof CachedNames) {
            return ((CachedNames) serialDescriptor).mo12281a();
        }
        HashSet hashSet = new HashSet(serialDescriptor.mo12262e());
        int mo12262e = serialDescriptor.mo12262e();
        for (int i = 0; i < mo12262e; i++) {
            hashSet.add(serialDescriptor.mo12261f(i));
        }
        return hashSet;
    }

    @NotNull
    /* renamed from: b */
    public static final SerialDescriptor[] m12361b(@Nullable List<? extends SerialDescriptor> list) {
        boolean z;
        SerialDescriptor[] serialDescriptorArr;
        List<? extends SerialDescriptor> list2 = list;
        if (list2 != null && !list2.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            list = null;
        }
        if (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) {
            return f103888a;
        }
        return serialDescriptorArr;
    }

    @NotNull
    /* renamed from: c */
    public static final KClass<Object> m12360c(@NotNull KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KClass) {
            return (KClass) classifier;
        }
        if (classifier instanceof KTypeParameter) {
            throw new IllegalStateException(("Captured type parameter " + classifier + " from generic non-reified function. Such functionality cannot be supported as " + classifier + " is erased, either specify serializer explicitly or make calling function inline with reified " + classifier).toString());
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + classifier).toString());
    }

    @NotNull
    /* renamed from: d */
    public static final String m12359d(@NotNull String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return "Serializer for class '" + className + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n";
    }

    @NotNull
    /* renamed from: e */
    public static final String m12358e(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        String simpleName = kClass.getSimpleName();
        if (simpleName == null) {
            simpleName = "<local class name not available>";
        }
        return m12359d(simpleName);
    }

    @NotNull
    /* renamed from: f */
    public static final Void m12357f(@NotNull KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        throw new C39164i(m12358e(kClass));
    }
}
