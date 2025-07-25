package com.maticoo.sdk.utils;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public class Reflection {

    /* loaded from: classes6.dex */
    public static class MethodBuilder {
        private Class<?> mClass;
        private final Object mInstance;
        private boolean mIsAccessible;
        private boolean mIsStatic;
        private final String mMethodName;
        private List<Class<?>> mParameterClasses = new ArrayList();
        private List<Object> mParameters = new ArrayList();

        public MethodBuilder(Object obj, String str) {
            Class<?> cls;
            this.mInstance = obj;
            this.mMethodName = str;
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            this.mClass = cls;
        }

        public <T> MethodBuilder addParam(Class<T> cls, T t) {
            this.mParameterClasses.add(cls);
            this.mParameters.add(t);
            return this;
        }

        public Object execute() throws Exception {
            List<Class<?>> list = this.mParameterClasses;
            Method declaredMethodWithTraversal = Reflection.getDeclaredMethodWithTraversal(this.mClass, this.mMethodName, (Class[]) list.toArray(new Class[this.mParameterClasses.size()]));
            if (this.mIsAccessible) {
                declaredMethodWithTraversal.setAccessible(true);
            }
            Object[] array = this.mParameters.toArray();
            if (this.mIsStatic) {
                return declaredMethodWithTraversal.invoke(null, array);
            }
            return declaredMethodWithTraversal.invoke(this.mInstance, array);
        }

        public MethodBuilder setAccessible() {
            this.mIsAccessible = true;
            return this;
        }

        public MethodBuilder setStatic(Class<?> cls) {
            this.mIsStatic = true;
            this.mClass = cls;
            return this;
        }
    }

    public static boolean classFound(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Method getDeclaredMethodWithTraversal(Class<?> cls, String str, Class<?>... clsArr) throws NoSuchMethodException {
        while (cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new NoSuchMethodException();
    }
}
