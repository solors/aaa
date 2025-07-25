package androidx.window.layout;

import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

/* compiled from: SafeWindowLayoutComponentProvider.kt */
@Metadata
/* loaded from: classes2.dex */
final class SafeWindowLayoutComponentProvider$windowLayoutComponent$2 extends Lambda implements Functions<WindowLayoutComponent> {
    public static final SafeWindowLayoutComponentProvider$windowLayoutComponent$2 INSTANCE = new SafeWindowLayoutComponentProvider$windowLayoutComponent$2();

    SafeWindowLayoutComponentProvider$windowLayoutComponent$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @Nullable
    public final WindowLayoutComponent invoke() {
        boolean canUseWindowLayoutComponent;
        ClassLoader classLoader = SafeWindowLayoutComponentProvider.class.getClassLoader();
        if (classLoader != null) {
            canUseWindowLayoutComponent = SafeWindowLayoutComponentProvider.INSTANCE.canUseWindowLayoutComponent(classLoader);
            if (canUseWindowLayoutComponent) {
                try {
                    return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                } catch (UnsupportedOperationException unused) {
                    return null;
                }
            }
        }
        return null;
    }
}
