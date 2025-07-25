package com.google.gson;

import com.google.gson.internal.C$Gson$Preconditions;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;

/* loaded from: classes5.dex */
public final class FieldAttributes {

    /* renamed from: a */
    private final Field f43888a;

    public FieldAttributes(Field field) {
        C$Gson$Preconditions.checkNotNull(field);
        this.f43888a = field;
    }

    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        return (T) this.f43888a.getAnnotation(cls);
    }

    public Collection<Annotation> getAnnotations() {
        return Arrays.asList(this.f43888a.getAnnotations());
    }

    public Class<?> getDeclaredClass() {
        return this.f43888a.getType();
    }

    public Type getDeclaredType() {
        return this.f43888a.getGenericType();
    }

    public Class<?> getDeclaringClass() {
        return this.f43888a.getDeclaringClass();
    }

    public String getName() {
        return this.f43888a.getName();
    }

    public boolean hasModifier(int i) {
        if ((i & this.f43888a.getModifiers()) != 0) {
            return true;
        }
        return false;
    }
}
