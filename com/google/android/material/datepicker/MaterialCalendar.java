package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.InterfaceC0152Px;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.C16310R;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes5.dex */
public final class MaterialCalendar<S> extends PickerFragment<S> {
    @VisibleForTesting

    /* renamed from: n */
    static final Object f37308n = "MONTHS_VIEW_GROUP_TAG";
    @VisibleForTesting

    /* renamed from: o */
    static final Object f37309o = "NAVIGATION_PREV_TAG";
    @VisibleForTesting

    /* renamed from: p */
    static final Object f37310p = "NAVIGATION_NEXT_TAG";
    @VisibleForTesting

    /* renamed from: q */
    static final Object f37311q = "SELECTOR_TOGGLE_TAG";
    @StyleRes

    /* renamed from: c */
    private int f37312c;
    @Nullable

    /* renamed from: d */
    private DateSelector<S> f37313d;
    @Nullable

    /* renamed from: f */
    private CalendarConstraints f37314f;
    @Nullable

    /* renamed from: g */
    private Month f37315g;

    /* renamed from: h */
    private CalendarSelector f37316h;

    /* renamed from: i */
    private CalendarStyle f37317i;

    /* renamed from: j */
    private RecyclerView f37318j;

    /* renamed from: k */
    private RecyclerView f37319k;

    /* renamed from: l */
    private View f37320l;

