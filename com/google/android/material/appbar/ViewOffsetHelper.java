package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.ViewCompat;

/* loaded from: classes5.dex */
class ViewOffsetHelper {

    /* renamed from: a */
    private final View f36666a;

    /* renamed from: b */
    private int f36667b;

    /* renamed from: c */
    private int f36668c;

    /* renamed from: d */
    private int f36669d;

    /* renamed from: e */
    private int f36670e;

    /* renamed from: f */
    private boolean f36671f = true;

    /* renamed from: g */
    private boolean f36672g = true;

    public ViewOffsetHelper(View view) {
        this.f36666a = view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m72176a() {
        View view = this.f36666a;
        ViewCompat.offsetTopAndBottom(view, this.f36669d - (view.getTop() - this.f36667b));
        View view2 = this.f36666a;
        ViewCompat.offsetLeftAndRight(view2, this.f36670e - (view2.getLeft() - this.f36668c));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m72175b() {
        this.f36667b = this.f36666a.getTop();
        this.f36668c = this.f36666a.getLeft();
    }

    public int getLayoutLeft() {
        return this.f36668c;
    }

    public int getLayoutTop() {
        return this.f36667b;
    }

    public int getLeftAndRightOffset() {
        return this.f36670e;
    }

    public int getTopAndBottomOffset() {
        return this.f36669d;
    }

    public boolean isHorizontalOffsetEnabled() {
        return this.f36672g;
    }

    public boolean isVerticalOffsetEnabled() {
        return this.f36671f;
    }

    public void setHorizontalOffsetEnabled(boolean z) {
        this.f36672g = z;
    }

    public boolean setLeftAndRightOffset(int i) {
        if (this.f36672g && this.f36670e != i) {
            this.f36670e = i;
            m72176a();
            return true;
        }
        return false;
    }

    public boolean setTopAndBottomOffset(int i) {
        if (this.f36671f && this.f36669d != i) {
            this.f36669d = i;
            m72176a();
            return true;
        }
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z) {
        this.f36671f = z;
    }
}
