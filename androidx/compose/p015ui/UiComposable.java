package androidx.compose.p015ui;

import androidx.compose.runtime.ComposableTargetMarker;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;

/* compiled from: UiComposable.kt */
@Target({ElementType.METHOD, ElementType.TYPE_PARAMETER, ElementType.TYPE_USE})
@ComposableTargetMarker(description = "UI Composable")
@Metadata
@Retention(RetentionPolicy.CLASS)
/* renamed from: androidx.compose.ui.UiComposable */
/* loaded from: classes.dex */
public @interface UiComposable {
}