    /* renamed from: m */
    private View f37321m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public enum CalendarSelector {
        DAY,
        YEAR
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public interface OnDayClickListener {
        void onDayClick(long j);
    }

    /* renamed from: E */
    private void m71587E(@NonNull View view, @NonNull final MonthsPagerAdapter monthsPagerAdapter) {
        final MaterialButton materialButton = (MaterialButton) view.findViewById(C16310R.C16313id.month_navigation_fragment_toggle);
        materialButton.setTag(f37311q);
        ViewCompat.setAccessibilityDelegate(materialButton, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.5
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view2, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                String string;
                super.onInitializeAccessibilityNodeInfo(view2, accessibilityNodeInfoCompat);
                if (MaterialCalendar.this.f37321m.getVisibility() == 0) {
                    string = MaterialCalendar.this.getString(C16310R.C16316string.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = MaterialCalendar.this.getString(C16310R.C16316string.mtrl_picker_toggle_to_day_selection);
                }
                accessibilityNodeInfoCompat.setHintText(string);
            }
        });
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C16310R.C16313id.month_navigation_previous);
        materialButton2.setTag(f37309o);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C16310R.C16313id.month_navigation_next);
        materialButton3.setTag(f37310p);
        this.f37320l = view.findViewById(C16310R.C16313id.mtrl_calendar_year_selector_frame);
        this.f37321m = view.findViewById(C16310R.C16313id.mtrl_calendar_day_selector_frame);
        m71577O(CalendarSelector.DAY);
        materialButton.setText(this.f37315g.m71539j());
        this.f37319k.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.6
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
                if (i == 0) {
                    recyclerView.announceForAccessibility(materialButton.getText());
                }
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
                int findLastVisibleItemPosition;
                if (i < 0) {
                    findLastVisibleItemPosition = MaterialCalendar.this.m71580L().findFirstVisibleItemPosition();
                } else {
                    findLastVisibleItemPosition = MaterialCalendar.this.m71580L().findLastVisibleItemPosition();
                }
                MaterialCalendar.this.f37315g = monthsPagerAdapter.m71523b(findLastVisibleItemPosition);
                materialButton.setText(monthsPagerAdapter.m71522c(findLastVisibleItemPosition));
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.7
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                MaterialCalendar.this.m71576P();
            }
        });
        materialButton3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int findFirstVisibleItemPosition = MaterialCalendar.this.m71580L().findFirstVisibleItemPosition() + 1;
                if (findFirstVisibleItemPosition < MaterialCalendar.this.f37319k.getAdapter().getItemCount()) {
                    MaterialCalendar.this.m71578N(monthsPagerAdapter.m71523b(findFirstVisibleItemPosition));
                }
            }
        });
        materialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                int findLastVisibleItemPosition = MaterialCalendar.this.m71580L().findLastVisibleItemPosition() - 1;
                if (findLastVisibleItemPosition >= 0) {
                    MaterialCalendar.this.m71578N(monthsPagerAdapter.m71523b(findLastVisibleItemPosition));
                }
            }
        });
    }

    @NonNull
    /* renamed from: F */
    private RecyclerView.ItemDecoration m71586F() {
        return new RecyclerView.ItemDecoration() { // from class: com.google.android.material.datepicker.MaterialCalendar.4

            /* renamed from: a */
            private final Calendar f37328a = UtcDates.m71491l();

            /* renamed from: b */
            private final Calendar f37329b = UtcDates.m71491l();

            @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
            public void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
                int i;
                int width;
                if ((recyclerView.getAdapter() instanceof YearGridAdapter) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    YearGridAdapter yearGridAdapter = (YearGridAdapter) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    for (Pair<Long, Long> pair : MaterialCalendar.this.f37313d.getSelectedRanges()) {
                        Long l = pair.first;
                        if (l != null && pair.second != null) {
                            this.f37328a.setTimeInMillis(l.longValue());
                            this.f37329b.setTimeInMillis(pair.second.longValue());
                            int m71485c = yearGridAdapter.m71485c(this.f37328a.get(1));
                            int m71485c2 = yearGridAdapter.m71485c(this.f37329b.get(1));
                            View findViewByPosition = gridLayoutManager.findViewByPosition(m71485c);
                            View findViewByPosition2 = gridLayoutManager.findViewByPosition(m71485c2);
                            int spanCount = m71485c / gridLayoutManager.getSpanCount();
                            int spanCount2 = m71485c2 / gridLayoutManager.getSpanCount();
                            for (int i2 = spanCount; i2 <= spanCount2; i2++) {
                                View findViewByPosition3 = gridLayoutManager.findViewByPosition(gridLayoutManager.getSpanCount() * i2);
                                if (findViewByPosition3 != null) {
                                    int top = findViewByPosition3.getTop() + MaterialCalendar.this.f37317i.f37287d.m71617c();
                                    int bottom = findViewByPosition3.getBottom() - MaterialCalendar.this.f37317i.f37287d.m71618b();
                                    if (i2 == spanCount) {
                                        i = findViewByPosition.getLeft() + (findViewByPosition.getWidth() / 2);
                                    } else {
                                        i = 0;
                                    }
                                    if (i2 == spanCount2) {
                                        width = findViewByPosition2.getLeft() + (findViewByPosition2.getWidth() / 2);
                                    } else {
                                        width = recyclerView.getWidth();
                                    }
                                    canvas.drawRect(i, top, width, bottom, MaterialCalendar.this.f37317i.f37291h);
                                }
                            }
                        }
                    }
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @InterfaceC0152Px
    /* renamed from: J */
    public static int m71582J(@NonNull Context context) {
        return context.getResources().getDimensionPixelSize(C16310R.dimen.mtrl_calendar_day_height);
    }

    /* renamed from: K */
    private static int m71581K(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C16310R.dimen.mtrl_calendar_navigation_height) + resources.getDimensionPixelOffset(C16310R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelOffset(C16310R.dimen.mtrl_calendar_navigation_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C16310R.dimen.mtrl_calendar_days_of_week_height);
        int i = MonthAdapter.f37402h;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C16310R.dimen.mtrl_calendar_day_height) * i) + ((i - 1) * resources.getDimensionPixelOffset(C16310R.dimen.mtrl_calendar_month_vertical_padding)) + resources.getDimensionPixelOffset(C16310R.dimen.mtrl_calendar_bottom_padding);
    }

    /* renamed from: M */
    private void m71579M(final int i) {
        this.f37319k.post(new Runnable() { // from class: com.google.android.material.datepicker.MaterialCalendar.10
            @Override // java.lang.Runnable
            public void run() {
                MaterialCalendar.this.f37319k.smoothScrollToPosition(i);
            }
        });
    }

    @NonNull
    public static <T> MaterialCalendar<T> newInstance(@NonNull DateSelector<T> dateSelector, @StyleRes int i, @NonNull CalendarConstraints calendarConstraints) {
        MaterialCalendar<T> materialCalendar = new MaterialCalendar<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        bundle.putParcelable("CURRENT_MONTH_KEY", calendarConstraints.m71624l());
        materialCalendar.setArguments(bundle);
        return materialCalendar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: G */
    public CalendarConstraints m71585G() {
        return this.f37314f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: H */
    public CalendarStyle m71584H() {
        return this.f37317i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: I */
    public Month m71583I() {
        return this.f37315g;
    }

    @NonNull
    /* renamed from: L */
    LinearLayoutManager m71580L() {
        return (LinearLayoutManager) this.f37319k.getLayoutManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: N */
    public void m71578N(Month month) {
        boolean z;
        MonthsPagerAdapter monthsPagerAdapter = (MonthsPagerAdapter) this.f37319k.getAdapter();
        int m71521d = monthsPagerAdapter.m71521d(month);
        int m71521d2 = m71521d - monthsPagerAdapter.m71521d(this.f37315g);
        boolean z2 = true;
        if (Math.abs(m71521d2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (m71521d2 <= 0) {
            z2 = false;
        }
        this.f37315g = month;
        if (z && z2) {
            this.f37319k.scrollToPosition(m71521d - 3);
            m71579M(m71521d);
        } else if (z) {
            this.f37319k.scrollToPosition(m71521d + 3);
            m71579M(m71521d);
        } else {
            m71579M(m71521d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O */
    public void m71577O(CalendarSelector calendarSelector) {
        this.f37316h = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.f37318j.getLayoutManager().scrollToPosition(((YearGridAdapter) this.f37318j.getAdapter()).m71485c(this.f37315g.f37397d));
            this.f37320l.setVisibility(0);
            this.f37321m.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.f37320l.setVisibility(8);
            this.f37321m.setVisibility(0);
            m71578N(this.f37315g);
        }
    }

    /* renamed from: P */
    void m71576P() {
        CalendarSelector calendarSelector = this.f37316h;
        CalendarSelector calendarSelector2 = CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            m71577O(CalendarSelector.DAY);
        } else if (calendarSelector == CalendarSelector.DAY) {
            m71577O(calendarSelector2);
        }
    }

    @Override // com.google.android.material.datepicker.PickerFragment
    public boolean addOnSelectionChangedListener(@NonNull OnSelectionChangedListener<S> onSelectionChangedListener) {
        return super.addOnSelectionChangedListener(onSelectionChangedListener);
    }

    @Nullable
    public DateSelector<S> getDateSelector() {
        return this.f37313d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f37312c = bundle.getInt("THEME_RES_ID_KEY");
        this.f37313d = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f37314f = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f37315g = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        final int i2;
        DaysOfWeekAdapter daysOfWeekAdapter;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f37312c);
        this.f37317i = new CalendarStyle(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month m71623m = this.f37314f.m71623m();
        if (MaterialDatePicker.m71559J(contextThemeWrapper)) {
            i = C16310R.C16315layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = C16310R.C16315layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        inflate.setMinimumHeight(m71581K(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(C16310R.C16313id.mtrl_calendar_days_of_week);
        ViewCompat.setAccessibilityDelegate(gridView, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendar.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
        int m71626j = this.f37314f.m71626j();
        if (m71626j > 0) {
            daysOfWeekAdapter = new DaysOfWeekAdapter(m71626j);
        } else {
            daysOfWeekAdapter = new DaysOfWeekAdapter();
        }
        gridView.setAdapter((ListAdapter) daysOfWeekAdapter);
        gridView.setNumColumns(m71623m.f37398f);
        gridView.setEnabled(false);
        this.f37319k = (RecyclerView) inflate.findViewById(C16310R.C16313id.mtrl_calendar_months);
        this.f37319k.setLayoutManager(new SmoothCalendarLayoutManager(getContext(), i2, false) { // from class: com.google.android.material.datepicker.MaterialCalendar.2
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public void calculateExtraLayoutSpace(@NonNull RecyclerView.State state, @NonNull int[] iArr) {
                if (i2 == 0) {
                    iArr[0] = MaterialCalendar.this.f37319k.getWidth();
                    iArr[1] = MaterialCalendar.this.f37319k.getWidth();
                    return;
                }
                iArr[0] = MaterialCalendar.this.f37319k.getHeight();
                iArr[1] = MaterialCalendar.this.f37319k.getHeight();
            }
        });
        this.f37319k.setTag(f37308n);
        MonthsPagerAdapter monthsPagerAdapter = new MonthsPagerAdapter(contextThemeWrapper, this.f37313d, this.f37314f, new OnDayClickListener() { // from class: com.google.android.material.datepicker.MaterialCalendar.3
            @Override // com.google.android.material.datepicker.MaterialCalendar.OnDayClickListener
            public void onDayClick(long j) {
                if (MaterialCalendar.this.f37314f.getDateValidator().isValid(j)) {
                    MaterialCalendar.this.f37313d.select(j);
                    Iterator<OnSelectionChangedListener<S>> it = MaterialCalendar.this.f37417b.iterator();
                    while (it.hasNext()) {
                        it.next().onSelectionChanged((S) MaterialCalendar.this.f37313d.getSelection());
                    }
                    MaterialCalendar.this.f37319k.getAdapter().notifyDataSetChanged();
                    if (MaterialCalendar.this.f37318j != null) {
                        MaterialCalendar.this.f37318j.getAdapter().notifyDataSetChanged();
                    }
                }
            }
        });
        this.f37319k.setAdapter(monthsPagerAdapter);
        int integer = contextThemeWrapper.getResources().getInteger(C16310R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C16310R.C16313id.mtrl_calendar_year_selector_frame);
        this.f37318j = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f37318j.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f37318j.setAdapter(new YearGridAdapter(this));
            this.f37318j.addItemDecoration(m71586F());
        }
        if (inflate.findViewById(C16310R.C16313id.month_navigation_fragment_toggle) != null) {
            m71587E(inflate, monthsPagerAdapter);
        }
        if (!MaterialDatePicker.m71559J(contextThemeWrapper)) {
            new PagerSnapHelper().attachToRecyclerView(this.f37319k);
        }
        this.f37319k.scrollToPosition(monthsPagerAdapter.m71521d(this.f37315g));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f37312c);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f37313d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f37314f);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f37315g);
    }
}
