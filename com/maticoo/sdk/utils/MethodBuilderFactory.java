package com.maticoo.sdk.utils;

import com.maticoo.sdk.utils.Reflection;

/* loaded from: classes6.dex */
public class MethodBuilderFactory {
    static MethodBuilderFactory instance = new MethodBuilderFactory();

    public static Reflection.MethodBuilder create(Object obj, String str) {
        return instance.internalCreate(obj, str);
    }

    @Deprecated
    public static void setInstance(MethodBuilderFactory methodBuilderFactory) {
        instance = methodBuilderFactory;
    }

    protected Reflection.MethodBuilder internalCreate(Object obj, String str) {
        return new Reflection.MethodBuilder(obj, str);
    }
}
