package sg.bigo.ads.common.p928p;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import sg.bigo.ads.common.p926n.C43727d;
import sg.bigo.ads.common.utils.C43810a;
import sg.bigo.ads.common.utils.C43819d;

/* renamed from: sg.bigo.ads.common.p.b */
/* loaded from: classes10.dex */
public final class C43758b {

    /* renamed from: a */
    public boolean f114520a;

    /* renamed from: b */
    public final List<WeakReference<InterfaceC43772g>> f114521b;

    /* renamed from: c */
    private final ImageView f114522c;

    public C43758b(ImageView imageView) {
        this.f114520a = false;
        this.f114521b = new ArrayList();
        this.f114522c = imageView;
        imageView.setAdjustViewBounds(true);
    }

    /* renamed from: a */
    private void m5046a(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            ImageView imageView = this.f114522c;
            imageView.setImageDrawable(C43810a.m4955a(imageView.getContext(), parseInt));
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: b */
    private void m5043b(final String str) {
        final WeakReference weakReference = new WeakReference(this.f114522c);
        C43727d.m5108a(3, new Runnable() { // from class: sg.bigo.ads.common.p.b.3
            @Override // java.lang.Runnable
            public final void run() {
                final Bitmap m4913a;
                if (C43758b.this.f114520a) {
                    m4913a = C43819d.m4910b(str);
                } else {
                    m4913a = C43819d.m4913a(str);
                }
                if (m4913a == null) {
                    return;
                }
                C43727d.m5102b(new Runnable() { // from class: sg.bigo.ads.common.p.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ImageView imageView = (ImageView) weakReference.get();
                        if (imageView != null) {
                            imageView.setImageBitmap(m4913a);
                        }
                    }
                });
            }
        });
    }

    public C43758b(ImageView imageView, byte b) {
        this.f114520a = false;
        this.f114521b = new ArrayList();
        this.f114522c = imageView;
        imageView.setAdjustViewBounds(true);
        this.f114520a = true;
    }

    /* renamed from: b */
    private void m5042b(@Nullable final Executor executor, final String str, final boolean z) {
        final WeakReference weakReference = new WeakReference(this.f114522c);
        C43727d.m5108a(3, new Runnable() { // from class: sg.bigo.ads.common.p.b.1
            @Override // java.lang.Runnable
            public final void run() {
                final C43758b c43758b = C43758b.this;
                Executor executor2 = executor;
                String str2 = str;
                boolean z2 = z;
                final WeakReference weakReference2 = weakReference;
                InterfaceC43772g interfaceC43772g = new InterfaceC43772g() { // from class: sg.bigo.ads.common.p.b.2
                    @Override // sg.bigo.ads.common.p928p.InterfaceC43772g
                    /* renamed from: a */
                    public final void mo5036a(int i, @NonNull String str3, String str4) {
                        for (WeakReference<InterfaceC43772g> weakReference3 : C43758b.this.f114521b) {
                            InterfaceC43772g interfaceC43772g2 = weakReference3.get();
                            if (interfaceC43772g2 != null) {
                                interfaceC43772g2.mo5036a(i, str3, str4);
                            }
                        }
                    }

                    @Override // sg.bigo.ads.common.p928p.InterfaceC43772g
                    /* renamed from: a */
                    public final void mo5035a(@NonNull Bitmap bitmap, @NonNull C43771f c43771f) {
                        ImageView imageView = (ImageView) weakReference2.get();
                        if (imageView != null) {
                            imageView.setImageBitmap(bitmap);
                        }
                        for (WeakReference<InterfaceC43772g> weakReference3 : C43758b.this.f114521b) {
                            InterfaceC43772g interfaceC43772g2 = weakReference3.get();
                            if (interfaceC43772g2 != null) {
                                interfaceC43772g2.mo5035a(bitmap, c43771f);
                            }
                        }
                    }
                };
                if (c43758b.f114520a) {
                    C43769e.m5037b(executor2, str2, z2, interfaceC43772g);
                } else {
                    C43769e.m5038a(executor2, str2, z2, interfaceC43772g);
                }
            }
        });
    }

    /* renamed from: a */
    public final void m5045a(@Nullable Executor executor, String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if ("res".equalsIgnoreCase(scheme)) {
            m5046a(parse.getHost());
        } else if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
            m5042b(executor, str, z);
        } else if ("file".equalsIgnoreCase(scheme)) {
            m5043b(parse.getPath());
        }
    }

    /* renamed from: a */
    public final void m5044a(InterfaceC43772g interfaceC43772g) {
        if (interfaceC43772g == null) {
            return;
        }
        this.f114521b.add(new WeakReference<>(interfaceC43772g));
    }
}
