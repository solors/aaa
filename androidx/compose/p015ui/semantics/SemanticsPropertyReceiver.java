package androidx.compose.p015ui.semantics;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SemanticsProperties.kt */
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsPropertyReceiver */
/* loaded from: classes.dex */
public interface SemanticsPropertyReceiver {
    <T> void set(@NotNull SemanticsPropertyKey<T> semanticsPropertyKey, T t);
}
