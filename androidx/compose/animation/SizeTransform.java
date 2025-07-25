package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.p015ui.unit.IntSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimatedContent.kt */
@Metadata
@ExperimentalAnimationApi
/* loaded from: classes.dex */
public interface SizeTransform {
    @NotNull
    /* renamed from: createAnimationSpec-TemP2vQ  reason: not valid java name */
    FiniteAnimationSpec<IntSize> mo105995createAnimationSpecTemP2vQ(long j, long j2);

    boolean getClip();
}
