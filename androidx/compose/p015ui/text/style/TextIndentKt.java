package androidx.compose.p015ui.text.style;

import androidx.compose.p015ui.text.SpanStyleKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextIndent.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.style.TextIndentKt */
/* loaded from: classes.dex */
public final class TextIndentKt {
    @NotNull
    public static final TextIndent lerp(@NotNull TextIndent start, @NotNull TextIndent stop, float f) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(stop, "stop");
        return new TextIndent(SpanStyleKt.m109360lerpTextUnitInheritableC3pnCVY(start.m109663getFirstLineXSAIIZE(), stop.m109663getFirstLineXSAIIZE(), f), SpanStyleKt.m109360lerpTextUnitInheritableC3pnCVY(start.m109664getRestLineXSAIIZE(), stop.m109664getRestLineXSAIIZE(), f), null);
    }
}
