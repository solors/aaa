package com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import com.zeus.gmc.sdk.mobileads.columbus.C32065R;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32470coiio2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.AbstractRunnableC32566c2oc2o;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cici2o2oo.C32584coiic;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coiio2.C32726coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.CloseableLayout */
/* loaded from: classes8.dex */
public class CloseableLayout extends FrameLayout {
    private static final int cc2iiooocc2 = 1000;
    static final float cc2o22co2c = 26.0f;
    static final float ccci2 = 8.0f;
    private static final String ccoio = "CloseableLayout";
    static final float coocii = 50.0f;
    private int c222o2o2c2o;
    private int c22o22co22i;
    private Runnable c2ccocci;
    @NonNull
    private final StateListDrawable c2oc2i;
    private final int c2oc2o;
    private boolean c2oicci2;
    private final int cco22;
    private final Rect ccoc2oic;
    private final Rect cicc2iiccc;
    private String cici2o2oo;
    private final Rect cicic;
    private final int cii2c2;
    private boolean ciii2coi2;
    private Runnable ciiio2o;
    @Nullable
    private RunnableC32139cioccoiococ ciiioc2ioc;
    private String ciio2c;
    private int cioc2;
    @NonNull
    private ClosePosition cioccoiococ;
    @Nullable
    private InterfaceC32138c2oc2i coi222o222;
    private final Rect coiic;
    private View coiio2;
    private final int coo2iico;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.CloseableLayout$ClosePosition */
    /* loaded from: classes8.dex */
    public enum ClosePosition {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);
        
        private final int mGravity;

        ClosePosition(int i) {
            this.mGravity = i;
        }

