package androidx.compose.foundation;

import androidx.compose.p015ui.draw.DrawModifier;
import androidx.compose.p015ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Indication.kt */
@Metadata
/* loaded from: classes.dex */
final class IndicationModifier implements DrawModifier {
    @NotNull
    private final IndicationInstance indicationInstance;

    public IndicationModifier(@NotNull IndicationInstance indicationInstance) {
        Intrinsics.checkNotNullParameter(indicationInstance, "indicationInstance");
        this.indicationInstance = indicationInstance;
    }

    @Override // androidx.compose.p015ui.draw.DrawModifier
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
        this.indicationInstance.drawIndication(contentDrawScope);
    }

    @NotNull
    public final IndicationInstance getIndicationInstance() {
        return this.indicationInstance;
    }
}
