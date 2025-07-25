package com.mbridge.msdk.nativex.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.SameTool;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.NativeListener;
import java.util.List;

/* loaded from: classes6.dex */
public class MBNativeRollView extends LinearLayout {

    /* renamed from: a */
    private RollingBCView f57880a;

    /* renamed from: b */
    private Context f57881b;

    /* renamed from: c */
    private NativeListener.FilpListener f57882c;

    /* renamed from: com.mbridge.msdk.nativex.view.MBNativeRollView$a */
    /* loaded from: classes6.dex */
    public interface InterfaceC22268a {
        /* renamed from: a */
        View m50936a(Frame frame, int i);
    }

    @SuppressLint({"NewApi"})
    public MBNativeRollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f57880a.dispatchTouchEvent(motionEvent);
    }

    public void setData(List<Frame> list, Context context, String str, InterfaceC22268a interfaceC22268a) {
        this.f57880a.setData(list, context, str, interfaceC22268a);
    }

    public void setFilpListening(NativeListener.FilpListener filpListener) {
        if (filpListener != null) {
            this.f57882c = filpListener;
            this.f57880a.setFilpListening(filpListener);
        }
    }

    public void setFrameWidth(int i) {
        this.f57880a.setLayoutParams(new LinearLayout.LayoutParams(i, -2));
    }

    public MBNativeRollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f57881b = context;
        RollingBCView rollingBCView = new RollingBCView(context);
        this.f57880a = rollingBCView;
        addView(rollingBCView);
        this.f57880a.setLayoutParams(new LinearLayout.LayoutParams((int) (SameTool.m51712j(context) * 0.9d), -2));
        setClipChildren(false);
    }

    public MBNativeRollView(Context context) {
        this(context, null);
    }
}
