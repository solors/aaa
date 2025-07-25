package androidx.window.layout;

import androidx.annotation.RequiresApi;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1062yd.JvmClassMapping;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
@Metadata
/* loaded from: classes2.dex */
public final class SafeWindowLayoutComponentProvider {
    @NotNull
    public static final SafeWindowLayoutComponentProvider INSTANCE = new SafeWindowLayoutComponentProvider();
    @NotNull
    private static final InterfaceC38501j windowLayoutComponent$delegate;

    static {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(SafeWindowLayoutComponentProvider$windowLayoutComponent$2.INSTANCE);
        windowLayoutComponent$delegate = m14554a;
    }

    private SafeWindowLayoutComponentProvider() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canUseWindowLayoutComponent(ClassLoader classLoader) {
        if (isWindowLayoutProviderValid(classLoader) && isWindowExtensionsValid(classLoader) && isWindowLayoutComponentValid(classLoader) && isFoldingFeatureValid(classLoader)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesReturn(Method method, KClass<?> kClass) {
        return doesReturn(method, JvmClassMapping.m913a(kClass));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> foldingFeatureClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    private final boolean isFoldingFeatureValid(ClassLoader classLoader) {
        return validate(new SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1(classLoader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPublic(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    private final boolean isWindowExtensionsValid(ClassLoader classLoader) {
        return validate(new SafeWindowLayoutComponentProvider$isWindowExtensionsValid$1(classLoader));
    }

    @RequiresApi(24)
    private final boolean isWindowLayoutComponentValid(ClassLoader classLoader) {
        return validate(new SafeWindowLayoutComponentProvider$isWindowLayoutComponentValid$1(classLoader));
    }

    private final boolean isWindowLayoutProviderValid(ClassLoader classLoader) {
        return validate(new SafeWindowLayoutComponentProvider$isWindowLayoutProviderValid$1(classLoader));
    }

    private final boolean validate(Functions<Boolean> functions) {
        try {
            return functions.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowExtensionsClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowExtensionsProviderClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> windowLayoutComponentClass(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    @Nullable
    public final WindowLayoutComponent getWindowLayoutComponent() {
        return (WindowLayoutComponent) windowLayoutComponent$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesReturn(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }
}
