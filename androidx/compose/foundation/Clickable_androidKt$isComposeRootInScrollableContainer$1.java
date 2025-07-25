package androidx.compose.foundation;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Clickable.android.kt */
@Metadata
/* loaded from: classes.dex */
public final class Clickable_androidKt$isComposeRootInScrollableContainer$1 extends Lambda implements Functions<Boolean> {
    final /* synthetic */ View $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Clickable_androidKt$isComposeRootInScrollableContainer$1(View view) {
        super(0);
        this.$view = view;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Functions
    @NotNull
    public final Boolean invoke() {
        boolean isInScrollableViewGroup;
        isInScrollableViewGroup = Clickable_androidKt.isInScrollableViewGroup(this.$view);
        return Boolean.valueOf(isInScrollableViewGroup);
    }
}
