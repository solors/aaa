package com.google.common.reflect;

import com.google.common.collect.Sets;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class TypeVisitor {

    /* renamed from: a */
    private final Set<Type> f41567a = Sets.newHashSet();

    public final void visit(Type... typeArr) {
        for (Type type : typeArr) {
            if (type != null && this.f41567a.add(type)) {
                try {
                    if (type instanceof TypeVariable) {
                        mo67818d((TypeVariable) type);
                    } else if (type instanceof WildcardType) {
                        mo67817e((WildcardType) type);
                    } else if (type instanceof ParameterizedType) {
                        mo67840c((ParameterizedType) type);
                    } else if (type instanceof Class) {
                        mo67820a((Class) type);
                    } else if (type instanceof GenericArrayType) {
                        mo67819b((GenericArrayType) type);
                    } else {
                        String valueOf = String.valueOf(type);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 14);
                        sb2.append("Unknown type: ");
                        sb2.append(valueOf);
                        throw new AssertionError(sb2.toString());
                    }
                } catch (Throwable th) {
                    this.f41567a.remove(type);
                    throw th;
                }
            }
        }
    }

    /* renamed from: a */
    void mo67820a(Class<?> cls) {
    }

    /* renamed from: b */
    void mo67819b(GenericArrayType genericArrayType) {
    }

    /* renamed from: c */
    void mo67840c(ParameterizedType parameterizedType) {
    }

    /* renamed from: d */
    void mo67818d(TypeVariable<?> typeVariable) {
    }

    /* renamed from: e */
    void mo67817e(WildcardType wildcardType) {
    }
}
