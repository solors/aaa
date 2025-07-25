package sg.bigo.ads.api;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.core.InterfaceC43573o;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.p928p.InterfaceC43772g;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43822e;
import sg.bigo.ads.common.utils.C43841u;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.core.adview.C44121e;
import sg.bigo.ads.core.p964e.p965a.C44214p;
import sg.bigo.ads.core.p968f.InterfaceC44216a;
import sg.bigo.ads.core.player.p973b.C44333b;

/* loaded from: classes10.dex */
public class MediaView extends AbstractC43512a<C44121e> {

    /* renamed from: sg.bigo.ads.api.MediaView$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43506a {
        /* renamed from: a */
        void mo3936a(boolean z);

        /* renamed from: a */
        boolean mo3942a();

        /* renamed from: b */
        void mo3935b();
    }

    public MediaView(@NonNull Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.api.AbstractC43512a
    @NonNull
    /* renamed from: a */
    protected final /* synthetic */ C44121e mo5470a() {
        return new C44121e(this);
    }

    /* renamed from: b */
    public final float m5478b(int i, int i2) {
        C44121e viewImpl = getViewImpl();
        if (viewImpl.f115790c == null) {
            return 0.0f;
        }
        return viewImpl.m3933c() > viewImpl.m3932d() ? (((i2 * viewImpl.m3933c()) / viewImpl.m3932d()) * 1.0f) / i : (((i * viewImpl.m3932d()) / viewImpl.m3933c()) * 1.0f) / i2;
    }

    /* renamed from: c */
    public final void m5477c() {
        C44121e viewImpl = getViewImpl();
        AdImageView adImageView = viewImpl.f115790c;
        if (adImageView != null) {
            adImageView.setImageBitmap(null);
            viewImpl.f115790c.m4787a();
            viewImpl.f115790c = null;
        }
        C44333b c44333b = viewImpl.f115789b;
        if (c44333b != null) {
            C43782a.m5010a(0, 3, "VideoPlayView", "destroy player");
            c44333b.m3344a(false);
            c44333b.m3319l();
            c44333b.setOnEventListener(null);
            c44333b.f116406d = null;
            C43727d.m5106a(c44333b.f116409g);
            viewImpl.f115789b = null;
        }
    }

    public View getImage() {
        return getViewImpl().f115790c;
    }

    @Nullable
    public VideoController getVideoController() {
        return getViewImpl().f115793f;
    }

    public void setImageBlurBorder(boolean z) {
        getViewImpl().f115794g = z;
    }

    public void setMediaAreaClickable(boolean z) {
        getViewImpl().f115792e = Boolean.valueOf(z);
    }

    public void setOtherClickAreaClick(boolean z) {
        getViewImpl().f115791d = Boolean.valueOf(z);
    }

    public MediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final void m5483a(Bitmap bitmap) {
        getViewImpl().f115794g = false;
        C44121e viewImpl = getViewImpl();
        if (bitmap != null) {
            int m4906a = C43822e.m4906a(viewImpl.f115770a.getContext(), 10);
            int m4906a2 = C43822e.m4906a(viewImpl.f115770a.getContext(), 4);
            RoundedFrameLayout roundedFrameLayout = new RoundedFrameLayout(viewImpl.f115770a.getContext());
            roundedFrameLayout.setCornerRadius(m4906a2);
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            boolean z = ((width == height) && viewImpl.f115770a.getWidth() <= viewImpl.f115770a.getHeight()) || width > height;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z ? -1 : -2, z ? -2 : -1, 17);
            layoutParams.setMargins(m4906a, m4906a, m4906a, m4906a);
            roundedFrameLayout.setLayoutParams(layoutParams);
            AdImageView adImageView = new AdImageView(viewImpl.f115770a.getContext());
            adImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            C43841u.m4801a(adImageView, roundedFrameLayout, null, -1);
            C43841u.m4801a(roundedFrameLayout, viewImpl.f115770a, null, -1);
            adImageView.setBlurBorder(viewImpl.f115794g);
            adImageView.setImageBitmap(bitmap);
        }
    }

    @NonNull
    /* renamed from: b */
    public final InterfaceC43506a m5479b() {
        return getViewImpl();
    }

    public MediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void m5482a(@NonNull String str) {
        getViewImpl().m3939a(str);
    }

    /* renamed from: a */
    public final void m5481a(@NonNull InterfaceC43573o interfaceC43573o, @Nullable InterfaceC43772g interfaceC43772g) {
        getViewImpl().m3938a(interfaceC43573o, interfaceC43772g);
    }

    /* renamed from: a */
    public final void m5480a(@NonNull InterfaceC43573o interfaceC43573o, @NonNull C44214p c44214p, InterfaceC44216a interfaceC44216a) {
        getViewImpl().m3937a(interfaceC43573o, c44214p, interfaceC44216a);
    }
}
