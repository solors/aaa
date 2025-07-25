package androidx.compose.p015ui.node;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.layout.MeasurePolicy;
import androidx.compose.p015ui.platform.ViewConfiguration;
import androidx.compose.p015ui.unit.Density;
import androidx.compose.p015ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Functions;
import org.jetbrains.annotations.NotNull;

/* compiled from: ComposeUiNode.kt */
@Metadata
/* renamed from: androidx.compose.ui.node.ComposeUiNode */
/* loaded from: classes.dex */
public interface ComposeUiNode {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: ComposeUiNode.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.node.ComposeUiNode$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        @NotNull
        private static final Functions<ComposeUiNode> Constructor = LayoutNode.Companion.getConstructor$ui_release();
        @NotNull
        private static final Function2<ComposeUiNode, Modifier, Unit> SetModifier = ComposeUiNode$Companion$SetModifier$1.INSTANCE;
        @NotNull
        private static final Function2<ComposeUiNode, Density, Unit> SetDensity = ComposeUiNode$Companion$SetDensity$1.INSTANCE;
        @NotNull
        private static final Function2<ComposeUiNode, MeasurePolicy, Unit> SetMeasurePolicy = ComposeUiNode$Companion$SetMeasurePolicy$1.INSTANCE;
        @NotNull
        private static final Function2<ComposeUiNode, LayoutDirection, Unit> SetLayoutDirection = ComposeUiNode$Companion$SetLayoutDirection$1.INSTANCE;
        @NotNull
        private static final Function2<ComposeUiNode, ViewConfiguration, Unit> SetViewConfiguration = ComposeUiNode$Companion$SetViewConfiguration$1.INSTANCE;

        private Companion() {
        }

        @NotNull
        public final Functions<ComposeUiNode> getConstructor() {
            return Constructor;
        }

        @NotNull
        public final Function2<ComposeUiNode, Density, Unit> getSetDensity() {
            return SetDensity;
        }

        @NotNull
        public final Function2<ComposeUiNode, LayoutDirection, Unit> getSetLayoutDirection() {
            return SetLayoutDirection;
        }

        @NotNull
        public final Function2<ComposeUiNode, MeasurePolicy, Unit> getSetMeasurePolicy() {
            return SetMeasurePolicy;
        }

        @NotNull
        public final Function2<ComposeUiNode, Modifier, Unit> getSetModifier() {
            return SetModifier;
        }

        @NotNull
        public final Function2<ComposeUiNode, ViewConfiguration, Unit> getSetViewConfiguration() {
            return SetViewConfiguration;
        }
    }

    @NotNull
    Density getDensity();

    @NotNull
    LayoutDirection getLayoutDirection();

    @NotNull
    MeasurePolicy getMeasurePolicy();

    @NotNull
    Modifier getModifier();

    @NotNull
    ViewConfiguration getViewConfiguration();

    void setDensity(@NotNull Density density);

    void setLayoutDirection(@NotNull LayoutDirection layoutDirection);

    void setMeasurePolicy(@NotNull MeasurePolicy measurePolicy);

    void setModifier(@NotNull Modifier modifier);

    void setViewConfiguration(@NotNull ViewConfiguration viewConfiguration);
}
