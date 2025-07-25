package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.content.res.FontResourcesParserCompat;
import androidx.core.provider.FontsContractCompat;
import java.io.IOException;
import java.io.InputStream;

@RequiresApi(29)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class TypefaceCompatApi29Impl extends TypefaceCompatBaseImpl {
    /* JADX WARN: Incorrect condition in loop: B:12:0x0027 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.graphics.fonts.Font findBaseFont(@androidx.annotation.NonNull android.graphics.fonts.FontFamily r6, int r7) {
        /*
            r5 = this;
            android.graphics.fonts.FontStyle r0 = new android.graphics.fonts.FontStyle
            r1 = r7 & 1
            if (r1 == 0) goto L9
            r1 = 700(0x2bc, float:9.81E-43)
            goto Lb
        L9:
            r1 = 400(0x190, float:5.6E-43)
        Lb:
            r7 = r7 & 2
            r2 = 0
            r3 = 1
            if (r7 == 0) goto L13
            r7 = r3
            goto L14
        L13:
            r7 = r2
        L14:
            r0.<init>(r1, r7)
            android.graphics.fonts.Font r7 = androidx.core.graphics.C1390j0.m105026a(r6, r2)
            android.graphics.fonts.FontStyle r1 = androidx.core.graphics.C1406r0.m105010a(r7)
            int r1 = getMatchScore(r0, r1)
        L23:
            int r2 = androidx.core.graphics.C1392k0.m105024a(r6)
            if (r3 >= r2) goto L3c
            android.graphics.fonts.Font r2 = androidx.core.graphics.C1390j0.m105026a(r6, r3)
            android.graphics.fonts.FontStyle r4 = androidx.core.graphics.C1406r0.m105010a(r2)
            int r4 = getMatchScore(r0, r4)
            if (r4 >= r1) goto L39
            r7 = r2
            r1 = r4
        L39:
            int r3 = r3 + 1
            goto L23
        L3c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.TypefaceCompatApi29Impl.findBaseFont(android.graphics.fonts.FontFamily, int):android.graphics.fonts.Font");
    }

    private static int getMatchScore(@NonNull FontStyle fontStyle, @NonNull FontStyle fontStyle2) {
        int weight;
        int weight2;
        int slant;
        int slant2;
        int i;
        weight = fontStyle.getWeight();
        weight2 = fontStyle2.getWeight();
        int abs = Math.abs(weight - weight2) / 100;
        slant = fontStyle.getSlant();
        slant2 = fontStyle2.getSlant();
        if (slant == slant2) {
            i = 0;
        } else {
            i = 2;
        }
        return abs + i;
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @Nullable
    public Typeface createFromFontFamilyFilesResourceEntry(Context context, FontResourcesParserCompat.FontFamilyFilesResourceEntry fontFamilyFilesResourceEntry, Resources resources, int i) {
        FontResourcesParserCompat.FontFileResourceEntry[] entries;
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        Font.Builder weight;
        int i2;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font.Builder fontVariationSettings;
        Font build3;
        try {
            FontFamily.Builder builder = null;
            for (FontResourcesParserCompat.FontFileResourceEntry fontFileResourceEntry : fontFamilyFilesResourceEntry.getEntries()) {
                try {
                    weight = new Font.Builder(resources, fontFileResourceEntry.getResourceId()).setWeight(fontFileResourceEntry.getWeight());
                    if (fontFileResourceEntry.isItalic()) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    slant = weight.setSlant(i2);
                    ttcIndex = slant.setTtcIndex(fontFileResourceEntry.getTtcIndex());
                    fontVariationSettings = ttcIndex.setFontVariationSettings(fontFileResourceEntry.getVariationSettings());
                    build3 = fontVariationSettings.build();
                    if (builder != null) {
                        builder.addFont(build3);
                    } else {
                        builder = new FontFamily.Builder(build3);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            build = builder.build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
            style = findBaseFont(build, i).getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build2 = style2.build();
            return build2;
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @Nullable
    public Typeface createFromFontInfo(Context context, @Nullable CancellationSignal cancellationSignal, @NonNull FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        FontFamily build;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build2;
        ParcelFileDescriptor openFileDescriptor;
        Font.Builder weight;
        int i2;
        Font.Builder slant;
        Font.Builder ttcIndex;
        Font build3;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (FontsContractCompat.FontInfo fontInfo : fontInfoArr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(fontInfo.getUri(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (openFileDescriptor != null) {
                    try {
                        weight = new Font.Builder(openFileDescriptor).setWeight(fontInfo.getWeight());
                        if (fontInfo.isItalic()) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        slant = weight.setSlant(i2);
                        ttcIndex = slant.setTtcIndex(fontInfo.getTtcIndex());
                        build3 = ttcIndex.build();
                        if (builder != null) {
                            builder.addFont(build3);
                        } else {
                            builder = new FontFamily.Builder(build3);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                        break;
                    }
                } else if (openFileDescriptor == null) {
                }
                openFileDescriptor.close();
            }
            if (builder != null) {
                build = builder.build();
                Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build);
                style = findBaseFont(build, i).getStyle();
                style2 = customFallbackBuilder.setStyle(style);
                build2 = style2.build();
                return build2;
            }
            return null;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public Typeface createFromInputStream(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @Nullable
    public Typeface createFromResourcesFontFile(Context context, Resources resources, int i, String str, int i2) {
        Font build;
        FontFamily build2;
        FontStyle style;
        Typeface.CustomFallbackBuilder style2;
        Typeface build3;
        try {
            build = new Font.Builder(resources, i).build();
            build2 = new FontFamily.Builder(build).build();
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(build2);
            style = build.getStyle();
            style2 = customFallbackBuilder.setStyle(style);
            build3 = style2.build();
            return build3;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    @NonNull
    public Typeface createWeightStyle(@NonNull Context context, @NonNull Typeface typeface, int i, boolean z) {
        Typeface create;
        create = Typeface.create(typeface, i, z);
        return create;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.graphics.TypefaceCompatBaseImpl
    public FontsContractCompat.FontInfo findBestInfo(FontsContractCompat.FontInfo[] fontInfoArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
