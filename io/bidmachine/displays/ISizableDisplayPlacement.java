package io.bidmachine.displays;

import android.graphics.Point;
import androidx.annotation.NonNull;
import io.bidmachine.ContextProvider;
import io.bidmachine.unified.UnifiedAdRequestParams;

/* renamed from: io.bidmachine.displays.g */
/* loaded from: classes9.dex */
interface ISizableDisplayPlacement<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> {
    Point getSize(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdRequestParamsType unifiedadrequestparamstype);
}
