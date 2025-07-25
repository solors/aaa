package p879s9;

import android.view.View;
import android.widget.PopupWindow;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: s9.k */
/* loaded from: classes8.dex */
public class SafePopupWindow extends PopupWindow {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafePopupWindow(@NotNull View contentView, int i, int i2, boolean z) {
        super(contentView, i, i2, z);
        Intrinsics.checkNotNullParameter(contentView, "contentView");
    }

    @Override // android.widget.PopupWindow
    public void setContentView(@Nullable View view) {
        if (view != null) {
            view.setFilterTouchesWhenObscured(true);
        }
        super.setContentView(view);
    }
}
