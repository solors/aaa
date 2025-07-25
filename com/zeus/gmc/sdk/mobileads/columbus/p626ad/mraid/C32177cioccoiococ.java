package com.zeus.gmc.sdk.mobileads.columbus.p626ad.mraid;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.cioccoiococ */
/* loaded from: classes8.dex */
public class C32177cioccoiococ extends GestureDetector {
    private static final String c2oc2i = "ViewGestureDetector";
    private InterfaceC32178coo2iico coi222o222;
    private final View coo2iico;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.mraid.cioccoiococ$coo2iico */
    /* loaded from: classes8.dex */
    public interface InterfaceC32178coo2iico {
        void coo2iico();
    }

    public C32177cioccoiococ(@NonNull Context context, @NonNull View view, @NonNull GestureDetector.SimpleOnGestureListener simpleOnGestureListener) {
        super(context, simpleOnGestureListener);
        this.coo2iico = view;
        setIsLongpressEnabled(false);
    }

    public void coo2iico(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            onTouchEvent(motionEvent);
        } else if (action != 1) {
            if (action == 2 && coo2iico(motionEvent, this.coo2iico)) {
                onTouchEvent(motionEvent);
            }
        } else {
            InterfaceC32178coo2iico interfaceC32178coo2iico = this.coi222o222;
            if (interfaceC32178coo2iico != null) {
                interfaceC32178coo2iico.coo2iico();
            } else {
                MLog.m25892d(c2oc2i, "View's onUserClick() is not registered.");
            }
        }
    }

    public void coo2iico(InterfaceC32178coo2iico interfaceC32178coo2iico) {
        this.coi222o222 = interfaceC32178coo2iico;
    }

    private boolean coo2iico(MotionEvent motionEvent, View view) {
        if (motionEvent == null || view == null) {
            return false;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        return x >= 0.0f && x <= ((float) view.getWidth()) && y >= 0.0f && y <= ((float) view.getHeight());
    }
}
