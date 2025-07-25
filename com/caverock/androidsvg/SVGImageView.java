package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import p793n0.C38323f;
import p793n0.RenderOptions;
import p793n0.SVG;
import p793n0.SVGParseException;

/* loaded from: classes3.dex */
public class SVGImageView extends ImageView {

    /* renamed from: d */
    private static Method f21517d;

    /* renamed from: b */
    private SVG f21518b;

    /* renamed from: c */
    private RenderOptions f21519c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.caverock.androidsvg.SVGImageView$b */
    /* loaded from: classes3.dex */
    public class AsyncTaskC9652b extends AsyncTask<Integer, Integer, SVG> {

        /* renamed from: a */
        private Context f21520a;

        /* renamed from: b */
        private int f21521b;

        AsyncTaskC9652b(Context context, int i) {
            this.f21520a = context;
            this.f21521b = i;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public SVG doInBackground(Integer... numArr) {
            try {
                return SVG.m15027m(this.f21520a, this.f21521b);
            } catch (SVGParseException e) {
                Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", Integer.valueOf(this.f21521b), e.getMessage()));
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(SVG svg) {
            SVGImageView.this.f21518b = svg;
            SVGImageView.this.m82165c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.caverock.androidsvg.SVGImageView$c */
    /* loaded from: classes3.dex */
    public class AsyncTaskC9653c extends AsyncTask<InputStream, Integer, SVG> {
        private AsyncTaskC9653c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public SVG doInBackground(InputStream... inputStreamArr) {
            try {
                try {
                    SVG m15028l = SVG.m15028l(inputStreamArr[0]);
                    try {
                        inputStreamArr[0].close();
                    } catch (IOException unused) {
                    }
                    return m15028l;
                } catch (Throwable th) {
                    try {
                        inputStreamArr[0].close();
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            } catch (SVGParseException e) {
                Log.e("SVGImageView", "Parse error loading URI: " + e.getMessage());
                try {
                    inputStreamArr[0].close();
                    return null;
                } catch (IOException unused3) {
                    return null;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b */
        public void onPostExecute(SVG svg) {
            SVGImageView.this.f21518b = svg;
            SVGImageView.this.m82165c();
        }
    }

    static {
        try {
            f21517d = View.class.getMethod("setLayerType", Integer.TYPE, Paint.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    public SVGImageView(Context context) {
        super(context);
        this.f21518b = null;
        this.f21519c = new RenderOptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public void m82165c() {
        SVG svg = this.f21518b;
        if (svg == null) {
            return;
        }
        Picture m15020t = svg.m15020t(this.f21519c);
        m82161g();
        setImageDrawable(new PictureDrawable(m15020t));
    }

    /* renamed from: d */
    private void m82164d(AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C38323f.SVGImageView, i, 0);
        try {
            String string = obtainStyledAttributes.getString(C38323f.SVGImageView_css);
            if (string != null) {
                this.f21519c.m15047a(string);
            }
            int i2 = C38323f.SVGImageView_svg;
            int resourceId = obtainStyledAttributes.getResourceId(i2, -1);
            if (resourceId != -1) {
                setImageResource(resourceId);
                return;
            }
            String string2 = obtainStyledAttributes.getString(i2);
            if (string2 != null) {
                if (m82162f(Uri.parse(string2))) {
                    return;
                }
                if (m82163e(string2)) {
                    return;
                }
                setFromString(string2);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    private boolean m82163e(String str) {
        try {
            new AsyncTaskC9653c().execute(getContext().getAssets().open(str));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: f */
    private boolean m82162f(Uri uri) {
        try {
            new AsyncTaskC9653c().execute(getContext().getContentResolver().openInputStream(uri));
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: g */
    private void m82161g() {
        if (f21517d == null) {
            return;
        }
        try {
            f21517d.invoke(this, Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()))), null);
        } catch (Exception e) {
            Log.w("SVGImageView", "Unexpected failure calling setLayerType", e);
        }
    }

    private void setFromString(String str) {
        try {
            this.f21518b = SVG.m15025o(str);
            m82165c();
        } catch (SVGParseException unused) {
            Log.e("SVGImageView", "Could not find SVG at: " + str);
        }
    }

    public void setCSS(String str) {
        this.f21519c.m15047a(str);
        m82165c();
    }

    public void setImageAsset(String str) {
        if (!m82163e(str)) {
            Log.e("SVGImageView", "File not found: " + str);
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        new AsyncTaskC9652b(getContext(), i).execute(new Integer[0]);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (!m82162f(uri)) {
            Log.e("SVGImageView", "File not found: " + uri);
        }
    }

    public void setSVG(SVG svg) {
        if (svg != null) {
            this.f21518b = svg;
            m82165c();
            return;
        }
        throw new IllegalArgumentException("Null value passed to setSVG()");
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f21518b = null;
        this.f21519c = new RenderOptions();
        m82164d(attributeSet, 0);
    }

    public void setSVG(SVG svg, String str) {
        if (svg != null) {
            this.f21518b = svg;
            this.f21519c.m15047a(str);
            m82165c();
            return;
        }
        throw new IllegalArgumentException("Null value passed to setSVG()");
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21518b = null;
        this.f21519c = new RenderOptions();
        m82164d(attributeSet, i);
    }
}
