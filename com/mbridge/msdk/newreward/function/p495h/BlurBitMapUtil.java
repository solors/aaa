package com.mbridge.msdk.newreward.function.p495h;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.same.p441f.ThreadPoolUtils;

/* renamed from: com.mbridge.msdk.newreward.function.h.a */
/* loaded from: classes6.dex */
public final class BlurBitMapUtil {

    /* compiled from: BlurBitMapUtil.java */
    /* renamed from: com.mbridge.msdk.newreward.function.h.a$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC22409a {
        void blurFailCallBack();

        void blurSuccessCallBack(Bitmap bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @TargetApi(17)
    /* renamed from: b */
    public static Bitmap m50264b(Bitmap bitmap) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_4444);
            RenderScript create = RenderScript.create(MBSDKContext.m52746m().m52792c());
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(25.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            create.destroy();
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m50265a(final Bitmap bitmap, final InterfaceC22409a interfaceC22409a) {
        try {
            ThreadPoolUtils.m52225d().execute(new Runnable() { // from class: com.mbridge.msdk.newreward.function.h.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (InterfaceC22409a.this != null) {
                        try {
                            Bitmap m50264b = BlurBitMapUtil.m50264b(bitmap);
                            if (m50264b != null && !m50264b.isRecycled()) {
                                InterfaceC22409a.this.blurSuccessCallBack(m50264b);
                            } else {
                                InterfaceC22409a.this.blurFailCallBack();
                            }
                        } catch (Exception unused) {
                            InterfaceC22409a.this.blurFailCallBack();
                        }
                    }
                }
            });
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }
}