        int getGravity() {
            return this.mGravity;
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.CloseableLayout$c2oc2i */
    /* loaded from: classes8.dex */
    public interface InterfaceC32138c2oc2i {
        void onClose();
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.CloseableLayout$cioccoiococ */
    /* loaded from: classes8.dex */
    private final class RunnableC32139cioccoiococ implements Runnable {
        private RunnableC32139cioccoiococ() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CloseableLayout.this.setClosePressed(false);
        }

        /* synthetic */ RunnableC32139cioccoiococ(CloseableLayout closeableLayout, C32141coo2iico c32141coo2iico) {
            this();
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.CloseableLayout$coi222o222 */
    /* loaded from: classes8.dex */
    class C32140coi222o222 extends AbstractRunnableC32566c2oc2o {
        C32140coi222o222(String str, String str2) {
            super(str, str2);
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.AbstractRunnableC32566c2oc2o
        protected void coo2iico() throws Exception {
            CloseableLayout closeableLayout = CloseableLayout.this;
            closeableLayout.coo2iico((String) null, closeableLayout.cioc2, CloseableLayout.this.cici2o2oo, CloseableLayout.this.ciio2c);
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.CloseableLayout$coo2iico */
    /* loaded from: classes8.dex */
    class C32141coo2iico extends AbstractRunnableC32566c2oc2o {
        C32141coo2iico(String str, String str2) {
            super(str, str2);
        }

        @Override // com.zeus.gmc.sdk.mobileads.columbus.internal.ci22c2.AbstractRunnableC32566c2oc2o
        protected void coo2iico() throws Exception {
            CloseableLayout.this.setCloseVisible(true);
        }
    }

    public CloseableLayout(@NonNull Context context) {
        this(context, null, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosePressed(boolean z) {
        int[] iArr;
        if (z == coo2iico()) {
            return;
        }
        StateListDrawable stateListDrawable = this.c2oc2i;
        if (z) {
            iArr = FrameLayout.SELECTED_STATE_SET;
        } else {
            iArr = FrameLayout.EMPTY_STATE_SET;
        }
        stateListDrawable.setState(iArr);
        invalidate(this.cicic);
    }

    boolean c2oc2o() {
        if (!this.c2oicci2 && !this.c2oc2i.isVisible()) {
            return false;
        }
        return true;
    }

    public void cioccoiococ() {
        removeCallbacks(this.c2ccocci);
        postDelayed(this.c2ccocci, 1000L);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.ciii2coi2) {
            this.ciii2coi2 = false;
            this.coiic.set(0, 0, getWidth(), getHeight());
            coo2iico(this.cioccoiococ, this.coiic, this.c22o22co22i, this.c222o2o2c2o, this.cicic);
            this.ccoc2oic.set(this.cicic);
            Rect rect = this.ccoc2oic;
            int i = this.cii2c2;
            rect.inset(i, i);
            coo2iico(this.cioccoiococ, this.ccoc2oic, this.cicc2iiccc);
            this.c2oc2i.setBounds(this.cicc2iiccc);
        }
        if (this.c2oc2i.isVisible()) {
            this.c2oc2i.draw(canvas);
        }
    }

    Rect getCloseBounds() {
        return this.cicic;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return coo2iico((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.ciii2coi2 = true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (coo2iico((int) motionEvent.getX(), (int) motionEvent.getY(), this.coo2iico) && c2oc2o()) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 3) {
                        setClosePressed(false);
                    }
                } else if (coo2iico()) {
                    if (this.ciiioc2ioc == null) {
                        this.ciiioc2ioc = new RunnableC32139cioccoiococ(this, null);
                    }
                    postDelayed(this.ciiioc2ioc, ViewConfiguration.getPressedStateDuration());
                    c2oc2i();
                }
            } else {
                setClosePressed(true);
            }
            return true;
        }
        setClosePressed(false);
        super.onTouchEvent(motionEvent);
        return false;
    }

    public void setCloseAlwaysInteractable(boolean z) {
        this.c2oicci2 = z;
    }

    void setCloseBoundChanged(boolean z) {
        this.ciii2coi2 = z;
    }

    void setCloseBounds(Rect rect) {
        this.cicic.set(rect);
    }

    public void setClosePosition(@NonNull ClosePosition closePosition) {
        C32584coiic.coo2iico(closePosition);
        this.cioccoiococ = closePosition;
        this.ciii2coi2 = true;
        invalidate();
    }

    public void setCloseVisible(boolean z) {
        if (this.c2oc2i.setVisible(z, false)) {
            invalidate(this.cicic);
        }
    }

    public void setOnCloseListener(@Nullable InterfaceC32138c2oc2i interfaceC32138c2oc2i) {
        this.coi222o222 = interfaceC32138c2oc2i;
    }

    public CloseableLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c2oc2i() {
        playSoundEffect(0);
        InterfaceC32138c2oc2i interfaceC32138c2oc2i = this.coi222o222;
        if (interfaceC32138c2oc2i != null) {
            interfaceC32138c2oc2i.onClose();
        }
    }

    public void coi222o222(ClosePosition closePosition, Rect rect, Rect rect2) {
        coo2iico(closePosition, this.c2oc2o, rect, rect2);
    }

    public CloseableLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.coiic = new Rect();
        this.cicic = new Rect();
        this.cicc2iiccc = new Rect();
        this.ccoc2oic = new Rect();
        this.c22o22co22i = 0;
        this.c222o2o2c2o = 0;
        this.c2ccocci = new C32141coo2iico(ccoio, "CloseButtonDelay exception");
        this.ciiio2o = new C32140coi222o222(ccoio, "CloseButtonDelay exception");
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.c2oc2i = stateListDrawable;
        this.cioccoiococ = ClosePosition.TOP_RIGHT;
        int[] iArr = FrameLayout.SELECTED_STATE_SET;
        int i2 = C32065R.C32067drawable.columbus_close_button;
        stateListDrawable.addState(iArr, ContextCompat.getDrawable(context, i2));
        int[] iArr2 = FrameLayout.EMPTY_STATE_SET;
        stateListDrawable.addState(iArr2, ContextCompat.getDrawable(context, i2));
        stateListDrawable.setState(iArr2);
        stateListDrawable.setCallback(this);
        this.coo2iico = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c2oc2o = C32726coi222o222.coi222o222(50.0f, context);
        this.cco22 = C32726coi222o222.coi222o222(cc2o22co2c, context);
        this.cii2c2 = C32726coi222o222.coi222o222(8.0f, context);
        setWillNotDraw(false);
        this.c2oicci2 = true;
    }

    private void coo2iico(ClosePosition closePosition, Rect rect, int i, int i2, Rect rect2) {
        coo2iico(closePosition, this.c2oc2o, rect, i, i2, rect2);
    }

    public boolean coi222o222() {
        return this.c2oc2i.isVisible();
    }

    private void coo2iico(ClosePosition closePosition, Rect rect, Rect rect2) {
        coo2iico(closePosition, this.cco22, rect, rect2);
    }

    private void coo2iico(ClosePosition closePosition, int i, Rect rect, Rect rect2) {
        Gravity.apply(closePosition.getGravity(), i, i, rect, rect2);
    }

    private void coo2iico(ClosePosition closePosition, int i, Rect rect, int i2, int i3, Rect rect2) {
        Gravity.apply(closePosition.getGravity(), i, i, rect, i2, i3, rect2);
    }

    boolean coo2iico() {
        return this.c2oc2i.getState() == FrameLayout.SELECTED_STATE_SET;
    }

    boolean coo2iico(int i, int i2, int i3) {
        Rect rect = this.cicic;
        return i >= rect.left - i3 && i2 >= rect.top - i3 && i < rect.right + i3 && i2 < rect.bottom + i3;
    }

    public void coo2iico(String str, boolean z) {
        try {
            String[] split = str.split(",");
            if (split.length == 2) {
                float parseFloat = Float.parseFloat(split[1]);
                float parseFloat2 = Float.parseFloat(split[0]);
                int width = getWidth();
                int height = getHeight();
                this.c22o22co22i = (int) ((width * parseFloat) / 100.0f);
                this.c222o2o2c2o = (int) ((height * parseFloat2) / 100.0f);
                this.ciii2coi2 = true;
                removeCallbacks(this.c2ccocci);
                this.c2oc2i.setVisible(z, false);
                invalidate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void coo2iico(int i, String str, String str2) {
        removeCallbacks(this.ciiio2o);
        this.cioc2 = i;
        this.cici2o2oo = str;
        this.ciio2c = str2;
        postDelayed(this.ciiio2o, 1000L);
    }

    public void coo2iico(String str, int i, String str2, String str3) {
        removeCallbacks(this.ciiio2o);
        try {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388693;
            layoutParams.bottomMargin = (int) getContext().getResources().getDimension(C32065R.dimen.columbus_ad_os_margin_bottom);
            layoutParams.setMarginEnd((int) getContext().getResources().getDimension(C32065R.dimen.columbus_ad_os_margin_end));
            if (!TextUtils.isEmpty(str)) {
                String[] split = str.split(",");
                if (split.length == 2) {
                    float parseFloat = Float.parseFloat(split[1]);
                    float parseFloat2 = Float.parseFloat(split[0]);
                    int width = getWidth();
                    int height = getHeight();
                    int i2 = (int) ((width * parseFloat) / 100.0f);
                    int i3 = (int) ((height * parseFloat2) / 100.0f);
                    int dimensionPixelSize = getResources().getDimensionPixelSize(C32065R.dimen.columbus_interstitial_privacy_height);
                    if (height > dimensionPixelSize) {
                        i3 = Math.min(i3, height - dimensionPixelSize);
                    }
                    layoutParams.gravity = 8388661;
                    layoutParams.topMargin = i3;
                    layoutParams.bottomMargin = 0;
                    layoutParams.setMarginEnd(i2);
                }
            }
            View view = this.coiio2;
            if (view != null) {
                view.setLayoutParams(layoutParams);
                return;
            }
            View coo2iico = C32470coiio2.coo2iico(getContext(), str2, str3, i);
            this.coiio2 = coo2iico;
            if (coo2iico != null) {
                addView(coo2iico, layoutParams);
            }
        } catch (Exception e) {
            MLog.m25891d(ccoio, "addAdView error", e);
        }
    }
}
