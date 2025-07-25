package com.mbridge.msdk.video.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.signal.factory.JSFactory;
import com.mbridge.msdk.widget.MBridgeNoDoubleClick;

/* loaded from: classes6.dex */
public class MBridgeVastEndCardView extends MBridgeBaseView {

    /* renamed from: m */
    private ViewGroup f60646m;

    /* renamed from: n */
    private View f60647n;

    /* renamed from: o */
    private View f60648o;

    public MBridgeVastEndCardView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    /* renamed from: c */
    public final void mo48721c() {
        super.mo48721c();
        if (this.f60475e) {
            this.f60647n.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.video.module.MBridgeVastEndCardView.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MBridgeVastEndCardView.this.notifyListener.mo48633a(104, "");
                }
            });
            this.f60648o.setOnClickListener(new MBridgeNoDoubleClick() { // from class: com.mbridge.msdk.video.module.MBridgeVastEndCardView.2
                @Override // com.mbridge.msdk.widget.MBridgeNoDoubleClick
                protected final void onNoDoubleClick(View view) {
                    MBridgeVastEndCardView mBridgeVastEndCardView = MBridgeVastEndCardView.this;
                    mBridgeVastEndCardView.notifyListener.mo48633a(108, mBridgeVastEndCardView.m48843d());
                }
            });
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeBaseView
    public void init(Context context) {
        int findLayout = findLayout("mbridge_reward_endcard_vast");
        if (findLayout >= 0) {
            this.f60473c.inflate(findLayout, this);
            this.f60646m = (ViewGroup) findViewById(findID("mbridge_rl_content"));
            this.f60647n = findViewById(findID("mbridge_iv_vastclose"));
            View findViewById = findViewById(findID("mbridge_iv_vastok"));
            this.f60648o = findViewById;
            this.f60475e = isNotNULL(this.f60646m, this.f60647n, findViewById);
            mo48721c();
            if (this.f60475e) {
                setMatchParent();
                setBackgroundResource(findColor("mbridge_reward_endcard_vast_bg"));
                setClickable(true);
                ((RelativeLayout.LayoutParams) this.f60646m.getLayoutParams()).addRule(13, -1);
            }
        }
    }

    public void notifyShowListener() {
        this.notifyListener.mo48633a(111, "");
    }

    public MBridgeVastEndCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void preLoadData(JSFactory jSFactory) {
    }
}
