package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroupOverlay;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

@RequiresApi(18)
/* loaded from: classes5.dex */
class ViewGroupOverlayApi18 implements ViewGroupOverlayImpl {

    /* renamed from: a */
    private final ViewGroupOverlay f37853a;

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(@NonNull Drawable drawable) {
        this.f37853a.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(@NonNull Drawable drawable) {
        this.f37853a.remove(drawable);
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void add(@NonNull View view) {
        this.f37853a.add(view);
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void remove(@NonNull View view) {
        this.f37853a.remove(view);
    }
}
