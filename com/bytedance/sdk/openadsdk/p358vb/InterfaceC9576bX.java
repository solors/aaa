package com.bytedance.sdk.openadsdk.p358vb;

import android.content.Context;
import android.os.Handler;
import com.bytedance.sdk.openadsdk.p358vb.p359IL.C9575bg;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.vb.bX */
/* loaded from: classes3.dex */
public interface InterfaceC9576bX {
    Context getContext();

    Handler getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<C9575bg> list);
}
