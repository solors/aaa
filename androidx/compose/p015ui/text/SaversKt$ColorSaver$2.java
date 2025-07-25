package androidx.compose.p015ui.text;

import androidx.compose.p015ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.ULong;

/* compiled from: Savers.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.SaversKt$ColorSaver$2 */
/* loaded from: classes.dex */
final class SaversKt$ColorSaver$2 extends Lambda implements Function1<Object, Color> {
    public static final SaversKt$ColorSaver$2 INSTANCE = new SaversKt$ColorSaver$2();

    SaversKt$ColorSaver$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    /* renamed from: invoke-ijrfgN4  reason: not valid java name */
    public final Color invoke(@NotNull Object it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Color.m107517boximpl(Color.m107523constructorimpl(((ULong) it).m14613g()));
    }
}
