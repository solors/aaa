package com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.ldr;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.ldr.InterfaceC6510IL;

/* renamed from: com.bykv.vk.openvk.bg.bg.bg.ldr.eqN */
/* loaded from: classes3.dex */
public class TextureView$SurfaceTextureListenerC6514eqN extends TextureView implements TextureView.SurfaceTextureListener, InterfaceC6510IL {

    /* renamed from: IL */
    private InterfaceC6510IL.InterfaceC6511bg f13590IL;

    /* renamed from: bg */
    private InterfaceC6513bg f13591bg;

    public TextureView$SurfaceTextureListenerC6514eqN(Context context) {
        this(context, null);
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.ldr.InterfaceC6510IL
    /* renamed from: bg */
    public void mo91673bg(InterfaceC6513bg interfaceC6513bg) {
        this.f13591bg = interfaceC6513bg;
        setSurfaceTextureListener(this);
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.ldr.InterfaceC6510IL
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        InterfaceC6513bg interfaceC6513bg = this.f13591bg;
        if (interfaceC6513bg != null) {
            interfaceC6513bg.mo85190bg(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        InterfaceC6513bg interfaceC6513bg = this.f13591bg;
        if (interfaceC6513bg != null) {
            return interfaceC6513bg.mo85191bg(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setWindowVisibilityChangedListener(InterfaceC6510IL.InterfaceC6511bg interfaceC6511bg) {
        this.f13590IL = interfaceC6511bg;
    }

    public TextureView$SurfaceTextureListenerC6514eqN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.ldr.InterfaceC6510IL
    /* renamed from: bg */
    public void mo91674bg(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.ldr.InterfaceC6510IL
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
