package com.unity3d.services.ads.adunit;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import com.unity3d.services.core.misc.ViewUtilities;
import com.unity3d.services.core.webview.bridge.SharedInstances;

/* loaded from: classes7.dex */
public class AdUnitTransparentActivity extends AdUnitActivity {
    @Override // com.unity3d.services.ads.adunit.AdUnitActivity
    protected AdUnitActivityController createController() {
        return new AdUnitTransparentActivityController(this, SharedInstances.INSTANCE.getWebViewEventSender(), new AdUnitViewHandlerFactory());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.unity3d.services.ads.adunit.AdUnitActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewUtilities.setBackground(this._controller._layout, new ColorDrawable(0));
    }
}
