package androidx.compose.p015ui.platform;

import androidx.compose.p015ui.graphics.RenderEffect;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DeviceRenderNode.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.DeviceRenderNodeData */
/* loaded from: classes.dex */
public final class DeviceRenderNodeData {
    private float alpha;
    private int ambientShadowColor;
    private final int bottom;
    private float cameraDistance;
    private boolean clipToBounds;
    private boolean clipToOutline;
    private float elevation;
    private final int height;
    private final int left;
    private float pivotX;
    private float pivotY;
    @Nullable
    private RenderEffect renderEffect;
    private final int right;
    private float rotationX;
    private float rotationY;
    private float rotationZ;
    private float scaleX;
    private float scaleY;
    private int spotShadowColor;
    private final int top;
    private float translationX;
    private float translationY;
    private final long uniqueId;
    private final int width;

    public DeviceRenderNodeData(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, @Nullable RenderEffect renderEffect) {
        this.uniqueId = j;
        this.left = i;
        this.top = i2;
        this.right = i3;
        this.bottom = i4;
        this.width = i5;
        this.height = i6;
        this.scaleX = f;
        this.scaleY = f2;
        this.translationX = f3;
        this.translationY = f4;
        this.elevation = f5;
        this.ambientShadowColor = i7;
        this.spotShadowColor = i8;
        this.rotationZ = f6;
        this.rotationX = f7;
        this.rotationY = f8;
        this.cameraDistance = f9;
        this.pivotX = f10;
        this.pivotY = f11;
        this.clipToOutline = z;
        this.clipToBounds = z2;
        this.alpha = f12;
        this.renderEffect = renderEffect;
    }

    public final long component1() {
        return this.uniqueId;
    }

    public final float component10() {
        return this.translationX;
    }

    public final float component11() {
        return this.translationY;
    }

    public final float component12() {
        return this.elevation;
    }

    public final int component13() {
        return this.ambientShadowColor;
    }

    public final int component14() {
        return this.spotShadowColor;
    }

    public final float component15() {
        return this.rotationZ;
    }

    public final float component16() {
        return this.rotationX;
    }

    public final float component17() {
        return this.rotationY;
    }

    public final float component18() {
        return this.cameraDistance;
    }

    public final float component19() {
        return this.pivotX;
    }

    public final int component2() {
        return this.left;
    }

    public final float component20() {
        return this.pivotY;
    }

    public final boolean component21() {
        return this.clipToOutline;
    }

    public final boolean component22() {
        return this.clipToBounds;
    }

    public final float component23() {
        return this.alpha;
    }

    @Nullable
    public final RenderEffect component24() {
        return this.renderEffect;
    }

    public final int component3() {
        return this.top;
    }

    public final int component4() {
        return this.right;
    }

    public final int component5() {
        return this.bottom;
    }

    public final int component6() {
        return this.width;
    }

    public final int component7() {
        return this.height;
    }

    public final float component8() {
        return this.scaleX;
    }

    public final float component9() {
        return this.scaleY;
    }

