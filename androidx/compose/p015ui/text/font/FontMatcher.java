package androidx.compose.p015ui.text.font;

import androidx.compose.p015ui.text.font.FontWeight;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FontMatcher.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.font.FontMatcher */
/* loaded from: classes.dex */
public final class FontMatcher {
    public static /* synthetic */ List filterByClosestWeight$ui_text_release$default(FontMatcher fontMatcher, List list, FontWeight fontWeight, boolean z, FontWeight fontWeight2, FontWeight fontWeight3, int i, Object obj) {
        FontWeight fontWeight4 = null;
        if ((i & 4) != 0) {
            fontWeight2 = null;
        }
        if ((i & 8) != 0) {
            fontWeight3 = null;
        }
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int size = list.size();
        int i2 = 0;
        FontWeight fontWeight5 = null;
        while (true) {
            if (i2 >= size) {
                break;
            }
            FontWeight weight = ((Font) list.get(i2)).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) < 0) {
                    if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                        fontWeight4 = weight;
                    }
                } else if (weight.compareTo(fontWeight) > 0) {
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else {
                    fontWeight4 = weight;
                    fontWeight5 = fontWeight4;
                    break;
                }
            }
            i2++;
        }
        if (!z ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Object obj2 = list.get(i3);
            if (Intrinsics.m17075f(((Font) obj2).getWeight(), fontWeight4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    @NotNull
    public final List<Font> filterByClosestWeight$ui_text_release(@NotNull List<? extends Font> list, @NotNull FontWeight fontWeight, boolean z, @Nullable FontWeight fontWeight2, @Nullable FontWeight fontWeight3) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        int size = list.size();
        FontWeight fontWeight4 = null;
        FontWeight fontWeight5 = null;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            FontWeight weight = list.get(i).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) < 0) {
                    if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                        fontWeight4 = weight;
                    }
                } else if (weight.compareTo(fontWeight) > 0) {
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                } else {
                    fontWeight4 = weight;
                    fontWeight5 = fontWeight4;
                    break;
                }
            }
            i++;
        }
        if (!z ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Font font = list.get(i2);
            if (Intrinsics.m17075f(font.getWeight(), fontWeight4)) {
                arrayList.add(font);
            }
        }
        return arrayList;
    }

    @NotNull
    /* renamed from: matchFont-RetOiIg  reason: not valid java name */
    public final List<Font> m109454matchFontRetOiIg(@NotNull FontFamily fontFamily, @NotNull FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        if (fontFamily instanceof FontListFontFamily) {
            return m109455matchFontRetOiIg((FontListFontFamily) fontFamily, fontWeight, i);
        }
        throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
    }

    @NotNull
    /* renamed from: matchFont-RetOiIg  reason: not valid java name */
    public final List<Font> m109455matchFontRetOiIg(@NotNull FontListFontFamily fontFamily, @NotNull FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        return m109456matchFontRetOiIg(fontFamily.getFonts(), fontWeight, i);
    }

    @NotNull
    /* renamed from: matchFont-RetOiIg  reason: not valid java name */
    public final List<Font> m109456matchFontRetOiIg(@NotNull List<? extends Font> fontList, @NotNull FontWeight fontWeight, int i) {
        Intrinsics.checkNotNullParameter(fontList, "fontList");
        Intrinsics.checkNotNullParameter(fontWeight, "fontWeight");
        ArrayList arrayList = new ArrayList(fontList.size());
        int size = fontList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            boolean z = true;
            if (i3 >= size) {
                break;
            }
            Font font = fontList.get(i3);
            Font font2 = font;
            if ((Intrinsics.m17075f(font2.getWeight(), fontWeight) && FontStyle.m109460equalsimpl0(font2.mo109408getStyle_LCdwA(), i)) ? false : false) {
                arrayList.add(font);
            }
            i3++;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        Unit unit = Unit.f99208a;
        ArrayList arrayList2 = new ArrayList(fontList.size());
        int size2 = fontList.size();
        for (int i4 = 0; i4 < size2; i4++) {
            Font font3 = fontList.get(i4);
            if (FontStyle.m109460equalsimpl0(font3.mo109408getStyle_LCdwA(), i)) {
                arrayList2.add(font3);
            }
        }
        if (!arrayList2.isEmpty()) {
            fontList = arrayList2;
        }
        List<? extends Font> list = fontList;
        FontWeight.Companion companion = FontWeight.Companion;
        FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(companion.getW400()) < 0) {
            int size3 = list.size();
            FontWeight fontWeight3 = null;
            int i5 = 0;
            while (true) {
                if (i5 >= size3) {
                    break;
                }
                FontWeight weight = list.get(i5).getWeight();
                if (weight.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight;
                    }
                } else if (weight.compareTo(fontWeight) <= 0) {
                    fontWeight3 = weight;
                    fontWeight2 = fontWeight3;
                    break;
                } else if (fontWeight3 == null || weight.compareTo(fontWeight3) < 0) {
                    fontWeight3 = weight;
                }
                i5++;
            }
            if (fontWeight2 != null) {
                fontWeight3 = fontWeight2;
            }
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i2 < size4) {
                Font font4 = list.get(i2);
                if (Intrinsics.m17075f(font4.getWeight(), fontWeight3)) {
                    arrayList3.add(font4);
                }
                i2++;
            }
            return arrayList3;
        } else if (fontWeight.compareTo(companion.getW500()) > 0) {
            int size5 = list.size();
            FontWeight fontWeight4 = null;
            int i6 = 0;
            while (true) {
                if (i6 >= size5) {
                    break;
                }
                FontWeight weight2 = list.get(i6).getWeight();
                if (weight2.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight2.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight2;
                    }
                } else if (weight2.compareTo(fontWeight) <= 0) {
                    fontWeight4 = weight2;
                    fontWeight2 = fontWeight4;
                    break;
                } else if (fontWeight4 == null || weight2.compareTo(fontWeight4) < 0) {
                    fontWeight4 = weight2;
                }
                i6++;
            }
            if (fontWeight4 == null) {
                fontWeight4 = fontWeight2;
            }
            ArrayList arrayList4 = new ArrayList(list.size());
            int size6 = list.size();
            while (i2 < size6) {
                Font font5 = list.get(i2);
                if (Intrinsics.m17075f(font5.getWeight(), fontWeight4)) {
                    arrayList4.add(font5);
                }
                i2++;
            }
            return arrayList4;
        } else {
            FontWeight w500 = companion.getW500();
            int size7 = list.size();
            FontWeight fontWeight5 = null;
            FontWeight fontWeight6 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size7) {
                    break;
                }
                FontWeight weight3 = list.get(i7).getWeight();
                if (w500 == null || weight3.compareTo(w500) <= 0) {
                    if (weight3.compareTo(fontWeight) < 0) {
                        if (fontWeight5 == null || weight3.compareTo(fontWeight5) > 0) {
                            fontWeight5 = weight3;
                        }
                    } else if (weight3.compareTo(fontWeight) <= 0) {
                        fontWeight5 = weight3;
                        fontWeight6 = fontWeight5;
                        break;
                    } else if (fontWeight6 == null || weight3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = weight3;
                    }
                }
                i7++;
            }
            if (fontWeight6 != null) {
                fontWeight5 = fontWeight6;
            }
            ArrayList arrayList5 = new ArrayList(list.size());
            int size8 = list.size();
            for (int i8 = 0; i8 < size8; i8++) {
                Font font6 = list.get(i8);
                if (Intrinsics.m17075f(font6.getWeight(), fontWeight5)) {
                    arrayList5.add(font6);
                }
            }
            if (arrayList5.isEmpty()) {
                FontWeight w5002 = FontWeight.Companion.getW500();
                int size9 = list.size();
                FontWeight fontWeight7 = null;
                int i9 = 0;
                while (true) {
                    if (i9 >= size9) {
                        break;
                    }
                    FontWeight weight4 = list.get(i9).getWeight();
                    if (w5002 == null || weight4.compareTo(w5002) >= 0) {
                        if (weight4.compareTo(fontWeight) < 0) {
                            if (fontWeight2 == null || weight4.compareTo(fontWeight2) > 0) {
                                fontWeight2 = weight4;
                            }
                        } else if (weight4.compareTo(fontWeight) <= 0) {
                            fontWeight2 = weight4;
                            fontWeight7 = fontWeight2;
                            break;
                        } else if (fontWeight7 == null || weight4.compareTo(fontWeight7) < 0) {
                            fontWeight7 = weight4;
                        }
                    }
                    i9++;
                }
                if (fontWeight7 != null) {
                    fontWeight2 = fontWeight7;
                }
                ArrayList arrayList6 = new ArrayList(list.size());
                int size10 = list.size();
                while (i2 < size10) {
                    Font font7 = list.get(i2);
                    if (Intrinsics.m17075f(font7.getWeight(), fontWeight2)) {
                        arrayList6.add(font7);
                    }
                    i2++;
                }
                return arrayList6;
            }
            return arrayList5;
        }
    }
}
