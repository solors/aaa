package com.zeus.gmc.sdk.mobileads.columbus.internal.coocii;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32455cicc2iiccc;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32468coi222o222;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.C32284cicc2iiccc;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coocii.coo2iico */
/* loaded from: classes8.dex */
public class C32733coo2iico {

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coocii.coo2iico$c2oc2i */
    /* loaded from: classes8.dex */
    public static class C32734c2oc2i implements ViewPager.PageTransformer {
        private static final float coo2iico = 0.9f;

        @Override // androidx.viewpager.widget.ViewPager.PageTransformer
        public void transformPage(@NonNull View view, float f) {
            if (f >= -1.0f && f <= 1.0f) {
                if (f <= 1.0f) {
                    if (f == 0.0f) {
                        view.setScaleY(1.0f);
                        view.setScaleX(1.0f);
                        return;
                    } else if (f < 0.0f) {
                        float f2 = ((f + 1.0f) * 0.100000024f) + 0.9f;
                        view.setScaleY(f2);
                        view.setScaleX(f2);
                        return;
                    } else {
                        float f3 = ((1.0f - f) * 0.100000024f) + 0.9f;
                        view.setScaleY(f3);
                        view.setScaleX(f3);
                        return;
                    }
                }
                return;
            }
            view.setScaleY(0.9f);
            view.setScaleX(0.9f);
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coocii.coo2iico$coi222o222 */
    /* loaded from: classes8.dex */
    private static class C32735coi222o222 extends PagerAdapter {
        private List<View> coo2iico;

        public C32735coi222o222(List<View> list) {
            this.coo2iico = list;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView(this.coo2iico.get(i));
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            return this.coo2iico.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public float getPageWidth(int i) {
            return 1.0f;
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        @NonNull
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            viewGroup.addView(this.coo2iico.get(i));
            return this.coo2iico.get(i);
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            if (view == obj) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.coocii.coo2iico$coo2iico */
    /* loaded from: classes8.dex */
    class View$OnTouchListenerC32736coo2iico implements View.OnTouchListener {
        final /* synthetic */ ViewPager coo2iico;

        View$OnTouchListenerC32736coo2iico(ViewPager viewPager) {
            this.coo2iico = viewPager;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return this.coo2iico.dispatchTouchEvent(motionEvent);
        }
    }

    private C32733coo2iico() {
    }

    private static boolean coo2iico(float f, float f2) {
        if (f > 1.0f || f2 <= 1.0f) {
            return f > 1.0f && f2 <= 1.0f;
        }
        return true;
    }

    public static ImageView coo2iico(Context context, Bitmap bitmap, boolean z) {
        ImageView imageView = new ImageView(context);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        marginLayoutParams.height = 100;
        marginLayoutParams.width = -2;
        imageView.setLayoutParams(marginLayoutParams);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (bitmap != null && !bitmap.isRecycled()) {
            if (z) {
                imageView.setImageBitmap(coo2iico(bitmap, bitmap.getWidth(), bitmap.getHeight(), C32284cicc2iiccc.coo2iico(context, 5.0f), C32284cicc2iiccc.coo2iico(context, 1.0f)));
            } else {
                imageView.setImageBitmap(bitmap);
            }
        }
        return imageView;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static ViewPager coo2iico(Context context, FrameLayout frameLayout, List<View> list, Bitmap bitmap, boolean z) {
        if (bitmap == null || list == null || list.isEmpty()) {
            return null;
        }
        Bitmap coo2iico = C32468coi222o222.coo2iico(context, bitmap, 25, 0.05f);
        if (coo2iico != null) {
            frameLayout.setBackground(new BitmapDrawable(context.getResources(), coo2iico));
        }
        ViewPager viewPager = new ViewPager(context);
        viewPager.setClickable(true);
        viewPager.setAdapter(new C32735coi222o222(list));
        viewPager.setOffscreenPageLimit(3);
        viewPager.setPageTransformer(false, new C32734c2oc2i());
        frameLayout.removeAllViews();
        frameLayout.addView(viewPager);
        frameLayout.setClickable(true);
        frameLayout.setOnTouchListener(new View$OnTouchListenerC32736coo2iico(viewPager));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        float width = bitmap.getWidth() / bitmap.getHeight();
        float f = list.size() >= 2 ? 0.8f : 1.0f;
        if (z) {
            int cicic = C32284cicc2iiccc.cicic(context);
            int coiic = C32284cicc2iiccc.coiic(context) / 2;
            float f2 = cicic;
            float f3 = coiic;
            if (width > f2 / f3) {
                layoutParams.width = (int) (f2 * f);
                int i = (int) (f2 / width);
                layoutParams.height = (int) (coo2iico(context, i) * f);
                if (f < 1.0f) {
                    layoutParams.height = Math.min(coo2iico(context, (int) (i * 1.5d)), coo2iico(context, coiic));
                }
            } else {
                layoutParams.width = (int) (f3 * width);
                layoutParams.height = coo2iico(context, coiic);
            }
        } else {
            int cicic2 = C32284cicc2iiccc.cicic(context);
            float coiic2 = (int) (C32284cicc2iiccc.coiic(context) * 0.6242424f);
            float f4 = cicic2;
            layoutParams.height = -1;
            if (width > coiic2 / f4) {
                layoutParams.width = (int) (coiic2 * f);
            } else {
                layoutParams.width = (int) (f4 * width);
            }
        }
        viewPager.setLayoutParams(layoutParams);
        return viewPager;
    }

    public static int coo2iico(Context context, int i) {
        int coo2iico = C32284cicc2iiccc.coo2iico(context, 420.0f);
        int coiic = C32284cicc2iiccc.coiic(context) - coo2iico;
        return (coo2iico <= C32284cicc2iiccc.coiic(context) / 2 || i <= coiic) ? i : coiic;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.graphics.Bitmap] */
    public static Bitmap coo2iico(Context context, String str, boolean z, Bitmap bitmap) {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        int cicic;
        int i;
        FileInputStream fileInputStream4 = null;
        if (str == null || !new File(str).exists()) {
            return null;
        }
        try {
            fileInputStream3 = new FileInputStream(str);
            try {
                FileInputStream fileInputStream5 = new FileInputStream(str);
                try {
                    try {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        ?? decodeStream = BitmapFactory.decodeStream(fileInputStream3, null, options);
                        try {
                            float f = options.outWidth;
                            float f2 = options.outHeight;
                            float f3 = f / f2;
                            if (bitmap != null) {
                                if (coo2iico(f3, bitmap.getWidth() / bitmap.getHeight())) {
                                    C32455cicc2iiccc.coo2iico((Closeable) fileInputStream3);
                                    C32455cicc2iiccc.coo2iico((Closeable) fileInputStream5);
                                    return null;
                                }
                            }
                            float f4 = bitmap != null ? 0.8f : 1.0f;
                            if (z) {
                                int cicic2 = C32284cicc2iiccc.cicic(context);
                                int coiic = C32284cicc2iiccc.coiic(context) / 2;
                                float f5 = cicic2;
                                float f6 = coiic;
                                float f7 = f5 / f6;
                                i = (int) (f6 * f3);
                                cicic = coo2iico(context, coiic);
                                if (f3 > f7) {
                                    i = (int) (f5 * f4);
                                    cicic = (int) (coo2iico(context, (int) (f5 / f3)) * f4);
                                }
                            } else {
                                cicic = C32284cicc2iiccc.cicic(context);
                                float coiic2 = (int) (C32284cicc2iiccc.coiic(context) * 0.6242424f);
                                float f8 = cicic;
                                i = f3 > coiic2 / f8 ? (int) (coiic2 * f4) : (int) (f8 * f3);
                            }
                            float max = Math.max(f / i, f2 / cicic);
                            options.inJustDecodeBounds = false;
                            if (max > 1.0f) {
                                options.inSampleSize = Math.round(max);
                            }
                            options.inPreferredConfig = Bitmap.Config.RGB_565;
                            Bitmap decodeStream2 = BitmapFactory.decodeStream(fileInputStream5, null, options);
                            C32455cicc2iiccc.coo2iico((Closeable) fileInputStream3);
                            C32455cicc2iiccc.coo2iico((Closeable) fileInputStream5);
                            return decodeStream2;
                        } catch (Exception e) {
                            e = e;
                            fileInputStream4 = decodeStream;
                            fileInputStream2 = fileInputStream4;
                            fileInputStream4 = fileInputStream5;
                            try {
                                e.printStackTrace();
                                C32455cicc2iiccc.coo2iico((Closeable) fileInputStream3);
                                C32455cicc2iiccc.coo2iico((Closeable) fileInputStream4);
                                return fileInputStream2;
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream4;
                                fileInputStream4 = fileInputStream3;
                                fileInputStream3 = fileInputStream4;
                                fileInputStream4 = fileInputStream;
                                C32455cicc2iiccc.coo2iico((Closeable) fileInputStream3);
                                C32455cicc2iiccc.coo2iico((Closeable) fileInputStream4);
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream4 = fileInputStream5;
                        C32455cicc2iiccc.coo2iico((Closeable) fileInputStream3);
                        C32455cicc2iiccc.coo2iico((Closeable) fileInputStream4);
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                fileInputStream2 = null;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Exception e4) {
            e = e4;
            fileInputStream2 = null;
            fileInputStream3 = null;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            fileInputStream3 = fileInputStream4;
            fileInputStream4 = fileInputStream;
            C32455cicc2iiccc.coo2iico((Closeable) fileInputStream3);
            C32455cicc2iiccc.coo2iico((Closeable) fileInputStream4);
            throw th;
        }
    }

    public static Bitmap coo2iico(Bitmap bitmap, int i, int i2, int i3, int i4) {
        if (bitmap == null) {
            return null;
        }
        float f = i;
        float f2 = i2;
        float height = (1.0f * f2) / bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.setScale((f * 1.0f) / bitmap.getWidth(), height);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f3 = i4;
        RectF rectF = new RectF(f3, f3, f - f3, f2 - f3);
        float f4 = i3;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        if (i4 > 0) {
            Paint paint2 = new Paint(1);
            paint2.setColor(Color.parseColor("#99959595"));
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(f3);
            canvas.drawRoundRect(rectF, f4, f4, paint2);
        }
        return createBitmap;
    }
}
