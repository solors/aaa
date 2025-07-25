package com.mbridge.msdk.dycreator.wrapper;

import android.view.View;
import com.mbridge.msdk.dycreator.binding.response.base.BaseRespData;
import com.mbridge.msdk.dycreator.p418b.DyError;

/* loaded from: classes6.dex */
public interface DynamicViewBackListener {
    void viewClicked(BaseRespData baseRespData);

    void viewCreateFail(DyError dyError);

    void viewCreatedSuccess(View view);
}
