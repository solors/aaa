package com.explorestack.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class ExtensionRegistryFactory {
    static final Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final String FULL_REGISTRY_CLASS_NAME = "com.explorestack.protobuf.ExtensionRegistry";

    ExtensionRegistryFactory() {
    }

    public static ExtensionRegistryLite create() {
        ExtensionRegistryLite invokeSubclassFactory = invokeSubclassFactory("newInstance");
        if (invokeSubclassFactory == null) {
            return new ExtensionRegistryLite();
        }
        return invokeSubclassFactory;
    }

    public static ExtensionRegistryLite createEmpty() {
        ExtensionRegistryLite invokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        if (invokeSubclassFactory == null) {
            return ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
        }
        return invokeSubclassFactory;
    }

    private static final ExtensionRegistryLite invokeSubclassFactory(String str) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls == null) {
            return null;
        }
        try {
            return (ExtensionRegistryLite) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isFullRegistry(ExtensionRegistryLite extensionRegistryLite) {
        Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls != null && cls.isAssignableFrom(extensionRegistryLite.getClass())) {
            return true;
        }
        return false;
    }

    static Class<?> reflectExtensionRegistry() {
        try {
            ExtensionRegistry extensionRegistry = ExtensionRegistry.EMPTY_REGISTRY;
            return ExtensionRegistry.class;
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
