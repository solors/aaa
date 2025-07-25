package p988u;

import android.graphics.drawable.Drawable;
import androidx.annotation.MainThread;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p869s.Target;

@Metadata
/* renamed from: u.d */
/* loaded from: classes2.dex */
public interface TransitionTarget extends Target {

    /* compiled from: TransitionTarget.kt */
    @Metadata
    /* renamed from: u.d$a */
    /* loaded from: classes2.dex */
    public static final class C44415a {
        @MainThread
        /* renamed from: a */
        public static void m3086a(@NotNull TransitionTarget transitionTarget, @Nullable Drawable drawable) {
            Target.C39565a.m12239a(transitionTarget, drawable);
        }

        @MainThread
        /* renamed from: b */
        public static void m3085b(@NotNull TransitionTarget transitionTarget, @Nullable Drawable drawable) {
            Target.C39565a.m12238b(transitionTarget, drawable);
        }

        @MainThread
        /* renamed from: c */
        public static void m3084c(@NotNull TransitionTarget transitionTarget, @NotNull Drawable drawable) {
            Target.C39565a.m12237c(transitionTarget, drawable);
        }
    }

    @Nullable
    /* renamed from: d */
    Drawable mo3087d();
}
