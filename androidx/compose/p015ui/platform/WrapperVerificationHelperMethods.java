package androidx.compose.p015ui.platform;

import android.view.View;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Wrapper.android.kt */
@RequiresApi(29)
@Metadata
/* renamed from: androidx.compose.ui.platform.WrapperVerificationHelperMethods */
/* loaded from: classes.dex */
public final class WrapperVerificationHelperMethods {
    @NotNull
    public static final WrapperVerificationHelperMethods INSTANCE = new WrapperVerificationHelperMethods();

    private WrapperVerificationHelperMethods() {
    }

    @DoNotInline
    @RequiresApi(29)
    @NotNull
    public final Map<Integer, Integer> attributeSourceResourceMap(@NotNull View view) {
        Map<Integer, Integer> attributeSourceResourceMap;
        Intrinsics.checkNotNullParameter(view, "view");
        attributeSourceResourceMap = view.getAttributeSourceResourceMap();
        Intrinsics.checkNotNullExpressionValue(attributeSourceResourceMap, "view.attributeSourceResourceMap");
        return attributeSourceResourceMap;
    }
}
