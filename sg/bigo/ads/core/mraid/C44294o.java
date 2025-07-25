package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* renamed from: sg.bigo.ads.core.mraid.o */
/* loaded from: classes10.dex */
public final class C44294o extends GestureDetector {
    @NonNull

    /* renamed from: a */
    C44295a f116279a;

    /* renamed from: b */
    private long f116280b;

    /* renamed from: sg.bigo.ads.core.mraid.o$a */
    /* loaded from: classes10.dex */
    static class C44295a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a */
        boolean f116281a = false;

        C44295a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            this.f116281a = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public C44294o(@NonNull Context context) {
        this(context, new C44295a());
    }

    /* renamed from: a */
    public final boolean m3430a() {
        if (System.currentTimeMillis() - this.f116280b <= 3000) {
            return true;
        }
        return false;
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.f116279a.f116281a = false;
            this.f116280b = System.currentTimeMillis();
        }
        return super.onTouchEvent(motionEvent);
    }

    private C44294o(Context context, @NonNull C44295a c44295a) {
        super(context, c44295a);
        this.f116280b = -1L;
        this.f116279a = c44295a;
        setIsLongpressEnabled(false);
    }
}
