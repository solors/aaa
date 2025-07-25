package com.mbridge.msdk.mbsignalcommon.webEnvCheck;

import android.content.Context;
import com.ironsource.C20517nb;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p411c.p413b.WebEnvCheckController;

/* loaded from: classes6.dex */
public class WebEnvCheckEntry {
    public void check(Context context) {
        WindVaneWebView windVaneWebView = new WindVaneWebView(context);
        windVaneWebView.loadDataWithBaseURL(null, "<html><script>" + WebEnvCheckController.m53361a().m53356b() + "</script></html>", "text/html", C20517nb.f52167N, null);
    }
}
