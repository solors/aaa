package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.common.utils.C43822e;
import sg.bigo.ads.common.utils.C43836q;

/* loaded from: classes10.dex */
public class MixtureTextView extends RelativeLayout {

    /* renamed from: s */
    private static int[] f114733s = {16842901, 16842904, 16843087};

    /* renamed from: a */
    private Layout f114734a;

    /* renamed from: b */
    private int f114735b;

    /* renamed from: c */
    private int f114736c;

    /* renamed from: d */
    private int f114737d;

    /* renamed from: e */
    private CharSequence f114738e;

    /* renamed from: f */
    private TextPaint f114739f;

    /* renamed from: g */
    private List<List<Rect>> f114740g;

    /* renamed from: h */
    private List<Integer> f114741h;

    /* renamed from: i */
    private List<Layout> f114742i;

    /* renamed from: j */
    private List<Integer> f114743j;

    /* renamed from: k */
    private HashSet<Integer> f114744k;

    /* renamed from: l */
    private int f114745l;

    /* renamed from: m */
    private int f114746m;

    /* renamed from: n */
    private int f114747n;

    /* renamed from: o */
    private int f114748o;

    /* renamed from: p */
    private boolean f114749p;

    /* renamed from: q */
    private boolean f114750q;

    /* renamed from: r */
    private int f114751r;

    /* renamed from: t */
    private Map<Integer, Point> f114752t;

    /* renamed from: u */
    private InterfaceC43852a f114753u;

    /* renamed from: v */
    private boolean f114754v;

    /* renamed from: sg.bigo.ads.common.view.MixtureTextView$a */
    /* loaded from: classes10.dex */
    public interface InterfaceC43852a {
        /* renamed from: a */
        void mo4771a(UnderlineSpan underlineSpan);
    }

