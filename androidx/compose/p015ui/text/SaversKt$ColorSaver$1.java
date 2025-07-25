package androidx.compose.p015ui.text;

import androidx.compose.p015ui.graphics.Color;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.ULong;

/* compiled from: Savers.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.SaversKt$ColorSaver$1 */
/* loaded from: classes.dex */
final class SaversKt$ColorSaver$1 extends Lambda implements Function2<SaverScope, Color, Object> {
    public static final SaversKt$ColorSaver$1 INSTANCE = new SaversKt$ColorSaver$1();

    SaversKt$ColorSaver$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Object mo105910invoke(SaverScope saverScope, Color color) {
        return m109339invoke4WTKRHQ(saverScope, color.m107537unboximpl());
    }

    @Nullable
    /* renamed from: invoke-4WTKRHQ  reason: not valid java name */
    public final Object m109339invoke4WTKRHQ(@NotNull SaverScope Saver, long j) {
        Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
        return ULong.m14618b(j);
    }
}
