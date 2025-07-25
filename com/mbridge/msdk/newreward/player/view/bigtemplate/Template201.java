package com.mbridge.msdk.newreward.player.view.bigtemplate;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.newreward.player.iview.IBaseView;
import com.mbridge.msdk.newreward.player.presenter.BigTemplatePresenter;

/* loaded from: classes6.dex */
public class Template201 extends RelativeLayout implements View.OnClickListener, IBaseView {
    protected BigTemplatePresenter bigTemplatePresenter;

    public Template201(@NonNull Context context) {
        super(context);
        BigTemplatePresenter bigTemplatePresenter = new BigTemplatePresenter(this);
        this.bigTemplatePresenter = bigTemplatePresenter;
        bigTemplatePresenter.getView();
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void addViewToCurrentViewGroup(View view) {
        addView(view);
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public boolean initViews(boolean z) {
        return false;
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void removeTempleFromSuperView(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView(this);
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void show(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        viewGroup.addView(this);
    }

    public Template201(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.mbridge.msdk.newreward.player.iview.IBaseView
    public void onActivityLifeCycleCallback(String str) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }
}
