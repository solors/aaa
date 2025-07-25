package com.pubmatic.sdk.monitor;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Point;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;

/* loaded from: classes7.dex */
public class POBMonitorView extends RelativeLayout implements View.OnTouchListener {

    /* renamed from: a */
    float f70373a;

    /* renamed from: b */
    float f70374b;

    /* renamed from: c */
    float f70375c;

    /* renamed from: d */
    float f70376d;

    /* renamed from: e */
    Point f70377e;

    /* renamed from: f */
    private ViewGroup f70378f;
    @Nullable

    /* renamed from: g */
    private InterfaceC26754b f70379g;
    @NonNull

    /* renamed from: h */
    RelativeLayout f70380h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.monitor.POBMonitorView$a */
    /* loaded from: classes7.dex */
    public class View$OnClickListenerC26753a implements View.OnClickListener {
        View$OnClickListenerC26753a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            POBMonitorView.this.f70378f.removeView(POBMonitorView.this);
            if (POBMonitorView.this.f70379g != null) {
                POBMonitorView.this.f70379g.mo40495a();
            }
        }
    }

    /* renamed from: com.pubmatic.sdk.monitor.POBMonitorView$b */
    /* loaded from: classes7.dex */
    interface InterfaceC26754b {
        /* renamed from: a */
        void mo40495a();

        /* renamed from: b */
        void mo40494b();
    }

    public POBMonitorView(Activity activity, Point point) {
        super(activity);
        this.f70377e = point;
        this.f70378f = (ViewGroup) activity.findViewById(16908290);
        m40498a();
    }

    public Point getTouchPointLocation() {
        Point point = new Point();
        point.set((int) this.f70380h.getX(), (int) this.f70380h.getY());
        return point;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC26754b interfaceC26754b;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    return false;
                }
                view.setY(motionEvent.getRawY() + this.f70374b);
                view.setX(motionEvent.getRawX() + this.f70373a);
            } else {
                float x = view.getX();
                float y = view.getY();
                if (Math.abs(x - this.f70375c) <= 20.0f && Math.abs(y - this.f70376d) <= 20.0f && (interfaceC26754b = this.f70379g) != null) {
                    interfaceC26754b.mo40494b();
                }
            }
        } else {
            this.f70375c = view.getX();
            this.f70376d = view.getY();
            this.f70373a = this.f70375c - motionEvent.getRawX();
            this.f70374b = this.f70376d - motionEvent.getRawY();
        }
        return true;
    }

    public void setListener(@Nullable InterfaceC26754b interfaceC26754b) {
        this.f70379g = interfaceC26754b;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: a */
    private void m40498a() {
        RelativeLayout relativeLayout = (RelativeLayout) ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R$layout.pob_monitor_view, (ViewGroup) null);
        this.f70380h = relativeLayout;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(POBUtils.convertDpToPixel(16));
        gradientDrawable.setColor(getResources().getColor(R$color.pob_monitor_background));
        ((Button) relativeLayout.findViewById(R$id.pob_monitor_floating_btn)).setBackground(gradientDrawable);
        Button button = (Button) this.f70380h.findViewById(R$id.pob_monitor_close_btn);
        button.setOnClickListener(new View$OnClickListenerC26753a());
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(getResources().getColor(R$color.pob_monitor_close_background));
        button.setBackground(gradientDrawable2);
        this.f70380h.setX(this.f70377e.x);
        this.f70380h.setY(this.f70377e.y);
        this.f70380h.setOnTouchListener(this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        Point point = this.f70377e;
        if (point.x == 0 && point.y == 0) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            layoutParams.rightMargin = POBUtils.convertDpToPixel(80);
            layoutParams.bottomMargin = POBUtils.convertDpToPixel(100);
        }
        addView(this.f70380h, layoutParams);
        this.f70378f.addView(this, 0, new RelativeLayout.LayoutParams(-1, -1));
    }
}
