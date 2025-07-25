package com.maticoo.sdk.view.close;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.maticoo.sdk.C21523R;
import com.maticoo.sdk.p405ad.utils.CloseReason;
import com.maticoo.sdk.utils.IdentifierGetter;
import com.maticoo.sdk.utils.log.DeveloperLog;

/* loaded from: classes6.dex */
public class AdCloseView extends FrameLayout {
    private AdCloseListener closeListener;
    private View closeReasonView;
    private View closedView;
    private boolean isSmall;

    public AdCloseView(@NonNull Context context, boolean z) {
        super(context);
        this.isSmall = z;
        init();
    }

    private void disClosedView() {
        View view = this.closedView;
        if (view != null && view.getParent() != null && (this.closedView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.closedView.getParent()).removeView(this.closedView);
        }
        DeveloperLog.LogD("disClosedView success");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissCloseReasonView() {
        View view = this.closeReasonView;
        if (view != null && view.getParent() != null && (this.closeReasonView.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.closeReasonView.getParent()).removeView(this.closeReasonView);
        }
        DeveloperLog.LogD("dismissCloseReasonView success");
    }

    private void init() {
        showCloseReasonView();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void selectCloseReason(CloseReason closeReason) {
        dismissCloseReasonView();
        showClosedView();
        AdCloseListener adCloseListener = this.closeListener;
        if (adCloseListener != null) {
            adCloseListener.onClosed(closeReason);
        }
    }

    private void showCloseReasonView() {
        if (this.closeReasonView != null) {
            dismissCloseReasonView();
            addView(this.closeReasonView);
            return;
        }
        if (this.isSmall) {
            this.closeReasonView = LayoutInflater.from(getContext()).inflate(IdentifierGetter.getLayoutId(getContext(), "zmaticoo_layout_close_reason_small", C21523R.C21527layout.zmaticoo_layout_close_reason_small), (ViewGroup) this, false);
        } else {
            this.closeReasonView = LayoutInflater.from(getContext()).inflate(IdentifierGetter.getLayoutId(getContext(), "zmaticoo_layout_close_reason", C21523R.C21527layout.zmaticoo_layout_close_reason), (ViewGroup) this, false);
        }
        addView(this.closeReasonView);
        this.closeReasonView.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.view.close.AdCloseView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
        this.closeReasonView.findViewById(IdentifierGetter.getId(getContext(), "iv_close_reason_back", C21523R.C21526id.iv_close_reason_back)).setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.view.close.AdCloseView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AdCloseView.this.dismissCloseReasonView();
                if (AdCloseView.this.closeListener != null) {
                    AdCloseView.this.closeListener.onCloseCancel();
                }
            }
        });
        TextView textView = (TextView) this.closeReasonView.findViewById(IdentifierGetter.getId(getContext(), "tv_close_not_interested", C21523R.C21526id.tv_close_not_interested));
        if (textView != null) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.view.close.AdCloseView.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AdCloseView.this.selectCloseReason(CloseReason.CLOSE_WITH_NOT_INTERESTED);
                }
            });
        }
        TextView textView2 = (TextView) this.closeReasonView.findViewById(IdentifierGetter.getId(getContext(), "tv_close_inappropriate", C21523R.C21526id.tv_close_inappropriate));
        if (textView2 != null) {
            textView2.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.view.close.AdCloseView.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AdCloseView.this.selectCloseReason(CloseReason.CLOSE_WITH_INAPPROPRIATE);
                }
            });
        }
        TextView textView3 = (TextView) this.closeReasonView.findViewById(IdentifierGetter.getId(getContext(), "tv_close_repeat", C21523R.C21526id.tv_close_repeat));
        if (textView3 != null) {
            textView3.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.view.close.AdCloseView.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    AdCloseView.this.selectCloseReason(CloseReason.CLOSE_WITH_REPEAT);
                }
            });
        }
    }

    private void showClosedView() {
        if (this.closedView != null) {
            disClosedView();
            addView(this.closedView);
            return;
        }
        if (this.isSmall) {
            this.closedView = LayoutInflater.from(getContext()).inflate(IdentifierGetter.getLayoutId(getContext(), "zmaticoo_layout_closed_small", C21523R.C21527layout.zmaticoo_layout_closed_small), (ViewGroup) this, false);
        } else {
            this.closedView = LayoutInflater.from(getContext()).inflate(IdentifierGetter.getLayoutId(getContext(), "zmaticoo_layout_closed", C21523R.C21527layout.zmaticoo_layout_closed), (ViewGroup) this, false);
        }
        addView(this.closedView);
        this.closedView.setOnClickListener(new View.OnClickListener() { // from class: com.maticoo.sdk.view.close.AdCloseView.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        });
    }

    public void setCloseListener(AdCloseListener adCloseListener) {
        this.closeListener = adCloseListener;
    }
}
