package com.google.firebase.components;

import androidx.annotation.NonNull;
import java.lang.annotation.Annotation;

/* loaded from: classes4.dex */
public final class Qualified<T> {

    /* renamed from: a */
    private final Class<? extends Annotation> f42129a;

    /* renamed from: b */
    private final Class<T> f42130b;

    /* loaded from: classes4.dex */
    private @interface Unqualified {
    }

    public Qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f42129a = cls;
        this.f42130b = cls2;
    }

    @NonNull
    public static <T> Qualified<T> qualified(Class<? extends Annotation> cls, Class<T> cls2) {
        return new Qualified<>(cls, cls2);
    }

    @NonNull
    public static <T> Qualified<T> unqualified(Class<T> cls) {
        return new Qualified<>(Unqualified.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Qualified.class != obj.getClass()) {
            return false;
        }
        Qualified qualified = (Qualified) obj;
        if (!this.f42130b.equals(qualified.f42130b)) {
            return false;
        }
        return this.f42129a.equals(qualified.f42129a);
    }

    public int hashCode() {
        return (this.f42130b.hashCode() * 31) + this.f42129a.hashCode();
    }

    public String toString() {
        if (this.f42129a == Unqualified.class) {
            return this.f42130b.getName();
        }
        return "@" + this.f42129a.getName() + " " + this.f42130b.getName();
    }
}
