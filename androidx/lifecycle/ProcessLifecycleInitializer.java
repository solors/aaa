package androidx.lifecycle;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.startup.AppInitializer;
import androidx.startup.Initializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProcessLifecycleInitializer.kt */
@Metadata
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements Initializer<LifecycleOwner> {
    @Override // androidx.startup.Initializer
    @NotNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        List<Class<? extends Initializer<?>>> m17166m;
        m17166m = C37563v.m17166m();
        return m17166m;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @NotNull
    public LifecycleOwner create(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AppInitializer appInitializer = AppInitializer.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(appInitializer, "getInstance(context)");
        if (appInitializer.isEagerlyInitialized(ProcessLifecycleInitializer.class)) {
            LifecycleDispatcher.init(context);
            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.Companion;
            companion.init$lifecycle_process_release(context);
            return companion.get();
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
