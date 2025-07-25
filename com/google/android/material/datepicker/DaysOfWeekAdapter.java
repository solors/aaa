package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.C16310R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes5.dex */
class DaysOfWeekAdapter extends BaseAdapter {

    /* renamed from: f */
    private static final int f37304f;
    @NonNull

    /* renamed from: b */
    private final Calendar f37305b;

    /* renamed from: c */
    private final int f37306c;

    /* renamed from: d */
    private final int f37307d;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 26) {
            i = 4;
        } else {
            i = 1;
        }
        f37304f = i;
    }

    public DaysOfWeekAdapter() {
        Calendar m71491l = UtcDates.m71491l();
        this.f37305b = m71491l;
        this.f37306c = m71491l.getMaximum(7);
        this.f37307d = m71491l.getFirstDayOfWeek();
    }

    /* renamed from: a */
    private int m71592a(int i) {
        int i2 = i + this.f37307d;
        int i3 = this.f37306c;
        if (i2 > i3) {
            return i2 - i3;
        }
        return i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f37306c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @Nullable
    @SuppressLint({"WrongConstant"})
    public View getView(int i, @Nullable View view, @NonNull ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C16310R.C16315layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f37305b.set(7, m71592a(i));
        textView.setText(this.f37305b.getDisplayName(7, f37304f, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C16310R.C16316string.mtrl_picker_day_of_week_column_header), this.f37305b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    @Override // android.widget.Adapter
    @Nullable
    public Integer getItem(int i) {
        if (i >= this.f37306c) {
            return null;
        }
        return Integer.valueOf(m71592a(i));
    }

    public DaysOfWeekAdapter(int i) {
        Calendar m71491l = UtcDates.m71491l();
        this.f37305b = m71491l;
        this.f37306c = m71491l.getMaximum(7);
        this.f37307d = i;
    }
}
