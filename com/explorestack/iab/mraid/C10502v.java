package com.explorestack.iab.mraid;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.annotation.NonNull;

/* renamed from: com.explorestack.iab.mraid.v */
/* loaded from: classes3.dex */
public class C10502v extends GestureDetector {
    @NonNull

    /* renamed from: a */
    private final C10503a f23985a;

    /* renamed from: com.explorestack.iab.mraid.v$a */
    /* loaded from: classes3.dex */
    static class C10503a extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: b */
        private boolean f23986b = false;

        C10503a() {
        }

        /* renamed from: a */
        boolean m79407a() {
            return this.f23986b;
        }

        /* renamed from: b */
        void m79406b() {
            this.f23986b = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(@NonNull MotionEvent motionEvent) {
            this.f23986b = true;
            return super.onSingleTapUp(motionEvent);
        }
    }

    public C10502v(@NonNull Context context) {
        this(context, new C10503a());
    }

    /* renamed from: a */
    public boolean m79409a() {
        return this.f23985a.m79407a();
    }

    /* renamed from: b */
    public void m79408b() {
        this.f23985a.m79406b();
    }

    private C10502v(Context context, @NonNull C10503a c10503a) {
        super(context, c10503a);
        this.f23985a = c10503a;
        setIsLongpressEnabled(false);
    }
}
