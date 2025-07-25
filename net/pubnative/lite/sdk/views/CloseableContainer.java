package net.pubnative.lite.sdk.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.Random;
import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.core.C38563R;
import net.pubnative.lite.sdk.utils.ViewUtils;
import net.pubnative.lite.sdk.vpaid.helpers.BitmapHelper;

/* loaded from: classes10.dex */
public class CloseableContainer extends FrameLayout {
    static final float CLOSE_BUTTON_PADDING_BORDER_DP = 0.0f;
    static final float CLOSE_BUTTON_PADDING_DP = 0.0f;
    private static final float CLOSE_REGION_SIZE_DP = 30.0f;
    private final ImageButton mCloseButton;
    private ClosePosition mClosePosition;
    private Integer mCustomCloseSize;
    private OnCloseListener mOnCloseListener;

    /* loaded from: classes10.dex */
    public enum ClosePosition {
        TOP_LEFT(8388659),
        TOP_CENTER(49),
        TOP_RIGHT(8388661),
        CENTER(17),
        BOTTOM_LEFT(8388691),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(8388693),
        RANDOM(0);
        
        private final int mGravity;

        ClosePosition(int i) {
            this.mGravity = i;
        }

        public static ClosePosition getRandomPosition() {
            return values()[new Random().nextInt(values().length)];
        }

        int getGravity() {
            return this.mGravity;
        }
    }

    /* loaded from: classes10.dex */
    public interface OnCloseListener {
        void onClose();
    }

    public CloseableContainer(Context context) {
        this(context, null, 0);
    }

    /* renamed from: a */
    public static /* synthetic */ void m14178a(CloseableContainer closeableContainer, View view) {
        closeableContainer.lambda$new$0(view);
    }

    public /* synthetic */ void lambda$new$0(View view) {
        playSoundEffect(0);
        OnCloseListener onCloseListener = this.mOnCloseListener;
        if (onCloseListener != null) {
            onCloseListener.onClose();
        }
    }

    private void positionButton() {
        FrameLayout.LayoutParams layoutParams;
        if (this.mCustomCloseSize != null) {
            layoutParams = new FrameLayout.LayoutParams(this.mCustomCloseSize.intValue(), this.mCustomCloseSize.intValue());
            this.mCloseButton.setId(C38563R.C38566id.button_fullscreen_close_small);
            int convertDpToPixel = (int) ViewUtils.convertDpToPixel(8.0f, getContext());
            layoutParams.setMargins(convertDpToPixel, convertDpToPixel, convertDpToPixel, convertDpToPixel);
        } else {
            int convertDpToPixel2 = (int) ViewUtils.convertDpToPixel(CLOSE_REGION_SIZE_DP, getContext());
            layoutParams = new FrameLayout.LayoutParams(convertDpToPixel2, convertDpToPixel2);
        }
        layoutParams.gravity = this.mClosePosition.getGravity();
        removeView(this.mCloseButton);
        addView(this.mCloseButton, layoutParams);
    }

    public void setClosePosition(ClosePosition closePosition) {
        if (closePosition != null) {
            if (closePosition == ClosePosition.RANDOM) {
                this.mClosePosition = ClosePosition.getRandomPosition();
            } else if (closePosition == ClosePosition.TOP_LEFT) {
                int convertDpToPixel = (int) ViewUtils.convertDpToPixel(0.0f, getContext());
                int convertDpToPixel2 = (int) ViewUtils.convertDpToPixel(0.0f, getContext());
                this.mClosePosition = closePosition;
                this.mCloseButton.setPadding(convertDpToPixel2, convertDpToPixel2, convertDpToPixel, convertDpToPixel);
            } else {
                this.mClosePosition = closePosition;
            }
        }
    }

    public void setCloseSize(Integer num) {
        this.mCustomCloseSize = Integer.valueOf((int) ViewUtils.convertDpToPixel(num.floatValue(), getContext()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.mCustomCloseSize.intValue(), this.mCustomCloseSize.intValue());
        layoutParams.gravity = this.mClosePosition.getGravity();
        removeView(this.mCloseButton);
        addView(this.mCloseButton, layoutParams);
    }

    public void setCloseVisible(boolean z) {
        int i;
        ImageButton imageButton = this.mCloseButton;
        if (imageButton != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageButton.setVisibility(i);
            if (z) {
                positionButton();
            }
        }
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.mOnCloseListener = onCloseListener;
    }

    public CloseableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CloseableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCustomCloseSize = null;
        this.mClosePosition = ClosePosition.TOP_LEFT;
        int convertDpToPixel = (int) ViewUtils.convertDpToPixel(0.0f, context);
        int convertDpToPixel2 = (int) ViewUtils.convertDpToPixel(0.0f, context);
        ImageButton imageButton = new ImageButton(context);
        this.mCloseButton = imageButton;
        Integer normalCloseXmlResource = HyBid.getNormalCloseXmlResource();
        int i2 = C38563R.mipmap.close;
        Bitmap bitmap = BitmapHelper.toBitmap(context, normalCloseXmlResource, Integer.valueOf(i2));
        if (bitmap != null) {
            imageButton.setImageBitmap(bitmap);
        } else {
            imageButton.setImageBitmap(BitmapHelper.decodeResource(imageButton.getContext(), Integer.valueOf(i2)));
        }
        imageButton.setId(C38563R.C38566id.button_fullscreen_close);
        imageButton.setBackgroundColor(0);
        imageButton.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageButton.setPadding(convertDpToPixel, convertDpToPixel2, convertDpToPixel2, convertDpToPixel);
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: net.pubnative.lite.sdk.views.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CloseableContainer.m14178a(CloseableContainer.this, view);
            }
        });
    }
}
