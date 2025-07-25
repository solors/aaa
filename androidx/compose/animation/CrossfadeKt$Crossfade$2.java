package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Crossfade.kt */
@Metadata
/* loaded from: classes.dex */
final class CrossfadeKt$Crossfade$2<T> extends Lambda implements Function1<T, T> {
    public static final CrossfadeKt$Crossfade$2 INSTANCE = new CrossfadeKt$Crossfade$2();

    CrossfadeKt$Crossfade$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final T invoke(T t) {
        return t;
    }
}
