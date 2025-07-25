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
/* renamed from: androidx.compose.ui.KeyedComposedModifier3 */
/* loaded from: classes.dex */
final class KeyedComposedModifier3 extends ComposedModifier {
    @NotNull
    private final String fqName;
    @Nullable
    private final Object key1;
    @Nullable
    private final Object key2;
    @Nullable
    private final Object key3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeyedComposedModifier3(@NotNull String fqName, @Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull InterfaceC45268n<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> factory) {
        super(inspectorInfo, factory);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.fqName = fqName;
        this.key1 = obj;
        this.key2 = obj2;
        this.key3 = obj3;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof KeyedComposedModifier3) {
            KeyedComposedModifier3 keyedComposedModifier3 = (KeyedComposedModifier3) obj;
            if (Intrinsics.m17075f(this.fqName, keyedComposedModifier3.fqName) && Intrinsics.m17075f(this.key1, keyedComposedModifier3.key1) && Intrinsics.m17075f(this.key2, keyedComposedModifier3.key2) && Intrinsics.m17075f(this.key3, keyedComposedModifier3.key3)) {
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

    @Nullable
    public final Object getKey2() {
        return this.key2;
    }

    @Nullable
    public final Object getKey3() {
        return this.key3;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.fqName.hashCode() * 31;
        Object obj = this.key1;
        int i3 = 0;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        Object obj2 = this.key2;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Object obj3 = this.key3;
        if (obj3 != null) {
            i3 = obj3.hashCode();
        }
        return i5 + i3;
    }
}
