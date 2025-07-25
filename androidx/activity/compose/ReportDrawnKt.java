package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ReportDrawn.kt */
@Metadata
/* loaded from: classes.dex */
public final class ReportDrawnKt {
    @Composable
    public static final void ReportDrawn(@Nullable Composer composer, int i) {
        Composer startRestartGroup = composer.startRestartGroup(-1357012904);
        if (i == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            ReportDrawnWhen(ReportDrawnKt$ReportDrawn$1.INSTANCE, startRestartGroup, 6);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReportDrawnKt$ReportDrawn$2(i));
        }
    }

    @Composable
    public static final void ReportDrawnAfter(@NotNull Function1<? super Continuation<? super Unit>, ? extends Object> block, @Nullable Composer composer, int i) {
        FullyDrawnReporter fullyDrawnReporter;
        Intrinsics.checkNotNullParameter(block, "block");
        Composer startRestartGroup = composer.startRestartGroup(945311272);
        FullyDrawnReporterOwner current = ReportDrawn.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null && (fullyDrawnReporter = current.getFullyDrawnReporter()) != null) {
            EffectsKt.LaunchedEffect(block, fullyDrawnReporter, new ReportDrawnKt$ReportDrawnAfter$1(fullyDrawnReporter, block, null), startRestartGroup, 584);
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new ReportDrawnKt$ReportDrawnAfter$2(block, i));
                return;
            }
            return;
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1(block, i));
        }
    }

    @Composable
    public static final void ReportDrawnWhen(@NotNull Functions<Boolean> predicate, @Nullable Composer composer, int i) {
        int i2;
        FullyDrawnReporter fullyDrawnReporter;
        int i3;
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Composer startRestartGroup = composer.startRestartGroup(-2047119994);
        if ((i & 14) == 0) {
            if (startRestartGroup.changed(predicate)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            FullyDrawnReporterOwner current = ReportDrawn.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current != null && (fullyDrawnReporter = current.getFullyDrawnReporter()) != null) {
                EffectsKt.DisposableEffect(fullyDrawnReporter, predicate, new ReportDrawnKt$ReportDrawnWhen$1(fullyDrawnReporter, predicate), startRestartGroup, ((i2 << 3) & 112) | 8);
            } else {
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1(predicate, i));
                    return;
                }
                return;
            }
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new ReportDrawnKt$ReportDrawnWhen$2(predicate, i));
        }
    }
}
