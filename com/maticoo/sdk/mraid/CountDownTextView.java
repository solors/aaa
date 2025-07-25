package com.maticoo.sdk.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import java.math.BigDecimal;

@SuppressLint({"AppCompatCustomView"})
/* loaded from: classes6.dex */
public class CountDownTextView extends TextView {
    private static final String TAG = "CountDownTextView";
    final Rect bounds;
    private int circleColor;
    private int count;
    private ColorStateList inCircleColors;
    private int listenerWhat;
    private RectF mArcRect;
    private OnCountdownProgressListener mCountdownProgressListener;
    private Paint mPaint;
    private ProgressType mProgressType;
    private int outLineColor;
    private int outLineWidth;
    private int percent;
    private int progress;
    private final Runnable progressChangeTask;
    private int progressLineColor;
    private int progressLineWidth;
    private long timeMillis;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.maticoo.sdk.mraid.CountDownTextView$2 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C216792 {
        static final /* synthetic */ int[] $SwitchMap$com$maticoo$sdk$mraid$CountDownTextView$ProgressType;

        static {
            int[] iArr = new int[ProgressType.values().length];
            $SwitchMap$com$maticoo$sdk$mraid$CountDownTextView$ProgressType = iArr;
            try {
                iArr[ProgressType.COUNT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$maticoo$sdk$mraid$CountDownTextView$ProgressType[ProgressType.COUNT_BACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes6.dex */
    public interface OnCountdownProgressListener {
        void onFinish();

        void onProgress(int i, int i2);
    }

    /* loaded from: classes6.dex */
    public enum ProgressType {
        COUNT,
        COUNT_BACK
    }

    public CountDownTextView(Context context) {
        super(context);
        this.outLineColor = 0;
        this.outLineWidth = 2;
        this.inCircleColors = ColorStateList.valueOf(0);
        this.progressLineColor = -12303292;
        this.progressLineWidth = 8;
        this.mPaint = new Paint();
        this.mArcRect = new RectF();
        this.progress = 100;
        this.mProgressType = ProgressType.COUNT_BACK;
        this.timeMillis = 3000L;
        this.bounds = new Rect();
        this.listenerWhat = 0;
        this.progressChangeTask = new Runnable() { // from class: com.maticoo.sdk.mraid.CountDownTextView.1
            @Override // java.lang.Runnable
            public void run() {
                String valueOf;
                CountDownTextView.this.removeCallbacks(this);
                int i = C216792.$SwitchMap$com$maticoo$sdk$mraid$CountDownTextView$ProgressType[CountDownTextView.this.mProgressType.ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        CountDownTextView.access$120(CountDownTextView.this, 1);
                    }
                } else {
                    CountDownTextView.access$112(CountDownTextView.this, 1);
                }
                if (CountDownTextView.this.progress >= 0 && CountDownTextView.this.progress <= 100) {
                    if (CountDownTextView.this.timeMillis == 0) {
                        CountDownTextView.this.progress = 100;
                    }
                    if (CountDownTextView.this.percent != 0 && CountDownTextView.this.progress % CountDownTextView.this.percent == 0) {
                        int intValue = CountDownTextView.this.count - new BigDecimal(Double.toString((CountDownTextView.this.count * CountDownTextView.this.progress) / 100.0d)).setScale(0, 4).intValue();
                        CountDownTextView countDownTextView = CountDownTextView.this;
                        if (intValue == 0) {
                            valueOf = "";
                        } else {
                            valueOf = String.valueOf(intValue);
                        }
                        countDownTextView.setText(valueOf);
                    }
                    if (CountDownTextView.this.mCountdownProgressListener != null) {
                        CountDownTextView.this.mCountdownProgressListener.onProgress(CountDownTextView.this.listenerWhat, CountDownTextView.this.progress);
                        if (CountDownTextView.this.progress == 100) {
                            CountDownTextView.this.setText("");
                            CountDownTextView.this.mCountdownProgressListener.onFinish();
                        }
                    }
                    CountDownTextView.this.invalidate();
                    CountDownTextView countDownTextView2 = CountDownTextView.this;
                    countDownTextView2.postDelayed(countDownTextView2.progressChangeTask, CountDownTextView.this.timeMillis / 100);
                    return;
                }
                CountDownTextView countDownTextView3 = CountDownTextView.this;
                countDownTextView3.progress = countDownTextView3.validateProgress(countDownTextView3.progress);
            }
        };
        initialize();
    }

    static /* synthetic */ int access$112(CountDownTextView countDownTextView, int i) {
        int i2 = countDownTextView.progress + i;
        countDownTextView.progress = i2;
        return i2;
    }

    static /* synthetic */ int access$120(CountDownTextView countDownTextView, int i) {
        int i2 = countDownTextView.progress - i;
        countDownTextView.progress = i2;
        return i2;
    }

    private void initialize() {
        this.mPaint.setAntiAlias(true);
        ColorStateList valueOf = ColorStateList.valueOf(0);
        this.inCircleColors = valueOf;
        this.circleColor = valueOf.getColorForState(getDrawableState(), 0);
    }

    private void resetProgress() {
        int i = C216792.$SwitchMap$com$maticoo$sdk$mraid$CountDownTextView$ProgressType[this.mProgressType.ordinal()];
        if (i != 1) {
            if (i == 2) {
                this.progress = 100;
                return;
            }
            return;
        }
        this.progress = 0;
    }

    private void validateCircleColor() {
        int colorForState = this.inCircleColors.getColorForState(getDrawableState(), 0);
        if (this.circleColor != colorForState) {
            this.circleColor = colorForState;
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int validateProgress(int i) {
        if (i > 100) {
            return 100;
        }
        if (i < 0) {
            return 0;
        }
        return i;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        validateCircleColor();
    }

    public int getProgress() {
        return this.progress;
    }

    public ProgressType getProgressType() {
        return this.mProgressType;
    }

    public long getTimeMillis() {
        return this.timeMillis;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int height;
        getDrawingRect(this.bounds);
        if (this.bounds.height() > this.bounds.width()) {
            height = this.bounds.width();
        } else {
            height = this.bounds.height();
        }
        float f = height / 2;
        int colorForState = this.inCircleColors.getColorForState(getDrawableState(), 0);
        this.mPaint.setStyle(Paint.Style.FILL);
        this.mPaint.setColor(colorForState);
        canvas.drawCircle(this.bounds.centerX(), this.bounds.centerY(), f - this.outLineWidth, this.mPaint);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(this.outLineWidth);
        this.mPaint.setColor(this.outLineColor);
        canvas.drawCircle(this.bounds.centerX(), this.bounds.centerY(), f - (this.outLineWidth / 2), this.mPaint);
        TextPaint paint = getPaint();
        paint.setColor(getCurrentTextColor());
        paint.setAntiAlias(true);
        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(getText().toString(), this.bounds.centerX(), this.bounds.centerY() - ((paint.descent() + paint.ascent()) / 2.0f), paint);
        this.mPaint.setColor(this.progressLineColor);
        this.mPaint.setStyle(Paint.Style.STROKE);
        this.mPaint.setStrokeWidth(this.progressLineWidth);
        this.mPaint.setStrokeCap(Paint.Cap.ROUND);
        int i = this.progressLineWidth + this.outLineWidth;
        RectF rectF = this.mArcRect;
        Rect rect = this.bounds;
        int i2 = i / 2;
        rectF.set(rect.left + i2, rect.top + i2, rect.right - i2, rect.bottom - i2);
        canvas.drawArc(this.mArcRect, 0.0f, (this.progress * 360) / 100, false, this.mPaint);
    }

    public void reStart() {
        resetProgress();
        start();
    }

    public void setCountdownProgressListener(int i, OnCountdownProgressListener onCountdownProgressListener) {
        this.listenerWhat = i;
        this.mCountdownProgressListener = onCountdownProgressListener;
    }

    public void setInCircleColor(@ColorInt int i) {
        this.inCircleColors = ColorStateList.valueOf(i);
        invalidate();
    }

    public void setOutLineColor(@ColorInt int i) {
        this.outLineColor = i;
        invalidate();
    }

    public void setOutLineWidth(@ColorInt int i) {
        this.outLineWidth = i;
        invalidate();
    }

    public void setProgress(int i) {
        this.progress = validateProgress(i);
        invalidate();
    }

    public void setProgressColor(@ColorInt int i) {
        this.progressLineColor = i;
        invalidate();
    }

    public void setProgressLineWidth(int i) {
        this.progressLineWidth = i;
        invalidate();
    }

    public void setProgressType(ProgressType progressType) {
        this.mProgressType = progressType;
        resetProgress();
        invalidate();
    }

    public void setTimeSeconds(int i) {
        int i2;
        this.timeMillis = i * 1000;
        this.count = i;
        if (i != 0) {
            i2 = 100 / i;
        } else {
            i2 = 0;
        }
        this.percent = i2;
        invalidate();
    }

    public void start() {
        stop();
        post(this.progressChangeTask);
    }

    public void stop() {
        removeCallbacks(this.progressChangeTask);
    }
}
