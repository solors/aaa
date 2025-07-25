package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.p422e.CommUtil;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.tools.ResourceUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* loaded from: classes6.dex */
public class MBHeatLevelLayoutView extends MBLinearLayout {
    public MBHeatLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setHeatCount(int i) {
        try {
            removeAllViews();
            double m52952a = CommUtil.m52952a(i, 10000.0d, 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, CommUtil.m52951a(getContext(), 30.0f));
            layoutParams.setMargins(15, 0, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setGravity(17);
            textView.setTextColor(Color.parseColor("#FF000000"));
            textView.setTextSize(10.0f);
            Drawable drawable = getResources().getDrawable(ResourceUtil.m51605a(getContext(), "mbridge_reward_user", "drawable"));
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            }
            textView.setCompoundDrawables(null, null, drawable, null);
            int identifier = getResources().getIdentifier("mbridge_reward_heat_count_unit", "string", MBSDKContext.m52746m().m52783g());
            textView.setText(m52952a + getResources().getString(identifier));
            addView(textView, layoutParams);
        } catch (Exception e) {
            SameLogTool.m51824b("MBHeatLevelLayoutView", e.getMessage());
        }
    }
}
