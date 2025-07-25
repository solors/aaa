package com.yandex.div.core.view2;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.IntRange;
import androidx.annotation.MainThread;
import androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.yandex.div.core.view2.v0 */
/* loaded from: classes8.dex */
public class ViewVisibilityCalculator {
    @NotNull

    /* renamed from: a */
    private final Rect f75906a = new Rect();

    @IntRange(from = 0, m105510to = AndroidComposeViewAccessibilityDelegateCompat.SendRecurringAccessibilityEventsIntervalMillis)
    @MainThread
    /* renamed from: a */
    public int m36693a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!view.isShown() || !view.getGlobalVisibleRect(this.f75906a)) {
            return 0;
        }
        return ((this.f75906a.width() * this.f75906a.height()) * 100) / (view.getWidth() * view.getHeight());
    }

    @MainThread
    /* renamed from: b */
    public boolean m36692b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (!view.isShown() || !view.getGlobalVisibleRect(this.f75906a) || view.getWidth() != this.f75906a.width() || view.getHeight() != this.f75906a.height()) {
            return false;
        }
        return true;
    }
}
