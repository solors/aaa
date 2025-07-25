package com.mbridge.msdk.nativex.view.mbfullview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.ResourceUtil;

/* loaded from: classes6.dex */
public class BaseView extends RelativeLayout {

    /* renamed from: a */
    protected RelativeLayout f57933a;

    /* renamed from: b */
    protected RelativeLayout f57934b;

    /* renamed from: c */
    protected RelativeLayout f57935c;

    /* renamed from: d */
    protected ImageView f57936d;

    /* renamed from: e */
    protected TextView f57937e;

    /* renamed from: f */
    protected ProgressBar f57938f;

    /* renamed from: g */
    protected FrameLayout f57939g;

    /* renamed from: h */
    protected LinearLayout f57940h;

    /* renamed from: i */
    protected RelativeLayout f57941i;
    public EnumC22278a style;

    /* renamed from: com.mbridge.msdk.nativex.view.mbfullview.BaseView$a */
    /* loaded from: classes6.dex */
    public enum EnumC22278a {
        FULL_TOP_VIEW,
        FULL_MIDDLE_VIEW
    }

    public BaseView(Context context) {
        super(context);
        View inflate = LayoutInflater.from(getContext()).inflate(ResourceUtil.m51605a(getContext(), "mbridge_nativex_fullbasescreen", "layout"), this);
        this.f57941i = (RelativeLayout) inflate;
        if (inflate != null) {
            this.f57933a = (RelativeLayout) inflate.findViewById(ResourceUtil.m51605a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            this.f57934b = (RelativeLayout) inflate.findViewById(ResourceUtil.m51605a(getContext(), "mbridge_full_player_parent", "id"));
            this.f57935c = (RelativeLayout) inflate.findViewById(ResourceUtil.m51605a(getContext(), "mbridge_full_rl_close", "id"));
            this.f57936d = (ImageView) inflate.findViewById(ResourceUtil.m51605a(getContext(), "mbridge_full_iv_close", "id"));
            this.f57937e = (TextView) inflate.findViewById(ResourceUtil.m51605a(getContext(), "mbridge_full_tv_install", "id"));
            this.f57938f = (ProgressBar) inflate.findViewById(ResourceUtil.m51605a(getContext(), "mbridge_full_pb_loading", "id"));
            this.f57939g = (FrameLayout) inflate.findViewById(ResourceUtil.m51605a(getContext(), "mbridge_full_animation_content", "id"));
            this.f57940h = (LinearLayout) inflate.findViewById(ResourceUtil.m51605a(getContext(), "mbridge_full_animation_player", "id"));
            inflate.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }

    public RelativeLayout getMBridgeFullClose() {
        return this.f57935c;
    }

    public ImageView getMBridgeFullIvClose() {
        return this.f57936d;
    }

    public ProgressBar getMBridgeFullPb() {
        return this.f57938f;
    }

    public RelativeLayout getMBridgeFullPlayContainer() {
        return this.f57933a;
    }

    public RelativeLayout getMBridgeFullPlayerParent() {
        return this.f57934b;
    }

    public TextView getMBridgeFullTvInstall() {
        return this.f57937e;
    }

    public EnumC22278a getStytle() {
        return this.style;
    }

    public FrameLayout getmAnimationContent() {
        return this.f57939g;
    }

    public LinearLayout getmAnimationPlayer() {
        return this.f57940h;
    }

    public void setStytle(EnumC22278a enumC22278a) {
        this.style = enumC22278a;
    }
}
