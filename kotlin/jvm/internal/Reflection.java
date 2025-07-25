package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import kotlin.reflect.KClass;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;

/* renamed from: kotlin.jvm.internal.o0 */
/* loaded from: classes7.dex */
public class Reflection {

    /* renamed from: a */
    private static final ReflectionFactory f99328a;

    /* renamed from: b */
    private static final KClass[] f99329b;

    static {
        ReflectionFactory reflectionFactory = null;
        try {
            reflectionFactory = (ReflectionFactory) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (reflectionFactory == null) {
            reflectionFactory = new ReflectionFactory();
        }
        f99328a = reflectionFactory;
        f99329b = new KClass[0];
    }

    /* renamed from: a */
    public static KFunction m17043a(FunctionReference functionReference) {
        return f99328a.m17029a(functionReference);
    }

    /* renamed from: b */
    public static KClass m17042b(Class cls) {
        return f99328a.m17028b(cls);
    }

    /* renamed from: c */
    public static KDeclarationContainer m17041c(Class cls) {
        return f99328a.m17027c(cls, "");
    }

    /* renamed from: d */
    public static KMutableProperty0 m17040d(MutablePropertyReference0 mutablePropertyReference0) {
        return f99328a.m17026d(mutablePropertyReference0);
    }

    /* renamed from: e */
    public static KMutableProperty1 m17039e(MutablePropertyReference1 mutablePropertyReference1) {
        return f99328a.m17025e(mutablePropertyReference1);
    }

    /* renamed from: f */
    public static KType m17038f(Class cls) {
        return f99328a.m17019k(m17042b(cls), Collections.emptyList(), true);
    }

    /* renamed from: g */
    public static KProperty0 m17037g(PropertyReference0 propertyReference0) {
        return f99328a.m17024f(propertyReference0);
    }

    /* renamed from: h */
    public static KProperty1 m17036h(PropertyReference1 propertyReference1) {
        return f99328a.m17023g(propertyReference1);
    }

    /* renamed from: i */
    public static KProperty2 m17035i(PropertyReference2 propertyReference2) {
        return f99328a.m17022h(propertyReference2);
    }

    /* renamed from: j */
    public static String m17034j(FunctionBase functionBase) {
        return f99328a.m17021i(functionBase);
    }

    /* renamed from: k */
    public static String m17033k(Lambda lambda) {
        return f99328a.m17020j(lambda);
    }

    /* renamed from: l */
    public static KType m17032l(Class cls) {
        return f99328a.m17019k(m17042b(cls), Collections.emptyList(), false);
    }

    /* renamed from: m */
    public static KType m17031m(Class cls, KTypeProjection kTypeProjection) {
        return f99328a.m17019k(m17042b(cls), Collections.singletonList(kTypeProjection), false);
    }

    /* renamed from: n */
    public static KType m17030n(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f99328a.m17019k(m17042b(cls), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }
}