    @NotNull
    public final DeviceRenderNodeData copy(long j, int i, int i2, int i3, int i4, int i5, int i6, float f, float f2, float f3, float f4, float f5, int i7, int i8, float f6, float f7, float f8, float f9, float f10, float f11, boolean z, boolean z2, float f12, @Nullable RenderEffect renderEffect) {
        return new DeviceRenderNodeData(j, i, i2, i3, i4, i5, i6, f, f2, f3, f4, f5, i7, i8, f6, f7, f8, f9, f10, f11, z, z2, f12, renderEffect);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceRenderNodeData)) {
            return false;
        }
        DeviceRenderNodeData deviceRenderNodeData = (DeviceRenderNodeData) obj;
        if (this.uniqueId == deviceRenderNodeData.uniqueId && this.left == deviceRenderNodeData.left && this.top == deviceRenderNodeData.top && this.right == deviceRenderNodeData.right && this.bottom == deviceRenderNodeData.bottom && this.width == deviceRenderNodeData.width && this.height == deviceRenderNodeData.height && Intrinsics.m17075f(Float.valueOf(this.scaleX), Float.valueOf(deviceRenderNodeData.scaleX)) && Intrinsics.m17075f(Float.valueOf(this.scaleY), Float.valueOf(deviceRenderNodeData.scaleY)) && Intrinsics.m17075f(Float.valueOf(this.translationX), Float.valueOf(deviceRenderNodeData.translationX)) && Intrinsics.m17075f(Float.valueOf(this.translationY), Float.valueOf(deviceRenderNodeData.translationY)) && Intrinsics.m17075f(Float.valueOf(this.elevation), Float.valueOf(deviceRenderNodeData.elevation)) && this.ambientShadowColor == deviceRenderNodeData.ambientShadowColor && this.spotShadowColor == deviceRenderNodeData.spotShadowColor && Intrinsics.m17075f(Float.valueOf(this.rotationZ), Float.valueOf(deviceRenderNodeData.rotationZ)) && Intrinsics.m17075f(Float.valueOf(this.rotationX), Float.valueOf(deviceRenderNodeData.rotationX)) && Intrinsics.m17075f(Float.valueOf(this.rotationY), Float.valueOf(deviceRenderNodeData.rotationY)) && Intrinsics.m17075f(Float.valueOf(this.cameraDistance), Float.valueOf(deviceRenderNodeData.cameraDistance)) && Intrinsics.m17075f(Float.valueOf(this.pivotX), Float.valueOf(deviceRenderNodeData.pivotX)) && Intrinsics.m17075f(Float.valueOf(this.pivotY), Float.valueOf(deviceRenderNodeData.pivotY)) && this.clipToOutline == deviceRenderNodeData.clipToOutline && this.clipToBounds == deviceRenderNodeData.clipToBounds && Intrinsics.m17075f(Float.valueOf(this.alpha), Float.valueOf(deviceRenderNodeData.alpha)) && Intrinsics.m17075f(this.renderEffect, deviceRenderNodeData.renderEffect)) {
            return true;
        }
        return false;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final int getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    public final boolean getClipToBounds() {
        return this.clipToBounds;
    }

    public final boolean getClipToOutline() {
        return this.clipToOutline;
    }

    public final float getElevation() {
        return this.elevation;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    @Nullable
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    public final int getRight() {
        return this.right;
    }

    public final float getRotationX() {
        return this.rotationX;
    }

    public final float getRotationY() {
        return this.rotationY;
    }

    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final int getSpotShadowColor() {
        return this.spotShadowColor;
    }

    public final int getTop() {
        return this.top;
    }

    public final float getTranslationX() {
        return this.translationX;
    }

    public final float getTranslationY() {
        return this.translationY;
    }

    public final long getUniqueId() {
        return this.uniqueId;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = ((((((((((((((((((((((((((((((((((((((Long.hashCode(this.uniqueId) * 31) + Integer.hashCode(this.left)) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom)) * 31) + Integer.hashCode(this.width)) * 31) + Integer.hashCode(this.height)) * 31) + Float.hashCode(this.scaleX)) * 31) + Float.hashCode(this.scaleY)) * 31) + Float.hashCode(this.translationX)) * 31) + Float.hashCode(this.translationY)) * 31) + Float.hashCode(this.elevation)) * 31) + Integer.hashCode(this.ambientShadowColor)) * 31) + Integer.hashCode(this.spotShadowColor)) * 31) + Float.hashCode(this.rotationZ)) * 31) + Float.hashCode(this.rotationX)) * 31) + Float.hashCode(this.rotationY)) * 31) + Float.hashCode(this.cameraDistance)) * 31) + Float.hashCode(this.pivotX)) * 31) + Float.hashCode(this.pivotY)) * 31;
        boolean z = this.clipToOutline;
        int i = 1;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z2 = this.clipToBounds;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        int hashCode3 = (((i3 + i) * 31) + Float.hashCode(this.alpha)) * 31;
        RenderEffect renderEffect = this.renderEffect;
        if (renderEffect == null) {
            hashCode = 0;
        } else {
            hashCode = renderEffect.hashCode();
        }
        return hashCode3 + hashCode;
    }

    public final void setAlpha(float f) {
        this.alpha = f;
    }

    public final void setAmbientShadowColor(int i) {
        this.ambientShadowColor = i;
    }

    public final void setCameraDistance(float f) {
        this.cameraDistance = f;
    }

    public final void setClipToBounds(boolean z) {
        this.clipToBounds = z;
    }

    public final void setClipToOutline(boolean z) {
        this.clipToOutline = z;
    }

    public final void setElevation(float f) {
        this.elevation = f;
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
    }

    public final void setRenderEffect(@Nullable RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    public final void setRotationX(float f) {
        this.rotationX = f;
    }

    public final void setRotationY(float f) {
        this.rotationY = f;
    }

    public final void setRotationZ(float f) {
        this.rotationZ = f;
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
    }

    public final void setSpotShadowColor(int i) {
        this.spotShadowColor = i;
    }

    public final void setTranslationX(float f) {
        this.translationX = f;
    }

    public final void setTranslationY(float f) {
        this.translationY = f;
    }

    @NotNull
    public String toString() {
        return "DeviceRenderNodeData(uniqueId=" + this.uniqueId + ", left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ", width=" + this.width + ", height=" + this.height + ", scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", elevation=" + this.elevation + ", ambientShadowColor=" + this.ambientShadowColor + ", spotShadowColor=" + this.spotShadowColor + ", rotationZ=" + this.rotationZ + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", cameraDistance=" + this.cameraDistance + ", pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", clipToOutline=" + this.clipToOutline + ", clipToBounds=" + this.clipToBounds + ", alpha=" + this.alpha + ", renderEffect=" + this.renderEffect + ')';
    }
}
