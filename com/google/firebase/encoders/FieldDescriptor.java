package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
public final class FieldDescriptor {

    /* renamed from: a */
    private final String f42981a;

    /* renamed from: b */
    private final Map<Class<?>, Object> f42982b;

    /* loaded from: classes4.dex */
    public static final class Builder {

        /* renamed from: a */
        private final String f42983a;

        /* renamed from: b */
        private Map<Class<?>, Object> f42984b = null;

        Builder(String str) {
            this.f42983a = str;
        }

        @NonNull
        public FieldDescriptor build() {
            Map unmodifiableMap;
            String str = this.f42983a;
            if (this.f42984b == null) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(new HashMap(this.f42984b));
            }
            return new FieldDescriptor(str, unmodifiableMap);
        }

        @NonNull
        public <T extends Annotation> Builder withProperty(@NonNull T t) {
            if (this.f42984b == null) {
                this.f42984b = new HashMap();
            }
            this.f42984b.put(t.annotationType(), t);
            return this;
        }
    }

    @NonNull
    public static Builder builder(@NonNull String str) {
        return new Builder(str);
    }

    @NonNull
    /* renamed from: of */
    public static FieldDescriptor m66863of(@NonNull String str) {
        return new FieldDescriptor(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        if (this.f42981a.equals(fieldDescriptor.f42981a) && this.f42982b.equals(fieldDescriptor.f42982b)) {
            return true;
        }
        return false;
    }

    @NonNull
    public String getName() {
        return this.f42981a;
    }

    @Nullable
    public <T extends Annotation> T getProperty(@NonNull Class<T> cls) {
        return (T) this.f42982b.get(cls);
    }

    public int hashCode() {
        return (this.f42981a.hashCode() * 31) + this.f42982b.hashCode();
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.f42981a + ", properties=" + this.f42982b.values() + "}";
    }

    private FieldDescriptor(String str, Map<Class<?>, Object> map) {
        this.f42981a = str;
        this.f42982b = map;
    }
}
