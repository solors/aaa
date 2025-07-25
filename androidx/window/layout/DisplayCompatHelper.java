package androidx.window.layout;

import android.graphics.Point;
import android.view.Display;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@RequiresApi(17)
@Metadata
/* renamed from: androidx.window.layout.DisplayCompatHelperApi17 */
/* loaded from: classes2.dex */
public final class DisplayCompatHelper {
    @NotNull
    public static final DisplayCompatHelper INSTANCE = new DisplayCompatHelper();

    private DisplayCompatHelper() {
    }

    public final void getRealSize(@NotNull Display display, @NotNull Point point) {
        Intrinsics.checkNotNullParameter(display, "display");
        Intrinsics.checkNotNullParameter(point, "point");
        display.getRealSize(point);
    }
}
