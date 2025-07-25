package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* compiled from: Composer.kt */
@ComposeCompilerApi
@Metadata
/* loaded from: classes.dex */
public interface ScopeUpdateScope {
    void updateScope(@NotNull Function2<? super Composer, ? super Integer, Unit> function2);
}
