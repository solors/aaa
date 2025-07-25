package p879s9;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: s9.a */
/* loaded from: classes8.dex */
public final class AccessibilityStateProvider {
    @NotNull

    /* renamed from: b */
    private static final C39623a f104093b = new C39623a(null);
    @Nullable

    /* renamed from: c */
    private static Boolean f104094c;

    /* renamed from: a */
    private final boolean f104095a;

    /* compiled from: AccessibilityStateProvider.kt */
    @Metadata
    /* renamed from: s9.a$a */
    /* loaded from: classes8.dex */
    private static final class C39623a {
        private C39623a() {
        }

        public /* synthetic */ C39623a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AccessibilityStateProvider(boolean z) {
        this.f104095a = z;
    }

    /* renamed from: a */
    public final boolean m12116a(@NotNull Context context) {
        AccessibilityManager accessibilityManager;
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z = false;
        if (!this.f104095a) {
            return false;
        }
        Boolean bool = f104094c;
        if (bool != null) {
            Intrinsics.m17074g(bool);
            return bool.booleanValue();
        }
        Object systemService = context.getSystemService("accessibility");
        if (systemService instanceof AccessibilityManager) {
            accessibilityManager = (AccessibilityManager) systemService;
        } else {
            accessibilityManager = null;
        }
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            z = true;
        }
        f104094c = Boolean.valueOf(z);
        return z;
    }
}
