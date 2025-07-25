package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.tools.SameTool;
import java.util.List;

/* loaded from: classes6.dex */
public class ToolBar extends LinearLayout {
    public static final String BACKWARD = "backward";
    public static final String EXITS = "exits";
    public static final String FORWARD = "forward";
    public static final String OPEN_BY_BROWSER = "open_by_browser";
    public static final String REFRESH = "refresh";
    public String title;
    public TextView titleView;

    /* renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar$a */
    /* loaded from: classes6.dex */
    public static class C22223a {

        /* renamed from: b */
        public static int f57685b = 40;

        /* renamed from: c */
        public static int f57686c = 10;

        /* renamed from: a */
        public int f57687a;
    }

    /* renamed from: com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar$b */
    /* loaded from: classes6.dex */
    public static class C22224b {

        /* renamed from: a */
        public String f57688a;

        /* renamed from: b */
        public String f57689b;

        /* renamed from: c */
        public boolean f57690c = true;

        /* renamed from: d */
        public View.OnClickListener f57691d;

        public C22224b(String str) {
            this.f57688a = str;
        }
    }

    public ToolBar(Context context) {
        super(context);
        m51130a();
    }

    /* renamed from: a */
    private void m51129a(C22223a c22223a, List<C22224b> list) {
        setOrientation(0);
        try {
            int m51772a = SameTool.m51772a(getContext(), 10.0f);
            setPadding(0, m51772a, SameTool.m51772a(getContext(), 20.0f), m51772a);
        } catch (Exception unused) {
        }
        try {
            for (C22224b c22224b : list) {
                ImageView imageView = (ImageView) m51127b();
                imageView.setTag(c22224b.f57688a);
                imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(c22224b.f57689b, "drawable", MBSDKContext.m52746m().m52783g())));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C22223a.f57685b, -1);
                layoutParams.setMargins(32, 0, 32, 0);
                imageView.setLayoutParams(layoutParams);
                imageView.setOnClickListener(c22224b.f57691d);
                if (!c22224b.f57690c) {
                    imageView.setVisibility(8);
                }
                addView(imageView);
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: b */
    private View m51127b() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        imageView.setLayoutParams(layoutParams);
        imageView.setClickable(true);
        return imageView;
    }

    public View getItem(String str) {
        return findViewWithTag(str);
    }

    public void hideTitle() {
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText("");
        }
    }

    public void setButtonIcon(String str, String str2) {
        ((ImageView) findViewWithTag(str)).setImageDrawable(getResources().getDrawable(getResources().getIdentifier(str2, "drawable", MBSDKContext.m52746m().m52783g())));
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setOnClickListener(onClickListener);
        }
    }

    public void setTitle(String str, int i) {
        this.title = str;
        if (this.titleView == null) {
            TextView textView = new TextView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            textView.setLayoutParams(layoutParams);
            textView.setClickable(true);
            this.titleView = textView;
            textView.setPadding(64, 0, 10, 0);
            this.titleView.setTextColor(i);
            addView(this.titleView, 0);
        }
        this.titleView.setText(str);
    }

    public void showTitle() {
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText(this.title);
        }
    }

    public ToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m51130a();
    }

    public ToolBar(Context context, List<C22224b> list) {
        super(context);
        m51128a(list);
    }

    public ToolBar(Context context, AttributeSet attributeSet, List<C22224b> list) {
        super(context, attributeSet);
        m51128a(list);
    }

    public ToolBar(Context context, C22223a c22223a, List<C22224b> list) {
        super(context);
        m51129a(c22223a, list);
    }

    public ToolBar(Context context, AttributeSet attributeSet, C22223a c22223a, List<C22224b> list) {
        super(context, attributeSet);
        m51129a(c22223a, list);
    }

    public void setTitle(String str) {
        setTitle(str, ViewCompat.MEASURED_STATE_MASK);
    }

    /* renamed from: a */
    private void m51128a(List<C22224b> list) {
        setOrientation(0);
        try {
            int m51772a = SameTool.m51772a(getContext(), 10.0f);
            setPadding(0, m51772a, 0, m51772a);
        } catch (Exception unused) {
        }
        try {
            for (C22224b c22224b : list) {
                ImageView imageView = (ImageView) m51127b();
                imageView.setTag(c22224b.f57688a);
                imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(c22224b.f57689b, "drawable", MBSDKContext.m52746m().m52783g())));
                imageView.setOnClickListener(c22224b.f57691d);
                if (!c22224b.f57690c) {
                    imageView.setVisibility(8);
                }
                addView(imageView);
            }
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    private void m51130a() {
        setOrientation(0);
        try {
            int m51772a = SameTool.m51772a(getContext(), 10.0f);
            setPadding(0, m51772a, 0, m51772a);
        } catch (Exception unused) {
        }
        try {
            ImageView imageView = (ImageView) m51127b();
            imageView.setTag(BACKWARD);
            imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_backward", "drawable", MBSDKContext.m52746m().m52783g())));
            addView(imageView);
        } catch (Exception unused2) {
        }
        try {
            ImageView imageView2 = (ImageView) m51127b();
            imageView2.setTag(FORWARD);
            imageView2.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_forward", "drawable", MBSDKContext.m52746m().m52783g())));
            addView(imageView2);
        } catch (Exception unused3) {
        }
        try {
            ImageView imageView3 = (ImageView) m51127b();
            imageView3.setTag(REFRESH);
            imageView3.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_refresh", "drawable", MBSDKContext.m52746m().m52783g())));
            addView(imageView3);
        } catch (Exception unused4) {
        }
        try {
            ImageView imageView4 = (ImageView) m51127b();
            imageView4.setTag(OPEN_BY_BROWSER);
            imageView4.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_browser", "drawable", MBSDKContext.m52746m().m52783g())));
            addView(imageView4);
        } catch (Exception unused5) {
        }
        try {
            ImageView imageView5 = (ImageView) m51127b();
            imageView5.setTag(EXITS);
            imageView5.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_exits", "drawable", MBSDKContext.m52746m().m52783g())));
            addView(imageView5);
        } catch (Exception unused6) {
        }
    }
}
