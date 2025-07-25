package androidx.compose.p015ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DoNotInline;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StaticLayoutFactory.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactoryPre21 */
/* loaded from: classes.dex */
public final class StaticLayoutFactoryPre21 implements StaticLayoutFactoryImpl {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static boolean isInitialized;
    @Nullable
    private static Constructor<StaticLayout> staticLayoutConstructor;

    /* compiled from: StaticLayoutFactory.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.text.android.StaticLayoutFactoryPre21$Companion */
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Constructor<StaticLayout> getStaticLayoutConstructor() {
            if (StaticLayoutFactoryPre21.isInitialized) {
                return StaticLayoutFactoryPre21.staticLayoutConstructor;
            }
            StaticLayoutFactoryPre21.isInitialized = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                StaticLayoutFactoryPre21.staticLayoutConstructor = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                StaticLayoutFactoryPre21.staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to collect necessary constructor.");
            }
            return StaticLayoutFactoryPre21.staticLayoutConstructor;
        }
    }

    @Override // androidx.compose.p015ui.text.android.StaticLayoutFactoryImpl
    @DoNotInline
    @NotNull
    public StaticLayout create(@NotNull StaticLayoutParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        Constructor staticLayoutConstructor2 = Companion.getStaticLayoutConstructor();
        StaticLayout staticLayout = null;
        if (staticLayoutConstructor2 != null) {
            try {
                staticLayout = (StaticLayout) staticLayoutConstructor2.newInstance(params.getText(), Integer.valueOf(params.getStart()), Integer.valueOf(params.getEnd()), params.getPaint(), Integer.valueOf(params.getWidth()), params.getAlignment(), params.getTextDir(), Float.valueOf(params.getLineSpacingMultiplier()), Float.valueOf(params.getLineSpacingExtra()), Boolean.valueOf(params.getIncludePadding()), params.getEllipsize(), Integer.valueOf(params.getEllipsizedWidth()), Integer.valueOf(params.getMaxLines()));
            } catch (IllegalAccessException unused) {
                staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InstantiationException unused2) {
                staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            } catch (InvocationTargetException unused3) {
                staticLayoutConstructor = null;
                Log.e("StaticLayoutFactory", "unable to call constructor");
            }
        }
        if (staticLayout != null) {
            return staticLayout;
        }
        return new StaticLayout(params.getText(), params.getStart(), params.getEnd(), params.getPaint(), params.getWidth(), params.getAlignment(), params.getLineSpacingMultiplier(), params.getLineSpacingExtra(), params.getIncludePadding(), params.getEllipsize(), params.getEllipsizedWidth());
    }
}
