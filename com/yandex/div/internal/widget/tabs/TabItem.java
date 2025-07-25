package com.yandex.div.internal.widget.tabs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import p1072z8.C45193i;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes8.dex */
class TabItem extends View {
    public final int customLayout;
    public final Drawable icon;
    public final CharSequence text;

    public TabItem(Context context) {
        this(context, null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TintTypedArray obtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, C45193i.TabItem);
        this.text = obtainStyledAttributes.getText(C45193i.TabItem_android_text);
        this.icon = obtainStyledAttributes.getDrawable(C45193i.TabItem_android_icon);
        this.customLayout = obtainStyledAttributes.getResourceId(C45193i.TabItem_android_layout, 0);
        obtainStyledAttributes.recycle();
    }
}
