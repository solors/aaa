package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.mbridge.msdk.video.signal.factory.JSFactory;

/* loaded from: classes6.dex */
public class MBridgeClickCTAViewDiff extends MBridgeBaseView {
    public TextView ctaTv;

    public MBridgeClickCTAViewDiff(Context context) {
        super(context);
    }

    public MBridgeClickCTAViewDiff(Context context, AttributeSet attributeSet, boolean z, int i, boolean z2, int i2, int i3) {
        super(context, attributeSet, z, i, z2, i2, i3);
    }

    public MBridgeClickCTAViewDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setChinaCTAData() {
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
    }

    public void preLoadData(JSFactory jSFactory) {
    }
}
