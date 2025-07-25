package androidx.compose.p015ui.semantics;

import androidx.compose.p015ui.ExperimentalComposeUiApi;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SemanticsProperties.android.kt */
@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsPropertiesAndroid */
/* loaded from: classes.dex */
public final class SemanticsPropertiesAndroid {
    public static final int $stable = 0;
    @NotNull
    public static final SemanticsPropertiesAndroid INSTANCE = new SemanticsPropertiesAndroid();
    @NotNull
    private static final SemanticsPropertyKey<Boolean> TestTagsAsResourceId = new SemanticsPropertyKey<>("TestTagsAsResourceId", SemanticsPropertiesAndroid$TestTagsAsResourceId$1.INSTANCE);

    private SemanticsPropertiesAndroid() {
    }

    @ExperimentalComposeUiApi
    @NotNull
    public final SemanticsPropertyKey<Boolean> getTestTagsAsResourceId() {
        return TestTagsAsResourceId;
    }

    @ExperimentalComposeUiApi
    public static /* synthetic */ void getTestTagsAsResourceId$annotations() {
    }
}
