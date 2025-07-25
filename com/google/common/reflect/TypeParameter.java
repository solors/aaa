package com.google.common.reflect;

import com.google.common.base.Preconditions;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class TypeParameter<T> extends TypeCapture<T> {

    /* renamed from: b */
    final TypeVariable<?> f41533b;

    protected TypeParameter() {
        Type m67923a = m67923a();
        Preconditions.checkArgument(m67923a instanceof TypeVariable, "%s should be a type variable.", m67923a);
        this.f41533b = (TypeVariable) m67923a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TypeParameter) {
            return this.f41533b.equals(((TypeParameter) obj).f41533b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f41533b.hashCode();
    }

    public String toString() {
        return this.f41533b.toString();
    }
}
