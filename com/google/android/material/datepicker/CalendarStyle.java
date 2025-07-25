package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.NonNull;
import com.google.android.material.C16310R;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.resources.MaterialResources;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class CalendarStyle {
    @NonNull

    /* renamed from: a */
    final CalendarItemStyle f37284a;
    @NonNull

    /* renamed from: b */
    final CalendarItemStyle f37285b;
    @NonNull

    /* renamed from: c */
    final CalendarItemStyle f37286c;
    @NonNull

    /* renamed from: d */
    final CalendarItemStyle f37287d;
    @NonNull

    /* renamed from: e */
    final CalendarItemStyle f37288e;
    @NonNull

    /* renamed from: f */
    final CalendarItemStyle f37289f;
    @NonNull

    /* renamed from: g */
    final CalendarItemStyle f37290g;
    @NonNull

    /* renamed from: h */
    final Paint f37291h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CalendarStyle(@NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context, C16310R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), C16310R.styleable.MaterialCalendar);
        this.f37284a = CalendarItemStyle.m71619a(context, obtainStyledAttributes.getResourceId(C16310R.styleable.MaterialCalendar_dayStyle, 0));
        this.f37290g = CalendarItemStyle.m71619a(context, obtainStyledAttributes.getResourceId(C16310R.styleable.MaterialCalendar_dayInvalidStyle, 0));
        this.f37285b = CalendarItemStyle.m71619a(context, obtainStyledAttributes.getResourceId(C16310R.styleable.MaterialCalendar_daySelectedStyle, 0));
        this.f37286c = CalendarItemStyle.m71619a(context, obtainStyledAttributes.getResourceId(C16310R.styleable.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList colorStateList = MaterialResources.getColorStateList(context, obtainStyledAttributes, C16310R.styleable.MaterialCalendar_rangeFillColor);
        this.f37287d = CalendarItemStyle.m71619a(context, obtainStyledAttributes.getResourceId(C16310R.styleable.MaterialCalendar_yearStyle, 0));
        this.f37288e = CalendarItemStyle.m71619a(context, obtainStyledAttributes.getResourceId(C16310R.styleable.MaterialCalendar_yearSelectedStyle, 0));
        this.f37289f = CalendarItemStyle.m71619a(context, obtainStyledAttributes.getResourceId(C16310R.styleable.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f37291h = paint;
        paint.setColor(colorStateList.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
