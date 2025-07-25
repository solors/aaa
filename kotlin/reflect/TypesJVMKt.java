package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37566w;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.sequences.C37653n;
import kotlin.sequences.Sequence;
import kotlin.sequences._Sequences;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import p1062yd.JvmClassMapping;
import p804nd.NoWhenBranchMatchedException;

/* compiled from: TypesJVM.kt */
@Metadata
/* loaded from: classes7.dex */
public final class TypesJVMKt {

    /* compiled from: TypesJVM.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.f99367IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type computeJavaType(KType kType, boolean z) {
        Class m913a;
        Object m17563P0;
        int i;
        KClassifier classifier = kType.getClassifier();
        if (classifier instanceof KTypeParameter) {
            return new TypeVariableImpl((KTypeParameter) classifier);
        }
        if (classifier instanceof KClass) {
            KClass kClass = (KClass) classifier;
            if (z) {
                m913a = JvmClassMapping.m912b(kClass);
            } else {
                m913a = JvmClassMapping.m913a(kClass);
            }
            List<KTypeProjection> arguments = kType.getArguments();
            if (arguments.isEmpty()) {
                return m913a;
            }
            if (m913a.isArray()) {
                if (!m913a.getComponentType().isPrimitive()) {
                    m17563P0 = _Collections.m17563P0(arguments);
                    KTypeProjection kTypeProjection = (KTypeProjection) m17563P0;
                    if (kTypeProjection != null) {
                        KVariance component1 = kTypeProjection.component1();
                        KType component2 = kTypeProjection.component2();
                        if (component1 == null) {
                            i = -1;
                        } else {
                            i = WhenMappings.$EnumSwitchMapping$0[component1.ordinal()];
                        }
                        if (i != -1 && i != 1) {
                            if (i != 2 && i != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Intrinsics.m17074g(component2);
                            Type computeJavaType$default = computeJavaType$default(component2, false, 1, null);
                            if (!(computeJavaType$default instanceof Class)) {
                                return new TypesJVM(computeJavaType$default);
                            }
                            return m913a;
                        }
                        return m913a;
                    }
                    throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + kType);
                }
                return m913a;
            }
            return createPossiblyInnerType(m913a, arguments);
        }
        throw new UnsupportedOperationException("Unsupported type classifier: " + kType);
    }

    static /* synthetic */ Type computeJavaType$default(KType kType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return computeJavaType(kType, z);
    }

    private static final Type createPossiblyInnerType(Class<?> cls, List<KTypeProjection> list) {
        int m17154x;
        int m17154x2;
        int m17154x3;
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            List<KTypeProjection> list2 = list;
            m17154x3 = C37566w.m17154x(list2, 10);
            ArrayList arrayList = new ArrayList(m17154x3);
            for (KTypeProjection kTypeProjection : list2) {
                arrayList.add(getJavaType(kTypeProjection));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        } else if (Modifier.isStatic(cls.getModifiers())) {
            List<KTypeProjection> list3 = list;
            m17154x2 = C37566w.m17154x(list3, 10);
            ArrayList arrayList2 = new ArrayList(m17154x2);
            for (KTypeProjection kTypeProjection2 : list3) {
                arrayList2.add(getJavaType(kTypeProjection2));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        } else {
            int length = cls.getTypeParameters().length;
            Type createPossiblyInnerType = createPossiblyInnerType(declaringClass, list.subList(length, list.size()));
            List<KTypeProjection> subList = list.subList(0, length);
            m17154x = C37566w.m17154x(subList, 10);
            ArrayList arrayList3 = new ArrayList(m17154x);
            for (KTypeProjection kTypeProjection3 : subList) {
                arrayList3.add(getJavaType(kTypeProjection3));
            }
            return new ParameterizedTypeImpl(cls, createPossiblyInnerType, arrayList3);
        }
    }

    @NotNull
    public static final Type getJavaType(@NotNull KType kType) {
        Type m17011b;
        Intrinsics.checkNotNullParameter(kType, "<this>");
        return (!(kType instanceof KTypeBase) || (m17011b = ((KTypeBase) kType).m17011b()) == null) ? computeJavaType$default(kType, false, 1, null) : m17011b;
    }

    public static /* synthetic */ void getJavaType$annotations(KType kType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String typeToString(Type type) {
        String name;
        Sequence m16836h;
        Object m16805y;
        int m16816n;
        String m16632E;
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isArray()) {
                m16836h = C37653n.m16836h(type, TypesJVMKt$typeToString$unwrap$1.INSTANCE);
                StringBuilder sb2 = new StringBuilder();
                m16805y = _Sequences.m16805y(m16836h);
                sb2.append(((Class) m16805y).getName());
                m16816n = _Sequences.m16816n(m16836h);
                m16632E = StringsJVM.m16632E("[]", m16816n);
                sb2.append(m16632E);
                name = sb2.toString();
            } else {
                name = cls.getName();
            }
            Intrinsics.m17074g(name);
            return name;
        }
        return type.toString();
    }

    private static /* synthetic */ void getJavaType$annotations(KTypeProjection kTypeProjection) {
    }

    private static final Type getJavaType(KTypeProjection kTypeProjection) {
        KVariance variance = kTypeProjection.getVariance();
        if (variance == null) {
            return WildcardTypeImpl.Companion.getSTAR();
        }
        KType type = kTypeProjection.getType();
        Intrinsics.m17074g(type);
        int i = WhenMappings.$EnumSwitchMapping$0[variance.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return new WildcardTypeImpl(computeJavaType(type, true), null);
                }
                throw new NoWhenBranchMatchedException();
            }
            return computeJavaType(type, true);
        }
        return new WildcardTypeImpl(null, computeJavaType(type, true));
    }
}
