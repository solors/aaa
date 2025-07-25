package com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.ldr;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.ldr.InterfaceC6510IL;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bykv.vk.openvk.bg.bg.bg.ldr.bX */
/* loaded from: classes3.dex */
public class SurfaceHolder$CallbackC6512bX extends C6516zx implements SurfaceHolder.Callback, InterfaceC6510IL {

    /* renamed from: bX */
    private static final ArrayList<SurfaceHolder$CallbackC6515ldr> f13587bX = new ArrayList<>();

    /* renamed from: IL */
    private SurfaceHolder$CallbackC6515ldr f13588IL;

    /* renamed from: bg */
    private WeakReference<InterfaceC6513bg> f13589bg;
    private InterfaceC6510IL.InterfaceC6511bg eqN;

    public SurfaceHolder$CallbackC6512bX(Context context) {
        super(context);
        m91675bg();
    }

    /* renamed from: bg */
    private void m91675bg() {
        SurfaceHolder$CallbackC6515ldr surfaceHolder$CallbackC6515ldr = new SurfaceHolder$CallbackC6515ldr(this);
        this.f13588IL = surfaceHolder$CallbackC6515ldr;
        f13587bX.add(surfaceHolder$CallbackC6515ldr);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setWindowVisibilityChangedListener(InterfaceC6510IL.InterfaceC6511bg interfaceC6511bg) {
        this.eqN = interfaceC6511bg;
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        WeakReference<InterfaceC6513bg> weakReference = this.f13589bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f13589bg.get().mo85187bg(surfaceHolder, i, i2, i3);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<InterfaceC6513bg> weakReference = this.f13589bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f13589bg.get().mo85188bg(surfaceHolder);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        WeakReference<InterfaceC6513bg> weakReference = this.f13589bg;
        if (weakReference != null && weakReference.get() != null) {
            this.f13589bg.get().mo85214IL(surfaceHolder);
        }
    }

    @Override // com.bykv.p135vk.openvk.p136bg.p137bg.p149bg.ldr.InterfaceC6510IL
    /* renamed from: bg */
    public void mo91673bg(InterfaceC6513bg interfaceC6513bg) {
        this.f13589bg = new WeakReference<>(interfaceC6513bg);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<SurfaceHolder$CallbackC6515ldr> it = f13587bX.iterator();
        while (it.hasNext()) {
            SurfaceHolder$CallbackC6515ldr next = it.next();
            if (next != null && next.m91672bg() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.f13588IL);
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
}
