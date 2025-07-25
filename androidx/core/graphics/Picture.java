package androidx.core.graphics;

import android.graphics.Canvas;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.graphics.PictureKt */
/* loaded from: classes.dex */
public final class Picture {
    @NotNull
    public static final android.graphics.Picture record(@NotNull android.graphics.Picture picture, int i, int i2, @NotNull Function1<? super Canvas, Unit> block) {
        Intrinsics.checkNotNullParameter(picture, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        Canvas beginRecording = picture.beginRecording(i, i2);
        Intrinsics.checkNotNullExpressionValue(beginRecording, "beginRecording(width, height)");
        try {
            block.invoke(beginRecording);
            return picture;
        } finally {
            InlineMarker.m17017b(1);
            picture.endRecording();
            InlineMarker.m17018a(1);
        }
    }
}
