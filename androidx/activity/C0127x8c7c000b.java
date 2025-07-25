package androidx.activity;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ViewTreeOnBackPressedDispatcherOwner.kt */
@Metadata
/* renamed from: androidx.activity.ViewTreeOnBackPressedDispatcherOwner$findViewTreeOnBackPressedDispatcherOwner$2 */
/* loaded from: classes.dex */
final class C0127x8c7c000b extends Lambda implements Function1<View, OnBackPressedDispatcherOwner> {
    public static final C0127x8c7c000b INSTANCE = new C0127x8c7c000b();

    C0127x8c7c000b() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final OnBackPressedDispatcherOwner invoke(@NotNull View it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object tag = it.getTag(C0122R.C0123id.view_tree_on_back_pressed_dispatcher_owner);
        if (tag instanceof OnBackPressedDispatcherOwner) {
            return (OnBackPressedDispatcherOwner) tag;
        }
        return null;
    }
}
