package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintSet;
import com.ironsource.C21114v8;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MotionPaths implements Comparable<MotionPaths> {
    static final int CARTESIAN = 2;
    public static final boolean DEBUG = false;
    static final int OFF_HEIGHT = 4;
    static final int OFF_PATH_ROTATE = 5;
    static final int OFF_POSITION = 0;
    static final int OFF_WIDTH = 3;
    static final int OFF_X = 1;
    static final int OFF_Y = 2;
    public static final boolean OLD_WAY = false;
    static final int PERPENDICULAR = 1;
    static final int SCREEN = 3;
    public static final String TAG = "MotionPaths";
    static String[] names = {C21114v8.C21122h.f54038L, "x", "y", "width", "height", "pathRotate"};
    LinkedHashMap<String, ConstraintAttribute> attributes;
    float height;
    int mDrawPath;
    Easing mKeyFrameEasing;
    int mMode;
    int mPathMotionArc;
    float mPathRotate;
    float mProgress;
    double[] mTempDelta;
    double[] mTempValue;
    float position;
    float time;
    float width;

    /* renamed from: x */
    float f532x;

    /* renamed from: y */
    float f533y;

    public MotionPaths() {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = Key.UNSET;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
    }

    private boolean diff(float f, float f2) {
        if (!Float.isNaN(f) && !Float.isNaN(f2)) {
            if (Math.abs(f - f2) > 1.0E-6f) {
                return true;
            }
            return false;
        } else if (Float.isNaN(f) != Float.isNaN(f2)) {
            return true;
        } else {
            return false;
        }
    }

    private static final float xRotate(float f, float f2, float f3, float f4, float f5, float f6) {
        return (((f5 - f3) * f2) - ((f6 - f4) * f)) + f3;
    }

    private static final float yRotate(float f, float f2, float f3, float f4, float f5, float f6) {
        return ((f5 - f3) * f) + ((f6 - f4) * f2) + f4;
    }

    public void applyParameters(ConstraintSet.Constraint constraint) {
        this.mKeyFrameEasing = Easing.getInterpolator(constraint.motion.mTransitionEasing);
        ConstraintSet.Motion motion = constraint.motion;
        this.mPathMotionArc = motion.mPathMotionArc;
        this.mPathRotate = motion.mPathRotate;
        this.mDrawPath = motion.mDrawPath;
        this.mProgress = constraint.propertySet.mProgress;
        for (String str : constraint.mCustomConstraints.keySet()) {
            ConstraintAttribute constraintAttribute = constraint.mCustomConstraints.get(str);
            if (constraintAttribute.getType() != ConstraintAttribute.AttributeType.STRING_TYPE) {
                this.attributes.put(str, constraintAttribute);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void different(MotionPaths motionPaths, boolean[] zArr, String[] strArr, boolean z) {
        zArr[0] = zArr[0] | diff(this.position, motionPaths.position);
        zArr[1] = zArr[1] | diff(this.f532x, motionPaths.f532x) | z;
        zArr[2] = z | diff(this.f533y, motionPaths.f533y) | zArr[2];
        zArr[3] = zArr[3] | diff(this.width, motionPaths.width);
        zArr[4] = diff(this.height, motionPaths.height) | zArr[4];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void fillStandard(double[] dArr, int[] iArr) {
        float[] fArr = {this.position, this.f532x, this.f533y, this.width, this.height, this.mPathRotate};
        int i = 0;
        for (int i2 : iArr) {
            if (i2 < 6) {
                dArr[i] = fArr[i2];
                i++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getBounds(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.width;
        float f2 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f3 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 3) {
                if (i3 == 4) {
                    f2 = f3;
                }
            } else {
                f = f3;
            }
        }
        fArr[i] = f;
        fArr[i + 1] = f2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getCenter(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f532x;
        float f2 = this.f533y;
        float f3 = this.width;
        float f4 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        fArr[i] = f + (f3 / 2.0f) + 0.0f;
        fArr[i + 1] = f2 + (f4 / 2.0f) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCustomData(String str, double[] dArr, int i) {
        ConstraintAttribute constraintAttribute = this.attributes.get(str);
        if (constraintAttribute.noOfInterpValues() == 1) {
            dArr[i] = constraintAttribute.getValueToInterpolate();
            return 1;
        }
        int noOfInterpValues = constraintAttribute.noOfInterpValues();
        float[] fArr = new float[noOfInterpValues];
        constraintAttribute.getValuesToInterpolate(fArr);
        int i2 = 0;
        while (i2 < noOfInterpValues) {
            dArr[i] = fArr[i2];
            i2++;
            i++;
        }
        return noOfInterpValues;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCustomDataCount(String str) {
        return this.attributes.get(str).noOfInterpValues();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void getRect(int[] iArr, double[] dArr, float[] fArr, int i) {
        float f = this.f532x;
        float f2 = this.f533y;
        float f3 = this.width;
        float f4 = this.height;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            float f5 = (float) dArr[i2];
            int i3 = iArr[i2];
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        if (i3 == 4) {
                            f4 = f5;
                        }
                    } else {
                        f3 = f5;
                    }
                } else {
                    f2 = f5;
                }
            } else {
                f = f5;
            }
        }
        float f6 = f3 + f;
        float f7 = f4 + f2;
        Float.isNaN(Float.NaN);
        Float.isNaN(Float.NaN);
        int i4 = i + 1;
        fArr[i] = f + 0.0f;
        int i5 = i4 + 1;
        fArr[i4] = f2 + 0.0f;
        int i6 = i5 + 1;
        fArr[i5] = f6 + 0.0f;
        int i7 = i6 + 1;
        fArr[i6] = f2 + 0.0f;
        int i8 = i7 + 1;
        fArr[i7] = f6 + 0.0f;
        int i9 = i8 + 1;
        fArr[i8] = f7 + 0.0f;
        fArr[i9] = f + 0.0f;
        fArr[i9 + 1] = f7 + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean hasCustomData(String str) {
        return this.attributes.containsKey(str);
    }

    void initCartesian(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7 = keyPosition.mFramePosition / 100.0f;
        this.time = f7;
        this.mDrawPath = keyPosition.mDrawPath;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f = f7;
        } else {
            f = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f2 = f7;
        } else {
            f2 = keyPosition.mPercentHeight;
        }
        float f8 = motionPaths2.width;
        float f9 = motionPaths.width;
        float f10 = motionPaths2.height;
        float f11 = motionPaths.height;
        this.position = this.time;
        float f12 = motionPaths.f532x;
        float f13 = motionPaths.f533y;
        float f14 = (motionPaths2.f532x + (f8 / 2.0f)) - ((f9 / 2.0f) + f12);
        float f15 = (motionPaths2.f533y + (f10 / 2.0f)) - (f13 + (f11 / 2.0f));
        float f16 = ((f8 - f9) * f) / 2.0f;
        this.f532x = (int) ((f12 + (f14 * f7)) - f16);
        float f17 = ((f10 - f11) * f2) / 2.0f;
        this.f533y = (int) ((f13 + (f15 * f7)) - f17);
        this.width = (int) (f9 + f3);
        this.height = (int) (f11 + f4);
        if (Float.isNaN(keyPosition.mPercentX)) {
            f5 = f7;
        } else {
            f5 = keyPosition.mPercentX;
        }
        float f18 = 0.0f;
        if (Float.isNaN(keyPosition.mAltPercentY)) {
            f6 = 0.0f;
        } else {
            f6 = keyPosition.mAltPercentY;
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            f7 = keyPosition.mPercentY;
        }
        if (!Float.isNaN(keyPosition.mAltPercentX)) {
            f18 = keyPosition.mAltPercentX;
        }
        this.mMode = 2;
        this.f532x = (int) (((motionPaths.f532x + (f5 * f14)) + (f18 * f15)) - f16);
        this.f533y = (int) (((motionPaths.f533y + (f14 * f6)) + (f15 * f7)) - f17);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void initPath(KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = keyPosition.mFramePosition / 100.0f;
        this.time = f6;
        this.mDrawPath = keyPosition.mDrawPath;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f = f6;
        } else {
            f = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f2 = f6;
        } else {
            f2 = keyPosition.mPercentHeight;
        }
        float f7 = motionPaths2.width - motionPaths.width;
        float f8 = motionPaths2.height - motionPaths.height;
        this.position = this.time;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            f6 = keyPosition.mPercentX;
        }
        float f9 = motionPaths.f532x;
        float f10 = motionPaths.width;
        float f11 = motionPaths.f533y;
        float f12 = motionPaths.height;
        float f13 = (motionPaths2.f532x + (motionPaths2.width / 2.0f)) - ((f10 / 2.0f) + f9);
        float f14 = (motionPaths2.f533y + (motionPaths2.height / 2.0f)) - ((f12 / 2.0f) + f11);
        float f15 = f13 * f6;
        float f16 = (f7 * f) / 2.0f;
        this.f532x = (int) ((f9 + f15) - f16);
        float f17 = f6 * f14;
        float f18 = (f8 * f2) / 2.0f;
        this.f533y = (int) ((f11 + f17) - f18);
        this.width = (int) (f10 + f3);
        this.height = (int) (f12 + f4);
        if (Float.isNaN(keyPosition.mPercentY)) {
            f5 = 0.0f;
        } else {
            f5 = keyPosition.mPercentY;
        }
        this.mMode = 1;
        float f19 = (int) ((motionPaths.f532x + f15) - f16);
        float f20 = (int) ((motionPaths.f533y + f17) - f18);
        this.f532x = f19 + ((-f14) * f5);
        this.f533y = f20 + (f13 * f5);
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    void initScreen(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        float f;
        float f2;
        float f3 = keyPosition.mFramePosition / 100.0f;
        this.time = f3;
        this.mDrawPath = keyPosition.mDrawPath;
        if (Float.isNaN(keyPosition.mPercentWidth)) {
            f = f3;
        } else {
            f = keyPosition.mPercentWidth;
        }
        if (Float.isNaN(keyPosition.mPercentHeight)) {
            f2 = f3;
        } else {
            f2 = keyPosition.mPercentHeight;
        }
        float f4 = motionPaths2.width;
        float f5 = motionPaths.width;
        float f6 = motionPaths2.height;
        float f7 = motionPaths.height;
        this.position = this.time;
        float f8 = motionPaths.f532x;
        float f9 = motionPaths.f533y;
        float f10 = motionPaths2.f532x + (f4 / 2.0f);
        float f11 = motionPaths2.f533y + (f6 / 2.0f);
        float f12 = (f4 - f5) * f;
        this.f532x = (int) ((f8 + ((f10 - ((f5 / 2.0f) + f8)) * f3)) - (f12 / 2.0f));
        float f13 = (f6 - f7) * f2;
        this.f533y = (int) ((f9 + ((f11 - (f9 + (f7 / 2.0f))) * f3)) - (f13 / 2.0f));
        this.width = (int) (f5 + f12);
        this.height = (int) (f7 + f13);
        this.mMode = 3;
        if (!Float.isNaN(keyPosition.mPercentX)) {
            this.f532x = (int) (keyPosition.mPercentX * ((int) (i - this.width)));
        }
        if (!Float.isNaN(keyPosition.mPercentY)) {
            this.f533y = (int) (keyPosition.mPercentY * ((int) (i2 - this.height)));
        }
        this.mKeyFrameEasing = Easing.getInterpolator(keyPosition.mTransitionEasing);
        this.mPathMotionArc = keyPosition.mPathMotionArc;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setBounds(float f, float f2, float f3, float f4) {
        this.f532x = f;
        this.f533y = f2;
        this.width = f3;
        this.height = f4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDpDt(float f, float f2, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f7 = (float) dArr[i];
            double d = dArr2[i];
            int i2 = iArr[i];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            f6 = f7;
                        }
                    } else {
                        f4 = f7;
                    }
                } else {
                    f5 = f7;
                }
            } else {
                f3 = f7;
            }
        }
        float f8 = f3 - ((0.0f * f4) / 2.0f);
        float f9 = f5 - ((0.0f * f6) / 2.0f);
        fArr[0] = (f8 * (1.0f - f)) + (((f4 * 1.0f) + f8) * f) + 0.0f;
        fArr[1] = (f9 * (1.0f - f2)) + (((f6 * 1.0f) + f9) * f2) + 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setView(View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        boolean z;
        float f;
        float f2;
        boolean z2;
        float f3 = this.f532x;
        float f4 = this.f533y;
        float f5 = this.width;
        float f6 = this.height;
        boolean z3 = true;
        if (iArr.length != 0 && this.mTempValue.length <= iArr[iArr.length - 1]) {
            int i = iArr[iArr.length - 1] + 1;
            this.mTempValue = new double[i];
            this.mTempDelta = new double[i];
        }
        Arrays.fill(this.mTempValue, Double.NaN);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            double[] dArr4 = this.mTempValue;
            int i3 = iArr[i2];
            dArr4[i3] = dArr[i2];
            this.mTempDelta[i3] = dArr2[i2];
        }
        int i4 = 0;
        float f7 = Float.NaN;
        float f8 = 0.0f;
        float f9 = 0.0f;
        float f10 = 0.0f;
        float f11 = 0.0f;
        while (true) {
            double[] dArr5 = this.mTempValue;
            if (i4 >= dArr5.length) {
                break;
            }
            double d = 0.0d;
            if (Double.isNaN(dArr5[i4]) && (dArr3 == null || dArr3[i4] == 0.0d)) {
                f2 = f3;
                z2 = z3;
            } else {
                if (dArr3 != null) {
                    d = dArr3[i4];
                }
                if (!Double.isNaN(this.mTempValue[i4])) {
                    d = this.mTempValue[i4] + d;
                }
                f = (float) d;
                f2 = f3;
                float f12 = (float) this.mTempDelta[i4];
                z2 = true;
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    f7 = f;
                                }
                            } else {
                                f11 = f12;
                                f6 = f;
                            }
                        } else {
                            f9 = f12;
                            f5 = f;
                        }
                    } else {
                        f10 = f12;
                        f4 = f;
                    }
                } else {
                    f8 = f12;
                    i4++;
                    z3 = z2;
                    f3 = f;
                }
            }
            f = f2;
            i4++;
            z3 = z2;
            f3 = f;
        }
        float f13 = f3;
        boolean z4 = z3;
        if (Float.isNaN(f7)) {
            if (!Float.isNaN(Float.NaN)) {
                view.setRotation(Float.NaN);
            }
        } else {
            float f14 = Float.NaN;
            if (Float.isNaN(Float.NaN)) {
                f14 = 0.0f;
            }
            view.setRotation((float) (f14 + f7 + Math.toDegrees(Math.atan2(f10 + (f11 / 2.0f), f8 + (f9 / 2.0f)))));
        }
        float f15 = f13 + 0.5f;
        int i5 = (int) f15;
        float f16 = f4 + 0.5f;
        int i6 = (int) f16;
        int i7 = (int) (f15 + f5);
        int i8 = (int) (f16 + f6);
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        if (i9 == view.getMeasuredWidth() && i10 == view.getMeasuredHeight()) {
            z = false;
        } else {
            z = z4;
        }
        if (z) {
            view.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i10, 1073741824));
        }
        view.layout(i5, i6, i7, i8);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull MotionPaths motionPaths) {
        return Float.compare(this.position, motionPaths.position);
    }

    public MotionPaths(int i, int i2, KeyPosition keyPosition, MotionPaths motionPaths, MotionPaths motionPaths2) {
        this.mDrawPath = 0;
        this.mPathRotate = Float.NaN;
        this.mProgress = Float.NaN;
        this.mPathMotionArc = Key.UNSET;
        this.attributes = new LinkedHashMap<>();
        this.mMode = 0;
        this.mTempValue = new double[18];
        this.mTempDelta = new double[18];
        int i3 = keyPosition.mPositionType;
        if (i3 == 1) {
            initPath(keyPosition, motionPaths, motionPaths2);
        } else if (i3 != 2) {
            initCartesian(keyPosition, motionPaths, motionPaths2);
        } else {
            initScreen(i, i2, keyPosition, motionPaths, motionPaths2);
        }
    }
}
