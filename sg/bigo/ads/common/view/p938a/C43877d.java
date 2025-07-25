package sg.bigo.ads.common.view.p938a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import sg.bigo.ads.common.InterfaceC43601d;
import sg.bigo.ads.common.p907ab.C43593a;
import sg.bigo.ads.common.p909c.C43599b;
import sg.bigo.ads.common.p909c.InterfaceC43598a;
import sg.bigo.ads.common.utils.C43819d;
import sg.bigo.ads.common.utils.C43828k;
import sg.bigo.ads.common.utils.C43841u;

/* renamed from: sg.bigo.ads.common.view.a.d */
/* loaded from: classes10.dex */
public final class C43877d<T extends View> implements InterfaceC43876c<T> {

    /* renamed from: a */
    public static final long f114887a = TimeUnit.SECONDS.toMillis(1) / 60;

    /* renamed from: b */
    public final T f114888b;

    /* renamed from: c */
    public final Context f114889c;

    /* renamed from: d */
    public final C43874a f114890d;

    /* renamed from: e */
    boolean f114891e;

    /* renamed from: f */
    public View f114892f;

    /* renamed from: g */
    public boolean f114893g;

    /* renamed from: i */
    private final InterfaceC43598a f114895i;

    /* renamed from: j */
    private Canvas f114896j;

    /* renamed from: k */
    private Bitmap f114897k;

    /* renamed from: l */
    private C43880a f114898l;

    /* renamed from: m */
    private long f114899m;

