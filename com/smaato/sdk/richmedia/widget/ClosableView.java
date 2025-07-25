package com.smaato.sdk.richmedia.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.richmedia.widget.ClosableView;
import com.smaato.sdk.richmedia_light.C27626R;

/* loaded from: classes7.dex */
public final class ClosableView extends FrameLayout {
    @NonNull
    private ImageButton close;
    @NonNull
    private FrameLayout container;
    @Nullable
    private OnCloseClickListener listener;

    /* loaded from: classes7.dex */
    public interface OnCloseClickListener {
        void onCloseClick();
    }

    public ClosableView(@NonNull Context context) {
        super(context);
        LayoutInflater.from(getContext()).inflate(C27626R.C27630layout.smaato_sdk_richmedia_layout_closable, (ViewGroup) this, true);
        this.container = (FrameLayout) findViewById(C27626R.C27629id.container);
        ImageButton imageButton = (ImageButton) findViewById(C27626R.C27629id.close);
        this.close = imageButton;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: com.smaato.sdk.richmedia.widget.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClosableView.m39006a(ClosableView.this, view);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m39006a(ClosableView closableView, View view) {
        closableView.lambda$new$0(view);
    }

    @NonNull
    private Rect getRectForNewSize(@NonNull Rect rect) {
        Rect rect2 = new Rect();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.close.getLayoutParams();
        Gravity.apply(layoutParams.gravity, layoutParams.width, layoutParams.height, rect, rect2);
        return rect2;
    }

    public /* synthetic */ void lambda$new$0(View view) {
        callOnCloseListener();
    }

    public void addContent(@NonNull View view) {
        this.container.addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    public void callOnCloseListener() {
        Objects.onNotNull(this.listener, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.a
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ((ClosableView.OnCloseClickListener) obj).onCloseClick();
            }
        });
    }

    @NonNull
    public ImageButton getCloseButton() {
        return this.close;
    }

    public boolean hasContent() {
        if (this.container.getChildCount() > 0 && getParent() != null) {
            return true;
        }
        return false;
    }

    public boolean isCloseRegionVisible(@NonNull Rect rect, @NonNull Rect rect2) {
        return rect.contains(getRectForNewSize(rect2));
    }

    public void setOnCloseClickListener(@Nullable OnCloseClickListener onCloseClickListener) {
        this.listener = onCloseClickListener;
    }
}
