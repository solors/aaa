package androidx.media3.common.audio;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class ChannelMixingMatrix {
    private final float[] coefficients;
    private final int inputChannelCount;
    private final boolean isDiagonal;
    private final boolean isIdentity;
    private final boolean isZero;
    private final int outputChannelCount;

    public ChannelMixingMatrix(int i, int i2, float[] fArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z, "Input channel count must be positive.");
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2, "Output channel count must be positive.");
        if (fArr.length == i * i2) {
            z3 = true;
        } else {
            z3 = false;
        }
        Assertions.checkArgument(z3, "Coefficient array length is invalid.");
        this.inputChannelCount = i;
        this.outputChannelCount = i2;
        this.coefficients = checkCoefficientsValid(fArr);
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                float mixingCoefficient = getMixingCoefficient(i3, i4);
                if (i3 == i4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (mixingCoefficient != 1.0f && z5) {
                    z9 = false;
                }
                if (mixingCoefficient != 0.0f) {
                    z7 = false;
                    if (!z5) {
                        z8 = false;
                    }
                }
            }
        }
        this.isZero = z7;
        if (isSquare() && z8) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.isDiagonal = z4;
        this.isIdentity = (z4 && z9) ? z6 : false;
    }

    private static float[] checkCoefficientsValid(float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            if (fArr[i] < 0.0f) {
                throw new IllegalArgumentException("Coefficient at index " + i + " is negative.");
            }
        }
        return fArr;
    }

    public static ChannelMixingMatrix create(int i, int i2) {
        return new ChannelMixingMatrix(i, i2, createMixingCoefficients(i, i2));
    }

    private static float[] createMixingCoefficients(int i, int i2) {
        if (i == i2) {
            return initializeIdentityMatrix(i2);
        }
        if (i == 1 && i2 == 2) {
            return new float[]{1.0f, 1.0f};
        }
        if (i == 2 && i2 == 1) {
            return new float[]{0.5f, 0.5f};
        }
        throw new UnsupportedOperationException("Default channel mixing coefficients for " + i + "->" + i2 + " are not yet implemented.");
    }

    private static float[] initializeIdentityMatrix(int i) {
        float[] fArr = new float[i * i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[(i * i2) + i2] = 1.0f;
        }
        return fArr;
    }

    public int getInputChannelCount() {
        return this.inputChannelCount;
    }

    public float getMixingCoefficient(int i, int i2) {
        return this.coefficients[(i * this.outputChannelCount) + i2];
    }

    public int getOutputChannelCount() {
        return this.outputChannelCount;
    }

    public boolean isDiagonal() {
        return this.isDiagonal;
    }

    public boolean isIdentity() {
        return this.isIdentity;
    }

    public boolean isSquare() {
        if (this.inputChannelCount == this.outputChannelCount) {
            return true;
        }
        return false;
    }

    public boolean isZero() {
        return this.isZero;
    }

    public ChannelMixingMatrix scaleBy(float f) {
        float[] fArr = new float[this.coefficients.length];
        int i = 0;
        while (true) {
            float[] fArr2 = this.coefficients;
            if (i < fArr2.length) {
                fArr[i] = fArr2[i] * f;
                i++;
            } else {
                return new ChannelMixingMatrix(this.inputChannelCount, this.outputChannelCount, fArr);
            }
        }
    }
}
