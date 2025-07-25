package androidx.compose.foundation.text;

import androidx.compose.p015ui.text.Placeholder;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

/* compiled from: InlineTextContent.kt */
@Immutable
@Metadata
/* loaded from: classes.dex */
public final class InlineTextContent {
    @NotNull
    private final InterfaceC45268n<String, Composer, Integer, Unit> children;
    @NotNull
    private final Placeholder placeholder;

    /* JADX WARN: Multi-variable type inference failed */
    public InlineTextContent(@NotNull Placeholder placeholder, @NotNull InterfaceC45268n<? super String, ? super Composer, ? super Integer, Unit> children) {
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(children, "children");
        this.placeholder = placeholder;
        this.children = children;
    }

    @NotNull
    public final InterfaceC45268n<String, Composer, Integer, Unit> getChildren() {
        return this.children;
    }

    @NotNull
    public final Placeholder getPlaceholder() {
        return this.placeholder;
    }
}
