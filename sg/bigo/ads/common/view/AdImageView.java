package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.p928p.C43758b;
import sg.bigo.ads.common.p928p.InterfaceC43772g;
import sg.bigo.ads.common.utils.C43819d;

/* loaded from: classes10.dex */
public class AdImageView extends ImageView {

    /* renamed from: a */
    protected final C43758b f114701a;

    /* renamed from: b */
    private boolean f114702b;

    /* renamed from: c */
    private boolean f114703c;

    public AdImageView(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public final void m4787a() {
        this.f114701a.f114521b.clear();
    }

    public void setBlurBorder(boolean z) {
        this.f114702b = z;
    }

    public void setFadeEnable(boolean z) {
        this.f114703c = z;
    }

    public void setIconTag(boolean z) {
        C43758b c43758b = this.f114701a;
        if (c43758b != null) {
            c43758b.f114520a = z;
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        if (this.f114702b && bitmap != null) {
            bitmap = C43819d.m4916a(bitmap);
        }
        if (this.f114703c) {
            C43819d.m4914a(this, bitmap);
        } else {
            super.setImageBitmap(bitmap);
        }
    }

    public AdImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    /* renamed from: a */
    public final void m4786a(String str, boolean z) {
        m4785a(null, str, z);
    }

    public AdImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f114702b = false;
        this.f114703c = false;
        this.f114701a = new C43758b(this);
    }

    /* renamed from: a */
    public final void m4785a(@Nullable Executor executor, String str, boolean z) {
        this.f114701a.m5045a(executor, str, z);
    }

    /* renamed from: a */
    public final void m4784a(InterfaceC43772g interfaceC43772g) {
        this.f114701a.m5044a(interfaceC43772g);
    }
}
