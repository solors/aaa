package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimatedContent.kt */
@Metadata
/* loaded from: classes.dex */
final class AnimatedContentScope$slideIntoContainer$1 extends Lambda implements Function1<Integer, Integer> {
    public static final AnimatedContentScope$slideIntoContainer$1 INSTANCE = new AnimatedContentScope$slideIntoContainer$1();

    AnimatedContentScope$slideIntoContainer$1() {
        super(1);
    }

    @NotNull
    public final Integer invoke(int i) {
        return Integer.valueOf(i);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }
}
