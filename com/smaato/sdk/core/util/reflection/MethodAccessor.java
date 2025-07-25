package com.smaato.sdk.core.util.reflection;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Pair;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public final class MethodAccessor {
    @NonNull
    private final Class<?> clazz;
    @Nullable
    private final Object instance;
    @NonNull
    private final String methodName;
    @Nullable
    private final Object[] parameterInstances;
    @Nullable
    private final Class[] parameterTypes;

    /* loaded from: classes7.dex */
    public static final class Builder {
        private Class<?> clazz;
        private Object instance;
        private String methodName;
        private Object[] parameterInstances;
        private Class[] parameterTypes;

        @NonNull
        public MethodAccessor build() {
            ArrayList arrayList = new ArrayList();
            if (this.clazz == null) {
                arrayList.add("clazz");
            }
            if (this.methodName == null) {
                arrayList.add("methodName");
            }
            if (arrayList.isEmpty()) {
                return new MethodAccessor(this.clazz, this.instance, this.methodName, this.parameterTypes, this.parameterInstances);
            }
            throw new IllegalStateException("Missing required parameter(s): " + Joiner.join(", ", arrayList));
        }

        @NonNull
        public Builder fromClassInstance(@NonNull String str) throws ClassNotFoundException {
            Objects.requireNonNull(str, "Parameter className cannot be null for Builder::fromClassInstance");
            this.clazz = Class.forName(str);
            return this;
        }

        @NonNull
        public Builder fromObjectInstance(@NonNull Object obj) {
            this.instance = Objects.requireNonNull(obj, "Parameter instance cannot be null for Builder::fromObjectInstance");
            this.clazz = obj.getClass();
            return this;
        }

        @NonNull
        public Builder fromResolvedClassInstance(@NonNull Class<?> cls) {
            this.clazz = (Class) Objects.requireNonNull(cls, "Parameter clazz cannot be null for Builder::fromResolvedClassInstance");
            return this;
        }

        @NonNull
        public Builder setMethodName(@NonNull String str) {
            this.methodName = (String) Objects.requireNonNull(str, "Parameter methodName cannot be null for Builder::setMethodName");
            return this;
        }

        @NonNull
        @SafeVarargs
        public final Builder withParameters(@NonNull Pair<String, Object>... pairArr) throws ClassNotFoundException {
            this.parameterTypes = new Class[pairArr.length];
            this.parameterInstances = new Object[pairArr.length];
            for (int i = 0; i < pairArr.length; i++) {
                Pair pair = (Pair) Objects.requireNonNull(pairArr[i], String.format("Parameter classNameToObjectInstanceArray[%d] cannot be null for Builder::withParameters", Integer.valueOf(i)));
                this.parameterTypes[i] = Class.forName((String) pair.first());
                this.parameterInstances[i] = pair.second();
            }
            return this;
        }

        @NonNull
        @SafeVarargs
        public final <T> Builder withParametersOfResolvedTypes(@NonNull Pair<Class<T>, T>... pairArr) {
            this.parameterTypes = new Class[pairArr.length];
            this.parameterInstances = new Object[pairArr.length];
            for (int i = 0; i < pairArr.length; i++) {
                Pair pair = (Pair) Objects.requireNonNull(pairArr[i], String.format("Parameter classToObjectInstanceArray[%d] cannot be null for Builder::withParametersOfResolvedTypes", Integer.valueOf(i)));
                this.parameterTypes[i] = (Class) pair.first();
                this.parameterInstances[i] = pair.second();
            }
            return this;
        }
    }

    /* loaded from: classes7.dex */
    public static final class MethodAccessingException extends Exception {
        public MethodAccessingException(Throwable th) {
            super(th);
        }
    }

    @NonNull
    private Method getDeclaredMethod() throws NoSuchMethodException {
        for (Class<?> cls = this.clazz; cls != null; cls = cls.getSuperclass()) {
            try {
                return cls.getDeclaredMethod(this.methodName, this.parameterTypes);
            } catch (NoSuchMethodException unused) {
            }
        }
        throw new NoSuchMethodException();
    }

    @Nullable
    public Object execute() throws MethodAccessingException {
        try {
            return getDeclaredMethod().invoke(this.instance, this.parameterInstances);
        } catch (Exception e) {
            throw new MethodAccessingException(e);
        }
    }

    private MethodAccessor(@NonNull Class<?> cls, @Nullable Object obj, @NonNull String str, @Nullable Class[] clsArr, @Nullable Object[] objArr) {
        this.clazz = (Class) Objects.requireNonNull(cls, "Parameter clazz cannot be null for MethodAccessor::MethodAccessor");
        this.instance = obj;
        this.methodName = (String) Objects.requireNonNull(str, "Parameter methodName cannot be null for MethodAccessor::MethodAccessor");
        this.parameterTypes = clsArr;
        this.parameterInstances = objArr;
    }
}
