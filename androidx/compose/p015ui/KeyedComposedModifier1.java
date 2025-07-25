package androidx.compose.p015ui;

import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Stable;
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
/* renamed from: androidx.compose.ui.KeyedComposedModifier1 */
/* loaded from: classes.dex */
final class KeyedComposedModifier1 extends ComposedModifier {
    @NotNull
    private final String fqName;
    @Nullable
    private final Object key1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyedComposedModifier1(@NotNull String fqName, @Nullable Object obj, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull InterfaceC45268n<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.fqName = fqName;
        this.key1 = obj;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof KeyedComposedModifier1) {
            KeyedComposedModifier1 keyedComposedModifier1 = (KeyedComposedModifier1) obj;
            if (Intrinsics.m17075f(this.fqName, keyedComposedModifier1.fqName) && Intrinsics.m17075f(this.key1, keyedComposedModifier1.key1)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final String getFqName() {
        return this.fqName;
    }

    @Nullable
    public final Object getKey1() {
        return this.key1;
    }

    public int hashCode() {
        int i;
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }
}
