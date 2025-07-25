package androidx.compose.p015ui;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.platform.InspectorInfo;
import androidx.compose.p015ui.platform.InspectorValueInfo;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* compiled from: ComposedModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.ComposedModifier */
/* loaded from: classes.dex */
class ComposedModifier extends InspectorValueInfo implements Modifier.Element {
    @NotNull
    private final InterfaceC45268n<Modifier, Composer, Integer, Modifier> factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposedModifier(@NotNull Function1<? super InspectorInfo, Unit> inspectorInfo, @NotNull InterfaceC45268n<? super Modifier, ? super Composer, ? super Integer, ? extends Modifier> factory) {
        super(inspectorInfo);
        Intrinsics.checkNotNullParameter(inspectorInfo, "inspectorInfo");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.factory = factory;
    }

    @NotNull
    public final InterfaceC45268n<Modifier, Composer, Integer, Modifier> getFactory() {
        return this.factory;
    }
}
