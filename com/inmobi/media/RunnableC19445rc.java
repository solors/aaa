package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.rc */
/* loaded from: classes6.dex */
public final class RunnableC19445rc implements Runnable {

    /* renamed from: a */
    public final AtomicBoolean f48632a;

    /* renamed from: b */
    public final ArrayList f48633b;

    /* renamed from: c */
    public final ArrayList f48634c;

    /* renamed from: d */
    public final WeakReference f48635d;

    public RunnableC19445rc(AbstractC19515wc visibilityTracker, AtomicBoolean isPaused) {
        Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        Intrinsics.checkNotNullParameter(isPaused, "isPaused");
        this.f48632a = isPaused;
        this.f48633b = new ArrayList();
        this.f48634c = new ArrayList();
        this.f48635d = new WeakReference(visibilityTracker);
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC19459sc interfaceC19459sc;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Bitmap bitmap;
        if (this.f48632a.get()) {
            return;
        }
        AbstractC19515wc abstractC19515wc = (AbstractC19515wc) this.f48635d.get();
        if (abstractC19515wc != null) {
            abstractC19515wc.f48857m = false;
            for (Map.Entry entry : abstractC19515wc.f48845a.entrySet()) {
                View view = (View) entry.getKey();
                C19473tc c19473tc = (C19473tc) entry.getValue();
                int i9 = c19473tc.f48699a;
                View view2 = c19473tc.f48701c;
                Object obj = c19473tc.f48702d;
                byte b = abstractC19515wc.f48848d;
                boolean z = true;
                if (b == 1) {
                    InterfaceC19431qc interfaceC19431qc = abstractC19515wc.f48846b;
                    if (interfaceC19431qc.mo59924a(view2, view, i9, obj) && interfaceC19431qc.mo59925a(view, view, i9)) {
                        this.f48633b.add(view);
                    } else {
                        this.f48634c.add(view);
                    }
                } else if (b == 2) {
                    InterfaceC19431qc interfaceC19431qc2 = abstractC19515wc.f48846b;
                    Intrinsics.m17073h(interfaceC19431qc2, "null cannot be cast to non-null type com.inmobi.ads.viewability.inmobi.HtmlPollingVisibilityTracker.HtmlVisibilityChecker");
                    C19107T3 c19107t3 = (C19107T3) ((InterfaceC19172Y3) interfaceC19431qc2);
                    boolean mo59924a = c19107t3.mo59924a(view2, view, i9, obj);
                    boolean mo59925a = c19107t3.mo59925a(view, view, i9);
                    Intrinsics.checkNotNullParameter(view, "view");
                    if (view instanceof GestureDetector$OnGestureListenerC19100S9) {
                        Rect rect = new Rect();
                        if (view.getGlobalVisibleRect(rect)) {
                            GestureDetector$OnGestureListenerC19100S9 gestureDetector$OnGestureListenerC19100S9 = (GestureDetector$OnGestureListenerC19100S9) view;
                            int[] iArr = new int[2];
                            gestureDetector$OnGestureListenerC19100S9.getLocationInWindow(iArr);
                            int[] viewableFrameArray = gestureDetector$OnGestureListenerC19100S9.getViewableFrameArray();
                            int i10 = iArr[0];
                            if (viewableFrameArray != null) {
                                i = viewableFrameArray[0];
                            } else {
                                i = 0;
                            }
                            int i11 = i10 + i;
                            int i12 = iArr[1];
                            if (viewableFrameArray != null) {
                                i2 = viewableFrameArray[1];
                            } else {
                                i2 = 0;
                            }
                            int i13 = i12 + i2;
                            if (viewableFrameArray != null) {
                                i3 = viewableFrameArray[2];
                            } else {
                                i3 = 0;
                            }
                            int i14 = i11 + i3;
                            if (viewableFrameArray != null) {
                                i4 = viewableFrameArray[3];
                            } else {
                                i4 = 0;
                            }
                            if (rect.intersect(new Rect(i11, i13, i14, i4 + i13))) {
                                Bitmap createBitmap = Bitmap.createBitmap(gestureDetector$OnGestureListenerC19100S9.getWidth(), gestureDetector$OnGestureListenerC19100S9.getHeight(), Bitmap.Config.ARGB_8888);
                                Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
                                Canvas canvas = new Canvas(createBitmap);
                                canvas.drawBitmap(createBitmap, 0.0f, 0.0f, new Paint());
                                gestureDetector$OnGestureListenerC19100S9.draw(canvas);
                                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, AbstractC19338k3.m60140a(gestureDetector$OnGestureListenerC19100S9.getWidth()), AbstractC19338k3.m60140a(gestureDetector$OnGestureListenerC19100S9.getHeight()), true);
                                Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
                                int[] viewableFrameArray2 = gestureDetector$OnGestureListenerC19100S9.getViewableFrameArray();
                                int width = createScaledBitmap.getWidth();
                                if (viewableFrameArray2 != null) {
                                    i5 = viewableFrameArray2[0];
                                } else {
                                    i5 = 0;
                                }
                                int min = Math.min(width, i5);
                                int height = createScaledBitmap.getHeight();
                                if (viewableFrameArray2 != null) {
                                    i6 = viewableFrameArray2[1];
                                } else {
                                    i6 = 0;
                                }
                                int min2 = Math.min(height, i6);
                                if (viewableFrameArray2 != null) {
                                    i7 = viewableFrameArray2[2];
                                } else {
                                    i7 = 0;
                                }
                                int min3 = Math.min(i7, createScaledBitmap.getWidth() - min);
                                if (viewableFrameArray2 != null) {
                                    i8 = viewableFrameArray2[3];
                                } else {
                                    i8 = 0;
                                }
                                int min4 = Math.min(i8, createScaledBitmap.getHeight() - min2);
                                if (min3 > 0 && min4 > 0) {
                                    bitmap = Bitmap.createBitmap(createScaledBitmap, min, min2, min3, min4);
                                } else {
                                    bitmap = null;
                                }
                                if (bitmap != null) {
                                    int height2 = bitmap.getHeight() * bitmap.getWidth();
                                    int[] iArr2 = new int[height2];
                                    bitmap.getPixels(iArr2, 0, bitmap.getWidth(), 0, 0, bitmap.getWidth(), bitmap.getHeight());
                                    int i15 = 0;
                                    for (int i16 = 0; i16 < height2; i16++) {
                                        int i17 = iArr2[i16];
                                        if (i17 > -16777216 && i17 < 0 && (i15 = i15 + 1) >= gestureDetector$OnGestureListenerC19100S9.getMinimumPixelsPainted()) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    z = false;
                    if (mo59924a && mo59925a && z) {
                        this.f48633b.add(view);
                    } else {
                        this.f48634c.add(view);
                    }
                } else {
                    InterfaceC19431qc interfaceC19431qc3 = abstractC19515wc.f48846b;
                    if (interfaceC19431qc3.mo59924a(view2, view, i9, obj) && interfaceC19431qc3.mo59925a(view, view, i9)) {
                        this.f48633b.add(view);
                    } else {
                        this.f48634c.add(view);
                    }
                }
            }
        }
        if (abstractC19515wc != null) {
            interfaceC19459sc = abstractC19515wc.f48854j;
        } else {
            interfaceC19459sc = null;
        }
        this.f48633b.size();
        this.f48634c.size();
        if (interfaceC19459sc != null) {
            interfaceC19459sc.mo59909a(this.f48633b, this.f48634c);
        }
        this.f48633b.clear();
        this.f48634c.clear();
        if (abstractC19515wc != null) {
            abstractC19515wc.mo59599d();
        }
    }
}
