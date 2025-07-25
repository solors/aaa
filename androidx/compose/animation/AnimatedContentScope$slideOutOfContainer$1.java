package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnimatedContent.kt */
@Metadata
/* loaded from: classes.dex */
final class AnimatedContentScope$slideOutOfContainer$1 extends Lambda implements Function1<Integer, Integer> {
    public static final AnimatedContentScope$slideOutOfContainer$1 INSTANCE = new AnimatedContentScope$slideOutOfContainer$1();

    AnimatedContentScope$slideOutOfContainer$1() {
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
