package p863r9;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p879s9.SafePopupWindow;

@Metadata
/* renamed from: r9.g */
/* loaded from: classes8.dex */
public final class DivTooltipWindow extends SafePopupWindow {
    public /* synthetic */ DivTooltipWindow(View view, int i, int i2, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? false : z);
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        try {
            super.dismiss();
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivTooltipWindow(@NotNull View contentView, int i, int i2, boolean z) {
        super(contentView, i, i2, z);
        Intrinsics.checkNotNullParameter(contentView, "contentView");
    }
}
