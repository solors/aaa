package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Bitmap;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.p275zx.InterfaceC7781VB;
import com.bytedance.sdk.component.p275zx.InterfaceC7851xxp;
import java.lang.ref.WeakReference;

/* renamed from: com.bytedance.sdk.openadsdk.utils.Ja */
/* loaded from: classes3.dex */
public class C9502Ja implements InterfaceC7851xxp<Bitmap> {

    /* renamed from: bg */
    private final WeakReference<ImageView> f21156bg;

    public C9502Ja(ImageView imageView) {
        this.f21156bg = new WeakReference<>(imageView);
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7851xxp
    /* renamed from: bg */
    public void mo82307bg(InterfaceC7781VB<Bitmap> interfaceC7781VB) {
        ImageView imageView = this.f21156bg.get();
        if (imageView == null) {
            return;
        }
        if (interfaceC7781VB != null) {
            try {
                if (interfaceC7781VB.mo87629IL() != null) {
                    imageView.setImageBitmap(interfaceC7781VB.mo87629IL());
                    return;
                }
            } catch (Throwable unused) {
                imageView.setVisibility(8);
                return;
            }
        }
        imageView.setVisibility(8);
    }

    @Override // com.bytedance.sdk.component.p275zx.InterfaceC7851xxp
    /* renamed from: bg */
    public void mo82308bg(int i, String str, @Nullable Throwable th) {
        ImageView imageView = this.f21156bg.get();
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(8);
    }
}
