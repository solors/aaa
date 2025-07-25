package com.taurusx.tax.p606j;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.AudioManager;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.p578b.p579c.C28210c;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.Random;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.x */
/* loaded from: classes7.dex */
public class C28549x {
    static {
        C28162a.f73047a.m23824a(new byte[]{75, -120, 89, -14, 45, -10}, new byte[]{24, -64});
    }

    /* renamed from: a */
    public static int m37969a(C28210c c28210c) {
        C28210c.C28214b c28214b;
        C28210c.C28214b.C28215a c28215a;
        if (c28210c == null || (c28214b = c28210c.f73228d) == null || (c28215a = c28214b.f73248a) == null) {
            return 0;
        }
        return c28215a.f73252c;
    }

    /* renamed from: b */
    public static String m37960b(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(C28162a.f73047a.m23824a(new byte[]{110, 16, 124, 117, 12}, new byte[]{61, 88}));
            messageDigest.update(bArr, 0, bArr.length);
            for (byte b : messageDigest.digest()) {
                sb2.append(String.format(C28162a.f73047a.m23824a(new byte[]{70, 105, 81, 1}, new byte[]{99, 89}), Byte.valueOf(b)));
            }
            return sb2.toString().toLowerCase(Locale.US);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m37976a(int i) {
        Random random = new Random();
        StringBuilder sb2 = new StringBuilder();
        int i2 = 0;
        while (i2 < i) {
            int nextInt = random.nextInt(10);
            String num = Integer.toString(nextInt);
            if (sb2.length() != 0) {
                sb2.append(num);
            } else if (nextInt > 0) {
                sb2.append(num);
            }
            i2++;
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static boolean m37963b(C28210c c28210c) {
        C28210c.C28214b c28214b;
        C28210c.C28214b.C28215a c28215a;
        if (c28210c == null || (c28214b = c28210c.f73228d) == null || (c28215a = c28214b.f73248a) == null) {
            return true;
        }
        return c28215a.f73250a == 0 && c28215a.f73251b == 0;
    }

    /* renamed from: a */
    public static boolean m37975a(Context context) {
        return ((AudioManager) context.getSystemService(C28162a.f73047a.m23824a(new byte[]{85, -1, 80, -29, 91}, new byte[]{52, -118}))).getRingerMode() == 0;
    }

    /* renamed from: b */
    public static String m37962b(InputStream inputStream) {
        try {
            StringBuilder sb2 = new StringBuilder();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read > 0) {
                    sb2.append(new String(bArr, 0, read));
                } else {
                    inputStream.close();
                    return sb2.toString();
                }
            }
        } catch (Exception e) {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            String m23824a = stringFogImpl.m23824a(new byte[]{-66, 55, -65, 36, -65, 37, -78}, new byte[]{-54, 86});
            LogUtil.m37904e(m23824a, stringFogImpl.m23824a(new byte[]{-109, -45, -124, -50, -124, -127, -52, -127}, new byte[]{-10, -95}) + e);
            return null;
        }
    }

    /* renamed from: a */
    public static int m37977a(float f, Context context) {
        return (int) (TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics()) + 0.5f);
    }

    /* renamed from: a */
    public static String m37967a(InputStream inputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        byte[] bArr = new byte[4096];
        int i = 0;
        while (i != -1) {
            sb2.append(new String(bArr, 0, i));
            i = inputStream.read(bArr);
        }
        inputStream.close();
        return sb2.toString();
    }

    /* renamed from: a */
    public static void m37966a(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (inputStream == null) {
            throw new IOException(C28162a.f73047a.m23824a(new byte[]{114, -111, 70, -99, 75, -102, 7, -117, 72, -33, 68, -112, 87, -122, 7, -103, 85, -112, 74, -33, 72, -115, 7, -117, 72, -33, 70, -33, 73, -118, 75, -109, 7, -116, 83, -115, 66, -98, 74, -47}, new byte[]{39, -1}));
        }
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    /* renamed from: b */
    public static String m37961b(String str) {
        try {
            return m37962b(new FileInputStream(str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static void m37968a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    /* renamed from: a */
    public static String m37965a(String str) {
        try {
            StringFogImpl stringFogImpl = C28162a.f73047a;
            MessageDigest messageDigest = MessageDigest.getInstance(stringFogImpl.m23824a(new byte[]{15, 78, 29, 43, 110, 51, 106}, new byte[]{92, 6}));
            messageDigest.update(str.getBytes(stringFogImpl.m23824a(new byte[]{-111, -44, -126, -83, -4}, new byte[]{-60, UnsignedBytes.MAX_POWER_OF_TWO})));
            return m37964a(messageDigest.digest());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return "";
        } catch (NoSuchAlgorithmException e2) {
            e2.printStackTrace();
            return "";
        }
    }

    /* renamed from: a */
    public static String m37964a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append(C28162a.f73047a.m23824a(new byte[]{111}, new byte[]{95, -94}));
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static Bitmap m37973a(Context context, Bitmap bitmap) {
        try {
            Bitmap.Config config = bitmap.getConfig();
            Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
            Bitmap copy = config == config2 ? bitmap : bitmap.copy(config2, true);
            Bitmap createBitmap = Bitmap.createBitmap(copy.getWidth() / 3, bitmap.getHeight() / 3, Bitmap.Config.ARGB_8888);
            RenderScript create = RenderScript.create(context);
            ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
            Allocation createFromBitmap = Allocation.createFromBitmap(create, copy);
            Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
            create2.setRadius(25.0f);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            new Canvas(createBitmap).drawColor(855638016);
            create.destroy();
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static ViewGroup.LayoutParams m37970a(ViewGroup viewGroup, int i, int i2, int i3) {
        if (viewGroup instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
            if (i3 == 1) {
                layoutParams.gravity = 53;
            } else if (i3 == 2) {
                layoutParams.gravity = 51;
            } else if (i3 == 3) {
                layoutParams.gravity = 85;
            } else if (i3 == 4) {
                layoutParams.gravity = 83;
            }
            return layoutParams;
        } else if (viewGroup instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i2);
            if (i3 == 1) {
                layoutParams2.addRule(10);
                layoutParams2.addRule(11);
            } else if (i3 == 2) {
                layoutParams2.addRule(10);
                layoutParams2.addRule(9);
            } else if (i3 == 3) {
                layoutParams2.addRule(12);
                layoutParams2.addRule(11);
            } else if (i3 == 4) {
                layoutParams2.addRule(12);
                layoutParams2.addRule(9);
            }
            return layoutParams2;
        } else if (viewGroup instanceof LinearLayout) {
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i, i2);
            if (i3 == 1) {
                layoutParams3.gravity = 53;
            } else if (i3 == 2) {
                layoutParams3.gravity = 51;
            } else if (i3 == 3) {
                layoutParams3.gravity = 85;
            } else if (i3 == 4) {
                layoutParams3.gravity = 83;
            }
            return layoutParams3;
        } else {
            return new ViewGroup.LayoutParams(i, i2);
        }
    }

    /* renamed from: a */
    public static int m37974a(Context context, int i) {
        return (int) ((i * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x015c, code lost:
        r2 = r3;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m37971a(android.view.View r17, com.taurusx.tax.p578b.p579c.C28210c r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p606j.C28549x.m37971a(android.view.View, com.taurusx.tax.b.c.c, int, int):boolean");
    }

    /* renamed from: a */
    public static void m37972a(View view) {
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }
}
