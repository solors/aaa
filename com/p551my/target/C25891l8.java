package com.p551my.target;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p551my.target.C26203x;
import com.p551my.target.InterfaceC26180w;
import com.p551my.target.common.models.ImageData;
import com.p551my.target.common.models.VideoData;

/* renamed from: com.my.target.l8 */
/* loaded from: classes7.dex */
public class C25891l8 extends ViewGroup implements C26203x.InterfaceC26204a {

    /* renamed from: a */
    public final C26038q9 f67195a;

    /* renamed from: b */
    public final C25869ka f67196b;

    /* renamed from: c */
    public final C25905m2 f67197c;

    /* renamed from: d */
    public final View$OnClickListenerC25893b f67198d;

    /* renamed from: e */
    public final C26203x f67199e;

    /* renamed from: f */
    public final FrameLayout f67200f;

    /* renamed from: g */
    public final ProgressBar f67201g;

    /* renamed from: h */
    public final boolean f67202h;

    /* renamed from: i */
    public final boolean f67203i;

    /* renamed from: j */
    public InterfaceC25892a f67204j;

    /* renamed from: k */
    public InterfaceC26180w f67205k;

    /* renamed from: l */
    public VideoData f67206l;

    /* renamed from: m */
    public Bitmap f67207m;

    /* renamed from: n */
    public int f67208n;

    /* renamed from: o */
    public int f67209o;

    /* renamed from: p */
    public boolean f67210p;

    /* renamed from: com.my.target.l8$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC25892a extends AudioManager.OnAudioFocusChangeListener, InterfaceC26180w.InterfaceC26181a {
        /* renamed from: c */
        void mo43511c();

        /* renamed from: h */
        void mo43510h();

        /* renamed from: j */
        void mo43509j();

