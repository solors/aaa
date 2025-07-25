package com.google.accompanist.drawablepainter;

import android.os.Handler;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrawablePainter.kt */
@Metadata
/* loaded from: classes4.dex */
final class DrawablePainterKt$MAIN_HANDLER$2 extends Lambda implements Functions<Handler> {
    public static final DrawablePainterKt$MAIN_HANDLER$2 INSTANCE = new DrawablePainterKt$MAIN_HANDLER$2();

    DrawablePainterKt$MAIN_HANDLER$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Handler invoke() {
        return new Handler(Looper.getMainLooper());
    }
}
