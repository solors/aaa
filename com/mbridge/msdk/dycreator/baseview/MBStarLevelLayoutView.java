package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.tools.ResourceUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* loaded from: classes6.dex */
public class MBStarLevelLayoutView extends MBLinearLayout {
    public MBStarLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setRating(int i) {
        try {
            removeAllViews();
            if (i == 0) {
                i = 5;
            }
            for (int i2 = 0; i2 < 5; i2++) {
                ImageView imageView = new ImageView(getContext());
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i2 < i) {
                    imageView.setImageResource(ResourceUtil.m51605a(MBSDKContext.m52746m().m52792c(), "mbridge_download_message_dialog_star_sel", "drawable"));
                } else {
                    imageView.setImageResource(ResourceUtil.m51605a(MBSDKContext.m52746m().m52792c(), "mbridge_download_message_dilaog_star_nor", "drawable"));
                }
                addView(imageView, layoutParams);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("MBStarLevelLayoutView", e.getMessage());
        }
    }
}
