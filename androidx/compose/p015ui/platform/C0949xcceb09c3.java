package androidx.compose.p015ui.platform;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DisposableSaveableStateRegistry.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 */
/* loaded from: classes.dex */
public final class C0949xcceb09c3 extends Lambda implements Function1<Object, Boolean> {
    public static final C0949xcceb09c3 INSTANCE = new C0949xcceb09c3();

    C0949xcceb09c3() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Object it) {
        boolean canBeSavedToBundle;
        Intrinsics.checkNotNullParameter(it, "it");
        canBeSavedToBundle = DisposableSaveableStateRegistry_androidKt.canBeSavedToBundle(it);
        return Boolean.valueOf(canBeSavedToBundle);
    }
}
