package com.mbridge.msdk.video.dynview.p519e;

import com.mbridge.msdk.video.dynview.DynamicBean;
import com.mbridge.msdk.video.dynview.p517c.EnumError;

/* renamed from: com.mbridge.msdk.video.dynview.e.h */
/* loaded from: classes6.dex */
public interface ViewInflaterCallback {
    void viewInflaterFail(EnumError enumError);

    void viewInflaterSuccess(DynamicBean dynamicBean);
}