        /* renamed from: n */
        void mo43508n();
    }

    /* renamed from: com.my.target.l8$b */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC25893b implements View.OnClickListener {
        public View$OnClickListenerC25893b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C25891l8 c25891l8 = C25891l8.this;
            if (c25891l8.f67204j == null) {
                return;
            }
            if (!c25891l8.m43516e() && !C25891l8.this.m43517d()) {
                C25891l8.this.f67204j.mo43508n();
            } else if (!C25891l8.this.m43517d()) {
                C25891l8.this.f67204j.mo43511c();
            } else {
                C25891l8.this.f67204j.mo43510h();
            }
        }
    }

    public C25891l8(Context context, C25869ka c25869ka, boolean z, boolean z2) {
        super(context);
        this.f67210p = true;
        this.f67196b = c25869ka;
        this.f67202h = z;
        this.f67203i = z2;
        this.f67195a = new C26038q9(context);
        this.f67197c = new C25905m2(context);
        this.f67201g = new ProgressBar(context, null, 16842874);
        this.f67200f = new FrameLayout(context);
        C26203x c26203x = new C26203x(context);
        this.f67199e = c26203x;
        c26203x.setAdVideoViewListener(this);
        this.f67198d = new View$OnClickListenerC25893b();
    }

    /* renamed from: a */
    public final void m43525a(C25655b4 c25655b4) {
        this.f67200f.setVisibility(8);
        this.f67197c.setVisibility(8);
        this.f67201g.setVisibility(8);
        this.f67199e.setVisibility(8);
        this.f67195a.setVisibility(0);
        ImageData image = c25655b4.getImage();
        if (image == null || image.getData() == null) {
            return;
        }
        this.f67209o = image.getWidth();
        int height = image.getHeight();
        this.f67208n = height;
        if (this.f67209o == 0 || height == 0) {
            this.f67209o = image.getData().getWidth();
            this.f67208n = image.getData().getHeight();
        }
        this.f67195a.setImageBitmap(image.getData());
        this.f67195a.setClickable(false);
    }

    /* renamed from: b */
    public void m43522b() {
        getClickableLayout().setOnClickListener(this.f67198d);
    }

    /* renamed from: c */
    public void m43518c() {
        C25869ka.m43594b(this.f67197c, "play_button");
        C25869ka.m43594b(this.f67195a, "media_image");
        C25869ka.m43594b(this.f67199e, "video_texture");
        C25869ka.m43594b(this.f67200f, "clickable_layout");
        this.f67195a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f67195a.setAdjustViewBounds(true);
        addView(this.f67199e);
        this.f67201g.setVisibility(8);
        addView(this.f67195a);
        addView(this.f67201g);
        addView(this.f67200f);
        addView(this.f67197c);
    }

    /* renamed from: d */
    public boolean m43517d() {
        InterfaceC26180w interfaceC26180w = this.f67205k;
        if (interfaceC26180w != null && interfaceC26180w.mo42638c()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m43516e() {
        InterfaceC26180w interfaceC26180w = this.f67205k;
        if (interfaceC26180w != null && interfaceC26180w.isPlaying()) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public void m43515f() {
        InterfaceC26180w interfaceC26180w = this.f67205k;
        if (interfaceC26180w == null) {
            return;
        }
        interfaceC26180w.pause();
        this.f67195a.setVisibility(0);
        Bitmap screenShot = this.f67199e.getScreenShot();
        if (screenShot != null && this.f67205k.mo42635f()) {
            this.f67195a.setImageBitmap(screenShot);
        }
        if (this.f67210p) {
            this.f67197c.setVisibility(0);
        }
    }

    /* renamed from: g */
    public void m43514g() {
        this.f67197c.setVisibility(8);
        InterfaceC26180w interfaceC26180w = this.f67205k;
        if (interfaceC26180w != null && this.f67206l != null) {
            interfaceC26180w.mo42644a();
            this.f67195a.setVisibility(8);
        }
    }

    @NonNull
    public FrameLayout getClickableLayout() {
        return this.f67200f;
    }

    @NonNull
    public C26038q9 getImageView() {
        return this.f67195a;
    }

    @Nullable
    public InterfaceC26180w getVideoPlayer() {
        return this.f67205k;
    }

    /* renamed from: h */
    public void m43513h() {
        this.f67197c.setOnClickListener(this.f67198d);
    }

    /* renamed from: i */
    public void m43512i() {
        this.f67195a.setVisibility(8);
        this.f67201g.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((i3 - i) - measuredWidth) / 2;
                int i7 = ((i4 - i2) - measuredHeight) / 2;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int i5 = this.f67208n;
        if (i5 != 0 && (i3 = this.f67209o) != 0) {
            if (mode2 == 0 && size2 == 0) {
                size2 = i5;
                size = i3;
                mode = Integer.MIN_VALUE;
                mode2 = Integer.MIN_VALUE;
            }
            if (size2 == 0 || mode2 == 0) {
                size2 = (int) ((size / i3) * i5);
            }
            if (size == 0 || mode == 0) {
                size = (int) ((size2 / i5) * i3);
            }
            float f = i3 / i5;
            float f2 = size / f;
            float f3 = size2;
            if (f2 > f3) {
                size = (int) (f * f3);
            } else {
                size2 = (int) f2;
            }
            for (int i6 = 0; i6 < getChildCount(); i6++) {
                View childAt = getChildAt(i6);
                if (childAt.getVisibility() != 8) {
                    if (childAt != this.f67195a && childAt != this.f67200f && childAt != this.f67199e) {
                        i4 = Integer.MIN_VALUE;
                    } else {
                        i4 = 1073741824;
                    }
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, i4), View.MeasureSpec.makeMeasureSpec(size2, i4));
                }
            }
            setMeasuredDimension(size, size2);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 1073741824));
    }

    @Override // com.p551my.target.C26203x.InterfaceC26204a
    /* renamed from: p */
    public void mo42449p() {
        InterfaceC25892a interfaceC25892a;
        if (this.f67205k instanceof C25996p1) {
            this.f67199e.setViewMode(1);
            VideoData videoData = this.f67206l;
            if (videoData != null) {
                this.f67199e.m42549a(videoData.getWidth(), this.f67206l.getHeight());
            }
            this.f67205k.mo42640a(this.f67199e);
            if (this.f67205k.isPlaying() && (interfaceC25892a = this.f67204j) != null) {
                interfaceC25892a.mo43509j();
                return;
            }
            return;
        }
        InterfaceC25892a interfaceC25892a2 = this.f67204j;
        if (interfaceC25892a2 != null) {
            interfaceC25892a2.mo42466a("Playback within no hardware accelerated view is available only with ExoPlayer");
        }
    }

    public void setInterstitialPromoViewListener(@Nullable InterfaceC25892a interfaceC25892a) {
        this.f67204j = interfaceC25892a;
        InterfaceC26180w interfaceC26180w = this.f67205k;
        if (interfaceC26180w != null) {
            interfaceC26180w.mo42641a(interfaceC25892a);
        }
    }

    /* renamed from: a */
    public final void m43524a(C25655b4 c25655b4, int i) {
        C25869ka c25869ka;
        int i2;
        C25704d5 videoBanner = c25655b4.getVideoBanner();
        if (videoBanner == null) {
            return;
        }
        VideoData videoData = (VideoData) videoBanner.getMediaData();
        this.f67206l = videoData;
        if (videoData == null) {
            return;
        }
        InterfaceC26180w m43796a = AbstractC25795h5.m43796a(this.f67203i, getContext());
        this.f67205k = m43796a;
        m43796a.mo42641a(this.f67204j);
        if (videoBanner.isAutoMute()) {
            this.f67205k.setVolume(0.0f);
        }
        this.f67209o = this.f67206l.getWidth();
        this.f67208n = this.f67206l.getHeight();
        ImageData preview = videoBanner.getPreview();
        if (preview != null) {
            this.f67207m = preview.getData();
            if (this.f67209o <= 0 || this.f67208n <= 0) {
                this.f67209o = preview.getWidth();
                this.f67208n = preview.getHeight();
            }
            this.f67195a.setImageBitmap(this.f67207m);
        } else {
            ImageData image = c25655b4.getImage();
            if (image != null) {
                if (this.f67209o <= 0 || this.f67208n <= 0) {
                    this.f67209o = image.getWidth();
                    this.f67208n = image.getHeight();
                }
                Bitmap data = image.getData();
                this.f67207m = data;
                this.f67195a.setImageBitmap(data);
            }
        }
        if (i != 1) {
            if (this.f67202h) {
                c25869ka = this.f67196b;
                i2 = IronSourceConstants.USING_CACHE_FOR_INIT_EVENT;
            } else {
                c25869ka = this.f67196b;
                i2 = 96;
            }
            this.f67197c.m43472a(AbstractC25703d4.m44033a(c25869ka.m43598b(i2)), false);
        }
    }

    /* renamed from: b */
    public void m43521b(C25655b4 c25655b4) {
        m43527a();
        m43525a(c25655b4);
    }

    /* renamed from: a */
    public void m43527a() {
        InterfaceC26180w interfaceC26180w = this.f67205k;
        if (interfaceC26180w != null) {
            interfaceC26180w.destroy();
        }
        this.f67205k = null;
    }

    /* renamed from: b */
    public void m43520b(C25655b4 c25655b4, int i) {
        if (c25655b4.getVideoBanner() != null) {
            m43524a(c25655b4, i);
        } else {
            m43525a(c25655b4);
        }
    }

    /* renamed from: a */
    public void m43523a(boolean z) {
        InterfaceC26180w interfaceC26180w;
        InterfaceC26180w interfaceC26180w2;
        this.f67197c.setVisibility(8);
        this.f67201g.setVisibility(0);
        if (this.f67206l == null || (interfaceC26180w = this.f67205k) == null) {
            return;
        }
        interfaceC26180w.mo42641a(this.f67204j);
        this.f67205k.mo42640a(this.f67199e);
        this.f67199e.m42549a(this.f67206l.getWidth(), this.f67206l.getHeight());
        String str = (String) this.f67206l.getData();
        if (!z || str == null) {
            interfaceC26180w2 = this.f67205k;
            str = this.f67206l.getUrl();
        } else {
            interfaceC26180w2 = this.f67205k;
        }
        interfaceC26180w2.mo42643a(Uri.parse(str), this.f67199e.getContext());
    }

    /* renamed from: b */
    public void m43519b(boolean z) {
        InterfaceC26180w interfaceC26180w = this.f67205k;
        if (interfaceC26180w != null) {
            interfaceC26180w.stop();
        }
        this.f67201g.setVisibility(8);
        this.f67195a.setVisibility(0);
        this.f67195a.setImageBitmap(this.f67207m);
        this.f67210p = z;
        if (z) {
            this.f67197c.setVisibility(0);
            return;
        }
        this.f67195a.setOnClickListener(null);
        this.f67197c.setOnClickListener(null);
        setOnClickListener(null);
    }

    /* renamed from: a */
    public void m43526a(int i) {
        InterfaceC26180w interfaceC26180w = this.f67205k;
        if (interfaceC26180w != null) {
            if (i == 0) {
                interfaceC26180w.mo42636e();
            } else if (i != 1) {
                interfaceC26180w.mo42632i();
            } else {
                interfaceC26180w.mo42637d();
            }
        }
    }
}
