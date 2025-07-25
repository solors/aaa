package com.meevii.sudoku.vibration;

import android.content.Context;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Log;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class Vibrate {
    private boolean isInit = false;
    private Vibrator vibrator;

    private Vibrate(Context context) {
        init(context);
    }

    private void init(Context context) {
        if (this.isInit) {
            this.isInit = true;
        }
        this.vibrator = (Vibrator) context.getSystemService("vibrator");
    }

    public static Vibrate newInstance(Context context) {
        return new Vibrate(context);
    }

    public boolean hasAmplitudeControl() {
        boolean hasAmplitudeControl;
        if (Build.VERSION.SDK_INT >= 26) {
            hasAmplitudeControl = this.vibrator.hasAmplitudeControl();
            return hasAmplitudeControl;
        }
        return false;
    }

    public void oneVibrate(long j, int i) {
        VibrationEffect createOneShot;
        if (!this.vibrator.hasVibrator()) {
            Log.d("vibrate", "this device not support vibrate");
            return;
        }
        Log.d("vibrate", "times:" + j + " amplitudes:" + i);
        if (Build.VERSION.SDK_INT >= 26) {
            createOneShot = VibrationEffect.createOneShot(j, i);
            this.vibrator.vibrate(createOneShot);
            return;
        }
        this.vibrator.vibrate(j);
    }

    public void waveformVibrate(long[] jArr, int i) {
        int[] iArr = new int[jArr.length];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            iArr[i2] = 50;
        }
        waveformVibrate(jArr, iArr, i);
    }

    public void waveformVibrate(long[] jArr, int[] iArr, int i) {
        VibrationEffect createWaveform;
        if (!this.vibrator.hasVibrator()) {
            Log.d("vibrate", "this device not support vibrate");
            return;
        }
        Log.d("vibrate", "times:" + Arrays.toString(jArr) + " amplitudes:" + Arrays.toString(iArr) + " repeat:" + i);
        if (Build.VERSION.SDK_INT >= 26) {
            createWaveform = VibrationEffect.createWaveform(jArr, iArr, i);
            this.vibrator.vibrate(createWaveform);
            return;
        }
        this.vibrator.vibrate(jArr, i);
    }
}
