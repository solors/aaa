package androidx.compose.foundation;

import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.HoverInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.p015ui.graphics.Color;
import androidx.compose.p015ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p015ui.graphics.drawscope.DrawScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Indication.kt */
@Metadata
/* loaded from: classes.dex */
final class DefaultDebugIndication implements Indication {
    @NotNull
    public static final DefaultDebugIndication INSTANCE = new DefaultDebugIndication();

    /* compiled from: Indication.kt */
    @Metadata
    /* loaded from: classes.dex */
    private static final class DefaultDebugIndicationInstance implements IndicationInstance {
        @NotNull
        private final State<Boolean> isFocused;
        @NotNull
        private final State<Boolean> isHovered;
        @NotNull
        private final State<Boolean> isPressed;

        public DefaultDebugIndicationInstance(@NotNull State<Boolean> isPressed, @NotNull State<Boolean> isHovered, @NotNull State<Boolean> isFocused) {
            Intrinsics.checkNotNullParameter(isPressed, "isPressed");
            Intrinsics.checkNotNullParameter(isHovered, "isHovered");
            Intrinsics.checkNotNullParameter(isFocused, "isFocused");
            this.isPressed = isPressed;
            this.isHovered = isHovered;
            this.isFocused = isFocused;
        }

        @Override // androidx.compose.foundation.IndicationInstance
        public void drawIndication(@NotNull ContentDrawScope contentDrawScope) {
            Intrinsics.checkNotNullParameter(contentDrawScope, "<this>");
            contentDrawScope.drawContent();
            if (this.isPressed.getValue().booleanValue()) {
                DrawScope.m108016drawRectnJ9OG0$default(contentDrawScope, Color.m107526copywmQWz5c$default(Color.Companion.m107553getBlack0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo108021getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            } else if (this.isHovered.getValue().booleanValue() || this.isFocused.getValue().booleanValue()) {
                DrawScope.m108016drawRectnJ9OG0$default(contentDrawScope, Color.m107526copywmQWz5c$default(Color.Companion.m107553getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), 0L, contentDrawScope.mo108021getSizeNHjbRc(), 0.0f, null, null, 0, 122, null);
            }
        }
    }

    private DefaultDebugIndication() {
    }

    @Override // androidx.compose.foundation.Indication
    @Composable
    @NotNull
    public IndicationInstance rememberUpdatedInstance(@NotNull InteractionSource interactionSource, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        composer.startReplaceableGroup(1683566979);
        int i2 = i & 14;
        State<Boolean> collectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource, composer, i2);
        State<Boolean> collectIsHoveredAsState = HoverInteractionKt.collectIsHoveredAsState(interactionSource, composer, i2);
        State<Boolean> collectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, i2);
        composer.startReplaceableGroup(1157296644);
        boolean changed = composer.changed(interactionSource);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new DefaultDebugIndicationInstance(collectIsPressedAsState, collectIsHoveredAsState, collectIsFocusedAsState);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultDebugIndicationInstance defaultDebugIndicationInstance = (DefaultDebugIndicationInstance) rememberedValue;
        composer.endReplaceableGroup();
        return defaultDebugIndicationInstance;
    }
}
