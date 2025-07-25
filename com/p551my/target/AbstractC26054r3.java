package com.p551my.target;

import androidx.annotation.Nullable;
import com.p551my.target.common.models.ImageData;

/* renamed from: com.my.target.r3 */
/* loaded from: classes7.dex */
public abstract class AbstractC26054r3 extends AbstractC25650b {
    private float allowCloseDelay;
    @Nullable
    private ImageData closeIcon;
    private boolean allowClose = true;
    private boolean allowBackButton = true;

    public AbstractC26054r3() {
        this.clickArea = C26205x0.f68170q;
    }

    public float getAllowCloseDelay() {
        return this.allowCloseDelay;
    }

    @Nullable
    public ImageData getCloseIcon() {
        return this.closeIcon;
    }

    public boolean isAllowBackButton() {
        return this.allowBackButton;
    }

    public boolean isAllowClose() {
        return this.allowClose;
    }

    public void setAllowBackButton(boolean z) {
        this.allowBackButton = z;
    }

    public void setAllowClose(boolean z) {
        this.allowClose = z;
    }

    public void setAllowCloseDelay(float f) {
        this.allowCloseDelay = f;
    }

    public void setCloseIcon(@Nullable ImageData imageData) {
        this.closeIcon = imageData;
    }
}
