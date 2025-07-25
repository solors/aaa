package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.ResourceUtil;

/* loaded from: classes6.dex */
public class MBridgeTopFullView extends BaseView {
    public static final String INTERFACE_RESULT = MBridgeTopFullView.class.getName() + "WithResault";

    /* renamed from: j */
    protected ImageView f57945j;

    /* renamed from: k */
    protected TextView f57946k;

    /* renamed from: l */
    protected TextView f57947l;

    /* renamed from: m */
    protected StarLevelLayoutView f57948m;

    public MBridgeTopFullView(Context context) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(ResourceUtil.m51605a(getContext(), "mbridge_nativex_fullscreen_top", "layout"), this.f57941i);
        if (inflate != null) {
            this.f57945j = (ImageView) inflate.findViewById(ResourceUtil.m51605a(getContext(), "mbridge_full_tv_display_icon", "id"));
            this.f57946k = (TextView) inflate.findViewById(ResourceUtil.m51605a(getContext(), "mbridge_full_tv_display_title", "id"));
            this.f57947l = (TextView) inflate.findViewById(ResourceUtil.m51605a(getContext(), "mbridge_full_tv_display_description", "id"));
            this.f57948m = (StarLevelLayoutView) inflate.findViewById(ResourceUtil.m51605a(getContext(), "mbridge_full_tv_feeds_star", "id"));
            this.f57947l.setTextColor(-7829368);
            inflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            updateLayoutParams();
        }
    }

    public TextView getMBridgeFullViewDisplayDscription() {
        return this.f57947l;
    }

    public ImageView getMBridgeFullViewDisplayIcon() {
        return this.f57945j;
    }

    public TextView getMBridgeFullViewDisplayTitle() {
        return this.f57946k;
    }

    public StarLevelLayoutView getStarLevelLayoutView() {
        return this.f57948m;
    }

    public void updateLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        this.f57933a.setLayoutParams(layoutParams);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(10);
        this.f57934b.setLayoutParams(layoutParams2);
    }
}
