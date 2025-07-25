package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.ResourceUtil;

/* loaded from: classes6.dex */
public class SoundImageView extends ImageView {

    /* renamed from: a */
    private boolean f55777a;

    public SoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55777a = true;
    }

    public boolean getStatus() {
        return this.f55777a;
    }

    public void setSoundStatus(boolean z) {
        this.f55777a = z;
        if (z) {
            setImageResource(ResourceUtil.m51605a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(ResourceUtil.m51605a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f55777a = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.f55777a = true;
    }
}
