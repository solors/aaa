package sg.bigo.ads.common.p909c;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import androidx.annotation.RequiresApi;

@TargetApi(17)
/* renamed from: sg.bigo.ads.common.c.b */
/* loaded from: classes10.dex */
public final class C43599b implements InterfaceC43598a {

    /* renamed from: a */
    private final Context f114171a;

    /* renamed from: b */
    private RenderScript f114172b;

    /* renamed from: c */
    private ScriptIntrinsicBlur f114173c;

    /* renamed from: d */
    private Allocation f114174d;

    /* renamed from: e */
    private Allocation f114175e;

    @RequiresApi(api = 17)
    public C43599b(Context context) {
        this.f114171a = context;
    }

    /* renamed from: b */
    private boolean m5327b() {
        if (this.f114172b != null && this.f114173c != null) {
            return true;
        }
        return false;
    }

    @Override // sg.bigo.ads.common.p909c.InterfaceC43598a
    /* renamed from: a */
    public final void mo5326a() {
        ScriptIntrinsicBlur scriptIntrinsicBlur = this.f114173c;
        if (scriptIntrinsicBlur != null) {
            scriptIntrinsicBlur.destroy();
            this.f114173c = null;
        }
        RenderScript renderScript = this.f114172b;
        if (renderScript != null) {
            renderScript.destroy();
            this.f114172b = null;
        }
        Allocation allocation = this.f114174d;
        if (allocation != null) {
            allocation.destroy();
            this.f114174d = null;
        }
        Allocation allocation2 = this.f114175e;
        if (allocation2 != null) {
            allocation2.destroy();
            this.f114175e = null;
        }
    }

    @Override // sg.bigo.ads.common.p909c.InterfaceC43598a
    /* renamed from: a */
    public final void mo5324a(Bitmap bitmap, Bitmap bitmap2) {
        if (m5327b()) {
            if (this.f114174d == null) {
                this.f114174d = Allocation.createFromBitmap(this.f114172b, bitmap);
            }
            if (this.f114175e == null) {
                this.f114175e = Allocation.createFromBitmap(this.f114172b, bitmap2);
            }
            this.f114174d.copyFrom(bitmap);
            this.f114173c.setInput(this.f114174d);
            this.f114173c.forEach(this.f114175e);
            this.f114175e.copyTo(bitmap2);
        }
    }

    /* renamed from: a */
    public final boolean m5328a(float f) {
        if (!m5327b()) {
            try {
                RenderScript create = RenderScript.create(this.f114171a);
                this.f114172b = create;
                this.f114173c = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            } catch (Exception unused) {
                mo5326a();
                return false;
            }
        }
        this.f114173c.setRadius(f);
        return true;
    }

    @Override // sg.bigo.ads.common.p909c.InterfaceC43598a
    /* renamed from: a */
    public final boolean mo5325a(Bitmap bitmap, float f) {
        if (m5328a(f)) {
            Allocation createFromBitmap = Allocation.createFromBitmap(this.f114172b, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
            this.f114174d = createFromBitmap;
            this.f114175e = Allocation.createTyped(this.f114172b, createFromBitmap.getType());
            return true;
        }
        return false;
    }
}
