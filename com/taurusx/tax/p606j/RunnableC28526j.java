package com.taurusx.tax.p606j;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.taurusx.tax.p578b.p582f.C28260o;
import com.taurusx.tax.p606j.C28522i;

/* renamed from: com.taurusx.tax.j.j */
/* loaded from: classes7.dex */
public class RunnableC28526j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Bitmap f73968a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f73969b;

    /* renamed from: c */
    public final /* synthetic */ String f73970c;

    /* renamed from: d */
    public final /* synthetic */ C28522i.InterfaceC28525c f73971d;

    public RunnableC28526j(Bitmap bitmap, ImageView imageView, String str, C28522i.InterfaceC28525c interfaceC28525c) {
        this.f73968a = bitmap;
        this.f73969b = imageView;
        this.f73970c = str;
        this.f73971d = interfaceC28525c;
    }

    @Override // java.lang.Runnable
    public void run() {
        ImageView imageView;
        if (this.f73968a != null && (imageView = this.f73969b) != null && TextUtils.equals((String) imageView.getTag(), this.f73970c)) {
            this.f73969b.setImageBitmap(this.f73968a);
        }
        C28522i.InterfaceC28525c interfaceC28525c = this.f73971d;
        if (interfaceC28525c != null) {
            ((C28260o) interfaceC28525c).m38340a(this.f73968a);
        }
    }
}
