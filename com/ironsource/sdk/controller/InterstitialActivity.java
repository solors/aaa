package com.ironsource.sdk.controller;

import android.os.Bundle;
import com.ironsource.C21114v8;
import com.ironsource.sdk.utils.Logger;

/* loaded from: classes6.dex */
public class InterstitialActivity extends ControllerActivity {

    /* renamed from: r */
    private static final String f52915r = "InterstitialActivity";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.m54970i(f52915r, "onCreate");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Logger.m54970i(f52915r, C21114v8.C21122h.f54092t0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ironsource.sdk.controller.ControllerActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Logger.m54970i(f52915r, C21114v8.C21122h.f54094u0);
    }
}