    public MixtureTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f114734a = null;
        this.f114736c = -9601400;
        this.f114740g = new ArrayList();
        this.f114741h = null;
        this.f114742i = new ArrayList();
        this.f114743j = new ArrayList();
        this.f114744k = new HashSet<>();
        this.f114752t = new HashMap();
        this.f114754v = true;
        this.f114737d = C43822e.m4904b(getContext(), 14);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f114733s);
        this.f114737d = obtainStyledAttributes.getDimensionPixelSize(0, this.f114737d);
        this.f114736c = obtainStyledAttributes.getColor(1, this.f114736c);
        this.f114738e = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint();
        this.f114739f = textPaint;
        textPaint.setDither(true);
        this.f114739f.setAntiAlias(true);
        this.f114739f.setColor(this.f114736c);
        if (!TextUtils.isEmpty(this.f114738e)) {
            this.f114750q = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
        r1.setSpan(r3, r4, r5, 33);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.CharSequence m4773a(java.lang.CharSequence r8, int r9, int r10) {
        /*
            boolean r0 = sg.bigo.ads.common.utils.C43836q.m4837a(r8)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8 instanceof android.text.SpannableString
            if (r0 == 0) goto L48
            android.text.SpannableString r8 = (android.text.SpannableString) r8
            java.lang.String r0 = android.text.TextUtils.substring(r8, r9, r10)
            android.text.SpannableString r1 = new android.text.SpannableString
            r1.<init>(r0)
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.Object[] r10 = r8.getSpans(r9, r10, r0)
            int r0 = r10.length
            r2 = 1
            int r0 = r0 - r2
        L20:
            if (r0 < 0) goto L47
            r3 = r10[r0]
            int r4 = r8.getSpanStart(r3)
            int r5 = r8.getSpanEnd(r3)
            int r4 = r4 - r9
            int r5 = r5 - r9
            int r6 = r1.length()     // Catch: java.lang.Exception -> L44
            r7 = 0
            if (r5 < r4) goto L3d
            if (r4 > r6) goto L3d
            if (r5 <= r6) goto L3a
            goto L3d
        L3a:
            if (r4 < 0) goto L3d
            r7 = r2
        L3d:
            if (r7 == 0) goto L44
            r6 = 33
            r1.setSpan(r3, r4, r5, r6)     // Catch: java.lang.Exception -> L44
        L44:
            int r0 = r0 + (-1)
            goto L20
        L47:
            return r1
        L48:
            boolean r0 = r8 instanceof java.lang.String
            if (r0 == 0) goto L53
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r8 = r8.substring(r9, r10)
            return r8
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.MixtureTextView.m4773a(java.lang.CharSequence, int, int):java.lang.CharSequence");
    }

    /* renamed from: b */
    private static void m4772b(Rect rect, List<Rect> list, int i, int i2, int i3) {
        if (rect.left > i3) {
            list.add(new Rect(i3, i, rect.left, i2));
        }
    }

    private void getAllYCors() {
        int i;
        int i2 = this.f114735b;
        HashSet<Integer> hashSet = this.f114744k;
        hashSet.clear();
        this.f114752t.clear();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                childAt.getTop();
                int top = (((childAt.getTop() - getPaddingTop()) / i2) * i2) + getPaddingTop();
                hashSet.add(Integer.valueOf(top));
                int bottom = childAt.getBottom() - getPaddingTop();
                if (bottom % i2 != 0) {
                    bottom = ((bottom / i2) + 1) * i2;
                }
                int paddingTop = bottom + getPaddingTop();
                hashSet.add(Integer.valueOf(paddingTop));
                this.f114752t.put(Integer.valueOf(i3), new Point(top, paddingTop));
            }
        }
        hashSet.add(Integer.valueOf(getPaddingTop()));
        if (this.f114747n == 1073741824) {
            i = getHeight();
        } else {
            i = Integer.MAX_VALUE;
        }
        hashSet.add(Integer.valueOf(i));
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.f114741h = arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.f114745l = getPaddingBottom() + getPaddingTop();
        int i = this.f114735b;
        List<List<Rect>> list = this.f114740g;
        List<Integer> list2 = this.f114741h;
        list.clear();
        if (list2 != null) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= list2.size() - 1) {
                    break;
                }
                int intValue = list2.get(i3).intValue();
                i3++;
                int intValue2 = list2.get(i3).intValue();
                ArrayList arrayList = new ArrayList();
                List<Rect> m4776a = m4776a(intValue, intValue2);
                int size = m4776a.size();
                if (size != 0) {
                    if (size != 1) {
                        m4772b(m4776a.get(i2), arrayList, intValue, intValue2, paddingLeft);
                        int i4 = i2;
                        for (int i5 = 1; i4 < m4776a.size() - i5; i5 = 1) {
                            Rect rect = m4776a.get(i4);
                            i4++;
                            Rect rect2 = m4776a.get(i4);
                            if (rect.right < rect2.left) {
                                arrayList.add(new Rect(rect.right, intValue, rect2.left, intValue2));
                            }
                        }
                        m4774a(m4776a.get(m4776a.size() - 1), arrayList, intValue, intValue2, width);
                    } else {
                        Rect rect3 = m4776a.get(i2);
                        m4772b(rect3, arrayList, intValue, intValue2, paddingLeft);
                        m4774a(rect3, arrayList, intValue, intValue2, width);
                    }
                } else {
                    arrayList.add(new Rect(paddingLeft, intValue, width, intValue2));
                }
                list.add(arrayList);
                i2 = 0;
            }
            ArrayList arrayList2 = new ArrayList(list);
            int size2 = list.size();
            int i6 = 0;
            int i7 = 0;
            while (i7 < size2) {
                List<Rect> list3 = list.get(i7);
                if (list3.size() > 1) {
                    int i8 = i6 + i7;
                    arrayList2.remove(list3);
                    i6--;
                    Rect rect4 = list3.get(0);
                    int height = rect4.height() / i;
                    this.f114745l -= ((list3.size() - 1) * height) * i;
                    int i9 = i8;
                    int i10 = 0;
                    while (i10 < height) {
                        int i11 = i9;
                        int i12 = 0;
                        while (i12 < list3.size()) {
                            int i13 = i * i10;
                            arrayList2.add(i11, Arrays.asList(new Rect(list3.get(i12).left, rect4.top + i13, list3.get(i12).right, rect4.top + i13 + i)));
                            i12++;
                            i11++;
                            size2 = size2;
                            list = list;
                            list3 = list3;
                            i6++;
                        }
                        i10++;
                        i9 = i11;
                        list = list;
                    }
                }
                i7++;
                size2 = size2;
                list = list;
            }
            this.f114740g = arrayList2;
        }
        if (m4775a(null)) {
            return;
        }
        m4775a(canvas);
        super.dispatchDraw(canvas);
    }

    public CharSequence getText() {
        return this.f114738e;
    }

    public int getTextColor() {
        return this.f114736c;
    }

    public int getTextSize() {
        return this.f114737d;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i;
        InterfaceC43852a interfaceC43852a;
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (motionEvent.getAction() == 0 && C43836q.m4827b(this.f114738e)) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (!this.f114742i.isEmpty() && !this.f114743j.isEmpty()) {
                int i2 = 0;
                i = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= this.f114742i.size()) {
                        break;
                    }
                    Layout layout = this.f114742i.get(i2);
                    int intValue = this.f114743j.get(i2).intValue();
                    if (layout != null) {
                        int lineForVertical = layout.getLineForVertical(y) + 1;
                        if (lineForVertical > intValue) {
                            i3 += intValue;
                            y -= this.f114735b * i3;
                            i += layout.getLineEnd(intValue - 1);
                        } else {
                            i += layout.getOffsetForHorizontal(Math.min(lineForVertical - 1, layout.getLineCount() - 1), x);
                            break;
                        }
                    }
                    i2++;
                }
            } else {
                i = 0;
            }
            if (i < this.f114738e.length()) {
                CharSequence charSequence = this.f114738e;
                if (charSequence instanceof SpannableString) {
                    UnderlineSpan[] underlineSpanArr = (UnderlineSpan[]) ((SpannableString) charSequence).getSpans(i, i, UnderlineSpan.class);
                    if (underlineSpanArr.length > 0 && (interfaceC43852a = this.f114753u) != null) {
                        interfaceC43852a.mo4771a(underlineSpanArr[0]);
                        return true;
                    }
                }
            }
        }
        return onInterceptTouchEvent;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f114754v) {
            this.f114747n = View.MeasureSpec.getMode(this.f114746m);
            this.f114754v = false;
            this.f114751r = getMeasuredHeight();
        }
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f114750q) {
            return;
        }
        getAllYCors();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (!this.f114750q) {
            super.onMeasure(i, i2);
            return;
        }
        this.f114746m = i2;
        this.f114739f.setTextSize(this.f114737d);
        StaticLayout staticLayout = new StaticLayout("测量行高", this.f114739f, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f114734a = staticLayout;
        this.f114735b = staticLayout.getLineBottom(0) - this.f114734a.getLineTop(0);
        if (this.f114749p) {
            super.onMeasure(i, this.f114748o);
        } else {
            super.onMeasure(i, i2);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setClickListener(InterfaceC43852a interfaceC43852a) {
        this.f114753u = interfaceC43852a;
    }

    public void setText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            this.f114750q = false;
            requestLayout();
            return;
        }
        this.f114750q = true;
        this.f114738e = charSequence;
        requestLayout();
        invalidate();
    }

    public void setTextColor(int i) {
        this.f114739f.setColor(i);
        this.f114736c = i;
        invalidate();
    }

    public void setTextSize(int i) {
        this.f114737d = i;
        this.f114739f.setTextSize(i);
        requestLayout();
        invalidate();
    }

    /* renamed from: a */
    private List<Rect> m4776a(int i, int i2) {
        ArrayList arrayList = new ArrayList();
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            Point point = this.f114752t.get(Integer.valueOf(i3));
            int i4 = point.x;
            int i5 = point.y;
            if (i4 <= i && i5 >= i2) {
                arrayList.add(new Rect(childAt.getLeft(), i, childAt.getRight(), i2));
            }
        }
        Collections.sort(arrayList, new Comparator<Rect>() { // from class: sg.bigo.ads.common.view.MixtureTextView.1
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Rect rect, Rect rect2) {
                if (rect.left > rect2.left) {
                    return 1;
                }
                return -1;
            }
        });
        if (arrayList.size() >= 2) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            Rect rect = (Rect) arrayList.get(0);
            Rect rect2 = (Rect) arrayList.get(1);
            for (int i6 = 1; i6 < arrayList.size(); i6++) {
                if (!Rect.intersects(rect, rect2)) {
                    if (arrayList2.size() - i6 < 2) {
                        break;
                    }
                    Rect rect3 = rect2;
                    rect2 = (Rect) arrayList.get(i6 + 1);
                    rect = rect3;
                } else {
                    int min = Math.min(rect.left, rect2.left);
                    int max = Math.max(rect.right, rect2.right);
                    arrayList2.remove(rect);
                    arrayList2.remove(rect2);
                    arrayList2.add(new Rect(min, i, max, i2));
                    if (arrayList2.size() < 2) {
                        break;
                    }
                    rect = (Rect) arrayList.get(0);
                    rect2 = (Rect) arrayList.get(1);
                }
            }
            return arrayList2;
        }
        return arrayList;
    }

    /* renamed from: a */
    private static void m4774a(Rect rect, List<Rect> list, int i, int i2, int i3) {
        if (rect.right < i3) {
            list.add(new Rect(rect.right, i, i3, i2));
        }
    }

    /* renamed from: a */
    private boolean m4775a(Canvas canvas) {
        boolean z = canvas == null;
        int i = this.f114735b;
        List<List<Rect>> list = this.f114740g;
        CharSequence charSequence = this.f114738e;
        int length = charSequence != null ? charSequence.length() : 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Rect rect = list.get(i4).get(0);
            int width = rect.width();
            int height = rect.height();
            CharSequence m4773a = m4773a(this.f114738e, i2, length);
            StaticLayout staticLayout = (C43836q.m4837a(m4773a) || this.f114739f == null) ? null : new StaticLayout(m4773a, this.f114739f, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.f114734a = staticLayout;
            if (staticLayout != null) {
                int min = Math.min(staticLayout.getLineCount(), height / i);
                if (!z) {
                    canvas.save();
                    canvas.translate(rect.left, rect.top);
                    canvas.clipRect(0, 0, rect.width(), this.f114734a.getLineBottom(min - 1) - this.f114734a.getLineTop(0));
                    this.f114734a.draw(canvas);
                    canvas.restore();
                }
                i2 += this.f114734a.getLineEnd(min - 1);
                if (canvas != null) {
                    this.f114742i.add(this.f114734a);
                    this.f114743j.add(Integer.valueOf(min));
                }
                i3 += min;
                if (i2 >= length) {
                    break;
                }
            }
        }
        if (z) {
            int i5 = this.f114745l + (i3 * i);
            this.f114745l = i5;
            if (i5 > this.f114751r) {
                int height2 = getHeight();
                int i6 = this.f114745l;
                if (height2 != i6 && this.f114747n != 1073741824) {
                    this.f114748o = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                    this.f114749p = true;
                    requestLayout();
                    return true;
                }
            }
        }
        return false;
    }
}
