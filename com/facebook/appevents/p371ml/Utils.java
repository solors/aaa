package com.facebook.appevents.p371ml;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import com.facebook.FacebookSdk;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections._ArraysJvm;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Utils.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.facebook.appevents.ml.Utils */
/* loaded from: classes2.dex */
public final class Utils {
    @NotNull
    private static final String DIR_NAME = "facebook_ml/";
    @NotNull
    public static final Utils INSTANCE = new Utils();

    private Utils() {
    }

    @Nullable
    public static final File getMlDir() {
        if (CrashShieldHandler.isObjectCrashing(Utils.class)) {
            return null;
        }
        try {
            File file = new File(FacebookSdk.getApplicationContext().getFilesDir(), DIR_NAME);
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, Utils.class);
            return null;
        }
    }

    @Nullable
    public static final Map<String, MTensor> parseModelWeights(@NotNull File file) {
        Map<String, MTensor> map;
        Map<String, MTensor> map2 = null;
        if (CrashShieldHandler.isObjectCrashing(Utils.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(file, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                int i = 0;
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                int i2 = wrap.getInt();
                int i3 = i2 + 4;
                if (available < i3) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i2, Charsets.UTF_8));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                int i4 = length - 1;
                if (i4 >= 0) {
                    int i5 = 0;
                    while (true) {
                        int i6 = i5 + 1;
                        strArr[i5] = names.getString(i5);
                        if (i6 > i4) {
                            break;
                        }
                        i5 = i6;
                    }
                }
                _ArraysJvm.m17403E(strArr);
                HashMap hashMap = new HashMap();
                int i7 = 0;
                while (i7 < length) {
                    String str = strArr[i7];
                    i7++;
                    if (str != null) {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i8 = length2 - 1;
                        int i9 = 1;
                        if (i8 >= 0) {
                            while (true) {
                                int i10 = i + 1;
                                try {
                                    int i11 = jSONArray.getInt(i);
                                    iArr[i] = i11;
                                    i9 *= i11;
                                    if (i10 > i8) {
                                        break;
                                    }
                                    i = i10;
                                } catch (Exception unused) {
                                    return null;
                                } catch (Throwable th) {
                                    th = th;
                                    map = null;
                                    CrashShieldHandler.handleThrowable(th, Utils.class);
                                    return map;
                                }
                            }
                        }
                        int i12 = i9 * 4;
                        int i13 = i3 + i12;
                        if (i13 > available) {
                            return null;
                        }
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i3, i12);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        MTensor mTensor = new MTensor(iArr);
                        wrap2.asFloatBuffer().get(mTensor.getData(), 0, i9);
                        hashMap.put(str, mTensor);
                        i3 = i13;
                        i = 0;
                        map2 = null;
                    }
                }
                return hashMap;
            } catch (Exception unused2) {
                return map2;
            }
        } catch (Throwable th2) {
            th = th2;
            map = map2;
        }
    }

    @NotNull
    public final String normalizeString(@NotNull String str) {
        int i;
        boolean z;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(str, "str");
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (Intrinsics.m17071j(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            Object[] array = new Regex("\\s+").m16763h(str.subSequence(i2, length + 1).toString(), 0).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                Intrinsics.checkNotNullExpressionValue(join, "join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @NotNull
    public final int[] vectorize(@NotNull String texts, int i) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(texts, "texts");
            int[] iArr = new int[i];
            String normalizeString = normalizeString(texts);
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(forName, "forName(\"UTF-8\")");
            if (normalizeString != null) {
                byte[] bytes = normalizeString.getBytes(forName);
                Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
                if (i > 0) {
                    int i2 = 0;
                    while (true) {
                        int i3 = i2 + 1;
                        if (i2 < bytes.length) {
                            iArr[i2] = bytes[i2] & 255;
                        } else {
                            iArr[i2] = 0;
                        }
                        if (i3 >= i) {
                            break;
                        }
                        i2 = i3;
                    }
                }
                return iArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }
}
