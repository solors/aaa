package sg.bigo.ads.core.mraid.p970a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import sg.bigo.ads.C42750R;
import sg.bigo.ads.common.utils.C43810a;
import sg.bigo.ads.common.utils.C43822e;

/* renamed from: sg.bigo.ads.core.mraid.a.a */
/* loaded from: classes10.dex */
public final class C44235a extends FrameLayout {
    @NonNull

    /* renamed from: a */
    public final Drawable f116125a;

    /* renamed from: b */
    private final int f116126b;
    @Nullable

    /* renamed from: c */
    private InterfaceC44237b f116127c;
    @NonNull

    /* renamed from: d */
    private EnumC44236a f116128d;

    /* renamed from: e */
    private final int f116129e;

    /* renamed from: f */
    private final int f116130f;

    /* renamed from: g */
    private final int f116131g;

    /* renamed from: h */
    private boolean f116132h;

    /* renamed from: i */
    private final Rect f116133i;

    /* renamed from: j */
    private final Rect f116134j;

    /* renamed from: k */
    private final Rect f116135k;

    /* renamed from: l */
    private final Rect f116136l;

    /* renamed from: m */
    private boolean f116137m;
    @Nullable

    /* renamed from: n */
    private RunnableC44238c f116138n;

    /* renamed from: sg.bigo.ads.core.mraid.a.a$a */
    /* loaded from: classes10.dex */
    public enum EnumC44236a {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);
        

        /* renamed from: h */
        final int f116147h;

        EnumC44236a(int i) {
            this.f116147h = i;
        }
    }

    /* renamed from: sg.bigo.ads.core.mraid.a.a$b */
    /* loaded from: classes10.dex */
    public interface InterfaceC44237b {
        /* renamed from: a */
        void mo3497a();
    }

    /* renamed from: sg.bigo.ads.core.mraid.a.a$c */
    /* loaded from: classes10.dex */
    final class RunnableC44238c implements Runnable {
        private RunnableC44238c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C44235a.this.setClosePressed(false);
        }

        /* synthetic */ RunnableC44238c(C44235a c44235a, byte b) {
            this();
        }
    }

    public C44235a(@NonNull Context context) {
        this(context, (byte) 0);
    }

    /* renamed from: a */
    private static void m3567a(EnumC44236a enumC44236a, int i, Rect rect, Rect rect2) {
        Gravity.apply(enumC44236a.f116147h, i, i, rect, rect2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosePressed(boolean z) {
        int[] iArr;
        if (z == m3569a()) {
            return;
        }
        Drawable drawable = this.f116125a;
        if (z) {
            iArr = FrameLayout.SELECTED_STATE_SET;
        } else {
            iArr = FrameLayout.EMPTY_STATE_SET;
        }
        drawable.setState(iArr);
        invalidate(this.f116134j);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.f116132h) {
            this.f116132h = false;
            this.f116133i.set(0, 0, getWidth(), getHeight());
            m3566a(this.f116128d, this.f116133i, this.f116134j);
            this.f116136l.set(this.f116134j);
            Rect rect = this.f116136l;
            int i = this.f116131g;
            rect.inset(i, i);
            m3567a(this.f116128d, this.f116130f, this.f116136l, this.f116135k);
            this.f116125a.setBounds(this.f116135k);
        }
        if (this.f116125a.isVisible()) {
            this.f116125a.draw(canvas);
        }
    }

    @VisibleForTesting
    final Rect getCloseBounds() {
        return this.f116134j;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return m3568a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f116132h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        boolean z;
        if (m3568a((int) motionEvent.getX(), (int) motionEvent.getY(), this.f116126b)) {
            if (!this.f116137m && !this.f116125a.isVisible()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action != 1) {
                        if (action == 3) {
                            setClosePressed(false);
                        }
                    } else if (m3569a()) {
                        if (this.f116138n == null) {
                            this.f116138n = new RunnableC44238c(this, (byte) 0);
                        }
                        postDelayed(this.f116138n, ViewConfiguration.getPressedStateDuration());
                        playSoundEffect(0);
                        InterfaceC44237b interfaceC44237b = this.f116127c;
                        if (interfaceC44237b != null) {
                            interfaceC44237b.mo3497a();
                        }
                    }
                } else {
                    setClosePressed(true);
                }
                return true;
            }
        }
        setClosePressed(false);
        super.onTouchEvent(motionEvent);
        return false;
    }

    public final void setCloseAlwaysInteractable(boolean z) {
        this.f116137m = z;
    }

    @VisibleForTesting
    final void setCloseBoundChanged(boolean z) {
        this.f116132h = z;
    }

    @VisibleForTesting
    final void setCloseBounds(Rect rect) {
        this.f116134j.set(rect);
    }

    public final void setClosePosition(@NonNull EnumC44236a enumC44236a) {
        this.f116128d = enumC44236a;
        this.f116132h = true;
        invalidate();
    }

    public final void setCloseVisible(boolean z) {
        if (this.f116125a.setVisible(z, false)) {
            invalidate(this.f116134j);
        }
    }

    public final void setOnCloseListener(@Nullable InterfaceC44237b interfaceC44237b) {
        this.f116127c = interfaceC44237b;
    }

    private C44235a(@NonNull Context context, byte b) {
        super(context, null, 0);
        this.f116133i = new Rect();
        this.f116134j = new Rect();
        this.f116135k = new Rect();
        this.f116136l = new Rect();
        Drawable m4955a = C43810a.m4955a(context, C42750R.C42752drawable.bigo_ad_ic_close);
        this.f116125a = m4955a;
        this.f116128d = EnumC44236a.TOP_RIGHT;
        m4955a.setState(FrameLayout.EMPTY_STATE_SET);
        m4955a.setCallback(this);
        this.f116126b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f116129e = C43822e.m4906a(context, 50);
        this.f116130f = C43822e.m4906a(context, 30);
        this.f116131g = C43822e.m4906a(context, 8);
        setWillNotDraw(false);
        this.f116137m = true;
    }

    /* renamed from: a */
    public final void m3566a(EnumC44236a enumC44236a, Rect rect, Rect rect2) {
        m3567a(enumC44236a, this.f116129e, rect, rect2);
    }

    @VisibleForTesting
    /* renamed from: a */
    private boolean m3569a() {
        return this.f116125a.getState() == FrameLayout.SELECTED_STATE_SET;
    }

    @VisibleForTesting
    /* renamed from: a */
    private boolean m3568a(int i, int i2, int i3) {
        Rect rect = this.f116134j;
        return i >= rect.left - i3 && i2 >= rect.top - i3 && i < rect.right + i3 && i2 < rect.bottom + i3;
    }
}
