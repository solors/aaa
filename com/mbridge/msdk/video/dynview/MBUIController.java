package com.mbridge.msdk.video.dynview;

import android.view.View;
import com.mbridge.msdk.video.dynview.p519e.ViewInflaterCallback;
import com.mbridge.msdk.video.dynview.p523h.MBridgeUI;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.b */
/* loaded from: classes6.dex */
public class MBUIController {

    /* renamed from: b */
    private static volatile MBUIController f60215b;

    /* renamed from: a */
    public Map<String, SoftReference<View>> f60216a = new HashMap();

    private MBUIController() {
    }

    /* renamed from: a */
    public static MBUIController m49040a() {
        MBUIController mBUIController;
        if (f60215b == null) {
            synchronized (MBUIController.class) {
                if (f60215b == null) {
                    f60215b = new MBUIController();
                }
                mBUIController = f60215b;
            }
            return mBUIController;
        }
        return f60215b;
    }

    /* renamed from: a */
    public final void m49039a(ViewOption viewOption, ViewInflaterCallback viewInflaterCallback) {
        new MBridgeUI(viewOption, viewInflaterCallback, new HashMap());
    }

    /* renamed from: a */
    public final void m49038a(ViewOption viewOption, ViewInflaterCallback viewInflaterCallback, Map<String, Object> map) {
        new MBridgeUI(viewOption, viewInflaterCallback, map);
    }
}
