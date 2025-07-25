package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.widget.RadioButton;
import sg.bigo.ads.common.utils.C43822e;

/* renamed from: sg.bigo.ads.common.view.b */
/* loaded from: classes10.dex */
public final class C43881b extends RadioButton {

    /* renamed from: a */
    private Paint f114906a;

    /* renamed from: b */
    private Path f114907b;

    /* renamed from: c */
    private RectF f114908c;

    public C43881b(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f114906a = paint;
        paint.setColor(-1);
        this.f114906a.setStyle(Paint.Style.STROKE);
        this.f114906a.setAntiAlias(true);
        this.f114906a.setStrokeJoin(Paint.Join.ROUND);
        this.f114906a.setStrokeCap(Paint.Cap.ROUND);
        this.f114907b = new Path();
        this.f114908c = new RectF();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        this.f114908c.set(0.0f, 0.0f, width, height);
        float m4906a = C43822e.m4906a(getContext(), 4);
        this.f114907b.addRoundRect(this.f114908c, m4906a, m4906a, Path.Direction.CW);
        canvas.clipPath(this.f114907b);
        super.onDraw(canvas);
        if (isChecked()) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
            this.f114906a.setColor(-16736769);
            this.f114906a.setStyle(Paint.Style.FILL);
            canvas.translate(width, height * 0.581f);
            canvas.rotate(51.0f);
            canvas.drawRect(this.f114908c, this.f114906a);
            int width2 = canvas.getWidth();
            int height2 = canvas.getHeight();
            this.f114906a.setStyle(Paint.Style.STROKE);
            this.f114906a.setStrokeWidth(C43822e.m4906a(getContext(), 1));
            this.f114906a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.XOR));
            canvas.save();
            float f = height2;
            canvas.translate(width2 * 0.018f, 0.378f * f);
            Path path = new Path();
            path.reset();
            path.moveTo(0.0f, 0.0f);
            path.lineTo((-0.094f) * f, 0.0f);
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, f * (-0.188f));
            canvas.drawPath(path, this.f114906a);
            canvas.restore();
            this.f114906a.setXfermode(null);
            canvas.restoreToCount(saveLayer);
        }
    }
}
