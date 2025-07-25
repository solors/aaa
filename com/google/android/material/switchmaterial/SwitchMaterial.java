package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.C16310R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.elevation.ElevationOverlayProvider;
import com.google.android.material.internal.ViewUtils;

/* loaded from: classes5.dex */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: g */
    private static final int f38411g = C16310R.C16317style.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: h */
    private static final int[][] f38412h = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};
    @NonNull

    /* renamed from: b */
    private final ElevationOverlayProvider f38413b;
    @Nullable

    /* renamed from: c */
    private ColorStateList f38414c;
    @Nullable

    /* renamed from: d */
    private ColorStateList f38415d;

    /* renamed from: f */
    private boolean f38416f;

    public SwitchMaterial(@NonNull Context context) {
        this(context, null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f38414c == null) {
            int color = MaterialColors.getColor(this, C16310R.attr.colorSurface);
            int color2 = MaterialColors.getColor(this, C16310R.attr.colorControlActivated);
            float dimension = getResources().getDimension(C16310R.dimen.mtrl_switch_thumb_elevation);
            if (this.f38413b.isThemeElevationOverlayEnabled()) {
                dimension += ViewUtils.getParentAbsoluteElevation(this);
            }
            int compositeOverlayIfNeeded = this.f38413b.compositeOverlayIfNeeded(color, dimension);
            int[][] iArr = f38412h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = MaterialColors.layer(color, color2, 1.0f);
            iArr2[1] = compositeOverlayIfNeeded;
            iArr2[2] = MaterialColors.layer(color, color2, 0.38f);
            iArr2[3] = compositeOverlayIfNeeded;
            this.f38414c = new ColorStateList(iArr, iArr2);
        }
        return this.f38414c;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f38415d == null) {
            int[][] iArr = f38412h;
            int[] iArr2 = new int[iArr.length];
            int color = MaterialColors.getColor(this, C16310R.attr.colorSurface);
            int color2 = MaterialColors.getColor(this, C16310R.attr.colorControlActivated);
            int color3 = MaterialColors.getColor(this, C16310R.attr.colorOnSurface);
            iArr2[0] = MaterialColors.layer(color, color2, 0.54f);
            iArr2[1] = MaterialColors.layer(color, color3, 0.32f);
            iArr2[2] = MaterialColors.layer(color, color2, 0.12f);
            iArr2[3] = MaterialColors.layer(color, color3, 0.12f);
            this.f38415d = new ColorStateList(iArr, iArr2);
        }
        return this.f38415d;
    }

    public boolean isUseMaterialThemeColors() {
        return this.f38416f;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f38416f && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f38416f && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f38416f = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList(null);
        setTrackTintList(null);
    }

    public SwitchMaterial(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C16310R.attr.switchStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SwitchMaterial(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.switchmaterial.SwitchMaterial.f38411g
            android.content.Context r7 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            com.google.android.material.elevation.ElevationOverlayProvider r7 = new com.google.android.material.elevation.ElevationOverlayProvider
            r7.<init>(r0)
            r6.f38413b = r7
            int[] r2 = com.google.android.material.C16310R.styleable.SwitchMaterial
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.C16310R.styleable.SwitchMaterial_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f38416f = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
