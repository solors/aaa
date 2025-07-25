package androidx.compose.p015ui.text.android;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: StaticLayoutFactory.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactoryImpl */
/* loaded from: classes.dex */
interface StaticLayoutFactoryImpl {
    @DoNotInline
    @NotNull
    StaticLayout create(@NotNull StaticLayoutParams staticLayoutParams);
}
