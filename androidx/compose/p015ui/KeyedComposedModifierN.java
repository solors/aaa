package androidx.compose.p015ui;

import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: ComposedModifier.kt */
@Stable
@Metadata
/* renamed from: androidx.compose.ui.KeyedComposedModifierN */
/* loaded from: classes.dex */
final class KeyedComposedModifierN extends ComposedModifier {
    @NotNull
    private final String fqName;
    @NotNull
    private final Object[] keys;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyedComposedModifierN(@NotNull String fqName, @NotNull Object[] keys, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull InterfaceC45268n<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.fqName = fqName;
        this.keys = keys;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof KeyedComposedModifierN) {
            KeyedComposedModifierN keyedComposedModifierN = (KeyedComposedModifierN) obj;
            if (Intrinsics.m17075f(this.fqName, keyedComposedModifierN.fqName) && Arrays.equals(this.keys, keyedComposedModifierN.keys)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getFqName() {
        return this.fqName;
    }

    @NotNull
    public final Object[] getKeys() {
        return this.keys;
    }

    public int hashCode() {
        return (this.fqName.hashCode() * 31) + Arrays.hashCode(this.keys);
    }
}