    /* renamed from: h */
    public final ViewTreeObserver.OnPreDrawListener f114894h = new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.common.view.a.d.1
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - C43877d.this.f114899m) >= C43877d.f114887a) {
                C43877d.m4710b(C43877d.this);
                C43877d.this.f114899m = elapsedRealtime;
                return true;
            }
            return true;
        }
    };

    /* renamed from: n */
    private int f114900n = -1;

    /* renamed from: o */
    private final WeakHashMap<TextureView, Object> f114901o = new WeakHashMap<>();

    /* renamed from: sg.bigo.ads.common.view.a.d$a */
    /* loaded from: classes10.dex */
    public static class C43880a extends BitmapDrawable {

        /* renamed from: a */
        final C43877d f114904a;

        /* renamed from: b */
        private final Paint f114905b;

        private C43880a(C43877d c43877d, Bitmap bitmap) {
            super(c43877d.f114888b.getResources(), bitmap);
            this.f114904a = c43877d;
            this.f114905b = new Paint();
        }

        @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
        public final void draw(Canvas canvas) {
            super.draw(canvas);
            C43875b c43875b = this.f114904a.f114890d.f114875b;
            if (c43875b != null) {
                this.f114905b.setColor(c43875b.m4718b());
                canvas.drawRect(getBounds(), this.f114905b);
            }
        }

        /* synthetic */ C43880a(C43877d c43877d, Bitmap bitmap, byte b) {
            this(c43877d, bitmap);
        }
    }

    public C43877d(T t) {
        this.f114888b = t;
        Context context = t.getContext();
        this.f114889c = context;
        this.f114895i = new C43599b(context);
        this.f114890d = new C43874a();
    }

    /* renamed from: d */
    static /* synthetic */ int m4708d(C43877d c43877d) {
        int i = c43877d.f114900n;
        c43877d.f114900n = i + 1;
        return i;
    }

    /* renamed from: b */
    public final void m4711b() {
        Bitmap bitmap = this.f114897k;
        if (bitmap != null) {
            bitmap.recycle();
            this.f114897k = null;
        }
        if (this.f114898l != null) {
            this.f114898l = null;
        }
        this.f114895i.mo5326a();
    }

    @Override // sg.bigo.ads.common.view.p938a.InterfaceC43876c
    public final void setBlurStyle(C43875b c43875b) {
        C43874a c43874a = this.f114890d;
        boolean z = false;
        if ((c43875b != null || c43874a.f114875b != null) && c43875b != c43874a.f114875b) {
            c43874a.f114875b = c43875b;
            c43874a.invalidateSelf();
            z = true;
        }
        if (!z) {
            return;
        }
        this.f114899m = 0L;
        m4711b();
    }

    /* renamed from: b */
    static /* synthetic */ void m4710b(C43877d c43877d) {
        C43875b c43875b;
        Bitmap bitmap;
        if (c43877d.f114891e) {
            return;
        }
        C43874a c43874a = c43877d.f114890d;
        Drawable drawable = c43874a.f114413a;
        if ((drawable == null || (drawable instanceof C43880a)) && (c43875b = c43874a.f114875b) != null && c43875b.m4717c() > 0.0f && C43841u.m4795c(c43877d.f114888b) && C43593a.m5331a(c43877d.f114888b, new Rect())) {
            C43875b c43875b2 = c43877d.f114890d.f114875b;
            if (c43875b2 == null) {
                c43877d.m4711b();
                return;
            }
            View view = c43877d.f114892f;
            if (view == null || !c43877d.f114888b.isShown()) {
                c43877d.m4711b();
                return;
            }
            Rect rect = new Rect();
            c43875b2.m4720a(rect);
            if (c43877d.f114896j == null || c43877d.f114898l == null || c43877d.f114897k == null) {
                c43877d.m4711b();
                int measuredWidth = (c43877d.f114888b.getMeasuredWidth() - rect.left) - rect.right;
                int measuredHeight = (c43877d.f114888b.getMeasuredHeight() - rect.top) - rect.bottom;
                int max = Math.max(1, (int) (measuredWidth / c43875b2.m4716d()));
                int max2 = Math.max(1, (int) (measuredHeight / c43875b2.m4716d()));
                c43877d.f114897k = C43819d.m4922a(max, max2, Bitmap.Config.ARGB_8888);
                c43877d.f114898l = new C43880a(c43877d, C43819d.m4922a(max, max2, Bitmap.Config.ARGB_8888), (byte) 0);
                if (c43877d.f114897k == null) {
                    return;
                }
                c43877d.f114896j = new Canvas(c43877d.f114897k);
                c43877d.f114890d.m5153a(c43877d.f114898l);
                if (!c43877d.f114895i.mo5325a(c43877d.f114897k, c43875b2.m4717c())) {
                    return;
                }
            }
            Point m4802a = C43841u.m4802a(view, c43877d.f114888b);
            c43877d.f114897k.eraseColor(c43875b2.m4718b() & (-1));
            float alpha = c43877d.f114888b.getAlpha();
            c43877d.f114888b.setAlpha(0.0f);
            c43877d.f114891e = true;
            float m4716d = 1.0f / c43875b2.m4716d();
            int save = c43877d.f114896j.save();
            try {
                c43877d.f114896j.scale(m4716d, m4716d);
                c43877d.f114896j.translate((-m4802a.x) - rect.left, (-m4802a.y) - rect.top);
                if (view.getBackground() != null) {
                    view.getBackground().draw(c43877d.f114896j);
                }
                view.draw(c43877d.f114896j);
            } catch (Exception unused) {
            } catch (Throwable th) {
                c43877d.f114896j.restoreToCount(save);
                throw th;
            }
            c43877d.f114896j.restoreToCount(save);
            c43877d.m4714a();
            Set<TextureView> keySet = c43877d.f114901o.keySet();
            if (!C43828k.m4877a(keySet)) {
                int i = m4802a.x;
                Rect rect2 = new Rect(rect.left + i, m4802a.y + rect.top, (i + c43877d.f114888b.getMeasuredWidth()) - rect.right, (m4802a.y + c43877d.f114888b.getMeasuredHeight()) - rect.bottom);
                Iterator<TextureView> it = keySet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    TextureView next = it.next();
                    if (next != null && next.isOpaque() && C43841u.m4793d(next)) {
                        Point m4802a2 = C43841u.m4802a(view, next);
                        int i2 = m4802a2.x;
                        Rect rect3 = new Rect(i2, m4802a2.y, next.getMeasuredWidth() + i2, m4802a2.y + next.getMeasuredHeight());
                        Rect rect4 = new Rect(rect3);
                        if (rect4.intersect(rect2) && (bitmap = next.getBitmap()) != null) {
                            int i3 = rect4.left - rect3.left;
                            int i4 = rect4.top - rect3.top;
                            Rect rect5 = new Rect(i3, i4, rect4.width() + i3, rect4.height() + i4);
                            int i5 = rect4.left - rect2.left;
                            int i6 = rect4.top - rect2.top;
                            Rect rect6 = new Rect(i5, i6, rect4.width() + i5, rect4.height() + i6);
                            int save2 = c43877d.f114896j.save();
                            try {
                                c43877d.f114896j.scale(m4716d, m4716d);
                                c43877d.f114896j.drawBitmap(bitmap, rect5, rect6, new Paint());
                            } catch (Exception unused2) {
                            } catch (Throwable th2) {
                                c43877d.f114896j.restoreToCount(save2);
                                throw th2;
                            }
                            c43877d.f114896j.restoreToCount(save2);
                            break;
                        }
                    }
                }
            }
            c43877d.f114891e = false;
            c43877d.f114888b.setAlpha(alpha);
            c43877d.f114895i.mo5324a(c43877d.f114897k, c43877d.f114898l.getBitmap());
            c43877d.f114890d.invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void m4714a() {
        if (!(this.f114892f instanceof ViewGroup) || this.f114900n == this.f114901o.size()) {
            return;
        }
        this.f114900n = 0;
        this.f114901o.clear();
        C43841u.m4798a((ViewGroup) this.f114892f, new InterfaceC43601d<View>() { // from class: sg.bigo.ads.common.view.a.d.2
            @Override // sg.bigo.ads.common.InterfaceC43601d
            /* renamed from: a */
            public final /* synthetic */ void mo4706a(View view) {
                View view2 = view;
                if (view2 instanceof TextureView) {
                    C43877d.this.f114901o.put((TextureView) view2, C43877d.this);
                    C43877d.m4708d(C43877d.this);
                }
            }
        });
    }
}
