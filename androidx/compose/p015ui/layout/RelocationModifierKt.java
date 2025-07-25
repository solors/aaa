package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* compiled from: RelocationModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.RelocationModifierKt */
/* loaded from: classes.dex */
public final class RelocationModifierKt {
    @ExperimentalComposeUiApi
    @NotNull
    public static final Modifier onRelocationRequest(@NotNull Modifier modifier, @NotNull Function2<? super Rect, ? super LayoutCoordinates, Rect> onProvideDestination, @NotNull InterfaceC45268n<? super Rect, ? super Rect, ? super Continuation<? super Unit>, ? extends Object> onPerformRelocation) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onProvideDestination, "onProvideDestination");
        Intrinsics.checkNotNullParameter(onPerformRelocation, "onPerformRelocation");
        return modifier;
    }
}
